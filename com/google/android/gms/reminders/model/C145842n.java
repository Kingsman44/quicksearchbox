package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.reminders.model.n */
/* compiled from: PG */
public final class C145842n implements Parcelable.Creator {
    /* renamed from: a */
    public static void m237591a(MonthlyPatternEntity monthlyPatternEntity, Parcel parcel) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234100s(parcel, 2, monthlyPatternEntity.f394287a);
        C143947c.m234101t(parcel, 4, monthlyPatternEntity.f394288b);
        C143947c.m234101t(parcel, 5, monthlyPatternEntity.f394289c);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        ArrayList arrayList = null;
        Integer num = null;
        Integer num2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                arrayList = C143946b.m234070s(parcel, readInt);
            } else if (c == 4) {
                num = C143946b.m234067p(parcel, readInt);
            } else if (c != 5) {
                C143946b.m234076y(parcel, readInt);
            } else {
                num2 = C143946b.m234067p(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new MonthlyPatternEntity(arrayList, num, num2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MonthlyPatternEntity[i];
    }
}
