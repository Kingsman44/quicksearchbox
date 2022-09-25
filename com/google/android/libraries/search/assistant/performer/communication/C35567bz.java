package com.google.android.libraries.search.assistant.performer.communication;

import com.google.assistant.p3897e.p3921j.C52625yr;
import com.google.assistant.p3897e.p3921j.C52629yv;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.bz */
/* compiled from: PG */
public final /* synthetic */ class C35567bz implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Optional f93385a;

    public /* synthetic */ C35567bz(Optional optional) {
        this.f93385a = optional;
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
        Optional optional = this.f93385a;
        C52625yr yrVar = C35573cb.f93393a;
        return C35573cb.m63951b((String) optional.get()).equals(C35573cb.m63951b(((C52629yv) obj).f138185d));
    }
}
