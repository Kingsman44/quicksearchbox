package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
public class UdcCacheRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146068j();

    /* renamed from: a */
    public final int[] f394769a;

    public UdcCacheRequest(int[] iArr) {
        this.f394769a = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof UdcCacheRequest)) {
            return Arrays.equals(this.f394769a, ((UdcCacheRequest) obj).f394769a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f394769a);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("SettingId", Arrays.toString(this.f394769a), arrayList);
        return C143910az.m233946a(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234099r(parcel, 2, this.f394769a);
        C143947c.m234083b(parcel, a);
    }
}
