package com.google.android.apps.search.assistant.verticals.calendar.localcalendar;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.ah */
/* compiled from: PG */
public final /* synthetic */ class C131955ah implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f360281a;

    public /* synthetic */ C131955ah(String str) {
        this.f360281a = str;
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
        return ((String) obj).startsWith(this.f360281a);
    }
}
