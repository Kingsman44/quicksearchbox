package com.google.android.libraries.assistant.auto.tng.p1272t.p1273a.p1274a;

import android.text.TextUtils;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.t.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C16450g implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C16450g f48357a = new C16450g();

    private /* synthetic */ C16450g() {
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
