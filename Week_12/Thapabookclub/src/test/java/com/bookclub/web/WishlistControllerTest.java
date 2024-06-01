package com.bookclub.web;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;
import com.bookclub.model.WishlistItem;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class WishlistControllerTest {

	 @Test
	    public void testShowWishlist() {
	        WishlistController controller = new WishlistController();
	        String result = controller.showWishlist();
	        assertEquals("wishlist/list", result);
	    }

	    @Test
	    public void testWishlistForm() {
	        WishlistController controller = new WishlistController();
	        Model model = mock(Model.class);
	        String result = controller.wishlistForm(model);
	        assertEquals("wishlist/new", result);
	        verify(model).addAttribute("wishlistItem", new WishlistItem());
	    }

	  	}