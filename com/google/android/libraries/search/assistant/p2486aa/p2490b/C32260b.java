package com.google.android.libraries.search.assistant.p2486aa.p2490b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d;
import com.google.android.libraries.search.assistant.p2705n.p2708b.C34834b;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.net.p4726a.p4727a.C62722b;
import p5462h.p5473f.p5475b.C69664n;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71086ee;

/* renamed from: com.google.android.libraries.search.assistant.aa.b.b */
/* compiled from: PG */
public final class C32260b {

    /* renamed from: a */
    private final C37215b f86498a;

    public C32260b(C37215b bVar) {
        this.f86498a = bVar;
    }

    /* renamed from: a */
    public final void mo38020a(C32849cq cqVar, int i, Throwable th) {
        C69664n.m101061g(cqVar, "sessionToken");
        mo38022c(C37176a.f97138fr.mo40779c(), cqVar, i, th);
    }

    /* renamed from: b */
    public final void mo38021b(C37252a aVar, C32849cq cqVar, int i, C71086ee eeVar) {
        String b = C32255a.m60037b(cqVar, i);
        aVar.mo40781e(C62722b.OK);
        C37253b bVar = (C37253b) aVar;
        bVar.mo40795s("session", b);
        bVar.mo40794r(b);
        bVar.mo40792p(C71086ee.f189588e, eeVar);
        this.f86498a.mo19974a(aVar);
    }

    /* renamed from: c */
    public final void mo38022c(C37252a aVar, C32849cq cqVar, int i, Throwable th) {
        String b = C32255a.m60037b(cqVar, i);
        C37253b bVar = (C37253b) aVar;
        bVar.mo40795s("session", b);
        bVar.mo40794r(b);
        if (th == null) {
            C37215b bVar2 = this.f86498a;
            aVar.mo40781e(C62722b.OK);
            bVar2.mo19974a(aVar);
            return;
        }
        C34834b bVar3 = C34830d.m63595b(th).f92362c;
        if (bVar3 == null) {
            bVar3 = C34834b.f92401c;
        }
        C34819a b2 = C34819a.m63579b(bVar3);
        C37215b bVar4 = this.f86498a;
        aVar.mo40780d(b2.mo39520a(), b2.mo39522e());
        bVar4.mo19974a(aVar);
    }

    /* renamed from: d */
    public final void mo38023d(C37259h hVar, C32849cq cqVar, int i, Throwable th) {
        String b = C32255a.m60037b(cqVar, i);
        ((C37253b) hVar.f99012a).mo40795s("session", b);
        ((C37253b) hVar.f99012a).mo40794r(b);
        if (th == null) {
            this.f86498a.mo19974a(hVar.mo40781e(C62722b.OK));
            return;
        }
        C34834b bVar = C34830d.m63595b(th).f92362c;
        if (bVar == null) {
            bVar = C34834b.f92401c;
        }
        C34819a b2 = C34819a.m63579b(bVar);
        this.f86498a.mo19974a(hVar.mo40780d(b2.mo39520a(), b2.mo39522e()));
    }

    /* renamed from: e */
    public final void mo38024e(C32849cq cqVar, int i) {
        C69664n.m101061g(cqVar, "sessionToken");
        mo38023d(C37176a.f97134fn.mo40806d(), cqVar, i, (Throwable) null);
    }
}
