package androidx.activity.result;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.activity.result.a */
/* compiled from: PG */
final class C0807a implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ActivityResult(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityResult[i];
    }
}
