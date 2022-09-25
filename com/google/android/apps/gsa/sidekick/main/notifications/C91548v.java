package com.google.android.apps.gsa.sidekick.main.notifications;

import android.content.Intent;
import android.location.Location;
import com.google.android.apps.gsa.location.C74637ae;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.p489g.p493c.C9128a;
import com.google.android.apps.p489g.p493c.C9129b;
import com.google.android.apps.p489g.p493c.C9132e;
import com.google.android.apps.p489g.p493c.C9133f;
import com.google.android.gms.location.C144876ag;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.search.location.C38570a;
import com.google.android.libraries.search.location.C38725y;
import com.google.android.libraries.search.location.C38726z;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7718hj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.v */
/* compiled from: PG */
public final /* synthetic */ class C91548v implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ NotificationRefreshReceiver f255347a;

    /* renamed from: b */
    public final /* synthetic */ Intent f255348b;

    public /* synthetic */ C91548v(NotificationRefreshReceiver notificationRefreshReceiver, Intent intent) {
        this.f255347a = notificationRefreshReceiver;
        this.f255348b = intent;
    }

    public final void run() {
        C144876ag a;
        C58485gu<C7718hj> guVar;
        C9132e eVar;
        C9132e eVar2;
        NotificationRefreshReceiver notificationRefreshReceiver = this.f255347a;
        Intent intent = this.f255348b;
        C91544r rVar = (C91544r) notificationRefreshReceiver.f255190e.mo27525b();
        C91505at atVar = rVar.f255333b.f255217c;
        ArrayList<ParcelableGeofence> arrayList = new ArrayList<>();
        C144876ag a2 = C144876ag.m235472a(intent);
        if (a2 != null) {
            List<ParcelableGeofence> list = a2.f391825c;
            try {
                Location location = a2.f391826d;
                if (location == null) {
                    C91018d.m148680c();
                    C74637ae aeVar = atVar.f255233f;
                    C38725y d = C38726z.m68011d(C39226b.TAG_CLASSIC_SEARCH_SIDEKICK_LO);
                    ((C38570a) d).f101954b = 3;
                    location = (Location) C90877ak.m148472f(aeVar.mo71020c(d.mo41492a()));
                }
                int i = a2.f391824b;
                C58976aa aaVar = C58975e.f156826a;
                if (i != 2) {
                    if (i == 4) {
                        if (list != null) {
                            for (ParcelableGeofence parcelableGeofence : list) {
                                if (!parcelableGeofence.f391867a.equals("notification_9223372036854775807")) {
                                    arrayList.add(parcelableGeofence);
                                }
                            }
                        }
                    }
                } else if (list != null) {
                    boolean z = false;
                    for (ParcelableGeofence parcelableGeofence2 : list) {
                        if (parcelableGeofence2.f391867a.equals("notification_9223372036854775807")) {
                            z = true;
                        } else {
                            arrayList.add(parcelableGeofence2);
                        }
                    }
                    if (z && location != null) {
                        atVar.mo85852c(location);
                    }
                }
            } catch (ExecutionException e) {
                C59104x d2 = C91505at.f255228a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "NotificationGeofenceHe");
                ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(11656)).mo56386p("Unable to get location");
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        if (!arrayList.isEmpty() && (a = C144876ag.m235472a(intent)) != null) {
            C58976aa aaVar2 = C58975e.f156826a;
            int i2 = a.f391824b;
            int i3 = 95;
            if (i2 == 4) {
                C91500ao aoVar = rVar.f255333b;
                if (!aoVar.mo85848n()) {
                    Collections.emptyList();
                }
                synchronized (aoVar.f255221g) {
                    C9128a aVar = (C9128a) aoVar.f255220f.toBuilder();
                    boolean z2 = false;
                    for (ParcelableGeofence parcelableGeofence3 : arrayList) {
                        String str = parcelableGeofence3.f391867a;
                        long parseLong = Long.parseLong(str.substring(str.indexOf(95) + 1));
                        int i4 = 0;
                        while (true) {
                            if (i4 >= ((C9129b) aVar.instance).f31419b.size()) {
                                eVar2 = null;
                                i4 = 0;
                                break;
                            } else if (aVar.mo17429a(i4).f31438h.contains(Long.valueOf(parseLong))) {
                                eVar2 = (C9132e) aVar.mo17429a(i4).toBuilder();
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (eVar2 == null) {
                            ((C59052c) ((C59052c) C91500ao.f255213a.mo56226d()).mo56372aa(11648)).mo56389s("Couldn't find notification for: %s", parcelableGeofence3);
                        } else {
                            eVar2.copyOnWrite();
                            C9133f fVar = (C9133f) eVar2.instance;
                            C9133f fVar2 = C9133f.f31429j;
                            fVar.f31431a |= 16;
                            fVar.f31436f = aoVar.f255216b.mo26870b() / 1000;
                            aVar.mo17433e(i4, eVar2);
                            z2 = true;
                        }
                    }
                    if (z2) {
                        aoVar.f255220f = (C9129b) aVar.build();
                        aoVar.mo85842g();
                    }
                }
                rVar.mo85927f();
            } else if (i2 == 2) {
                C91500ao aoVar2 = rVar.f255333b;
                if (!aoVar2.mo85848n()) {
                    guVar = C58485gu.m89845m();
                } else {
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    synchronized (aoVar2.f255221g) {
                        C9128a aVar2 = (C9128a) aoVar2.f255220f.toBuilder();
                        for (ParcelableGeofence parcelableGeofence4 : arrayList) {
                            String str2 = parcelableGeofence4.f391867a;
                            long parseLong2 = Long.parseLong(str2.substring(str2.indexOf(i3) + 1));
                            int i5 = 0;
                            while (true) {
                                if (i5 >= ((C9129b) aVar2.instance).f31419b.size()) {
                                    eVar = null;
                                    i5 = 0;
                                    break;
                                } else if (aVar2.mo17429a(i5).f31438h.contains(Long.valueOf(parseLong2))) {
                                    eVar = (C9132e) aVar2.mo17429a(i5).toBuilder();
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                            if (eVar == null) {
                                ((C59052c) ((C59052c) C91500ao.f255213a.mo56226d()).mo56372aa(11631)).mo56389s("Couldn't find notification for: %s", parcelableGeofence4);
                            } else if ((((C9133f) eVar.instance).f31431a & 16) != 0) {
                                eVar.copyOnWrite();
                                C9133f fVar3 = (C9133f) eVar.instance;
                                fVar3.f31431a &= -17;
                                fVar3.f31436f = 0;
                                eVar.copyOnWrite();
                                C9133f fVar4 = (C9133f) eVar.instance;
                                fVar4.f31431a |= 4;
                                fVar4.f31434d = false;
                                C7718hj hjVar = fVar4.f31432b;
                                if (hjVar == null) {
                                    hjVar = C7718hj.f26927af;
                                }
                                arrayList2.add(hjVar);
                                aVar2.mo17433e(i5, eVar);
                            }
                            i3 = 95;
                        }
                        if (!arrayList2.isEmpty()) {
                            aoVar2.f255220f = (C9129b) aVar2.build();
                            aoVar2.mo85842g();
                        }
                    }
                    guVar = C58485gu.m89842j(arrayList2);
                }
                for (C7718hj j : guVar) {
                    C91530d dVar = (C91530d) rVar.f255335d.mo85797j(j);
                    if (dVar != null) {
                        rVar.f255336e.mo85861c(dVar.mo85877c());
                    } else {
                        C59104x d3 = C91544r.f255331a.mo56226d();
                        d3.mo56378ag(C58975e.f156826a, "NotificationRefreshHlpr");
                        ((C59052c) ((C59052c) d3).mo56372aa(11601)).mo56386p("unable to find the notification!");
                    }
                }
            }
        }
    }
}
