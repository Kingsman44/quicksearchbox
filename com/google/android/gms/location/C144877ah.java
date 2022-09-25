package com.google.android.gms.location;

import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.location.ah */
/* compiled from: PG */
public final class C144877ah {
    /* renamed from: a */
    public static final void m235474a(List list, List list2) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ParcelableGeofence parcelableGeofence = (ParcelableGeofence) it.next();
                if (parcelableGeofence != null) {
                    list2.add(parcelableGeofence);
                }
            }
        }
    }

    /* renamed from: b */
    public static final GeofencingRequest m235475b(List list, int i) {
        C143919bh.m233960c(!list.isEmpty(), "No geofence has been added to this request.");
        return new GeofencingRequest(list, i, BuildConfig.FLAVOR, (String) null);
    }
}
