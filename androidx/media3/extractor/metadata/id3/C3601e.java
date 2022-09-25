package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.media3.extractor.metadata.id3.e */
/* compiled from: PG */
final class C3601e implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new CommentFrame(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CommentFrame[i];
    }
}
