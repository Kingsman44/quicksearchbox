package com.google.android.libraries.search.assistant.proactive;

import android.service.notification.StatusBarNotification;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.proactive.as */
/* compiled from: PG */
public final /* synthetic */ class C36223as implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f94630a;

    public /* synthetic */ C36223as(String str) {
        this.f94630a = str;
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
        return this.f94630a.equals(((StatusBarNotification) obj).getNotification().getGroup());
    }
}
