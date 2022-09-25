package com.google.android.gms.presencemanager;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class ActiveUser extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145749a();

    /* renamed from: a */
    public final IBinder f394084a;

    public ActiveUser(IBinder iBinder) {
        this.f394084a = iBinder;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ActiveUser)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return C143912ba.m233950b(this.f394084a, ((ActiveUser) obj).f394084a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f394084a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234098q(parcel, 1, this.f394084a);
        C143947c.m234083b(parcel, a);
    }
}
