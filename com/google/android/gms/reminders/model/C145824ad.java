package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* renamed from: com.google.android.gms.reminders.model.ad */
/* compiled from: PG */
public final class C145824ad implements Parcelable.Creator {
    /* renamed from: a */
    public static void m237567a(TaskIdEntity taskIdEntity, Parcel parcel) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 3, taskIdEntity.f394332a);
        C143947c.m234106y(parcel, 4, taskIdEntity.f394333b);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 3) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                str2 = C143946b.m234069r(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new TaskIdEntity(str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TaskIdEntity[i];
    }
}
