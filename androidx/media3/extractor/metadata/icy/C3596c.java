package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.media3.extractor.metadata.icy.c */
/* compiled from: PG */
final class C3596c implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new IcyInfo(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new IcyInfo[i];
    }
}
