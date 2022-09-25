package com.google.android.libraries.search.assistant.performer.communication;

import android.telephony.PhoneNumberUtils;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.dn */
/* compiled from: PG */
public final /* synthetic */ class C35679dn implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C35679dn f93568a = new C35679dn();

    private /* synthetic */ C35679dn() {
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
        return !PhoneNumberUtils.normalizeNumber((String) obj).isEmpty();
    }
}
