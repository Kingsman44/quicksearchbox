package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.Preference;

/* renamed from: androidx.preference.q */
/* compiled from: PG */
final class C4021q implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Preference.BaseSavedState(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Preference.BaseSavedState[i];
    }
}
