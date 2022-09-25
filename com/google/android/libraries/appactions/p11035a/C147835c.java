package com.google.android.libraries.appactions.p11035a;

import com.google.android.libraries.appactions.p11035a.p11036a.C147817b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.appactions.a.c */
/* compiled from: PG */
public final /* synthetic */ class C147835c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f398849a;

    public /* synthetic */ C147835c(String str) {
        this.f398849a = str;
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
        return ((C147817b) obj).mo124484g().equals(this.f398849a);
    }
}
