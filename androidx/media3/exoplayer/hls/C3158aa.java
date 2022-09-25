package androidx.media3.exoplayer.hls;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.hls.HlsTrackMetadataEntry;

/* renamed from: androidx.media3.exoplayer.hls.aa */
/* compiled from: PG */
final class C3158aa implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new HlsTrackMetadataEntry.VariantInfo(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new HlsTrackMetadataEntry.VariantInfo[i];
    }
}
