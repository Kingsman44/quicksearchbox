package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9811e;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127122b;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127125e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127126f;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127405b;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128547d;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128548e;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.p3926e.C51986gl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62942bv;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.e.h */
/* compiled from: PG */
final /* synthetic */ class C129393h implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C129389e f355322a;

    public C129393h(C129389e eVar) {
        this.f355322a = eVar;
    }

    public final /* synthetic */ void accept(Object obj) {
        C128548e eVar = (C128548e) obj;
        C69664n.m101061g(eVar, "p0");
        C129389e eVar2 = this.f355322a;
        C69664n.m101061g(eVar, "event");
        C59052c cVar = (C59052c) C129389e.f355307a.mo56224b();
        C51809dy dyVar = ((C127122b) eVar.f353476a).f350027b;
        if (dyVar == null) {
            dyVar = C51809dy.f135933f;
        }
        String str = dyVar.f135936b;
        C119793ao aoVar = ((C127122b) eVar.f353476a).f350030e;
        if (aoVar == null) {
            aoVar = C119793ao.f333670e;
        }
        C119834cb cbVar = aoVar.f333672a;
        if (cbVar == null) {
            cbVar = C119834cb.f333765b;
        }
        String str2 = cbVar.f333767a;
        cVar.mo56379ah(new C59094n(38298));
        cVar.mo56354G("onClientOp: %s, interaction id: %s", str, str2);
        C127122b bVar = (C127122b) eVar.f353476a;
        C51809dy dyVar2 = bVar.f350027b;
        if (dyVar2 == null) {
            dyVar2 = C51809dy.f135933f;
        }
        String str3 = dyVar2.f135936b;
        C69664n.m101060f(str3, "clientOpRequest.data.clientOpName");
        if (C69664n.m101066l(str3, "ui.SHOW_SUGGESTIONS")) {
            C128547d b = eVar.mo108513b((Runnable) null);
            C51809dy dyVar3 = bVar.f350027b;
            if (dyVar3 == null) {
                dyVar3 = C51809dy.f135933f;
            }
            C52070ec a = C127405b.m208357a(dyVar3, "show_suggestions_args", C51986gl.f136421f.getParserForType(), new C129392g(eVar2));
            C69664n.m101060f(a, "fun onClientOp(event: Ev…WithAnimation()\n    }\n  }");
            C127125e eVar3 = (C127125e) C127126f.f350033d.createBuilder();
            eVar3.copyOnWrite();
            C127126f fVar = (C127126f) eVar3.instance;
            a.getClass();
            fVar.f350036b = a;
            fVar.f350035a |= 1;
            C62942bv build = eVar3.build();
            C69664n.m101060f(build, "newBuilder().setClientOpResult(result).build()");
            b.mo108511a(build);
            return;
        }
        C51809dy dyVar4 = bVar.f350027b;
        if (dyVar4 == null) {
            dyVar4 = C51809dy.f135933f;
        }
        String str4 = dyVar4.f135936b;
        C69664n.m101060f(str4, "clientOpRequest.data.clientOpName");
        if (C69664n.m101066l(str4, "core.DISMISS_ASSISTANT") || C69664n.m101066l(str4, "ui.DISMISS")) {
            eVar2.f355315i.mo109080a();
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
