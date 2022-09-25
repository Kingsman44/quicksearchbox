package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GetLocalNodeResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146444bb();

    /* renamed from: a */
    public final int f395605a;

    /* renamed from: b */
    public final NodeParcelable f395606b;

    public GetLocalNodeResponse(int i, NodeParcelable nodeParcelable) {
        this.f395605a = i;
        this.f395606b = nodeParcelable;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395605a);
        C143947c.m234105x(parcel, 3, this.f395606b, i);
        C143947c.m234083b(parcel, a);
    }
}
