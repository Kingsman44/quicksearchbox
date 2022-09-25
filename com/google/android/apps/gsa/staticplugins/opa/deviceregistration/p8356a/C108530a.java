package com.google.android.apps.gsa.staticplugins.opa.deviceregistration.p8356a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.a.a */
/* compiled from: PG */
public final class C108530a extends C108531b {

    /* renamed from: a */
    private final String f301949a;

    /* renamed from: b */
    private final String f301950b;

    public C108530a(String str, String str2) {
        this.f301949a = str;
        if (str2 != null) {
            this.f301950b = str2;
            return;
        }
        throw new NullPointerException("Null name");
    }

    /* renamed from: a */
    public final String mo96965a() {
        return this.f301949a;
    }

    /* renamed from: b */
    public final String mo96966b() {
        return this.f301950b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C108531b) {
            C108531b bVar = (C108531b) obj;
            String str = this.f301949a;
            if (str != null ? str.equals(bVar.mo96965a()) : bVar.mo96965a() == null) {
                if (this.f301950b.equals(bVar.mo96966b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.f301949a;
        String str2 = this.f301950b;
        return "Room{id=" + str + ", name=" + str2 + "}";
    }

    public final int hashCode() {
        int i;
        String str = this.f301949a;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return ((i ^ 1000003) * 1000003) ^ this.f301950b.hashCode();
    }
}
