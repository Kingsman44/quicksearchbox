package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.hd */
/* compiled from: PG */
public final class C82491hd extends C82720pq {

    /* renamed from: a */
    private final String f225400a = "PUSH_TO_TALK_STATUS";

    /* renamed from: b */
    private final String f225401b;

    public C82491hd(String str, String str2) {
        this.f225401b = str2;
    }

    /* renamed from: b */
    public final String mo76453b() {
        return this.f225401b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225400a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82720pq) {
            C82720pq pqVar = (C82720pq) obj;
            return this.f225400a.equals(pqVar.mo75583d()) && this.f225401b.equals(pqVar.mo76453b());
        }
    }

    public final int hashCode() {
        return ((this.f225400a.hashCode() ^ 1000003) * 1000003) ^ this.f225401b.hashCode();
    }

    public final String toString() {
        String str = this.f225400a;
        String str2 = this.f225401b;
        return "PushToTalkStatusEvent{token=" + str + ", status=" + str2 + "}";
    }
}
