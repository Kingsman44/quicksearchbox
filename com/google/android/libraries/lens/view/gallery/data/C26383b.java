package com.google.android.libraries.lens.view.gallery.data;

/* renamed from: com.google.android.libraries.lens.view.gallery.data.b */
/* compiled from: PG */
final class C26383b extends C26404w {

    /* renamed from: a */
    private final long f71787a;

    /* renamed from: b */
    private final long f71788b;

    /* renamed from: c */
    private final int f71789c;

    public C26383b(long j, long j2, int i) {
        this.f71787a = j;
        this.f71788b = j2;
        this.f71789c = i;
    }

    /* renamed from: a */
    public final long mo31585a() {
        return this.f71788b;
    }

    /* renamed from: b */
    public final long mo31586b() {
        return this.f71787a;
    }

    @Deprecated
    /* renamed from: c */
    public final String mo31587c() {
        return null;
    }

    /* renamed from: d */
    public final int mo31588d() {
        return this.f71789c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26404w) {
            C26404w wVar = (C26404w) obj;
            return this.f71787a == wVar.mo31586b() && wVar.mo31587c() == null && this.f71788b == wVar.mo31585a() && this.f71789c == wVar.mo31588d();
        }
    }

    public final int hashCode() {
        long j = this.f71787a;
        long j2 = this.f71788b;
        return this.f71789c ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * -721379959) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        long j = this.f71787a;
        long j2 = this.f71788b;
        String num = Integer.toString(this.f71789c - 1);
        return "Photo{id=" + j + ", filePath=null, dateModified=" + j2 + ", category=" + num + "}";
    }
}
