package com.google.android.apps.gsa.staticplugins.p8043n;

import android.media.MediaPlayer;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.staticplugins.n.g */
/* compiled from: PG */
public final /* synthetic */ class C102877g implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C102889s f287318a;

    public /* synthetic */ C102877g(C102889s sVar) {
        this.f287318a = sVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C102889s sVar = this.f287318a;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnCompletionListener(new C102874d(sVar));
        return mediaPlayer;
    }
}
