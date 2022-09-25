package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import android.content.Context;
import android.location.Location;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.util.C91057n;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.sidekick.main.entry.C91321az;
import com.google.android.apps.gsa.sidekick.main.p7202e.C91285a;
import com.google.android.apps.gsa.sidekick.main.p7202e.C91286b;
import com.google.android.apps.gsa.sidekick.main.trigger.C91625b;
import com.google.android.apps.gsa.sidekick.main.trigger.C91626c;
import com.google.android.apps.gsa.sidekick.main.trigger.service.C91635c;
import com.google.android.apps.gsa.sidekick.main.trigger.service.C91637e;
import com.google.android.gms.location.C144870aa;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21551h;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.search.location.C38716v;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.p375ai.p378b.C7805kp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.t */
/* compiled from: PG */
public final /* synthetic */ class C98138t implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C98064as f274047a;

    /* renamed from: b */
    public final /* synthetic */ C91321az f274048b;

    public /* synthetic */ C98138t(C98064as asVar, C91321az azVar) {
        this.f274047a = asVar;
        this.f274048b = azVar;
    }

    public final void run() {
        int i;
        C98064as asVar = this.f274047a;
        C91321az azVar = this.f274048b;
        Long l = azVar.f254866b.f255551a.f255562b;
        long m = asVar.mo90918m();
        long longValue = l == null ? 0 : l.longValue();
        long j = longValue - m;
        if (longValue == 0 || j < 0 || j > TimeUnit.HOURS.toSeconds(12)) {
            ((C89911f) asVar.f273817m.mo27525b()).mo83755a(new Throwable(String.format(Locale.US, "Current Time: %d, Next Alarm Time: %d", new Object[]{Long.valueOf(m), Long.valueOf(longValue)})), 119055758, 1323).mo83721a();
        }
        C91637e eVar = asVar.f273813i;
        Context context = asVar.f273808d;
        C91626c cVar = azVar.f254866b.f255551a;
        synchronized (C91637e.f255587c) {
            C91286b bVar = eVar.f255589e;
            C38716v vVar = eVar.f255590f;
            try {
                C91285a aVar = new C91285a("remove geofences by PendingIntent");
                if (bVar.f254770d) {
                    C91018d.m148680c();
                    try {
                        aVar.mo17709a((C21551h) C90877ak.m148472f(bVar.f254768b.e(vVar, C39226b.TAG_CLASSIC_SEARCH_SIDEKICK_LO)));
                    } catch (InterruptedException | ExecutionException e) {
                        ((C59052c) ((C59052c) ((C59052c) C91286b.f254767a.mo56225c()).mo56382g(e)).mo56372aa(11564)).mo56386p("can't register geofences");
                    }
                } else {
                    C91057n.m148759a(bVar.f254768b.e(vVar, C39226b.TAG_CLASSIC_SEARCH_SIDEKICK_LO), aVar, bVar.f254769c, "handleRemoveAllGeofences");
                }
            } catch (Exception e2) {
                ((C59052c) ((C59052c) ((C59052c) C91286b.f254767a.mo56226d()).mo56382g(e2)).mo56372aa(11563)).mo56386p("Failed to remove geofences");
            }
            Long l2 = cVar.f255562b;
            if (l2 != null && l2.longValue() > 0) {
                eVar.f255588d.mo78253c(0, l2.longValue() * 1000, C91635c.m149896a(context, "a:EntryProvider"));
            }
            Float f = cVar.f255563c;
            Location location = cVar.f255561a;
            if (!(f == null || location == null)) {
                C144870aa aaVar = new C144870aa();
                aaVar.mo120364b(location.getLatitude(), location.getLongitude(), f.floatValue());
                aaVar.mo120365c(-1);
                aaVar.f391810b = cVar.f255564d ? C91637e.f255586b : C91637e.f255585a;
                aaVar.f391809a = 2;
                aaVar.mo120366d("entry_trigger_conditions.EntryProvider");
                eVar.f255589e.mo85560a(C58485gu.m89846n(aaVar.mo120363a()), eVar.f255590f);
            }
            Collections.sort(cVar.f255565e);
            ArrayList arrayList = new ArrayList();
            for (C91625b bVar2 : C58557jl.m90125f(cVar.f255565e, 10)) {
                C144870aa aaVar2 = new C144870aa();
                C7805kp kpVar = bVar2.f255557b;
                aaVar2.mo120364b(kpVar.f27287b, kpVar.f27288c, (float) kpVar.f27291f);
                aaVar2.mo120365c(-1);
                aaVar2.mo120366d("entry_trigger_conditions." + "EntryProvider" + "." + bVar2.f255556a);
                if (bVar2.f255559d) {
                    i = C91637e.f255586b;
                } else {
                    i = C91637e.f255585a;
                }
                int i2 = bVar2.f255558c;
                aaVar2.f391809a = 4;
                aaVar2.f391810b = i;
                aaVar2.f391811c = i;
                arrayList.add(aaVar2.mo120363a());
            }
            if (!arrayList.isEmpty()) {
                eVar.f255589e.mo85560a(arrayList, eVar.f255590f);
            }
        }
        return;
    }
}
