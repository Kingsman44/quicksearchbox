package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TimeInterval;
import java.util.ArrayList;

/* compiled from: PG */
public final class LoyaltyWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146366g();

    /* renamed from: a */
    String f395293a;

    /* renamed from: b */
    String f395294b;

    /* renamed from: c */
    String f395295c;

    /* renamed from: d */
    String f395296d;

    /* renamed from: e */
    String f395297e;

    /* renamed from: f */
    String f395298f;

    /* renamed from: g */
    String f395299g;

    /* renamed from: h */
    String f395300h;
    @Deprecated

    /* renamed from: i */
    String f395301i;

    /* renamed from: j */
    String f395302j;

    /* renamed from: k */
    int f395303k;

    /* renamed from: l */
    ArrayList f395304l;

    /* renamed from: m */
    TimeInterval f395305m;

    /* renamed from: n */
    ArrayList f395306n;
    @Deprecated

    /* renamed from: o */
    String f395307o;
    @Deprecated

    /* renamed from: p */
    String f395308p;

    /* renamed from: q */
    ArrayList f395309q;

    /* renamed from: r */
    boolean f395310r;

    /* renamed from: s */
    ArrayList f395311s;

    /* renamed from: t */
    ArrayList f395312t;

    /* renamed from: u */
    ArrayList f395313u;

    /* renamed from: v */
    LoyaltyPoints f395314v;

    LoyaltyWalletObject() {
        this.f395304l = new ArrayList();
        this.f395306n = new ArrayList();
        this.f395309q = new ArrayList();
        this.f395311s = new ArrayList();
        this.f395312t = new ArrayList();
        this.f395313u = new ArrayList();
    }

    public LoyaltyWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, LoyaltyPoints loyaltyPoints) {
        this.f395293a = str;
        this.f395294b = str2;
        this.f395295c = str3;
        this.f395296d = str4;
        this.f395297e = str5;
        this.f395298f = str6;
        this.f395299g = str7;
        this.f395300h = str8;
        this.f395301i = str9;
        this.f395302j = str10;
        this.f395303k = i;
        this.f395304l = arrayList;
        this.f395305m = timeInterval;
        this.f395306n = arrayList2;
        this.f395307o = str11;
        this.f395308p = str12;
        this.f395309q = arrayList3;
        this.f395310r = z;
        this.f395311s = arrayList4;
        this.f395312t = arrayList5;
        this.f395313u = arrayList6;
        this.f395314v = loyaltyPoints;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f395293a);
        C143947c.m234106y(parcel, 3, this.f395294b);
        C143947c.m234106y(parcel, 4, this.f395295c);
        C143947c.m234106y(parcel, 5, this.f395296d);
        C143947c.m234106y(parcel, 6, this.f395297e);
        C143947c.m234106y(parcel, 7, this.f395298f);
        C143947c.m234106y(parcel, 8, this.f395299g);
        C143947c.m234106y(parcel, 9, this.f395300h);
        C143947c.m234106y(parcel, 10, this.f395301i);
        C143947c.m234106y(parcel, 11, this.f395302j);
        C143947c.m234089h(parcel, 12, this.f395303k);
        C143947c.m234080C(parcel, 13, this.f395304l);
        C143947c.m234105x(parcel, 14, this.f395305m, i);
        C143947c.m234080C(parcel, 15, this.f395306n);
        C143947c.m234106y(parcel, 16, this.f395307o);
        C143947c.m234106y(parcel, 17, this.f395308p);
        C143947c.m234080C(parcel, 18, this.f395309q);
        C143947c.m234084c(parcel, 19, this.f395310r);
        C143947c.m234080C(parcel, 20, this.f395311s);
        C143947c.m234080C(parcel, 21, this.f395312t);
        C143947c.m234080C(parcel, 22, this.f395313u);
        C143947c.m234105x(parcel, 23, this.f395314v, i);
        C143947c.m234083b(parcel, a);
    }
}
