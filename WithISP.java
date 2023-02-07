public interface Teacher {

    void teachJava();

    void teachDBMS();

    void teachOS();
    
    void teachCN();

}



class John implements Teacher{
  
  @Override 
  void teachJava(){
    System.out.println("Teaching Java");
  }
}

class Daniel implements Teacher{
  @Override
  void teachDBMS(){
        System.out.println("Teaching DBMS");
  }
}

class Alex implements Teacher{
  @Override
  void teachOS(){
        System.out.println("Teaching OS");
  }
}

class Joe implements Teacher{
  @Override
  void teachCN(){
        System.out.println("Teaching CN");
  }
}
