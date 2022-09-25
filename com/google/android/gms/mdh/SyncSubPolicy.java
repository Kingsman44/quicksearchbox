package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class SyncSubPolicy extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145077k();

    /* renamed from: a */
    public boolean f392041a;

    /* renamed from: b */
    public int f392042b;

    public SyncSubPolicy(boolean z, int i) {
        this.f392041a = z;
        this.f392042b = i;
    }

    /* renamed from: a */
    public final boolean mo120542a(SyncSubPolicy syncSubPolicy) {
        if (syncSubPolicy.f392041a) {
            return !this.f392041a || this.f392042b > syncSubPolicy.f392042b;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncSubPolicy)) {
            return false;
        }
        SyncSubPolicy syncSubPolicy = (SyncSubPolicy) obj;
        return this.f392041a == syncSubPolicy.f392041a && this.f392042b == syncSubPolicy.f392042b;
    }

    public final int hashCode() {
        return ((this.f392041a ? 1 : 0) * true) + this.f392042b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234084c(parcel, 1, this.f392041a);
        C143947c.m234089h(parcel, 2, this.f392042b);
        C143947c.m234083b(parcel, a);
    }
}
