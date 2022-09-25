package com.google.android.gms.semanticlocation;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.location.WifiScan;
import java.util.List;

/* compiled from: PG */
public class InputSignals extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145977o();

    /* renamed from: a */
    public final long f394580a;

    /* renamed from: b */
    public final int f394581b;

    /* renamed from: c */
    public final Location f394582c;

    /* renamed from: d */
    public final WifiScan f394583d;

    /* renamed from: e */
    public final List f394584e;

    /* renamed from: f */
    public final List f394585f;

    /* renamed from: g */
    public final RtslDebugData f394586g;

    public InputSignals(long j, int i, Location location, WifiScan wifiScan, List list, List list2, RtslDebugData rtslDebugData) {
        this.f394580a = j;
        this.f394581b = i;
        this.f394582c = location;
        this.f394583d = wifiScan;
        this.f394584e = list;
        this.f394585f = list2;
        this.f394586g = rtslDebugData;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234090i(parcel, 1, this.f394580a);
        C143947c.m234089h(parcel, 2, this.f394581b);
        C143947c.m234105x(parcel, 3, this.f394582c, i);
        C143947c.m234105x(parcel, 4, this.f394583d, i);
        C143947c.m234080C(parcel, 5, this.f394584e);
        C143947c.m234080C(parcel, 6, this.f394585f);
        C143947c.m234105x(parcel, 7, this.f394586g, i);
        C143947c.m234083b(parcel, a);
    }
}
