package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class OnInititialDistributedStateCompleteParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146255br();

    /* renamed from: a */
    public String f395036a;

    private OnInititialDistributedStateCompleteParams() {
    }

    public OnInititialDistributedStateCompleteParams(String str) {
        this.f395036a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnInititialDistributedStateCompleteParams) {
            return C143912ba.m233950b(this.f395036a, ((OnInititialDistributedStateCompleteParams) obj).f395036a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f395036a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f395036a);
        C143947c.m234083b(parcel, a);
    }
}
