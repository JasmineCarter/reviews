package org.wecancodeit.reviews;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CourseController {

@Resource
ReviewRepository reviewRepo; 

	@RequestMapping("/show-reviews")
	public String findAllReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll()); 
		return "reviews"; 
	}
	
	@RequestMapping("/review")
	public String findOneCourse(@RequestParam(value="id")Long id) {
		return ""; 
	}
}
