package com.google.android.gms.awareness.snapshot.internal;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.location.ActivityRecognitionResult;

/* renamed from: com.google.android.gms.awareness.snapshot.internal.j */
/* compiled from: PG */
public final class C142947j implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        ActivityRecognitionResult activityRecognitionResult = null;
        BeaconStateImpl beaconStateImpl = null;
        HeadphoneStateImpl headphoneStateImpl = null;
        Location location = null;
        NetworkStateImpl networkStateImpl = null;
        DataHolder dataHolder = null;
        PowerStateImpl powerStateImpl = null;
        ScreenStateImpl screenStateImpl = null;
        WeatherImpl weatherImpl = null;
        TimeIntervalsImpl timeIntervalsImpl = null;
        ContextData contextData = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    activityRecognitionResult = (ActivityRecognitionResult) C143946b.m234063l(parcel, readInt, ActivityRecognitionResult.CREATOR);
                    break;
                case 3:
                    beaconStateImpl = (BeaconStateImpl) C143946b.m234063l(parcel, readInt, BeaconStateImpl.CREATOR);
                    break;
                case 4:
                    headphoneStateImpl = (HeadphoneStateImpl) C143946b.m234063l(parcel, readInt, HeadphoneStateImpl.CREATOR);
                    break;
                case 5:
                    location = (Location) C143946b.m234063l(parcel, readInt, Location.CREATOR);
                    break;
                case 6:
                    networkStateImpl = (NetworkStateImpl) C143946b.m234063l(parcel, readInt, NetworkStateImpl.CREATOR);
                    break;
                case 7:
                    dataHolder = (DataHolder) C143946b.m234063l(parcel, readInt, DataHolder.CREATOR);
                    break;
                case 8:
                    powerStateImpl = (PowerStateImpl) C143946b.m234063l(parcel, readInt, PowerStateImpl.CREATOR);
                    break;
                case 9:
                    screenStateImpl = (ScreenStateImpl) C143946b.m234063l(parcel, readInt, ScreenStateImpl.CREATOR);
                    break;
                case 10:
                    weatherImpl = (WeatherImpl) C143946b.m234063l(parcel, readInt, WeatherImpl.CREATOR);
                    break;
                case 11:
                    timeIntervalsImpl = (TimeIntervalsImpl) C143946b.m234063l(parcel, readInt, TimeIntervalsImpl.CREATOR);
                    break;
                case 12:
                    contextData = (ContextData) C143946b.m234063l(parcel, readInt, ContextData.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new Snapshot(activityRecognitionResult, beaconStateImpl, headphoneStateImpl, location, networkStateImpl, dataHolder, powerStateImpl, screenStateImpl, weatherImpl, timeIntervalsImpl, contextData);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Snapshot[i];
    }
}
