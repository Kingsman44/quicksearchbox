package com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar;

import android.os.Parcelable;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: PG */
public abstract class AnnounceableEvent implements Parcelable {
    static {
        Parcelable.Creator creator = AutoValue_AnnounceableEvent.CREATOR;
    }

    /* renamed from: g */
    public static AnnounceableEvent m158167g(long j, long j2, String str, String str2, String str3, long j3) {
        return new AutoValue_AnnounceableEvent(j, j2, str, str2, str3, j3);
    }

    /* renamed from: a */
    public abstract long mo89448a();

    /* renamed from: b */
    public abstract long mo89449b();

    /* renamed from: c */
    public abstract long mo89450c();

    /* renamed from: d */
    public abstract String mo89451d();

    /* renamed from: e */
    public abstract String mo89452e();

    /* renamed from: f */
    public abstract String mo89454f();

    public final String toString() {
        return String.format(Locale.getDefault(), "Event #%d (instance #%d): '%s', starts @ %s\n\tLocation: %s\n\tDescription: %s", new Object[]{Long.valueOf(mo89448a()), Long.valueOf(mo89449b()), mo89454f(), DateFormat.getDateTimeInstance().format(new Date(mo89450c())), mo89452e(), mo89451d()});
    }
}
