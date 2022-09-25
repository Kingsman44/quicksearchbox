package android.support.p033v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.Toolbar;

/* renamed from: android.support.v7.widget.ja */
/* compiled from: PG */
final class C0747ja implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Toolbar.SavedState(parcel, (ClassLoader) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Toolbar.SavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new Toolbar.SavedState(parcel, classLoader);
    }
}
