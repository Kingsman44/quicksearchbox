package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.gb */
/* compiled from: PG */
public final class C82462gb extends C82691oo {

    /* renamed from: a */
    private final String f225318a = "NGA_WARM_ACTIONS_EVENT_COUNT";

    /* renamed from: b */
    private final int f225319b;

    /* renamed from: c */
    private final String f225320c;

    public C82462gb(String str, int i, String str2) {
        this.f225319b = i;
        this.f225320c = str2;
    }

    /* renamed from: b */
    public final int mo76326b() {
        return this.f225319b;
    }

    /* renamed from: c */
    public final String mo76327c() {
        return this.f225320c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225318a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82691oo) {
            C82691oo ooVar = (C82691oo) obj;
            return this.f225318a.equals(ooVar.mo75583d()) && this.f225319b == ooVar.mo76326b() && this.f225320c.equals(ooVar.mo76327c());
        }
    }

    public final int hashCode() {
        return ((((this.f225318a.hashCode() ^ 1000003) * 1000003) ^ this.f225319b) * 1000003) ^ this.f225320c.hashCode();
    }

    public final String toString() {
        String str = this.f225318a;
        int i = this.f225319b;
        String str2 = this.f225320c;
        return "NgaWarmActionsEventCountEvent{token=" + str + ", contextType=" + i + ", status=" + str2 + "}";
    }
}
