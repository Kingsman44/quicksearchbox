package com.google.android.libraries.assistant.p1363c.p1371b.p1376d;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17072q;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.c.b.d.d */
/* compiled from: PG */
public final /* synthetic */ class C17085d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C17072q f49729a;

    public /* synthetic */ C17085d(C17072q qVar) {
        this.f49729a = qVar;
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
        return this.f49729a.equals((C17072q) obj);
    }
}
