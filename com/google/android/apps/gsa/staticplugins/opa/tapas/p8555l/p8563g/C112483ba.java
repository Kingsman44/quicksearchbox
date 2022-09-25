package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113157bo;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48632bu;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48634bw;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.common.base.C58893dc;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.EnumMap;
import java.util.Map;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.ba */
/* compiled from: PG */
public final /* synthetic */ class C112483ba implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C112519cj f312008a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f312009b;

    public /* synthetic */ C112483ba(C112519cj cjVar, C58485gu guVar) {
        this.f312008a = cjVar;
        this.f312009b = guVar;
    }

    public final Object get() {
        C112519cj cjVar = this.f312008a;
        C58485gu guVar = this.f312009b;
        EnumMap enumMap = new EnumMap(C48634bw.class);
        long b = cjVar.f312076i.mo26870b();
        for (Map.Entry entry : cjVar.f312071d.entrySet()) {
            if (guVar.contains(entry.getKey())) {
                C112518ci ciVar = (C112518ci) entry.getValue();
                if (ciVar.mo99561c() && b - ciVar.f312065e > C112519cj.f312070c) {
                    ciVar.mo99559a();
                }
                if (ciVar.mo99562d(b)) {
                    ciVar.f312063c = C48635bx.f125704d;
                }
                C48634bw bwVar = (C48634bw) entry.getKey();
                C58893dc.m90997b(bwVar == ciVar.f312061a);
                if (((Boolean) C112519cj.f312068a.mo105235d("shouldFetch_".concat(String.valueOf(bwVar.name())), new C112507by(ciVar, b, bwVar))).booleanValue()) {
                    C58976aa aaVar = C58975e.f156826a;
                    entry.getKey();
                    C48632bu buVar = C48632bu.f125675a;
                    C112519cj.f312068a.mo105241j("startFetch_".concat(String.valueOf(ciVar.f312061a.name())), new C112508bz(ciVar, buVar, b));
                }
                C60870cx cxVar = ciVar.f312064d;
                if (cxVar != null && !cxVar.isCancelled()) {
                    enumMap.put((C48634bw) entry.getKey(), cxVar);
                }
            }
        }
        return ((C113157bo) cjVar.f312083p.mo27525b()).mo99891a(enumMap);
    }
}
