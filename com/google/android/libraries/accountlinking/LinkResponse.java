package com.google.android.libraries.accountlinking;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: PG */
public class LinkResponse implements SafeParcelable {
    public static final Parcelable.Creator CREATOR = new C147436n();

    /* renamed from: a */
    public final boolean f397745a;

    /* renamed from: b */
    public final String f397746b;

    public LinkResponse(boolean z, String str) {
        this.f397745a = z;
        this.f397746b = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234084c(parcel, 1, this.f397745a);
        C143947c.m234106y(parcel, 2, this.f397746b);
        C143947c.m234083b(parcel, a);
    }
}
