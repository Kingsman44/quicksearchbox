package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p674a;

import android.content.Intent;
import com.google.android.apps.auto.p450a.p451a.C8883ba;
import com.google.android.apps.auto.p450a.p451a.C8884bb;
import com.google.android.apps.auto.p450a.p451a.C8886bd;
import com.google.android.apps.auto.p450a.p451a.C8888bf;
import com.google.android.apps.auto.p450a.p451a.C8889bg;
import com.google.android.apps.auto.p450a.p451a.C8928u;
import com.google.android.apps.auto.p450a.p451a.C8929v;
import com.google.android.apps.auto.p450a.p451a.C8931x;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.C11528g;
import com.google.android.libraries.assistant.auto.p647a.p648a.C11420a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61538b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.h */
/* compiled from: PG */
final class C11501h implements C60930r {

    /* renamed from: a */
    final /* synthetic */ C11507n f37373a;

    /* renamed from: b */
    final /* synthetic */ Intent f37374b;

    public C11501h(C11507n nVar, Intent intent) {
        this.f37373a = nVar;
        this.f37374b = intent;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        Integer num = this.f37373a.f37385c;
        if (num != null) {
            int intValue = num.intValue();
            C70334de deVar = new C70334de();
            C61538b.m94270a(C11420a.f37179a, this.f37374b, deVar);
            C8888bf bfVar = (C8888bf) ((C8888bf) this.f37373a.f37384b.mo27525b()).mo62576o(new C70879r(deVar));
            C8883ba baVar = (C8883ba) C8884bb.f30842c.createBuilder();
            C69664n.m101060f(baVar, "newBuilder()");
            C8886bd a = C69664n.m101061g(baVar, "builder");
            C8883ba baVar2 = a.f30847a;
            baVar2.copyOnWrite();
            C8884bb bbVar = (C8884bb) baVar2.instance;
            bbVar.f30844a |= 1;
            bbVar.f30845b = intValue;
            C62940bt btVar = C8929v.f30963d;
            C69664n.m101060f(btVar, "assistantSessionResultRequestExtension");
            C8928u uVar = (C8928u) C8929v.f30962c.createBuilder();
            C69664n.m101060f(uVar, "newBuilder()");
            C69664n.m101061g(uVar, "builder");
            uVar.copyOnWrite();
            C8929v vVar = (C8929v) uVar.instance;
            vVar.f30965a |= 1;
            vVar.f30966b = true;
            C62942bv build = uVar.build();
            C69664n.m101060f(build, "_builder.build()");
            a.mo17272b(btVar, (C8929v) build);
            C8884bb a2 = a.mo17271a();
            C70888j jVar = bfVar.f189039a;
            C70338di diVar = C8889bg.f30851d;
            if (diVar == null) {
                synchronized (C8889bg.class) {
                    diVar = C8889bg.f30851d;
                    if (diVar == null) {
                        C70335df d = C70338di.m102603d();
                        d.f187487c = C70337dh.UNARY;
                        d.f187488d = C70338di.m102602c("wireless.android.auto.proto.assistant.CarAssistantCallbacksService", "AssistantSessionResult");
                        d.f187489e = true;
                        d.f187485a = C70850d.m103697c(C8884bb.f30842c);
                        d.f187486b = C70850d.m103697c(C8931x.f30967b);
                        C70338di a3 = d.mo62040a();
                        C8889bg.f30851d = a3;
                        diVar = a3;
                    }
                }
            }
            return C60922j.m93044g(C70876o.m103760a(jVar.mo39510a(diVar, bfVar.f189040b), a2), C47810es.m84963c(C11500g.f37372a), this.f37373a.f37383a);
        }
        throw new C11528g("Error sending assistant session result");
    }
}
