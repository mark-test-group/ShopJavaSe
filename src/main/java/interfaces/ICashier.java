package interfaces;

public interface ICashier {

    String getName();

    void sell(IBuyer buyer, IProduct product);

}
