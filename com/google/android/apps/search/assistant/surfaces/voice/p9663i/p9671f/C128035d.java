package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9671f;

import java.util.Arrays;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.f.d */
/* compiled from: PG */
final class C128035d extends C128044m {

    /* renamed from: a */
    private final long f352318a;

    /* renamed from: b */
    private final float[] f352319b;

    public C128035d(long j, float[] fArr) {
        this.f352318a = j;
        if (fArr != null) {
            this.f352319b = fArr;
            return;
        }
        throw new NullPointerException("Null values");
    }

    /* renamed from: a */
    public final long mo108320a() {
        return this.f352318a;
    }

    /* renamed from: b */
    public final float[] mo108321b() {
        return this.f352319b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C128044m) {
            C128044m mVar = (C128044m) obj;
            if (this.f352318a == mVar.mo108320a()) {
                if (Arrays.equals(this.f352319b, mVar instanceof C128035d ? ((C128035d) mVar).f352319b : mVar.mo108321b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f352318a;
        return Arrays.hashCode(this.f352319b) ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f352318a;
        String arrays = Arrays.toString(this.f352319b);
        return "SensorEvent{timestamp=" + j + ", values=" + arrays + "}";
    }
}
