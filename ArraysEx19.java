import java.util.Arrays;
class ArraysEx19{
	public static void main(String[] args) {
		int [] a={1,2,3};
		int [] b={4,5,6,7,8};
		int [] narr=new int{(a.length)+(b.length)};
		for (int i=0;i<b.length;i++){
			j=0;
			if (i<a.length) {
				narr[j++]=a[i];
				narr[j++]=b[i];
			}
		}
		System.out.println(Arrays.toString(narr));
	}
}