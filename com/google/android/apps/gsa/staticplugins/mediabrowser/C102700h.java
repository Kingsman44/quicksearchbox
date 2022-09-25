package com.google.android.apps.gsa.staticplugins.mediabrowser;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.staticplugins.mediabrowser.MediaBrowserSessionController;

/* renamed from: com.google.android.apps.gsa.staticplugins.mediabrowser.h */
/* compiled from: PG */
final class C102700h implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new MediaBrowserSessionController.ArrayParcelable(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaBrowserSessionController.ArrayParcelable[i];
    }
}
