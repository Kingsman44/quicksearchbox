package com.google.android.apps.gsa.nga.engine.p6246w;

import java.util.Comparator;
import p3186j$.time.DayOfWeek;
import p3186j$.time.format.DateTimeFormatter;
import p3186j$.time.temporal.TemporalField;

/* renamed from: com.google.android.apps.gsa.nga.engine.w.b */
/* compiled from: PG */
public final /* synthetic */ class C79399b implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ TemporalField f218032a;

    public /* synthetic */ C79399b(TemporalField temporalField) {
        this.f218032a = temporalField;
    }

    public final int compare(Object obj, Object obj2) {
        TemporalField temporalField = this.f218032a;
        DateTimeFormatter dateTimeFormatter = C79402e.f218035a;
        return (int) (((DayOfWeek) obj).getLong(temporalField) - ((DayOfWeek) obj2).getLong(temporalField));
    }
}
