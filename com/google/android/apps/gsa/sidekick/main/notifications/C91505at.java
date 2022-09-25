package com.google.android.apps.gsa.sidekick.main.notifications;

import android.location.Location;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.location.C74637ae;
import com.google.android.apps.gsa.location.z;
import com.google.android.apps.gsa.search.core.google.C85880bc;
import com.google.android.apps.gsa.search.core.google.C85881bd;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.sidekick.main.p7202e.C91285a;
import com.google.android.gms.location.C144870aa;
import com.google.android.gms.location.C144877ah;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21551h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.location.C38570a;
import com.google.android.libraries.search.location.C38716v;
import com.google.android.libraries.search.location.C38725y;
import com.google.android.libraries.search.location.C38726z;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7805kp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.at */
/* compiled from: PG */
final class C91505at implements C85880bc {

    /* renamed from: a */
    public static final C59071e f255228a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.notifications.at");

    /* renamed from: b */
    public static final C91504as f255229b = new C91504as();

    /* renamed from: c */
    public final Object f255230c = new Object();

    /* renamed from: d */
    final Map f255231d = new TreeMap(f255229b);

    /* renamed from: e */
    public final z f255232e;

    /* renamed from: f */
    public final C74637ae f255233f;

    /* renamed from: g */
    public final C21370a f255234g;

    /* renamed from: h */
    public final C38716v f255235h;

    /* renamed from: i */
    private final C86130z f255236i;

    /* renamed from: j */
    private final C90931ca f255237j;

    /* renamed from: k */
    private final C38716v f255238k;

    public C91505at(z zVar, C74637ae aeVar, C86130z zVar2, C85881bd bdVar, C90931ca caVar, C21370a aVar, C38716v vVar, C38716v vVar2) {
        this.f255232e = zVar;
        this.f255233f = aeVar;
        this.f255236i = zVar2;
        this.f255237j = caVar;
        this.f255234g = aVar;
        this.f255238k = vVar;
        this.f255235h = vVar2;
        bdVar.mo79510a(this);
    }

    /* renamed from: a */
    public final void mo79518a(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (z) {
            this.f255237j.mo85139d(new C91503ar(this));
        }
    }

    /* renamed from: b */
    public final void mo85851b(Map map) {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f255230c) {
            this.f255231d.putAll(map);
        }
        try {
            C91018d.m148680c();
            C74637ae aeVar = this.f255233f;
            C38725y d = C38726z.m68011d(C39226b.TAG_CLASSIC_SEARCH_SIDEKICK_LO);
            ((C38570a) d).f101954b = 3;
            Location location = (Location) C90877ak.m148472f(aeVar.mo71020c(d.mo41492a()));
            if (location != null) {
                mo85852c(location);
            }
        } catch (ExecutionException e) {
            C59104x d2 = f255228a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "NotificationGeofenceHe");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(11660)).mo56386p("Unable to get location");
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: c */
    public final void mo85852c(Location location) {
        float f;
        float f2;
        mo85854e();
        ArrayList arrayList = new ArrayList();
        synchronized (this.f255230c) {
            f = Float.MAX_VALUE;
            for (ParcelableGeofence parcelableGeofence : this.f255231d.keySet()) {
                C7805kp kpVar = (C7805kp) this.f255231d.get(parcelableGeofence);
                if (kpVar != null) {
                    Location location2 = new Location(BuildConfig.FLAVOR);
                    location2.setLatitude(kpVar.f27287b);
                    location2.setLongitude(kpVar.f27288c);
                    f2 = location.distanceTo(location2) - ((float) kpVar.f27291f);
                } else {
                    f2 = Float.MAX_VALUE;
                }
                if (f2 < ((float) this.f255236i.mo79762a(R.integer.personal_geofence_radius_meters))) {
                    arrayList.add(parcelableGeofence);
                } else {
                    f = Math.min(f, f2);
                }
            }
        }
        if (f < Float.MAX_VALUE) {
            C144870aa aaVar = new C144870aa();
            aaVar.mo120365c(-1);
            aaVar.f391811c = 60000;
            aaVar.f391810b = 300000;
            aaVar.f391809a = 6;
            aaVar.mo120366d("notification_9223372036854775807");
            aaVar.mo120364b(location.getLatitude(), location.getLongitude(), f);
            arrayList.add(aaVar.mo120363a());
        }
        C58976aa aaVar2 = C58975e.f156826a;
        if (!arrayList.isEmpty()) {
            C91285a aVar = new C91285a("register geofence");
            ArrayList arrayList2 = new ArrayList();
            C144877ah.m235474a(arrayList, arrayList2);
            GeofencingRequest b = C144877ah.m235475b(arrayList2, 6);
            C91018d.m148680c();
            try {
                aVar.mo17709a((C21551h) C90877ak.m148472f(this.f255232e.a(b, this.f255238k, C39226b.TAG_CLASSIC_SEARCH_SIDEKICK_LO)));
            } catch (Exception e) {
                C59104x d = f255228a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "NotificationGeofenceHe");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(11667)).mo56386p("Failed to register geofence");
            }
        }
    }

    /* renamed from: d */
    public final void mo85853d(List list) {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f255230c) {
            HashSet<ParcelableGeofence> hashSet = new HashSet<>();
            for (ParcelableGeofence parcelableGeofence : this.f255231d.keySet()) {
                if (list.contains(parcelableGeofence.f391867a)) {
                    hashSet.add(parcelableGeofence);
                }
            }
            for (ParcelableGeofence remove : hashSet) {
                this.f255231d.remove(remove);
            }
        }
        try {
            C91018d.m148680c();
            C74637ae aeVar = this.f255233f;
            C38725y d = C38726z.m68011d(C39226b.TAG_CLASSIC_SEARCH_SIDEKICK_LO);
            ((C38570a) d).f101954b = 3;
            Location location = (Location) C90877ak.m148472f(aeVar.mo71020c(d.mo41492a()));
            if (location != null) {
                mo85852c(location);
            }
        } catch (ExecutionException e) {
            C59104x d2 = f255228a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "NotificationGeofenceHe");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(11669)).mo56386p("Unable to get location");
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: e */
    public final void mo85854e() {
        C58976aa aaVar = C58975e.f156826a;
        C91018d.m148680c();
        try {
            new C91285a("remove geofences by PendingIntent").mo17709a((C21551h) C90877ak.m148472f(this.f255232e.e(this.f255238k, C39226b.TAG_CLASSIC_SEARCH_SIDEKICK_LO)));
        } catch (Exception e) {
            C59104x d = f255228a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NotificationGeofenceHe");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(11671)).mo56386p("Failed to remove geofences");
        }
    }
}
