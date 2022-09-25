package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90996e;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.NewCardsInfo;
import com.google.android.apps.gsa.sidekick.shared.util.C92001t;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7744ii;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C98050ae implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C98064as f273784a;

    /* renamed from: b */
    public final /* synthetic */ Map f273785b;

    /* renamed from: c */
    public final /* synthetic */ int f273786c;

    public /* synthetic */ C98050ae(C98064as asVar, Map map, int i) {
        this.f273784a = asVar;
        this.f273785b = map;
        this.f273786c = i;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C98064as asVar = this.f273784a;
        Map map = this.f273785b;
        C98128j jVar = new C98128j(this.f273786c, map, C58485gu.m89847o(208, 209));
        jVar.mo86660l((C7744ii) ((C58833ax) obj).mo56111f());
        C58485gu f = jVar.f274023a.mo55394f();
        if (f.isEmpty()) {
            asVar.f273820p.mo85270f("getNewCardsInfo: none", C90996e.f254198a);
        } else {
            int i = ((C58724pq) f).f156474d;
            for (int i2 = 0; i2 < i; i2++) {
                asVar.f273820p.mo85270f("getNewCardsInfo: ".concat(C92001t.m151013f((C7669fo) f.get(i2)).toString()), C90996e.f254198a);
            }
        }
        return new NewCardsInfo(((C58724pq) f).f156474d, jVar.f274024b, jVar.f274025c);
    }
}
