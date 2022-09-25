package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.eu */
/* compiled from: PG */
public final class C82427eu extends C82657nh {

    /* renamed from: a */
    private final String f225215a = "NGA_SODA_EVENT_TYPE";

    /* renamed from: b */
    private final int f225216b;

    /* renamed from: c */
    private final String f225217c;

    public C82427eu(String str, int i, String str2) {
        this.f225216b = i;
        this.f225217c = str2;
    }

    /* renamed from: b */
    public final int mo76174b() {
        return this.f225216b;
    }

    /* renamed from: c */
    public final String mo76175c() {
        return this.f225217c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225215a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82657nh) {
            C82657nh nhVar = (C82657nh) obj;
            return this.f225215a.equals(nhVar.mo75583d()) && this.f225216b == nhVar.mo76174b() && this.f225217c.equals(nhVar.mo76175c());
        }
    }

    public final int hashCode() {
        return ((((this.f225215a.hashCode() ^ 1000003) * 1000003) ^ this.f225216b) * 1000003) ^ this.f225217c.hashCode();
    }

    public final String toString() {
        String str = this.f225215a;
        int i = this.f225216b;
        String str2 = this.f225217c;
        return "NgaSodaEventTypeEvent{token=" + str + ", lpVersion=" + i + ", eventType=" + str2 + "}";
    }
}
