package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122430bv;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.bi */
/* compiled from: PG */
public final /* synthetic */ class C122742bi implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C122742bi f340057a = new C122742bi();

    private /* synthetic */ C122742bi() {
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
        int i = ((C122430bv) obj).f339421a;
        return i == 1 || i == 2 || i == 4;
    }
}
