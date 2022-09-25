package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
public class TimeFilterImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144057ac();

    /* renamed from: a */
    public final ArrayList f390328a;

    /* renamed from: b */
    public final int[] f390329b;

    /* compiled from: PG */
    public class Interval extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C144058ad();

        /* renamed from: a */
        public final long f390330a;

        /* renamed from: b */
        public final long f390331b;

        public Interval(long j, long j2) {
            boolean z = true;
            C143919bh.m233959b(j >= -1);
            C143919bh.m233959b(j2 > -1);
            if (j != -1) {
                C143919bh.m233959b(j > j2 ? false : z);
            }
            this.f390330a = j;
            this.f390331b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) obj;
            return this.f390330a == interval.f390330a && this.f390331b == interval.f390331b;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f390330a), Long.valueOf(this.f390331b)});
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C143947c.m234082a(parcel, 20293);
            C143947c.m234090i(parcel, 2, this.f390330a);
            C143947c.m234090i(parcel, 3, this.f390331b);
            C143947c.m234083b(parcel, a);
        }
    }

    public TimeFilterImpl(ArrayList arrayList, int[] iArr) {
        this.f390328a = arrayList;
        this.f390329b = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeFilterImpl)) {
            return false;
        }
        TimeFilterImpl timeFilterImpl = (TimeFilterImpl) obj;
        return C143912ba.m233950b(this.f390328a, timeFilterImpl.f390328a) && C143912ba.m233950b(this.f390329b, timeFilterImpl.f390329b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f390328a, this.f390329b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 2, this.f390328a);
        C143947c.m234099r(parcel, 3, this.f390329b);
        C143947c.m234083b(parcel, a);
    }
}
