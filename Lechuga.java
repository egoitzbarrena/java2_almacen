public class Lechuga {

//propiedades
private String tipoLechuga;
private String procedencia;
private String color;
private Double eurosUnidad;
private Distribuidor distribuidor;

public String getTipoLechuga (){

	return tipoLechuga;
}

public void setTipoLechuga (String tl){

	tipoLechuga=tl;
}

public String getProcedencia (){

	return procedencia;
}

public void setProcedencia (String p){

	procedencia=p;
}
public String getColor (){

	return color;
}

public void setColor(String c){

	color=c;
}

public Double getEurosUnidad (){

	return eurosUnidad;
}

public void setEurosUnidad(Double eu){

	eurosUnidad=eu;
}

public Distribuidor getDistribuidor (){

	return distribuidor;
}
public void setDistribuidor(Distribuidor d){

	distribuidor=d;
}
}