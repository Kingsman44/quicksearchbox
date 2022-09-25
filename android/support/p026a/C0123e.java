package android.support.p026a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.a.e */
/* compiled from: PG */
public final class C0123e {
    /* renamed from: a */
    public static void m127a(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }
}
