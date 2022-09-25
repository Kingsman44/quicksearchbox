package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.List;

/* compiled from: PG */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143925bn();

    /* renamed from: a */
    public final int f390051a;

    /* renamed from: b */
    public List f390052b;

    public TelemetryData(int i, List list) {
        this.f390051a = i;
        this.f390052b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f390051a);
        C143947c.m234080C(parcel, 2, this.f390052b);
        C143947c.m234083b(parcel, a);
    }
}
