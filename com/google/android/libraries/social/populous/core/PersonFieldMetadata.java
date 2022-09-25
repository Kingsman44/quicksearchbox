package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.android.p3287a.C42162a;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.p4420by.p4425c.p4428b.p4429a.p4432b.C57885b;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;

/* compiled from: PG */
public final class PersonFieldMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42317cp();

    /* renamed from: a */
    public PeopleApiAffinity f110784a;

    /* renamed from: b */
    public double f110785b;

    /* renamed from: c */
    public int f110786c;

    /* renamed from: d */
    public int f110787d;

    /* renamed from: e */
    public boolean f110788e;

    /* renamed from: f */
    public boolean f110789f;

    /* renamed from: g */
    public C58485gu f110790g;

    /* renamed from: h */
    public C58485gu f110791h;

    /* renamed from: i */
    public EnumSet f110792i;

    /* renamed from: j */
    public C58485gu f110793j;

    /* renamed from: k */
    public final boolean f110794k;

    /* renamed from: l */
    public final boolean f110795l;

    /* renamed from: m */
    public final boolean f110796m;

    /* renamed from: n */
    public final boolean f110797n;

    /* renamed from: o */
    public final boolean f110798o;

    /* renamed from: p */
    public final boolean f110799p;

    /* renamed from: q */
    public final String f110800q;

    /* renamed from: r */
    public final String f110801r;

    /* renamed from: s */
    public final Long f110802s;

    /* renamed from: t */
    public final C57885b f110803t;

    /* renamed from: u */
    public final int f110804u;

    public PersonFieldMetadata(PeopleApiAffinity peopleApiAffinity, double d, int i, int i2, boolean z, boolean z2, List list, List list2, Collection collection, List list3, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i3, String str, String str2, Long l, C57885b bVar) {
        this.f110784a = peopleApiAffinity;
        this.f110785b = d;
        this.f110786c = i;
        this.f110787d = i2;
        this.f110788e = z;
        this.f110789f = z2;
        this.f110790g = C58485gu.m89842j(list);
        this.f110791h = C58485gu.m89835E(list2);
        EnumSet<E> noneOf = EnumSet.noneOf(C42331dc.class);
        Collection collection2 = collection;
        C58557jl.m90136q(noneOf, collection);
        this.f110792i = noneOf;
        this.f110793j = C58485gu.m89842j(list3);
        this.f110794k = z3;
        this.f110795l = z4;
        this.f110796m = z5;
        this.f110797n = z6;
        this.f110798o = z7;
        this.f110799p = z8;
        this.f110804u = i3;
        this.f110800q = str;
        this.f110801r = str2;
        this.f110802s = l;
        this.f110803t = bVar;
    }

    /* renamed from: a */
    public final String mo45153a() {
        if (C42283bi.m74439c(this.f110804u) && this.f110795l) {
            return this.f110800q;
        }
        EdgeKeyInfo edgeKeyInfo = (EdgeKeyInfo) C58557jl.m90122c(this.f110791h, C42316co.f110973a).mo56111f();
        if (edgeKeyInfo != null) {
            return edgeKeyInfo.mo45136a();
        }
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PersonFieldMetadata) {
            PersonFieldMetadata personFieldMetadata = (PersonFieldMetadata) obj;
            if (C58832aw.m90831a(this.f110784a, personFieldMetadata.f110784a) && Double.doubleToLongBits(this.f110785b) == Double.doubleToLongBits(personFieldMetadata.f110785b) && this.f110786c == personFieldMetadata.f110786c && this.f110787d == personFieldMetadata.f110787d && this.f110788e == personFieldMetadata.f110788e && this.f110789f == personFieldMetadata.f110789f && C58832aw.m90831a(this.f110790g, personFieldMetadata.f110790g) && C58832aw.m90831a(this.f110791h, personFieldMetadata.f110791h) && C58832aw.m90831a(this.f110792i, personFieldMetadata.f110792i) && C58832aw.m90831a(this.f110793j, personFieldMetadata.f110793j) && this.f110794k == personFieldMetadata.f110794k && this.f110795l == personFieldMetadata.f110795l && this.f110796m == personFieldMetadata.f110796m && this.f110797n == personFieldMetadata.f110797n && this.f110798o == personFieldMetadata.f110798o && this.f110799p == personFieldMetadata.f110799p) {
                int i = this.f110804u;
                int i2 = personFieldMetadata.f110804u;
                if (i != 0) {
                    return i == i2 && C58832aw.m90831a(this.f110800q, personFieldMetadata.f110800q) && C58832aw.m90831a(this.f110801r, personFieldMetadata.f110801r) && C58832aw.m90831a(this.f110802s, personFieldMetadata.f110802s) && C58832aw.m90831a(this.f110803t, personFieldMetadata.f110803t);
                }
                throw null;
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        parcel.writeParcelable(this.f110784a, 0);
        parcel.writeDouble(this.f110785b);
        parcel.writeInt(this.f110786c);
        parcel.writeInt(this.f110787d);
        parcel.writeInt(this.f110788e ? 1 : 0);
        parcel.writeInt(this.f110789f ? 1 : 0);
        parcel.writeParcelableList(this.f110790g, 0);
        parcel.writeParcelableList(this.f110791h, 0);
        C42162a.m74081e(parcel, this.f110792i);
        parcel.writeParcelableList(this.f110793j, 0);
        parcel.writeInt(this.f110794k ? 1 : 0);
        parcel.writeInt(this.f110795l ? 1 : 0);
        parcel.writeInt(this.f110796m ? 1 : 0);
        parcel.writeInt(this.f110797n ? 1 : 0);
        parcel.writeInt(this.f110798o ? 1 : 0);
        parcel.writeInt(this.f110799p ? 1 : 0);
        int i3 = this.f110804u;
        int i4 = i3 - 1;
        if (i3 != 0) {
            parcel.writeInt(i4);
            parcel.writeString(this.f110800q);
            parcel.writeString(this.f110801r);
            if (this.f110802s != null) {
                i2 = 1;
            }
            parcel.writeInt(i2);
            Long l = this.f110802s;
            if (l != null) {
                parcel.writeLong(l.longValue());
            }
            C42162a.m74082f(parcel, this.f110803t);
            return;
        }
        throw null;
    }

    public final int hashCode() {
        Object[] objArr = new Object[21];
        objArr[0] = this.f110784a;
        objArr[1] = Double.valueOf(this.f110785b);
        objArr[2] = Integer.valueOf(this.f110786c);
        objArr[3] = Integer.valueOf(this.f110787d);
        objArr[4] = Boolean.valueOf(this.f110788e);
        objArr[5] = Boolean.valueOf(this.f110789f);
        objArr[6] = this.f110790g;
        objArr[7] = this.f110791h;
        objArr[8] = this.f110792i;
        objArr[9] = this.f110793j;
        objArr[10] = Boolean.valueOf(this.f110794k);
        objArr[11] = Boolean.valueOf(this.f110795l);
        objArr[12] = Boolean.valueOf(this.f110796m);
        objArr[13] = Boolean.valueOf(this.f110797n);
        objArr[14] = Boolean.valueOf(this.f110798o);
        objArr[15] = Boolean.valueOf(this.f110799p);
        int i = this.f110804u;
        if (i != 0) {
            objArr[16] = Integer.valueOf(i);
            objArr[17] = this.f110800q;
            objArr[18] = this.f110801r;
            objArr[19] = this.f110802s;
            objArr[20] = this.f110803t;
            return Arrays.hashCode(objArr);
        }
        throw null;
    }
}
