package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class ApplicationStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143559a();

    /* renamed from: a */
    public String f389250a;

    public ApplicationStatus() {
        this.f389250a = null;
    }

    public ApplicationStatus(String str) {
        this.f389250a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApplicationStatus)) {
            return false;
        }
        return C143596v.m233278k(this.f389250a, ((ApplicationStatus) obj).f389250a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f389250a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f389250a);
        C143947c.m234083b(parcel, a);
    }
}
