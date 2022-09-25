package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.MultiSelectListPreference;

/* renamed from: androidx.preference.m */
/* compiled from: PG */
final class C4017m implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new MultiSelectListPreference.SavedState(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MultiSelectListPreference.SavedState[i];
    }
}
