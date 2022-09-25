package com.google.android.apps.gsa.voiceime.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.voiceime.view.DrawSoundLevelsView;

/* renamed from: com.google.android.apps.gsa.voiceime.view.b */
/* compiled from: PG */
final class C118699b implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new DrawSoundLevelsView.SavedState(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DrawSoundLevelsView.SavedState[i];
    }
}
