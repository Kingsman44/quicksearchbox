package com.google.android.libraries.social.peoplekit.common.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public final class Stopwatch implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42080j();

    /* renamed from: a */
    long f109974a;

    /* renamed from: b */
    long f109975b;

    /* renamed from: c */
    public boolean f109976c;

    public Stopwatch() {
        this.f109976c = false;
        this.f109974a = 0;
        this.f109975b = 0;
    }

    public Stopwatch(Parcel parcel) {
        this.f109976c = parcel.readInt() != 1 ? false : true;
        this.f109974a = parcel.readLong();
        this.f109975b = parcel.readLong();
    }

    /* renamed from: e */
    private static final long m73633e() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    /* renamed from: a */
    public final long mo44569a() {
        long j = this.f109975b;
        return this.f109976c ? j + (m73633e() - this.f109974a) : j;
    }

    /* renamed from: b */
    public final void mo44570b() {
        this.f109976c = false;
        this.f109974a = 0;
        this.f109975b = 0;
    }

    /* renamed from: c */
    public final void mo44571c() {
        if (!this.f109976c) {
            this.f109974a = m73633e();
            this.f109976c = true;
        }
    }

    /* renamed from: d */
    public final void mo44572d() {
        if (this.f109976c) {
            this.f109975b += m73633e() - this.f109974a;
            this.f109976c = false;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f109976c ? (byte) 1 : 0);
        parcel.writeLong(this.f109974a);
        parcel.writeLong(this.f109975b);
    }
}
