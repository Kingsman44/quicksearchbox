package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.p10844m.C144993b;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
public class MdhFootprintsReadResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144993b(new C145028e());

    /* renamed from: a */
    public final List f392023a;

    /* renamed from: b */
    public final SyncStatus f392024b;

    public MdhFootprintsReadResult(List list, SyncStatus syncStatus) {
        this.f392023a = list;
        this.f392024b = syncStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MdhFootprintsReadResult mdhFootprintsReadResult = (MdhFootprintsReadResult) obj;
            return C143912ba.m233950b(this.f392023a, mdhFootprintsReadResult.f392023a) && C143912ba.m233950b(this.f392024b, mdhFootprintsReadResult.f392024b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f392023a, this.f392024b});
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "MdhFootprintsReadResult{mdhFootprints=%s, syncStatus=%s}", new Object[]{this.f392023a, this.f392024b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C144993b.m235657a(this, parcel, new C145027d(i));
    }
}
