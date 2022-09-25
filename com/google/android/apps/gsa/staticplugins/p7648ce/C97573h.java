package com.google.android.apps.gsa.staticplugins.p7648ce;

import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.util.C90757ba;
import com.google.common.p4522b.C58459fv;
import com.google.common.p4522b.C58671nr;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.amo;

/* renamed from: com.google.android.apps.gsa.staticplugins.ce.h */
/* compiled from: PG */
public final class C97573h {

    /* renamed from: a */
    public static final C59071e f272582a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ce.h");

    /* renamed from: e */
    private static final ClientConfig f272583e;

    /* renamed from: b */
    public final C87673aa f272584b;

    /* renamed from: c */
    public final C58671nr f272585c = new C58459fv();

    /* renamed from: d */
    final C87682aj f272586d = new C97572g(this);

    static {
        C88486g gVar = new C88486g();
        gVar.f239199a = 4679366868994L;
        gVar.f239200b = 0;
        gVar.f239201c = amo.TRUSTED_TEST_SERVICE;
        gVar.f239204f = "debug";
        f272583e = new ClientConfig(gVar);
    }

    public C97573h(C87677ae aeVar) {
        C87673aa a = aeVar.mo81958a((C87682aj) null, (C90757ba) null, f272583e);
        this.f272584b = a;
    }
}
