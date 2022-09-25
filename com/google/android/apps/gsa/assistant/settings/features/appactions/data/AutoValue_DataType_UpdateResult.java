package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import com.google.assistant.p3825an.p3830c.p3831a.C49263ai;
import p3186j$.util.Optional;

/* compiled from: PG */
final class AutoValue_DataType_UpdateResult extends DataType$UpdateResult {

    /* renamed from: a */
    private final int f34956a;

    /* renamed from: b */
    private final Optional f34957b;

    /* renamed from: c */
    private final int f34958c;

    public AutoValue_DataType_UpdateResult(int i, int i2, Optional optional) {
        this.f34956a = i;
        this.f34958c = i2;
        this.f34957b = optional;
    }

    /* renamed from: a */
    public final int mo18410a() {
        return this.f34956a;
    }

    /* renamed from: b */
    public final Optional mo18411b() {
        return this.f34957b;
    }

    /* renamed from: c */
    public final int mo18412c() {
        return this.f34958c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DataType$UpdateResult) {
            DataType$UpdateResult dataType$UpdateResult = (DataType$UpdateResult) obj;
            return this.f34956a == dataType$UpdateResult.mo18410a() && this.f34958c == dataType$UpdateResult.mo18412c() && this.f34957b.equals(dataType$UpdateResult.mo18411b());
        }
    }

    public final int hashCode() {
        return ((((this.f34956a ^ 1000003) * 1000003) ^ this.f34958c) * 1000003) ^ this.f34957b.hashCode();
    }

    public final String toString() {
        int i = this.f34956a;
        String num = Integer.toString(C49263ai.m85395a(this.f34958c));
        String valueOf = String.valueOf(this.f34957b);
        return "UpdateResult{responseStatus=" + i + ", serverErrorCode=" + num + ", opaqueToken=" + valueOf + "}";
    }
}
