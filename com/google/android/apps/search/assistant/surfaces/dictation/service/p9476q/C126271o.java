package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a.C125234by;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.o */
/* compiled from: PG */
public final /* synthetic */ class C126271o implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C126276t f347926a;

    public /* synthetic */ C126271o(C126276t tVar) {
        this.f347926a = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C126276t tVar = this.f347926a;
        if (tVar.f347936h.get()) {
            return C60856cj.m92899h(new IllegalStateException(String.format("Cannot start %s, because it's already stopped", new Object[]{tVar})));
        }
        C60870cx a = C2169h.m6027a(new C126270n(tVar));
        C61301b bVar = tVar.f347939k;
        String valueOf = String.valueOf(((C126264h) tVar.f347934f).f347920i);
        ((C59052c) ((C59052c) C126276t.f347929a.mo56224b()).mo56372aa(36897)).mo56354G("%s starting %s [SD]", bVar, C126290c.m206496a("AiAiAsrClient{session=" + valueOf + "}"));
        C126264h hVar = (C126264h) tVar.f347934f;
        C47632e eVar = hVar.f347917f;
        C125234by byVar = hVar.f347920i;
        Objects.requireNonNull(byVar);
        hVar.mo107493a(eVar.mo51512b(new C126261e(byVar), hVar.f347914c), C89885b.ASSISTANT_DICTATION_ASR_AIAI_OTHER_ERROR, "Error when starting %s [SD]", C126290c.m206496a(hVar.f347920i.toString()));
        tVar.f347930b.mo106964c(tVar);
        return a;
    }
}
