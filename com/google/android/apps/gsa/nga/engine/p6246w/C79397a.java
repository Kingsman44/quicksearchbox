package com.google.android.apps.gsa.nga.engine.p6246w;

import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import java.util.Locale;
import p3186j$.time.DayOfWeek;
import p3186j$.time.ZonedDateTime;
import p3186j$.time.format.DateTimeFormatter;
import p3186j$.util.DesugarDate;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.w.a */
/* compiled from: PG */
public final /* synthetic */ class C79397a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ ZonedDateTime f218030a;

    /* renamed from: b */
    public final /* synthetic */ Locale f218031b;

    public /* synthetic */ C79397a(ZonedDateTime zonedDateTime, Locale locale) {
        this.f218030a = zonedDateTime;
        this.f218031b = locale;
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
        ZonedDateTime zonedDateTime = this.f218030a;
        Locale locale = this.f218031b;
        DateTimeFormatter dateTimeFormatter = C79402e.f218035a;
        ZonedDateTime with = zonedDateTime.mo43046d((DayOfWeek) obj);
        TimeZone timeZone = TimeZone.getTimeZone(with.getZone().getId());
        return Calendar.getInstance(timeZone, locale).isWeekend(DesugarDate.from(with.toInstant()));
    }
}
