package com.google.android.gms.semanticlocation;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.WifiScan;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.semanticlocation.o */
/* compiled from: PG */
public final class C145977o implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        long j = 0;
        Location location = null;
        WifiScan wifiScan = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        RtslDebugData rtslDebugData = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j = C143946b.m234060i(parcel, readInt);
                    break;
                case 2:
                    i = C143946b.m234057f(parcel, readInt);
                    break;
                case 3:
                    location = (Location) C143946b.m234063l(parcel, readInt, Location.CREATOR);
                    break;
                case 4:
                    wifiScan = (WifiScan) C143946b.m234063l(parcel, readInt, WifiScan.CREATOR);
                    break;
                case 5:
                    arrayList = C143946b.m234073v(parcel, readInt, ActivityRecognitionResult.CREATOR);
                    break;
                case 6:
                    arrayList2 = C143946b.m234073v(parcel, readInt, InputPlaceCandidate.CREATOR);
                    break;
                case 7:
                    rtslDebugData = (RtslDebugData) C143946b.m234063l(parcel, readInt, RtslDebugData.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new InputSignals(j, i, location, wifiScan, arrayList, arrayList2, rtslDebugData);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new InputSignals[i];
    }
}
