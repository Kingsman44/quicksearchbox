package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import com.google.android.apps.search.googleapp.discover.settings.p10218c.C134645f;
import com.google.android.apps.search.googleapp.discover.settings.p10218c.C134646g;
import com.google.android.apps.search.webglide.p10699b.C142170a;
import com.google.android.apps.search.webglide.p10699b.C142173d;
import com.google.android.apps.search.webglide.p10699b.C142174e;
import com.google.android.apps.search.webglide.p10699b.C142177h;
import com.google.android.apps.search.webglide.p10699b.C142180k;
import com.google.android.apps.search.webglide.p10699b.C142181l;
import com.google.android.apps.search.webglide.p10699b.C142185p;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57068aj;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57071am;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57072an;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import kotlinx.coroutines.C71634cg;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.p5581g.C71759d;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.C70098h;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69880o;
import p5488io.p5490b.p5497e.p5502e.p5505c.C69910d;
import p5488io.p5490b.p5497e.p5502e.p5505c.C69918l;
import p5488io.p5490b.p5497e.p5502e.p5508f.C70013d;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.am */
/* compiled from: PG */
public final /* synthetic */ class C134382am implements C69822d {

    /* renamed from: a */
    public final /* synthetic */ C134383an f366037a;

    /* renamed from: b */
    public final /* synthetic */ Optional f366038b;

    /* renamed from: c */
    public final /* synthetic */ C57068aj f366039c;

    /* renamed from: d */
    public final /* synthetic */ C21311r f366040d;

    public /* synthetic */ C134382am(C134383an anVar, Optional optional, C57068aj ajVar, C21311r rVar) {
        this.f366037a = anVar;
        this.f366038b = optional;
        this.f366039c = ajVar;
        this.f366040d = rVar;
    }

    /* renamed from: a */
    public final Object mo25875a(Object obj) {
        C134383an anVar = this.f366037a;
        Optional optional = this.f366038b;
        C57068aj ajVar = this.f366039c;
        C21311r rVar = this.f366040d;
        Boolean bool = (Boolean) obj;
        if (!optional.isPresent() || ((!anVar.f366046e && anVar.f366045d) || (!anVar.f366047f && !bool.booleanValue()))) {
            return anVar.mo111774d(ajVar, rVar);
        }
        if (anVar.f366055n) {
            anVar.mo111775e(3);
            return anVar.mo111774d(ajVar, rVar);
        }
        anVar.mo111775e(2);
        int intValue = ((Integer) optional.get()).intValue();
        C142177h hVar = (C142177h) C142180k.f385703q.createBuilder();
        int i = true != anVar.f366047f ? 1 : 2;
        hVar.copyOnWrite();
        C142180k kVar = (C142180k) hVar.instance;
        kVar.f385706b = i - 1;
        kVar.f385705a |= 1;
        boolean z = anVar.f366048g;
        hVar.copyOnWrite();
        C142180k kVar2 = (C142180k) hVar.instance;
        kVar2.f385705a |= 2;
        kVar2.f385707c = z;
        boolean z2 = anVar.f366050i;
        hVar.copyOnWrite();
        C142180k kVar3 = (C142180k) hVar.instance;
        kVar3.f385705a |= 8;
        kVar3.f385709e = z2;
        boolean z3 = anVar.f366046e;
        hVar.copyOnWrite();
        C142180k kVar4 = (C142180k) hVar.instance;
        kVar4.f385705a |= 16;
        kVar4.f385710f = z3;
        boolean z4 = anVar.f366049h;
        hVar.copyOnWrite();
        C142180k kVar5 = (C142180k) hVar.instance;
        kVar5.f385705a |= 4;
        kVar5.f385708d = z4;
        boolean z5 = anVar.f366051j;
        hVar.copyOnWrite();
        C142180k kVar6 = (C142180k) hVar.instance;
        kVar6.f385705a |= 32;
        kVar6.f385711g = z5;
        boolean z6 = anVar.f366052k;
        hVar.copyOnWrite();
        C142180k kVar7 = (C142180k) hVar.instance;
        kVar7.f385705a |= 64;
        kVar7.f385712h = z6;
        boolean z7 = anVar.f366053l;
        hVar.copyOnWrite();
        C142180k kVar8 = (C142180k) hVar.instance;
        kVar8.f385705a |= 128;
        kVar8.f385713i = z7;
        boolean z8 = anVar.f366054m;
        hVar.copyOnWrite();
        C142180k kVar9 = (C142180k) hVar.instance;
        kVar9.f385705a |= 256;
        kVar9.f385714j = z8;
        boolean z9 = anVar.f366056o;
        hVar.copyOnWrite();
        C142180k kVar10 = (C142180k) hVar.instance;
        kVar10.f385705a |= 512;
        kVar10.f385715k = z9;
        boolean z10 = anVar.f366057p;
        hVar.copyOnWrite();
        C142180k kVar11 = (C142180k) hVar.instance;
        kVar11.f385705a |= 1024;
        kVar11.f385716l = z10;
        boolean z11 = anVar.f366058q;
        hVar.copyOnWrite();
        C142180k kVar12 = (C142180k) hVar.instance;
        kVar12.f385705a |= 2048;
        kVar12.f385717m = z11;
        boolean z12 = anVar.f366059r;
        hVar.copyOnWrite();
        C142180k kVar13 = (C142180k) hVar.instance;
        kVar13.f385705a |= 4096;
        kVar13.f385718n = z12;
        boolean z13 = anVar.f366060s;
        hVar.copyOnWrite();
        C142180k kVar14 = (C142180k) hVar.instance;
        kVar14.f385705a |= 8192;
        kVar14.f385719o = z13;
        boolean z14 = anVar.f366061t;
        hVar.copyOnWrite();
        C142180k kVar15 = (C142180k) hVar.instance;
        kVar15.f385705a |= 16384;
        kVar15.f385720p = z14;
        C142180k kVar16 = (C142180k) hVar.build();
        C142170a aVar = (C142170a) C142173d.f385675i.createBuilder();
        aVar.copyOnWrite();
        C142173d dVar = (C142173d) aVar.instance;
        kVar16.getClass();
        dVar.f385681e = kVar16;
        dVar.f385677a |= 4;
        for (int i2 = 0; i2 < ajVar.f152350b.size(); i2++) {
            C57072an anVar2 = (C57072an) ajVar.f152350b.get(i2);
            C142181l lVar = (C142181l) C142185p.f385723l.createBuilder();
            int a = C57071am.m88257a(anVar2.f152364h);
            if (a == 0) {
                a = 2;
            }
            int i3 = a + -1 != 2 ? 1 : 2;
            lVar.copyOnWrite();
            C142185p pVar = (C142185p) lVar.instance;
            pVar.f385727c = i3;
            pVar.f385725a |= 2;
            String str = anVar2.f152357a;
            lVar.copyOnWrite();
            C142185p pVar2 = (C142185p) lVar.instance;
            str.getClass();
            pVar2.f385725a |= 1;
            pVar2.f385726b = str;
            String str2 = anVar2.f152358b;
            lVar.copyOnWrite();
            C142185p pVar3 = (C142185p) lVar.instance;
            str2.getClass();
            pVar3.f385725a |= 128;
            pVar3.f385733i = str2;
            String str3 = anVar2.f152359c;
            lVar.copyOnWrite();
            C142185p pVar4 = (C142185p) lVar.instance;
            str3.getClass();
            pVar4.f385725a |= 8;
            pVar4.f385729e = str3;
            String str4 = anVar2.f152360d;
            lVar.copyOnWrite();
            C142185p pVar5 = (C142185p) lVar.instance;
            str4.getClass();
            pVar5.f385725a |= 4;
            pVar5.f385728d = str4;
            String str5 = anVar2.f152361e;
            lVar.copyOnWrite();
            C142185p pVar6 = (C142185p) lVar.instance;
            str5.getClass();
            pVar6.f385725a |= 16;
            pVar6.f385730f = str5;
            String str6 = anVar2.f152362f;
            lVar.copyOnWrite();
            C142185p pVar7 = (C142185p) lVar.instance;
            str6.getClass();
            pVar7.f385725a |= 32;
            pVar7.f385731g = str6;
            String str7 = anVar2.f152363g;
            lVar.copyOnWrite();
            C142185p pVar8 = (C142185p) lVar.instance;
            str7.getClass();
            pVar8.f385725a |= 64;
            pVar8.f385732h = str7;
            lVar.copyOnWrite();
            C142185p pVar9 = (C142185p) lVar.instance;
            C62995dn dnVar = pVar9.f385734j;
            if (!dnVar.f170058b) {
                pVar9.f385734j = dnVar.mo58980a();
            }
            pVar9.f385734j.put("Referer", "android-app://com.google.android.googlequicksearchbox/https/www.google.com");
            lVar.copyOnWrite();
            C142185p pVar10 = (C142185p) lVar.instance;
            pVar10.f385725a |= 256;
            pVar10.f385735k = i2;
            aVar.mo117041a((C142185p) lVar.build());
        }
        aVar.copyOnWrite();
        C142173d dVar2 = (C142173d) aVar.instance;
        dVar2.f385677a |= 1;
        dVar2.f385679c = intValue;
        C63042fg b = C62950b.m95471b(anVar.f366043b);
        aVar.copyOnWrite();
        C142173d dVar3 = (C142173d) aVar.instance;
        b.getClass();
        dVar3.f385680d = b;
        dVar3.f385677a = 2 | dVar3.f385677a;
        aVar.copyOnWrite();
        C142173d dVar4 = (C142173d) aVar.instance;
        dVar4.f385683g = 1;
        dVar4.f385677a |= 16;
        C60214n nVar = ajVar.f152352d;
        if (nVar == null) {
            nVar = C60214n.f162914g;
        }
        aVar.copyOnWrite();
        C142173d dVar5 = (C142173d) aVar.instance;
        nVar.getClass();
        dVar5.f385684h = nVar;
        dVar5.f385677a |= 32;
        C134646g gVar = anVar.f366044c;
        C69585o oVar = gVar.f366659c;
        C134645f fVar = new C134645f(gVar, (C69577g) null);
        C69664n.m101061g(oVar, "context");
        if (oVar.get(C71643cp.f191083c) == null) {
            C69910d dVar6 = new C69910d(new C71759d(C71634cg.f191075a, oVar, fVar));
            C69822d dVar7 = C70101a.f186845m;
            C70098h a2 = dVar6.mo61635a(new C134379aj(aVar));
            C142173d dVar8 = (C142173d) aVar.build();
            C69841j.m101337b(dVar8, "defaultValue is null");
            C69918l lVar2 = new C69918l(a2, dVar8);
            C69822d dVar9 = C70101a.f186846n;
            C142174e eVar = anVar.f366042a;
            Objects.requireNonNull(eVar);
            C70013d dVar10 = new C70013d(lVar2, new C134380ak(eVar));
            C69822d dVar11 = C70101a.f186846n;
            C69880o oVar2 = new C69880o(dVar10);
            C69822d dVar12 = C70101a.f186847o;
            return oVar2;
        }
        new StringBuilder("Maybe context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had ").append(oVar);
        throw new IllegalArgumentException("Maybe context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had ".concat(String.valueOf(oVar)));
    }
}
