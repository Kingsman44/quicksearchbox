package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.versionedparcelable.a */
/* compiled from: PG */
final class C4262a implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ParcelImpl(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelImpl[i];
    }
}
