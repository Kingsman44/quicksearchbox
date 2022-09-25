package android.support.p031v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p031v4.media.session.MediaSessionCompat;

/* renamed from: android.support.v4.media.session.aj */
/* compiled from: PG */
final class C0293aj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new MediaSessionCompat.Token(parcel.readParcelable((ClassLoader) null));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaSessionCompat.Token[i];
    }
}
