package android.support.p031v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p031v4.media.session.PlaybackStateCompat;

/* renamed from: android.support.v4.media.session.ap */
/* compiled from: PG */
final class C0299ap implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PlaybackStateCompat.CustomAction(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PlaybackStateCompat.CustomAction[i];
    }
}
