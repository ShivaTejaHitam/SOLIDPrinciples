public interface JavaTeacher {

    void teachJava();

}

public interface DBMSTeacher {


    void teachDBMS();

}

public interface OSTeacher {


    void teachOS();
    

}

public interface CNTeacher {
    
    void teachCN();

}



class John implements JavaTeacher{
  
  @Override 
  void teachJava(){
    System.out.println("Teaching Java");
  }
}

class Daniel implements DBMSTeacher{
  @Override
  void teachDBMS(){
        System.out.println("Teaching DBMS");
  }
}

class Alex implements OSTeacher{
  @Override
  void teachOS(){
        System.out.println("Teaching OS");
  }
}

class Joe implements CNTeacher{
  @Override
  void teachCN(){
        System.out.println("Teaching CN");
  }
}
