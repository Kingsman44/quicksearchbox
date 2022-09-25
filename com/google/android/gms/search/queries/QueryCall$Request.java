package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class QueryCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145944l();

    /* renamed from: a */
    public String f394506a;

    /* renamed from: b */
    public String f394507b;

    /* renamed from: c */
    public String[] f394508c;

    /* renamed from: d */
    public int f394509d;

    /* renamed from: e */
    public int f394510e;

    /* renamed from: f */
    public QuerySpecification f394511f;

    /* renamed from: g */
    public Bundle f394512g;

    public QueryCall$Request() {
    }

    public QueryCall$Request(String str, String str2, String[] strArr, int i, int i2, QuerySpecification querySpecification, Bundle bundle) {
        this.f394506a = str;
        this.f394507b = str2;
        this.f394508c = strArr;
        this.f394509d = i;
        this.f394510e = i2;
        this.f394511f = querySpecification;
        this.f394512g = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f394506a);
        C143947c.m234106y(parcel, 2, this.f394507b);
        C143947c.m234107z(parcel, 3, this.f394508c);
        C143947c.m234089h(parcel, 4, this.f394509d);
        C143947c.m234089h(parcel, 5, this.f394510e);
        C143947c.m234105x(parcel, 6, this.f394511f, i);
        C143947c.m234093l(parcel, 7, this.f394512g);
        C143947c.m234083b(parcel, a);
    }
}
