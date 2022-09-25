package com.google.android.gms.mdh.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.p10844m.C144993b;
import java.util.List;

/* compiled from: PG */
public class MdhFootprintListSafeParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144993b(new C145068s());

    /* renamed from: a */
    public final List f392054a;

    public MdhFootprintListSafeParcelable(List list) {
        this.f392054a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdhFootprintListSafeParcelable)) {
            return false;
        }
        return this.f392054a.equals(((MdhFootprintListSafeParcelable) obj).f392054a);
    }

    public final int hashCode() {
        List list = this.f392054a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f392054a);
        return "MdhFootprintListSafeParcelable{mdhFootprints=" + valueOf + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C144993b.m235657a(this, parcel, new C145067r());
    }
}
