package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e;

import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.e.a */
/* compiled from: PG */
public final class C131232a extends C131233b {

    /* renamed from: a */
    public final long f358863a;

    /* renamed from: b */
    public final Instant f358864b;

    /* renamed from: c */
    public final Instant f358865c;

    /* renamed from: d */
    public final String f358866d;

    /* renamed from: e */
    public final boolean f358867e;

    public C131232a(long j, Instant instant, Instant instant2, String str, boolean z) {
        this.f358863a = j;
        if (instant != null) {
            this.f358864b = instant;
            if (instant2 != null) {
                this.f358865c = instant2;
                if (str != null) {
                    this.f358866d = str;
                    this.f358867e = z;
                    return;
                }
                throw new NullPointerException("Null title");
            }
            throw new NullPointerException("Null calendarEndTime");
        }
        throw new NullPointerException("Null calendarStartTime");
    }

    /* renamed from: a */
    public final Instant mo110121a() {
        return this.f358865c;
    }

    /* renamed from: b */
    public final Instant mo110122b() {
        return this.f358864b;
    }

    /* renamed from: c */
    public final String mo110123c() {
        return this.f358866d;
    }

    public final String toString() {
        long j = this.f358863a;
        String obj = this.f358864b.toString();
        String obj2 = this.f358865c.toString();
        String str = this.f358866d;
        boolean z = this.f358867e;
        return "CalendarDedup{providerId=" + j + ", calendarStartTime=" + obj + ", calendarEndTime=" + obj2 + ", title=" + str + ", isGmailIntelligenceInferred=" + z + "}";
    }
}
