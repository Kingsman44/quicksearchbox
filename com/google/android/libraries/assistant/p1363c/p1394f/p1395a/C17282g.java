package com.google.android.libraries.assistant.p1363c.p1394f.p1395a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9028d.p9031c.C119730d;
import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import com.google.protobuf.C63088z;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4775b.p4776a.p4777a.p4778a.p4779a.C63126b;
import com.google.speech.p5224k.p5225a.C67186ad;
import p5462h.C69788q;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.c.f.a.g */
/* compiled from: PG */
final class C17282g implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C17291p f50082a;

    public C17282g(C17291p pVar) {
        this.f50082a = pVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f50082a.f50104e.mo38137d(C17280e.f50080d);
        this.f50082a.f50108i.mo62909P(C69788q.f186170a);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C69664n.m101061g(th, "error");
        this.f50082a.f50108i.mo63050j(C17293r.m34513a(th, C63126b.TTS_STREAMING_FAILED));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C119730d dVar = (C119730d) obj;
        C69664n.m101061g(dVar, "value");
        C67186ad adVar = dVar.f333557a;
        if (adVar == null) {
            adVar = C67186ad.f182610e;
        }
        if ((adVar.f182613a & 1) != 0) {
            C32534ai aiVar = this.f50082a.f50104e;
            C67186ad adVar2 = dVar.f333557a;
            if (adVar2 == null) {
                adVar2 = C67186ad.f182610e;
            }
            C63088z zVar = adVar2.f182614b;
            C69664n.m101060f(zVar, "value.ttsServiceEvent.audio");
            aiVar.mo38137d(C17280e.m34478d(zVar));
        }
    }
}
