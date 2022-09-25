package android.support.p031v4.media;

import android.media.MediaDescription;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.t */
/* compiled from: PG */
final class C0325t implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return MediaDescriptionCompat.m599a(MediaDescription.CREATOR.createFromParcel(parcel));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaDescriptionCompat[i];
    }
}
