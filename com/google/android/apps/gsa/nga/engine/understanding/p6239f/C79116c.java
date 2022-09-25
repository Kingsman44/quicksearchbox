package com.google.android.apps.gsa.nga.engine.understanding.p6239f;

import com.google.android.apps.gsa.nga.engine.ag.af;
import com.google.android.apps.gsa.nga.engine.p6260x.C79851ai;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.protos.p4850an.C63618g;
import com.google.protos.p4850an.C63624h;
import com.google.protos.p4883as.p4884a.C63775d;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.f.c */
/* compiled from: PG */
final class C79116c extends C79126m {

    /* renamed from: b */
    private final af f217508b;

    public C79116c(af afVar, C79851ai aiVar, C22871g gVar) {
        super(aiVar, gVar);
        this.f217508b = afVar;
    }

    /* renamed from: a */
    public final boolean mo73805a(C61748j jVar, C80515d dVar) {
        C63624h hVar;
        if (jVar.f166802a == 15) {
            hVar = (C63624h) jVar.f166803b;
        } else {
            hVar = C63624h.f172070b;
        }
        return Collection.EL.stream(hVar.f172072a).anyMatch(C79114a.f217506a);
    }

    /* renamed from: b */
    public final C60870cx mo73806b(C61748j jVar) {
        C63624h hVar;
        C63624h hVar2;
        C58480gp e = C58485gu.m89837e();
        if (jVar.f166802a == 15) {
            hVar = (C63624h) jVar.f166803b;
        } else {
            hVar = C63624h.f172070b;
        }
        for (C63775d dVar : hVar.f172072a) {
            int i = dVar.f172520a;
            if ((i & 64) == 0 && (i & 4) == 0) {
                String str = dVar.f172521b;
                e.mo55396h((C58485gu) Collection.EL.stream(this.f217508b.d(str)).map(new C79115b(str)).collect(C58370cn.f155946a));
            } else {
                e.mo55395g(dVar);
            }
        }
        C61747i iVar = (C61747i) jVar.toBuilder();
        if (jVar.f166802a == 15) {
            hVar2 = (C63624h) jVar.f166803b;
        } else {
            hVar2 = C63624h.f172070b;
        }
        C63618g gVar = (C63618g) hVar2.toBuilder();
        gVar.copyOnWrite();
        ((C63624h) gVar.instance).f172072a = C63624h.emptyProtobufList();
        gVar.mo59220a(e.mo55394f());
        C63624h hVar3 = (C63624h) gVar.build();
        iVar.copyOnWrite();
        C61748j jVar2 = (C61748j) iVar.instance;
        hVar3.getClass();
        jVar2.f166803b = hVar3;
        jVar2.f166802a = 15;
        return C60856cj.m92900i(Optional.m71637of((C61748j) iVar.build()));
    }
}
