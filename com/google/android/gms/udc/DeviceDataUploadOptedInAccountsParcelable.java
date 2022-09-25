package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class DeviceDataUploadOptedInAccountsParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146060b();

    /* renamed from: a */
    public final List f394762a;

    /* renamed from: b */
    public final List f394763b;

    public DeviceDataUploadOptedInAccountsParcelable(List list, List list2) {
        this.f394762a = list;
        this.f394763b = list2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DeviceDataUploadOptedInAccountsParcelable) {
            DeviceDataUploadOptedInAccountsParcelable deviceDataUploadOptedInAccountsParcelable = (DeviceDataUploadOptedInAccountsParcelable) obj;
            if (!C143912ba.m233950b(this.f394762a, deviceDataUploadOptedInAccountsParcelable.f394762a) || !C143912ba.m233950b(this.f394763b, deviceDataUploadOptedInAccountsParcelable.f394763b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f394762a, this.f394763b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234078A(parcel, 2, this.f394762a);
        C143947c.m234078A(parcel, 3, this.f394763b);
        C143947c.m234083b(parcel, a);
    }
}
