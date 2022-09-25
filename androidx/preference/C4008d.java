package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.EditTextPreference;

/* renamed from: androidx.preference.d */
/* compiled from: PG */
final class C4008d implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new EditTextPreference.SavedState(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new EditTextPreference.SavedState[i];
    }
}
