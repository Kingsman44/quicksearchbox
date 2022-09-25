package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33140a;
import com.google.assistant.p3897e.p3921j.C52621yn;
import com.google.assistant.p3897e.p3921j.C52623yp;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.o */
/* compiled from: PG */
public final /* synthetic */ class C33041o implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C33140a f88480a;

    public /* synthetic */ C33041o(C33140a aVar) {
        this.f88480a = aVar;
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
        return ((C52621yn) ((C52623yp) obj).f138166c.get(0)).f138158c.equals(this.f88480a.mo38539a());
    }
}
