package com.google.android.libraries.assistant.pcp.p1555f.p1556a;

import com.google.android.libraries.assistant.pcp.p1583o.C19041r;
import com.google.assistant.p3803ag.p3809c.C49019dl;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.pcp.f.a.k */
/* compiled from: PG */
public final /* synthetic */ class C18688k implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58495hd f52730a;

    /* renamed from: b */
    public final /* synthetic */ C49019dl f52731b;

    public /* synthetic */ C18688k(C58495hd hdVar, C49019dl dlVar) {
        this.f52730a = hdVar;
        this.f52731b = dlVar;
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
        C53306j jVar = (C53306j) obj;
        return !this.f52730a.containsKey(jVar) && !C19041r.m36462e(this.f52731b, jVar);
    }
}
