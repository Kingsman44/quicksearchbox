package com.google.android.libraries.lens.view.p2113h.p2114a;

/* renamed from: com.google.android.libraries.lens.view.h.a.b */
/* compiled from: PG */
final class C26641b extends C26655p {

    /* renamed from: a */
    private final long f72649a;

    public C26641b(long j) {
        this.f72649a = j;
    }

    /* renamed from: a */
    public final long mo31925a() {
        return this.f72649a;
    }

    /* renamed from: b */
    public final long mo31926b() {
        return 950;
    }

    /* renamed from: c */
    public final boolean mo31927c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26655p) {
            C26655p pVar = (C26655p) obj;
            return pVar.mo31926b() == 950 && this.f72649a == pVar.mo31925a() && !pVar.mo31927c();
        }
    }

    public final int hashCode() {
        long j = this.f72649a;
        return ((-799380193 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ 1237;
    }

    public final String toString() {
        long j = this.f72649a;
        return "FpsLoggerConfig{frameSampleIntervalMillis=950, frameSampleDurationMillis=" + j + ", trackerPerformanceConsoleLogsEnabled=false}";
    }
}
