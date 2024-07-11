public class interfaceAdd implements _16_interfaces{
    //Interface bu şekilde kullanılmaktadır.
    @Override
    public void create(){
       System.out.println("Database created.");
    }
    @Override
    public void modify(){
        System.out.println("Database modified.");

    }
    @Override
    public int stock(){
        return 0;
    }
}
