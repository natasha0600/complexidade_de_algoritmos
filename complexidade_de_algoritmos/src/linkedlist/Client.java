package linkedlist;

public class Client {
    private String cpf;
    private String name;

    public Client(String cpf, String name){
        this.cpf = cpf;
        this.name= name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name + "  " + this.cpf;
    }

}
