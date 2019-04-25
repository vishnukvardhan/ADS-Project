package searchengine.dictionary;

import java.util.ArrayList;

class Valu
{
	String value;
	int count=0;
	Valu(String v,int i)
	{
		this.value=v;
		this.count=count+i;
	}
}
class kv
{
	String key;
	ArrayList<Valu> val=new ArrayList<Valu>();
	kv(String k,Object v)
	{
		this.key=k;
		this.val.add(new Valu((String) v,1));
	}
}
public class MyHashDictionary implements DictionaryInterface {
	kv[] a=new kv[300];
	int count=0;
	@Override
	public String[] getKeys() {
		// TODO Auto-generated method stub
		String ar[]=new String[count];
		int i=0;
		for(int j=0;j<a.length;j++)
		{
			if(a[j]!=null&&a[j].key!=null)
			{
				//System.out.println(a[j].key);
				ar[i]=(String) a[j].key;
				i++;
			}
		}
		return (String[]) ar;
	}
	public Object getValue(String str) {
		// TODO Auto-generated method stub
		int ind=Hashcode(str);
		return (Object) a[ind].val;
	}
	@Override
	public void insert(String key, Object value) {
		// TODO Auto-generated method stub
		kv k=new kv(key,value);
		if(getValue(key)==null)
		{
		int ind=Hashcode(key);
		if(a[ind]==null)
			count++;
		a[ind]=k;
		}
		else
		{
			@SuppressWarnings("unchecked")
			ArrayList<Valu> a=(ArrayList<Valu>) getValue(key);
			if(a.contains((String)value))
			{
				
			}
			else
			{
				
			}
		}		
	}
	@Override
	public void remove(String key) {
		// TODO Auto-generated method stub
		int ind=Hashcode(key);
		a[ind]=null;
		count--;
	}
	public int Hashcode(String key)
	{
		String ab=(String) key;
		int sum=0;
		for(int i=0;i<ab.length();i++)
		{
			sum=sum+(ab.charAt(i)*(i+1));
		}
		sum=sum%a.length;
		//System.out.println(sum);
		return sum;		
	}
}
