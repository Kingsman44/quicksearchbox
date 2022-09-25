package android.support.p031v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.y */
/* compiled from: PG */
final class C0330y implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new RatingCompat(parcel.readInt(), parcel.readFloat());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RatingCompat[i];
    }
}
