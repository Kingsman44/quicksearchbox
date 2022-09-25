package android.support.p031v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.g */
/* compiled from: PG */
public final class C0305g {
    /* renamed from: a */
    public static Object m834a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* renamed from: b */
    public static void m835b(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
            return;
        }
        parcel.writeInt(0);
    }
}
