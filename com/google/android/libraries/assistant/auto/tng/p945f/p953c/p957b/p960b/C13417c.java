package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p957b.p960b;

import android.media.MediaPlayer;
import android.net.Uri;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.nlp.p4730a.p4731a.p4732a.p4733a.C62736g;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.b.b.c */
/* compiled from: PG */
public final /* synthetic */ class C13417c implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C13426l f41221a;

    /* renamed from: b */
    public final /* synthetic */ C62736g f41222b;

    public /* synthetic */ C13417c(C13426l lVar, C62736g gVar) {
        this.f41221a = lVar;
        this.f41222b = gVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C13426l lVar = this.f41221a;
        C62736g gVar = this.f41222b;
        MediaPlayer mediaPlayer = lVar.f41245c;
        mediaPlayer.getClass();
        mediaPlayer.setOnCompletionListener(new C13419e(cVar));
        MediaPlayer mediaPlayer2 = lVar.f41245c;
        mediaPlayer2.getClass();
        mediaPlayer2.setOnErrorListener(new C13420f(cVar));
        MediaPlayer mediaPlayer3 = lVar.f41245c;
        mediaPlayer3.getClass();
        mediaPlayer3.reset();
        MediaPlayer mediaPlayer4 = lVar.f41245c;
        mediaPlayer4.getClass();
        mediaPlayer4.setDataSource(lVar.f41244b, Uri.parse(gVar.f169454e));
        MediaPlayer mediaPlayer5 = lVar.f41245c;
        mediaPlayer5.getClass();
        mediaPlayer5.prepare();
        MediaPlayer mediaPlayer6 = lVar.f41245c;
        mediaPlayer6.getClass();
        mediaPlayer6.start();
        return "immediate true future";
    }
}
