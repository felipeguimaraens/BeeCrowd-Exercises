using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace HelloWorld
{
	public class Program
	{
		public static void Main(string[] args)
		{
		  List<int> menList = new List<int>();
		  int cases = int.Parse(Console.ReadLine());
		  int index = 0;
		  for (int i = 1; i < cases + 1; i++)
		  {
		    //get input
		    var line = Console.ReadLine();
		    // Split input by ' ' for each case
        var numbers = line.Split(' ');
        int n = int.Parse(numbers[0]);
        int steps = int.Parse(numbers[1]);
        steps --;
        
        // Collect n number of peoples and put in the list
        for (int x = 1; x < n+1 ;x++)
        {
          menList.Add(x);
        }
			  Console.WriteLine("Case " + i + ": " + Flavious(menList,steps,index));
			  menList.Clear();
		  }
		  
		}
		
		public static int Flavious(List<int> menList, int steps, int index)
		{
		  /*foreach (int person in menList)
		  {
		    Console.WriteLine(person + " ");
		  }
		  Console.WriteLine(((index + steps) % menList.Count) + " " + menList.Count + " " + steps + " " + index);*/
		  if(menList.Count == 1) 
		  {
		    return menList[0];
		  }
		  index = ((index + steps) % menList.Count);
      menList.RemoveAt(index);
      return Flavious(menList, steps, index);
		}
		
	}
}