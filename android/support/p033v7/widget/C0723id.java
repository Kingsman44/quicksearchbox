package android.support.p033v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.StaggeredGridLayoutManager;

/* renamed from: android.support.v7.widget.id */
/* compiled from: PG */
final class C0723id implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[i];
    }
}
