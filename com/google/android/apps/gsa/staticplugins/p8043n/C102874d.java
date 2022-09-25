package com.google.android.apps.gsa.staticplugins.p8043n;

import android.media.MediaPlayer;

/* renamed from: com.google.android.apps.gsa.staticplugins.n.d */
/* compiled from: PG */
public final /* synthetic */ class C102874d implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ C102889s f287315a;

    public /* synthetic */ C102874d(C102889s sVar) {
        this.f287315a = sVar;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        C102889s sVar = this.f287315a;
        sVar.f287332c.setSpeakerphoneOn(sVar.f287335h);
    }
}
