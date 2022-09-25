package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class SeServiceProvider extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145586ag();

    /* renamed from: a */
    public int f393695a;

    private SeServiceProvider() {
    }

    public SeServiceProvider(int i) {
        this.f393695a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SeServiceProvider) {
            return C143912ba.m233950b(Integer.valueOf(this.f393695a), Integer.valueOf(((SeServiceProvider) obj).f393695a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f393695a)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f393695a);
        C143947c.m234083b(parcel, a);
    }
}
