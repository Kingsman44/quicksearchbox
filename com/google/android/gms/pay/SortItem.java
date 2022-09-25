package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class SortItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145588ai();

    /* renamed from: a */
    public String f393697a;

    /* renamed from: b */
    public long f393698b;

    /* renamed from: c */
    public String f393699c;

    private SortItem() {
    }

    public SortItem(String str, long j, String str2) {
        this.f393697a = str;
        this.f393698b = j;
        this.f393699c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SortItem) {
            SortItem sortItem = (SortItem) obj;
            return C143912ba.m233950b(this.f393697a, sortItem.f393697a) && C143912ba.m233950b(Long.valueOf(this.f393698b), Long.valueOf(sortItem.f393698b)) && C143912ba.m233950b(this.f393699c, sortItem.f393699c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393697a, Long.valueOf(this.f393698b), this.f393699c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f393697a);
        C143947c.m234090i(parcel, 2, this.f393698b);
        C143947c.m234106y(parcel, 3, this.f393699c);
        C143947c.m234083b(parcel, a);
    }
}
