package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.dy */
/* compiled from: PG */
public final class C145326dy {

    /* renamed from: a */
    public final String f392805a;

    /* renamed from: b */
    public final String f392806b;

    /* renamed from: c */
    public final long f392807c;

    /* renamed from: d */
    public final Bundle f392808d;

    public C145326dy(String str, String str2, Bundle bundle, long j) {
        this.f392805a = str;
        this.f392806b = str2;
        this.f392808d = bundle;
        this.f392807c = j;
    }

    /* renamed from: b */
    public static C145326dy m236124b(EventParcel eventParcel) {
        return new C145326dy(eventParcel.f392536a, eventParcel.f392538c, eventParcel.f392537b.mo120754a(), eventParcel.f392539d);
    }

    /* renamed from: a */
    public final EventParcel mo120901a() {
        return new EventParcel(this.f392805a, new EventParams(new Bundle(this.f392808d)), this.f392806b, this.f392807c);
    }

    public final String toString() {
        String str = this.f392806b;
        String str2 = this.f392805a;
        String obj = this.f392808d.toString();
        return "origin=" + str + ",name=" + str2 + ",params=" + obj;
    }
}
