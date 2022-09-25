package android.support.p031v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p031v4.app.Fragment;

/* renamed from: android.support.v4.app.ai */
/* compiled from: PG */
final class C0163ai implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Fragment.SavedState(parcel, (ClassLoader) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Fragment.SavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new Fragment.SavedState(parcel, classLoader);
    }
}
