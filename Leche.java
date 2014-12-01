public class Leche {

//propiedades
private String tipo;
private String procedencia;
private Double eurosLitro;
private Distribuidor distribuidor;


public String getTipo(){

return tipo;
}


public void setTipo (String tip){

tipo=tip;

}

public String getProcedencia(){

	return procedencia;
}

public void setProcedencia (String p){

	procedencia=p;
}

public Double getEurosLitro(){

	return eurosLitro;
}

public void setEurosLitro(double el){

	eurosLitro=el;
}

public Distribuidor getDistribuidor(){

	return distribuidor;
}

public void setDistribuidor (Distribuidor d){

	distribuidor=d;
}

}
