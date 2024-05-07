import repositories.CatRepository;
import services.CatService;

public class Main {
    public static void main(String[] args) {
        CatRepository catRepository = new CatRepository();
        CatService catService = new CatService(catRepository);
        catService.newCat("Max", 10, 3);
        catService.newCat("Min", 1, 1);
        catService.newCat("Ok", 5, 2);
        System.out.println(catService.allCats());
        System.out.println("Kzkzkz");
    }
}
