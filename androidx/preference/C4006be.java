package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.TwoStatePreference;

/* renamed from: androidx.preference.be */
/* compiled from: PG */
final class C4006be implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new TwoStatePreference.SavedState(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TwoStatePreference.SavedState[i];
    }
}
