package com.google.android.gms.car.p10760f;

/* renamed from: com.google.android.gms.car.f.bs */
/* compiled from: PG */
public final class C143285bs {

    /* renamed from: a */
    public final String f388496a;

    /* renamed from: b */
    public final int f388497b;

    public C143285bs(String str, int i) {
        this.f388496a = str;
        this.f388497b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C143285bs)) {
            return false;
        }
        C143285bs bsVar = (C143285bs) obj;
        return this.f388497b == bsVar.f388497b && this.f388496a.equals(bsVar.f388496a);
    }

    public final int hashCode() {
        return (this.f388496a.hashCode() * 31) + this.f388497b;
    }

    public final String toString() {
        String str = this.f388496a;
        int i = this.f388497b;
        return "PackageInfoSpec{packageName='" + str + "', versionCode=" + i + "}";
    }
}
