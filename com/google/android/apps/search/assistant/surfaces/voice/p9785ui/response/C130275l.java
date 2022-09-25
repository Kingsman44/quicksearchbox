package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9518a.C126928f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127122b;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127125e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127126f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127128h;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128546c;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128547d;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128555l;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128558o;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71751eg;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.response.ResponseLayerClientOpDispatcher$dispatch$1", mo61344c = "ResponseLayerClientOpDispatcher.kt", mo61345d = "invokeSuspend", mo61346e = {53, 58})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.l */
/* compiled from: PG */
final class C130275l extends C69572j implements C69630p {

    /* renamed from: a */
    int f357120a;

    /* renamed from: b */
    final /* synthetic */ C126928f f357121b;

    /* renamed from: c */
    final /* synthetic */ C127122b f357122c;

    /* renamed from: d */
    final /* synthetic */ C128547d f357123d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C130275l(C126928f fVar, C127122b bVar, C128547d dVar, C69577g gVar) {
        super(2, gVar);
        this.f357121b = fVar;
        this.f357122c = bVar;
        this.f357123d = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C130275l) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f357120a;
        if (i == 0) {
            C69714l.m101134b(obj);
            this.f357120a = 1;
            if (C71751eg.m104937a(this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            try {
                C69714l.m101134b(obj);
                C52070ec ecVar = (C52070ec) obj;
                C128547d dVar = this.f357123d;
                C127125e eVar = (C127125e) C127126f.f350033d.createBuilder();
                C69664n.m101060f(eVar, "newBuilder()");
                C127128h a = C69664n.m101061g(eVar, "builder");
                C69664n.m101060f(ecVar, "result");
                a.mo107954b(ecVar);
                dVar.mo108511a(a.mo107953a());
            } catch (Throwable th) {
                C128547d dVar2 = this.f357123d;
                if (!dVar2.f353475a.f353480e.mo63050j(th) || !C128546c.m209791a(dVar2.f353475a.f353478c, C128558o.IN_PROCESS, C128558o.PROCESSED)) {
                    C59052c cVar = (C59052c) C128555l.f353489b.mo56226d();
                    Object obj2 = dVar2.f353475a.f353478c.get();
                    cVar.mo56379ah(new C59094n(37874));
                    cVar.mo56389s("Error-completing event failed; status=%s", obj2);
                }
                dVar2.f353475a.f353479d.mo108515c();
            }
            return C69788q.f186170a;
        } else {
            C69714l.m101134b(obj);
        }
        C126928f fVar = this.f357121b;
        C51809dy dyVar = this.f357122c.f350027b;
        if (dyVar == null) {
            dyVar = C51809dy.f135933f;
        }
        C69664n.m101060f(dyVar, "request.data");
        C119793ao aoVar = this.f357122c.f350030e;
        if (aoVar == null) {
            aoVar = C119793ao.f333670e;
        }
        C69664n.m101060f(aoVar, "request.clientOpContext");
        C127289i iVar = this.f357122c.f350029d;
        if (iVar == null) {
            iVar = C127289i.f350561i;
        }
        C69664n.m101060f(iVar, "request.queryContext");
        C60870cx a2 = fVar.mo107854a(dyVar, aoVar, iVar).mo104299a();
        C69664n.m101060f(a2, "prefetcher\n             …)\n              .commit()");
        this.f357120a = 2;
        obj = C71663i.m104690c(a2, this);
        if (obj == aVar) {
            return aVar;
        }
        C52070ec ecVar2 = (C52070ec) obj;
        C128547d dVar3 = this.f357123d;
        C127125e eVar2 = (C127125e) C127126f.f350033d.createBuilder();
        C69664n.m101060f(eVar2, "newBuilder()");
        C127128h a3 = C69664n.m101061g(eVar2, "builder");
        C69664n.m101060f(ecVar2, "result");
        a3.mo107954b(ecVar2);
        dVar3.mo108511a(a3.mo107953a());
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C130275l(this.f357121b, this.f357122c, this.f357123d, gVar);
    }
}
