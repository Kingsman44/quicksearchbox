package com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b;

import android.media.MediaPlayer;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.b.b.aa */
/* compiled from: PG */
public final /* synthetic */ class C95175aa implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public final /* synthetic */ C95186al f266286a;

    public /* synthetic */ C95175aa(C95186al alVar) {
        this.f266286a = alVar;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        C95186al alVar = this.f266286a;
        C59104x c = C95186al.f266307a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "UriPlayer");
        ((C59052c) ((C59052c) c).mo56372aa(14662)).mo56393w("MediaPlayer playback error. what = %d. extra = %d", i, i2);
        alVar.mo89091b();
        return true;
    }
}
