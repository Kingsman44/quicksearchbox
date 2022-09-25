package com.google.android.gms.mobiledataplan.consent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
public final class ConsentStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145522c();

    /* renamed from: a */
    public int f393546a;

    public ConsentStatus() {
    }

    public ConsentStatus(int i) {
        if (m236589a(i)) {
            this.f393546a = i;
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Illegal EnumVal value %d", new Object[]{Integer.valueOf(i)}));
    }

    /* renamed from: a */
    public static boolean m236589a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsentStatus) {
            return C143912ba.m233950b(Integer.valueOf(this.f393546a), Integer.valueOf(((ConsentStatus) obj).f393546a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f393546a)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("EnumVal", Integer.valueOf(this.f393546a), arrayList);
        return C143910az.m233946a(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f393546a);
        C143947c.m234083b(parcel, a);
    }
}
