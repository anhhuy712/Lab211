/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Random;

/**
 *
 * @author huy
 */
public class MangSoNguyen {
    private int[] array;
    public MangSoNguyen(int m){
        this.array=new int[m];
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    
    public void addValue(){
        Random random= new Random();
        for(int i=0; i<this.array.length; i++){
            this .array[i]=random.nextInt(this.array.length);
        }
    }
    public void showValue(){
        Random random=new Random();
    
        for(int i=0; i<this.array.length; i++){
            System.out.print(this.array[i]+",");
        }
        System.out.println("");
    }
    public void sortValue(){
        int count =0;
        boolean check=false;
        for(int i=0; i<this.array.length -1 && !check; i++){
            check = true;
            for(int j=0; i<this.array.length -i -1; j++){
                count++;
                if(this.array[j]>this.array[j+1]){
                    int tem=this.array[j];
                    this.array[j]=this.array[j+1];
                    this.array[j+1]=tem;
                    check=false;
                }
            }
        }
        System.out.println("count= "+ count);
    }
    void quickSort(int[] a, int l, int r){
        int i=partition(a,l,r);
        if (i<r) quickSort(a, i, r);
        if(l<i-1) quickSort(a, l, i-1);
    }
    public int partition(int[] a, int l, int r){
        int i=l; int j=r;
        int pv=a[(l+r)/2];
        while(i<=j){
            while(a[i]<pv)i++;
            while(a[j]>pv)j--;
            
            if(i<=j){
                int tem=a[i];
                a[i]=a[j];
                a[j]=tem;
                i++;
                j--;
            }
        }
        
        
        
        return i;
        
    }
    public int findBinary(int[] a, int value){
        int left=0;
        int right=a.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(a[mid]==value)return mid;
            else if(a[mid]<value) left=mid+1;
            else right=mid-1;
        }
        return -1;
    }
}
