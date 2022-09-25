package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n;

import androidx.slice.SliceItem;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.ai */
/* compiled from: PG */
public final /* synthetic */ class C131449ai implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C131449ai f359277a = new C131449ai();

    private /* synthetic */ C131449ai() {
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
        return ((SliceItem) obj).f13092b.equals("text");
    }
}
