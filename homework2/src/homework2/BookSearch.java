package homework2;

public class BookSearch {
	
	public static Book search_bs(Book[] books, int BookId)
	{
		int left= 0;
		int right= books.length-1;
		
		while(left<=right)
		{
			int midIndex = (right-left) / 2;
			
			if(books[midIndex].GetId() == BookId)
			{
				return books[midIndex];
			}
			
			else if(books[midIndex].GetId() < BookId)
			{
				left++;
			}
			
			else
			{
				right--;
			}
		}
		
		return null; // 찾지 못하였으면 null 값 반환
	}

}
