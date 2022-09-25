package com.google.android.apps.gsa.sidekick.main.p7199b;

/* renamed from: com.google.android.apps.gsa.sidekick.main.b.a */
/* compiled from: PG */
public final class C91261a extends C91263c {

    /* renamed from: a */
    public final double f254704a;

    /* renamed from: b */
    public final double f254705b;

    /* renamed from: c */
    private final long f254706c;

    public C91261a(long j, double d, double d2) {
        this.f254706c = j;
        this.f254704a = d;
        this.f254705b = d2;
    }

    /* renamed from: a */
    public final double mo85523a() {
        return this.f254704a;
    }

    /* renamed from: b */
    public final double mo85524b() {
        return this.f254705b;
    }

    /* renamed from: c */
    public final float mo85525c() {
        return 10000.0f;
    }

    /* renamed from: e */
    public final long mo85526e() {
        return this.f254706c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C91263c) {
            C91263c cVar = (C91263c) obj;
            return this.f254706c == cVar.mo85526e() && Double.doubleToLongBits(this.f254704a) == Double.doubleToLongBits(cVar.mo85523a()) && Double.doubleToLongBits(this.f254705b) == Double.doubleToLongBits(cVar.mo85524b()) && Float.floatToIntBits(10000.0f) == Float.floatToIntBits(cVar.mo85525c());
        }
    }

    public final int hashCode() {
        long j = this.f254706c;
        return Float.floatToIntBits(10000.0f) ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f254704a) >>> 32) ^ Double.doubleToLongBits(this.f254704a)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f254705b) >>> 32) ^ Double.doubleToLongBits(this.f254705b)))) * 1000003);
    }

    public final String toString() {
        long j = this.f254706c;
        double d = this.f254704a;
        double d2 = this.f254705b;
        return "GeofenceRegion{timestamp=" + j + ", getLatitude=" + d + ", getLongitude=" + d2 + ", getRadiusMeters=10000.0}";
    }
}
