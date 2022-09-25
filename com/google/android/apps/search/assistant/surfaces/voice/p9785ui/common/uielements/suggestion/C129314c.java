package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion;

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
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.p3926e.C51986gl;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.suggestion.c */
/* compiled from: PG */
public final class C129314c implements C126928f {

    /* renamed from: a */
    public static final C59071e f355172a = C59071e.m91331h();

    /* renamed from: b */
    public static final C33480d f355173b = C33480d.m62053a("show_suggestions_args", "assistant.api.client_op.ShowSuggestionsArgs", C51986gl.f136421f);

    /* renamed from: c */
    public static final C129676j f355174c;

    /* renamed from: d */
    public final C127163w f355175d;

    /* renamed from: e */
    public final C71422aw f355176e;

    static {
        C129660g gVar = (C129660g) C129676j.f355890c.createBuilder();
        C69664n.m101060f(gVar, "newBuilder()");
        C129678l a = C69664n.m101061g(gVar, "builder");
        a.mo109191c(C129662i.ESCAPE_HATCH);
        f355174c = a.mo109189a();
    }

    public C129314c(C127163w wVar, C71422aw awVar) {
        C69664n.m101061g(wVar, "conversationDataStore");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f355175d = wVar;
        this.f355176e = awVar;
    }

    /* renamed from: a */
    public final C119908e mo107854a(C51809dy dyVar, C119793ao aoVar, C127289i iVar) {
        C69664n.m101061g(dyVar, "clientOp");
        C69664n.m101061g(aoVar, "clientOpContext");
        C69664n.m101061g(iVar, "queryContext");
        return new C129313b(this, dyVar, iVar, aoVar);
    }
}
