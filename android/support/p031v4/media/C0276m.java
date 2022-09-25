package android.support.p031v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p031v4.media.MediaBrowserCompat;

/* renamed from: android.support.v4.media.m */
/* compiled from: PG */
final class C0276m implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new MediaBrowserCompat.MediaItem(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaBrowserCompat.MediaItem[i];
    }
}
