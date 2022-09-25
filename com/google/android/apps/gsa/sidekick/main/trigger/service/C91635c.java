package com.google.android.apps.gsa.sidekick.main.trigger.service;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.google.android.apps.gsa.location.C74637ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.sidekick.main.entry.C91306ak;
import com.google.android.apps.gsa.sidekick.main.trigger.C91627d;
import com.google.android.apps.gsa.sidekick.main.trigger.C91628e;
import com.google.android.apps.gsa.sidekick.main.trigger.C91629f;
import com.google.android.apps.gsa.sidekick.main.trigger.C91630g;
import com.google.android.apps.gsa.sidekick.main.trigger.C91631h;
import com.google.android.apps.gsa.sidekick.main.trigger.TriggerConditionEvaluator;
import com.google.android.apps.gsa.sidekick.shared.util.C91966aq;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118475aj;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.gms.location.C144876ag;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.libraries.gcoreclient.p1788q.p1789a.C21616c;
import com.google.android.libraries.gcoreclient.p1788q.p1789a.C21617d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.location.C38570a;
import com.google.android.libraries.search.location.C38725y;
import com.google.android.libraries.search.location.C38726z;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.p4522b.C58485gu;
import com.google.p375ai.p378b.C7805kp;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.sidekick.main.trigger.service.c */
/* compiled from: PG */
public final class C91635c {

    /* renamed from: a */
    public final C21370a f255582a;

    /* renamed from: b */
    public final C91306ak f255583b;

    /* renamed from: c */
    private final C74637ae f255584c;

    public C91635c(C74637ae aeVar, C21370a aVar, C91306ak akVar) {
        this.f255584c = aeVar;
        this.f255582a = aVar;
        this.f255583b = akVar;
    }

    /* renamed from: a */
    public static PendingIntent m149896a(Context context, String str) {
        Intent intent = new Intent(str);
        intent.setClass(context, TriggerConditionReceiver.class);
        return PendingIntent.getBroadcast(context, 0, intent, 201326592);
    }

    /* renamed from: b */
    public static void m149897b(C118561t tVar, C118522by byVar, C91630g gVar) {
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        if (gVar != null) {
            C118475aj ajVar = (C118475aj) C118476ak.f328838a.createBuilder();
            ajVar.mo58885m(C91631h.f255576a, gVar);
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            C118476ak akVar = (C118476ak) ajVar.build();
            akVar.getClass();
            agVar.f328827g = akVar;
            agVar.f328821a |= 32;
        }
        tVar.mo103751b(byVar, (C118472ag) afVar.build());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Location mo86013c(C21617d dVar, boolean z) {
        Location location = null;
        if (dVar != null) {
            try {
                location = dVar.f59983a.f391826d;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return null;
            } catch (ExecutionException unused2) {
                return null;
            }
        }
        if (location != null || !z) {
            return location;
        }
        C74637ae aeVar = this.f255584c;
        C38725y d = C38726z.m68011d(C39226b.TAG_CLASSIC_SEARCH_SIDEKICK_LO);
        ((C38570a) d).f101954b = 3;
        return (Location) C90877ak.m148472f(aeVar.mo71020c(d.mo41492a()));
    }

    /* renamed from: d */
    public final C91630g mo86014d(Intent intent, boolean z) {
        TriggerConditionEvaluator.APriori aPriori;
        ArrayList<C21616c> arrayList = null;
        if (intent == null) {
            return null;
        }
        C21617d dVar = new C21617d(C144876ag.m235472a(intent));
        Location c = mo86013c(dVar, false);
        C91629f fVar = (C91629f) C91630g.f255570e.createBuilder();
        if (c != null) {
            C7805kp b = C91966aq.m150922b(c);
            fVar.copyOnWrite();
            C91630g gVar = (C91630g) fVar.instance;
            b.getClass();
            gVar.f255573b = b;
            gVar.f255572a |= 1;
            long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f255582a.mo26870b());
            fVar.copyOnWrite();
            C91630g gVar2 = (C91630g) fVar.instance;
            gVar2.f255572a |= 2;
            gVar2.f255574c = seconds;
        }
        if (z) {
            ArrayList arrayList2 = new ArrayList();
            if (!dVar.f59983a.mo120370b()) {
                List<ParcelableGeofence> list = dVar.f59983a.f391825c;
                if (list != null) {
                    arrayList = new ArrayList<>(list.size());
                    for (ParcelableGeofence cVar : list) {
                        arrayList.add(new C21616c(cVar));
                    }
                }
                if (arrayList != null) {
                    for (C21616c cVar2 : arrayList) {
                        arrayList2.add(cVar2.f59982a.f391867a);
                    }
                }
            }
            aPriori = new TriggerConditionEvaluator.APriori((List) arrayList2);
        } else {
            aPriori = new TriggerConditionEvaluator.APriori((List) C58485gu.m89845m());
        }
        C91627d dVar2 = (C91627d) C91628e.f255567b.createBuilder();
        C58485gu guVar = aPriori.f255555a;
        dVar2.copyOnWrite();
        C91628e eVar = (C91628e) dVar2.instance;
        C62971cq cqVar = eVar.f255569a;
        if (!cqVar.mo58948c()) {
            eVar.f255569a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) eVar.f255569a);
        C91628e eVar2 = (C91628e) dVar2.build();
        fVar.copyOnWrite();
        C91630g gVar3 = (C91630g) fVar.instance;
        eVar2.getClass();
        gVar3.f255575d = eVar2;
        gVar3.f255572a |= 4;
        return (C91630g) fVar.build();
    }
}
