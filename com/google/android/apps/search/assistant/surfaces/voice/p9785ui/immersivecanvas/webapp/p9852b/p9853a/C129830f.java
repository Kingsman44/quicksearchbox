package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9852b.p9853a;

import com.google.android.libraries.assistant.p1363c.p1398g.C17360b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17471ag;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17473ai;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.b.a.f */
/* compiled from: PG */
public final class C129830f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C129834j f356211a;

    /* renamed from: b */
    private final C17360b f356212b;

    public C129830f(C129834j jVar, C17360b bVar) {
        this.f356211a = jVar;
        this.f356212b = bVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) C129834j.f356218a.mo56226d()).mo56372aa(38504)).mo56354G("%s Callback failure: %s", "[TtsPlaybackStartCallback]", this.f356211a.f356223d.f123099a.mo51243b(th).f123104a);
        this.f356211a.mo109287b("ERROR");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C17471ag agVar;
        C17473ai aiVar = (C17473ai) obj;
        if (aiVar.f50460b != 1) {
            C59052c cVar = (C59052c) ((C59052c) C129834j.f356218a.mo56226d()).mo56372aa(38505);
            if (aiVar.f50460b == 2) {
                agVar = C17471ag.m34782a(((Integer) aiVar.f50461c).intValue());
                if (agVar == null) {
                    agVar = C17471ag.UNSPECIFIED_PLAYBACK_START_FAILURE;
                }
            } else {
                agVar = C17471ag.UNSPECIFIED_PLAYBACK_START_FAILURE;
            }
            cVar.mo56352E("%s TTS playback failed with error code: %d", "[TtsPlaybackStartCallback]", agVar.f50456h);
            this.f356211a.mo109287b("ERROR");
            return;
        }
        this.f356211a.mo109287b("START");
        C129834j jVar = this.f356211a;
        Map.EL.forEach((C58495hd) jVar.f356221b.f356052a.get(), new C129827c(jVar));
        C129829e eVar = new C129829e(this.f356211a);
        C60856cj.m92911t(this.f356212b.mo23302a().mo23275a(), C47810es.m84974n(eVar), this.f356211a.f356222c);
    }
}
