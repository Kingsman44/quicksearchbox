package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p674a;

import com.google.android.apps.auto.p450a.p451a.C8883ba;
import com.google.android.apps.auto.p450a.p451a.C8884bb;
import com.google.android.apps.auto.p450a.p451a.C8886bd;
import com.google.android.apps.auto.p450a.p451a.C8888bf;
import com.google.android.apps.auto.p450a.p451a.C8889bg;
import com.google.android.apps.auto.p450a.p451a.C8895bm;
import com.google.android.apps.auto.p450a.p451a.C8910ca;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.C11528g;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62940bt;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.l */
/* compiled from: PG */
final class C11505l implements C60930r {

    /* renamed from: a */
    final /* synthetic */ C11507n f37380a;

    /* renamed from: b */
    final /* synthetic */ C8910ca f37381b;

    public C11505l(C11507n nVar, C8910ca caVar) {
        this.f37380a = nVar;
        this.f37381b = caVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        Integer num = this.f37380a.f37385c;
        if (num != null) {
            int intValue = num.intValue();
            C8888bf bfVar = (C8888bf) this.f37380a.f37384b.mo27525b();
            C8910ca caVar = this.f37381b;
            C8883ba baVar = (C8883ba) C8884bb.f30842c.createBuilder();
            C69664n.m101060f(baVar, "newBuilder()");
            C8886bd a = C69664n.m101061g(baVar, "builder");
            C8883ba baVar2 = a.f30847a;
            baVar2.copyOnWrite();
            C8884bb bbVar = (C8884bb) baVar2.instance;
            bbVar.f30844a |= 1;
            bbVar.f30845b = intValue;
            C62940bt btVar = C8910ca.f30918d;
            C69664n.m101060f(btVar, "transcriptionSessionEventRequestExtension");
            a.mo17272b(btVar, caVar);
            C8884bb a2 = a.mo17271a();
            C70888j jVar = bfVar.f189039a;
            C70338di diVar = C8889bg.f30852e;
            if (diVar == null) {
                synchronized (C8889bg.class) {
                    diVar = C8889bg.f30852e;
                    if (diVar == null) {
                        C70335df d = C70338di.m102603d();
                        d.f187487c = C70337dh.UNARY;
                        d.f187488d = C70338di.m102602c("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "SendTranscriptionSessionEvent");
                        d.f187489e = true;
                        d.f187485a = C70850d.m103697c(C8884bb.f30842c);
                        d.f187486b = C70850d.m103697c(C8895bm.f30872a);
                        diVar = d.mo62040a();
                        C8889bg.f30852e = diVar;
                    }
                }
            }
            return C70876o.m103760a(jVar.mo39510a(diVar, bfVar.f189040b), a2);
        }
        throw new C11528g("Error sending transcription event");
    }
}
