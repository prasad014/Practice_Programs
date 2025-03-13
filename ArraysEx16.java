class ArraysEx16{
	public static void main(String[] args) {
		int [] a={234,567,276,3690,876,467,632,678};
		int sm=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]<sm){
				sm=a[i];
			}

		}
		System.out.println(sm);
	}
}