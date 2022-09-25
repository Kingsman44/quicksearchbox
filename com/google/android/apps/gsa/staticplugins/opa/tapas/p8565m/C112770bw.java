package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113320q;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113321r;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.bw */
/* compiled from: PG */
public final /* synthetic */ class C112770bw implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C112770bw f312566a = new C112770bw();

    private /* synthetic */ C112770bw() {
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
        C113321r rVar = (C113321r) obj;
        C113320q a = C113320q.m187477a(rVar.f313837d);
        if (a == null) {
            a = C113320q.UNRECOGNIZED;
        }
        return a == C113320q.CALL && rVar.f313839f.equals("vnd.android.cursor.item/phone_v2");
    }
}
