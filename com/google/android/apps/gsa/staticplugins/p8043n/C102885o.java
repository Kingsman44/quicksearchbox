package com.google.android.apps.gsa.staticplugins.p8043n;

import android.media.MediaPlayer;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.staticplugins.n.o */
/* compiled from: PG */
public final /* synthetic */ class C102885o implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C102889s f287327a;

    public /* synthetic */ C102885o(C102889s sVar) {
        this.f287327a = sVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C102889s sVar = this.f287327a;
        MediaPlayer mediaPlayer = (MediaPlayer) obj;
        mediaPlayer.stop();
        sVar.mo93524k(mediaPlayer, 3);
        sVar.f287334g = BuildConfig.FLAVOR;
    }
}
