package com.biz.lists;

import java.util.ArrayList;
import java.util.List;

/*
 * Collections�� java�� �ִ� �Ǵٸ� �迭�� ����
 * ���� �迭���� Ȯ��� ��ɿ� �ſ� ����ؼ�
 * ����� ������ ����� �ִ�.
 * 
 * �����迭�� ������ �����ϰ� �پ��� ��ɵ��� �����Ҽ� �ֵ��� ������� Ŭ�������� ����
 * 
 * Framework : � ��Ģ�� ����� ������Ʈ ����
 * -- java ������ ��Ģ + Framework���� ��Ģ
 */

public class List_01 {

	public static void main(String[] args) {

		// ArrayList Ŭ������ ��ü�� ���� �ϴµ�
		// List Type ���� �����ϰڴ�.
		
		// List Type���� ��ü�� �����ϰ�
		// ArrayList�� �ʱ�ȭ�� �Ѵ�.
		List strList = new ArrayList<String>();
		
		strList.add("���ѹα�");
		strList.add("�츮����");
		strList.add("Republic of Korea");
		
		// 0��° ���𰡸� �о(getter) ���ڿ��� �ٲپ�(toString())
		// strN�� �����϶�
		String strN = strList.get(0).toString();
		System.out.println(strN);
		
		System.out.println(strList.get(1).toString());
		System.out.println(strList.get(2).toString());
	}

}
