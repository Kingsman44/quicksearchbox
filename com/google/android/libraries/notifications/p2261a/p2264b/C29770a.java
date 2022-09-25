package com.google.android.libraries.notifications.p2261a.p2264b;

/* renamed from: com.google.android.libraries.notifications.a.b.a */
/* compiled from: PG */
public final class C29770a extends C29773d {

    /* renamed from: a */
    public final C29774e f80673a;

    /* renamed from: b */
    private final int f80674b;

    public C29770a(C29774e eVar, int i) {
        this.f80673a = eVar;
        this.f80674b = i;
    }

    /* renamed from: a */
    public final C29774e mo34934a() {
        return this.f80673a;
    }

    /* renamed from: b */
    public final int mo34935b() {
        return this.f80674b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C29773d) {
            C29773d dVar = (C29773d) obj;
            return this.f80673a.equals(dVar.mo34934a()) && this.f80674b == dVar.mo34935b();
        }
    }

    public final int hashCode() {
        return ((this.f80673a.hashCode() ^ 1000003) * 1000003) ^ this.f80674b;
    }

    public final String toString() {
        String obj = this.f80673a.toString();
        int i = this.f80674b;
        String str = i != 1 ? i != 2 ? "NOTIFY" : "DROP" : "UNKNOWN_PREFERENCE";
        return "PreferenceEntry{preferenceKey=" + obj + ", preference=" + str + "}";
    }
}
