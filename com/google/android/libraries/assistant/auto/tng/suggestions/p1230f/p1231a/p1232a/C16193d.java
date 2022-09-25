package com.google.android.libraries.assistant.auto.tng.suggestions.p1230f.p1231a.p1232a;

import android.text.TextUtils;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.f.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C16193d implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C16193d f47754a = new C16193d();

    private /* synthetic */ C16193d() {
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
