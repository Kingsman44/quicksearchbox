package com.google.android.libraries.componentview.services.application;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import com.google.android.libraries.componentview.components.p1682a.C19830p;
import com.google.android.libraries.componentview.components.p1682a.p1683a.C19765j;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1699f.C20520h;
import java.io.IOException;
import java.util.Locale;

/* renamed from: com.google.android.libraries.componentview.services.application.s */
/* compiled from: PG */
public class C20628s implements C20573b {

    /* renamed from: a */
    private final C20601ca f57858a;

    /* renamed from: b */
    private final TextToSpeech f57859b;

    /* renamed from: c */
    private volatile MediaPlayer f57860c;

    /* renamed from: d */
    private final Object f57861d = new Object();

    /* renamed from: e */
    private int f57862e;

    /* renamed from: i */
    public boolean f57863i;

    public C20628s(Context context, C20601ca caVar) {
        this.f57858a = caVar;
        this.f57859b = new TextToSpeech(context, new C20624o(this), "com.google.android.tts");
    }

    /* renamed from: a */
    public int mo25497a() {
        return 0;
    }

    /* renamed from: b */
    public int mo25498b() {
        return 0;
    }

    /* renamed from: c */
    public void mo25499c() {
    }

    /* renamed from: d */
    public void mo25500d() {
    }

    /* renamed from: e */
    public void mo25501e() {
        this.f57859b.shutdown();
        mo25572p();
    }

    /* renamed from: f */
    public void mo25502f() {
    }

    /* renamed from: g */
    public void mo25503g() {
    }

    /* renamed from: h */
    public void mo25504h() {
    }

    /* renamed from: j */
    public void mo25505j() {
    }

    /* renamed from: l */
    public boolean mo25506l() {
        return false;
    }

    /* renamed from: m */
    public void mo25507m(C19765j jVar, C19830p pVar) {
    }

    /* renamed from: n */
    public final void mo25508n(String str) {
        if (this.f57860c == null) {
            synchronized (this.f57861d) {
                if (this.f57860c == null) {
                    this.f57860c = new MediaPlayer();
                } else {
                    this.f57860c.reset();
                }
            }
        } else {
            this.f57860c.reset();
        }
        this.f57860c = this.f57860c;
        this.f57860c.setOnCompletionListener(new C20625p(this));
        this.f57860c.setOnPreparedListener(new C20626q());
        this.f57860c.setOnErrorListener(new C20627r(this));
        try {
            this.f57860c.setAudioStreamType(3);
            MediaPlayer mediaPlayer = this.f57860c;
            mediaPlayer.setDataSource("http:" + str);
            this.f57860c.prepareAsync();
        } catch (IOException e) {
            C20520h.m38497b(6, "DefaultAudioService", (Throwable) null, "Error while setting up media player : ".concat(e.toString()), new Object[0]);
            mo25572p();
        }
    }

    /* renamed from: o */
    public final boolean mo25509o(String str, Locale locale) {
        String num;
        if (!this.f57863i) {
            return false;
        }
        try {
            if (this.f57859b.setLanguage(locale) != 0) {
                this.f57859b.setLanguage(Locale.ENGLISH);
            }
        } catch (Exception e) {
            C20601ca caVar = this.f57858a;
            C20614e eVar = new C20614e();
            eVar.mo25535e(C19742a.AUDIO_ERROR);
            eVar.f57821a = e;
            eVar.f57822b = "Unsupported language ".concat(String.valueOf(locale.getDisplayLanguage()));
            caVar.mo25487b(eVar.mo25531a());
            this.f57859b.setLanguage(Locale.ENGLISH);
        }
        TextToSpeech textToSpeech = this.f57859b;
        Bundle bundle = new Bundle();
        synchronized (this.f57861d) {
            int i = this.f57862e + 1;
            this.f57862e = i;
            num = Integer.toString(i);
        }
        if (textToSpeech.speak(str, 0, bundle, num) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final void mo25572p() {
        if (this.f57860c != null) {
            synchronized (this.f57861d) {
                if (this.f57860c != null) {
                    this.f57860c.stop();
                    this.f57860c.release();
                    this.f57860c = null;
                }
            }
        }
    }
}
