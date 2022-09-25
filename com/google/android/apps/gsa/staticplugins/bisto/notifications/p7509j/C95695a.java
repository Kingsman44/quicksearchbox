package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.j.a */
/* compiled from: PG */
public final class C95695a extends C95705k {

    /* renamed from: a */
    public final int f267916a;

    /* renamed from: b */
    public final int f267917b;

    public C95695a(int i, int i2) {
        this.f267916a = i;
        this.f267917b = i2;
    }

    /* renamed from: a */
    public final int mo89645a() {
        return this.f267917b;
    }

    /* renamed from: b */
    public final int mo89646b() {
        return this.f267916a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C95705k) {
            C95705k kVar = (C95705k) obj;
            return this.f267916a == kVar.mo89646b() && this.f267917b == kVar.mo89645a();
        }
    }

    public final int hashCode() {
        return ((this.f267916a ^ 1000003) * 1000003) ^ this.f267917b;
    }

    public final String toString() {
        int i = this.f267916a;
        int i2 = this.f267917b;
        return "PlaybackTypeWithDebugCode{type=" + i + ", codePathIndicator=" + i2 + "}";
    }
}
