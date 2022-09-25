package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p624a;

import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45632al;
import p3186j$.util.Collection;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.a.ar */
/* compiled from: PG */
public final /* synthetic */ class C11082ar implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f36361a;

    public /* synthetic */ C11082ar(String str) {
        this.f36361a = str;
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
        return Collection.EL.stream(((C45632al) obj).f120026d).anyMatch(new C11097bf(this.f36361a));
    }
}
