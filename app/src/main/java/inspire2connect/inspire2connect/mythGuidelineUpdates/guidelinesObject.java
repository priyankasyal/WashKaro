package inspire2connect.inspire2connect.mythGuidelineUpdates;

public class guidelinesObject {
    String title;
    String myth;
    String position;
    String audio_url;
    String redirect_url;

    public guidelinesObject(String title, String myth, String position, String audio_url, String redirect_url) {
        this.title = title;
        this.myth = myth;
        this.position = position;
        this.audio_url = audio_url;
        this.redirect_url = redirect_url;
    }

    public String getRedirect_url() {
        return redirect_url;
    }

    public void setRedirect_url(String redirect_url) {
        this.redirect_url = redirect_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMyth() {
        return myth;
    }

    public void setMyth(String myth) {
        this.myth = myth;
    }

    public String getAudio_url() {
        return audio_url;
    }

    public void setAudio_url(String audio_url) {
        this.audio_url = audio_url;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


}
