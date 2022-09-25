package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.List;

/* compiled from: PG */
public class FlagOverrides extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145735m();

    /* renamed from: a */
    public final List f394015a;

    public FlagOverrides(List list) {
        this.f394015a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlagOverrides)) {
            return false;
        }
        return this.f394015a.equals(((FlagOverrides) obj).f394015a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (FlagOverride flagOverride : this.f394015a) {
            if (!z) {
                sb.append(", ");
            }
            flagOverride.mo121846a(sb);
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 2, this.f394015a);
        C143947c.m234083b(parcel, a);
    }
}
