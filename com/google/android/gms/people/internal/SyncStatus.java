package com.google.android.gms.people.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class SyncStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145680q();

    /* renamed from: a */
    public final int f393899a;

    /* renamed from: b */
    public final String f393900b;

    /* renamed from: c */
    public final long f393901c;

    public SyncStatus(int i, String str, long j) {
        this.f393899a = i;
        this.f393900b = str;
        this.f393901c = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f393899a);
        C143947c.m234106y(parcel, 3, this.f393900b);
        C143947c.m234090i(parcel, 4, this.f393901c);
        C143947c.m234083b(parcel, a);
    }
}
