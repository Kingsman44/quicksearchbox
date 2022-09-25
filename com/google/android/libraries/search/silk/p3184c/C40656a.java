package com.google.android.libraries.search.silk.p3184c;

import android.content.Context;
import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.gms.clearcut.p10777a.C143619a;
import com.google.android.libraries.p1975k.C24019l;
import com.google.android.libraries.p1975k.p1980e.C24006d;
import com.google.common.p4552o.C59591api;
import com.google.common.p4552o.apn;
import dagger.C68214a;
import p5535j.p5536a.p5560g.C71176a;

/* renamed from: com.google.android.libraries.search.silk.c.a */
/* compiled from: PG */
public final class C40656a {

    /* renamed from: a */
    private C143658k f106673a = null;

    /* renamed from: b */
    private final C68214a f106674b;

    /* renamed from: c */
    private final Context f106675c;

    /* renamed from: d */
    private final String f106676d;

    /* renamed from: e */
    private final C24019l f106677e;

    public C40656a(C68214a aVar, Context context, String str) {
        this.f106674b = aVar;
        this.f106675c = context;
        this.f106676d = str;
        this.f106677e = new C71176a();
    }

    /* renamed from: b */
    private final synchronized C143658k m70428b() {
        if (this.f106673a == null) {
            C143619a aVar = (C143619a) this.f106674b.mo27525b();
            this.f106673a = new C143658k(this.f106675c, "SILK_NATIVE", (String) null);
        }
        return this.f106673a;
    }

    /* renamed from: a */
    public final void mo42584a(apn apn) {
        C59591api api = (C59591api) apn.toBuilder();
        String str = this.f106676d;
        api.copyOnWrite();
        apn apn2 = (apn) api.instance;
        str.getClass();
        apn2.f159682a |= 1024;
        apn2.f159689h = str;
        C143657j d = m70428b().mo118999d((apn) api.build());
        d.f389472n = C24006d.m44596b(this.f106675c, this.f106677e);
        d.mo118992a();
    }
}
