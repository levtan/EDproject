package Data;

public class Evento implements Comparable<Evento>
{
    private String NombreEvento;
    private String date;
    private String descripcion;
    private String lugar;
    private int cod;
    private Usuario encargado;
   
    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getNombreEvento() 
    {
        return NombreEvento;
    }

    public void setNombreEvento(String NombreEvento) 
    {
        this.NombreEvento = NombreEvento;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion) 
    {
        this.descripcion = descripcion;
    }

    public void setCod(int cod)
    {
        this.cod=cod;
    }
    
    public int getCod()
    {
        return cod;
    }
    
    public Usuario getEncargado() 
    {
        return encargado;
    }

    public void setEncargado(Usuario encargado) 
    {
        this.encargado = encargado;
    }

    public Evento(String NombreEvento, String date, String descripcion, Usuario encargado) 
    {
        this.NombreEvento = NombreEvento;
        this.date = date;
        this.descripcion = descripcion;
        this.encargado = encargado;
    }

    public Evento(String NombreEvento, String date, Usuario encargado)
    {
        this.NombreEvento = NombreEvento;
        this.date = date;
        this.encargado = encargado;
    }
    
    public Evento()
    {
        this.NombreEvento = NombreEvento;
        this.date = date;
        this.descripcion = descripcion;
        this.encargado = encargado;
    }
        
    @Override
    public String toString() 
    {
        return "NombreEvento= " + NombreEvento + 
               ", fecha =" + date + 
               ", encargado= " + encargado.getUsername() +
               ", descripcion= " + descripcion;
    }
    
    @Override
    public int compareTo(Evento ev)
    {
        int res=0;
        
        if(this.cod < ev.getCod())
        {
            res=-1;
        }else if(this.cod > ev.getCod())
        {
            res=1;
        }
        
        return res;
    }
    
}
