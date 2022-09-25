package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.wearable.C146410e;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
public class CapabilityInfoParcelable extends AbstractSafeParcelable implements C146410e {
    public static final Parcelable.Creator CREATOR = new C146521u();

    /* renamed from: a */
    public final String f395550a;

    /* renamed from: b */
    public final List f395551b;

    /* renamed from: c */
    private final Object f395552c = new Object();

    /* renamed from: d */
    private Set f395553d;

    public CapabilityInfoParcelable(String str, List list) {
        this.f395550a = str;
        this.f395551b = list;
        this.f395553d = null;
        C143919bh.m233958a(str);
        C143919bh.m233958a(list);
    }

    /* renamed from: a */
    public final Set mo123089a() {
        Set set;
        synchronized (this.f395552c) {
            if (this.f395553d == null) {
                this.f395553d = new HashSet(this.f395551b);
            }
            set = this.f395553d;
        }
        return set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CapabilityInfoParcelable capabilityInfoParcelable = (CapabilityInfoParcelable) obj;
        String str = this.f395550a;
        if (str == null ? capabilityInfoParcelable.f395550a != null : !str.equals(capabilityInfoParcelable.f395550a)) {
            return false;
        }
        List list = this.f395551b;
        return list == null ? capabilityInfoParcelable.f395551b == null : list.equals(capabilityInfoParcelable.f395551b);
    }

    public final int hashCode() {
        String str = this.f395550a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        List list = this.f395551b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        String str = this.f395550a;
        String valueOf = String.valueOf(this.f395551b);
        return "CapabilityInfo{" + str + ", " + valueOf + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f395550a);
        C143947c.m234080C(parcel, 3, this.f395551b);
        C143947c.m234083b(parcel, a);
    }
}
