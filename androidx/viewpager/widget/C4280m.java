package androidx.viewpager.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.viewpager.widget.ViewPager;

/* renamed from: androidx.viewpager.widget.m */
/* compiled from: PG */
final class C4280m implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ViewPager.SavedState(parcel, (ClassLoader) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ViewPager.SavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ViewPager.SavedState(parcel, classLoader);
    }
}
