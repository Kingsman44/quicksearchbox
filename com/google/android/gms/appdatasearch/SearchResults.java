package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Iterator;

/* compiled from: PG */
public class SearchResults extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator CREATOR = new C142798an();

    /* renamed from: a */
    public final String f387537a;

    /* renamed from: b */
    final int[] f387538b;

    /* renamed from: c */
    final byte[] f387539c;

    /* renamed from: d */
    final Bundle[] f387540d;

    /* renamed from: e */
    final Bundle[] f387541e;

    /* renamed from: f */
    final Bundle[] f387542f;

    /* renamed from: g */
    public final int f387543g;

    /* renamed from: h */
    final int[] f387544h;

    /* renamed from: i */
    final String[] f387545i;

    /* renamed from: j */
    public final byte[] f387546j;

    /* renamed from: k */
    final double[] f387547k;

    /* renamed from: l */
    final Bundle f387548l;

    /* renamed from: m */
    final int f387549m;

    /* renamed from: n */
    final long[] f387550n;

    /* renamed from: o */
    final long[] f387551o;

    /* renamed from: p */
    final Bundle[] f387552p;

    /* renamed from: q */
    final int[] f387553q;

    /* renamed from: r */
    final byte[] f387554r;

    /* renamed from: s */
    final boolean f387555s;

    public SearchResults() {
        this("Request failed.", (int[]) null, (byte[]) null, (Bundle[]) null, (Bundle[]) null, (Bundle[]) null, 0, (int[]) null, (String[]) null, (byte[]) null, (double[]) null, (Bundle) null, 0, (long[]) null, (long[]) null, (Bundle[]) null, (int[]) null, (byte[]) null, false);
    }

    public SearchResults(String str, int[] iArr, byte[] bArr, Bundle[] bundleArr, Bundle[] bundleArr2, Bundle[] bundleArr3, int i, int[] iArr2, String[] strArr, byte[] bArr2, double[] dArr, Bundle bundle, int i2, long[] jArr, long[] jArr2, Bundle[] bundleArr4, int[] iArr3, byte[] bArr3, boolean z) {
        this.f387537a = str;
        this.f387538b = iArr;
        this.f387539c = bArr;
        this.f387540d = bundleArr;
        this.f387541e = bundleArr2;
        this.f387542f = bundleArr3;
        this.f387543g = i;
        this.f387544h = iArr2;
        this.f387545i = strArr;
        this.f387546j = bArr2;
        this.f387547k = dArr;
        this.f387548l = bundle;
        this.f387549m = i2;
        this.f387550n = jArr;
        this.f387551o = jArr2;
        this.f387552p = bundleArr4;
        this.f387553q = iArr3;
        this.f387554r = bArr3;
        this.f387555s = z;
    }

    /* renamed from: a */
    public final boolean mo117665a() {
        return this.f387537a != null;
    }

    public final /* synthetic */ Iterator iterator() {
        return new C142797am(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f387537a);
        C143947c.m234099r(parcel, 2, this.f387538b);
        C143947c.m234094m(parcel, 3, this.f387539c);
        C143947c.m234079B(parcel, 4, this.f387540d, i);
        C143947c.m234079B(parcel, 5, this.f387541e, i);
        C143947c.m234079B(parcel, 6, this.f387542f, i);
        C143947c.m234089h(parcel, 7, this.f387543g);
        C143947c.m234099r(parcel, 8, this.f387544h);
        C143947c.m234107z(parcel, 9, this.f387545i);
        C143947c.m234094m(parcel, 10, this.f387546j);
        double[] dArr = this.f387547k;
        if (dArr != null) {
            int a2 = C143947c.m234082a(parcel, 11);
            parcel.writeDoubleArray(dArr);
            C143947c.m234083b(parcel, a2);
        }
        C143947c.m234093l(parcel, 12, this.f387548l);
        C143947c.m234089h(parcel, 13, this.f387549m);
        C143947c.m234102u(parcel, 14, this.f387550n);
        C143947c.m234102u(parcel, 15, this.f387551o);
        C143947c.m234079B(parcel, 16, this.f387552p, i);
        C143947c.m234099r(parcel, 17, this.f387553q);
        C143947c.m234094m(parcel, 18, this.f387554r);
        C143947c.m234084c(parcel, 19, this.f387555s);
        C143947c.m234083b(parcel, a);
    }
}
