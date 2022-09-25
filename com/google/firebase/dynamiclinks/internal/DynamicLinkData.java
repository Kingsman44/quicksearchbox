package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class DynamicLinkData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C61178a();

    /* renamed from: a */
    public String f165519a;

    /* renamed from: b */
    public String f165520b;

    /* renamed from: c */
    public int f165521c;

    /* renamed from: d */
    public long f165522d;

    /* renamed from: e */
    public Uri f165523e;

    /* renamed from: f */
    private Bundle f165524f;

    public DynamicLinkData(String str, String str2, int i, long j, Bundle bundle, Uri uri) {
        this.f165519a = str;
        this.f165520b = str2;
        this.f165521c = i;
        this.f165522d = j;
        this.f165524f = bundle;
        this.f165523e = uri;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f165519a);
        C143947c.m234106y(parcel, 2, this.f165520b);
        C143947c.m234089h(parcel, 3, this.f165521c);
        C143947c.m234090i(parcel, 4, this.f165522d);
        Bundle bundle = this.f165524f;
        if (bundle == null) {
            bundle = new Bundle();
        }
        C143947c.m234093l(parcel, 5, bundle);
        C143947c.m234105x(parcel, 6, this.f165523e, i);
        C143947c.m234083b(parcel, a);
    }
}
