package com.google.android.apps.gsa.nga.engine.understanding.teleport;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.o */
/* compiled from: PG */
final class C79317o extends C79309g {

    /* renamed from: a */
    public final int f217816a;

    /* renamed from: b */
    public final int f217817b;

    public C79317o(int i, int i2) {
        this.f217816a = i;
        this.f217817b = i2;
    }

    /* renamed from: a */
    public final int mo73868a() {
        return this.f217817b;
    }

    /* renamed from: b */
    public final int mo73869b() {
        return this.f217816a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C79309g) {
            C79309g gVar = (C79309g) obj;
            return this.f217816a == gVar.mo73869b() && this.f217817b == gVar.mo73868a();
        }
    }

    public final int hashCode() {
        return ((this.f217816a ^ 1000003) * 1000003) ^ this.f217817b;
    }

    public final String toString() {
        int i = this.f217816a;
        int i2 = this.f217817b;
        return "AnnotatedStringRange{start=" + i + ", end=" + i2 + "}";
    }
}
