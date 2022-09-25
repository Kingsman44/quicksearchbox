package com.google.android.apps.gsa.staticplugins.opa.experience;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.experience.a */
/* compiled from: PG */
public final class C109013a extends C109023j {

    /* renamed from: a */
    private final String f303155a;

    public C109013a(String str) {
        if (str != null) {
            this.f303155a = str;
            return;
        }
        throw new NullPointerException("Null indicator");
    }

    /* renamed from: a */
    public final String mo97381a() {
        return this.f303155a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C109023j) {
            return this.f303155a.equals(((C109023j) obj).mo97381a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f303155a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.f303155a;
        return "BatteryStatus{indicator=" + str + "}";
    }
}
