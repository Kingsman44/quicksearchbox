package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.n */
/* compiled from: PG */
final class C110384n extends C110339ay {

    /* renamed from: a */
    public final int f307651a;

    /* renamed from: b */
    public final String f307652b;

    public C110384n(int i, String str) {
        this.f307651a = i;
        if (str != null) {
            this.f307652b = str;
            return;
        }
        throw new NullPointerException("Null displayId");
    }

    /* renamed from: a */
    public final int mo98578a() {
        return this.f307651a;
    }

    /* renamed from: b */
    public final String mo98579b() {
        return this.f307652b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C110339ay) {
            C110339ay ayVar = (C110339ay) obj;
            return this.f307651a == ayVar.mo98578a() && this.f307652b.equals(ayVar.mo98579b());
        }
    }

    public final int hashCode() {
        return ((this.f307651a ^ 1000003) * 1000003) ^ this.f307652b.hashCode();
    }

    public final String toString() {
        int i = this.f307651a;
        String str = this.f307652b;
        return "SettingKey{settingId=" + i + ", displayId=" + str + "}";
    }
}
