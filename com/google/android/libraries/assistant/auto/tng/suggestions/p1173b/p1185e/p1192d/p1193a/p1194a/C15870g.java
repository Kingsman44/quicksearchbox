package com.google.android.libraries.assistant.auto.tng.suggestions.p1173b.p1185e.p1192d.p1193a.p1194a;

import android.service.notification.StatusBarNotification;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.b.e.d.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C15870g implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C15870g f47132a = new C15870g();

    private /* synthetic */ C15870g() {
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
        return !C15871h.m32660h((StatusBarNotification) obj);
    }
}
