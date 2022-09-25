package android.support.p033v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.RecyclerView;

/* renamed from: android.support.v7.widget.fz */
/* compiled from: PG */
final class C0664fz implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new RecyclerView.SavedState(parcel, (ClassLoader) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RecyclerView.SavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new RecyclerView.SavedState(parcel, classLoader);
    }
}
