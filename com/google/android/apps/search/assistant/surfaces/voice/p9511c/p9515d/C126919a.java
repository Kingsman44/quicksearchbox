package com.google.android.apps.search.assistant.surfaces.voice.p9511c.p9515d;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127135ab;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127137ad;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127163w;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127165y;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127166z;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.apps.search.assistant.surfaces.voice.p9689l.C128239a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.protobuf.p4750c.p4751a.C62949a;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.common.performer.DisplayClientOpPrefetcher$startPrefetch$1$commit$1", mo61344c = "DisplayClientOpPrefetcher.kt", mo61345d = "invokeSuspend", mo61346e = {55})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.c.d.a */
/* compiled from: PG */
final class C126919a extends C69572j implements C69630p {

    /* renamed from: a */
    int f349438a;

    /* renamed from: b */
    final /* synthetic */ C126921c f349439b;

    /* renamed from: c */
    final /* synthetic */ C51809dy f349440c;

    /* renamed from: d */
    final /* synthetic */ C127289i f349441d;

    /* renamed from: e */
    final /* synthetic */ C119793ao f349442e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126919a(C126921c cVar, C51809dy dyVar, C127289i iVar, C119793ao aoVar, C69577g gVar) {
        super(2, gVar);
        this.f349439b = cVar;
        this.f349440c = dyVar;
        this.f349441d = iVar;
        this.f349442e = aoVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126919a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f349438a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C126921c cVar = this.f349439b;
            C127163w wVar = cVar.f349447a;
            C51809dy dyVar = this.f349440c;
            C127289i iVar = this.f349441d;
            C119793ao aoVar = this.f349442e;
            C127165y yVar = (C127165y) C127166z.f350092g.createBuilder();
            C69664n.m101060f(yVar, "newBuilder()");
            C127135ab a = C69664n.m101061g(yVar, "builder");
            a.mo107958b(dyVar);
            a.mo107962f(C62949a.m95466a(cVar.f349450d));
            a.mo107960d(cVar.f349451e);
            a.mo107961e(iVar);
            a.mo107959c(aoVar);
            C127166z a2 = a.mo107957a();
            this.f349438a = 1;
            obj = wVar.mo107974d(a2, new C70334de(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C126921c cVar2 = this.f349439b;
        C119793ao aoVar2 = this.f349442e;
        C127137ad adVar = (C127137ad) obj;
        if ((adVar.f350049a & 2) != 0) {
            C37215b bVar = cVar2.f349449c;
            C37252a d = C37176a.f97190gq.mo40811d(adVar.f350051c);
            C119834cb cbVar = aoVar2.f333672a;
            if (cbVar == null) {
                cbVar = C119834cb.f333765b;
            }
            C69664n.m101060f(cbVar, "context.utteranceId");
            C128239a.m209324d(bVar, d, cbVar);
        }
        C52070ec ecVar = adVar.f350050b;
        if (ecVar == null) {
            ecVar = C52070ec.f136651d;
        }
        C69664n.m101060f(ecVar, "clientOpResult");
        return ecVar;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126919a(this.f349439b, this.f349440c, this.f349441d, this.f349442e, gVar);
    }
}
