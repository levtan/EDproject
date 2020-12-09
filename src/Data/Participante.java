package Data;

public class Participante implements Comparable<Participante>
{
    private Usuario user;
    private int num;

    public Participante()
    {
        
    }
    
    public Participante(Usuario user, int num) {
        this.user = user;
        this.num = num;
    }
    
    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public int compareTo(Participante pr) 
    {
        int res = 0;
        if(this.num < pr.getNum())
        {
            res=-1;
        }else if(this.num > pr.getNum())
        {
            res=1;
        }
        return res;
    }
    
}
