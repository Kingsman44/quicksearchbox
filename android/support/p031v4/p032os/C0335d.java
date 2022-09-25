package android.support.p031v4.p032os;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.os.d */
/* compiled from: PG */
final class C0335d implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ResultReceiver(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ResultReceiver[i];
    }
}
