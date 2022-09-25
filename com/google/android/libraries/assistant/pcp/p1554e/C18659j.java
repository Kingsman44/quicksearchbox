package com.google.android.libraries.assistant.pcp.p1554e;

import com.google.assistant.p3803ag.p3809c.C49144n;
import com.google.assistant.p3994s.p3995a.C53306j;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.e.j */
/* compiled from: PG */
public final /* synthetic */ class C18659j implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C53306j f52691a;

    public /* synthetic */ C18659j(C53306j jVar) {
        this.f52691a = jVar;
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
        return ((C49144n) obj).f127087a == this.f52691a.f139793X;
    }
}
