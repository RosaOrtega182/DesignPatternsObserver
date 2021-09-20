package rose.observer;

public class UserFacebook implements Observer {
	
	private String nameUser;
    
	UserFacebook(String nameUser){
		this.nameUser = nameUser;
	}

	public void subscribe(GroupFacebook group) {
		group.registerObserver(this);
		System.out.print("\n"+this.nameUser+" has subscribe to the group "+group.getNameGroup()+"\n");
	}

	public void unSubscribe(GroupFacebook group) {
		group.removeObserver(this); 
		System.out.print("\n"+this.nameUser+"has unsubscribe to the group "+group.getNameGroup()+"\n");
	}

	public void update(String post) {
		System.out.print("\n"+this.nameUser +" got new post: " + post +"\n");
	}

	public String getNameUser() {
	return nameUser;
	}

}
