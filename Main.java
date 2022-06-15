class Main {
  public static void main(String[] args) {
    //Clear the console
    System.out.print("\033[H\033[2J");
    System.out.flush();
    
    String message = "Hello world.";
    String encrypted = "";
    String decrypted = "";
    System.out.println(message);
    System.out.println(""); 
    
    encrypted = cryptography.caesarShiftEncode(message, 10);
    System.out.println(encrypted); 
    decrypted = cryptography.caesarShiftDecode(encrypted, 10);
    System.out.println(decrypted); 
    System.out.println(""); 
    
    encrypted = cryptography.caesarShiftEncode(message, 1);
    System.out.println(encrypted);
    decrypted = cryptography.caesarShiftDecode(encrypted, 1);
    System.out.println(decrypted);
    System.out.println(""); 
    
    encrypted = cryptography.caesarShiftEncode(message, 3);
    System.out.println(encrypted);
    decrypted = cryptography.caesarShiftDecode(encrypted, 3);
    System.out.println(decrypted); 
    System.out.println(""); 
    
    encrypted = cryptography.caesarShiftEncode(message, 5);
    System.out.println(encrypted); 
    decrypted = cryptography.caesarShiftDecode(encrypted, 5);
    System.out.println(decrypted); 
    System.out.println(""); 
    
    encrypted = cryptography.caesarShiftEncode(message, 317);
    System.out.println(encrypted); 
    decrypted = cryptography.caesarShiftDecode(encrypted, 317);
    System.out.println(decrypted); 
    System.out.println(""); 

    decrypted = cryptography.caesarShiftDecode("uren uxwp jwm yaxbyna.", 35);
    System.out.println(decrypted); 
    System.out.println(""); 

    decrypted = cryptography.caesarShiftDecode("ugetgv oguucig.", 80);
    System.out.println(decrypted); 
    System.out.println(""); 

    decrypted = cryptography.caesarShiftDecode("tatewpci.", -11);
    System.out.println(decrypted); 
    System.out.println(""); 

    decrypted = cryptography.caesarShiftDecode("zylyly.", 180);
    System.out.println(decrypted); 
    System.out.println(""); 

    decrypted = cryptography.caesarShiftDecode("pa'z mypkhf.", 7);
    System.out.println(decrypted); 
    System.out.println(""); 

    encrypted = cryptography.caesarShiftEncode("The tree missed the days the kids used to come by and play. It still wore the tire swing the kids had put up in its branches years ago although both the tire and the rope had seen better days. The tree had watched all the kids in the neighborhood grow up and leave, and it wondered if there would ever be a time when another child played and laughed again under its branches. That was the hope that the tree wished every day as the swing gently swung empty in the wind. (From random paragraph generator.)", -157);
    System.out.println(encrypted); 
    System.out.println(""); 
    
    decrypted =     
cryptography.caesarShiftFrequencyDecode(encrypted);
    System.out.println(decrypted); 
    System.out.println(""); 
  }
}