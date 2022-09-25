package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;

/* renamed from: com.google.android.gms.semanticlocation.aa */
/* compiled from: PG */
public final class C145950aa implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int h = C143946b.m234059h(parcel);
        long j = 0;
        String str = null;
        PlaceEnterEvent placeEnterEvent = null;
        PlaceExitEvent placeExitEvent = null;
        PlaceOngoingEvent placeOngoingEvent = null;
        ActivityStartEvent activityStartEvent = null;
        ActivityEndEvent activityEndEvent = null;
        ActivityOngoingEvent activityOngoingEvent = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j = C143946b.m234060i(parcel2, readInt);
                    break;
                case 2:
                    str = C143946b.m234069r(parcel2, readInt);
                    break;
                case 3:
                    i = C143946b.m234057f(parcel2, readInt);
                    break;
                case 4:
                    placeEnterEvent = (PlaceEnterEvent) C143946b.m234063l(parcel2, readInt, PlaceEnterEvent.CREATOR);
                    break;
                case 5:
                    placeExitEvent = (PlaceExitEvent) C143946b.m234063l(parcel2, readInt, PlaceExitEvent.CREATOR);
                    break;
                case 6:
                    placeOngoingEvent = (PlaceOngoingEvent) C143946b.m234063l(parcel2, readInt, PlaceOngoingEvent.CREATOR);
                    break;
                case 7:
                    activityStartEvent = (ActivityStartEvent) C143946b.m234063l(parcel2, readInt, ActivityStartEvent.CREATOR);
                    break;
                case 8:
                    activityEndEvent = (ActivityEndEvent) C143946b.m234063l(parcel2, readInt, ActivityEndEvent.CREATOR);
                    break;
                case 9:
                    activityOngoingEvent = (ActivityOngoingEvent) C143946b.m234063l(parcel2, readInt, ActivityOngoingEvent.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel2, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel2, h);
        return new SemanticLocationEvent(j, str, i, placeEnterEvent, placeExitEvent, placeOngoingEvent, activityStartEvent, activityEndEvent, activityOngoingEvent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SemanticLocationEvent[i];
    }
}
