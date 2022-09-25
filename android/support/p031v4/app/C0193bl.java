package android.support.p031v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p031v4.app.FragmentManager;

/* renamed from: android.support.v4.app.bl */
/* compiled from: PG */
final class C0193bl implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new FragmentManager.LaunchedFragmentInfo(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FragmentManager.LaunchedFragmentInfo[i];
    }
}
