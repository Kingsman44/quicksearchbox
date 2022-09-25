package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.PreferenceGroup;

/* renamed from: androidx.preference.al */
/* compiled from: PG */
final class C3986al implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PreferenceGroup.SavedState(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PreferenceGroup.SavedState[i];
    }
}
