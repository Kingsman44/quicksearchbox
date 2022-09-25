package androidx.drawerlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.drawerlayout.widget.DrawerLayout;

/* renamed from: androidx.drawerlayout.widget.j */
/* compiled from: PG */
final class C2181j implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new DrawerLayout.SavedState(parcel, (ClassLoader) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DrawerLayout.SavedState[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new DrawerLayout.SavedState(parcel, classLoader);
    }
}
