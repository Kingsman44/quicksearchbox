package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.media3.extractor.metadata.mp4.a */
/* compiled from: PG */
final class C3611a implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new MdtaMetadataEntry(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MdtaMetadataEntry[i];
    }
}
