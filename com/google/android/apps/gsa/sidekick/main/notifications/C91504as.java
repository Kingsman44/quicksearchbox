package com.google.android.apps.gsa.sidekick.main.notifications;

import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.as */
/* compiled from: PG */
final class C91504as implements Comparator {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        ParcelableGeofence parcelableGeofence = (ParcelableGeofence) obj2;
        String str = ((ParcelableGeofence) obj).f391867a;
        if (str != null) {
            return str.compareTo(parcelableGeofence.f391867a);
        }
        return parcelableGeofence.f391867a != null ? -1 : 0;
    }
}
