// See https://aka.ms/new-console-template for more information
Console.WriteLine("Hi! What's your name?");
string name = Console.ReadLine();

Console.WriteLine("Hello " + name + "!");
Console.WriteLine("And... What's your last name?");
string lastname = Console.ReadLine();

Console.WriteLine("How old are you?");
int age = Convert.ToInt32(Console.ReadLine());

Console.WriteLine("Do you know how to code with C#?");
bool knowsToCode = Convert.ToBoolean(Console.ReadLine());

Console.WriteLine("");
Console.WriteLine("So this is your information:");
Console.WriteLine("Name: " + name + " " + lastname);
Console.WriteLine("Age: " + age);
Console.WriteLine("Knows how to code with C#: " + knowsToCode);
