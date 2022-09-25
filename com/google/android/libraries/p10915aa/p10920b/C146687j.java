package com.google.android.libraries.p10915aa.p10920b;

/* renamed from: com.google.android.libraries.aa.b.j */
/* compiled from: PG */
final class C146687j extends C146688k {

    /* renamed from: a */
    private final C146661ai f396119a;

    public C146687j(C146661ai aiVar) {
        this.f396119a = aiVar;
    }

    /* renamed from: b */
    public final int mo123443b() {
        return 2;
    }

    /* renamed from: c */
    public final C146661ai mo123444c() {
        return this.f396119a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C146663ak) {
            C146663ak akVar = (C146663ak) obj;
            if (akVar.mo123443b() != 2 || !this.f396119a.equals(akVar.mo123444c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f396119a.hashCode();
    }

    public final String toString() {
        String obj = this.f396119a.toString();
        return "ProcessedScreenCondition{referenceScreenCondition=" + obj + "}";
    }
}
