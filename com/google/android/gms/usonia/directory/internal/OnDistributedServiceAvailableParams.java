package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.usonia.PeerAddress;
import java.util.Arrays;

/* compiled from: PG */
public final class OnDistributedServiceAvailableParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146252bo();

    /* renamed from: a */
    public String f395028a;

    /* renamed from: b */
    public PeerAddress f395029b;

    private OnDistributedServiceAvailableParams() {
    }

    public OnDistributedServiceAvailableParams(String str, PeerAddress peerAddress) {
        this.f395028a = str;
        this.f395029b = peerAddress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnDistributedServiceAvailableParams) {
            OnDistributedServiceAvailableParams onDistributedServiceAvailableParams = (OnDistributedServiceAvailableParams) obj;
            return C143912ba.m233950b(this.f395028a, onDistributedServiceAvailableParams.f395028a) && C143912ba.m233950b(this.f395029b, onDistributedServiceAvailableParams.f395029b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f395028a, this.f395029b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f395028a);
        C143947c.m234105x(parcel, 2, this.f395029b, i);
        C143947c.m234083b(parcel, a);
    }
}
