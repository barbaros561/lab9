package wizut.tpsi.lab9;

public class BlogPost {
    private Long id;
    private String title;
    private String content;

    public BlogPost(Long id,String title, String content){
        this.content=content;
        this.id=id;
        this.title=title;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public BlogPost(){};
}
