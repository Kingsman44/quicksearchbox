package com.google.android.libraries.assistant.auto.ondevice.p705a;

import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6737i.C85494a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15654f;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15656h;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15657i;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15661m;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.a.b */
/* compiled from: PG */
public final class C11835b {

    /* renamed from: a */
    public static final C59071e f38018a = C59071e.m91332i("com.google.android.libraries.assistant.auto.ondevice.a.b");

    /* renamed from: b */
    public final C11833a f38019b;

    /* renamed from: c */
    public final Query f38020c;

    /* renamed from: d */
    private final C86054o f38021d;

    /* renamed from: e */
    private final C85494a f38022e;

    public C11835b(C86054o oVar, Query query, C85494a aVar, C11833a aVar2) {
        this.f38021d = oVar;
        this.f38020c = query;
        this.f38022e = aVar;
        this.f38019b = aVar2;
    }

    /* renamed from: a */
    public final C58833ax mo20176a(Query query, C15661m mVar) {
        boolean z = this.f38021d.mo79668a() != null;
        String obj = query.f252768g.toString();
        C60870cx d = this.f38022e.mo79019d(query);
        C15656h hVar = new C15656h(z);
        C15654f fVar = (C15654f) mVar;
        fVar.f46777c = hVar;
        fVar.f46776b = new C15657i(obj);
        if (d != null) {
            fVar.f46778d = d;
            return C58833ax.m90834k(mVar.mo22474a());
        }
        throw new NullPointerException("Null deviceCapabilitiesOptionalFuture");
    }
}
