package androidx.media3.exoplayer.hls;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.media3.exoplayer.hls.z */
/* compiled from: PG */
final class C3186z implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new HlsTrackMetadataEntry(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new HlsTrackMetadataEntry[i];
    }
}
