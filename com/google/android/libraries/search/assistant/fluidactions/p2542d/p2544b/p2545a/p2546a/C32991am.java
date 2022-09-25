package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import com.google.assistant.p3897e.p3921j.C52613yf;
import com.google.assistant.p3897e.p3921j.C52633yz;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.am */
/* compiled from: PG */
public final /* synthetic */ class C32991am implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Optional f88390a;

    public /* synthetic */ C32991am(Optional optional) {
        this.f88390a = optional;
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
        Optional optional = this.f88390a;
        C52633yz yzVar = (C52633yz) obj;
        C52613yf yfVar = yzVar.f138197d;
        if (yfVar == null) {
            yfVar = C52613yf.f138138f;
        }
        return yfVar.f138141b.equals(optional.get()) && (yzVar.f138194a & 8) != 0;
    }
}
