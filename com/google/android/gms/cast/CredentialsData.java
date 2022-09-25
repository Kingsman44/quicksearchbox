package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class CredentialsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143607p();

    /* renamed from: a */
    public final String f388617a;

    /* renamed from: b */
    public final String f388618b;

    public CredentialsData(String str, String str2) {
        this.f388617a = str;
        this.f388618b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialsData)) {
            return false;
        }
        CredentialsData credentialsData = (CredentialsData) obj;
        return C143912ba.m233950b(this.f388617a, credentialsData.f388617a) && C143912ba.m233950b(this.f388618b, credentialsData.f388618b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f388617a, this.f388618b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f388617a);
        C143947c.m234106y(parcel, 2, this.f388618b);
        C143947c.m234083b(parcel, a);
    }
}
