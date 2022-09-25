package com.google.android.apps.gsa.nga.engine.p6246w;

import p3186j$.time.DayOfWeek;
import p3186j$.time.format.DateTimeFormatter;
import p3186j$.time.temporal.ChronoField;
import p3186j$.util.function.ToIntFunction;

/* renamed from: com.google.android.apps.gsa.nga.engine.w.c */
/* compiled from: PG */
public final /* synthetic */ class C79400c implements ToIntFunction {

    /* renamed from: a */
    public static final /* synthetic */ C79400c f218033a = new C79400c();

    private /* synthetic */ C79400c() {
    }

    public final int applyAsInt(Object obj) {
        DateTimeFormatter dateTimeFormatter = C79402e.f218035a;
        return ((DayOfWeek) obj).get(ChronoField.DAY_OF_WEEK) - 1;
    }
}
