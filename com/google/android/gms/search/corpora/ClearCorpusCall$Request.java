package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ClearCorpusCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145868a();

    /* renamed from: a */
    public String f394404a;

    /* renamed from: b */
    public String f394405b;

    public ClearCorpusCall$Request() {
    }

    public ClearCorpusCall$Request(String str, String str2) {
        this.f394404a = str;
        this.f394405b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f394404a);
        C143947c.m234106y(parcel, 2, this.f394405b);
        C143947c.m234083b(parcel, a);
    }
}
