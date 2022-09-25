package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class Animation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145578a();

    /* renamed from: a */
    public int f393619a;

    /* renamed from: b */
    public String f393620b;

    /* renamed from: c */
    public boolean f393621c;

    /* renamed from: d */
    public String f393622d;

    private Animation() {
    }

    public Animation(int i, String str, boolean z, String str2) {
        this.f393619a = i;
        this.f393620b = str;
        this.f393621c = z;
        this.f393622d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Animation) {
            Animation animation = (Animation) obj;
            return C143912ba.m233950b(Integer.valueOf(this.f393619a), Integer.valueOf(animation.f393619a)) && C143912ba.m233950b(this.f393620b, animation.f393620b) && C143912ba.m233950b(Boolean.valueOf(this.f393621c), Boolean.valueOf(animation.f393621c)) && C143912ba.m233950b(this.f393622d, animation.f393622d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f393619a), this.f393620b, Boolean.valueOf(this.f393621c), this.f393622d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f393619a);
        C143947c.m234106y(parcel, 2, this.f393620b);
        C143947c.m234084c(parcel, 3, this.f393621c);
        C143947c.m234106y(parcel, 4, this.f393622d);
        C143947c.m234083b(parcel, a);
    }
}
