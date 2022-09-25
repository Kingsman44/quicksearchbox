package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9607d;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119847co;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119848cp;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9520a.C126937e;
import com.google.android.apps.search.assistant.surfaces.voice.p9689l.C128239a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p3186j$.time.Duration;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71061dg;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71062dh;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71064dj;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71065dk;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71066dl;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71068dn;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71070dp;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.d.b */
/* compiled from: PG */
public final class C127521b {

    /* renamed from: a */
    public static final C59071e f351154a = C59071e.m91331h();

    /* renamed from: b */
    public final C37215b f351155b;

    public C127521b(C37215b bVar) {
        C69664n.m101061g(bVar, "appFlowLogger");
        this.f351155b = bVar;
    }

    /* renamed from: g */
    private final void m208501g(String str, C127520a aVar) {
        C37215b bVar = this.f351155b;
        C37252a d = C37176a.f97264iK.mo40811d(C128239a.m209323c(aVar.f351151a));
        C71061dg dgVar = (C71061dg) C71066dl.f189528e.createBuilder();
        C69664n.m101060f(dgVar, "newBuilder()");
        C71068dn a = C69664n.m101061g(dgVar, "builder");
        int i = aVar.f351152b;
        C71061dg dgVar2 = a.f189534a;
        dgVar2.copyOnWrite();
        C71066dl dlVar = (C71066dl) dgVar2.instance;
        dlVar.f189530a |= 1;
        dlVar.f189533d = i;
        C127522c.m208509a(d, a.mo62605a());
        C128239a.m209322b(bVar, d, str);
        Duration duration = aVar.f351153c;
        if (duration != null) {
            C128239a.m209322b(this.f351155b, C37176a.f97096fB.mo40811d(C128239a.m209323c(duration)), str);
        }
    }

    /* renamed from: a */
    public final void mo108113a(Exception exc, C127520a aVar) {
        C69664n.m101061g(aVar, "request");
        C59052c cVar = (C59052c) f351154a.mo56224b();
        cVar.mo56379ah(new C59094n(37484));
        cVar.mo56389s("logInteractionStarted from deepplink entry with request:%s", aVar);
        String a = C128239a.m209321a();
        m208501g(a, aVar);
        mo108115c(a, exc);
    }

    /* renamed from: b */
    public final void mo108114b(C119834cb cbVar, C127520a aVar) {
        C69664n.m101061g(cbVar, "interactionId");
        C69664n.m101061g(aVar, "request");
        C59052c cVar = (C59052c) f351154a.mo56224b();
        cVar.mo56379ah(new C59094n(37485));
        cVar.mo56389s("logInteractionStarted from deeplink entry with request:%s", aVar);
        String str = cbVar.f333767a;
        C69664n.m101060f(str, "interactionId.id");
        m208501g(str, aVar);
        C37215b bVar = this.f351155b;
        C37258g gVar = C37176a.f97097fC;
        C69664n.m101060f(gVar, "MAIN_ASSISTANT_INTERACTION_STARTED");
        String str2 = cbVar.f333767a;
        C69664n.m101060f(str2, "interactionId.id");
        C128239a.m209322b(bVar, gVar, str2);
    }

    /* renamed from: c */
    public final void mo108115c(String str, Exception exc) {
        C59052c cVar = (C59052c) ((C59052c) f351154a.mo56224b()).mo56382g(exc);
        cVar.mo56379ah(new C59094n(37486));
        cVar.mo56386p("Interaction failure.");
        int i = true != (exc instanceof C126937e) ? 4 : 3;
        C37215b bVar = this.f351155b;
        C37252a a = C37176a.f97205hE.mo40803a(i - 2, "main_assistant_interaction");
        ((C37253b) a).mo40794r(str);
        C128239a.m209322b(bVar, a, str);
    }

    /* renamed from: d */
    public final void mo108116d(Exception exc, C127524e eVar) {
        C69664n.m101061g(eVar, "request");
        C59052c cVar = (C59052c) f351154a.mo56224b();
        cVar.mo56379ah(new C59094n(37488));
        cVar.mo56389s("logSelfInteractionFailedToStart from self trigger with request:%s", eVar);
        String a = C128239a.m209321a();
        m208502h(a, eVar);
        mo108115c(a, exc);
    }

    /* renamed from: e */
    public final void mo108117e(C119834cb cbVar, C127524e eVar) {
        C69664n.m101061g(cbVar, "interactionId");
        C69664n.m101061g(eVar, "request");
        C59052c cVar = (C59052c) f351154a.mo56224b();
        cVar.mo56379ah(new C59094n(37489));
        cVar.mo56389s("logInteractionStarted from self trigger with request:%s", eVar);
        String str = cbVar.f333767a;
        C69664n.m101060f(str, "interactionId.id");
        m208502h(str, eVar);
        C37215b bVar = this.f351155b;
        C37258g gVar = C37176a.f97097fC;
        C69664n.m101060f(gVar, "MAIN_ASSISTANT_INTERACTION_STARTED");
        String str2 = cbVar.f333767a;
        C69664n.m101060f(str2, "interactionId.id");
        C128239a.m209322b(bVar, gVar, str2);
    }

    /* renamed from: f */
    public final void mo108118f(String str, C127523d dVar) {
        C37252a aVar;
        C37215b bVar = this.f351155b;
        if (dVar.f351156a.isZero()) {
            aVar = C37176a.f97196gw.mo40811d(C128239a.m209323c(dVar.f351158c));
            C71061dg dgVar = (C71061dg) C71066dl.f189528e.createBuilder();
            C69664n.m101060f(dgVar, "newBuilder()");
            C71068dn a = C69664n.m101061g(dgVar, "builder");
            int i = dVar.f351157b;
            C71061dg dgVar2 = a.f189534a;
            dgVar2.copyOnWrite();
            C71066dl dlVar = (C71066dl) dgVar2.instance;
            dlVar.f189530a |= 1;
            dlVar.f189533d = i;
            C71062dh dhVar = (C71062dh) C71065dk.f189524c.createBuilder();
            C69664n.m101060f(dhVar, "newBuilder()");
            C71070dp a2 = C69664n.m101061g(dhVar, "builder");
            a2.mo62608b(C71064dj.INVOCATION);
            a.mo62606b(a2.mo62607a());
            C127522c.m208509a(aVar, a.mo62605a());
        } else {
            aVar = C37176a.f97196gw.mo40811d(C128239a.m209323c(dVar.f351156a));
            C71061dg dgVar3 = (C71061dg) C71066dl.f189528e.createBuilder();
            C69664n.m101060f(dgVar3, "newBuilder()");
            C71068dn a3 = C69664n.m101061g(dgVar3, "builder");
            int i2 = dVar.f351157b;
            C71061dg dgVar4 = a3.f189534a;
            dgVar4.copyOnWrite();
            C71066dl dlVar2 = (C71066dl) dgVar4.instance;
            dlVar2.f189530a |= 1;
            dlVar2.f189533d = i2;
            C71062dh dhVar2 = (C71062dh) C71065dk.f189524c.createBuilder();
            C69664n.m101060f(dhVar2, "newBuilder()");
            C71070dp a4 = C69664n.m101061g(dhVar2, "builder");
            a4.mo62608b(C71064dj.SYS_UI);
            a3.mo62606b(a4.mo62607a());
            C127522c.m208509a(aVar, a3.mo62605a());
        }
        C128239a.m209322b(bVar, aVar, str);
        C128239a.m209322b(this.f351155b, C37176a.f97096fB.mo40811d(C128239a.m209323c(dVar.f351158c)), str);
    }

    /* renamed from: h */
    private final void m208502h(String str, C127524e eVar) {
        C37258g gVar;
        C119847co coVar;
        C119851cs csVar = eVar.f351161c;
        int i = csVar.f333806b;
        int b = C119848cp.m198740b(i);
        int i2 = b - 1;
        if (b != 0) {
            if (i2 == 0) {
                gVar = C37176a.f97197gx;
            } else if (i2 == 1) {
                if (i == 3) {
                    coVar = (C119847co) csVar.f333807c;
                } else {
                    coVar = C119847co.f333794b;
                }
                C51805du duVar = coVar.f333796a;
                if (duVar == null) {
                    duVar = C51805du.f135924e;
                }
                C69664n.m101060f(duVar, "loggingRequest.request.clientInput.clientInput");
                if (duVar.f135929d.containsKey("text_input_params")) {
                    gVar = C37176a.f97263iJ;
                } else {
                    gVar = C37176a.f97198gy;
                }
            } else if (i2 != 2) {
                throw new C69677g();
            } else {
                throw new AssertionError("InteractionRequest type not set.");
            }
            C37215b bVar = this.f351155b;
            C37252a d = gVar.mo40811d(C128239a.m209323c(eVar.f351159a));
            C71061dg dgVar = (C71061dg) C71066dl.f189528e.createBuilder();
            C69664n.m101060f(dgVar, "newBuilder()");
            C71068dn a = C69664n.m101061g(dgVar, "builder");
            int i3 = eVar.f351160b;
            C71061dg dgVar2 = a.f189534a;
            dgVar2.copyOnWrite();
            C71066dl dlVar = (C71066dl) dgVar2.instance;
            dlVar.f189530a = 1 | dlVar.f189530a;
            dlVar.f189533d = i3;
            C127522c.m208509a(d, a.mo62605a());
            C128239a.m209322b(bVar, d, str);
            Duration duration = eVar.f351162d;
            if (duration != null) {
                C128239a.m209322b(this.f351155b, C37176a.f97096fB.mo40811d(C128239a.m209323c(duration)), str);
                return;
            }
            return;
        }
        throw null;
    }
}
