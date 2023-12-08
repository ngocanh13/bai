package Lab2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class News implements INwes {
    int id;
    String title;
    String publishDate;
    String author;
    String content;
    float averagerate;
    float[] ratelist;

    public News(){

    }

    public News(int id, String title,String publishDate,String author,String content, float averagerate) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averagerate = averagerate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAveragerate() {
        return averagerate;
    }

    @Override
    public void Display() {
        System.out.println(this.id);
        System.out.println(this.title);
        System.out.println(this.publishDate);
        System.out.println(this.author);
        System.out.println(this.content);
        System.out.println(this.averagerate);

    }

    public void calculate(){
        float s = 0;
        for (float rate : ratelist){
            s += rate;

        }
        if (ratelist.length > 0){
            averagerate = s / ratelist.length;
        }
    }

    public  void inputrate(){
        float r;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap gia tri :");
        r = sc.nextFloat();
        if (r >= 1 && r <= 5){
            ratelist[(int)r -1]++;
            calculate();
        }
    }
}
