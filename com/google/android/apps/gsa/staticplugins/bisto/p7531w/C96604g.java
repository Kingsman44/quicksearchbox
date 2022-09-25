package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124650bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.g */
/* compiled from: PG */
final class C96604g extends C96588ct {

    /* renamed from: a */
    public static final C59071e f270256a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.w.g");

    /* renamed from: b */
    public final C96586cr f270257b = new C96603f(this);

    /* renamed from: c */
    public final C124650bp f270258c;

    /* renamed from: d */
    public final int f270259d;

    /* renamed from: e */
    public final int f270260e;

    public C96604g(C22871g gVar, C22871g gVar2, C96579ck ckVar, C21370a aVar, C95355bf bfVar, C124721s sVar, C124629av avVar, C124650bp bpVar, int i) {
        super(gVar, gVar2, ckVar, aVar, bfVar, sVar, avVar);
        this.f270259d = i;
        this.f270258c = bpVar;
        this.f270260e = bpVar.f343893b;
    }

    /* renamed from: a */
    public final String mo90248a() {
        return "BeginOtaTask";
    }

    /* renamed from: b */
    public final void mo90249b() {
        C22871g gVar = this.f270197i;
        int i = this.f270260e;
        gVar.mo28212l("Sending begin: #" + i, new C96602e(this));
    }
}
