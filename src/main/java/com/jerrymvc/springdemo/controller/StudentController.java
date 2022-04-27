package com.jerrymvc.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jerrymvc.springdemo.model.Students;
import com.jerrymvc.springdemo.service.StudentService;

@Controller
@RequestMapping("student") // 代表這個controller底下的頁面都有student的前綴
public class StudentController {

	@Autowired
	private StudentService studentService;

	// Model在Controller內使用，用來裝String,Object,或是從資料庫拿到的物件
	// Model可以放多個物件
	// model.addAttribute有兩個參數，第一個參數放物件的名字(String)，另一個放物件
	@GetMapping("/list") // 在student/list下面，有沒有斜線/都沒差，但依據穩健原則還是寫一下比較好
	public String listStudent(Model model) {
		List<Students> allStudents = studentService.getAllStudent();
		// 回傳一個addAttribute的cookie
		model.addAttribute("studentlist", allStudents);
		return "student/listStudent";
		// 搜尋資料夾student底下的listStudent.jsp
	}

	@GetMapping("/deleteStudent") // listStudent.jsp的刪除按鈕按下去之後會跳到這邊
	// @RequestParam("id") 代表從get請求裡的id取得相關的值
	public String deleteStudent(@RequestParam("id") Integer id) {
		// @RequestParam:從listStudent.jsp的頁面的【刪除】button得到id值
		studentService.deleteStudent(id);
		return "redirect:list";
		// 重新導回首頁
	}

	@GetMapping("/add")
	// index頁面的【查看所有學生】按下去之後會跳到這邊
	// Model在Controller內使用，用來裝String,Object,或是從資料庫拿到的物件
	// Model可以放多個物件
	// model.addAttribute有兩個參數，第一個參數放物件的名字(String)，另一個放物件
	public String addStudentPage(Model model) {
		// 傳給下一個頁面一個名為studentBean的Attribute
		model.addAttribute("studentBean", new Students());
		return "student/addPage";
		// 搜尋資料夾student底下的addPage.jsp
	}

	// 傳來的method="post"的時候用PostMapping
	@PostMapping("/add") // post請求是加這個，別忘了加這個，不然讀不到東西
	public String postStudent(@ModelAttribute("studentBean") Students student) {
		// @ModelAttribute:從名為studentBean的Attribute取得Students的物件
		studentService.addStudent(student);
		return "student/addFinishPage";
		// 搜尋資料夾student底下的addFinishPage.jsp
	}

	@GetMapping("/editstudent")
	// Model在Controller內使用，用來裝String,Object,或是從資料庫拿到的物件
	// Model可以放多個物件
	// model.addAttribute有兩個參數，第一個參數放物件的名字(String)，另一個放物件
	// RequestParam("id")，取得post傳來的參數(id=)
	public String editStudentPage(@RequestParam("id") Integer id, Model model) {
		Students tempStudent = studentService.getStudentById(id);
		// 透過getStudentById(id)的方式得到要搜尋的Student的Id
		model.addAttribute("studentBean", tempStudent);
		return "student/editPage";
		// 搜尋資料夾student底下的editpage.jsp
	}

	// 傳來的method="post"的時候用PostMapping
	@PostMapping("/editpost")
	public String posteditedStudent(@ModelAttribute("studentBean") Students student) {
		studentService.updateStudent(student);
		return "student/updateFinish";
	}

	@GetMapping("/getStudentPage")
	// Model在Controller內使用，用來裝String,Object,或是從資料庫拿到的物件
	// Model可以放多個物件
	// model.addAttribute有兩個參數，第一個參數放物件的名字(String)，另一個放物件
	public String getStudentPage(Model model) {
		model.addAttribute("studentBean", new Students());
		return "student/getStudentPage";
	}

	@PostMapping("/getid")
	// Model在Controller內使用，用來裝String,Object,或是從資料庫拿到的物件
	// Model可以放多個物件
	// model.addAttribute有兩個參數，第一個參數放物件的名字(String)，另一個放物件
	// RequestParam("id")，取得post傳來的參數(id=)
	// @RequestParam("id") 代表從get請求裡的id取得相關的值
	public String getStudentById(@RequestParam("id") Integer id, Model model) {
		Students student = studentService.getStudentById(id);
		model.addAttribute("studentBean", student);
		return "student/getStudentPage";
	}

}
