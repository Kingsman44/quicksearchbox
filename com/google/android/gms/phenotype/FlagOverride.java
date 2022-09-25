package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class FlagOverride extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145734l();

    /* renamed from: a */
    public final String f394011a;

    /* renamed from: b */
    public final String f394012b;

    /* renamed from: c */
    public final Flag f394013c;

    /* renamed from: d */
    public final boolean f394014d;

    public FlagOverride(String str, String str2, Flag flag, boolean z) {
        this.f394011a = str;
        this.f394012b = str2;
        this.f394013c = flag;
        this.f394014d = z;
    }

    /* renamed from: a */
    public final String mo121846a(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.f394011a);
        sb.append(", ");
        sb.append(this.f394012b);
        sb.append(", ");
        this.f394013c.mo121840d(sb);
        sb.append(", ");
        sb.append(this.f394014d);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlagOverride)) {
            return false;
        }
        FlagOverride flagOverride = (FlagOverride) obj;
        return C145717aa.m236984a(this.f394011a, flagOverride.f394011a) && C145717aa.m236984a(this.f394012b, flagOverride.f394012b) && C145717aa.m236984a(this.f394013c, flagOverride.f394013c) && this.f394014d == flagOverride.f394014d;
    }

    public final String toString() {
        return mo121846a(new StringBuilder());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f394011a);
        C143947c.m234106y(parcel, 3, this.f394012b);
        C143947c.m234105x(parcel, 4, this.f394013c, i);
        C143947c.m234084c(parcel, 5, this.f394014d);
        C143947c.m234083b(parcel, a);
    }
}
