package com.google.android.libraries.gsa.conversation.p1839c;

import android.content.Context;
import android.net.wifi.WifiManager;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.gsa.conversation.c.g */
/* compiled from: PG */
public final class C22360g implements C68220f {

    /* renamed from: a */
    private final C69464a f61707a;

    public C22360g(C69464a aVar) {
        this.f61707a = aVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        WifiManager wifiManager = (WifiManager) ((Context) ((C68221g) this.f61707a).f184583a).getSystemService("wifi");
        C68225k.m98532d(wifiManager);
        return wifiManager;
    }
}
