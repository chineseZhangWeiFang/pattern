package nullObject;

public class NullCustomer extends AbstractCustomer{
    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return "Not Avalable in customer database";
    }
}
