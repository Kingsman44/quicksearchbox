package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.bu */
/* compiled from: PG */
final class C80692bu extends C80790fk {

    /* renamed from: a */
    private final String f221556a;

    /* renamed from: b */
    private final C80831aj f221557b;

    public C80692bu(String str, C80831aj ajVar) {
        this.f221556a = str;
        this.f221557b = ajVar;
    }

    /* renamed from: a */
    public final C80831aj mo74621a() {
        return this.f221557b;
    }

    /* renamed from: b */
    public final String mo74622b() {
        return this.f221556a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C80790fk) {
            C80790fk fkVar = (C80790fk) obj;
            return this.f221556a.equals(fkVar.mo74622b()) && this.f221557b.equals(fkVar.mo74621a());
        }
    }

    public final int hashCode() {
        return ((this.f221556a.hashCode() ^ 1000003) * 1000003) ^ this.f221557b.hashCode();
    }

    public final String toString() {
        String str = this.f221556a;
        String obj = this.f221557b.toString();
        return "Transcription{text=" + str + ", clickUiAction=" + obj + "}";
    }
}
