package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.p */
/* compiled from: PG */
final class C110386p extends C110363bv {

    /* renamed from: a */
    private final String f307657a;

    /* renamed from: b */
    private final boolean f307658b;

    /* renamed from: c */
    private final C58833ax f307659c;

    public C110386p(String str, boolean z, C58833ax axVar) {
        this.f307657a = str;
        this.f307658b = z;
        this.f307659c = axVar;
    }

    /* renamed from: a */
    public final C58833ax mo98596a() {
        return this.f307659c;
    }

    /* renamed from: b */
    public final String mo98597b() {
        return this.f307657a;
    }

    /* renamed from: c */
    public final boolean mo98598c() {
        return this.f307658b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C110363bv) {
            C110363bv bvVar = (C110363bv) obj;
            return this.f307657a.equals(bvVar.mo98597b()) && this.f307658b == bvVar.mo98598c() && this.f307659c.equals(bvVar.mo98596a());
        }
    }

    public final int hashCode() {
        return ((((this.f307657a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f307658b ? 1237 : 1231)) * 1000003) ^ this.f307659c.hashCode();
    }

    public final String toString() {
        String str = this.f307657a;
        boolean z = this.f307658b;
        String valueOf = String.valueOf(this.f307659c);
        return "PhotoPage{primaryPhotoUrl=" + str + ", isPortrait=" + z + ", relatedPhotoUrl=" + valueOf + "}";
    }
}
