package com.google.android.gms.usonia.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.usonia.PeerAddress;
import java.util.Arrays;

/* compiled from: PG */
public final class CheckIsServiceAllowedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146129b();

    /* renamed from: a */
    public String f394858a;

    /* renamed from: b */
    public PeerAddress f394859b;

    public CheckIsServiceAllowedParams() {
    }

    public CheckIsServiceAllowedParams(String str, PeerAddress peerAddress) {
        this.f394858a = str;
        this.f394859b = peerAddress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CheckIsServiceAllowedParams) {
            CheckIsServiceAllowedParams checkIsServiceAllowedParams = (CheckIsServiceAllowedParams) obj;
            return C143912ba.m233950b(this.f394858a, checkIsServiceAllowedParams.f394858a) && C143912ba.m233950b(this.f394859b, checkIsServiceAllowedParams.f394859b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f394858a, this.f394859b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f394858a);
        C143947c.m234105x(parcel, 2, this.f394859b, i);
        C143947c.m234083b(parcel, a);
    }
}
