package com.google.android.apps.gsa.staticplugins.bisto.p7486d;

import android.content.BroadcastReceiver;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.audio.p4106a.C54571a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.d.n */
/* compiled from: PG */
public final /* synthetic */ class C95265n implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95269r f266556a;

    public /* synthetic */ C95265n(C95269r rVar) {
        this.f266556a = rVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95269r rVar = this.f266556a;
        C54571a aVar = (C54571a) obj;
        BroadcastReceiver broadcastReceiver = rVar.f266563c;
        if (broadcastReceiver != null) {
            rVar.f266562b.unregisterReceiver(broadcastReceiver);
        }
    }
}
