package com.google.android.libraries.assistant.pcp.p1579n;

import com.google.android.libraries.assistant.pcp.C18629e;
import com.google.android.libraries.assistant.pcp.C18958m;
import com.google.android.libraries.assistant.pcp.C18997n;
import com.google.android.libraries.assistant.pcp.p1557g.C18718c;
import com.google.android.libraries.assistant.pcp.p1557g.p1560b.C18717i;
import com.google.android.libraries.assistant.pcp.p1578m.C18981k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3803ag.p3809c.C49018dk;
import com.google.assistant.p3803ag.p3809c.C49019dl;
import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.pcp.n.k */
/* compiled from: PG */
public final class C19023k implements C19001b {

    /* renamed from: a */
    public final C19004c f53409a;

    /* renamed from: b */
    public final Executor f53410b;

    public C19023k(C19004c cVar, Executor executor) {
        this.f53409a = cVar;
        this.f53410b = executor;
    }

    /* renamed from: a */
    public final C18997n mo24238a(C18718c cVar) {
        C60870cx a = cVar.mo24114a(C18717i.f52795a);
        C19022j jVar = new C19022j(this, cVar);
        C60870cx h = C60922j.m93045h(a, C47810es.m84966f(jVar), this.f53410b);
        C18958m b = C18997n.m36420b();
        ((C18629e) b).f52654a = h;
        return b.mo24092a();
    }

    /* renamed from: b */
    public final C18981k mo24239b() {
        return this.f53409a.mo24246b();
    }

    /* renamed from: c */
    public final C60870cx mo24240c(Set set, C18718c cVar) {
        if (!set.contains(this.f53409a.mo24245a())) {
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C49018dk dkVar = (C49018dk) C49019dl.f126792f.createBuilder();
        int a = this.f53409a.mo24245a().mo24070a();
        dkVar.copyOnWrite();
        C49019dl dlVar = (C49019dl) dkVar.instance;
        dlVar.f126794a |= 1;
        dlVar.f126795b = a;
        String d = mo24254d();
        dkVar.copyOnWrite();
        C49019dl dlVar2 = (C49019dl) dkVar.instance;
        dlVar2.f126794a |= 2;
        dlVar2.f126796c = d;
        return C60856cj.m92900i(C58485gu.m89846n((C49019dl) dkVar.build()));
    }

    /* renamed from: d */
    public final String mo24254d() {
        String name = this.f53409a.mo24246b().name();
        int a = this.f53409a.mo24245a().mo24070a();
        return name + "/" + a;
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("proactiveDataSourceId", this.f53409a.mo24246b().name());
        b.mo56102b("featureType", this.f53409a.mo24245a());
        return b.toString();
    }
}
