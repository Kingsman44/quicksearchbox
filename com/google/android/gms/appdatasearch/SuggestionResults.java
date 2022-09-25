package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Iterator;

/* compiled from: PG */
public class SuggestionResults extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator CREATOR = new C142802ar();

    /* renamed from: a */
    final String f387559a;

    /* renamed from: b */
    final String[] f387560b;

    /* renamed from: c */
    final String[] f387561c;

    public SuggestionResults(String str, String[] strArr, String[] strArr2) {
        this.f387559a = str;
        this.f387560b = strArr;
        this.f387561c = strArr2;
    }

    public final Iterator iterator() {
        if (this.f387559a != null) {
            return null;
        }
        return new C142801aq(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f387559a);
        C143947c.m234107z(parcel, 2, this.f387560b);
        C143947c.m234107z(parcel, 3, this.f387561c);
        C143947c.m234083b(parcel, a);
    }
}
