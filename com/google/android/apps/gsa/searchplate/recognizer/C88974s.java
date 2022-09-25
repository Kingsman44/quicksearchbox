package com.google.android.apps.gsa.searchplate.recognizer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.searchplate.recognizer.RecognizerView;

/* renamed from: com.google.android.apps.gsa.searchplate.recognizer.s */
/* compiled from: PG */
final class C88974s implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new RecognizerView.SavedState(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RecognizerView.SavedState[i];
    }
}
