package com.google.android.apps.gsa.search.shared.p6941ui.actions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.search.shared.ui.actions.n */
/* compiled from: PG */
final class C88520n implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new VoiceActionResultCallback(parcel.readInt(), C58836b.f156633a);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new VoiceActionResultCallback[i];
    }
}
