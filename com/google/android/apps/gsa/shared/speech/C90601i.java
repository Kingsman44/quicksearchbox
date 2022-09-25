package com.google.android.apps.gsa.shared.speech;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.speech.Hypothesis;

/* renamed from: com.google.android.apps.gsa.shared.speech.i */
/* compiled from: PG */
final class C90601i implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Hypothesis.Span(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Hypothesis.Span[i];
    }
}
