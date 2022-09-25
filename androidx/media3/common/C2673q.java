package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.media3.common.q */
/* compiled from: PG */
final class C2673q implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new DrmInitData(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DrmInitData[i];
    }
}
