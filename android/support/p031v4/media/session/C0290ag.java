package android.support.p031v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p031v4.media.session.MediaSessionCompat;

/* renamed from: android.support.v4.media.session.ag */
/* compiled from: PG */
final class C0290ag implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new MediaSessionCompat.QueueItem(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaSessionCompat.QueueItem[i];
    }
}
