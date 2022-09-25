package com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar;

import android.database.Cursor;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar.l */
/* compiled from: PG */
abstract class C95568l {
    /* renamed from: j */
    static C95568l m158211j(long j, Cursor cursor) {
        return new C95561e(j, C95571o.m158230c(cursor, "title"), C95571o.m158230c(cursor, "description"), C95571o.m158230c(cursor, "eventLocation"), C95571o.m158228a(cursor, "eventStatus"), C95571o.m158231e(cursor, "isOrganizer"), C95571o.m158231e(cursor, "allDay"), C95571o.m158231e(cursor, "deleted"), C95571o.m158231e(cursor, "visible"));
    }

    /* renamed from: k */
    static String[] m158212k() {
        return new String[]{"title", "description", "eventLocation", "eventStatus", "isOrganizer", "allDay", "deleted", "visible"};
    }

    /* renamed from: a */
    public abstract int mo89480a();

    /* renamed from: b */
    public abstract long mo89481b();

    /* renamed from: c */
    public abstract String mo89482c();

    /* renamed from: d */
    public abstract String mo89483d();

    /* renamed from: e */
    public abstract String mo89484e();

    /* renamed from: f */
    public abstract boolean mo89486f();

    /* renamed from: g */
    public abstract boolean mo89487g();

    /* renamed from: h */
    public abstract boolean mo89488h();

    /* renamed from: i */
    public abstract boolean mo89490i();
}
