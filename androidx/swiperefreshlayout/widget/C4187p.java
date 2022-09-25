package androidx.swiperefreshlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: androidx.swiperefreshlayout.widget.p */
/* compiled from: PG */
final class C4187p implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SwipeRefreshLayout.SavedState(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SwipeRefreshLayout.SavedState[i];
    }
}
