package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.DiscoverStaggeredGridLayoutManager;

/* renamed from: androidx.recyclerview.widget.o */
/* compiled from: PG */
final class C4077o implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new DiscoverStaggeredGridLayoutManager.SavedState(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DiscoverStaggeredGridLayoutManager.SavedState[i];
    }
}
