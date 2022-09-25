package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class SortOrderInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145589aj();

    /* renamed from: a */
    public int f393700a;

    /* renamed from: b */
    public SortItem[] f393701b;

    private SortOrderInfo() {
    }

    public SortOrderInfo(int i, SortItem[] sortItemArr) {
        this.f393700a = i;
        this.f393701b = sortItemArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SortOrderInfo) {
            SortOrderInfo sortOrderInfo = (SortOrderInfo) obj;
            return C143912ba.m233950b(Integer.valueOf(this.f393700a), Integer.valueOf(sortOrderInfo.f393700a)) && Arrays.equals(this.f393701b, sortOrderInfo.f393701b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f393700a), Integer.valueOf(Arrays.hashCode(this.f393701b))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f393700a);
        C143947c.m234079B(parcel, 2, this.f393701b, i);
        C143947c.m234083b(parcel, a);
    }
}
