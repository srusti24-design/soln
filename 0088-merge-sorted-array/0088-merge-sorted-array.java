class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num3[]=new int[m+n];
          int p=m;
          int q=n;
          int i=0,j=0,k=0;
          while((i<p)&&(j<q))
          {
              if(nums1[i]<=nums2[j])
              {
                  num3[k++]=nums1[i++];
              }
              else{
                  num3[k++]=nums2[j++];
              }
          }
          while(i<p)
          {
              num3[k++]=nums1[i++];
          }
           while(j<q)
          {
              num3[k++]=nums2[j++];
          }
           for(i=0;i<m+n;i++)
           {
               nums1[i]=num3[i];
           }
           
          
       }

    }