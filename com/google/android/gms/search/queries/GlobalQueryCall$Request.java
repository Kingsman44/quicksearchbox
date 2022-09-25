package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GlobalQueryCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145942j();

    /* renamed from: a */
    public String f394498a;

    /* renamed from: b */
    public int f394499b;

    /* renamed from: c */
    public int f394500c;

    /* renamed from: d */
    public GlobalSearchQuerySpecification f394501d;

    /* renamed from: e */
    public Bundle f394502e;

    public GlobalQueryCall$Request() {
    }

    public GlobalQueryCall$Request(String str, int i, int i2, GlobalSearchQuerySpecification globalSearchQuerySpecification, Bundle bundle) {
        this.f394498a = str;
        this.f394499b = i;
        this.f394500c = i2;
        this.f394501d = globalSearchQuerySpecification;
        this.f394502e = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f394498a);
        C143947c.m234089h(parcel, 2, this.f394499b);
        C143947c.m234089h(parcel, 3, this.f394500c);
        C143947c.m234105x(parcel, 4, this.f394501d, i);
        C143947c.m234093l(parcel, 5, this.f394502e);
        C143947c.m234083b(parcel, a);
    }
}
