package com.google.android.apps.gsa.staticplugins.p8043n;

import android.media.MediaPlayer;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.n.b */
/* compiled from: PG */
public final /* synthetic */ class C102872b implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public final /* synthetic */ C102889s f287313a;

    public /* synthetic */ C102872b(C102889s sVar) {
        this.f287313a = sVar;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        C102889s sVar = this.f287313a;
        C59052c cVar = (C59052c) C102889s.f287330a.mo56225c();
        cVar.mo56380ai(C58979ad.MEDIUM);
        ((C59052c) cVar.mo56372aa(14045)).mo56393w("MediaPlayer playback error. error type = %d. extra info = %d", i, i2);
        sVar.mo93523j();
        return true;
    }
}
