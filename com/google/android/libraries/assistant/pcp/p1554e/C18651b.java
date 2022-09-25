package com.google.android.libraries.assistant.pcp.p1554e;

import com.google.android.libraries.assistant.pcp.p1546d.C18579g;
import com.google.assistant.p3803ag.p3809c.C49050ep;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.e.b */
/* compiled from: PG */
public final /* synthetic */ class C18651b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C18579g f52682a;

    public /* synthetic */ C18651b(C18579g gVar) {
        this.f52682a = gVar;
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
        return ((C49050ep) obj).f126861a == this.f52682a.mo24070a();
    }
}
