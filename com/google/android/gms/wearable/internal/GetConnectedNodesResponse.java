package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.List;

/* compiled from: PG */
public class GetConnectedNodesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146439ax();

    /* renamed from: a */
    public final int f395597a;

    /* renamed from: b */
    public final List f395598b;

    public GetConnectedNodesResponse(int i, List list) {
        this.f395597a = i;
        this.f395598b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395597a);
        C143947c.m234080C(parcel, 3, this.f395598b);
        C143947c.m234083b(parcel, a);
    }
}
