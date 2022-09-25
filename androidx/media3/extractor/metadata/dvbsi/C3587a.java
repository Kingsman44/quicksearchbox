package androidx.media3.extractor.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.media3.extractor.metadata.dvbsi.a */
/* compiled from: PG */
final class C3587a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        return new AppInfoTable(parcel.readInt(), readString);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AppInfoTable[i];
    }
}
