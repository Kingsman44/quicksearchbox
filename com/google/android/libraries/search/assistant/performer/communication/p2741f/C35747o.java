package com.google.android.libraries.search.assistant.performer.communication.p2741f;

import android.text.TextUtils;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.f.o */
/* compiled from: PG */
public final /* synthetic */ class C35747o implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C35747o f93674a = new C35747o();

    private /* synthetic */ C35747o() {
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
        return !TextUtils.isEmpty((String) obj);
    }
}
