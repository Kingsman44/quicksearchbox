package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.gh */
/* compiled from: PG */
public final class C82468gh extends C82697ou {

    /* renamed from: a */
    private final String f225335a = "NGA_WARM_ACTIONS_SETTINGS_INELIGIBILITY_REASON";

    /* renamed from: b */
    private final String f225336b;

    public C82468gh(String str, String str2) {
        this.f225336b = str2;
    }

    /* renamed from: b */
    public final String mo76355b() {
        return this.f225336b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225335a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82697ou) {
            C82697ou ouVar = (C82697ou) obj;
            return this.f225335a.equals(ouVar.mo75583d()) && this.f225336b.equals(ouVar.mo76355b());
        }
    }

    public final int hashCode() {
        return ((this.f225335a.hashCode() ^ 1000003) * 1000003) ^ this.f225336b.hashCode();
    }

    public final String toString() {
        String str = this.f225335a;
        String str2 = this.f225336b;
        return "NgaWarmActionsSettingsIneligibilityReasonEvent{token=" + str + ", ineligibilityReason=" + str2 + "}";
    }
}
