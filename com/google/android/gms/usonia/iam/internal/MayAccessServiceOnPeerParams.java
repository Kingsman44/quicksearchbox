package com.google.android.gms.usonia.iam.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.usonia.PeerAddress;
import java.util.Arrays;

/* compiled from: PG */
public final class MayAccessServiceOnPeerParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146291a();

    /* renamed from: a */
    public PeerAddress f395127a;

    /* renamed from: b */
    public String[] f395128b;

    public MayAccessServiceOnPeerParams() {
    }

    public MayAccessServiceOnPeerParams(PeerAddress peerAddress, String[] strArr) {
        this.f395127a = peerAddress;
        this.f395128b = strArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MayAccessServiceOnPeerParams) {
            MayAccessServiceOnPeerParams mayAccessServiceOnPeerParams = (MayAccessServiceOnPeerParams) obj;
            return C143912ba.m233950b(this.f395127a, mayAccessServiceOnPeerParams.f395127a) && Arrays.equals(this.f395128b, mayAccessServiceOnPeerParams.f395128b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f395127a, Integer.valueOf(Arrays.hashCode(this.f395128b))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f395127a, i);
        C143947c.m234107z(parcel, 2, this.f395128b);
        C143947c.m234083b(parcel, a);
    }
}
