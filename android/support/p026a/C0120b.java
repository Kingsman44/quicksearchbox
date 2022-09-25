package android.support.p026a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.a.b */
/* compiled from: PG */
public final class C0120b {
    /* renamed from: a */
    public static Object m119a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }
}
