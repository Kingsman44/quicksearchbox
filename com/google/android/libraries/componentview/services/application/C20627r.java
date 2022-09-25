package com.google.android.libraries.componentview.services.application;

import android.media.MediaPlayer;
import com.google.android.libraries.componentview.p1699f.C20520h;

/* renamed from: com.google.android.libraries.componentview.services.application.r */
/* compiled from: PG */
final class C20627r implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    final /* synthetic */ C20628s f57857a;

    public C20627r(C20628s sVar) {
        this.f57857a = sVar;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        C20520h.m38497b(6, "DefaultAudioService", (Throwable) null, "Media Player encountered an error : " + i + " " + i2, new Object[0]);
        this.f57857a.mo25572p();
        return false;
    }
}
