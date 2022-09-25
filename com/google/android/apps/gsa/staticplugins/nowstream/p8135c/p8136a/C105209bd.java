package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87334q;
import com.google.android.apps.gsa.shared.monet.p7070b.p7101r.C90273b;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91801h;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8138b.C105311a;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8138b.C105314d;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8138b.C105315e;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8138b.C105320j;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8138b.C105321k;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8144h.C105367a;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8145i.C105380k;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a.C105403k;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105437g;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.monet.tools.recycling.p1926b.C23278b;
import com.google.android.libraries.gsa.monet.tools.recycling.p1926b.C23279c;
import com.google.android.libraries.gsa.monet.tools.recycling.p1926b.C23284h;
import com.google.android.libraries.gsa.p1863e.C22800a;
import com.google.android.libraries.gsa.p1863e.C22801b;
import com.google.android.libraries.gsa.p1863e.C22802c;
import com.google.android.libraries.gsa.p1863e.C22803d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8142xb;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.bd */
/* compiled from: PG */
public abstract class C105209bd extends C105305v implements C105403k {

    /* renamed from: o */
    protected final C105314d f293450o;

    protected C105209bd(C23052c cVar, C105437g gVar, C22871g gVar2, C68214a aVar, C90479a aVar2, C23279c cVar2, C105367a aVar3, C105380k kVar, C86124t tVar, C7642eo eoVar, C105315e eVar, C87334q qVar) {
        super(cVar, gVar, gVar2, aVar, aVar2, cVar2, aVar3, kVar, tVar, eoVar);
        C23278b bVar = this.f293799i;
        C105320j jVar = (C105320j) eVar.f293846a.mo17428b();
        jVar.getClass();
        cVar.getClass();
        qVar.getClass();
        this.f293450o = new C105314d(jVar, bVar, cVar, this, qVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo94567f(C91801h hVar) {
        C105314d dVar = this.f293450o;
        C23129y O = mo28494O("TYPE_NOW");
        C8142xb e = mo94566e();
        C22802c cVar = (C22802c) C22803d.f62771k.createBuilder();
        boolean z = hVar.f256014b;
        cVar.copyOnWrite();
        C22803d dVar2 = (C22803d) cVar.instance;
        dVar2.f62773a |= 2;
        dVar2.f62774b = z;
        boolean z2 = hVar.f256015c;
        cVar.copyOnWrite();
        C22803d dVar3 = (C22803d) cVar.instance;
        dVar3.f62773a |= 8;
        dVar3.f62775c = z2;
        boolean z3 = hVar.f256016d;
        cVar.copyOnWrite();
        C22803d dVar4 = (C22803d) cVar.instance;
        dVar4.f62773a |= 16;
        dVar4.f62776d = z3;
        int i = e.f28649u;
        cVar.copyOnWrite();
        C22803d dVar5 = (C22803d) cVar.instance;
        dVar5.f62773a |= 32;
        dVar5.f62777e = i;
        String str = hVar.f256020h;
        cVar.copyOnWrite();
        C22803d dVar6 = (C22803d) cVar.instance;
        str.getClass();
        dVar6.f62773a |= 256;
        dVar6.f62780h = str;
        if ((hVar.f256013a & 32) != 0) {
            C7669fo foVar = hVar.f256018f;
            if (foVar == null) {
                foVar = C7669fo.f26633e;
            }
            cVar.copyOnWrite();
            C22803d dVar7 = (C22803d) cVar.instance;
            foVar.getClass();
            dVar7.f62778f = foVar;
            dVar7.f62773a |= 128;
        }
        if ((hVar.f256013a & 128) != 0) {
            String str2 = hVar.f256021i;
            cVar.copyOnWrite();
            C22803d dVar8 = (C22803d) cVar.instance;
            str2.getClass();
            dVar8.f62773a |= 512;
            dVar8.f62781i = str2;
        }
        if ((hVar.f256013a & 1024) != 0) {
            String str3 = hVar.f256024l;
            cVar.copyOnWrite();
            C22803d dVar9 = (C22803d) cVar.instance;
            str3.getClass();
            dVar9.f62773a |= 1024;
            dVar9.f62782j = str3;
        }
        ArrayList arrayList = new ArrayList();
        for (C90273b bVar : hVar.f256019g) {
            C22800a aVar = (C22800a) C22801b.f62765d.createBuilder();
            C7718hj hjVar = bVar.f252148b;
            if (hjVar == null) {
                hjVar = C7718hj.f26927af;
            }
            aVar.copyOnWrite();
            C22801b bVar2 = (C22801b) aVar.instance;
            hjVar.getClass();
            bVar2.f62768b = hjVar;
            bVar2.f62767a |= 1;
            C7681g a = C7681g.m22802a(bVar.f252149c);
            if (a == null) {
                a = C7681g.INVALID;
            }
            aVar.copyOnWrite();
            C22801b bVar3 = (C22801b) aVar.instance;
            bVar3.f62769c = a.f26835cv;
            bVar3.f62767a |= 2;
            arrayList.add((C22801b) aVar.build());
        }
        cVar.copyOnWrite();
        C22803d dVar10 = (C22803d) cVar.instance;
        C62971cq cqVar = dVar10.f62779g;
        if (!cqVar.mo58948c()) {
            dVar10.f62779g = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) arrayList, (List) dVar10.f62779g);
        C23278b bVar4 = dVar.f293844a;
        bVar4.mo28754e("NAME_NOW", O, C23245b.m43556a((C22803d) cVar.build()), bVar4.f63752b.f63757a.f63585a.mo28704b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo94569i(C23028x xVar) {
        this.f293450o.f293844a.f63752b.mo28758b(xVar, "NAME_NOW", (C23284h) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo94661k(C105311a aVar) {
        C105314d dVar = this.f293450o;
        if (aVar instanceof C105321k) {
            dVar.f293845b = (C105321k) aVar;
        }
    }

    /* renamed from: o */
    public final void mo94662o() {
        C105321k kVar = this.f293450o.f293845b;
        if (kVar != null) {
            kVar.mo94687r();
        }
    }
}
