package com.google.android.apps.gsa.nga.engine.understanding;

import com.google.common.p4522b.C58528ij;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.protos.p4850an.C63624h;
import com.google.protos.p4883as.p4884a.C63775d;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.o */
/* compiled from: PG */
public final /* synthetic */ class C79157o implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C61746h f217604a;

    public /* synthetic */ C79157o(C61746h hVar) {
        this.f217604a = hVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C63624h hVar;
        C61746h hVar2 = this.f217604a;
        C63775d dVar = (C63775d) obj;
        C58528ij ijVar = C79158p.f217605a;
        C61748j jVar = hVar2.f166797e;
        if (jVar == null) {
            jVar = C61748j.f166800d;
        }
        if (jVar.f166802a == 15) {
            hVar = (C63624h) jVar.f166803b;
        } else {
            hVar = C63624h.f172070b;
        }
        return Collection.EL.stream(hVar.f172072a).anyMatch(new C79155m(dVar));
    }
}
