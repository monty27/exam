package com.monty.exam.dao;

import java.util.List;

public class Test {
	private int id;
	private Customer customer;
	private List<Question> questions;
	private int[] answers = new int[10];
	private int score;
	

	public Test(int id, Customer customer, List<Question> questions, int[] answers, int score) {
		super();
		this.id = id;
		this.customer = customer;
		this.questions = questions;
		this.answers = answers;
		this.score = score;
	}

	public int getScore() {
		return score;
	}
	
	public int getId() {
		return id;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public int[] getAnswers() {
		return answers;
	}

	public void setAnswers(int[] answers) {
		this.answers = answers;
	}
	
	
}