package androidx.media3.extractor.metadata.vorbis;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class VorbisComment extends androidx.media3.extractor.metadata.flac.VorbisComment {
    public static final Parcelable.Creator CREATOR = new C3623a();

    public VorbisComment(Parcel parcel) {
        super(parcel);
    }

    public VorbisComment(String str, String str2) {
        super(str, str2);
    }
}
