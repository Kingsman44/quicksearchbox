package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.c */
/* compiled from: PG */
public final class C131073c extends C131074d {

    /* renamed from: a */
    public final Boolean f358527a;

    /* renamed from: b */
    public final Boolean f358528b;

    /* renamed from: c */
    public final Long f358529c;

    public C131073c(Boolean bool, Boolean bool2, Long l) {
        this.f358527a = bool;
        this.f358528b = bool2;
        this.f358529c = l;
    }

    /* renamed from: a */
    public final Boolean mo110033a() {
        return this.f358528b;
    }

    /* renamed from: b */
    public final Boolean mo110034b() {
        return this.f358527a;
    }

    /* renamed from: c */
    public final Long mo110035c() {
        return this.f358529c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C131074d) {
            C131074d dVar = (C131074d) obj;
            return this.f358527a.equals(dVar.mo110034b()) && this.f358528b.equals(dVar.mo110033a()) && this.f358529c.equals(dVar.mo110035c());
        }
    }

    public final int hashCode() {
        return ((((this.f358527a.hashCode() ^ 1000003) * 1000003) ^ this.f358528b.hashCode()) * 1000003) ^ this.f358529c.hashCode();
    }

    public final String toString() {
        Boolean bool = this.f358527a;
        Boolean bool2 = this.f358528b;
        Long l = this.f358529c;
        return "AppSuggestionConfig{enableV1AppSuggestions=" + bool + ", enableUsingDeviceType=" + bool2 + ", deviceTypeUsageThreshold=" + l + "}";
    }
}
