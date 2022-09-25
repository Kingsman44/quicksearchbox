package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.Hypothesis;
import java.util.List;

/* compiled from: PG */
public class OnTranscriptionUpdateEventParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C88500u();

    /* renamed from: a */
    public final Query f236957a;

    /* renamed from: b */
    public final List f236958b;

    public OnTranscriptionUpdateEventParcelable(Parcel parcel) {
        this.f236957a = (Query) parcel.readParcelable(Query.class.getClassLoader());
        this.f236958b = parcel.createTypedArrayList(Hypothesis.CREATOR);
    }

    public OnTranscriptionUpdateEventParcelable(Query query, List list) {
        this.f236957a = query;
        this.f236958b = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f236957a, i);
        parcel.writeTypedList(this.f236958b);
    }
}
