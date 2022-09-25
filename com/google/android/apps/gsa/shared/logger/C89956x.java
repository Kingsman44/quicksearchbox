package com.google.android.apps.gsa.shared.logger;

/* renamed from: com.google.android.apps.gsa.shared.logger.x */
/* compiled from: PG */
public final class C89956x {

    /* renamed from: a */
    public final long f246471a;

    /* renamed from: b */
    public final long f246472b;

    public C89956x(long j, long j2) {
        this.f246471a = j;
        this.f246472b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C89956x xVar = (C89956x) obj;
        return this.f246472b == xVar.f246472b && this.f246471a == xVar.f246471a;
    }

    public final int hashCode() {
        long j = this.f246472b;
        long j2 = this.f246471a;
        return ((((int) (j ^ (j >>> 32))) + 31) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LatencyLoggingData[");
        if (this.f246471a != 0) {
            sb.append("mRequestId=");
            sb.append(this.f246471a);
            sb.append(", ");
        }
        if (this.f246472b != 0) {
            sb.append("mLatencyId=");
            sb.append(this.f246472b);
            sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
