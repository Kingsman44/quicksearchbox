package androidx.media3.extractor.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.media3.extractor.metadata.emsg.a */
/* compiled from: PG */
final class C3589a implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new EventMessage(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new EventMessage[i];
    }
}
