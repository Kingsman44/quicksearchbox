package com.google.android.libraries.search.assistant.notification.data.p2713a;

import com.google.android.libraries.search.assistant.notification.data.MessageNotification;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.notification.data.a.e */
/* compiled from: PG */
public final /* synthetic */ class C34877e implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C34877e f92511a = new C34877e();

    private /* synthetic */ C34877e() {
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
        return ((MessageNotification) obj).mo39557n().isPresent();
    }
}
