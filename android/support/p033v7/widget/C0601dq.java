package android.support.p033v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.LinearLayoutManager;

/* renamed from: android.support.v7.widget.dq */
/* compiled from: PG */
final class C0601dq implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new LinearLayoutManager.SavedState(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LinearLayoutManager.SavedState[i];
    }
}
