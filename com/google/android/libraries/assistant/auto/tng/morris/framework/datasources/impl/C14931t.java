package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16344ar;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.t */
/* compiled from: PG */
public final /* synthetic */ class C14931t implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C14931t f44868a = new C14931t();

    private /* synthetic */ C14931t() {
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
        return (arVar.f48116a & 4) == 0 || !arVar.f48119d;
    }
}
