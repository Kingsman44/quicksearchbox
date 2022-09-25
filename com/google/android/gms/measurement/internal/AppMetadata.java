package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.List;

/* compiled from: PG */
public class AppMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145500p();

    /* renamed from: a */
    public final String f392500a;

    /* renamed from: b */
    public final String f392501b;

    /* renamed from: c */
    public final String f392502c;

    /* renamed from: d */
    public final String f392503d;

    /* renamed from: e */
    public final long f392504e;

    /* renamed from: f */
    public final long f392505f;

    /* renamed from: g */
    public final String f392506g;

    /* renamed from: h */
    public final boolean f392507h;

    /* renamed from: i */
    public final boolean f392508i;

    /* renamed from: j */
    public final long f392509j;

    /* renamed from: k */
    public final String f392510k;
    @Deprecated

    /* renamed from: l */
    public final long f392511l;

    /* renamed from: m */
    public final long f392512m;

    /* renamed from: n */
    public final int f392513n;

    /* renamed from: o */
    public final boolean f392514o;

    /* renamed from: p */
    public final boolean f392515p;

    /* renamed from: q */
    public final String f392516q;

    /* renamed from: r */
    public final Boolean f392517r;

    /* renamed from: s */
    public final long f392518s;

    /* renamed from: t */
    public final List f392519t;

    /* renamed from: u */
    public final String f392520u;

    /* renamed from: v */
    public final String f392521v;

    /* renamed from: w */
    public final String f392522w;

    /* renamed from: x */
    public final String f392523x;

    public AppMetadata(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, String str7, Boolean bool, long j5, List list, String str8, String str9, String str10) {
        C143919bh.m233969l(str);
        this.f392500a = str;
        this.f392501b = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f392502c = str3;
        this.f392509j = j;
        this.f392503d = str4;
        this.f392504e = j2;
        this.f392505f = j3;
        this.f392506g = str5;
        this.f392507h = z;
        this.f392508i = z2;
        this.f392510k = str6;
        this.f392511l = 0;
        this.f392512m = j4;
        this.f392513n = i;
        this.f392514o = z3;
        this.f392515p = z4;
        this.f392516q = str7;
        this.f392517r = bool;
        this.f392518s = j5;
        this.f392519t = list;
        this.f392520u = null;
        this.f392521v = str8;
        this.f392522w = str9;
        this.f392523x = str10;
    }

    public AppMetadata(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List list, String str8, String str9, String str10, String str11) {
        this.f392500a = str;
        this.f392501b = str2;
        this.f392502c = str3;
        this.f392509j = j3;
        this.f392503d = str4;
        this.f392504e = j;
        this.f392505f = j2;
        this.f392506g = str5;
        this.f392507h = z;
        this.f392508i = z2;
        this.f392510k = str6;
        this.f392511l = j4;
        this.f392512m = j5;
        this.f392513n = i;
        this.f392514o = z3;
        this.f392515p = z4;
        this.f392516q = str7;
        this.f392517r = bool;
        this.f392518s = j6;
        this.f392519t = list;
        this.f392520u = str8;
        this.f392521v = str9;
        this.f392522w = str10;
        this.f392523x = str11;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f392500a);
        C143947c.m234106y(parcel, 3, this.f392501b);
        C143947c.m234106y(parcel, 4, this.f392502c);
        C143947c.m234106y(parcel, 5, this.f392503d);
        C143947c.m234090i(parcel, 6, this.f392504e);
        C143947c.m234090i(parcel, 7, this.f392505f);
        C143947c.m234106y(parcel, 8, this.f392506g);
        C143947c.m234084c(parcel, 9, this.f392507h);
        C143947c.m234084c(parcel, 10, this.f392508i);
        C143947c.m234090i(parcel, 11, this.f392509j);
        C143947c.m234106y(parcel, 12, this.f392510k);
        C143947c.m234090i(parcel, 13, this.f392511l);
        C143947c.m234090i(parcel, 14, this.f392512m);
        C143947c.m234089h(parcel, 15, this.f392513n);
        C143947c.m234084c(parcel, 16, this.f392514o);
        C143947c.m234084c(parcel, 18, this.f392515p);
        C143947c.m234106y(parcel, 19, this.f392516q);
        C143947c.m234092k(parcel, 21, this.f392517r);
        C143947c.m234090i(parcel, 22, this.f392518s);
        C143947c.m234078A(parcel, 23, this.f392519t);
        C143947c.m234106y(parcel, 24, this.f392520u);
        C143947c.m234106y(parcel, 25, this.f392521v);
        C143947c.m234106y(parcel, 26, this.f392522w);
        C143947c.m234106y(parcel, 27, this.f392523x);
        C143947c.m234083b(parcel, a);
    }
}
