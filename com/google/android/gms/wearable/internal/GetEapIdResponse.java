package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GetEapIdResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146441az();

    /* renamed from: a */
    public final int f395601a;

    /* renamed from: b */
    public final String f395602b;

    public GetEapIdResponse(int i, String str) {
        this.f395601a = i;
        this.f395602b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395601a);
        C143947c.m234106y(parcel, 3, this.f395602b);
        C143947c.m234083b(parcel, a);
    }
}
