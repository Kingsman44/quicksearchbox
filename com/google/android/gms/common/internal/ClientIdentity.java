package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143941p();

    /* renamed from: a */
    public final int f390000a;

    /* renamed from: b */
    public final String f390001b;

    public ClientIdentity(int i, String str) {
        this.f390000a = i;
        this.f390001b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f390000a == this.f390000a && C143912ba.m233950b(clientIdentity.f390001b, this.f390001b);
    }

    public final int hashCode() {
        return this.f390000a;
    }

    public final String toString() {
        int i = this.f390000a;
        String str = this.f390001b;
        return i + ":" + str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f390000a);
        C143947c.m234106y(parcel, 2, this.f390001b);
        C143947c.m234083b(parcel, a);
    }
}
