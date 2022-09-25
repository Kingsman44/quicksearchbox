package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143859d();

    /* renamed from: a */
    public final String f389577a;
    @Deprecated

    /* renamed from: b */
    public final int f389578b;

    /* renamed from: c */
    private final long f389579c;

    public Feature(String str, int i, long j) {
        this.f389577a = str;
        this.f389578b = i;
        this.f389579c = j;
    }

    public Feature(String str, long j) {
        this.f389577a = str;
        this.f389579c = j;
        this.f389578b = -1;
    }

    /* renamed from: a */
    public final long mo119073a() {
        long j = this.f389579c;
        return j == -1 ? (long) this.f389578b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            String str = this.f389577a;
            if (((str == null || !str.equals(feature.f389577a)) && (this.f389577a != null || feature.f389577a != null)) || mo119073a() != feature.mo119073a()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f389577a, Long.valueOf(mo119073a())});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("name", this.f389577a, arrayList);
        C143910az.m233947b("version", Long.valueOf(mo119073a()), arrayList);
        return C143910az.m233946a(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f389577a);
        C143947c.m234089h(parcel, 2, this.f389578b);
        C143947c.m234090i(parcel, 3, mo119073a());
        C143947c.m234083b(parcel, a);
    }
}
