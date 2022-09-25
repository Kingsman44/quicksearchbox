package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public class CastOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143431g();

    /* renamed from: a */
    public String f388829a;

    /* renamed from: b */
    public final List f388830b;

    /* renamed from: c */
    public boolean f388831c;

    /* renamed from: d */
    public LaunchOptions f388832d;

    /* renamed from: e */
    public final boolean f388833e;

    /* renamed from: f */
    public final CastMediaOptions f388834f;

    /* renamed from: g */
    public final boolean f388835g;

    /* renamed from: h */
    public final double f388836h;

    /* renamed from: i */
    public final boolean f388837i;

    /* renamed from: j */
    public final boolean f388838j;

    /* renamed from: k */
    public final boolean f388839k;

    /* renamed from: l */
    public List f388840l;

    /* renamed from: m */
    public final boolean f388841m;

    /* renamed from: n */
    public final int f388842n;

    public CastOptions(String str, List list, boolean z, LaunchOptions launchOptions, boolean z2, CastMediaOptions castMediaOptions, boolean z3, double d, boolean z4, boolean z5, boolean z6, List list2, boolean z7, int i) {
        int i2;
        List list3 = list;
        this.f388829a = true == TextUtils.isEmpty(str) ? BuildConfig.FLAVOR : str;
        if (list3 == null) {
            i2 = 0;
        } else {
            i2 = list.size();
        }
        ArrayList arrayList = new ArrayList(i2);
        this.f388830b = arrayList;
        if (i2 > 0) {
            arrayList.addAll(list);
        }
        this.f388831c = z;
        this.f388832d = launchOptions == null ? new LaunchOptions() : launchOptions;
        this.f388833e = z2;
        this.f388834f = castMediaOptions;
        this.f388835g = z3;
        this.f388836h = d;
        this.f388837i = z4;
        this.f388838j = z5;
        this.f388839k = z6;
        this.f388840l = list2;
        this.f388841m = z7;
        this.f388842n = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f388829a);
        C143947c.m234078A(parcel, 3, Collections.unmodifiableList(this.f388830b));
        C143947c.m234084c(parcel, 4, this.f388831c);
        C143947c.m234105x(parcel, 5, this.f388832d, i);
        C143947c.m234084c(parcel, 6, this.f388833e);
        C143947c.m234105x(parcel, 7, this.f388834f, i);
        C143947c.m234084c(parcel, 8, this.f388835g);
        C143947c.m234086e(parcel, 9, this.f388836h);
        C143947c.m234084c(parcel, 10, this.f388837i);
        C143947c.m234084c(parcel, 11, this.f388838j);
        C143947c.m234084c(parcel, 12, this.f388839k);
        C143947c.m234078A(parcel, 13, Collections.unmodifiableList(this.f388840l));
        C143947c.m234084c(parcel, 14, this.f388841m);
        C143947c.m234089h(parcel, 15, this.f388842n);
        C143947c.m234083b(parcel, a);
    }
}
