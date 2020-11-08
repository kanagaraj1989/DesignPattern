import AbstractFactory.FactoryProducer;
import Adaptor.CSVData;
import Adaptor.CSVFileReader;
import Adaptor.StockDetailFromCSVAdaptor;
import Bridge.AuthService;
import Bridge.IUserRepository;
import Bridge.MongoUserRepository;
import Builder.User;
import Composite.Department;
import Composite.Employee;
import Composite.Engineer;
import Factory.ValidationFactory;
import Prototype.ColorStore;
import Singleton.SNSClient;

import java.util.ArrayList;

public class TestPattern {
    public enum  PatternType {
        SINGLETON,
        FACTORY,
        ABSTRACT_FACTORY,
        BUILDER,
        PROTOTYPE,
        COMPOSITE,
        ADAPTOR,
        BRIDGE,
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Application boot.");
        var pattern = PatternType.BRIDGE;

        switch (pattern) {
            case SINGLETON:
                TestPattern.testSingleTon();
                break;
            case FACTORY:
                TestPattern.testFactory();
                break;
            case ABSTRACT_FACTORY:
                TestPattern.testAbstractFactory();
                break;
            case BUILDER:
                TestPattern.testBuilder();
                break;
            case PROTOTYPE:
                TestPattern.testPrototype();
                break;
            case COMPOSITE:
                TestPattern.testComposite();
                break;
            case ADAPTOR:
                TestPattern.testAdaptorPattern();
                break;
            case BRIDGE:
                TestPattern.testBridgePattern();
                break;
        }
    }

    private static void testSingleTon() {
        var instance  = SNSClient.getInstance();
        instance.printHello();
    }

    private static void testFactory() throws Exception {
        var email = ValidationFactory.createValidation("Email");
        var phone = ValidationFactory.createValidation("Phone");
        email.validate();
        phone.validate();
    }

    private static void testAbstractFactory() {
        var factory = FactoryProducer.getFactory("mac");
        var button = factory.getUIComponent("button");
        button.render();
    }

    private static void testBuilder() {
        var user = new User.UserBuilder()
                .setEmail("raj@gmail.com")
                .setId("_id")
                .setName("raj")
                .setPhoneNo("0123456789")
                .build();

        System.out.println("ID="+ user.getId()+ " : Email="+ user.getEmail()+ " :name="+ user.getName());
    }

    private static void testPrototype() {
        var color = ColorStore.getColor("blue");
        color.addColor();
        color = ColorStore.getColor("black");
        color.addColor();
    }

    private static void testComposite() {
        var backEndEng = new ArrayList<Employee>();
        Engineer backEndEngOne = new Engineer("backEndEng-1");
        Engineer backEndEngTwo = new Engineer("backEndEng-2");
        backEndEng.add(backEndEngOne);
        backEndEng.add(backEndEngTwo);
        var backEndEngDep = new Department(backEndEng, "backend engineering department");

        var frontEndEng = new ArrayList<Employee>();
        Engineer frontEndEngOne = new Engineer("backEndEng-1");
        Engineer frontEndEngTwo = new Engineer("backEndEng-2");
        frontEndEng.add(frontEndEngOne);
        frontEndEng.add(frontEndEngTwo);
        var frontEndEngDep = new Department(frontEndEng, "frontEnd engineering department");

        var headOfEng = new ArrayList<Employee>();
        headOfEng.add(backEndEngDep);
        headOfEng.add(frontEndEngDep);
        var headOfEngDep = new Department(headOfEng, "Head of Engineering department");

        headOfEngDep.showDetails();
    }

    private static void testAdaptorPattern() {
        var fileReader = new CSVFileReader();
        var adaptor = new StockDetailFromCSVAdaptor(fileReader);
        var stocks = adaptor.getHistoryData();
        stocks.forEach(stk -> System.out.println("Id="+ stk.id+ " Name="+ stk.name+ " Open="+ stk.open+ " Close="+ stk.close+ " High="+ stk.high));
    }

    private static void testBridgePattern() {
        IUserRepository userRepository = new MongoUserRepository("mongo connection string");
        var authService = new AuthService(userRepository);
        var apiTok = authService.authenticate("test@gmail.com", "test123");
        System.out.println("ApiToken=" + apiTok);
    }
}
