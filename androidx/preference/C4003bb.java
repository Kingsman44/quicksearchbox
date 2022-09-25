package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.SeekBarPreference;

/* renamed from: androidx.preference.bb */
/* compiled from: PG */
final class C4003bb implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SeekBarPreference.SavedState(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SeekBarPreference.SavedState[i];
    }
}
