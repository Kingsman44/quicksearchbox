package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8639a;

import p3186j$.util.function.Predicate;
import p5285d.p5290b.p5291a.p5292a.C68183bs;
import p5285d.p5290b.p5291a.p5292a.C68187bw;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.a.s */
/* compiled from: PG */
public final /* synthetic */ class C115110s implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f319509a;

    public /* synthetic */ C115110s(String str) {
        this.f319509a = str;
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
        String str = this.f319509a;
        C68187bw bwVar = ((C68183bs) obj).f184495a;
        if (bwVar == null) {
            bwVar = C68187bw.f184502b;
        }
        return !bwVar.f184504a.equals(str);
    }
}
