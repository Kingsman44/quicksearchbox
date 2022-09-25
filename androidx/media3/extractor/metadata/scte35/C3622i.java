package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.media3.extractor.metadata.scte35.i */
/* compiled from: PG */
final class C3622i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TimeSignalCommand[i];
    }
}
