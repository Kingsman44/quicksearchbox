package com.google.android.apps.search.assistant.verticals.calendar.localcalendar;

import com.google.android.apps.search.assistant.verticals.calendar.localcalendar.p10037a.C131947b;
import java.util.Comparator;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.q */
/* compiled from: PG */
public final /* synthetic */ class C132015q implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C132015q f360359a = new C132015q();

    private /* synthetic */ C132015q() {
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
        Comparator comparator = C132021w.f360364a;
        return !C131948aa.m214405c((C131947b) obj);
    }
}
