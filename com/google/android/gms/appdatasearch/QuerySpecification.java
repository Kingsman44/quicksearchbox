package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.List;

/* compiled from: PG */
public class QuerySpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142788ad();

    /* renamed from: a */
    public final boolean f387495a;

    /* renamed from: b */
    public final List f387496b;

    /* renamed from: c */
    public final List f387497c;

    /* renamed from: d */
    public final boolean f387498d;

    /* renamed from: e */
    public final int f387499e;

    /* renamed from: f */
    public final int f387500f;

    /* renamed from: g */
    public final boolean f387501g;

    /* renamed from: h */
    public final int f387502h;

    /* renamed from: i */
    public final boolean f387503i;

    /* renamed from: j */
    public final int[] f387504j;

    /* renamed from: k */
    public final byte[] f387505k;

    /* renamed from: l */
    public final STSortSpec f387506l;

    /* renamed from: m */
    public final String f387507m;

    /* renamed from: n */
    public final CacheSpec f387508n;

    public QuerySpecification(boolean z, List list, List list2, boolean z2, int i, int i2, boolean z3, int i3, boolean z4, int[] iArr, byte[] bArr, STSortSpec sTSortSpec, String str, CacheSpec cacheSpec) {
        this.f387495a = z;
        this.f387496b = list;
        this.f387497c = list2;
        this.f387498d = z2;
        this.f387499e = i;
        this.f387500f = i2;
        this.f387501g = z3;
        this.f387502h = i3;
        this.f387503i = z4;
        this.f387504j = iArr;
        this.f387505k = bArr;
        this.f387506l = sTSortSpec;
        this.f387507m = str;
        this.f387508n = cacheSpec;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234084c(parcel, 1, this.f387495a);
        C143947c.m234078A(parcel, 2, this.f387496b);
        C143947c.m234080C(parcel, 3, this.f387497c);
        C143947c.m234084c(parcel, 4, this.f387498d);
        C143947c.m234089h(parcel, 5, this.f387499e);
        C143947c.m234089h(parcel, 6, this.f387500f);
        C143947c.m234084c(parcel, 7, this.f387501g);
        C143947c.m234089h(parcel, 8, this.f387502h);
        C143947c.m234084c(parcel, 9, this.f387503i);
        C143947c.m234099r(parcel, 10, this.f387504j);
        C143947c.m234094m(parcel, 11, this.f387505k);
        C143947c.m234105x(parcel, 12, this.f387506l, i);
        C143947c.m234106y(parcel, 13, this.f387507m);
        C143947c.m234105x(parcel, 15, this.f387508n, i);
        C143947c.m234083b(parcel, a);
    }
}
