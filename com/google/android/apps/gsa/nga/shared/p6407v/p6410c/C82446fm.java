package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.fm */
/* compiled from: PG */
public final class C82446fm extends C82675nz {

    /* renamed from: a */
    private final String f225278a = "NGA_UNDERSTANDING_EMPTY_INTENT";

    /* renamed from: b */
    private final int f225279b;

    public C82446fm(String str, int i) {
        this.f225279b = i;
    }

    /* renamed from: b */
    public final int mo76260b() {
        return this.f225279b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225278a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82675nz) {
            C82675nz nzVar = (C82675nz) obj;
            return this.f225278a.equals(nzVar.mo75583d()) && this.f225279b == nzVar.mo76260b();
        }
    }

    public final int hashCode() {
        return ((this.f225278a.hashCode() ^ 1000003) * 1000003) ^ this.f225279b;
    }

    public final String toString() {
        String str = this.f225278a;
        int i = this.f225279b;
        return "NgaUnderstandingEmptyIntentEvent{token=" + str + ", intentGenerator=" + i + "}";
    }
}
