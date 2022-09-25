package com.google.android.libraries.gsa.monet.internal.p1887a;

import com.google.android.libraries.gsa.monet.internal.p1887a.p1888a.C22957a;
import com.google.android.libraries.gsa.monet.internal.shared.C23038c;
import com.google.android.libraries.gsa.monet.internal.shared.C23039d;
import com.google.android.libraries.gsa.monet.internal.shared.C23040e;
import com.google.android.libraries.gsa.monet.internal.shared.C23045j;
import com.google.android.libraries.gsa.monet.internal.shared.C23047l;
import com.google.android.libraries.gsa.monet.p1886a.C22936a;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22950o;
import com.google.android.libraries.gsa.monet.shared.C23079aj;
import com.google.android.libraries.gsa.monet.shared.C23084ao;
import com.google.android.libraries.gsa.monet.shared.C23085ap;
import com.google.android.libraries.gsa.monet.shared.C23128x;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23090d;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23091e;
import com.google.android.libraries.gsa.monet.shared.p1893c.C23096b;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23100c;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23101d;
import java.util.HashMap;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.gsa.monet.internal.a.q */
/* compiled from: PG */
public final class C22993q {

    /* renamed from: a */
    private final C23045j f63243a;

    /* renamed from: b */
    private final C22961ad f63244b;

    /* renamed from: c */
    private final C23084ao f63245c;

    /* renamed from: d */
    private final C23128x f63246d;

    /* renamed from: e */
    private final C23039d f63247e;

    public C22993q(C23045j jVar, C22983g gVar, C22961ad adVar, C23084ao aoVar, C23128x xVar, C23039d dVar) {
        this.f63243a = jVar;
        this.f63244b = adVar;
        this.f63245c = aoVar;
        this.f63246d = xVar;
        this.f63247e = dVar;
        HashMap hashMap = new HashMap();
        C23090d.m43273a("TYPE_DISPLAY_COORDINATOR", gVar, hashMap);
        jVar.mo28396b("SCOPE_INTERNAL_MONET", new C22950o(new C23091e(hashMap)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C22960ac mo28378a(C23129y yVar) {
        C22936a aVar = (C22936a) this.f63243a.mo28395a(yVar.f63476a);
        if (aVar != null) {
            C23047l lVar = new C23047l(yVar, this.f63245c, this.f63243a, this.f63246d);
            C22961ad adVar = this.f63244b;
            C23038c a = this.f63247e.mo28461a(this.f63243a, yVar, lVar);
            C22957a aVar2 = (C22957a) adVar.f63163i.mo17428b();
            C22960ac acVar = new C22960ac((C22970am) adVar.f63155a.mo17428b(), (C22994r) adVar.f63156b.mo17428b(), (C23084ao) adVar.f63157c.mo17428b(), (C23040e) adVar.f63158d.mo17428b(), (C22967aj) adVar.f63159e.mo17428b(), (C23128x) adVar.f63160f.mo17428b(), yVar, lVar, a, (C23096b) adVar.f63161g.mo17428b(), (C22998v) adVar.f63162h.mo17428b());
            C22939d a2 = aVar.mo28284a(yVar.f63477b, acVar);
            if (a2 != null) {
                acVar.f63140b.mo28328a();
                C23067b.m43232e(acVar.f63149k == 1);
                acVar.f63148j = a2;
                C22939d dVar = acVar.f63148j;
                dVar.getClass();
                C23128x xVar = acVar.f63144f;
                C23100c cVar = (C23100c) C23101d.f63447g.createBuilder();
                cVar.copyOnWrite();
                C23101d dVar2 = (C23101d) cVar.instance;
                dVar2.f63452d = 1;
                dVar2.f63449a = 1 | dVar2.f63449a;
                String str = acVar.f63143e.f63478c;
                cVar.copyOnWrite();
                C23101d dVar3 = (C23101d) cVar.instance;
                str.getClass();
                dVar3.f63449a |= 4;
                dVar3.f63454f = str;
                C23101d dVar4 = (C23101d) cVar.build();
                Objects.requireNonNull(dVar);
                xVar.mo28520c(new C23001y(dVar));
                acVar.f63149k = 2;
                return acVar;
            }
            throw new C23085ap(yVar);
        }
        throw new C23079aj(yVar.f63476a);
    }
}
