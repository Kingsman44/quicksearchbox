package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import com.google.knowledge.p4661a.p4662a.C61751m;
import p3186j$.util.function.IntPredicate;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.aq */
/* compiled from: PG */
public final /* synthetic */ class C32995aq implements IntPredicate {

    /* renamed from: a */
    public final /* synthetic */ C61751m f88392a;

    public /* synthetic */ C32995aq(C61751m mVar) {
        this.f88392a = mVar;
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return IntPredicate.CC.$default$and(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate negate() {
        return IntPredicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ IntPredicate mo19598or(IntPredicate intPredicate) {
        return IntPredicate.CC.$default$or(this, intPredicate);
    }

    public final boolean test(int i) {
        return this.f88392a.mo58182a(i).f166796d.equals("id_form");
    }
}
