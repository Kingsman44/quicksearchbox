package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class PassSaveTypeFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145623u();

    /* renamed from: a */
    public int f393669a;

    private PassSaveTypeFilter() {
    }

    public PassSaveTypeFilter(int i) {
        this.f393669a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PassSaveTypeFilter) {
            return C143912ba.m233950b(Integer.valueOf(this.f393669a), Integer.valueOf(((PassSaveTypeFilter) obj).f393669a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f393669a)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f393669a);
        C143947c.m234083b(parcel, a);
    }
}
