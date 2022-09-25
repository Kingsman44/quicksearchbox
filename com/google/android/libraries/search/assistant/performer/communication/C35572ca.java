package com.google.android.libraries.search.assistant.performer.communication;

import com.google.assistant.p3897e.p3921j.C52619yl;
import com.google.assistant.p3897e.p3921j.C52625yr;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.ca */
/* compiled from: PG */
public final /* synthetic */ class C35572ca implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Optional f93392a;

    public /* synthetic */ C35572ca(Optional optional) {
        this.f93392a = optional;
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
        Optional optional = this.f93392a;
        C52625yr yrVar = C35573cb.f93393a;
        return C35573cb.m63951b((String) optional.get()).equals(C35573cb.m63951b(((C52619yl) obj).f138153c));
    }
}
