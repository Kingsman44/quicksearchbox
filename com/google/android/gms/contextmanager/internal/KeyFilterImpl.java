package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
public class KeyFilterImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144083y();

    /* renamed from: a */
    public final ArrayList f390321a;

    /* compiled from: PG */
    public class Inclusion extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C144084z();

        /* renamed from: a */
        public final String[] f390322a;

        /* renamed from: b */
        public final String[] f390323b;

        /* renamed from: c */
        public final String[] f390324c;

        public Inclusion(String[] strArr, String[] strArr2, String[] strArr3) {
            this.f390322a = strArr;
            this.f390323b = strArr2;
            this.f390324c = strArr3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Inclusion)) {
                return false;
            }
            Inclusion inclusion = (Inclusion) obj;
            return Arrays.equals(this.f390322a, inclusion.f390322a) && Arrays.equals(this.f390323b, inclusion.f390323b) && Arrays.equals(this.f390324c, inclusion.f390324c);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f390322a) + Arrays.hashCode(this.f390323b) + Arrays.hashCode(this.f390324c);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C143947c.m234082a(parcel, 20293);
            C143947c.m234107z(parcel, 2, this.f390322a);
            C143947c.m234107z(parcel, 3, this.f390323b);
            C143947c.m234107z(parcel, 4, this.f390324c);
            C143947c.m234083b(parcel, a);
        }
    }

    public KeyFilterImpl(ArrayList arrayList) {
        this.f390321a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyFilterImpl)) {
            return false;
        }
        return this.f390321a.equals(((KeyFilterImpl) obj).f390321a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f390321a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 2, this.f390321a);
        C143947c.m234083b(parcel, a);
    }
}
