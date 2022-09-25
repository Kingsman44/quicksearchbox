package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.usonia.PeerAddress;
import java.util.Arrays;

/* compiled from: PG */
public final class ResolvePeerAddressResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146260bw();

    /* renamed from: a */
    public PeerAddress f395050a;

    private ResolvePeerAddressResult() {
    }

    public ResolvePeerAddressResult(PeerAddress peerAddress) {
        this.f395050a = peerAddress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ResolvePeerAddressResult) {
            return C143912ba.m233950b(this.f395050a, ((ResolvePeerAddressResult) obj).f395050a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f395050a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f395050a, i);
        C143947c.m234083b(parcel, a);
    }
}
