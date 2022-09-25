package com.google.android.libraries.search.assistant.proactive;

import android.service.notification.StatusBarNotification;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.proactive.at */
/* compiled from: PG */
public final /* synthetic */ class C36224at implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C36224at f94631a = new C36224at();

    private /* synthetic */ C36224at() {
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
        return (((StatusBarNotification) obj).getNotification().flags & 512) == 0;
    }
}
