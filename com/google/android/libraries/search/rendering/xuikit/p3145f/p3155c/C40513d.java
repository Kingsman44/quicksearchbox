package com.google.android.libraries.search.rendering.xuikit.p3145f.p3155c;

import com.google.android.libraries.search.rendering.xuikit.p3145f.p3159f.C40544l;
import com.google.apps.tiktok.cache.C46370ah;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.concurrent.C46464p;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57798ab;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57813j;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57815l;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57817n;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57827x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.f.c.d */
/* compiled from: PG */
public final class C40513d implements C46464p {

    /* renamed from: a */
    final /* synthetic */ C40514e f106304a;

    public C40513d(C40514e eVar) {
        this.f106304a = eVar;
    }

    /* renamed from: a */
    public final C46463o mo18057a() {
        C46370ah a;
        C40544l lVar;
        C57827x xVar;
        C57798ab abVar;
        C40514e eVar = this.f106304a;
        synchronized (eVar.f106310f) {
            a = eVar.mo42482a(eVar.f106311g);
        }
        if (a == null || (xVar = (C57827x) a.f121384a) == null) {
            lVar = new C40544l(0, (C57784p) null, 7);
        } else {
            C57813j jVar = xVar.f154504d;
            if (jVar == null) {
                jVar = C57813j.f154466e;
            }
            int i = jVar.f154469b;
            if (xVar.f154502b == 2) {
                abVar = (C57798ab) xVar.f154503c;
            } else {
                abVar = C57798ab.f154412c;
            }
            C57784p pVar = abVar.f154415b;
            if (pVar == null) {
                pVar = C57784p.f154382f;
            }
            C69664n.m101060f(pVar, "it.standaloneResponse.elementsOutput");
            C57813j jVar2 = xVar.f154504d;
            if (jVar2 == null) {
                jVar2 = C57813j.f154466e;
            }
            C57815l lVar2 = jVar2.f154471d;
            if (lVar2 == null) {
                lVar2 = C57815l.f154472b;
            }
            C57817n nVar = lVar2.f154474a;
            if (nVar == null) {
                nVar = C57817n.f154476d;
            }
            C69664n.m101060f(nVar, "it.config.loggingMetadata.newVeTreeLoggingMetadata");
            lVar = new C40544l(i, pVar, nVar);
        }
        return new C46463o(new C60817ay(C60856cj.m92900i(lVar)));
    }
}
