package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119908e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9518a.C126928f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127121a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127122b;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127124d;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127125e;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127126f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127128h;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127163w;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.C130166ap;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128544a;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52349ol;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.b.c */
/* compiled from: PG */
public final class C129127c implements C126928f {

    /* renamed from: a */
    public static final Duration f354728a = Duration.ofSeconds(5);

    /* renamed from: b */
    public static final C129676j f354729b = C130166ap.m212503a();

    /* renamed from: e */
    private static final C51809dy f354730e;

    /* renamed from: c */
    public final C127163w f354731c;

    /* renamed from: d */
    public final C71422aw f354732d;

    /* renamed from: f */
    private final C128544a f354733f;

    static {
        C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
        C69664n.m101060f(dxVar, "newBuilder()");
        C52349ol a = C69664n.m101061g(dxVar, "builder");
        a.mo53840c("ui.KEEP_SCREEN_CONTENTS");
        f354730e = a.mo53838a();
    }

    public C129127c(C127163w wVar, C128544a aVar, C71422aw awVar) {
        C69664n.m101061g(wVar, "conversationDataStore");
        C69664n.m101061g(aVar, "uiClientOpStore");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f354731c = wVar;
        this.f354733f = aVar;
        this.f354732d = awVar;
    }

    /* renamed from: a */
    public final C119908e mo107854a(C51809dy dyVar, C119793ao aoVar, C127289i iVar) {
        C69664n.m101061g(dyVar, "clientOp");
        C69664n.m101061g(aoVar, "clientOpContext");
        C69664n.m101061g(iVar, "queryContext");
        C128544a aVar = this.f354733f;
        C127121a aVar2 = (C127121a) C127122b.f350024f.createBuilder();
        C69664n.m101060f(aVar2, "newBuilder()");
        C127124d a = C69664n.m101061g(aVar2, "builder");
        a.mo107950c(f354730e);
        a.mo107951d(C130166ap.m212503a());
        a.mo107952e(iVar);
        a.mo107949b(aoVar);
        C127122b a2 = a.mo107948a();
        Duration duration = f354728a;
        C69664n.m101060f(duration, "PREFETCH_TIMEOUT");
        C127125e eVar = (C127125e) C127126f.f350033d.createBuilder();
        C69664n.m101060f(eVar, "newBuilder()");
        C127128h a3 = C69664n.m101061g(eVar, "builder");
        C52070ec ecVar = C36180b.f94545b;
        C69664n.m101060f(ecVar, "ignore()");
        a3.mo107954b(ecVar);
        aVar.mo108509a(a2, duration, a3.mo107953a());
        return new C129112b(this, dyVar, iVar, aoVar);
    }
}
