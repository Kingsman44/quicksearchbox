package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import android.media.MediaPlayer;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.aj */
/* compiled from: PG */
public final /* synthetic */ class C93131aj implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public final /* synthetic */ C93150bb f259770a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f259771b;

    public /* synthetic */ C93131aj(C93150bb bbVar, SettableFuture settableFuture) {
        this.f259770a = bbVar;
        this.f259771b = settableFuture;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        C93150bb bbVar = this.f259770a;
        SettableFuture settableFuture = this.f259771b;
        C59104x d = C93150bb.f259800a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "NotifReadPerformer");
        ((C59052c) ((C59052c) d).mo56372aa(13421)).mo56393w("MediaPlayer onError what=%d, extra=%d", i, i2);
        bbVar.f259812m.mo19974a(C37176a.f96803A.mo40815i(C62722b.INTERNAL));
        settableFuture.mo57357o(new Exception(String.format(Locale.US, "MediaPlayer onError what=%d, extra=%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)})));
        return true;
    }
}
