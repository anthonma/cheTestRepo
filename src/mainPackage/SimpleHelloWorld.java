class SimpleHelloWorld{

	public static void main(String[] args){
        System.out.println("Hello, World!");
        new SimpleHelloWorld().doSomething();
    }

    public void doSomething(){
        System.out.println("I've done something");
        System.out.println("and something else");
    }

}