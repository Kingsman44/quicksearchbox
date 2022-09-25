package com.google.android.libraries.search.assistant.performer.communication;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.bx */
/* compiled from: PG */
public final /* synthetic */ class C35565bx implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C35565bx f93383a = new C35565bx();

    private /* synthetic */ C35565bx() {
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
        return ((Optional) obj).isPresent();
    }
}
