package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.reminders.model.ag */
/* compiled from: PG */
public final class C145827ag implements Parcelable.Creator {
    /* renamed from: a */
    public static void m237571a(WeeklyPatternEntity weeklyPatternEntity, Parcel parcel) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234100s(parcel, 2, weeklyPatternEntity.f394337a);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                C143946b.m234076y(parcel, readInt);
            } else {
                arrayList = C143946b.m234070s(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new WeeklyPatternEntity((List) arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new WeeklyPatternEntity[i];
    }
}
