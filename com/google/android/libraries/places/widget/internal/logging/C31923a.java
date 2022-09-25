package com.google.android.libraries.places.widget.internal.logging;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.libraries.places.widget.internal.logging.a */
/* compiled from: PG */
final class C31923a implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AutocompleteWidgetSession(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutocompleteWidgetSession[i];
    }
}
