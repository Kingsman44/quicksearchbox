package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* renamed from: com.google.android.gms.reminders.model.i */
/* compiled from: PG */
public final class C145837i implements Parcelable.Creator {
    /* renamed from: a */
    public static void m237583a(FeatureIdProtoEntity featureIdProtoEntity, Parcel parcel) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234104w(parcel, 2, featureIdProtoEntity.f394272a);
        C143947c.m234104w(parcel, 3, featureIdProtoEntity.f394273b);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Long l = null;
        Long l2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                l = C143946b.m234068q(parcel, readInt);
            } else if (c != 3) {
                C143946b.m234076y(parcel, readInt);
            } else {
                l2 = C143946b.m234068q(parcel, readInt);
            }
        }
        C143946b.m234074w(parcel, h);
        return new FeatureIdProtoEntity(l, l2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FeatureIdProtoEntity[i];
    }
}
