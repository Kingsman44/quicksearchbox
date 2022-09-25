package com.google.android.apps.gsa.opaonboarding;

/* compiled from: PG */
final class AutoValue_HotwordTrainingConfig extends HotwordTrainingConfig {

    /* renamed from: a */
    private final int f228437a;

    /* renamed from: b */
    private final boolean f228438b;

    /* renamed from: c */
    private final int f228439c;

    public AutoValue_HotwordTrainingConfig(int i, boolean z, int i2) {
        this.f228437a = i;
        this.f228438b = z;
        this.f228439c = i2;
    }

    /* renamed from: a */
    public final int mo77193a() {
        return this.f228437a;
    }

    /* renamed from: b */
    public final int mo77194b() {
        return this.f228439c;
    }

    /* renamed from: c */
    public final boolean mo77195c() {
        return this.f228438b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HotwordTrainingConfig) {
            HotwordTrainingConfig hotwordTrainingConfig = (HotwordTrainingConfig) obj;
            return this.f228437a == hotwordTrainingConfig.mo77193a() && this.f228438b == hotwordTrainingConfig.mo77195c() && this.f228439c == hotwordTrainingConfig.mo77194b();
        }
    }

    public final int hashCode() {
        return ((((this.f228437a ^ 1000003) * 1000003) ^ (true != this.f228438b ? 1237 : 1231)) * 1000003) ^ this.f228439c;
    }

    public final String toString() {
        int i = this.f228437a;
        boolean z = this.f228438b;
        int i2 = this.f228439c;
        return "HotwordTrainingConfig{enrollmentEntryId=" + i + ", requestPersonalResponsePermission=" + z + ", personalResponsePermissionStyle=" + i2 + "}";
    }
}
