public class Projectile {
    private int projectilex;
    private int projectiley;

    public Projectile(int projectilex, int projectiley){
        this.projectilex = projectilex;
        this.projectiley = projectiley;
    }

    public int getProjx(){
        return projectilex;
    }

    public int getProjy(){
        return projectiley;
    }
    
}
