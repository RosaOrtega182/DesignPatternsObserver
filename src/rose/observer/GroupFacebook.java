package rose.observer;

import java.util.ArrayList;
import java.util.List;

public class GroupFacebook implements Subject{
	
	private List<Observer> observers = new ArrayList<Observer>();
	private String post;
	private String nameGroup;
	
	GroupFacebook(String nameGroup){
		this.nameGroup=nameGroup;
	}
	
	
	public void newPost(String post){
		this.post=post;
		notifyObserver();
	}


	@Override
	public void registerObserver(Observer ob) {
		// TODO Auto-generated method stub
		observers.add(ob);	
	}

	@Override
	public void removeObserver(Observer ob) {
		// TODO Auto-generated method stub
		observers.remove(observers.indexOf(ob));
			
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		
		for(Observer observer: observers){
			observer.update(this.post);
		}
		
	}
	
	public String getNameGroup(){
		return nameGroup;
	}

}
