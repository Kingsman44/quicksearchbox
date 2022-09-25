package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127122b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129565ag;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129566ah;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128548e;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.C128582b;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.C51809dy;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.o */
/* compiled from: PG */
final /* synthetic */ class C129493o implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C129484h f355528a;

    public C129493o(C129484h hVar) {
        this.f355528a = hVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C128548e eVar = (C128548e) obj;
        C69664n.m101061g(eVar, "p0");
        C129484h hVar = this.f355528a;
        C128582b bVar = (C128582b) hVar.f355494b.getChildFragmentManager().f634a.mo670b(R.id.assistant_p6glow_container);
        if (bVar != null) {
            bVar.mo17754z().mo108537g();
        }
        C127122b bVar2 = (C127122b) eVar.f353476a;
        if (bVar2.f350028c == null) {
            C129676j jVar = C129676j.f355890c;
        }
        C51809dy dyVar = bVar2.f350027b;
        if (dyVar == null) {
            dyVar = C51809dy.f135933f;
        }
        String str = dyVar.f135936b;
        C51809dy dyVar2 = bVar2.f350027b;
        if (dyVar2 == null) {
            dyVar2 = C51809dy.f135933f;
        }
        String str2 = dyVar2.f135936b;
        C69664n.m101060f(str2, "request.data.clientOpName");
        if (C69664n.m101066l(str2, "core.DISMISS_ASSISTANT") || C69664n.m101066l(str2, "ui.DISMISS")) {
            hVar.f355504l.mo109080a();
            return;
        }
        C129566ah ahVar = hVar.f355496d;
        C129676j jVar2 = bVar2.f350028c;
        if (jVar2 == null) {
            jVar2 = C129676j.f355890c;
        }
        C69664n.m101060f(jVar2, "request.navigationHint");
        C129565ag.m211551a(ahVar, jVar2);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
