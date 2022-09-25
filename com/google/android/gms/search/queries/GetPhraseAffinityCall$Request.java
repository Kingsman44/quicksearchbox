package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.PhraseAffinityCorpusSpec;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GetPhraseAffinityCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145939g();

    /* renamed from: a */
    public String[] f394492a;

    /* renamed from: b */
    public PhraseAffinityCorpusSpec[] f394493b;

    /* renamed from: c */
    public Bundle f394494c;

    public GetPhraseAffinityCall$Request() {
    }

    public GetPhraseAffinityCall$Request(String[] strArr, PhraseAffinityCorpusSpec[] phraseAffinityCorpusSpecArr, Bundle bundle) {
        this.f394492a = strArr;
        this.f394493b = phraseAffinityCorpusSpecArr;
        this.f394494c = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234107z(parcel, 1, this.f394492a);
        C143947c.m234079B(parcel, 2, this.f394493b, i);
        C143947c.m234093l(parcel, 3, this.f394494c);
        C143947c.m234083b(parcel, a);
    }
}
