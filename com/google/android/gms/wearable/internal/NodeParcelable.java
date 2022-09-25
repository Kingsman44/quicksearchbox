package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class NodeParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146474ce();

    /* renamed from: a */
    public final String f395613a;

    /* renamed from: b */
    public final String f395614b;

    /* renamed from: c */
    public final int f395615c;

    /* renamed from: d */
    public final boolean f395616d;

    public NodeParcelable(String str, String str2, int i, boolean z) {
        this.f395613a = str;
        this.f395614b = str2;
        this.f395615c = i;
        this.f395616d = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NodeParcelable)) {
            return false;
        }
        return ((NodeParcelable) obj).f395613a.equals(this.f395613a);
    }

    public final int hashCode() {
        return this.f395613a.hashCode();
    }

    public final String toString() {
        String str = this.f395614b;
        String str2 = this.f395613a;
        int i = this.f395615c;
        boolean z = this.f395616d;
        return "Node{" + str + ", id=" + str2 + ", hops=" + i + ", isNearby=" + z + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f395613a);
        C143947c.m234106y(parcel, 3, this.f395614b);
        C143947c.m234089h(parcel, 4, this.f395615c);
        C143947c.m234084c(parcel, 5, this.f395616d);
        C143947c.m234083b(parcel, a);
    }
}
