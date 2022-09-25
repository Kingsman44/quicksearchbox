package com.google.ads.interactivemedia.p367v3.impl.data;

/* renamed from: com.google.ads.interactivemedia.v3.impl.data.an */
/* compiled from: PG */
final class C6721an extends C6749bo {
    private final long currentTime;
    private final long duration;
    private final String timeUnit;

    public C6721an(long j, long j2, String str) {
        this.currentTime = j;
        this.duration = j2;
        if (str != null) {
            this.timeUnit = str;
            return;
        }
        throw new NullPointerException("Null timeUnit");
    }

    public long currentTime() {
        return this.currentTime;
    }

    public long duration() {
        return this.duration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6749bo) {
            C6749bo boVar = (C6749bo) obj;
            return this.currentTime == boVar.currentTime() && this.duration == boVar.duration() && this.timeUnit.equals(boVar.timeUnit());
        }
    }

    public int hashCode() {
        long j = this.currentTime;
        long j2 = this.duration;
        return this.timeUnit.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String timeUnit() {
        return this.timeUnit;
    }

    public String toString() {
        long j = this.currentTime;
        long j2 = this.duration;
        String str = this.timeUnit;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 90);
        sb.append("TimeUpdateData{currentTime=");
        sb.append(j);
        sb.append(", duration=");
        sb.append(j2);
        sb.append(", timeUnit=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
