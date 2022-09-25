package com.google.android.libraries.assistant.pcp.p1541b;

import com.google.android.apps.gsa.binaries.satin.app.ana;
import com.google.android.libraries.assistant.pcp.C18701g;
import com.google.android.libraries.assistant.pcp.C18777i;
import com.google.android.libraries.assistant.pcp.datastore.p1547a.p1548a.C18581b;
import com.google.android.libraries.assistant.pcp.datastore.p1549b.p1552c.C18608c;
import com.google.android.libraries.assistant.pcp.p1554e.C18630a;
import com.google.android.libraries.assistant.pcp.p1555f.C18677a;
import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18717i;
import com.google.android.libraries.assistant.pcp.p1575l.p1576a.C18948a;
import com.google.android.libraries.assistant.pcp.p1575l.p1576a.C18951d;
import com.google.android.libraries.assistant.pcp.p1578m.C18995y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.pcp.b.v */
/* compiled from: PG */
public final class C18551v implements C18701g {

    /* renamed from: a */
    public final C18630a f52557a;

    /* renamed from: b */
    public final C18677a f52558b;

    /* renamed from: c */
    public final C60950i f52559c;

    /* renamed from: d */
    public final Executor f52560d;

    /* renamed from: e */
    public final C18608c f52561e;

    /* renamed from: f */
    public final C18581b f52562f;

    /* renamed from: g */
    private final C58495hd f52563g;

    /* renamed from: h */
    private final ana f52564h;

    public C18551v(Map map, C18630a aVar, C18608c cVar, C18581b bVar, C18677a aVar2, C60950i iVar, ana ana, Executor executor) {
        this.f52563g = C58495hd.m89898l(map);
        this.f52557a = aVar;
        this.f52561e = cVar;
        this.f52562f = bVar;
        this.f52558b = aVar2;
        this.f52559c = iVar;
        this.f52564h = ana;
        this.f52560d = executor;
    }

    /* renamed from: c */
    static /* synthetic */ C58485gu m36012c(C58485gu guVar) {
        C58480gp e = C58485gu.m89837e();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            try {
                e.mo55395g((C18995y) C60856cj.m92909r((C60870cx) guVar.get(i)));
            } catch (CancellationException | ExecutionException unused) {
            }
        }
        return e.mo55394f();
    }

    /* renamed from: a */
    public final C60870cx mo24048a(C18718c cVar, C18777i iVar) {
        C18951d a = this.f52564h.mo65974a(C18948a.PCP_FETCH_PROACTIVE_SUGGESTIONS);
        C60870cx a2 = cVar.mo24114a(C18717i.f52795a);
        C18545p pVar = new C18545p(this, a, cVar, iVar);
        return C60922j.m93045h(a2, C47810es.m84966f(pVar), this.f52560d);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ List mo24049b(C18718c cVar) {
        return (C58485gu) Collection.EL.stream(this.f52563g.values()).map(new C18537h(cVar)).collect(C58370cn.f155946a);
    }
}
