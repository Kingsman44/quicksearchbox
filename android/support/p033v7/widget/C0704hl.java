package android.support.p033v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.SearchView;

/* renamed from: android.support.v7.widget.hl */
/* compiled from: PG */
final class C0704hl implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SearchView.SavedState(parcel, (ClassLoader) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SearchView.SavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SearchView.SavedState(parcel, classLoader);
    }
}
