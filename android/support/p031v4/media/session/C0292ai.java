package android.support.p031v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p031v4.media.session.MediaSessionCompat;

/* renamed from: android.support.v4.media.session.ai */
/* compiled from: PG */
final class C0292ai implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new MediaSessionCompat.ResultReceiverWrapper(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaSessionCompat.ResultReceiverWrapper[i];
    }
}
