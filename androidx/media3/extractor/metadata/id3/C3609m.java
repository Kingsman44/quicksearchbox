package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.media3.extractor.metadata.id3.m */
/* compiled from: PG */
final class C3609m implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new TextInformationFrame(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TextInformationFrame[i];
    }
}
