package com.google.android.apps.gsa.shared.logger.latency;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public class LatencyEvents implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C89944a();

    /* renamed from: a */
    public final long f246437a;

    /* renamed from: b */
    public final long f246438b;

    /* renamed from: c */
    public final long f246439c;

    /* renamed from: d */
    public final long f246440d;

    /* renamed from: e */
    public final long f246441e;

    public LatencyEvents(long j, long j2, long j3, long j4, long j5) {
        this.f246437a = j;
        this.f246438b = j2;
        this.f246440d = j3;
        this.f246441e = j4;
        this.f246439c = j5;
    }

    /* renamed from: a */
    public final LatencyEvents mo83792a(long j) {
        return new LatencyEvents(this.f246437a, this.f246438b, this.f246440d, this.f246441e, j);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LatencyEvents latencyEvents = (LatencyEvents) obj;
            return this.f246437a == latencyEvents.f246437a && this.f246438b == latencyEvents.f246438b && this.f246440d == latencyEvents.f246440d && this.f246441e == latencyEvents.f246441e && this.f246439c == latencyEvents.f246439c;
        }
    }

    public final int hashCode() {
        long j = this.f246437a;
        long j2 = this.f246438b;
        long j3 = this.f246440d;
        long j4 = this.f246441e;
        long j5 = this.f246439c;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + ((int) ((j5 >>> 32) ^ j5));
    }

    public final String toString() {
        long j = this.f246437a;
        long j2 = this.f246438b;
        long j3 = this.f246440d;
        long j4 = this.f246441e;
        long j5 = this.f246439c;
        return "LatencyEvents{applicationCreate=" + j + ", newSearchIntent=" + j2 + ", activityCreate=" + j3 + ", queryEntryBegin=" + j4 + ", externalSearchIntent=" + j5 + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f246437a);
        parcel.writeLong(this.f246438b);
        parcel.writeLong(this.f246440d);
        parcel.writeLong(this.f246441e);
        parcel.writeLong(this.f246439c);
    }
}
