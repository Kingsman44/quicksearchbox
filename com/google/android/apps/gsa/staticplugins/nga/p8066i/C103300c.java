package com.google.android.apps.gsa.staticplugins.nga.p8066i;

import com.google.android.apps.gsa.n.a.aa;
import com.google.android.apps.gsa.n.a.ab;
import com.google.android.apps.gsa.n.e.d;
import com.google.android.apps.gsa.n.e.e;
import com.google.android.apps.gsa.n.f.an;
import com.google.android.apps.gsa.staticplugins.nga.p8063g.p8064a.C103196a;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.geller.C21756b;
import com.google.common.base.C58833ax;
import com.google.protos.p5129p.p5131b.C65813cq;
import dagger.p5294a.C68220f;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.i.c */
/* compiled from: PG */
public final class C103300c implements C68220f {
    /* renamed from: a */
    public static C118549h m171194a(ab abVar, C103196a aVar) {
        C58833ax k = C58833ax.m90834k(aVar);
        d createBuilder = e.h.createBuilder();
        createBuilder.b(C21756b.PKG_ENTITIES.mo27091a());
        C65813cq cqVar = C65813cq.PERIODIC;
        createBuilder.copyOnWrite();
        e eVar = createBuilder.instance;
        eVar.f = cqVar.f178923h;
        eVar.a |= 2;
        createBuilder.copyOnWrite();
        e eVar2 = createBuilder.instance;
        eVar2.a |= 1;
        eVar2.e = "agsa";
        createBuilder.copyOnWrite();
        e eVar3 = createBuilder.instance;
        eVar3.a |= 8;
        eVar3.g = true;
        e build = createBuilder.build();
        an anVar = (an) abVar.a.mo17428b();
        anVar.getClass();
        build.getClass();
        return new aa(anVar, k, build);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
