package com.google.android.apps.gsa.staticplugins.images.viewer.p8015a;

import com.google.android.libraries.gsa.monet.service.FeatureSubtreeSnapshot;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.common.p4522b.C58480gp;
import com.google.protos.p4972d.p4980b.p4981a.p4982a.C64630a;
import com.google.protos.p4972d.p4980b.p4981a.p4982a.C64631b;
import com.google.protos.p5146w.p5147a.p5148a.C65926d;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.a.s */
/* compiled from: PG */
public final /* synthetic */ class C102280s implements C102284w {

    /* renamed from: a */
    public final /* synthetic */ C102286y f285394a;

    public /* synthetic */ C102280s(C102286y yVar) {
        this.f285394a = yVar;
    }

    /* renamed from: a */
    public final void mo93057a(C65926d dVar, int i) {
        C102286y yVar = this.f285394a;
        C64631b bVar = (C64631b) ((C102265d) yVar.f285397a).f285340b.f63720e;
        C64630a aVar = (C64630a) C64631b.f175197n.createBuilder();
        aVar.copyOnWrite();
        C64631b bVar2 = (C64631b) aVar.instance;
        dVar.getClass();
        bVar2.f175200b = dVar;
        bVar2.f175199a |= 1;
        aVar.copyOnWrite();
        C64631b bVar3 = (C64631b) aVar.instance;
        bVar3.f175199a |= 2;
        bVar3.f175201c = i;
        aVar.copyOnWrite();
        C64631b bVar4 = (C64631b) aVar.instance;
        bVar4.f175199a |= 128;
        bVar4.f175206h = true;
        aVar.copyOnWrite();
        C64631b bVar5 = (C64631b) aVar.instance;
        bVar5.f175199a |= 64;
        bVar5.f175205g = false;
        aVar.copyOnWrite();
        C64631b bVar6 = (C64631b) aVar.instance;
        bVar6.f175199a |= 512;
        bVar6.f175208j = false;
        aVar.copyOnWrite();
        C64631b bVar7 = (C64631b) aVar.instance;
        bVar7.f175199a |= 256;
        bVar7.f175207i = false;
        String str = bVar.f175203e;
        aVar.copyOnWrite();
        C64631b bVar8 = (C64631b) aVar.instance;
        str.getClass();
        bVar8.f175199a |= 8;
        bVar8.f175203e = str;
        String str2 = bVar.f175204f;
        aVar.copyOnWrite();
        C64631b bVar9 = (C64631b) aVar.instance;
        str2.getClass();
        bVar9.f175199a |= 16;
        bVar9.f175204f = str2;
        String str3 = bVar.f175202d;
        aVar.copyOnWrite();
        C64631b bVar10 = (C64631b) aVar.instance;
        str3.getClass();
        bVar10.f175199a |= 4;
        bVar10.f175202d = str3;
        C64631b bVar11 = (C64631b) aVar.build();
        C23186f e = yVar.mo93059e();
        if (e.mo28631l()) {
            FeatureSubtreeSnapshot b = e.mo28621b();
            C58480gp gpVar = new C58480gp(4);
            gpVar.mo55396h((Iterable) ((C102265d) yVar.f285397a).f285346h.f63720e);
            gpVar.mo55395g(b);
            ((C102265d) yVar.f285397a).f285346h.mo28730f(gpVar.mo55394f(), false);
        }
        C23186f e2 = yVar.mo93059e();
        C23251a aVar2 = ((C102265d) yVar.f285397a).f285345g;
        aVar2.mo28730f(Boolean.valueOf(!((Boolean) aVar2.f63720e).booleanValue()), false);
        e2.mo28624e("imageviewer", C23245b.m43556a(C102286y.m169551h(bVar11)));
    }
}
