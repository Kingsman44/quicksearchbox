package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class DataChangeListenerType extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145605c();

    /* renamed from: a */
    public int f393626a;

    private DataChangeListenerType() {
    }

    public DataChangeListenerType(int i) {
        this.f393626a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DataChangeListenerType) {
            return C143912ba.m233950b(Integer.valueOf(this.f393626a), Integer.valueOf(((DataChangeListenerType) obj).f393626a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f393626a)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f393626a);
        C143947c.m234083b(parcel, a);
    }
}
