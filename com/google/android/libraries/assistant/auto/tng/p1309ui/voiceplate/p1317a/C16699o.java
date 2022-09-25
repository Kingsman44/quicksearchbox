package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a;

import com.google.assistant.p3897e.p3921j.C52232kc;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.o */
/* compiled from: PG */
public final /* synthetic */ class C16699o implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f48870a;

    public /* synthetic */ C16699o(String str) {
        this.f48870a = str;
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
        return this.f48870a.equals(((C52232kc) obj).f137065b);
    }
}
