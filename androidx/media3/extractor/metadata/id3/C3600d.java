package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.media3.extractor.metadata.id3.d */
/* compiled from: PG */
final class C3600d implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ChapterTocFrame(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ChapterTocFrame[i];
    }
}
