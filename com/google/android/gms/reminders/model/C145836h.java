package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* renamed from: com.google.android.gms.reminders.model.h */
/* compiled from: PG */
public final class C145836h implements Parcelable.Creator {
    /* renamed from: a */
    public static void m237582a(ExternalApplicationLinkEntity externalApplicationLinkEntity, Parcel parcel) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234101t(parcel, 2, externalApplicationLinkEntity.f394270a);
        C143947c.m234106y(parcel, 3, externalApplicationLinkEntity.f394271b);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Integer num = null;
        String str = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                num = C143946b.m234067p(parcel, readInt);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                str = C143946b.m234069r(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new ExternalApplicationLinkEntity(num, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ExternalApplicationLinkEntity[i];
    }
}
