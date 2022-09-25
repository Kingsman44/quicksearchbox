package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class PhraseAffinityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142786ab();

    /* renamed from: a */
    public final String f387492a;

    /* renamed from: b */
    public final CorpusId[] f387493b;

    /* renamed from: c */
    public final int[] f387494c;

    public PhraseAffinityResponse(String str, CorpusId[] corpusIdArr, int[] iArr) {
        this.f387492a = str;
        this.f387493b = corpusIdArr;
        this.f387494c = iArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f387492a);
        C143947c.m234079B(parcel, 2, this.f387493b, i);
        C143947c.m234099r(parcel, 3, this.f387494c);
        C143947c.m234083b(parcel, a);
    }
}
