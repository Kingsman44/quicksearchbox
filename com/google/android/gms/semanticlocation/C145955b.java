package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143946b;
import com.google.android.gms.semanticlocation.PlaceCandidate;

/* renamed from: com.google.android.gms.semanticlocation.b */
/* compiled from: PG */
public final class C145955b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = C143946b.m234059h(parcel);
        PlaceCandidate.Point point = null;
        PlaceCandidate.Point point2 = null;
        ActivityCandidate activityCandidate = null;
        AdditionalActivityCandidates additionalActivityCandidates = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    point = (PlaceCandidate.Point) C143946b.m234063l(parcel, readInt, PlaceCandidate.Point.CREATOR);
                    break;
                case 2:
                    point2 = (PlaceCandidate.Point) C143946b.m234063l(parcel, readInt, PlaceCandidate.Point.CREATOR);
                    break;
                case 3:
                    f = C143946b.m234054c(parcel, readInt);
                    break;
                case 4:
                    f2 = C143946b.m234054c(parcel, readInt);
                    break;
                case 5:
                    f3 = C143946b.m234054c(parcel, readInt);
                    break;
                case 6:
                    activityCandidate = (ActivityCandidate) C143946b.m234063l(parcel, readInt, ActivityCandidate.CREATOR);
                    break;
                case 7:
                    additionalActivityCandidates = (AdditionalActivityCandidates) C143946b.m234063l(parcel, readInt, AdditionalActivityCandidates.CREATOR);
                    break;
                default:
                    C143946b.m234076y(parcel, readInt);
                    break;
            }
        }
        C143946b.m234074w(parcel, h);
        return new Activity(point, point2, f, f2, f3, activityCandidate, additionalActivityCandidates);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Activity[i];
    }
}
