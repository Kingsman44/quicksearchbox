package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127135ab;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127137ad;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127163w;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127165y;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127166z;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.apps.search.assistant.surfaces.voice.p9689l.C128239a;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.C130166ap;
import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.android.libraries.search.assistant.p2585i.C33481e;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.p3926e.C51997gw;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import com.google.protobuf.C62971cq;
import com.google.protobuf.p4750c.p4751a.C62949a;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.text.ShowTextPerformer$startPrefetch$1$commit$1", mo61344c = "ShowTextPerformer.kt", mo61345d = "invokeSuspend", mo61346e = {50})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.f.a */
/* compiled from: PG */
final class C129238a extends C69572j implements C69630p {

    /* renamed from: a */
    int f354991a;

    /* renamed from: b */
    final /* synthetic */ C129240c f354992b;

    /* renamed from: c */
    final /* synthetic */ C51809dy f354993c;

    /* renamed from: d */
    final /* synthetic */ C127289i f354994d;

    /* renamed from: e */
    final /* synthetic */ C119793ao f354995e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129238a(C129240c cVar, C51809dy dyVar, C127289i iVar, C119793ao aoVar, C69577g gVar) {
        super(2, gVar);
        this.f354992b = cVar;
        this.f354993c = dyVar;
        this.f354994d = iVar;
        this.f354995e = aoVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C129238a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C129676j jVar;
        int a;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f354991a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C129240c cVar = this.f354992b;
            C51809dy dyVar = this.f354993c;
            C127289i iVar = this.f354994d;
            C119793ao aoVar = this.f354995e;
            this.f354991a = 1;
            C127163w wVar = cVar.f355002c;
            C127165y yVar = (C127165y) C127166z.f350092g.createBuilder();
            C69664n.m101060f(yVar, "newBuilder()");
            C127135ab a2 = C69664n.m101061g(yVar, "builder");
            a2.mo107958b(dyVar);
            Duration ofSeconds = Duration.ofSeconds(5);
            C69664n.m101060f(ofSeconds, "ofSeconds(5)");
            a2.mo107962f(C62949a.m95466a(ofSeconds));
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C62971cq cqVar = dwVar.f135932a;
            C69664n.m101060f(cqVar, "clientOp.args.argList");
            C33480d dVar = C129240c.f355000a;
            C69664n.m101060f(dVar, "SHOW_TEXT_ARGS");
            C52003hb hbVar = (C52003hb) C33481e.m62059b(cqVar, dVar);
            if (hbVar == null || (a = C51997gw.m86463a(hbVar.f136485h)) == 0 || a != 2) {
                jVar = C130166ap.m212503a();
            } else {
                jVar = C129240c.f355001b;
            }
            a2.mo107960d(jVar);
            a2.mo107961e(iVar);
            a2.mo107959c(aoVar);
            obj = wVar.mo107974d(a2.mo107957a(), new C70334de(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C127137ad adVar = (C127137ad) obj;
        C129240c cVar2 = this.f354992b;
        C119793ao aoVar2 = this.f354995e;
        if ((2 & adVar.f350049a) != 0) {
            C37215b bVar = cVar2.f355003d;
            C37252a d = C37176a.f97190gq.mo40811d(adVar.f350051c);
            C119834cb cbVar = aoVar2.f333672a;
            if (cbVar == null) {
                cbVar = C119834cb.f333765b;
            }
            C69664n.m101060f(cbVar, "clientOpContext.utteranceId");
            C128239a.m209324d(bVar, d, cbVar);
        }
        C52070ec ecVar = adVar.f350050b;
        if (ecVar == null) {
            ecVar = C52070ec.f136651d;
        }
        C69664n.m101060f(ecVar, "renderClientOpResponse.clientOpResult");
        return ecVar;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C129238a(this.f354992b, this.f354993c, this.f354994d, this.f354995e, gVar);
    }
}
