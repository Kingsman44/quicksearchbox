package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p836c;

import android.app.DirectAction;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.c.c */
/* compiled from: PG */
public final /* synthetic */ class C12756c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f39905a;

    public /* synthetic */ C12756c(String str) {
        this.f39905a = str;
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
        String str = this.f39905a;
        int i = C12757d.f39906b;
        return ((DirectAction) obj).getId().equals(str);
    }
}
