package rose.observer;

public class Test {

	public static void main( String[] args ) {
        GroupFacebook group = new GroupFacebook("MicroservicesIBM");
        
       
        UserFacebook u = new UserFacebook("");
        u= new UserFacebook("David");
        u.subscribe(group);
        u= new UserFacebook("Lucia");
        u.subscribe(group);
        u= new UserFacebook("Ana");
        u.subscribe(group);
        
        group.newPost("Dessign paterns"); 
        
        group.newPost("Spring Boot");
    }
}
