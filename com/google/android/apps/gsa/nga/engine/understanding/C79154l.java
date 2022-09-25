package com.google.android.apps.gsa.nga.engine.understanding;

import com.google.common.p4522b.C58528ij;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.protos.p4850an.C63624h;
import com.google.protos.p4850an.p4853b.C63367k;
import com.google.protos.p4850an.p4853b.C63380x;
import com.google.protos.p4850an.p4853b.C63382z;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.l */
/* compiled from: PG */
public final /* synthetic */ class C79154l implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C61746h f217601a;

    public /* synthetic */ C79154l(C61746h hVar) {
        this.f217601a = hVar;
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
        C63367k kVar;
        C63624h hVar;
        C61746h hVar2 = this.f217601a;
        C61746h hVar3 = (C61746h) obj;
        C58528ij ijVar = C79158p.f217605a;
        if (!hVar2.f166796d.equals(hVar3.f166796d)) {
            return false;
        }
        C61748j jVar = hVar2.f166797e;
        if (jVar == null) {
            jVar = C61748j.f166800d;
        }
        if (jVar.f166802a == 15) {
            C61748j jVar2 = hVar2.f166797e;
            if (jVar2 == null) {
                jVar2 = C61748j.f166800d;
            }
            if (jVar2.f166802a == 15) {
                hVar = (C63624h) jVar2.f166803b;
            } else {
                hVar = C63624h.f172070b;
            }
            return Collection.EL.stream(hVar.f172072a).allMatch(new C79157o(hVar3));
        }
        C61748j jVar3 = hVar2.f166797e;
        if ((jVar3 == null ? C61748j.f166800d : jVar3).f166802a == 8) {
            if (jVar3 == null) {
                jVar3 = C61748j.f166800d;
            }
            if (jVar3.f166802a == 8) {
                kVar = (C63367k) jVar3.f166803b;
            } else {
                kVar = C63367k.f171252c;
            }
            C63380x xVar = kVar.f171255b;
            if (xVar == null) {
                xVar = C63380x.f171276d;
            }
            C61748j jVar4 = hVar3.f166797e;
            if (jVar4 == null) {
                jVar4 = C61748j.f166800d;
            }
            C63380x xVar2 = (jVar4.f166802a == 8 ? (C63367k) jVar4.f166803b : C63367k.f171252c).f171255b;
            if (xVar2 == null) {
                xVar2 = C63380x.f171276d;
            }
            if (xVar.f171279b != xVar2.f171279b) {
                return false;
            }
            int a = C63382z.m96232a(xVar.f171280c);
            if (a == 0) {
                a = 1;
            }
            int a2 = C63382z.m96232a(xVar2.f171280c);
            if (a2 == 0) {
                a2 = 1;
            }
            if (a != a2) {
                return false;
            }
            return true;
        }
        if (jVar3 == null) {
            jVar3 = C61748j.f166800d;
        }
        C61748j jVar5 = hVar3.f166797e;
        if (jVar5 == null) {
            jVar5 = C61748j.f166800d;
        }
        return jVar3.equals(jVar5);
    }
}
