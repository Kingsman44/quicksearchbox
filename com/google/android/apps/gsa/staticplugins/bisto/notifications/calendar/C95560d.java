package com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar.d */
/* compiled from: PG */
final class C95560d extends C95567k {

    /* renamed from: a */
    private final String f267437a;

    public C95560d(String str) {
        if (str != null) {
            this.f267437a = str;
            return;
        }
        throw new NullPointerException("Null accountName");
    }

    /* renamed from: a */
    public final String mo89476a() {
        return this.f267437a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C95567k) {
            return this.f267437a.equals(((C95567k) obj).mo89476a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f267437a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f267437a;
        return "CalendarInfo{accountName=" + str + "}";
    }
}
