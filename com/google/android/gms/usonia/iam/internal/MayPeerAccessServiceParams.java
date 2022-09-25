package com.google.android.gms.usonia.iam.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.usonia.PeerAddress;
import java.util.Arrays;

/* compiled from: PG */
public final class MayPeerAccessServiceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146292b();

    /* renamed from: a */
    public PeerAddress f395129a;

    /* renamed from: b */
    public String[] f395130b;

    public MayPeerAccessServiceParams() {
    }

    public MayPeerAccessServiceParams(PeerAddress peerAddress, String[] strArr) {
        this.f395129a = peerAddress;
        this.f395130b = strArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MayPeerAccessServiceParams) {
            MayPeerAccessServiceParams mayPeerAccessServiceParams = (MayPeerAccessServiceParams) obj;
            return C143912ba.m233950b(this.f395129a, mayPeerAccessServiceParams.f395129a) && Arrays.equals(this.f395130b, mayPeerAccessServiceParams.f395130b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f395129a, Integer.valueOf(Arrays.hashCode(this.f395130b))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f395129a, i);
        C143947c.m234107z(parcel, 2, this.f395130b);
        C143947c.m234083b(parcel, a);
    }
}
