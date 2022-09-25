package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.gs */
/* compiled from: PG */
public final class C82479gs extends C82709pf {

    /* renamed from: a */
    private final String f225365a = "NGA_WINNING_UNDERSTANDING";

    /* renamed from: b */
    private final int f225366b;

    /* renamed from: c */
    private final int f225367c;

    public C82479gs(String str, int i, int i2) {
        this.f225366b = i;
        this.f225367c = i2;
    }

    /* renamed from: b */
    public final int mo76407b() {
        return this.f225367c;
    }

    /* renamed from: c */
    public final int mo76408c() {
        return this.f225366b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225365a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82709pf) {
            C82709pf pfVar = (C82709pf) obj;
            return this.f225365a.equals(pfVar.mo75583d()) && this.f225366b == pfVar.mo76408c() && this.f225367c == pfVar.mo76407b();
        }
    }

    public final int hashCode() {
        return ((((this.f225365a.hashCode() ^ 1000003) * 1000003) ^ this.f225366b) * 1000003) ^ this.f225367c;
    }

    public final String toString() {
        String str = this.f225365a;
        int i = this.f225366b;
        int i2 = this.f225367c;
        return "NgaWinningUnderstandingEvent{token=" + str + ", rewriter=" + i + ", intentGenerator=" + i2 + "}";
    }
}
