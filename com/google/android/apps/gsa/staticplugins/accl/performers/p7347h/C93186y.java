package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import android.media.MediaPlayer;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.y */
/* compiled from: PG */
public final /* synthetic */ class C93186y implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ C93150bb f259892a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f259893b;

    public /* synthetic */ C93186y(C93150bb bbVar, SettableFuture settableFuture) {
        this.f259892a = bbVar;
        this.f259893b = settableFuture;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        C93150bb bbVar = this.f259892a;
        SettableFuture settableFuture = this.f259893b;
        bbVar.f259812m.mo19974a(C37176a.f96803A.mo40815i(C62722b.OK));
        C58976aa aaVar = C58975e.f156826a;
        settableFuture.mo57356n(C118826c.f331422a);
    }
}
