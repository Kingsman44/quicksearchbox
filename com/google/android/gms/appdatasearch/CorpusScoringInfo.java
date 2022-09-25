package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class CorpusScoringInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142809f();

    /* renamed from: a */
    public final CorpusId f387420a;

    /* renamed from: b */
    public final int f387421b;

    /* renamed from: c */
    public final int f387422c;

    public CorpusScoringInfo(CorpusId corpusId, int i, int i2) {
        this.f387420a = corpusId;
        this.f387421b = i;
        this.f387422c = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f387420a, i);
        C143947c.m234089h(parcel, 2, this.f387421b);
        C143947c.m234089h(parcel, 3, this.f387422c);
        C143947c.m234083b(parcel, a);
    }
}
