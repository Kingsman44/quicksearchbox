package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GenericDimension extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = new C145736n();

    /* renamed from: a */
    public final int f394016a;

    /* renamed from: b */
    public final int f394017b;

    public GenericDimension(int i, int i2) {
        this.f394016a = i;
        this.f394017b = i2;
    }

    /* renamed from: a */
    public final int compareTo(GenericDimension genericDimension) {
        int i = this.f394016a;
        int i2 = genericDimension.f394016a;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = this.f394017b;
        int i4 = genericDimension.f394017b;
        if (i3 < i4) {
            return -1;
        }
        if (i3 > i4) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GenericDimension) || compareTo((GenericDimension) obj) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f394016a * 31) + this.f394017b;
    }

    public final String toString() {
        return "GenericDimension(" + this.f394016a + ", " + this.f394017b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f394016a);
        C143947c.m234089h(parcel, 2, this.f394017b);
        C143947c.m234083b(parcel, a);
    }
}
