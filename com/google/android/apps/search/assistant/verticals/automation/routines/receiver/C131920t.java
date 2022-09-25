package com.google.android.apps.search.assistant.verticals.automation.routines.receiver;

import java.util.List;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.receiver.t */
/* compiled from: PG */
public final /* synthetic */ class C131920t implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C131920t f360204a = new C131920t();

    private /* synthetic */ C131920t() {
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
        return ((List) obj) != null;
    }
}
