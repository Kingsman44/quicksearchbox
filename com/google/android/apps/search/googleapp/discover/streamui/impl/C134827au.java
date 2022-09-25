package com.google.android.apps.search.googleapp.discover.streamui.impl;

import com.google.android.apps.search.googleapp.discover.p10248y.C135214ab;
import com.google.android.apps.search.googleapp.discover.p10248y.C135215ac;
import com.google.android.apps.search.googleapp.discover.p10248y.C135216ad;
import com.google.android.apps.search.googleapp.discover.p10248y.C135270u;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.common.p4580v.C60945d;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.au */
/* compiled from: PG */
public final class C134827au {
    /* renamed from: a */
    public static final C134828av m218662a(C135216ad adVar) {
        C69664n.m101061g(adVar, "renderableStream");
        if (!(adVar instanceof C135215ac)) {
            return adVar instanceof C135214ab ? new C134829aw(C134826at.m218661a(((C135214ab) adVar).f368310a)) : C134830ax.f367067a;
        }
        C135215ac acVar = (C135215ac) adVar;
        C135270u uVar = acVar.f368322j;
        if (uVar != null) {
            return new C134831ay(C134826at.m218661a(uVar));
        }
        C60220t tVar = acVar.f368315c.f162928b;
        if (tVar == null) {
            tVar = C60220t.f162931e;
        }
        Instant d = C60945d.m93099d(tVar.f162934b);
        C69664n.m101060f(d, "ofEpochMicros(renderable…nseEventId.base.timeUsec)");
        return new C134832az(d);
    }
}
