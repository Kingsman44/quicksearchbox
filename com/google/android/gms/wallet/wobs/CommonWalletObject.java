package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;

/* compiled from: PG */
public class CommonWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146385a();

    /* renamed from: a */
    public String f395417a;

    /* renamed from: b */
    String f395418b;

    /* renamed from: c */
    String f395419c;

    /* renamed from: d */
    String f395420d;

    /* renamed from: e */
    String f395421e;

    /* renamed from: f */
    String f395422f;

    /* renamed from: g */
    String f395423g;
    @Deprecated

    /* renamed from: h */
    String f395424h;

    /* renamed from: i */
    int f395425i;

    /* renamed from: j */
    ArrayList f395426j;

    /* renamed from: k */
    TimeInterval f395427k;

    /* renamed from: l */
    ArrayList f395428l;
    @Deprecated

    /* renamed from: m */
    String f395429m;
    @Deprecated

    /* renamed from: n */
    String f395430n;

    /* renamed from: o */
    ArrayList f395431o;

    /* renamed from: p */
    boolean f395432p;

    /* renamed from: q */
    ArrayList f395433q;

    /* renamed from: r */
    ArrayList f395434r;

    /* renamed from: s */
    ArrayList f395435s;

    public CommonWalletObject() {
        this.f395426j = new ArrayList();
        this.f395428l = new ArrayList();
        this.f395431o = new ArrayList();
        this.f395433q = new ArrayList();
        this.f395434r = new ArrayList();
        this.f395435s = new ArrayList();
    }

    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.f395417a = str;
        this.f395418b = str2;
        this.f395419c = str3;
        this.f395420d = str4;
        this.f395421e = str5;
        this.f395422f = str6;
        this.f395423g = str7;
        this.f395424h = str8;
        this.f395425i = i;
        this.f395426j = arrayList;
        this.f395427k = timeInterval;
        this.f395428l = arrayList2;
        this.f395429m = str9;
        this.f395430n = str10;
        this.f395431o = arrayList3;
        this.f395432p = z;
        this.f395433q = arrayList4;
        this.f395434r = arrayList5;
        this.f395435s = arrayList6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f395417a);
        C143947c.m234106y(parcel, 3, this.f395418b);
        C143947c.m234106y(parcel, 4, this.f395419c);
        C143947c.m234106y(parcel, 5, this.f395420d);
        C143947c.m234106y(parcel, 6, this.f395421e);
        C143947c.m234106y(parcel, 7, this.f395422f);
        C143947c.m234106y(parcel, 8, this.f395423g);
        C143947c.m234106y(parcel, 9, this.f395424h);
        C143947c.m234089h(parcel, 10, this.f395425i);
        C143947c.m234080C(parcel, 11, this.f395426j);
        C143947c.m234105x(parcel, 12, this.f395427k, i);
        C143947c.m234080C(parcel, 13, this.f395428l);
        C143947c.m234106y(parcel, 14, this.f395429m);
        C143947c.m234106y(parcel, 15, this.f395430n);
        C143947c.m234080C(parcel, 16, this.f395431o);
        C143947c.m234084c(parcel, 17, this.f395432p);
        C143947c.m234080C(parcel, 18, this.f395433q);
        C143947c.m234080C(parcel, 19, this.f395434r);
        C143947c.m234080C(parcel, 20, this.f395435s);
        C143947c.m234083b(parcel, a);
    }
}
