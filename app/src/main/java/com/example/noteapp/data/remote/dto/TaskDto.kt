package com.example.noteapp.data.remote.dto

data class TaskDto (
    val title: String,
    val description: String?,
    val done: Boolean,
    val userId: Long
)
