package com.google.assistant.p3838ao.p3839a.p3849i;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.assistant.ao.a.i.b */
/* compiled from: PG */
public final /* synthetic */ class C49671b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C49674e f128228a;

    /* renamed from: b */
    public final /* synthetic */ String f128229b;

    public /* synthetic */ C49671b(C49674e eVar, String str) {
        this.f128228a = eVar;
        this.f128229b = str;
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
        C49674e eVar = this.f128228a;
        return ((String) eVar.f128234b.apply(obj)).equals(this.f128229b);
    }
}
