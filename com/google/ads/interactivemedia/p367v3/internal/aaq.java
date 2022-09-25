package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aaq */
/* compiled from: PG */
public final class aaq extends abe {
    public static final Parcelable.Creator CREATOR = new aap();

    /* renamed from: a */
    public static final aaq f20093a = new aar().mo14357a();

    /* renamed from: F */
    private final SparseArray f20094F;

    /* renamed from: G */
    private final SparseBooleanArray f20095G;

    /* renamed from: b */
    public final int f20096b;

    /* renamed from: c */
    public final int f20097c;

    /* renamed from: d */
    public final int f20098d;

    /* renamed from: e */
    public final int f20099e;

    /* renamed from: f */
    public final int f20100f;

    /* renamed from: g */
    public final int f20101g;

    /* renamed from: h */
    public final int f20102h;

    /* renamed from: i */
    public final int f20103i;

    /* renamed from: j */
    public final boolean f20104j;

    /* renamed from: k */
    public final boolean f20105k;

    /* renamed from: l */
    public final boolean f20106l;

    /* renamed from: m */
    public final int f20107m;

    /* renamed from: n */
    public final int f20108n;

    /* renamed from: o */
    public final boolean f20109o;

    /* renamed from: p */
    public final int f20110p;

    /* renamed from: q */
    public final int f20111q;

    /* renamed from: r */
    public final boolean f20112r;

    /* renamed from: s */
    public final boolean f20113s;

    /* renamed from: t */
    public final boolean f20114t;

    /* renamed from: u */
    public final boolean f20115u;

    /* renamed from: v */
    public final boolean f20116v;

    /* renamed from: w */
    public final boolean f20117w;

    /* renamed from: x */
    public final boolean f20118x;

    /* renamed from: y */
    public final int f20119y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aaq(int i, int i2, int i3, int i4, boolean z, boolean z2, int i5, int i6, boolean z3, arn arn, int i7, int i8, boolean z4, arn arn2, int i9, boolean z5, SparseArray sparseArray, SparseBooleanArray sparseBooleanArray) {
        super(arn, arn2, i9);
        arn arn3 = arn;
        this.f20096b = i;
        this.f20097c = i2;
        this.f20098d = i3;
        this.f20099e = i4;
        this.f20100f = 0;
        this.f20101g = 0;
        this.f20102h = 0;
        this.f20103i = 0;
        this.f20104j = z;
        this.f20105k = false;
        this.f20106l = z2;
        this.f20107m = i5;
        this.f20108n = i6;
        this.f20109o = z3;
        this.f20110p = i7;
        this.f20111q = i8;
        this.f20112r = z4;
        this.f20113s = false;
        this.f20114t = false;
        this.f20115u = false;
        this.f20116v = false;
        this.f20117w = false;
        this.f20118x = z5;
        this.f20119y = 0;
        this.f20094F = sparseArray;
        this.f20095G = sparseBooleanArray;
    }

    /* renamed from: a */
    public static aaq m18084a(Context context) {
        return new aar(context).mo14357a();
    }

    /* renamed from: b */
    public final boolean mo14350b(int i) {
        return this.f20095G.get(i);
    }

    /* renamed from: c */
    public final boolean mo14351c(int i, C7362vj vjVar) {
        Map map = (Map) this.f20094F.get(i);
        return map != null && map.containsKey(vjVar);
    }

    /* renamed from: d */
    public final aat mo14352d(int i, C7362vj vjVar) {
        Map map = (Map) this.f20094F.get(i);
        if (map != null) {
            return (aat) map.get(vjVar);
        }
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aaq aaq = (aaq) obj;
            if (super.equals(obj) && this.f20096b == aaq.f20096b && this.f20097c == aaq.f20097c && this.f20098d == aaq.f20098d && this.f20099e == aaq.f20099e && this.f20100f == aaq.f20100f && this.f20101g == aaq.f20101g && this.f20102h == aaq.f20102h && this.f20103i == aaq.f20103i && this.f20104j == aaq.f20104j && this.f20105k == aaq.f20105k && this.f20106l == aaq.f20106l && this.f20109o == aaq.f20109o && this.f20107m == aaq.f20107m && this.f20108n == aaq.f20108n && this.f20110p == aaq.f20110p && this.f20111q == aaq.f20111q && this.f20112r == aaq.f20112r && this.f20113s == aaq.f20113s && this.f20114t == aaq.f20114t && this.f20115u == aaq.f20115u && this.f20116v == aaq.f20116v && this.f20117w == aaq.f20117w && this.f20118x == aaq.f20118x && this.f20119y == aaq.f20119y) {
                SparseBooleanArray sparseBooleanArray = this.f20095G;
                SparseBooleanArray sparseBooleanArray2 = aaq.f20095G;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.f20094F;
                            SparseArray sparseArray2 = aaq.f20094F;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                int i2 = 0;
                                while (i2 < size2) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                C7362vj vjVar = (C7362vj) entry.getKey();
                                                if (map2.containsKey(vjVar)) {
                                                    if (!aeu.m18533c(entry.getValue(), map2.get(vjVar))) {
                                                    }
                                                }
                                            }
                                            i2++;
                                        }
                                    }
                                }
                                return true;
                            }
                        } else if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.f20096b) * 31) + this.f20097c) * 31) + this.f20098d) * 31) + this.f20099e) * 31) + this.f20100f) * 31) + this.f20101g) * 31) + this.f20102h) * 31) + this.f20103i) * 31) + (this.f20104j ? 1 : 0)) * 31) + (this.f20105k ? 1 : 0)) * 31) + (this.f20106l ? 1 : 0)) * 31) + (this.f20109o ? 1 : 0)) * 31) + this.f20107m) * 31) + this.f20108n) * 31) + this.f20110p) * 31) + this.f20111q) * 31) + (this.f20112r ? 1 : 0)) * 31) + (this.f20113s ? 1 : 0)) * 31) + (this.f20114t ? 1 : 0)) * 31) + (this.f20115u ? 1 : 0)) * 31) + (this.f20116v ? 1 : 0)) * 31) + (this.f20117w ? 1 : 0)) * 31) + (this.f20118x ? 1 : 0)) * 31) + this.f20119y;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f20096b);
        parcel.writeInt(this.f20097c);
        parcel.writeInt(this.f20098d);
        parcel.writeInt(this.f20099e);
        parcel.writeInt(this.f20100f);
        parcel.writeInt(this.f20101g);
        parcel.writeInt(this.f20102h);
        parcel.writeInt(this.f20103i);
        aeu.m18550t(parcel, this.f20104j);
        aeu.m18550t(parcel, this.f20105k);
        aeu.m18550t(parcel, this.f20106l);
        parcel.writeInt(this.f20107m);
        parcel.writeInt(this.f20108n);
        aeu.m18550t(parcel, this.f20109o);
        parcel.writeInt(this.f20110p);
        parcel.writeInt(this.f20111q);
        aeu.m18550t(parcel, this.f20112r);
        aeu.m18550t(parcel, this.f20113s);
        aeu.m18550t(parcel, this.f20114t);
        aeu.m18550t(parcel, this.f20115u);
        aeu.m18550t(parcel, this.f20116v);
        aeu.m18550t(parcel, this.f20117w);
        aeu.m18550t(parcel, this.f20118x);
        parcel.writeInt(this.f20119y);
        SparseArray sparseArray = this.f20094F;
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            Map map = (Map) sparseArray.valueAt(i2);
            int size2 = map.size();
            parcel.writeInt(keyAt);
            parcel.writeInt(size2);
            for (Map.Entry entry : map.entrySet()) {
                parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                parcel.writeParcelable((Parcelable) entry.getValue(), 0);
            }
        }
        parcel.writeSparseBooleanArray(this.f20095G);
    }

    public aaq(Parcel parcel) {
        super(parcel);
        this.f20096b = parcel.readInt();
        this.f20097c = parcel.readInt();
        this.f20098d = parcel.readInt();
        this.f20099e = parcel.readInt();
        this.f20100f = parcel.readInt();
        this.f20101g = parcel.readInt();
        this.f20102h = parcel.readInt();
        this.f20103i = parcel.readInt();
        this.f20104j = aeu.m18549s(parcel);
        this.f20105k = aeu.m18549s(parcel);
        this.f20106l = aeu.m18549s(parcel);
        this.f20107m = parcel.readInt();
        this.f20108n = parcel.readInt();
        this.f20109o = aeu.m18549s(parcel);
        this.f20110p = parcel.readInt();
        this.f20111q = parcel.readInt();
        this.f20112r = aeu.m18549s(parcel);
        this.f20113s = aeu.m18549s(parcel);
        this.f20114t = aeu.m18549s(parcel);
        this.f20115u = aeu.m18549s(parcel);
        this.f20116v = aeu.m18549s(parcel);
        this.f20117w = aeu.m18549s(parcel);
        this.f20118x = aeu.m18549s(parcel);
        this.f20119y = parcel.readInt();
        int readInt = parcel.readInt();
        SparseArray sparseArray = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            HashMap hashMap = new HashMap(readInt3);
            for (int i2 = 0; i2 < readInt3; i2++) {
                C7362vj vjVar = (C7362vj) parcel.readParcelable(C7362vj.class.getClassLoader());
                ary.m19467t(vjVar);
                hashMap.put(vjVar, (aat) parcel.readParcelable(aat.class.getClassLoader()));
            }
            sparseArray.put(readInt2, hashMap);
        }
        this.f20094F = sparseArray;
        this.f20095G = parcel.readSparseBooleanArray();
    }
}
