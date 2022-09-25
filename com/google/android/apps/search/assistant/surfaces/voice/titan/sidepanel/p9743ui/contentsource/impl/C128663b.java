package com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.contentsource.impl;

import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128087bi;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128101bw;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.contentsource.impl.SidePanelEscapeHatchHandler$handleStateResponse$1", mo61344c = "SidePanelEscapeHatchHandler.kt", mo61345d = "invokeSuspend", mo61346e = {41})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.contentsource.impl.b */
/* compiled from: PG */
final class C128663b extends C69572j implements C69630p {

    /* renamed from: a */
    int f353692a;

    /* renamed from: b */
    final /* synthetic */ C128664c f353693b;

    /* renamed from: c */
    final /* synthetic */ C128101bw f353694c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128663b(C128664c cVar, C128101bw bwVar, C69577g gVar) {
        super(2, gVar);
        this.f353693b = cVar;
        this.f353694c = bwVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C128663b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C128087bi biVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f353692a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C128664c cVar = this.f353693b;
            C128101bw bwVar = this.f353694c;
            if (bwVar.f352470b == 4) {
                biVar = (C128087bi) bwVar.f352471c;
            } else {
                biVar = C128087bi.f352422f;
            }
            C83320io ioVar = biVar.f352426c;
            if (ioVar == null) {
                ioVar = C83320io.f227132d;
            }
            C69664n.m101060f(ioVar, "response.executing.utteranceId");
            this.f353692a = 1;
            if (cVar.mo108607a(ioVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C128663b(this.f353693b, this.f353694c, gVar);
    }
}
