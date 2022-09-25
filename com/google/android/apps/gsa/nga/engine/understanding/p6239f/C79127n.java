package com.google.android.apps.gsa.nga.engine.understanding.p6239f;

import com.google.android.apps.gsa.nga.engine.am.h.cy;
import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.android.apps.gsa.nga.engine.am.h.f;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.protos.p4850an.p4855d.p4862g.C63564a;
import com.google.protos.p4850an.p4855d.p4862g.C63565b;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.f.n */
/* compiled from: PG */
public final /* synthetic */ class C79127n implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ String f217524a;

    /* renamed from: b */
    public final /* synthetic */ C61748j f217525b;

    public /* synthetic */ C79127n(String str, C61748j jVar) {
        this.f217524a = str;
        this.f217525b = jVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        String str = this.f217524a;
        C61748j jVar = this.f217525b;
        f c = df.c(str, (C58485gu) obj);
        C63564a aVar = (C63564a) C63565b.f171933j.createBuilder();
        f fVar = c;
        String str2 = fVar.a;
        aVar.copyOnWrite();
        C63565b bVar = (C63565b) aVar.instance;
        bVar.f171935a |= 1;
        bVar.f171936b = str2;
        aVar.mo59217b((Iterable) Collection.EL.stream(fVar.b).map(cy.a).collect(C58370cn.f155946a));
        C63565b bVar2 = (C63565b) aVar.build();
        C61747i iVar = (C61747i) jVar.toBuilder();
        iVar.copyOnWrite();
        C61748j jVar2 = (C61748j) iVar.instance;
        bVar2.getClass();
        jVar2.f166803b = bVar2;
        jVar2.f166802a = 9;
        return Optional.m71637of((C61748j) iVar.build());
    }
}
