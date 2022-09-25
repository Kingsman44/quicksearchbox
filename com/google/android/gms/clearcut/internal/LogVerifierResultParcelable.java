package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class LogVerifierResultParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143655w();

    /* renamed from: a */
    public boolean f389430a;

    public LogVerifierResultParcelable(boolean z) {
        this.f389430a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LogVerifierResultParcelable) && this.f389430a == ((LogVerifierResultParcelable) obj).f389430a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f389430a)});
    }

    public final String toString() {
        boolean z = this.f389430a;
        return "LogVerifierResultParcelable[" + z + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234084c(parcel, 1, this.f389430a);
        C143947c.m234083b(parcel, a);
    }
}
