package com.codepresso.todo.service;

import java.util.List;

import com.codepresso.todo.vo.Todo;

public class TodoService {

    private List<Todo> todoList;

    //todo 멤버 변수 todoList에 의존성 주입을 하기 위한 코드를 완성하세요

    public void addTodo(Todo todo) {
        //todo todoList에 새로운 항목을 추가하세요
    }

    public List<Todo> getTodoList(){
        //todo todoList 정보들을 반환 하세요
        return null;
    }

    public void deleteTodo(int index) {
        //todo todoList에서 index에 해당하는 항목을 삭제하세요
    }
}
