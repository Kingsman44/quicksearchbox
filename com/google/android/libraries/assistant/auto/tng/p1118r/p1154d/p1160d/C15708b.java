package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1160d;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a.C12115d;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p797c.p798a.p799a.C12395b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4449cd.p4456g.p4457a.C57975a;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63088z;
import com.google.speech.p5218j.C66936ez;
import com.google.speech.p5218j.C66938fa;
import com.google.speech.p5218j.C67104le;
import com.google.speech.p5218j.C67105lf;
import com.google.speech.p5218j.C67170o;
import com.google.speech.p5218j.C67171p;
import com.google.speech.p5218j.C67172q;
import com.google.speech.p5218j.C67175t;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.d.b */
/* compiled from: PG */
public final class C15708b extends C57975a {

    /* renamed from: b */
    private static final C59071e f46868b = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.r.d.d.b");

    /* renamed from: a */
    public final C70862aj f46869a;

    /* renamed from: c */
    private final C12395b f46870c;

    /* renamed from: d */
    private final Executor f46871d;

    /* renamed from: e */
    private final AtomicBoolean f46872e = new AtomicBoolean(false);

    public C15708b(C12395b bVar, C70862aj ajVar, Executor executor) {
        this.f46870c = bVar;
        this.f46871d = executor;
        this.f46869a = ajVar;
    }

    /* renamed from: f */
    private final void m32498f(C67105lf lfVar) {
        if (!this.f46872e.get()) {
            this.f46871d.execute(C47810es.m84977q(new C15692a(this, lfVar)));
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        C67104le leVar = (C67104le) C67105lf.f182433a.createBuilder();
        C62940bt btVar = C66938fa.f181944f;
        C66936ez ezVar = (C66936ez) C66938fa.f181943e.createBuilder();
        ezVar.copyOnWrite();
        C66938fa faVar = (C66938fa) ezVar.instance;
        faVar.f181949d = 1;
        faVar.f181946a |= 1;
        C67170o oVar = (C67170o) C67171p.f182575e.createBuilder();
        C63088z zVar = ((C12115d) obj).f38736b;
        oVar.copyOnWrite();
        C67171p pVar = (C67171p) oVar.instance;
        zVar.getClass();
        pVar.f182577a = 1 | pVar.f182577a;
        pVar.f182578b = zVar;
        C67172q qVar = (C67172q) C67175t.f182588e.createBuilder();
        int i = this.f46870c.f39246c;
        qVar.copyOnWrite();
        C67175t tVar = (C67175t) qVar.instance;
        tVar.f182590a |= 2;
        tVar.f182592c = i;
        int i2 = this.f46870c.f39247d;
        qVar.copyOnWrite();
        C67175t tVar2 = (C67175t) qVar.instance;
        tVar2.f182590a |= 4;
        tVar2.f182593d = i2;
        oVar.copyOnWrite();
        C67171p pVar2 = (C67171p) oVar.instance;
        C67175t tVar3 = (C67175t) qVar.build();
        tVar3.getClass();
        pVar2.f182579c = tVar3;
        pVar2.f182577a |= 2;
        ezVar.copyOnWrite();
        C66938fa faVar2 = (C66938fa) ezVar.instance;
        C67171p pVar3 = (C67171p) oVar.build();
        pVar3.getClass();
        faVar2.f181948c = pVar3;
        faVar2.f181947b = 2;
        leVar.mo58885m(btVar, (C66938fa) ezVar.build());
        m32498f((C67105lf) leVar.build());
    }

    /* renamed from: e */
    public final void mo22521e() {
        if (!this.f46872e.get()) {
            C67104le leVar = (C67104le) C67105lf.f182433a.createBuilder();
            C62940bt btVar = C66938fa.f181944f;
            C66936ez ezVar = (C66936ez) C66938fa.f181943e.createBuilder();
            ezVar.copyOnWrite();
            C66938fa faVar = (C66938fa) ezVar.instance;
            faVar.f181948c = 3;
            faVar.f181947b = 3;
            leVar.mo58885m(btVar, (C66938fa) ezVar.build());
            m32498f((C67105lf) leVar.build());
            this.f46872e.set(true);
        }
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        mo22521e();
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        ((C59052c) ((C59052c) f46868b.mo56225c()).mo56372aa(46271)).mo56386p("failure with audio stream chunk");
        mo22521e();
    }
}
