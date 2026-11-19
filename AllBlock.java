class AllBlock{

public void m1(){

System.out.println("-----------------Welcome to m1 method-----------------");

}

public void add(){

System.out.println("-----------------Welcome to add method-----------------");

}

public static void main(String[] args){

System.out.println("-----------------Welcome main method-----------------");
AllBlock all= new AllBlock();
all.m1();
all.add();

}


}