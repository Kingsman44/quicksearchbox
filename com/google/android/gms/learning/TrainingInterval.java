package com.google.android.gms.learning;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class TrainingInterval extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144831r();

    /* renamed from: a */
    public final int f391085a;

    /* renamed from: b */
    public final long f391086b;

    public TrainingInterval(int i, long j) {
        boolean z = true;
        if (i == 0) {
            i = 0;
            if (j <= 0) {
                z = false;
            }
        }
        C143919bh.m233960c(z, "Recurrent jobs cannot have non-positive minimal interval.");
        this.f391085a = i;
        this.f391086b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrainingInterval)) {
            return false;
        }
        TrainingInterval trainingInterval = (TrainingInterval) obj;
        return this.f391085a == trainingInterval.f391085a && this.f391086b == trainingInterval.f391086b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f391085a), Long.valueOf(this.f391086b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f391085a);
        C143947c.m234090i(parcel, 2, this.f391086b);
        C143947c.m234083b(parcel, a);
    }
}
