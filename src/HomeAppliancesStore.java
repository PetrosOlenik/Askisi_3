public   class HomeAppliancesStore
{   static String etairia  ;
      static String dieuth;
    static int plhthos;


    public void setname(String etairia) {
        this.etairia = etairia;

    }
public String   getname()
{
    return etairia;
}
public void  setd(String dieuth)
{
    this.dieuth = dieuth;
}
    public String  getd()
    {
        return this.dieuth;
    }



    public void setpl(int plhthos) {
        this.plhthos  = plhthos ;

    }
    public Integer   getpl ()
    {
        return this.plhthos ;
    }

public static void  main   (   String args[]) {


    HomeAppliancesStore a = new HomeAppliancesStore();






    try {


        a.setname(args[0]);
        System.out.print(a.getname());
        System.out.print(" ");

    } catch (Exception e) {
        System.out.println("    Den exei oristei");

    }


    try {

        a.setd(args[1]);
        System.out.print(a.getd());
        System.out.print(" ");

    } catch (Exception e) {
        System.out.println("Den exei oristei");

    }


     try {

    a.setpl(args[2]);
        System.out.print( a.getpl() );
    }
    catch (Exception e ) {
         System.out.println("Den exei oristei");

     }

}
}
