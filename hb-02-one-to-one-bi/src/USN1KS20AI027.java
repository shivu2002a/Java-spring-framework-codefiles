import java.util.*;

class ArrStack {
	int arr[];
	int top, max;

	ArrStack(int n) {
		max = n;
		arr = new int[max];
		top = -1;
	}

	void push(int i) {
		if (top == max - 1)
			System.out.println("Stack Overflow");
		else {
			arr[++top] = i;
			System.out.println("Pushed Element: " + i);
		}
	}

	void pop() {
		if (top == -1) {
			System.out.println("Stack Underflow");
		} else {
			int element = arr[top--];
			System.out.println("Popped Element: " + element);
		}
	}

}
public class USN1KS20AI027 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size of Integer Stack ");
		int n = scan.nextInt();
		boolean done = false;
		ArrStack stack = new ArrStack(3);
		do {
			System.out.println("\nStack Operations");
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. exit");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter integer element to push");
				stack.push(scan.nextInt());
				break;
			case 2:
				stack.pop();
				break;
			case 3:
				done = true;
				break;
			default:
				System.out.println("Wrong Entry\n");
				break;
			}
		} while (!done);

		
	}
}
