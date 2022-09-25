package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.ListPreference;

/* renamed from: androidx.preference.i */
/* compiled from: PG */
final class C4013i implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ListPreference.SavedState(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ListPreference.SavedState[i];
    }
}
