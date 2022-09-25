package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class TimeSeriesFootprintsSubscriptionFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145079m();

    /* renamed from: a */
    public static final TimeSeriesFootprintsSubscriptionFilter f392043a = new TimeSeriesFootprintsSubscriptionFilter(0, (Long) null, (Long) null);

    /* renamed from: b */
    public final int f392044b;

    /* renamed from: c */
    public final Long f392045c;

    /* renamed from: d */
    public final Long f392046d;

    public TimeSeriesFootprintsSubscriptionFilter(int i, Long l, Long l2) {
        this.f392044b = i;
        this.f392046d = l2;
        this.f392045c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter = (TimeSeriesFootprintsSubscriptionFilter) obj;
            return C143912ba.m233950b(Integer.valueOf(this.f392044b), Integer.valueOf(timeSeriesFootprintsSubscriptionFilter.f392044b)) && C143912ba.m233950b(this.f392045c, timeSeriesFootprintsSubscriptionFilter.f392045c) && C143912ba.m233950b(this.f392046d, timeSeriesFootprintsSubscriptionFilter.f392046d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f392044b), this.f392045c, this.f392046d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f392044b);
        C143947c.m234104w(parcel, 2, this.f392045c);
        C143947c.m234104w(parcel, 3, this.f392046d);
        C143947c.m234083b(parcel, a);
    }
}
