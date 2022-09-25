package com.google.android.gms.pseudonymous;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class PseudonymousIdToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145771g();

    /* renamed from: a */
    public final String f394099a;

    public PseudonymousIdToken(String str) {
        this.f394099a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PseudonymousIdToken) {
            return C143912ba.m233950b(this.f394099a, ((PseudonymousIdToken) obj).f394099a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f394099a.hashCode();
    }

    public final String toString() {
        String str = this.f394099a;
        return "PseudonymousIdToken[" + str + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f394099a);
        C143947c.m234083b(parcel, a);
    }
}
