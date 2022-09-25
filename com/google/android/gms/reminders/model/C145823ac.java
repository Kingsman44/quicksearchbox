package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* renamed from: com.google.android.gms.reminders.model.ac */
/* compiled from: PG */
public final class C145823ac implements Parcelable.Creator {
    /* renamed from: a */
    public static void m237566a(TaskEntity taskEntity, Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, taskEntity.f394310a, i);
        C143947c.m234101t(parcel, 3, taskEntity.f394311b);
        C143947c.m234106y(parcel, 4, taskEntity.f394312c);
        C143947c.m234105x(parcel, 6, taskEntity.f394320k, i);
        C143947c.m234105x(parcel, 7, taskEntity.f394322m, i);
        C143947c.m234105x(parcel, 8, taskEntity.f394321l, i);
        C143947c.m234092k(parcel, 9, taskEntity.f394315f);
        C143947c.m234092k(parcel, 11, taskEntity.f394316g);
        C143947c.m234104w(parcel, 12, taskEntity.f394314e);
        C143947c.m234105x(parcel, 13, taskEntity.f394323n, i);
        C143947c.m234104w(parcel, 15, taskEntity.f394324o);
        C143947c.m234094m(parcel, 16, taskEntity.f394325p);
        C143947c.m234105x(parcel, 17, taskEntity.f394326q, i);
        C143947c.m234094m(parcel, 18, taskEntity.f394327r);
        C143947c.m234104w(parcel, 19, taskEntity.f394313d);
        C143947c.m234101t(parcel, 20, taskEntity.f394328s);
        C143947c.m234092k(parcel, 22, taskEntity.f394317h);
        C143947c.m234092k(parcel, 23, taskEntity.f394318i);
        C143947c.m234104w(parcel, 24, taskEntity.f394319j);
        C143947c.m234105x(parcel, 26, taskEntity.f394329t, i);
        C143947c.m234104w(parcel, 27, taskEntity.f394330u);
        C143947c.m234104w(parcel, 1001, taskEntity.f394331v);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        TaskIdEntity taskIdEntity = null;
        Integer num = null;
        String str = null;
        Long l = null;
        Long l2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Long l3 = null;
        DateTimeEntity dateTimeEntity = null;
        DateTimeEntity dateTimeEntity2 = null;
        LocationEntity locationEntity = null;
        LocationGroupEntity locationGroupEntity = null;
        Long l4 = null;
        byte[] bArr = null;
        RecurrenceInfoEntity recurrenceInfoEntity = null;
        byte[] bArr2 = null;
        Integer num2 = null;
        ExternalApplicationLinkEntity externalApplicationLinkEntity = null;
        Long l5 = null;
        Long l6 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            DateTimeEntity dateTimeEntity3 = dateTimeEntity2;
            if (c == 2) {
                taskIdEntity = (TaskIdEntity) C143946b.m234063l(parcel2, readInt, TaskIdEntity.CREATOR);
            } else if (c == 3) {
                num = C143946b.m234067p(parcel2, readInt);
            } else if (c == 4) {
                str = C143946b.m234069r(parcel2, readInt);
            } else if (c == 26) {
                externalApplicationLinkEntity = (ExternalApplicationLinkEntity) C143946b.m234063l(parcel2, readInt, ExternalApplicationLinkEntity.CREATOR);
            } else if (c == 27) {
                l5 = C143946b.m234068q(parcel2, readInt);
            } else if (c != 1001) {
                switch (c) {
                    case 6:
                        dateTimeEntity = (DateTimeEntity) C143946b.m234063l(parcel2, readInt, DateTimeEntity.CREATOR);
                        break;
                    case 7:
                        locationEntity = (LocationEntity) C143946b.m234063l(parcel2, readInt, LocationEntity.CREATOR);
                        break;
                    case 8:
                        dateTimeEntity2 = (DateTimeEntity) C143946b.m234063l(parcel2, readInt, DateTimeEntity.CREATOR);
                        continue;
                    case 9:
                        bool = C143946b.m234064m(parcel2, readInt);
                        break;
                    default:
                        switch (c) {
                            case 11:
                                bool2 = C143946b.m234064m(parcel2, readInt);
                                break;
                            case 12:
                                l2 = C143946b.m234068q(parcel2, readInt);
                                break;
                            case 13:
                                locationGroupEntity = (LocationGroupEntity) C143946b.m234063l(parcel2, readInt, LocationGroupEntity.CREATOR);
                                break;
                            default:
                                switch (c) {
                                    case 15:
                                        l4 = C143946b.m234068q(parcel2, readInt);
                                        break;
                                    case 16:
                                        bArr = C143946b.m234044A(parcel2, readInt);
                                        break;
                                    case 17:
                                        recurrenceInfoEntity = (RecurrenceInfoEntity) C143946b.m234063l(parcel2, readInt, RecurrenceInfoEntity.CREATOR);
                                        break;
                                    case 18:
                                        bArr2 = C143946b.m234044A(parcel2, readInt);
                                        break;
                                    case 19:
                                        l = C143946b.m234068q(parcel2, readInt);
                                        break;
                                    case 20:
                                        num2 = C143946b.m234067p(parcel2, readInt);
                                        break;
                                    default:
                                        switch (c) {
                                            case 22:
                                                bool3 = C143946b.m234064m(parcel2, readInt);
                                                break;
                                            case 23:
                                                bool4 = C143946b.m234064m(parcel2, readInt);
                                                break;
                                            case 24:
                                                l3 = C143946b.m234068q(parcel2, readInt);
                                                break;
                                            default:
                                                C143946b.m234076y(parcel2, readInt);
                                                break;
                                        }
                                }
                        }
                }
            } else {
                l6 = C143946b.m234068q(parcel2, readInt);
            }
            dateTimeEntity2 = dateTimeEntity3;
        }
        DateTimeEntity dateTimeEntity4 = dateTimeEntity2;
        C143946b.m234074w(parcel2, h);
        return new TaskEntity(taskIdEntity, num, str, l, l2, bool, bool2, bool3, bool4, l3, dateTimeEntity, dateTimeEntity2, locationEntity, locationGroupEntity, l4, bArr, recurrenceInfoEntity, bArr2, num2, externalApplicationLinkEntity, l5, l6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TaskEntity[i];
    }
}
