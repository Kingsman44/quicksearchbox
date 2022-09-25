package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.wearable.ConnectionConfiguration;

@Deprecated
/* compiled from: PG */
public class GetConfigResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146437av();

    /* renamed from: a */
    public final int f395593a;

    /* renamed from: b */
    public final ConnectionConfiguration f395594b;

    public GetConfigResponse(int i, ConnectionConfiguration connectionConfiguration) {
        this.f395593a = i;
        this.f395594b = connectionConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395593a);
        C143947c.m234105x(parcel, 3, this.f395594b, i);
        C143947c.m234083b(parcel, a);
    }
}
