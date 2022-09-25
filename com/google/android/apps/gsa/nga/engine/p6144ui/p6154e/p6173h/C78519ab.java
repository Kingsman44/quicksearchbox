package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.ab */
/* compiled from: PG */
final class C78519ab extends C78540aw {

    /* renamed from: b */
    private final C78534aq f216260b;

    /* renamed from: c */
    private final C78531an f216261c;

    /* renamed from: d */
    private final C78538au f216262d;

    public C78519ab(C78534aq aqVar, C78531an anVar, C78538au auVar) {
        this.f216260b = aqVar;
        this.f216261c = anVar;
        this.f216262d = auVar;
    }

    /* renamed from: a */
    public final C78531an mo73435a() {
        return this.f216261c;
    }

    /* renamed from: b */
    public final C78534aq mo73436b() {
        return this.f216260b;
    }

    /* renamed from: c */
    public final C78538au mo73437c() {
        return this.f216262d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78540aw) {
            C78540aw awVar = (C78540aw) obj;
            return this.f216260b.equals(awVar.mo73436b()) && this.f216261c.equals(awVar.mo73435a()) && this.f216262d.equals(awVar.mo73437c());
        }
    }

    public final int hashCode() {
        return ((((this.f216260b.hashCode() ^ 1000003) * 1000003) ^ this.f216261c.hashCode()) * 1000003) ^ this.f216262d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f216260b);
        String valueOf2 = String.valueOf(this.f216261c);
        String valueOf3 = String.valueOf(this.f216262d);
        return "InputPlateStagesContent{singleContent=" + valueOf + ", doubleContent=" + valueOf2 + ", topContent=" + valueOf3 + "}";
    }
}
