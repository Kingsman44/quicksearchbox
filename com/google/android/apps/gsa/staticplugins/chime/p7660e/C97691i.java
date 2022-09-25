package com.google.android.apps.gsa.staticplugins.chime.p7660e;

import com.google.p375ai.p378b.C7708h;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56966b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.e.i */
/* compiled from: PG */
public final /* synthetic */ class C97691i implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C7708h f272786a;

    public /* synthetic */ C97691i(C7708h hVar) {
        this.f272786a = hVar;
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
        C56966b bVar = (C56966b) obj;
        return C97692j.m161938c(this.f272786a, bVar) && bVar.f152034c;
    }
}
