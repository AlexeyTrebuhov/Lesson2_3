//	+�������� ���������, ������������ ������������������ �������� ��� ���� ���������� ������


import java.util.Scanner;

public class Main2 extends Thread {
        public static void main(String[] args){

                System.out.println("Step 1");
                int [][] Step1Array = {{1,0,0}, {2, 0, 0}, {3,0,0} };//�������� ������ � ��������� ��� ����������
                for (int i = 0; i < 3; i++) {  //��� �� �������
                        for (int j = 0; j < 3; j++) {//��� �� ��������
                                System.out.print(" " + Step1Array[i][j] + " ");
                        }
                        System.out.println();//��������� ���-�� �� ��� ��������
                }
                System.out.println("----------");
                System.out.println("Step 2");

                int [][] Step2Array = {{0,0,0}, {2, 0, 0}, {3,0,1} };//�������� ������ � ��������� ��� ����������
                for (int i = 0; i < 3; i++) {  //��� �� �������
                        for (int j = 0; j < 3; j++) {//��� �� ��������
                                System.out.print(" " + Step2Array[i][j] + " ");
                        }
                        System.out.println();
                }
                System.out.println("----------");
                System.out.println("Step 3");

                int [][] Step3Array = {{0,0,0}, {0, 0, 0}, {3,2,1} };//�������� ������ � ��������� ��� ����������
                for (int i = 0; i < 3; i++) {  //��� �� �������
                        for (int j = 0; j < 3; j++) {//��� �� ��������
                                System.out.print(" " + Step3Array[i][j] + " ");
                        }
                        System.out.println();
                }
                System.out.println("----------");
                System.out.println("Step 4");

                int [][] Step4Array = {{0,0,0}, {0, 1, 0}, {3,2,0} };//�������� ������ � ��������� ��� ����������
                for (int i = 0; i < 3; i++) {  //��� �� �������
                        for (int j = 0; j < 3; j++) {//��� �� ��������
                                System.out.print(" " + Step4Array[i][j] + " ");
                        }
                        System.out.println();
                }
                System.out.println("----------");
                System.out.println("Step 5");

                int [][] Step5Array = {{0,0,0}, {0, 1, 0}, {0,2,3} };//�������� ������ � ��������� ��� ����������
                for (int i = 0; i < 3; i++) {  //��� �� �������
                        for (int j = 0; j < 3; j++) {//��� �� ��������
                                System.out.print(" " + Step5Array[i][j] + " ");
                        }
                        System.out.println();
                }
                System.out.println("----------");
                System.out.println("Step 6");

                int [][] Step6Array = {{0,0,0}, {0, 0, 0}, {1,2,3} };//�������� ������ � ��������� ��� ����������
                for (int i = 0; i < 3; i++) {  //��� �� �������
                        for (int j = 0; j < 3; j++) {//��� �� ��������
                                System.out.print(" " + Step6Array[i][j] + " ");
                        }
                        System.out.println();
                }
                System.out.println("----------");
                System.out.println("Step 7");

                int [][] Step7Array = {{0,0,0}, {0, 0, 2}, {1,0,3} };//�������� ������ � ��������� ��� ����������
                for (int i = 0; i < 3; i++) {  //��� �� �������
                        for (int j = 0; j < 3; j++) {//��� �� ��������
                                System.out.print(" " + Step7Array[i][j] + " ");
                        }
                        System.out.println();
                }
                System.out.println("----------");
                System.out.println("Step 8");

                int [][] Step8Array = {{0,0,1}, {0, 0, 2}, {0,0,3} };//�������� ������ � ��������� ��� ����������
                for (int i = 0; i < 3; i++) {  //��� �� �������
                        for (int j = 0; j < 3; j++) {//��� �� ��������
                                System.out.print(" " + Step8Array[i][j] + " ");
                        }
                        System.out.println();
                }

        }

}