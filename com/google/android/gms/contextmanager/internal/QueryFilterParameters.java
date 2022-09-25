package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class QueryFilterParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144056ab();

    /* renamed from: a */
    public final int f390325a;

    /* renamed from: b */
    public final int f390326b;

    /* renamed from: c */
    public final int[] f390327c;

    public QueryFilterParameters(int i, int i2, int[] iArr) {
        this.f390325a = i;
        this.f390326b = i2;
        this.f390327c = iArr;
    }

    /* renamed from: a */
    public final boolean mo119595a() {
        return this.f390327c != null;
    }

    public final boolean equals(Object obj) {
        int[] iArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QueryFilterParameters)) {
            return false;
        }
        QueryFilterParameters queryFilterParameters = (QueryFilterParameters) obj;
        if (queryFilterParameters.f390326b != this.f390326b || queryFilterParameters.f390325a != this.f390325a || mo119595a() != queryFilterParameters.mo119595a()) {
            return false;
        }
        if (mo119595a()) {
            int[] iArr2 = this.f390327c;
            if (iArr2 == null || (iArr = queryFilterParameters.f390327c) == null) {
                return iArr2 == queryFilterParameters.f390327c;
            }
            int length = iArr2.length;
            int length2 = iArr.length;
            if (length == length2) {
                int i = 0;
                while (i < length2) {
                    int i2 = iArr[i];
                    int[] iArr3 = this.f390327c;
                    int length3 = iArr3.length;
                    int i3 = 0;
                    while (i3 < length3) {
                        if (iArr3[i3] == i2) {
                            i++;
                        } else {
                            i3++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int[] iArr = this.f390327c;
        if (iArr != null) {
            i = 0;
            for (int i2 : iArr) {
                i += i2 * 13;
            }
        } else {
            i = 0;
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(i), Integer.valueOf(this.f390325a), Integer.valueOf(this.f390326b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f390325a);
        C143947c.m234089h(parcel, 3, this.f390326b);
        C143947c.m234099r(parcel, 4, this.f390327c);
        C143947c.m234083b(parcel, a);
    }
}
