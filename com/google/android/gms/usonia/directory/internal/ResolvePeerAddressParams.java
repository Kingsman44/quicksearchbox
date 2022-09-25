package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.usonia.PeerAddress;
import java.util.Arrays;

/* compiled from: PG */
public final class ResolvePeerAddressParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146259bv();

    /* renamed from: a */
    public String f395047a;

    /* renamed from: b */
    public PeerAddress f395048b;

    /* renamed from: c */
    public C146212ab f395049c;

    public ResolvePeerAddressParams() {
    }

    public ResolvePeerAddressParams(String str, PeerAddress peerAddress, C146212ab abVar) {
        this.f395047a = str;
        this.f395048b = peerAddress;
        this.f395049c = abVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ResolvePeerAddressParams) {
            ResolvePeerAddressParams resolvePeerAddressParams = (ResolvePeerAddressParams) obj;
            return C143912ba.m233950b(this.f395047a, resolvePeerAddressParams.f395047a) && C143912ba.m233950b(this.f395048b, resolvePeerAddressParams.f395048b) && C143912ba.m233950b(this.f395049c, resolvePeerAddressParams.f395049c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f395047a, this.f395048b, this.f395049c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f395047a);
        C143947c.m234105x(parcel, 2, this.f395048b, i);
        C143947c.m234098q(parcel, 3, this.f395049c.asBinder());
        C143947c.m234083b(parcel, a);
    }
}
