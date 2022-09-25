package com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1122b.p1123a;

import android.text.TextUtils;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.a.b.a.h */
/* compiled from: PG */
public final /* synthetic */ class C15545h implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C15545h f46527a = new C15545h();

    private /* synthetic */ C15545h() {
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
