package com.google.android.libraries.surveys;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.surveys.i */
/* compiled from: PG */
final class C43032i implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SurveyMetadata(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SurveyMetadata[i];
    }
}
