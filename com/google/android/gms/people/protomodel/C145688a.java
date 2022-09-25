package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.people.protomodel.a */
/* compiled from: PG */
public final class C145688a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        Long l = null;
        ArrayList arrayList = null;
        String str2 = null;
        Long l2 = null;
        Long l3 = null;
        DeviceVersionEntity deviceVersionEntity = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 3:
                    arrayList = C143946b.m234073v(parcel, readInt, SourceStatsEntity.CREATOR);
                    break;
                case 4:
                    str2 = C143946b.m234069r(parcel, readInt);
                    break;
                case 5:
                    l2 = C143946b.m234068q(parcel, readInt);
                    break;
                case 6:
                    l3 = C143946b.m234068q(parcel, readInt);
                    break;
                case 7:
                    l = C143946b.m234068q(parcel, readInt);
                    break;
                case 8:
                    deviceVersionEntity = (DeviceVersionEntity) C143946b.m234063l(parcel, readInt, DeviceVersionEntity.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new BackedUpContactsPerDeviceEntity(str, l, arrayList, str2, l2, l3, deviceVersionEntity);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BackedUpContactsPerDeviceEntity[i];
    }
}
