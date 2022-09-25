package com.google.android.apps.gsa.staticplugins.nga.p8065h;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.e */
/* compiled from: PG */
final class C103276e extends C103235ba {

    /* renamed from: a */
    private final String f288065a;

    /* renamed from: b */
    private final int f288066b;

    public C103276e(String str, int i) {
        this.f288065a = str;
        this.f288066b = i;
    }

    /* renamed from: a */
    public final int mo93719a() {
        return this.f288066b;
    }

    /* renamed from: b */
    public final String mo93720b() {
        return this.f288065a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C103235ba) {
            C103235ba baVar = (C103235ba) obj;
            return this.f288065a.equals(baVar.mo93720b()) && this.f288066b == baVar.mo93719a();
        }
    }

    public final int hashCode() {
        return ((this.f288065a.hashCode() ^ 1000003) * 1000003) ^ this.f288066b;
    }

    public final String toString() {
        String str = this.f288065a;
        int i = this.f288066b;
        return "IcingGmm{name=" + str + ", documentId=" + i + "}";
    }
}
