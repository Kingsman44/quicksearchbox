package com.google.android.gms.mobiledataplan.consent;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
public final class SafeHtml extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145526g();

    /* renamed from: a */
    public String f393558a;

    private SafeHtml() {
    }

    public SafeHtml(String str) {
        this.f393558a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SafeHtml) {
            return C143912ba.m233950b(this.f393558a, ((SafeHtml) obj).f393558a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f393558a});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("Html", this.f393558a, arrayList);
        return C143910az.m233946a(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f393558a);
        C143947c.m234083b(parcel, a);
    }
}
