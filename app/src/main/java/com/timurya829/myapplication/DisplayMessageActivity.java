package com.timurya829.myapplication;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import java.util.Random;
import android.content.pm.ActivityInfo;


public class DisplayMessageActivity extends AppCompatActivity {
    WebView wv;
    protected int GIF_Number;
    int cont_height;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        GIF_Number = 0;

        String[] gif = {"file(1).gif", "file-2.gif", "Paltsy_vverkh.gif", "Strastny_potseluy.gif",
                "taylor_swift_1.gif", "taylor_swift_2.gif", "Yes_12.gif", "giphy.gif", "taylor_swift.gif",
                "Teylor_Svift.gif", "IMG_2105.gif","file(6).gif"
        };

        if (GIF_Number < (gif.length-1))
            GIF_Number = GIF_Number + 1;
        else
            GIF_Number = 0;

        //int number = 0 + rnd.nextInt(gif.length);

        wv = (WebView) findViewById(R.id.webView1);

        WebSettings settings = wv.getSettings();
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);

        wv.setWebViewClient(new WebViewController());

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;

        //wv.loadDataWithBaseURL("file:///android_asset/","<html><center><img src="+gif[GIF_Number]+" height=\"" + height*0.6 + "\" align=\"middle\"></html>","text/html","utf-8","");
        wv.loadDataWithBaseURL("file:///android_asset/","<html><style>img{display: inline;height: "+ height*0.5 +";}</style><center><img src="+gif[GIF_Number]+" align=\"middle\"></html>","text/html","utf-8","");
        //content.loadDataWithBaseURL(null, "<style>img{display: inline;height: auto;max-width: 100%;}</style>" + post.getContent(), "text/html", "UTF-8", null);
        cont_height = wv.getContentHeight();

        // Create data
        String[] s = {"\"Если у вас силы и желание делать что-то, делайте это!\"", "\"Если ты счастлив, то ты будешь привлекать людей.\"",
                "\"Совершать ошибки – хорошая вещь, потому что они научат вас чему-либо.\"",
                "\"Ты должен воспользоваться непредсказуемостью жизни, а не бояться ее.\"",
                "\"Просто будь собой. Нет никого лучше тебя!\"", "\"Ты достаточно счастливый быть тем, кто ты есть. Никогда не меняйся!\"",
                "\"Все, что вы можете – быть собой, все остальное встанет на свои места.\"",
                "\"Не бойся неудач и не позволяй им удержать себя.\"", "\"Любовь – это то, за что вы должны бороться.\"",
                "\"Музыка – это соединяющий фактор, и это примиряет всех нас даже при том, что мы так абсолютно отличаемся.\"",
                "\"Есть прекрасные вещи и во влюбленности, и в одиночестве. И я думаю, ты должен только найти эти вещи.\"",
                "\"Будьте благодарны за всё в этой жизни: за прошлое и настоящее, за плохое и хорошее. Именно это сделало вас тем, кто вы есть.\""
        };

        String custom_font = "Adventure.ttf";
        Typeface CF = Typeface.createFromAsset(getAssets(), custom_font);

        ((TextView) findViewById(R.id.textView)).setTypeface(CF);

        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.textView);
        //Typeface face = Typeface.createFromAsset(getAssets(), "dancing_script.ttf");
        //textView.setTypeface(face);
        textView.setText(s[GIF_Number]);

        /*NewTaylor();*/
    }

    public void OnClick_2(View view) {
        String[] gif = {"file(1).gif", "file-2.gif", "Paltsy_vverkh.gif", "Strastny_potseluy.gif",
                "taylor_swift_1.gif", "taylor_swift_2.gif", "Yes_12.gif", "giphy.gif", "taylor_swift.gif",
                "Teylor_Svift.gif", "IMG_2105.gif","file(6).gif"
        };
        if (GIF_Number < (gif.length-1))
            GIF_Number = GIF_Number + 1;
        else
            GIF_Number = 0;
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        wv.loadDataWithBaseURL("file:///android_asset/","<html><style>img{display: inline;height: "+ height*0.5 +";}</style><center><img src="+gif[GIF_Number]+" align=\"middle\"></html>","text/html","utf-8","");
        // Create data
        String[] s = {"\"Если у вас силы и желание делать что-то, делайте это!\"", "\"Если ты счастлив, то ты будешь привлекать людей.\"",
                "\"Совершать ошибки – хорошая вещь, потому что они научат вас чему-либо.\"",
                "\"Ты должен воспользоваться непредсказуемостью жизни, а не бояться ее.\"",
                "\"Просто будь собой. Нет никого лучше тебя!\"", "\"Ты достаточно счастливый быть тем, кто ты есть. Никогда не меняйся!\"",
                "\"Все, что вы можете – быть собой, все остальное встанет на свои места.\"",
                "\"Не бойся неудач и не позволяй им удержать себя.\"", "\"Любовь – это то, за что вы должны бороться.\"",
                "\"Музыка – это соединяющий фактор, и это примиряет всех нас даже при том, что мы так абсолютно отличаемся.\"",
                "\"Есть прекрасные вещи и во влюбленности, и в одиночестве. И я думаю, ты должен только найти эти вещи.\"",
                "\"Будьте благодарны за всё в этой жизни: за прошлое и настоящее, за плохое и хорошее. Именно это сделало вас тем, кто вы есть.\""
        };

        String custom_font = "Adventure.ttf";
        Typeface CF = Typeface.createFromAsset(getAssets(), custom_font);

        ((TextView) findViewById(R.id.textView)).setTypeface(CF);

        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.textView);
        //Typeface face = Typeface.createFromAsset(getAssets(), "dancing_script.ttf");
        //textView.setTypeface(face);
        textView.setText(s[GIF_Number]);
        /*NewTaylor();*/
    }

    private class WebViewController extends WebViewClient {
        @SuppressWarnings("deprecation")
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

        @TargetApi(Build.VERSION_CODES.N)
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            //String url=request.getUrl().toString();
            view.loadUrl(request.getUrl().toString());
            return true;
        }
    }

    private void NewTaylor(){
        // Инициализируем генератор
        //Random rnd = new Random(System.currentTimeMillis());
        // Получаем случайное число в диапазоне от min до max (включительно)


        String[] gif = {"file(1).gif", "file-2.gif", "Paltsy_vverkh.gif", "Strastny_potseluy.gif",
                "taylor_swift_1.gif", "taylor_swift_2.gif", "Yes_12.gif", "giphy.gif", "taylor_swift.gif",
                "Teylor_Svift.gif", "IMG_2105.gif","file(6).gif"
        };

        if (GIF_Number < (gif.length-1))
            GIF_Number = GIF_Number + 1;
        else
            GIF_Number = 0;

        //int number = 0 + rnd.nextInt(gif.length);

        WebView wv = (WebView) findViewById(R.id.webView1);

        WebSettings settings = wv.getSettings();
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);

        wv.setWebViewClient(new WebViewController());

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        int cont_height = wv.getContentHeight();
        //wv.loadDataWithBaseURL("file:///android_asset/","<html><center><img src="+gif[GIF_Number]+" height=\"" + height*0.6 + "\" align=\"middle\"></html>","text/html","utf-8","");
        wv.loadDataWithBaseURL("file:///android_asset/","<html><style>img{display: inline;height: "+ cont_height +";}</style><center><img src="+gif[GIF_Number]+" align=\"middle\"></html>","text/html","utf-8","");
        //content.loadDataWithBaseURL(null, "<style>img{display: inline;height: auto;max-width: 100%;}</style>" + post.getContent(), "text/html", "UTF-8", null);


        // Create data
        String[] s = {"\"Если у вас силы и желание делать что-то, делайте это!\"", "\"Если ты счастлив, то ты будешь привлекать людей.\"",
                "\"Совершать ошибки – хорошая вещь, потому что они научат вас чему-либо.\"",
                "\"Ты должен воспользоваться непредсказуемостью жизни, а не бояться ее.\"",
                "\"Просто будь собой. Нет никого лучше тебя!\"", "\"Ты достаточно счастливый быть тем, кто ты есть. Никогда не меняйся!\"",
                "\"Все, что вы можете – быть собой, все остальное встанет на свои места.\"",
                "\"Не бойся неудач и не позволяй им удержать себя.\"", "\"Любовь – это то, за что вы должны бороться.\"",
                "\"Музыка – это соединяющий фактор, и это примиряет всех нас даже при том, что мы так абсолютно отличаемся.\"",
                "\"Есть прекрасные вещи и во влюбленности, и в одиночестве. И я думаю, ты должен только найти эти вещи.\"",
                "\"Будьте благодарны за всё в этой жизни: за прошлое и настоящее, за плохое и хорошее. Именно это сделало вас тем, кто вы есть.\""
        };

        String custom_font = "Adventure.ttf";
        Typeface CF = Typeface.createFromAsset(getAssets(), custom_font);

        ((TextView) findViewById(R.id.textView)).setTypeface(CF);

        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.textView);
        //Typeface face = Typeface.createFromAsset(getAssets(), "dancing_script.ttf");
        //textView.setTypeface(face);
        textView.setText(s[GIF_Number]);
    }
}
