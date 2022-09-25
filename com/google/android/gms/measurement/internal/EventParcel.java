package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: PG */
public final class EventParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145237aq();

    /* renamed from: a */
    public final String f392536a;

    /* renamed from: b */
    public final EventParams f392537b;

    /* renamed from: c */
    public final String f392538c;

    /* renamed from: d */
    public final long f392539d;

    public EventParcel(EventParcel eventParcel, long j) {
        C143919bh.m233958a(eventParcel);
        this.f392536a = eventParcel.f392536a;
        this.f392537b = eventParcel.f392537b;
        this.f392538c = eventParcel.f392538c;
        this.f392539d = j;
    }

    public EventParcel(String str, EventParams eventParams, String str2, long j) {
        this.f392536a = str;
        this.f392537b = eventParams;
        this.f392538c = str2;
        this.f392539d = j;
    }

    public final String toString() {
        String str = this.f392538c;
        String str2 = this.f392536a;
        String valueOf = String.valueOf(this.f392537b);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C145237aq.m235976a(this, parcel, i);
    }
}
