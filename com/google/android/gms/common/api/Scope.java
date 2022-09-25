package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C143713af();

    /* renamed from: a */
    final int f389613a;

    /* renamed from: b */
    public final String f389614b;

    public Scope(int i, String str) {
        C143919bh.m233970m(str, "scopeUri must not be null or empty");
        this.f389613a = i;
        this.f389614b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f389614b.equals(((Scope) obj).f389614b);
    }

    public final int hashCode() {
        return this.f389614b.hashCode();
    }

    public final String toString() {
        return this.f389614b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f389613a);
        C143947c.m234106y(parcel, 2, this.f389614b);
        C143947c.m234083b(parcel, a);
    }
}
