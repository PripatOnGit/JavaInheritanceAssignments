package com.java;

public class Library {
	Publication[] p = new Publication[10];
	int temp;
	Library() {}
	
	public void addBook(Books b) {
		p[temp] = b;
		System.out.println("Book Added");
		b.showDetails();
		temp++;
	}
	public void addJournal(Journal j) {
		this.p[temp] = j;
		System.out.println("Book Added");
		j.showDetails();
		temp++;
	}
	 public void removeBook(Books b) {
		   for(int i=0;i<temp;i++) {
			  if(p[i] != b) {
				  continue;
			  }else {
				  for(int j=i+1;j<temp;j++) {
					  p[j-1] = p[j];
				  }
			  }break;
		   }
	 }
	
	public void printDetails() {
		for(int i=0;i<temp;i++) {
			p[i].showDetails();
		}
	}
	public static void main(String[] args) {
		Library l1= new Library();
		Books b1 = new Books(250,400,"Seal Pubs");
		Books b2 = new Books(1250,800,"SealDiv Pubs");
		Books b3 = new Books(2530,300,"NYSeal Pubs");
		l1.addBook(b1);
		l1.addBook(b2);
		l1.addBook(b3);
		
		Journal j1 = new Journal(300,8000,"Journal_1");
		Journal j2 = new Journal(340,900,"Journal_2");
		Journal j3 = new Journal(780,750,"Journal_3");
		l1.addJournal(j1);
		l1.addJournal(j2);
		System.out.println("-------------------------------");
		l1.removeBook(b3);
		l1.addJournal(j3);
		System.out.println("Publications Details");
		l1.printDetails();
	}
}
