package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
public class ContextDataFilterImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144054a();

    /* renamed from: a */
    public final ArrayList f390302a;

    /* renamed from: b */
    public final ArrayList f390303b;

    /* renamed from: c */
    public final QueryFilterParameters f390304c;

    /* compiled from: PG */
    public class Inclusion extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C144060b();

        /* renamed from: a */
        public final int f390305a;

        /* renamed from: b */
        public final int f390306b;

        /* renamed from: c */
        public final TimeFilterImpl f390307c;

        /* renamed from: d */
        public final KeyFilterImpl f390308d;

        public Inclusion(int i, int i2, TimeFilterImpl timeFilterImpl, KeyFilterImpl keyFilterImpl) {
            this.f390305a = i;
            this.f390306b = i2;
            this.f390307c = timeFilterImpl;
            this.f390308d = keyFilterImpl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Inclusion)) {
                return false;
            }
            Inclusion inclusion = (Inclusion) obj;
            return this.f390305a == inclusion.f390305a && this.f390306b == inclusion.f390306b && this.f390307c.equals(inclusion.f390307c) && C143912ba.m233950b(this.f390308d, inclusion.f390308d);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f390305a), Integer.valueOf(this.f390306b), this.f390307c, this.f390308d});
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C143947c.m234082a(parcel, 20293);
            C143947c.m234089h(parcel, 2, this.f390305a);
            C143947c.m234089h(parcel, 3, this.f390306b);
            C143947c.m234105x(parcel, 4, this.f390307c, i);
            C143947c.m234105x(parcel, 5, this.f390308d, i);
            C143947c.m234083b(parcel, a);
        }
    }

    public ContextDataFilterImpl(ArrayList arrayList, ArrayList arrayList2, QueryFilterParameters queryFilterParameters) {
        this.f390302a = arrayList;
        this.f390303b = arrayList2;
        this.f390304c = queryFilterParameters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextDataFilterImpl)) {
            return false;
        }
        ContextDataFilterImpl contextDataFilterImpl = (ContextDataFilterImpl) obj;
        return C143912ba.m233950b(this.f390302a, contextDataFilterImpl.f390302a) && C143912ba.m233950b(this.f390303b, contextDataFilterImpl.f390303b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f390302a, this.f390303b});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("contexts=[");
        ArrayList arrayList = this.f390302a;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = this.f390302a;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                sb.append(((Inclusion) arrayList2.get(i)).f390306b);
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 2, this.f390302a);
        C143947c.m234078A(parcel, 3, this.f390303b);
        C143947c.m234105x(parcel, 4, this.f390304c, i);
        C143947c.m234083b(parcel, a);
    }
}
