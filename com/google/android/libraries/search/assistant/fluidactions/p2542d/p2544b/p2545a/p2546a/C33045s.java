package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import com.google.assistant.p3897e.p3921j.C52619yl;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.s */
/* compiled from: PG */
public final /* synthetic */ class C33045s implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f88488a;

    public /* synthetic */ C33045s(String str) {
        this.f88488a = str;
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
        return this.f88488a.equals(((C52619yl) obj).f138153c);
    }
}
