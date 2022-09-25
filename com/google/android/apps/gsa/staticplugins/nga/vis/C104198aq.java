package com.google.android.apps.gsa.staticplugins.nga.vis;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.apps.gsa.nga.api.C74722bz;
import com.google.android.apps.gsa.nga.api.C74740x;
import com.google.android.apps.gsa.nga.api.C74742z;
import com.google.android.apps.gsa.nga.shared.p6326ao.C80970b;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80992l;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80996p;
import com.google.android.apps.gsa.nga.shared.p6334b.C81016b;
import com.google.android.apps.gsa.nga.shared.p6407v.C83314ii;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.nga.p8067j.C103335ap;
import com.google.android.apps.gsa.staticplugins.nga.vis.p8097a.C104171c;
import com.google.android.apps.gsa.staticplugins.nga.vis.p8097a.C104176h;
import com.google.android.apps.gsa.staticplugins.opa.C109714ms;
import com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121663t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.Set;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.vis.aq */
/* compiled from: PG */
public final /* synthetic */ class C104198aq implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ NgaRemoteVoiceInteractionSessionService f289861a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f289862b;

    public /* synthetic */ C104198aq(NgaRemoteVoiceInteractionSessionService ngaRemoteVoiceInteractionSessionService, Bundle bundle) {
        this.f289861a = ngaRemoteVoiceInteractionSessionService;
        this.f289862b = bundle;
    }

    public final Object get() {
        Optional optional;
        Object obj;
        NgaRemoteVoiceInteractionSessionService ngaRemoteVoiceInteractionSessionService = this.f289861a;
        Bundle bundle = this.f289862b;
        IBinder binder = bundle.getBinder("vis_events_callback");
        if (binder == null) {
            ((C58970a) ((C58970a) NgaRemoteVoiceInteractionSessionService.f289746a.mo56225c()).mo56372aa(21892)).mo56386p("eventsCallbackBinder is missing");
            optional = Optional.empty();
        } else {
            IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.apps.gsa.nga.api.INgaRemoteVisEventsCallback");
            if (queryLocalInterface instanceof C74742z) {
                obj = (C74742z) queryLocalInterface;
            } else {
                obj = new C74740x(binder);
            }
            if (obj == null) {
                ((C58970a) ((C58970a) NgaRemoteVoiceInteractionSessionService.f289746a.mo56225c()).mo56372aa(21891)).mo56386p("eventsCallback is null");
            }
            optional = Optional.ofNullable(obj);
        }
        C74742z zVar = (C74742z) optional.orElse((C74742z) ngaRemoteVoiceInteractionSessionService.f289748c.mo27525b());
        C74742z zVar2 = zVar;
        C104197ap apVar = ngaRemoteVoiceInteractionSessionService.f289747b;
        Context b = NgaRemoteVoiceInteractionSessionService.m172140b(ngaRemoteVoiceInteractionSessionService);
        Context context = b;
        b.getClass();
        bundle.getClass();
        zVar.getClass();
        C22871g gVar = (C22871g) apVar.f289841a.mo17428b();
        C22871g gVar2 = gVar;
        gVar.getClass();
        C109714ms msVar = (C109714ms) apVar.f289842b.mo17428b();
        C109714ms msVar2 = msVar;
        msVar.getClass();
        C74722bz bzVar = (C74722bz) apVar.f289843c.mo17428b();
        C74722bz bzVar2 = bzVar;
        bzVar.getClass();
        C80992l lVar = (C80992l) apVar.f289844d.mo17428b();
        C80992l lVar2 = lVar;
        lVar.getClass();
        C91142g gVar3 = (C91142g) apVar.f289845e.mo17428b();
        C91142g gVar4 = gVar3;
        gVar3.getClass();
        C104171c cVar = (C104171c) apVar.f289846f.mo17428b();
        C104171c cVar2 = cVar;
        cVar.getClass();
        C103335ap apVar2 = (C103335ap) apVar.f289847g.mo17428b();
        C103335ap apVar3 = apVar2;
        apVar2.getClass();
        C80970b bVar = (C80970b) apVar.f289848h.mo17428b();
        C80970b bVar2 = bVar;
        bVar.getClass();
        C104176h hVar = (C104176h) apVar.f289849i.mo17428b();
        C104176h hVar2 = hVar;
        hVar.getClass();
        C104203c cVar3 = (C104203c) apVar.f289850j.mo17428b();
        C104197ap apVar4 = apVar;
        C104203c cVar4 = cVar3;
        cVar3.getClass();
        C22871g gVar5 = (C22871g) apVar4.f289851k.mo17428b();
        C22871g gVar6 = gVar5;
        gVar5.getClass();
        Optional optional2 = (Optional) apVar4.f289852l.mo17428b();
        Optional optional3 = optional2;
        optional2.getClass();
        C80996p pVar = (C80996p) apVar4.f289853m.mo17428b();
        C80996p pVar2 = pVar;
        pVar.getClass();
        Set set = (Set) apVar4.f289854n.mo17428b();
        Set set2 = set;
        set.getClass();
        C22871g gVar7 = (C22871g) apVar4.f289855o.mo17428b();
        C22871g gVar8 = gVar7;
        gVar7.getClass();
        C83314ii iiVar = (C83314ii) apVar4.f289856p.mo17428b();
        C83314ii iiVar2 = iiVar;
        iiVar.getClass();
        C121663t tVar = (C121663t) apVar4.f289857q.mo17428b();
        C121663t tVar2 = tVar;
        tVar.getClass();
        C81016b bVar3 = (C81016b) apVar4.f289858r.mo17428b();
        C81016b bVar4 = bVar3;
        bVar3.getClass();
        C90821bm bmVar = (C90821bm) apVar4.f289859s.mo17428b();
        bmVar.getClass();
        C47770dh dhVar = (C47770dh) apVar4.f289860t.mo17428b();
        dhVar.getClass();
        return new C104196ao(context, bundle, zVar2, gVar2, msVar2, bzVar2, lVar2, gVar4, cVar2, apVar3, bVar2, hVar2, cVar4, gVar6, optional3, pVar2, set2, gVar8, iiVar2, tVar2, bVar4, bmVar, dhVar);
    }
}
