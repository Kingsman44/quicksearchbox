package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
public class CellularInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145516b();

    /* renamed from: a */
    public final Integer f393432a;

    /* renamed from: b */
    public final Integer f393433b;

    public CellularInfo(Integer num, Integer num2) {
        this.f393432a = num;
        this.f393433b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CellularInfo)) {
            return false;
        }
        CellularInfo cellularInfo = (CellularInfo) obj;
        return C143912ba.m233950b(this.f393432a, cellularInfo.f393432a) && C143912ba.m233950b(this.f393433b, cellularInfo.f393433b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393432a, this.f393433b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("connectionType", this.f393432a, arrayList);
        C143910az.m233947b("meteredness", this.f393433b, arrayList);
        return C143910az.m233946a(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234101t(parcel, 1, this.f393432a);
        C143947c.m234101t(parcel, 2, this.f393433b);
        C143947c.m234083b(parcel, a);
    }
}
