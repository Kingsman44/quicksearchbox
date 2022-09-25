package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.media3.common.bi */
/* compiled from: PG */
final class C2647bi implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new StreamKey(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StreamKey[i];
    }
}
