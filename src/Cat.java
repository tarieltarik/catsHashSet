import java.util.HashSet;


public class Cat  extends HashSet {
    public String name,color;
    private long id;
    Cat(String n, String c){
        this.name = n;
        this.color = c;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(this.getClass()!=obj.getClass())
            return false;
        Cat other = (Cat) obj;
        id = ((Cat) obj).id;
        if(!name.equals(other.getName()))
            return false;

        return true;
    }

    @Override
    public boolean add(Object e){
        if(this.equals(e))
            return false;
        else
            return super.add(e);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

}
