package com.google.android.gms.awareness.snapshot.internal;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.location.ActivityRecognitionResult;

/* compiled from: PG */
public final class Snapshot extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142947j();

    /* renamed from: a */
    public final ActivityRecognitionResult f387848a;

    /* renamed from: b */
    public final BeaconStateImpl f387849b;

    /* renamed from: c */
    public final HeadphoneStateImpl f387850c;

    /* renamed from: d */
    public final Location f387851d;

    /* renamed from: e */
    public final NetworkStateImpl f387852e;

    /* renamed from: f */
    public final DataHolder f387853f;

    /* renamed from: g */
    public final PowerStateImpl f387854g;

    /* renamed from: h */
    public final ScreenStateImpl f387855h;

    /* renamed from: i */
    public final WeatherImpl f387856i;

    /* renamed from: j */
    public final TimeIntervalsImpl f387857j;

    /* renamed from: k */
    public final ContextData f387858k;

    public Snapshot(ActivityRecognitionResult activityRecognitionResult, BeaconStateImpl beaconStateImpl, HeadphoneStateImpl headphoneStateImpl, Location location, NetworkStateImpl networkStateImpl, DataHolder dataHolder, PowerStateImpl powerStateImpl, ScreenStateImpl screenStateImpl, WeatherImpl weatherImpl, TimeIntervalsImpl timeIntervalsImpl, ContextData contextData) {
        this.f387848a = activityRecognitionResult;
        this.f387849b = beaconStateImpl;
        this.f387850c = headphoneStateImpl;
        this.f387851d = location;
        this.f387852e = networkStateImpl;
        this.f387853f = dataHolder;
        this.f387854g = powerStateImpl;
        this.f387855h = screenStateImpl;
        this.f387856i = weatherImpl;
        this.f387857j = timeIntervalsImpl;
        this.f387858k = contextData;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, this.f387848a, i);
        C143947c.m234105x(parcel, 3, this.f387849b, i);
        C143947c.m234105x(parcel, 4, this.f387850c, i);
        C143947c.m234105x(parcel, 5, this.f387851d, i);
        C143947c.m234105x(parcel, 6, this.f387852e, i);
        C143947c.m234105x(parcel, 7, this.f387853f, i);
        C143947c.m234105x(parcel, 8, this.f387854g, i);
        C143947c.m234105x(parcel, 9, this.f387855h, i);
        C143947c.m234105x(parcel, 10, this.f387856i, i);
        C143947c.m234105x(parcel, 11, this.f387857j, i);
        C143947c.m234105x(parcel, 12, this.f387858k, i);
        C143947c.m234083b(parcel, a);
    }
}
