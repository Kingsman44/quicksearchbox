package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.media3.extractor.metadata.id3.b */
/* compiled from: PG */
final class C3598b implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BinaryFrame(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BinaryFrame[i];
    }
}
