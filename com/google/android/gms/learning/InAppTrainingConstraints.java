package com.google.android.gms.learning;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class InAppTrainingConstraints extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144826m();

    /* renamed from: a */
    public final boolean f391082a;

    /* renamed from: b */
    public final boolean f391083b;

    /* renamed from: c */
    public final boolean f391084c;

    public InAppTrainingConstraints(boolean z, boolean z2, boolean z3) {
        this.f391082a = z;
        this.f391083b = z2;
        this.f391084c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppTrainingConstraints)) {
            return false;
        }
        InAppTrainingConstraints inAppTrainingConstraints = (InAppTrainingConstraints) obj;
        return this.f391082a == inAppTrainingConstraints.f391082a && this.f391083b == inAppTrainingConstraints.f391083b && this.f391084c == inAppTrainingConstraints.f391084c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f391082a), Boolean.valueOf(this.f391083b), Boolean.valueOf(this.f391084c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234084c(parcel, 1, this.f391082a);
        C143947c.m234084c(parcel, 2, this.f391083b);
        C143947c.m234084c(parcel, 3, this.f391084c);
        C143947c.m234083b(parcel, a);
    }
}
