package pato;

public class Pato 
{
	private int pos;
	public Pato (int pos)
	{
		this.pos=pos;
	}
	public Pato()
	{
		int posicion=0;
	}
	public int andarAdelante(int pasos)
	{
		return this.pos+=pasos;
		
	}
	public int andarAtras(int pasos)
	{
		return this.pos-=pasos;
	}
	public int dimePosicion()
	{
		return this.pos;
	}
}
