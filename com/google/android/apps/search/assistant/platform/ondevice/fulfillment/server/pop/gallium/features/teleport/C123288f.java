package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport;

import com.google.common.p4522b.C58485gu;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.knowledge.p4661a.p4662a.C61758t;
import com.google.protos.p4850an.C63624h;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.f */
/* compiled from: PG */
public final /* synthetic */ class C123288f implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C123522k f341019a;

    public /* synthetic */ C123288f(C123522k kVar) {
        this.f341019a = kVar;
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
        C61758t tVar;
        C123522k kVar = this.f341019a;
        C61752n nVar = (C61752n) obj;
        if (!nVar.f166811b.equals("FindOnApp")) {
            return true;
        }
        Optional findFirst = Collection.EL.stream(nVar.f166812c).filter(C123284b.f341015a).findFirst();
        if (findFirst.isPresent()) {
            C61748j jVar = ((C61746h) findFirst.get()).f166797e;
            if (jVar == null) {
                jVar = C61748j.f166800d;
            }
            if (jVar.f166802a == 3) {
                tVar = (C61758t) jVar.f166803b;
            } else {
                tVar = C61758t.f166824c;
            }
            if (tVar.f166826a == 4 && ((Boolean) tVar.f166827b).booleanValue()) {
                return true;
            }
        }
        Optional findFirst2 = Collection.EL.stream(nVar.f166812c).filter(C123285c.f341016a).findFirst();
        C58485gu a = kVar.f341329a.mo105855a();
        if (!findFirst2.isPresent()) {
            return true;
        }
        C61748j jVar2 = ((C61746h) findFirst2.get()).f166797e;
        if (jVar2 == null) {
            jVar2 = C61748j.f166800d;
        }
        if (jVar2.f166802a == 15) {
            hVar = (C63624h) jVar2.f166803b;
        } else {
            hVar = C63624h.f172070b;
        }
        Optional findFirst3 = Collection.EL.stream(hVar.f172072a).map(C123286d.f341017a).findFirst();
        return !findFirst3.isPresent() || Collection.EL.stream(a).anyMatch(new C123287e(findFirst3));
    }
}
