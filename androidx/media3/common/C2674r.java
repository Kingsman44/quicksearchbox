package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.DrmInitData;

/* renamed from: androidx.media3.common.r */
/* compiled from: PG */
final class C2674r implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new DrmInitData.SchemeData(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DrmInitData.SchemeData[i];
    }
}
