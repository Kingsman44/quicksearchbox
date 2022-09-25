package com.google.android.apps.search.assistant.surfaces.voice.p9511c.p9515d;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119908e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9518a.C126928f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127163w;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.assistant.p3897e.p3921j.C51809dy;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.c.d.c */
/* compiled from: PG */
public final class C126921c implements C126928f {

    /* renamed from: a */
    public final C127163w f349447a;

    /* renamed from: b */
    public final C71422aw f349448b;

    /* renamed from: c */
    public final C37215b f349449c;

    /* renamed from: d */
    public final Duration f349450d;

    /* renamed from: e */
    public final C129676j f349451e;

    public C126921c(C127163w wVar, C71422aw awVar, C37215b bVar, Duration duration, C129676j jVar) {
        C69664n.m101061g(wVar, "conversationDataStore");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(bVar, "appFlowLogger");
        C69664n.m101061g(duration, "timeout");
        C69664n.m101061g(jVar, "navigationHint");
        this.f349447a = wVar;
        this.f349448b = awVar;
        this.f349449c = bVar;
        this.f349450d = duration;
        this.f349451e = jVar;
    }

    /* renamed from: a */
    public final C119908e mo107854a(C51809dy dyVar, C119793ao aoVar, C127289i iVar) {
        C69664n.m101061g(dyVar, "clientOp");
        C69664n.m101061g(aoVar, "context");
        C69664n.m101061g(iVar, "queryContext");
        return new C126920b(this, dyVar, iVar, aoVar);
    }
}
