package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16342ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16344ar;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.ae */
/* compiled from: PG */
public final /* synthetic */ class C13123ae implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C13123ae f40704a = new C13123ae();

    private /* synthetic */ C13123ae() {
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
        C16344ar arVar = (C16344ar) obj;
        int a = C16342ap.m33337a(arVar.f48118c);
        return a != 0 && a == 7 && !arVar.f48119d;
    }
}
