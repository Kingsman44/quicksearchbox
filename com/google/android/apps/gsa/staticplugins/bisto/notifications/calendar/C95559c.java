package com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.calendar.c */
/* compiled from: PG */
final class C95559c extends C95566j {

    /* renamed from: a */
    private final String f267434a;

    /* renamed from: b */
    private final String f267435b;

    /* renamed from: c */
    private final int f267436c;

    public C95559c(String str, String str2, int i) {
        if (str != null) {
            this.f267434a = str;
            if (str2 != null) {
                this.f267435b = str2;
                this.f267436c = i;
                return;
            }
            throw new NullPointerException("Null email");
        }
        throw new NullPointerException("Null name");
    }

    /* renamed from: a */
    public final int mo89470a() {
        return this.f267436c;
    }

    /* renamed from: b */
    public final String mo89471b() {
        return this.f267435b;
    }

    /* renamed from: c */
    public final String mo89472c() {
        return this.f267434a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C95566j) {
            C95566j jVar = (C95566j) obj;
            return this.f267434a.equals(jVar.mo89472c()) && this.f267435b.equals(jVar.mo89471b()) && this.f267436c == jVar.mo89470a();
        }
    }

    public final int hashCode() {
        return ((((this.f267434a.hashCode() ^ 1000003) * 1000003) ^ this.f267435b.hashCode()) * 1000003) ^ this.f267436c;
    }

    public final String toString() {
        String str = this.f267434a;
        String str2 = this.f267435b;
        int i = this.f267436c;
        return "AttendeeInfo{name=" + str + ", email=" + str2 + ", status=" + i + "}";
    }
}
