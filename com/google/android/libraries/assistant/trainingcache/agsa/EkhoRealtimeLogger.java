package com.google.android.libraries.assistant.trainingcache.agsa;

import com.google.android.libraries.assistant.trainingcache.bindings.IRealtimeLogger;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19437i;
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
public final class EkhoRealtimeLogger implements IRealtimeLogger {

    /* renamed from: a */
    private static final C59071e f54322a = C59071e.m91332i("com.google.android.libraries.assistant.trainingcache.agsa.EkhoRealtimeLogger");

    /* renamed from: b */
    private final C19435g f54323b;

    /* renamed from: c */
    private final C19437i f54324c;

    public EkhoRealtimeLogger(C19435g gVar, C19437i iVar) {
        this.f54323b = gVar;
        this.f54324c = iVar;
    }

    public void logBatched(byte[] bArr) {
        C67289at atVar;
        try {
            atVar = (C67289at) ((C67288as) ((C67288as) C67289at.f182906d.createBuilder()).mergeFrom(bArr, C62921ba.m95368a())).build();
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) f54322a.mo56225c()).mo56382g(e)).mo56372aa(47833)).mo56386p("Failed to parse");
            atVar = null;
        }
        if (atVar != null) {
            for (C67298bb bbVar : atVar.f182908a) {
                C19437i iVar = this.f54324c;
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
                        ((C19569f) iVar.mo24626a().f54343e.mo6453a()).mo24824b((double) bbVar.f182930e, a, name);
                        ((C19567d) iVar.mo24626a().f54341c.mo6453a()).mo24822a(1, a, name);
                    } else {
                        ((C19569f) iVar.mo24626a().f54342d.mo6453a()).mo24824b((double) bbVar.f182930e, a);
                        ((C19567d) iVar.mo24626a().f54340b.mo6453a()).mo24822a(1, a);
                    }
                } else {
                    ((C59052c) ((C59052c) C19437i.f54349a.mo56226d()).mo56372aa(47848)).mo56386p("OperationLog has no cache operation. Ignoring.");
                }
            }
            for (C67353q qVar : atVar.f182910c) {
                if ((qVar.f183077a & 2) != 0) {
                    this.f54323b.mo24623e(qVar.f183078b, qVar.f183079c, qVar.f183080d);
                } else {
                    this.f54323b.mo24620b(qVar.f183078b, qVar.f183080d);
                }
            }
            for (C67282am amVar : atVar.f182909b) {
                C19435g gVar = this.f54323b;
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
                gVar.mo24624f((C66461f) eVar.build());
            }
        }
    }
}
