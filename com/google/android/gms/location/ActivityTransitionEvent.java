package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144949j();

    /* renamed from: a */
    public final int f391731a;

    /* renamed from: b */
    public final int f391732b;

    /* renamed from: c */
    public final long f391733c;

    public ActivityTransitionEvent(int i, int i2, long j) {
        ActivityTransition.m235451a(i2);
        this.f391731a = i;
        this.f391732b = i2;
        this.f391733c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.f391731a == activityTransitionEvent.f391731a && this.f391732b == activityTransitionEvent.f391732b && this.f391733c == activityTransitionEvent.f391733c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f391731a), Integer.valueOf(this.f391732b), Long.valueOf(this.f391733c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f391731a;
        sb.append("ActivityType " + i);
        sb.append(" ");
        int i2 = this.f391732b;
        sb.append("TransitionType " + i2);
        sb.append(" ");
        long j = this.f391733c;
        sb.append("ElapsedRealTimeNanos " + j);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C143919bh.m233958a(parcel);
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f391731a);
        C143947c.m234089h(parcel, 2, this.f391732b);
        C143947c.m234090i(parcel, 3, this.f391733c);
        C143947c.m234083b(parcel, a);
    }
}
