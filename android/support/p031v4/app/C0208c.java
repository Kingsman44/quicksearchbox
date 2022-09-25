package android.support.p031v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.app.c */
/* compiled from: PG */
final class C0208c implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BackStackState(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BackStackState[i];
    }
}
