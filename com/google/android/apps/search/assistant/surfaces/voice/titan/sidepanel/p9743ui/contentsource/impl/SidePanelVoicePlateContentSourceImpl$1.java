package com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.contentsource.impl;

import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128078b;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128079ba;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128080bb;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128081bc;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128082bd;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128122w;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128123x;
import com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.p9749c.p9750a.C128660a;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71643cp;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.contentsource.impl.SidePanelVoicePlateContentSourceImpl$1 */
/* compiled from: PG */
public final class SidePanelVoicePlateContentSourceImpl$1 implements C2376g {

    /* renamed from: a */
    final /* synthetic */ C128670i f353686a;

    /* renamed from: b */
    final /* synthetic */ C47215a f353687b;

    public SidePanelVoicePlateContentSourceImpl$1(C128670i iVar, C47215a aVar) {
        this.f353686a = iVar;
        this.f353687b = aVar;
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        C128670i iVar = this.f353686a;
        C58976aa aaVar = C58975e.f156826a;
        if (iVar.f353716h == null) {
            C59052c cVar = (C59052c) C128670i.f353709a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "SidePanelVPContentSrc");
            cVar.mo56379ah(new C59094n(37945));
            cVar.mo56386p("Missing VoicePlateClassicServiceStub");
        } else {
            C70862aj ajVar = iVar.f353714f;
            if (ajVar != null) {
                ajVar.mo20121a();
            }
            C70862aj ajVar2 = iVar.f353715g;
            if (ajVar2 != null) {
                ajVar2.mo20121a();
            }
            iVar.f353714f = iVar.f353716h.mo108343b(new C128668g(iVar));
            C70862aj ajVar3 = iVar.f353714f;
            if (ajVar3 != null) {
                C128079ba baVar = (C128079ba) C128082bd.f352414c.createBuilder();
                C128080bb bbVar = (C128080bb) C128081bc.f352410c.createBuilder();
                C128078b bVar = C128078b.CLIENT_TITAN_DRL_VOICE_PLATE;
                bbVar.copyOnWrite();
                C128081bc bcVar = (C128081bc) bbVar.instance;
                bcVar.f352413b = bVar.f352409d;
                bcVar.f352412a |= 1;
                baVar.copyOnWrite();
                C128082bd bdVar = (C128082bd) baVar.instance;
                C128081bc bcVar2 = (C128081bc) bbVar.build();
                bcVar2.getClass();
                bdVar.f352417b = bcVar2;
                bdVar.f352416a = 1;
                ajVar3.mo20123c(baVar.build());
            }
            C128122w wVar = iVar.f353716h;
            iVar.f353715g = C70876o.m103761b(wVar.f189039a.mo39510a(C128123x.m209239e(), wVar.f189040b), new C128669h(iVar), true);
        }
        C128667f fVar = this.f353686a.f353710b;
        C128660a aVar = fVar.f353705d;
        C128666e eVar = fVar.f353703b;
        C69664n.m101061g(eVar, "callback");
        aVar.f353685a.add(eVar);
    }

    /* renamed from: gW */
    public final void mo3521gW(C2391v vVar) {
        C128670i iVar = this.f353686a;
        C58976aa aaVar = C58975e.f156826a;
        C70862aj ajVar = iVar.f353714f;
        if (ajVar != null) {
            ajVar.mo20121a();
        }
        C71643cp cpVar = iVar.f353711c.f353697b;
        if (cpVar != null) {
            cpVar.mo62723u((CancellationException) null);
        }
        C70862aj ajVar2 = iVar.f353715g;
        if (ajVar2 != null) {
            ajVar2.mo20121a();
        }
        C128667f fVar = this.f353686a.f353710b;
        C128660a aVar = fVar.f353705d;
        C128666e eVar = fVar.f353703b;
        C69664n.m101061g(eVar, "callback");
        aVar.f353685a.remove(eVar);
        this.f353687b.getLifecycle().mo5791c(this);
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}
