package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* renamed from: com.google.android.gms.reminders.model.k */
/* compiled from: PG */
public final class C145839k implements Parcelable.Creator {
    /* renamed from: a */
    public static void m237586a(LocationEntity locationEntity, Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234096o(parcel, 2, locationEntity.f394274a);
        C143947c.m234096o(parcel, 3, locationEntity.f394275b);
        C143947c.m234106y(parcel, 4, locationEntity.f394276c);
        C143947c.m234101t(parcel, 5, locationEntity.f394277d);
        C143947c.m234101t(parcel, 6, locationEntity.f394278e);
        C143947c.m234105x(parcel, 7, locationEntity.f394279f, i);
        C143947c.m234106y(parcel, 8, locationEntity.f394280g);
        C143947c.m234106y(parcel, 9, locationEntity.f394282i);
        C143947c.m234105x(parcel, 10, locationEntity.f394281h, i);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        Double d = null;
        Double d2 = null;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        FeatureIdProtoEntity featureIdProtoEntity = null;
        String str2 = null;
        AddressEntity addressEntity = null;
        String str3 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    d = C143946b.m234065n(parcel, readInt);
                    break;
                case 3:
                    d2 = C143946b.m234065n(parcel, readInt);
                    break;
                case 4:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 5:
                    num = C143946b.m234067p(parcel, readInt);
                    break;
                case 6:
                    num2 = C143946b.m234067p(parcel, readInt);
                    break;
                case 7:
                    featureIdProtoEntity = (FeatureIdProtoEntity) C143946b.m234063l(parcel, readInt, FeatureIdProtoEntity.CREATOR);
                    break;
                case 8:
                    str2 = C143946b.m234069r(parcel, readInt);
                    break;
                case 9:
                    str3 = C143946b.m234069r(parcel, readInt);
                    break;
                case 10:
                    addressEntity = (AddressEntity) C143946b.m234063l(parcel, readInt, AddressEntity.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new LocationEntity(d, d2, str, num, num2, featureIdProtoEntity, str2, addressEntity, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationEntity[i];
    }
}
