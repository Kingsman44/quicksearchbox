package com.google.android.apps.gsa.staticplugins.opa.p8375l.p8376a;

import com.google.assistant.p4008y.p4009a.C53552al;
import com.google.assistant.p4008y.p4009a.C53556ap;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.a.a */
/* compiled from: PG */
public final /* synthetic */ class C109366a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C53556ap f304650a;

    public /* synthetic */ C109366a(C53556ap apVar) {
        this.f304650a = apVar;
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
        C53556ap apVar = this.f304650a;
        C53556ap b = C53556ap.m86865b(((C53552al) obj).f140544d);
        if (b == null) {
            b = C53556ap.NONE;
        }
        return b.equals(apVar);
    }
}
