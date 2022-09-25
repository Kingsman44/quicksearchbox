package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class GetPassesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145610h();

    /* renamed from: a */
    public PassInstance[] f393633a;

    public GetPassesResponse() {
    }

    public GetPassesResponse(PassInstance[] passInstanceArr) {
        this.f393633a = passInstanceArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetPassesResponse) {
            return Arrays.equals(this.f393633a, ((GetPassesResponse) obj).f393633a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f393633a))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234079B(parcel, 1, this.f393633a, i);
        C143947c.m234083b(parcel, a);
    }
}
