package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119908e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9518a.C126928f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127163w;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129660g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129662i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129678l;
import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.f.c */
/* compiled from: PG */
public final class C129240c implements C126928f {

    /* renamed from: a */
    public static final C33480d f355000a = C33480d.m62053a("show_text_args", "assistant.api.client_op.ShowTextArgs", C52003hb.f136476i);

    /* renamed from: b */
    public static final C129676j f355001b;

    /* renamed from: c */
    public final C127163w f355002c;

    /* renamed from: d */
    public final C37215b f355003d;

    /* renamed from: e */
    public final C71422aw f355004e;

    static {
        C129660g gVar = (C129660g) C129676j.f355890c.createBuilder();
        C69664n.m101060f(gVar, "newBuilder()");
        C129678l a = C69664n.m101061g(gVar, "builder");
        a.mo109191c(C129662i.OVER_APP);
        f355001b = a.mo109189a();
    }

    public C129240c(C127163w wVar, C37215b bVar, C71422aw awVar) {
        C69664n.m101061g(wVar, "conversationDataStore");
        C69664n.m101061g(bVar, "appFlowLogger");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f355002c = wVar;
        this.f355003d = bVar;
        this.f355004e = awVar;
    }

    /* renamed from: a */
    public final C119908e mo107854a(C51809dy dyVar, C119793ao aoVar, C127289i iVar) {
        C69664n.m101061g(dyVar, "clientOp");
        C69664n.m101061g(aoVar, "clientOpContext");
        C69664n.m101061g(iVar, "queryContext");
        return new C129239b(this, dyVar, iVar, aoVar);
    }
}
