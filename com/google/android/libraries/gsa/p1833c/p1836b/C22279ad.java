package com.google.android.libraries.gsa.p1833c.p1836b;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.gsa.c.b.ad */
/* compiled from: PG */
public final class C22279ad implements C68220f {

    /* renamed from: a */
    private final C69464a f61554a;

    public C22279ad(C69464a aVar) {
        this.f61554a = aVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        WifiManager wifiManager = (WifiManager) C39239a.m68666a((Context) ((C68221g) this.f61554a).f184583a, C39226b.TAG_CLASSIC_SERVICES_WIFI).getSystemService("wifi");
        C68225k.m98532d(wifiManager);
        return wifiManager;
    }
}
