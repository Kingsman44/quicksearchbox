package com.google.android.libraries.p590as.p593b.p596b.p607i;

import com.google.android.libraries.p590as.p593b.p596b.C10882h;
import com.google.android.libraries.p590as.p593b.p596b.p602f.p603a.C10871f;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.as.b.b.i.o */
/* compiled from: PG */
public final /* synthetic */ class C10936o implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C10882h f36050a;

    public /* synthetic */ C10936o(C10882h hVar) {
        this.f36050a = hVar;
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
        C10882h hVar = this.f36050a;
        C58974d dVar = C10905af.f35995a;
        return Collection.EL.stream(((C10871f) obj).f35945g).filter(new C10944w(hVar)).anyMatch(new C10945x(hVar));
    }
}
