package com.google.android.libraries.p10923ac.p10925b.p10934e;

/* renamed from: com.google.android.libraries.ac.b.e.a */
/* compiled from: PG */
final class C146826a extends C146958dg {

    /* renamed from: a */
    private final Long f396381a;

    /* renamed from: b */
    private final Long f396382b;

    /* renamed from: c */
    private final long f396383c;

    /* renamed from: d */
    private final long f396384d;

    public C146826a(Long l, Long l2, long j, long j2) {
        this.f396381a = l;
        this.f396382b = l2;
        this.f396383c = j;
        this.f396384d = j2;
    }

    /* renamed from: a */
    public final long mo123719a() {
        return this.f396384d;
    }

    /* renamed from: b */
    public final long mo123720b() {
        return this.f396383c;
    }

    /* renamed from: c */
    public final Long mo123721c() {
        return this.f396381a;
    }

    /* renamed from: d */
    public final Long mo123722d() {
        return this.f396382b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C146958dg) {
            C146958dg dgVar = (C146958dg) obj;
            Long l = this.f396381a;
            if (l != null ? l.equals(dgVar.mo123721c()) : dgVar.mo123721c() == null) {
                Long l2 = this.f396382b;
                if (l2 != null ? l2.equals(dgVar.mo123722d()) : dgVar.mo123722d() == null) {
                    return this.f396383c == dgVar.mo123720b() && this.f396384d == dgVar.mo123719a();
                }
            }
        }
    }

    public final String toString() {
        Long l = this.f396381a;
        Long l2 = this.f396382b;
        long j = this.f396383c;
        long j2 = this.f396384d;
        return "TimeSeriesFootprintsSyncFilter{maxAbsoluteTimestamp=" + l + ", minAbsoluteTimestamp=" + l2 + ", maxCount=" + j + ", filterEvalTime=" + j2 + "}";
    }

    public final int hashCode() {
        int i;
        Long l = this.f396381a;
        int i2 = 0;
        if (l == null) {
            i = 0;
        } else {
            i = l.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        Long l2 = this.f396382b;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        long j = this.f396383c;
        long j2 = this.f396384d;
        return ((((i3 ^ i2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }
}
