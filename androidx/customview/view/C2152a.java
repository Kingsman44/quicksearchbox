package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.customview.view.a */
/* compiled from: PG */
final class C2152a implements Parcelable.ClassLoaderCreator {
    /* renamed from: a */
    public static final AbsSavedState m5989a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return AbsSavedState.f6115c;
        }
        throw new IllegalStateException("superState must be null");
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m5989a(parcel, (ClassLoader) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AbsSavedState[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return m5989a(parcel, classLoader);
    }
}
