package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.media3.common.av */
/* compiled from: PG */
final class C2595av implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Metadata(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Metadata[i];
    }
}
