package com.google.android.gms.car;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import p3186j$.util.Objects;

/* compiled from: PG */
public final class TouchEventCompleteData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143199dp();

    /* renamed from: a */
    public final int f388001a;

    /* renamed from: b */
    public final Rect f388002b;

    /* renamed from: c */
    public final int f388003c;

    public TouchEventCompleteData(int i, Rect rect, int i2) {
        this.f388001a = i;
        this.f388002b = rect;
        this.f388003c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TouchEventCompleteData touchEventCompleteData = (TouchEventCompleteData) obj;
        if (this.f388001a == touchEventCompleteData.f388001a && this.f388003c == touchEventCompleteData.f388003c) {
            return Objects.equals(this.f388002b, touchEventCompleteData.f388002b);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f388001a * 31;
        Rect rect = this.f388002b;
        return ((i + (rect != null ? rect.hashCode() : 0)) * 31) + this.f388003c;
    }

    public final String toString() {
        int i = this.f388001a;
        String valueOf = String.valueOf(this.f388002b);
        int i2 = this.f388003c;
        return "TouchEventCompleteData{hint=" + i + ", currentFocus=" + valueOf + ", direction=" + i2 + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f388001a);
        C143947c.m234105x(parcel, 2, this.f388002b, i);
        C143947c.m234089h(parcel, 3, this.f388003c);
        C143947c.m234083b(parcel, a);
    }
}
