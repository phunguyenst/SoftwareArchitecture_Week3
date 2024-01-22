package com.iuh.edu.vn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;

public class HFJDA {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("T:\\NguyenVanPhu_20048881\\phuse\\src\\main\\java\\com\\iuh\\edu\\vn");
//		JavaParser parser = new JavaParser();
//		ParseResult<CompilationUnit> cu = parser.parse(file);
		
		CompilationUnit cu = StaticJavaParser.parse(file);
		List<MethodDeclaration> methods = cu.findAll(MethodDeclaration.class);
		for (MethodDeclaration methodDeclaration : methods) {
			System.out.println(methodDeclaration);
		}

	}

}
