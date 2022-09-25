package androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.media3.extractor.metadata.flac.b */
/* compiled from: PG */
final class C3593b implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new VorbisComment(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new VorbisComment[i];
    }
}
