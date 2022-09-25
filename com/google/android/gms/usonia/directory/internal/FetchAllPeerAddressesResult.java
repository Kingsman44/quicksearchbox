package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.usonia.PeerAddress;
import java.util.Arrays;

/* compiled from: PG */
public final class FetchAllPeerAddressesResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146280p();

    /* renamed from: a */
    public PeerAddress[] f395026a;

    private FetchAllPeerAddressesResult() {
    }

    public FetchAllPeerAddressesResult(PeerAddress[] peerAddressArr) {
        this.f395026a = peerAddressArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FetchAllPeerAddressesResult) {
            return Arrays.equals(this.f395026a, ((FetchAllPeerAddressesResult) obj).f395026a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f395026a))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234079B(parcel, 1, this.f395026a, i);
        C143947c.m234083b(parcel, a);
    }
}
