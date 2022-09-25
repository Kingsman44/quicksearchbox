package com.google.android.apps.gsa.staticplugins.fedass.p7940b;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100741g;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.apps.search.fedora.p10099e.C132817y;
import com.google.android.apps.search.fedora.p10099e.C132818z;
import com.google.android.libraries.assistant.trainingcache.agsa.C19427e;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoRealtimeLogging;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoWriter;
import com.google.android.libraries.assistant.trainingcache.bindings.IRealtimeLogger;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5228m.C67270aa;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.b.x */
/* compiled from: PG */
public final /* synthetic */ class C100793x implements C100741g {

    /* renamed from: a */
    public final /* synthetic */ C100768ag f281710a;

    public /* synthetic */ C100793x(C100768ag agVar) {
        this.f281710a = agVar;
    }

    /* renamed from: a */
    public final void mo92032a(Object obj) {
        C100768ag agVar = this.f281710a;
        C132800h hVar = (C132800h) obj;
        ((C59052c) ((C59052c) C100768ag.f281663a.mo56224b()).mo56372aa(19547)).mo56386p("initializing EkhoWriter.");
        C132818z zVar = hVar.f362336d;
        if (zVar == null) {
            zVar = C132818z.f362393h;
        }
        C132817y yVar = zVar.f362396b;
        if (yVar == null) {
            yVar = C132817y.f362388d;
        }
        if (yVar.f362391b && !hVar.f362334b.isEmpty()) {
            C132798f fVar = hVar.f362335c;
            if (fVar == null) {
                fVar = C132798f.f362315o;
            }
            if (fVar.f362320d) {
                try {
                    C132818z zVar2 = hVar.f362336d;
                    if (zVar2 == null) {
                        zVar2 = C132818z.f362393h;
                    }
                    C132817y yVar2 = zVar2.f362396b;
                    if (yVar2 == null) {
                        yVar2 = C132817y.f362388d;
                    }
                    agVar.f281670h.set(yVar2);
                    C67270aa d = ((C100784o) agVar.f281665c.mo27525b()).mo92050d(hVar, true);
                    agVar.f281669g.set(d);
                    C100761a.m166954a(agVar.f281664b);
                    C19427e eVar = (C19427e) agVar.f281666d.mo27525b();
                    C59104x b = C19427e.f54328a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "EkhoWriterWrap");
                    ((C59052c) ((C59052c) b).mo56372aa(47835)).mo56386p("initializing EkhoWriter.");
                    EkhoRealtimeLogging.nativeSetRealtimeLogger((IRealtimeLogger) eVar.f54332e.mo27525b());
                    EkhoWriter ekhoWriter = new EkhoWriter();
                    ekhoWriter.mo24644b(d);
                    EkhoWriter.nativeEnableWriting(ekhoWriter.f54364a.get());
                    eVar.f54333f.set(ekhoWriter);
                    eVar.f54330c.set(d);
                    eVar.f54329b.set(true);
                    return;
                } catch (RuntimeException e) {
                    ((C59052c) ((C59052c) ((C59052c) C100768ag.f281663a.mo56225c()).mo56382g(e)).mo56372aa(19548)).mo56386p("Failed to init ekho writer facilitator.");
                    return;
                }
            }
        }
        agVar.f281669g.set((Object) null);
        agVar.f281670h.set((Object) null);
    }
}
