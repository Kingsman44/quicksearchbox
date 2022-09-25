package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.fo */
/* compiled from: PG */
public final class C82448fo extends C82678ob {

    /* renamed from: a */
    private final String f225282a = "NGA_UNDERSTANDING_ERROR_INTENT";

    /* renamed from: b */
    private final int f225283b;

    public C82448fo(String str, int i) {
        this.f225283b = i;
    }

    /* renamed from: b */
    public final int mo76268b() {
        return this.f225283b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225282a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82678ob) {
            C82678ob obVar = (C82678ob) obj;
            return this.f225282a.equals(obVar.mo75583d()) && this.f225283b == obVar.mo76268b();
        }
    }

    public final int hashCode() {
        return ((this.f225282a.hashCode() ^ 1000003) * 1000003) ^ this.f225283b;
    }

    public final String toString() {
        String str = this.f225282a;
        int i = this.f225283b;
        return "NgaUnderstandingErrorIntentEvent{token=" + str + ", intentGenerator=" + i + "}";
    }
}
