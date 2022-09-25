package com.google.android.libraries.search.assistant.performer.communication;

import com.google.p4500cm.p4501a.p4506b.p4507a.C58146d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.ds */
/* compiled from: PG */
public final /* synthetic */ class C35684ds implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f93573a = "contactPoint";

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
        return ((C58146d) obj).f155446b.equals(this.f93573a);
    }
}
