package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* renamed from: com.google.android.gms.reminders.model.a */
/* compiled from: PG */
public final class C145820a implements Parcelable.Creator {
    /* renamed from: a */
    public static void m237556a(AddressEntity addressEntity, Parcel parcel) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, addressEntity.f394245a);
        C143947c.m234106y(parcel, 3, addressEntity.f394246b);
        C143947c.m234106y(parcel, 4, addressEntity.f394247c);
        C143947c.m234106y(parcel, 5, addressEntity.f394248d);
        C143947c.m234106y(parcel, 6, addressEntity.f394251g);
        C143947c.m234106y(parcel, 7, addressEntity.f394249e);
        C143947c.m234106y(parcel, 8, addressEntity.f394250f);
        C143947c.m234106y(parcel, 9, addressEntity.f394252h);
        C143947c.m234083b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = C143946b.m234069r(parcel, readInt);
                    break;
                case 3:
                    str2 = C143946b.m234069r(parcel, readInt);
                    break;
                case 4:
                    str3 = C143946b.m234069r(parcel, readInt);
                    break;
                case 5:
                    str4 = C143946b.m234069r(parcel, readInt);
                    break;
                case 6:
                    str7 = C143946b.m234069r(parcel, readInt);
                    break;
                case 7:
                    str5 = C143946b.m234069r(parcel, readInt);
                    break;
                case 8:
                    str6 = C143946b.m234069r(parcel, readInt);
                    break;
                case 9:
                    str8 = C143946b.m234069r(parcel, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new AddressEntity(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AddressEntity[i];
    }
}
