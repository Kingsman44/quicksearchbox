package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.C143596v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class AdBreakInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143369b();

    /* renamed from: a */
    public final long f388579a;

    /* renamed from: b */
    public final String f388580b;

    /* renamed from: c */
    public final long f388581c;

    /* renamed from: d */
    public final boolean f388582d;

    /* renamed from: e */
    public final String[] f388583e;

    /* renamed from: f */
    public final boolean f388584f;

    /* renamed from: g */
    public final boolean f388585g;

    public AdBreakInfo(long j, String str, long j2, boolean z, String[] strArr, boolean z2, boolean z3) {
        this.f388579a = j;
        this.f388580b = str;
        this.f388581c = j2;
        this.f388582d = z;
        this.f388583e = strArr;
        this.f388584f = z2;
        this.f388585g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakInfo)) {
            return false;
        }
        AdBreakInfo adBreakInfo = (AdBreakInfo) obj;
        return C143596v.m233278k(this.f388580b, adBreakInfo.f388580b) && this.f388579a == adBreakInfo.f388579a && this.f388581c == adBreakInfo.f388581c && this.f388582d == adBreakInfo.f388582d && Arrays.equals(this.f388583e, adBreakInfo.f388583e) && this.f388584f == adBreakInfo.f388584f && this.f388585g == adBreakInfo.f388585g;
    }

    public final int hashCode() {
        return this.f388580b.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234090i(parcel, 2, this.f388579a);
        C143947c.m234106y(parcel, 3, this.f388580b);
        C143947c.m234090i(parcel, 4, this.f388581c);
        C143947c.m234084c(parcel, 5, this.f388582d);
        C143947c.m234107z(parcel, 6, this.f388583e);
        C143947c.m234084c(parcel, 7, this.f388584f);
        C143947c.m234084c(parcel, 8, this.f388585g);
        C143947c.m234083b(parcel, a);
    }
}
