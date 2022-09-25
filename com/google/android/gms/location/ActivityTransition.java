package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class ActivityTransition extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144910i();

    /* renamed from: a */
    public final int f391729a;

    /* renamed from: b */
    public final int f391730b;

    public ActivityTransition(int i, int i2) {
        this.f391729a = i;
        this.f391730b = i2;
    }

    /* renamed from: a */
    public static void m235451a(int i) {
        boolean z = false;
        if (i >= 0 && i <= 1) {
            z = true;
        }
        C143919bh.m233960c(z, "Transition type " + i + " is not valid.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.f391729a == activityTransition.f391729a && this.f391730b == activityTransition.f391730b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f391729a), Integer.valueOf(this.f391730b)});
    }

    public final String toString() {
        int i = this.f391729a;
        int i2 = this.f391730b;
        return "ActivityTransition [mActivityType=" + i + ", mTransitionType=" + i2 + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C143919bh.m233958a(parcel);
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f391729a);
        C143947c.m234089h(parcel, 2, this.f391730b);
        C143947c.m234083b(parcel, a);
    }
}
