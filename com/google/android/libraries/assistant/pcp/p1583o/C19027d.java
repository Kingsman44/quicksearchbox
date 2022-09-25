package com.google.android.libraries.assistant.pcp.p1583o;

import com.google.assistant.p3803ag.p3809c.C49109gu;
import com.google.assistant.p3994s.p3995a.C53306j;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.o.d */
/* compiled from: PG */
public final /* synthetic */ class C19027d implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C53306j f53413a;

    public /* synthetic */ C19027d(C53306j jVar) {
        this.f53413a = jVar;
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
        C53306j jVar = this.f53413a;
        C53306j a = C53306j.m86809a(((C49109gu) obj).f127016d);
        if (a == null) {
            a = C53306j.UNKNOWNN;
        }
        return a == jVar;
    }
}
