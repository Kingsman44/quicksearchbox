package com.google.android.libraries.p11016ak.p11019c.p11021b;

import p3186j$.util.function.Predicate;
import p5285d.p5290b.p5291a.p5292a.C68183bs;
import p5285d.p5290b.p5291a.p5292a.C68187bw;
import p5285d.p5290b.p5291a.p5292a.C68193f;

/* renamed from: com.google.android.libraries.ak.c.b.s */
/* compiled from: PG */
public final /* synthetic */ class C147671s implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C68193f f398532a;

    public /* synthetic */ C147671s(C68193f fVar) {
        this.f398532a = fVar;
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
        C68193f fVar = this.f398532a;
        C68187bw bwVar = ((C68183bs) obj).f184495a;
        if (bwVar == null) {
            bwVar = C68187bw.f184502b;
        }
        return bwVar.f184504a.equals(fVar.f184516b);
    }
}
