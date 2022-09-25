package com.google.android.libraries.gsa.p1833c.p1836b;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68221g;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.gsa.c.b.ac */
/* compiled from: PG */
public final class C22278ac implements C68220f {

    /* renamed from: a */
    private final C69464a f61553a;

    public C22278ac(C69464a aVar) {
        this.f61553a = aVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        TelephonyManager telephonyManager = (TelephonyManager) C39239a.m68666a((Context) ((C68221g) this.f61553a).f184583a, C39226b.TAG_CLASSIC_SERVICES_TELEPHONY).getSystemService("phone");
        C68225k.m98532d(telephonyManager);
        return telephonyManager;
    }
}
