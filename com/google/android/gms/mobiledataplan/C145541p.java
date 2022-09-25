package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.mobiledataplan.p */
/* compiled from: PG */
public final class C145541p implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        MdpFlexTimeWindow[] mdpFlexTimeWindowArr = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        ArrayList arrayList = null;
        String str8 = null;
        String str9 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            switch (c) {
                case 1:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 2:
                    str2 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 3:
                    str3 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 4:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 5:
                    j2 = C143946b.m234060i(parcel2, readInt);
                    break;
                case 6:
                    mdpFlexTimeWindowArr = (MdpFlexTimeWindow[]) C143946b.m234047D(parcel2, readInt, MdpFlexTimeWindow.CREATOR);
                    break;
                case 7:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 8:
                    str4 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 9:
                    str5 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 10:
                    str6 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 11:
                    str7 = C143946b.m234069r(parcel2, readInt);
                    break;
                case 12:
                    i2 = C143946b.m234057f(parcel2, readInt);
                    break;
                case 13:
                    arrayList = C143946b.m234070s(parcel2, readInt);
                    break;
                default:
                    switch (c) {
                        case 20:
                            j3 = C143946b.m234060i(parcel2, readInt);
                            break;
                        case 21:
                            j4 = C143946b.m234060i(parcel2, readInt);
                            break;
                        case 22:
                            j5 = C143946b.m234060i(parcel2, readInt);
                            break;
                        case 23:
                            str8 = C143946b.m234069r(parcel2, readInt);
                            break;
                        case 24:
                            str9 = C143946b.m234069r(parcel2, readInt);
                            break;
                        case 25:
                            z = C143946b.m234077z(parcel2, readInt);
                            break;
                        default:
                            C143946b.m234076y(parcel2, readInt);
                            break;
                    }
            }
        }
        C143946b.m234074w(parcel2, h);
        return new MdpDataPlanStatus(str, str2, str3, j, j2, mdpFlexTimeWindowArr, i, str4, str5, str6, str7, i2, arrayList, j3, j4, j5, str8, str9, z);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new MdpDataPlanStatus[i];
    }
}
