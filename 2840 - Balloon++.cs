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
		  // Get input separated by space
		  string inputLine = Console.ReadLine();
		  string[] input = inputLine.Split(' ');
		  int Radius = Convert.ToInt32(input[0]);
		  int Liter = Convert.ToInt32(input[1]);
		  
		  float PI = 3.1415f;
		  float Volume = (4f/3f) * PI * (Radius * Radius * Radius);
		  
			Console.WriteLine((int)(Liter/Volume));
		}
	}
}