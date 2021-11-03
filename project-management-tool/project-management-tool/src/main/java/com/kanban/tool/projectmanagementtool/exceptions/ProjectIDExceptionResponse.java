package com.kanban.tool.projectmanagementtool.exceptions;


public class ProjectIDExceptionResponse {

    private String projectIdentifier;

    public ProjectIDExceptionResponse(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }
}
