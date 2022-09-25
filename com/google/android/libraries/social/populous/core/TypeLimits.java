package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.android.p3287a.C42162a;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58597ky;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
public final class TypeLimits implements Iterable, Parcelable {
    public static final Parcelable.Creator CREATOR = new C42342dn();

    /* renamed from: a */
    public final C58485gu f110830a;

    /* compiled from: PG */
    public final class TypeLimitSet implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C42343do();

        /* renamed from: a */
        public final C58528ij f110831a;

        /* renamed from: b */
        public final int f110832b;

        public TypeLimitSet(C58528ij ijVar, int i) {
            this.f110831a = ijVar;
            this.f110832b = i;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof TypeLimitSet) {
                TypeLimitSet typeLimitSet = (TypeLimitSet) obj;
                return C58832aw.m90831a(this.f110831a, typeLimitSet.f110831a) && this.f110832b == typeLimitSet.f110832b;
            }
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f110831a, Integer.valueOf(this.f110832b)});
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C42162a.m74081e(parcel, this.f110831a);
            parcel.writeInt(this.f110832b);
        }
    }

    public TypeLimits(C58485gu guVar) {
        this.f110830a = guVar;
    }

    /* renamed from: a */
    public final int mo45171a(C42309ch chVar) {
        for (int i = 0; i < this.f110830a.size(); i++) {
            if (((TypeLimitSet) this.f110830a.get(i)).f110831a.contains(chVar)) {
                return i;
            }
        }
        return -1;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TypeLimits) {
            return C58597ky.m90218i(this.f110830a, ((TypeLimits) obj).f110830a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f110830a.hashCode();
    }

    public final Iterator iterator() {
        return this.f110830a.listIterator(0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f110830a);
    }
}
