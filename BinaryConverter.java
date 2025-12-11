public class BinaryConverter
{
	//Instance Variables
	private int value;
	private String binaryValue;

	//Default Constructor
    public BinaryConverter()
    {
    	value=0;
    	binaryValue="0";
    }

    //Modified  Constructor(s)
    public BinaryConverter(int newValue)
    {
    	value=newValue;
    	binaryValue="0";
    }

    public BinaryConverter(String newBinary)
    {
    	value=0;
    	binaryValue=newBinary;
    }

    public String getBinary()
    {
        return binaryValue;
    }

    //Methods
    public int getValue()
    {
    	return value;
    }

    public void setValue(int newValue)
    {
    	value=newValue;
    }

    public String toBinary()
    {
        int count = 8;
        int valTwo = value;
        String convert = "";
    	//Convert the integer value to binary
        while(count>0)
        {
            convert = (valTwo%2) + convert; 

            valTwo/=2;
            count--;
        }

    	return "" + convert;
    }

    public int toDecimal()
    {
        int x = value;
    	//Convert the binary value to decimal
        for(int i =0; i<binaryValue.length();i++)
        {
            if(binaryValue.charAt(i)=='1')
            {
                x += Math.pow(2, binaryValue.length()-i);
            }
        
        }
    	return x;
    }

    public String toString()
    {
        return "" + value;
    }
}