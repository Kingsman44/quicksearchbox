package androidx.viewpager2.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: androidx.viewpager2.widget.w */
/* compiled from: PG */
final class C4320w implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ViewPager2.SavedState(parcel, (ClassLoader) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ViewPager2.SavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ViewPager2.SavedState(parcel, classLoader);
    }
}
