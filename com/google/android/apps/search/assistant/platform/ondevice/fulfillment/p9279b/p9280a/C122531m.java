package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122093b;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122094c;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122095d;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122101j;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122102k;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122103l;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17597g;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.m */
/* compiled from: PG */
final class C122531m implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C122093b f339644a;

    /* renamed from: b */
    final /* synthetic */ C122532n f339645b;

    public C122531m(C122532n nVar, C122093b bVar) {
        this.f339645b = nVar;
        this.f339644a = bVar;
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C122101j jVar = (C122101j) obj;
        C17597g gVar = this.f339645b.f339648c;
        if (gVar != null) {
            C122094c cVar = (C122094c) C122095d.f338736e.createBuilder();
            cVar.copyOnWrite();
            C122095d dVar = (C122095d) cVar.instance;
            jVar.getClass();
            dVar.f338740c = jVar;
            dVar.f338739b = 2;
            String str = this.f339644a.f338732b;
            cVar.copyOnWrite();
            C122095d dVar2 = (C122095d) cVar.instance;
            str.getClass();
            dVar2.f338738a |= 1;
            dVar2.f338741d = str;
            gVar.mo20123c((C122095d) cVar.build());
            return;
        }
        ((C59052c) ((C59052c) C122532n.f339646a.mo56226d()).mo56372aa(34782)).mo56386p("Missing response stream to send context to. This leads to dropped responses.");
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C17597g gVar = this.f339645b.f339648c;
        if (gVar != null) {
            C122094c cVar = (C122094c) C122095d.f338736e.createBuilder();
            C122102k kVar = (C122102k) C122103l.f338754c.createBuilder();
            String th2 = th.toString();
            kVar.copyOnWrite();
            C122103l lVar = (C122103l) kVar.instance;
            th2.getClass();
            lVar.f338756a |= 1;
            lVar.f338757b = th2;
            cVar.copyOnWrite();
            C122095d dVar = (C122095d) cVar.instance;
            C122103l lVar2 = (C122103l) kVar.build();
            lVar2.getClass();
            dVar.f338740c = lVar2;
            dVar.f338739b = 3;
            String str = this.f339644a.f338732b;
            cVar.copyOnWrite();
            C122095d dVar2 = (C122095d) cVar.instance;
            str.getClass();
            dVar2.f338738a |= 1;
            dVar2.f338741d = str;
            gVar.mo20123c((C122095d) cVar.build());
            return;
        }
        ((C59052c) ((C59052c) C122532n.f339646a.mo56226d()).mo56372aa(34781)).mo56386p("Missing response stream to send context to. This leads to dropped responses.");
    }
}
