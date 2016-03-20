/*
 3. ������� 2 ������, ���� �� ������� ������� ���������� ���������� ����� ������, 
 � ������ - ����� ����� ����������. ���� ��� ������� ������ ����������� ����� ���, �������� ����������.
 ����� �������� ����� ��� ����������� ������. ��������� ������� � �������������� ����������� synchronized.
 �� ������������ � ���� ������� ����� ��� ������������� �������, � ������ ������ wait � notify.
 ����� �� ������������ ����� �������� ��� ������� ����� ������ �� ������ � ���� ������� sleep, 
 yield ��� wait c ����������.
*/

package lab3;

public class Main {

	public static void main(String[] args) {

		int num = 3;
		try{
			num = Integer.parseInt(args[0]);
			System.out.println("���������� ���������� �������: "+num);
		} catch(Exception e){
			System.out.println("������� �����! �� ��������� ���������� ���������� ����� 3");
		}
		
		Q q = new Q();
		new First(q,num);
		new Second(q);
		
	}

}
