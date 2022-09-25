package com.google.android.libraries.assistant.p1363c.p1371b.p1379f;

import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.c.b.f.v */
/* compiled from: PG */
public final /* synthetic */ class C17159v implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Locale f49866a;

    public /* synthetic */ C17159v(Locale locale) {
        this.f49866a = locale;
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
        Locale locale = this.f49866a;
        String str = (String) obj;
        if (!C17161x.m34313b(str)) {
            return false;
        }
        return C17161x.m34312a(str, locale).isPresent();
    }
}
