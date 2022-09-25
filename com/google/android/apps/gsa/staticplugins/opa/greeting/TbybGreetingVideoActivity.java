package com.google.android.apps.gsa.staticplugins.opa.greeting;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.VideoView;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7065j.C89935f;
import com.google.android.apps.gsa.shared.logger.p7065j.C89937h;
import com.google.android.apps.gsa.shared.logger.p7065j.C89938i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.aka;
import com.google.common.p4552o.akb;

/* compiled from: PG */
public class TbybGreetingVideoActivity extends Activity implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, View.OnClickListener {

    /* renamed from: a */
    VideoView f303700a;

    /* renamed from: b */
    ImageButton f303701b;

    /* renamed from: c */
    ImageButton f303702c;

    /* renamed from: d */
    ImageButton f303703d;

    /* renamed from: e */
    View f303704e;

    /* renamed from: f */
    Button f303705f;

    /* renamed from: g */
    Button f303706g;

    /* renamed from: h */
    Button f303707h;

    /* renamed from: i */
    boolean f303708i = false;

    /* renamed from: j */
    MediaPlayer f303709j;

    /* renamed from: a */
    private static void m181595a(Button button, String str, int i) {
        if (str == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        button.setText(str);
        button.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        button.setVisibility(0);
        aka aka = (aka) akb.f158948c.createBuilder();
        aka.copyOnWrite();
        akb akb = (akb) aka.instance;
        akb.f158951a |= 2;
        akb.f158952b = str;
        C89935f fVar = new C89935f();
        fVar.f246426e = (akb) aka.build();
        C89938i iVar = new C89938i(100363, fVar.mo83781a());
        iVar.mo33795i(5);
        C28295m.m52919e(button, iVar);
    }

    public final void onClick(View view) {
        if (view.equals(this.f303701b)) {
            MediaPlayer mediaPlayer = this.f303709j;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            finish();
        } else if (this.f303709j != null) {
            if (view.equals(this.f303702c)) {
                if (this.f303709j.isPlaying()) {
                    this.f303709j.pause();
                    this.f303702c.setImageResource(R.drawable.play);
                    this.f303704e.setVisibility(0);
                    return;
                }
                this.f303709j.start();
                this.f303702c.setImageResource(R.drawable.pause);
                this.f303704e.setVisibility(8);
            } else if (!view.equals(this.f303703d)) {
                if (view.equals(this.f303705f) || view.equals(this.f303706g)) {
                    Intent intent = new Intent();
                    intent.putExtra("issuedQuery", ((Button) view).getText().toString());
                    setResult(1, intent);
                    this.f303709j.stop();
                    this.f303709j.release();
                    finish();
                }
                if (view.equals(this.f303707h)) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("nextVideoIndex", getIntent().getIntExtra("nextVideoIndex", -1));
                    setResult(2, intent2);
                    this.f303709j.stop();
                    this.f303709j.release();
                    finish();
                }
            } else if (this.f303708i) {
                this.f303709j.setVolume(1.0f, 1.0f);
                this.f303703d.setImageResource(R.drawable.mute);
                this.f303708i = false;
            } else {
                this.f303709j.setVolume(0.0f, 0.0f);
                this.f303703d.setImageResource(R.drawable.unmute);
                this.f303708i = true;
            }
        }
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (this.f303705f.getVisibility() == 8 && this.f303706g.getVisibility() == 8 && this.f303707h.getVisibility() == 8) {
            finish();
        }
        this.f303704e.setVisibility(0);
        this.f303702c.setVisibility(8);
        this.f303703d.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.as);
        super.onCreate(bundle);
        C58976aa aaVar = C58975e.f156826a;
        setContentView(R.layout.fullscreen_video);
        this.f303700a = (VideoView) findViewById(R.id.videoview_full);
        this.f303704e = findViewById(R.id.additional_button_view);
        ImageButton imageButton = (ImageButton) findViewById(R.id.button_video_cancel);
        this.f303701b = imageButton;
        imageButton.setImageResource(R.drawable.cancel);
        this.f303702c = (ImageButton) findViewById(R.id.button_video_pause_play);
        this.f303703d = (ImageButton) findViewById(R.id.button_video_mute_unmute);
        this.f303705f = (Button) findViewById(R.id.button_first_query);
        this.f303706g = (Button) findViewById(R.id.button_second_query);
        this.f303707h = (Button) findViewById(R.id.button_next_video);
        this.f303700a.setVisibility(0);
        this.f303701b.setVisibility(0);
        this.f303702c.setVisibility(8);
        this.f303703d.setVisibility(8);
        this.f303700a.setOnPreparedListener(this);
        this.f303700a.setOnCompletionListener(this);
        this.f303703d.setOnClickListener(this);
        this.f303702c.setOnClickListener(this);
        this.f303701b.setOnClickListener(this);
        this.f303705f.setOnClickListener(new C89937h(this));
        this.f303706g.setOnClickListener(new C89937h(this));
        this.f303707h.setOnClickListener(this);
        String stringExtra = getIntent().getStringExtra("fullscreenVideoUrl");
        if (stringExtra.startsWith("https://www.gstatic.com/opa-android/") || stringExtra.startsWith("https://www.gstatic.com/assistant_nbu_growth/")) {
            this.f303700a.setVideoURI(Uri.parse(stringExtra));
        } else {
            finish();
        }
        m181595a(this.f303705f, getIntent().getStringExtra("firstQuery"), getIntent().getIntExtra("firstQueryIcon", 0));
        m181595a(this.f303706g, getIntent().getStringExtra("secondQuery"), getIntent().getIntExtra("secondQueryIcon", 0));
        if (getIntent().getIntExtra("nextVideoIndex", -1) != -1) {
            this.f303707h.setVisibility(0);
        }
        View findViewById = findViewById(R.id.fullscreen_video);
        C28295m.m52919e(findViewById, new C28292j(101399));
        C89949q.m146521e(C28285c.m52874a(findViewById, 101438), false);
        this.f303700a.setSystemUiVisibility(5894);
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.f303709j = mediaPlayer;
        this.f303702c.setVisibility(0);
        this.f303702c.setImageResource(R.drawable.pause);
        this.f303703d.setVisibility(0);
        this.f303703d.setImageResource(R.drawable.mute);
        mediaPlayer.seekTo(1);
        mediaPlayer.start();
    }
}
