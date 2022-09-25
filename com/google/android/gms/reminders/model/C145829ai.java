package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.reminders.model.ai */
/* compiled from: PG */
public final class C145829ai implements Parcelable.Creator {
    /* renamed from: a */
    public static void m237574a(YearlyPatternEntity yearlyPatternEntity, Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, yearlyPatternEntity.f394338a, i);
        C143947c.m234100s(parcel, 3, yearlyPatternEntity.f394339b);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        MonthlyPatternEntity monthlyPatternEntity = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                monthlyPatternEntity = (MonthlyPatternEntity) C143946b.m234063l(parcel, readInt, MonthlyPatternEntity.CREATOR);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                arrayList = C143946b.m234070s(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new YearlyPatternEntity(monthlyPatternEntity, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new YearlyPatternEntity[i];
    }
}
