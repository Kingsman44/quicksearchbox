package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16344ar;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.j */
/* compiled from: PG */
public final /* synthetic */ class C16694j implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C16694j f48864a = new C16694j();

    private /* synthetic */ C16694j() {
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
        return (arVar.f48116a & 1) != 0 && !arVar.f48119d;
    }
}
