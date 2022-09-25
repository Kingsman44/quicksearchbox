package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import com.google.p337aa.C6619f;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.ba */
/* compiled from: PG */
public final /* synthetic */ class C138958ba implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Optional f377914a;

    public /* synthetic */ C138958ba(Optional optional) {
        this.f377914a = optional;
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
        return C62953e.m95476a(C62953e.m95484i(((C6619f) obj).f19679c), (C63042fg) this.f377914a.get()) > 0;
    }
}
