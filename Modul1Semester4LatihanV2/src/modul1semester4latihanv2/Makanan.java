package modul1semester4latihanv2;

/**
 *
 * @author socx
 */
public class Makanan extends Hidangan {
    @Override
    public String disantap(){
        return this.getNamaHidangan() +  "dimakan";
    }
    
}
