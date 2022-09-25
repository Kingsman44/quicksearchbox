package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class FetchAllPeerAddressesParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146279o();

    /* renamed from: a */
    public String f395024a;

    /* renamed from: b */
    public C146289y f395025b;

    public FetchAllPeerAddressesParams() {
    }

    public FetchAllPeerAddressesParams(String str, C146289y yVar) {
        this.f395024a = str;
        this.f395025b = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FetchAllPeerAddressesParams) {
            FetchAllPeerAddressesParams fetchAllPeerAddressesParams = (FetchAllPeerAddressesParams) obj;
            return C143912ba.m233950b(this.f395024a, fetchAllPeerAddressesParams.f395024a) && C143912ba.m233950b(this.f395025b, fetchAllPeerAddressesParams.f395025b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f395024a, this.f395025b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f395024a);
        C143947c.m234098q(parcel, 2, this.f395025b.asBinder());
        C143947c.m234083b(parcel, a);
    }
}
