package com.google.android.libraries.notifications.platform.registration;

import android.os.Parcel;
import android.os.Parcelable;
import p5462h.C69677g;

/* renamed from: com.google.android.libraries.notifications.platform.registration.b */
/* compiled from: PG */
public final class C30152b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer num;
        if (parcel != null) {
            try {
                num = Integer.valueOf(parcel.readInt());
            } catch (Exception unused) {
                return null;
            }
        } else {
            num = null;
        }
        if (num == null) {
            return null;
        }
        if (C30151a.values().length <= num.intValue()) {
            return null;
        }
        C30151a aVar = C30151a.values()[num.intValue()];
        String readString = parcel.readString();
        if (readString == null) {
            return null;
        }
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return C30153c.m56013a(readString);
        }
        if (ordinal == 1) {
            return AutoOneOf_AccountRepresentation$Impl_zwieback.f81526a;
        }
        throw new C69677g();
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountRepresentation[i];
    }
}
