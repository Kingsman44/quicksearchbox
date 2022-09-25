package com.google.android.apps.search.assistant.verticals.calendar.localcalendar;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.ba */
/* compiled from: PG */
public final /* synthetic */ class C131976ba implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C131976ba f360316a = new C131976ba();

    private /* synthetic */ C131976ba() {
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
        return !((String) obj).isEmpty();
    }
}
