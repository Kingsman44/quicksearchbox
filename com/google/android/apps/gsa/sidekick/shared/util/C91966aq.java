package com.google.android.apps.gsa.sidekick.shared.util;

import android.content.Context;
import android.location.Location;
import com.google.android.googlequicksearchbox.R;
import com.google.p375ai.p378b.C7804ko;
import com.google.p375ai.p378b.C7805kp;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.aq */
/* compiled from: PG */
public final class C91966aq {
    /* renamed from: a */
    public static Location m150921a(C7805kp kpVar) {
        Location location = new Location("unknown");
        location.setLatitude(kpVar.f27287b);
        location.setLongitude(kpVar.f27288c);
        return location;
    }

    /* renamed from: b */
    public static C7805kp m150922b(Location location) {
        C7804ko koVar = (C7804ko) C7805kp.f27284h.createBuilder();
        double latitude = location.getLatitude();
        koVar.copyOnWrite();
        C7805kp kpVar = (C7805kp) koVar.instance;
        kpVar.f27286a |= 1;
        kpVar.f27287b = latitude;
        double longitude = location.getLongitude();
        koVar.copyOnWrite();
        C7805kp kpVar2 = (C7805kp) koVar.instance;
        kpVar2.f27286a |= 2;
        kpVar2.f27288c = longitude;
        return (C7805kp) koVar.build();
    }

    /* renamed from: c */
    public static String m150923c(Context context, int i, int i2, boolean z) {
        int i3 = z ? i2 == 3 ? R.string.distance_kilometers_accessible : R.string.distance_miles_accessible : i2 == 3 ? R.string.distance_kilometers : R.string.distance_miles;
        Object[] objArr = new Object[1];
        double d = i2 == 3 ? 1000.0d : 1609.344d;
        double d2 = (double) i;
        Double.isNaN(d2);
        objArr[0] = Double.valueOf((1.0d / d) * d2);
        return context.getString(i3, objArr);
    }
}
