package com.google.android.apps.gsa.staticplugins.p8043n;

import android.media.MediaPlayer;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.staticplugins.n.i */
/* compiled from: PG */
public final /* synthetic */ class C102879i implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C102889s f287320a;

    public /* synthetic */ C102879i(C102889s sVar) {
        this.f287320a = sVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C102889s sVar = this.f287320a;
        MediaPlayer mediaPlayer = (MediaPlayer) obj;
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            sVar.mo93524k(mediaPlayer, 4);
        }
    }
}
