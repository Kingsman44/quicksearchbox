package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import com.google.p337aa.C6619f;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.bd */
/* compiled from: PG */
public final /* synthetic */ class C138961bd implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C63042fg f377917a;

    public /* synthetic */ C138961bd(C63042fg fgVar) {
        this.f377917a = fgVar;
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
        C6619f fVar = (C6619f) obj;
        return C62953e.m95476a(C62953e.m95484i(fVar.f19679c), this.f377917a) > 0 && fVar.f19680d;
    }
}
