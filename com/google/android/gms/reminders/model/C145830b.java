package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.reminders.model.b */
/* compiled from: PG */
public final class C145830b implements Parcelable.Creator {
    /* renamed from: a */
    public static void m237575a(CategoryInfoEntity categoryInfoEntity, Parcel parcel) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, categoryInfoEntity.f394253a);
        C143947c.m234106y(parcel, 3, categoryInfoEntity.f394254b);
        C143947c.m234078A(parcel, 4, categoryInfoEntity.f394255c);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        ArrayList arrayList = null;
        String str2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c == 3) {
                str2 = C143946b.m234069r(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                arrayList = C143946b.m234072u(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new CategoryInfoEntity(str, arrayList, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CategoryInfoEntity[i];
    }
}
