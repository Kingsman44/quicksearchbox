package com.google.android.apps.gsa.staticplugins.nga.p8065h;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.d */
/* compiled from: PG */
final class C103275d extends C103217aj {

    /* renamed from: a */
    private final String f288063a;

    /* renamed from: b */
    private final int f288064b;

    public C103275d(String str, int i) {
        if (str != null) {
            this.f288063a = str;
            this.f288064b = i;
            return;
        }
        throw new NullPointerException("Null name");
    }

    /* renamed from: a */
    public final int mo93715a() {
        return this.f288064b;
    }

    /* renamed from: b */
    public final String mo93716b() {
        return this.f288063a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C103217aj) {
            C103217aj ajVar = (C103217aj) obj;
            return this.f288063a.equals(ajVar.mo93716b()) && this.f288064b == ajVar.mo93715a();
        }
    }

    public final int hashCode() {
        return ((this.f288063a.hashCode() ^ 1000003) * 1000003) ^ this.f288064b;
    }

    public final String toString() {
        String str = this.f288063a;
        int i = this.f288064b;
        return "IcingContact{name=" + str + ", documentId=" + i + "}";
    }
}
