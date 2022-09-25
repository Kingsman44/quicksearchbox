package com.google.android.apps.gsa.nga.engine.recognition;

import com.google.android.apps.gsa.nga.engine.b.g.ac;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.i */
/* compiled from: PG */
final class C77654i extends C77623f {

    /* renamed from: a */
    private final ac f213881a;

    /* renamed from: b */
    private final float f213882b;

    /* renamed from: c */
    private final float f213883c;

    /* renamed from: d */
    private final long f213884d;

    public C77654i(ac acVar, float f, float f2, long j) {
        this.f213881a = acVar;
        this.f213882b = f;
        this.f213883c = f2;
        this.f213884d = j;
    }

    /* renamed from: a */
    public final float mo72752a() {
        return this.f213883c;
    }

    /* renamed from: b */
    public final float mo72753b() {
        return this.f213882b;
    }

    /* renamed from: c */
    public final long mo72754c() {
        return this.f213884d;
    }

    /* renamed from: d */
    public final ac mo72755d() {
        return this.f213881a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C77623f) {
            C77623f fVar = (C77623f) obj;
            return this.f213881a.equals(fVar.mo72755d()) && Float.floatToIntBits(this.f213882b) == Float.floatToIntBits(fVar.mo72753b()) && Float.floatToIntBits(this.f213883c) == Float.floatToIntBits(fVar.mo72752a()) && this.f213884d == fVar.mo72754c();
        }
    }

    public final int hashCode() {
        int hashCode = this.f213881a.hashCode();
        int floatToIntBits = Float.floatToIntBits(this.f213882b);
        int floatToIntBits2 = Float.floatToIntBits(this.f213883c);
        long j = this.f213884d;
        return ((((((hashCode ^ 1000003) * 1000003) ^ floatToIntBits) * 1000003) ^ floatToIntBits2) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        String obj = this.f213881a.toString();
        float f = this.f213882b;
        float f2 = this.f213883c;
        long j = this.f213884d;
        return "AudioLevelInfoResult{utteranceIdentifier=" + obj + ", volumeLevel=" + f + ", speechConfidence=" + f2 + ", timestampMs=" + j + "}";
    }
}
