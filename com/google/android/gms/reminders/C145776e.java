package com.google.android.gms.reminders;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.reminders.e */
/* compiled from: PG */
public final class C145776e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        ArrayList arrayList3 = null;
        Long l5 = null;
        Long l6 = null;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 3:
                    arrayList = C143946b.m234072u(parcel2, readInt);
                    break;
                case 4:
                    arrayList2 = C143946b.m234070s(parcel2, readInt);
                    break;
                case 5:
                    l = C143946b.m234068q(parcel2, readInt);
                    break;
                case 6:
                    l2 = C143946b.m234068q(parcel2, readInt);
                    break;
                case 7:
                    l3 = C143946b.m234068q(parcel2, readInt);
                    break;
                case 8:
                    l4 = C143946b.m234068q(parcel2, readInt);
                    break;
                case 9:
                    z = C143946b.m234077z(parcel2, readInt);
                    break;
                case 10:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 11:
                    z2 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 12:
                    z3 = C143946b.m234077z(parcel2, readInt);
                    break;
                case 13:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 14:
                    i3 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 15:
                    arrayList3 = C143946b.m234072u(parcel2, readInt);
                    break;
                case 16:
                    l5 = C143946b.m234068q(parcel2, readInt);
                    break;
                case 17:
                    l6 = C143946b.m234068q(parcel2, readInt);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new LoadRemindersOptions(arrayList, arrayList2, l, l2, l3, l4, z, i, z2, z3, i2, i3, arrayList3, l5, l6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LoadRemindersOptions[i];
    }
}
