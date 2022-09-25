package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107460a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107502c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107503d;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.C107504e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107473al;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107474am;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a.p8302a.C107475an;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.protobuf.C62942bv;
import com.google.speech.p5224k.p5225a.C67187ae;
import com.google.speech.p5224k.p5225a.C67190ah;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.gf */
/* compiled from: PG */
public final class C108371gf {
    /* renamed from: a */
    public static final void m180144a(Optional optional, C107698i iVar, C107710u uVar, C87682aj ajVar, String str, String str2) {
        C69664n.m101061g(optional, "queryOptional");
        C69664n.m101061g(iVar, "opaClientEventSender");
        C69664n.m101061g(str, "language");
        C69664n.m101061g(str2, "tts");
        Boolean bool = (Boolean) optional.map(C108370ge.f301423a).orElse(true);
        C69664n.m101060f(bool, "shouldPlayTts");
        if (bool.booleanValue()) {
            if (uVar != null) {
                uVar.mo96220c(ajVar, C88244um.TTS_PLAYBACK_DONE);
            }
            C67187ae aeVar = (C67187ae) C67190ah.f182619q.createBuilder();
            aeVar.copyOnWrite();
            C67190ah ahVar = (C67190ah) aeVar.instance;
            ahVar.f182622a |= 512;
            ahVar.f182629h = true;
            aeVar.copyOnWrite();
            C67190ah ahVar2 = (C67190ah) aeVar.instance;
            ahVar2.f182622a |= 1024;
            ahVar2.f182630i = true;
            if (true == TextUtils.isEmpty(str)) {
                str = "en-US";
            }
            aeVar.copyOnWrite();
            C67190ah ahVar3 = (C67190ah) aeVar.instance;
            str.getClass();
            ahVar3.f182622a |= 8192;
            ahVar3.f182632k = str;
            String str3 = "<speak>" + C69764m.m101231j(C69764m.m101231j(str2, "<speak>", BuildConfig.FLAVOR), "</speak>", BuildConfig.FLAVOR) + "</speak>";
            aeVar.copyOnWrite();
            C67190ah ahVar4 = (C67190ah) aeVar.instance;
            ahVar4.f182622a |= 2;
            ahVar4.f182626e = str3;
            C107474am amVar = (C107474am) C107475an.f299054e.createBuilder();
            amVar.copyOnWrite();
            C107475an anVar = (C107475an) amVar.instance;
            C67190ah ahVar5 = (C67190ah) aeVar.build();
            ahVar5.getClass();
            anVar.f299058c = ahVar5;
            anVar.f299057b = 2;
            C62942bv build = amVar.build();
            C69664n.m101060f(build, "newBuilder().setTtsServi…ceRequestBuilder).build()");
            C107503d dVar = (C107503d) C107504e.f299115c.createBuilder();
            C107502c cVar = C107502c.OPA_TEXT_TO_SPEECH;
            dVar.copyOnWrite();
            C107504e eVar = (C107504e) dVar.instance;
            eVar.f299118b = cVar.f299114n;
            eVar.f299117a |= 1;
            dVar.mo58885m(C107473al.f299053a, (C107475an) build);
            C62942bv build2 = dVar.build();
            C69664n.m101060f(build2, "newBuilder()\n        .se…entData)\n        .build()");
            C88489j jVar = new C88489j(C87739bu.OPA_SESSION_CLIENT_EVENT);
            jVar.mo82014b(C107460a.f299029a, (C107504e) build2);
            iVar.mo96219b(jVar.mo82013a());
        }
    }
}
