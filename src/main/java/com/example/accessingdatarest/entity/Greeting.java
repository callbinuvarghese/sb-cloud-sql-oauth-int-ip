package com.example.accessingdatarest.entity;

import java.util.Objects;

public final class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long id() {
        return id;
    }

    public String content() {
        return content;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Greeting that = (Greeting) obj;
        return this.id == that.id &&
                Objects.equals(this.content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content);
    }

    @Override
    public String toString() {
        return "Greeting[" +
                "id=" + id + ", " +
                "content=" + content + ']';
    }
}