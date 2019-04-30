package testing;



	interface printable{
		void print();
		}

		class Interface_Example  implements printable{
		public void print(){System.out.println("Hello");}

		public static void main(String args[]){
		printable  obj = new Interface_Example ();
		obj.print();
		 }
		}
