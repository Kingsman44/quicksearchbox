package com.google.android.libraries.search.p3047m.p3051c.p3052a;

import com.google.android.libraries.search.p3047m.p3048a.C39217a;
import com.google.android.libraries.search.p3047m.p3048a.p3049a.C39221d;
import com.google.android.libraries.search.p3047m.p3048a.p3049a.C39222e;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3050b.C39227c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59700co;
import com.google.common.p4552o.C59703cr;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;

/* renamed from: com.google.android.libraries.search.m.c.a.f */
/* compiled from: PG */
public final class C39236f implements C39217a {

    /* renamed from: a */
    public static final C59071e f103367a = C59071e.m91332i("com.google.android.libraries.search.m.c.a.f");

    /* renamed from: b */
    public final C59700co f103368b;

    /* renamed from: c */
    public final C39221d f103369c;

    /* renamed from: d */
    public final C39222e f103370d;

    /* renamed from: e */
    private final C60888db f103371e;

    /* renamed from: f */
    private final C39234d f103372f;

    public C39236f(C39222e eVar, C59700co coVar, C39221d dVar, C60888db dbVar, C39234d dVar2) {
        this.f103368b = coVar;
        this.f103369c = dVar;
        this.f103371e = dbVar;
        this.f103370d = eVar;
        this.f103372f = dVar2;
    }

    /* renamed from: a */
    public final void mo41729a(String str, String str2, C59703cr crVar, String str3, Integer num) {
        C60870cx cxVar;
        IllegalStateException illegalStateException = new IllegalStateException("Unconsented Location Usage");
        C39234d dVar = this.f103372f;
        if (!str.equals("android:fine_location") && !str.equals("android:coarse_location")) {
            cxVar = C60866ct.f164955a;
        } else if (C39227c.m68657a(str2) == C39226b.TAG_WEB_X_WEBLAYER) {
            cxVar = C60866ct.f164955a;
        } else {
            cxVar = C47633f.m84733g(dVar.f103359c.mo41518a()).mo51515h(new C39232b(dVar), dVar.f103358b);
        }
        C47633f g = C47633f.m84733g(cxVar);
        C39235e eVar = new C39235e(this, crVar, str2, str3, num, illegalStateException);
        C60856cj.m92911t(g.f164926b, C47810es.m84974n(eVar), this.f103371e);
    }
}
