package com.google.android.libraries.assistant.auto.ondevice;

import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52083ep;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.c */
/* compiled from: PG */
public final /* synthetic */ class C11870c implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C11870c f38215a = new C11870c();

    private /* synthetic */ C11870c() {
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
        C52078ek ekVar;
        C52083ep epVar = (C52083ep) obj;
        if (epVar.f136692b == 3) {
            ekVar = (C52078ek) epVar.f136693c;
        } else {
            ekVar = C52078ek.f136671f;
        }
        return ekVar.f136674b == 5;
    }
}
