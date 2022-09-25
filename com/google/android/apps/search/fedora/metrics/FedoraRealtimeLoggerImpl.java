package com.google.android.apps.search.fedora.metrics;

import com.google.android.libraries.assistant.trainingcache.bindings.IRealtimeLogger;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1635au.C19569f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62921ba;
import com.google.protos.p4934ay.p4945e.C64352b;
import com.google.speech.p5199c.p5200a.C66458c;
import com.google.speech.p5199c.p5200a.C66459d;
import com.google.speech.p5199c.p5200a.C66460e;
import com.google.speech.p5199c.p5200a.C66461f;
import com.google.speech.p5228m.C67278ai;
import com.google.speech.p5228m.C67282am;
import com.google.speech.p5228m.C67288as;
import com.google.speech.p5228m.C67289at;
import com.google.speech.p5228m.C67298bb;
import com.google.speech.p5228m.C67353q;
import java.io.IOException;

/* compiled from: PG */
final class FedoraRealtimeLoggerImpl implements IRealtimeLogger {

    /* renamed from: a */
    private static final C59071e f362812a = C59071e.m91332i("com.google.android.apps.search.fedora.metrics.FedoraRealtimeLoggerImpl");

    /* renamed from: b */
    private final C133072j f362813b;

    /* renamed from: c */
    private final C133070h f362814c;

    public FedoraRealtimeLoggerImpl(C133072j jVar, C133070h hVar) {
        this.f362813b = jVar;
        this.f362814c = hVar;
    }

    public void logBatched(byte[] bArr) {
        C67289at atVar;
        try {
            atVar = (C67289at) ((C67288as) ((C67288as) C67289at.f182906d.createBuilder()).mergeFrom(bArr, C62921ba.m95368a())).build();
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) f362812a.mo56225c()).mo56382g(e)).mo56372aa(39854)).mo56386p("Failed to parse");
            atVar = null;
        }
        if (atVar != null) {
            for (C67298bb bbVar : atVar.f182908a) {
                C133070h hVar = this.f362814c;
                if ((bbVar.f182926a & 1) != 0) {
                    int b = C64352b.m96386b(bbVar.f182927b);
                    if (b == 0) {
                        b = 1;
                    }
                    String a = C64352b.m96385a(b);
                    if (bbVar.f182929d) {
                        C62722b a2 = C62722b.m94931a(bbVar.f182928c);
                        if (a2 == null) {
                            a2 = C62722b.OK;
                        }
                        String name = a2.name();
                        ((C19569f) hVar.mo110962a().f362824e.mo6453a()).mo24824b((double) bbVar.f182930e, a, name);
                        ((C19567d) hVar.mo110962a().f362822c.mo6453a()).mo24822a(1, a, name);
                    } else {
                        ((C19569f) hVar.mo110962a().f362823d.mo6453a()).mo24824b((double) bbVar.f182930e, a);
                        ((C19567d) hVar.mo110962a().f362821b.mo6453a()).mo24822a(1, a);
                    }
                } else {
                    ((C59052c) ((C59052c) C133070h.f362826a.mo56226d()).mo56372aa(39855)).mo56386p("OperationLog has no cache operation. Ignoring.");
                }
            }
            for (C67353q qVar : atVar.f182910c) {
                if ((qVar.f183077a & 2) != 0) {
                    this.f362813b.mo110967e(qVar.f183078b, qVar.f183079c, qVar.f183080d);
                } else {
                    this.f362813b.mo110964b(qVar.f183078b, qVar.f183080d);
                }
            }
            for (C67282am amVar : atVar.f182909b) {
                C133072j jVar = this.f362813b;
                C66460e eVar = (C66460e) C66461f.f180719g.createBuilder();
                C66458c cVar = (C66458c) C66459d.f180710h.createBuilder();
                int b2 = C67278ai.m97449b(amVar.f182889a);
                if (b2 == 0) {
                    b2 = 1;
                }
                cVar.copyOnWrite();
                C66459d dVar = (C66459d) cVar.instance;
                dVar.f180713b = b2 - 1;
                dVar.f180712a |= 1;
                int i = amVar.f182890b;
                cVar.copyOnWrite();
                C66459d dVar2 = (C66459d) cVar.instance;
                dVar2.f180712a |= 2;
                dVar2.f180714c = i;
                int i2 = amVar.f182891c;
                cVar.copyOnWrite();
                C66459d dVar3 = (C66459d) cVar.instance;
                dVar3.f180712a |= 4;
                dVar3.f180715d = i2;
                long j = amVar.f182892d;
                cVar.copyOnWrite();
                C66459d dVar4 = (C66459d) cVar.instance;
                dVar4.f180712a |= 8;
                dVar4.f180716e = j;
                long j2 = amVar.f182893e;
                cVar.copyOnWrite();
                C66459d dVar5 = (C66459d) cVar.instance;
                dVar5.f180712a |= 16;
                dVar5.f180717f = j2;
                boolean z = amVar.f182894f;
                cVar.copyOnWrite();
                C66459d dVar6 = (C66459d) cVar.instance;
                dVar6.f180712a |= 32;
                dVar6.f180718g = z;
                eVar.copyOnWrite();
                C66461f fVar = (C66461f) eVar.instance;
                C66459d dVar7 = (C66459d) cVar.build();
                dVar7.getClass();
                fVar.f180723c = dVar7;
                fVar.f180721a |= 2;
                jVar.mo110968f((C66461f) eVar.build());
            }
        }
    }
}
