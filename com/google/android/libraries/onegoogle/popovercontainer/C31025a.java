package com.google.android.libraries.onegoogle.popovercontainer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* renamed from: com.google.android.libraries.onegoogle.popovercontainer.a */
/* compiled from: PG */
final class C31025a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        return new AutoValue_ExpandableDialogView_State(z, parcel.readParcelable(ExpandableDialogView.State.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AutoValue_ExpandableDialogView_State[i];
    }
}
