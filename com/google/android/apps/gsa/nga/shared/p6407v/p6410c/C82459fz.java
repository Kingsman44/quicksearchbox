package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.fz */
/* compiled from: PG */
final class C82459fz extends C82689om {

    /* renamed from: a */
    private final String f225309a;

    /* renamed from: b */
    private final int f225310b;

    /* renamed from: c */
    private final String f225311c;

    public C82459fz(String str, int i, String str2) {
        this.f225309a = str;
        this.f225310b = i;
        this.f225311c = str2;
    }

    /* renamed from: b */
    public final int mo76313b() {
        return this.f225310b;
    }

    /* renamed from: c */
    public final String mo76314c() {
        return this.f225311c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225309a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82689om) {
            C82689om omVar = (C82689om) obj;
            return this.f225309a.equals(omVar.mo75583d()) && this.f225310b == omVar.mo76313b() && this.f225311c.equals(omVar.mo76314c());
        }
    }

    public final int hashCode() {
        return ((((this.f225309a.hashCode() ^ 1000003) * 1000003) ^ this.f225310b) * 1000003) ^ this.f225311c.hashCode();
    }

    public final String toString() {
        String str = this.f225309a;
        int i = this.f225310b;
        String str2 = this.f225311c;
        return "NgaWarmActionsContextEventDroppedEvent{token=" + str + ", contextType=" + i + ", reason=" + str2 + "}";
    }
}
