package androidx.core.p094f;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui.ValyrianViewPager;

/* renamed from: androidx.core.f.m */
/* compiled from: PG */
public final class C1900m implements Parcelable.ClassLoaderCreator {
    public final Object createFromParcel(Parcel parcel) {
        return new ValyrianViewPager.SavedState(parcel, (ClassLoader) null);
    }

    public final Object[] newArray(int i) {
        return new ValyrianViewPager.SavedState[i];
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ValyrianViewPager.SavedState(parcel, classLoader);
    }
}
