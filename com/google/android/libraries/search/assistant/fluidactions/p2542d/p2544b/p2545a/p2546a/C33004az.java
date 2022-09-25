package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45626af;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.az */
/* compiled from: PG */
public final /* synthetic */ class C33004az implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f88401a;

    public /* synthetic */ C33004az(String str) {
        this.f88401a = str;
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
        return ((C45626af) obj).f120006c.equals(this.f88401a);
    }
}
