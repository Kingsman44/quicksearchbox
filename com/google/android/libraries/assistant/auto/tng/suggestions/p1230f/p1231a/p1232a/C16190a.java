package com.google.android.libraries.assistant.auto.tng.suggestions.p1230f.p1231a.p1232a;

import com.google.android.libraries.assistant.auto.tng.common.p909f.p913b.p915b.C13262b;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.f.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C16190a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f47751a;

    public /* synthetic */ C16190a(String str) {
        this.f47751a = str;
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
        return this.f47751a.equals(((C13262b) obj).f40948d);
    }
}
