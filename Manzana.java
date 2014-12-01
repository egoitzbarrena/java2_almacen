public class Manzana {
//propiedades
private String tipoManzana;
private String procedencia;
private String color;
private Double eurosKilo;
private Distribuidor distribuidor;

public String getTipoManzana(){

	return tipoManzana;
}

public void setTipoManzana (String tm){

	tipoManzana=tm;
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

public Double getEurosKilo (){

	return eurosKilo;
}

public void setEurosKilo(Double ek){

	eurosKilo=ek;
}

public Distribuidor getDistribuidor (){

	return distribuidor;
}
public void setDistribuidor(Distribuidor d){

	distribuidor=d;
}
}