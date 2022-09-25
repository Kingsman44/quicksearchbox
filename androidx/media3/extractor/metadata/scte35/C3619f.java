package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.media3.extractor.metadata.scte35.f */
/* compiled from: PG */
final class C3619f implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SpliceScheduleCommand(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SpliceScheduleCommand[i];
    }
}
