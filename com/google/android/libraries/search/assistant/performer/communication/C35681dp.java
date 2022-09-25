package com.google.android.libraries.search.assistant.performer.communication;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.dp */
/* compiled from: PG */
public final /* synthetic */ class C35681dp implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C35681dp f93570a = new C35681dp();

    private /* synthetic */ C35681dp() {
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
        return !((String) obj).isEmpty();
    }
}
