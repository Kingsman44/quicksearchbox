package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.DiscoverStaggeredGridLayoutManager;

/* renamed from: androidx.recyclerview.widget.n */
/* compiled from: PG */
final class C4076n implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new DiscoverStaggeredGridLayoutManager.LazySpanLookup.FullSpanItem(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DiscoverStaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[i];
    }
}
