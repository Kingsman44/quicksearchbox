package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* renamed from: com.google.android.gms.reminders.model.c */
/* compiled from: PG */
public final class C145831c implements Parcelable.Creator {
    /* renamed from: a */
    public static void m237576a(ChainInfoEntity chainInfoEntity, Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 3, chainInfoEntity.f394256a);
        C143947c.m234105x(parcel, 4, chainInfoEntity.f394257b, i);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        FeatureIdProtoEntity featureIdProtoEntity = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 3) {
                str = C143946b.m234069r(parcel, readInt);
            } else if (c != 4) {
                C143946b.m234076y(parcel, readInt);
            } else {
                featureIdProtoEntity = (FeatureIdProtoEntity) C143946b.m234063l(parcel, readInt, FeatureIdProtoEntity.CREATOR);
            }
        }
        C143946b.m234074w(parcel, h);
        return new ChainInfoEntity(str, featureIdProtoEntity);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ChainInfoEntity[i];
    }
}
