package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class TimeIntervalsImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142950m();

    /* renamed from: a */
    public final int[] f387862a;

    public TimeIntervalsImpl(int[] iArr) {
        this.f387862a = iArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeIntervals=");
        if (this.f387862a == null) {
            sb.append("unknown");
        } else {
            sb.append("[");
            int[] iArr = this.f387862a;
            int length = iArr.length;
            boolean z = true;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (!z) {
                    sb.append(", ");
                }
                sb.append(i2);
                i++;
                z = false;
            }
            sb.append("]");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234099r(parcel, 2, this.f387862a);
        C143947c.m234083b(parcel, a);
    }
}
