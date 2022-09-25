package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Map;

/* compiled from: PG */
public class PhraseAffinityCorpusSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142785aa();

    /* renamed from: a */
    public final CorpusId f387490a;

    /* renamed from: b */
    final Bundle f387491b;

    public PhraseAffinityCorpusSpec(CorpusId corpusId, Bundle bundle) {
        this.f387490a = corpusId;
        this.f387491b = bundle;
    }

    public PhraseAffinityCorpusSpec(String str, String str2, Map map) {
        this(new CorpusId(str, str2, (Bundle) null), new Bundle());
        for (Map.Entry entry : map.entrySet()) {
            this.f387491b.putInt((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f387490a, i);
        C143947c.m234093l(parcel, 2, this.f387491b);
        C143947c.m234083b(parcel, a);
    }
}
