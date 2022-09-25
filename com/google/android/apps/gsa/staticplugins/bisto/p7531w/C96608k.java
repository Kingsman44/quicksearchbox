package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124629av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58401dr;
import com.google.common.p4522b.C58418eh;
import com.google.common.p4522b.C58714pg;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.k */
/* compiled from: PG */
final class C96608k extends C96588ct {

    /* renamed from: d */
    public static final /* synthetic */ int f270267d = 0;

    /* renamed from: a */
    public final C96586cr f270268a = new C96607j(this);

    /* renamed from: b */
    public volatile Exception f270269b;

    /* renamed from: c */
    public final Iterator f270270c;

    public C96608k(C22871g gVar, C22871g gVar2, C96579ck ckVar, C21370a aVar, C95355bf bfVar, C124721s sVar, C124629av avVar) {
        super(gVar, gVar2, ckVar, aVar, bfVar, sVar, avVar);
        this.f270270c = C58401dr.m89515b(C58714pg.m90505h(0, Integer.valueOf(avVar.f343829p)), C58418eh.f156030a).descendingIterator();
    }

    /* renamed from: a */
    public final String mo90248a() {
        return "ForceAbortOtaTask";
    }

    /* renamed from: b */
    public final void mo90249b() {
        mo90272c();
    }

    /* renamed from: c */
    public final void mo90272c() {
        this.f270197i.mo28207g("abort_ota", new C96606i(this));
    }
}
