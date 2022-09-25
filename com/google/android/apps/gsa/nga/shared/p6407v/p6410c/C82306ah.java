package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ah */
/* compiled from: PG */
public final class C82306ah extends C82534it {

    /* renamed from: a */
    private final String f224825a = "GSA_VIS_DELEGATION_OUTCOME";

    /* renamed from: b */
    private final String f224826b;

    public C82306ah(String str, String str2) {
        this.f224826b = str2;
    }

    /* renamed from: b */
    public final String mo75618b() {
        return this.f224826b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224825a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82534it) {
            C82534it itVar = (C82534it) obj;
            return this.f224825a.equals(itVar.mo75583d()) && this.f224826b.equals(itVar.mo75618b());
        }
    }

    public final int hashCode() {
        return ((this.f224825a.hashCode() ^ 1000003) * 1000003) ^ this.f224826b.hashCode();
    }

    public final String toString() {
        String str = this.f224825a;
        String str2 = this.f224826b;
        return "GsaVisDelegationOutcomeEvent{token=" + str + ", outcome=" + str2 + "}";
    }
}
