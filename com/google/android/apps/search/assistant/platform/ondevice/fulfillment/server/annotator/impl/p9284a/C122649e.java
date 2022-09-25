package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.p9284a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122959k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122998as;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47637j;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.a.e */
/* compiled from: PG */
public final /* synthetic */ class C122649e implements C122998as {

    /* renamed from: a */
    public final /* synthetic */ C122641au f339888a;

    public /* synthetic */ C122649e(C122641au auVar) {
        this.f339888a = auVar;
    }

    /* renamed from: a */
    public final C60870cx mo105711a() {
        Optional optional;
        C60870cx cxVar;
        C60870cx cxVar2;
        Optional optional2;
        C60870cx cxVar3;
        C122641au auVar = this.f339888a;
        if (!auVar.f339875r.f339910a || auVar.f339859b.f339499e) {
            return C60856cj.m92900i(Optional.empty());
        }
        C60870cx a = auVar.f339860c.mo105841a();
        C122959k e = auVar.f339861d.mo105802e();
        C60870cx c = auVar.f339868k.mo105820c(21003, new C122634an(e));
        if (auVar.f339872o) {
            optional = Optional.m71637of(auVar.f339862e.mo105802e());
        } else {
            optional = Optional.empty();
        }
        Optional optional3 = optional;
        if (optional3.isPresent()) {
            cxVar = auVar.f339868k.mo105820c(21004, new C122635ao(optional3));
        } else {
            cxVar = C60856cj.m92900i(Optional.empty());
        }
        C60870cx cxVar4 = cxVar;
        C122959k e2 = auVar.f339877t.f340378a.mo105802e();
        C60870cx c2 = auVar.f339868k.mo105820c(21005, new C122636ap(e2));
        C122959k e3 = auVar.f339863f.mo105802e();
        C60870cx c3 = auVar.f339868k.mo105820c(21006, new C122637aq(e3));
        Optional of = auVar.f339871n ? Optional.m71637of(auVar.f339864g.mo105802e()) : Optional.empty();
        if (of.isPresent()) {
            cxVar2 = C122641au.m202044d((C122959k) of.get());
        } else {
            cxVar2 = C60856cj.m92900i(Optional.empty());
        }
        C60870cx cxVar5 = cxVar2;
        if (auVar.f339870m.f131520a) {
            optional2 = Optional.m71637of(auVar.f339865h.mo105802e());
        } else {
            optional2 = Optional.empty();
        }
        Optional optional4 = optional2;
        if (optional4.isPresent()) {
            cxVar3 = C122641au.m202044d((C122959k) optional4.get());
        } else {
            cxVar3 = C60856cj.m92900i(Optional.empty());
        }
        C60870cx cxVar6 = cxVar3;
        C122638ar arVar = r1;
        C47637j d = C47638k.m84753d(a, c, cxVar4, c2, c3, cxVar5, cxVar6);
        C122641au auVar2 = auVar;
        C122638ar arVar2 = new C122638ar(auVar, a, e, c, optional3, cxVar4, e2, c2, e3, c3, of, cxVar5, optional4, cxVar6);
        return d.mo51521b(arVar, auVar2.f339869l);
    }
}
