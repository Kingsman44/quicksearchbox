package com.google.android.libraries.search.assistant.performer.communication;

import android.text.TextUtils;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.ez */
/* compiled from: PG */
public final /* synthetic */ class C35730ez implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C35730ez f93641a = new C35730ez();

    private /* synthetic */ C35730ez() {
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
        String str = (String) obj;
        return !TextUtils.isEmpty(str) && str.endsWith("@s.whatsapp.net");
    }
}
