package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.media3.extractor.metadata.icy.b */
/* compiled from: PG */
final class C3595b implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new IcyHeaders(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new IcyHeaders[i];
    }
}
