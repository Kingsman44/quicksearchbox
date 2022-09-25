package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* renamed from: com.google.android.gms.reminders.model.l */
/* compiled from: PG */
public final class C145840l implements Parcelable.Creator {
    /* renamed from: a */
    public static void m237587a(LocationGroupEntity locationGroupEntity, Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, locationGroupEntity.f394283a);
        C143947c.m234101t(parcel, 3, locationGroupEntity.f394284b);
        C143947c.m234105x(parcel, 5, locationGroupEntity.f394285c, i);
        C143947c.m234105x(parcel, 6, locationGroupEntity.f394286d, i);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        Integer num = null;
        ChainInfoEntity chainInfoEntity = null;
        CategoryInfoEntity categoryInfoEntity = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 3) {
                num = C143946b.m234067p(parcel, readInt);
            } else if (c == 5) {
                chainInfoEntity = (ChainInfoEntity) C143946b.m234063l(parcel, readInt, ChainInfoEntity.CREATOR);
            } else if (c != 6) {
                C143946b.m234076y(parcel, readInt);
            } else {
                categoryInfoEntity = (CategoryInfoEntity) C143946b.m234063l(parcel, readInt, CategoryInfoEntity.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new LocationGroupEntity(str, num, chainInfoEntity, categoryInfoEntity);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationGroupEntity[i];
    }
}
