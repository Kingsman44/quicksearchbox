package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.media3.extractor.metadata.scte35.c */
/* compiled from: PG */
final class C3616c implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SpliceInsertCommand(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SpliceInsertCommand[i];
    }
}
