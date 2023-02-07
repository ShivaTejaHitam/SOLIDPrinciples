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
  
  @Override
  void teachDBMS(){
  }
  
  @Override
  void teachOS(){
  }
    
  @Override
  void teachCN(){
  }

  
}
