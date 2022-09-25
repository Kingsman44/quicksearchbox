package com.google.android.apps.search.transcription.p10670f;

import com.google.android.apps.search.transcription.p10666b.C141751j;
import com.google.android.apps.search.transcription.p10666b.C141757p;
import com.google.android.apps.search.transcription.p10666b.C141758q;
import com.google.android.libraries.assistant.soda.C19389y;
import com.google.android.libraries.assistant.soda.p1603b.C19249b;
import com.google.android.libraries.assistant.soda.p1603b.C19256i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C63088z;
import com.google.speech.context.p5201a.C66483f;
import com.google.speech.context.p5201a.C66487j;
import com.google.speech.p5218j.C67152mz;
import com.google.speech.p5218j.p5219a.C66698ab;
import com.google.speech.p5218j.p5219a.C66703ag;
import com.google.speech.p5218j.p5219a.C66704ah;
import com.google.speech.p5218j.p5219a.C66705ai;
import com.google.speech.p5218j.p5219a.C66706aj;
import com.google.speech.p5218j.p5219a.C66707ak;
import com.google.speech.p5218j.p5219a.C66712ap;
import com.google.speech.p5218j.p5219a.C66713aq;
import com.google.speech.p5218j.p5219a.C66714ar;
import com.google.speech.p5218j.p5219a.C66716at;
import com.google.speech.p5218j.p5219a.C66721ay;
import com.google.speech.p5218j.p5219a.C66722az;
import com.google.speech.p5218j.p5219a.C66753t;
import com.google.speech.p5218j.p5219a.C66754u;
import java.io.InputStream;
import p3186j$.util.Collection;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.search.transcription.f.bg */
/* compiled from: PG */
final class C141839bg implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ int f384909a;

    /* renamed from: b */
    final /* synthetic */ int f384910b;

    /* renamed from: c */
    final /* synthetic */ Supplier f384911c;

    /* renamed from: d */
    final /* synthetic */ C141845bm f384912d;

    public C141839bg(C141845bm bmVar, int i, int i2, Supplier supplier) {
        this.f384912d = bmVar;
        this.f384909a = i;
        this.f384910b = i2;
        this.f384911c = supplier;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (th instanceof C141751j) {
            C141751j jVar = (C141751j) th;
            ((C59052c) ((C59052c) C141845bm.f384915a.mo56225c()).mo56372aa(41900)).mo56387q("Failed to get language pack of required locale: error %d", jVar.f384731a.mo116703a());
            this.f384912d.f384924j.mo116728b(jVar);
        } else if (th instanceof C141757p) {
            C141757p pVar = (C141757p) th;
            ((C59052c) ((C59052c) C141845bm.f384915a.mo56225c()).mo56372aa(41899)).mo56387q("Soda recognizer failed to initialize: ConfigStatus %d!", pVar.f384731a.mo116703a());
            this.f384912d.f384924j.mo116728b(pVar);
        } else {
            ((C59052c) ((C59052c) ((C59052c) C141845bm.f384915a.mo56225c()).mo56382g(th)).mo56372aa(41898)).mo56386p("Soda recognizer failed to initialize: ConfigStatus UNKNOWN_FAILURE!");
            this.f384912d.f384924j.mo116728b(new C141757p(C67152mz.UNKNOWN_FAILURE));
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58833ax axVar;
        C19389y yVar = (C19389y) obj;
        if (this.f384912d.f384931q.get()) {
            ((C59052c) ((C59052c) C141845bm.f384915a.mo56224b()).mo56372aa(41903)).mo56386p("Transcription already cancelled - not start detection");
        } else if (!yVar.mo24537j()) {
            ((C59052c) ((C59052c) C141845bm.f384915a.mo56224b()).mo56372aa(41901)).mo56386p("Offline recognizer - start detection");
            int i = this.f384909a;
            int i2 = this.f384910b;
            InputStream inputStream = (InputStream) this.f384911c.get();
            C58836b bVar = C58836b.f156633a;
            C141845bm bmVar = this.f384912d;
            C66721ay ayVar = (C66721ay) C66722az.f181493f.createBuilder();
            if (bmVar.f384926l.mo56113h()) {
                C19256i iVar = (C19256i) bmVar.f384926l.mo56107c();
                ((C59052c) ((C59052c) C141845bm.f384915a.mo56224b()).mo56372aa(41909)).mo56389s("Adding device context biasing for %s", iVar.mo24430b());
                C66714ar arVar = (C66714ar) C66716at.f181484b.createBuilder();
                C66712ap apVar = (C66712ap) C66713aq.f181479c.createBuilder();
                C66753t tVar = (C66753t) C66754u.f181563b.createBuilder();
                tVar.mo59735b(C63088z.m96143E(iVar.mo24430b()));
                apVar.copyOnWrite();
                C66713aq aqVar = (C66713aq) apVar.instance;
                C66754u uVar = (C66754u) tVar.build();
                uVar.getClass();
                aqVar.f181482b = uVar;
                aqVar.f181481a = 1;
                arVar.mo59713b("client-id", (C66713aq) apVar.build());
                C66483f fVar = bmVar.f384922h.f180786c;
                if (fVar == null) {
                    fVar = C66483f.f180776e;
                }
                if (!fVar.f180779b.isEmpty()) {
                    C66712ap apVar2 = (C66712ap) C66713aq.f181479c.createBuilder();
                    C66753t tVar2 = (C66753t) C66754u.f181563b.createBuilder();
                    C66483f fVar2 = bmVar.f384922h.f180786c;
                    if (fVar2 == null) {
                        fVar2 = C66483f.f180776e;
                    }
                    tVar2.mo59734a((Iterable) Collection.EL.stream(fVar2.f180779b).map(C141835bc.f384905a).collect(C58370cn.f155946a));
                    apVar2.copyOnWrite();
                    C66713aq aqVar2 = (C66713aq) apVar2.instance;
                    C66754u uVar2 = (C66754u) tVar2.build();
                    uVar2.getClass();
                    aqVar2.f181482b = uVar2;
                    aqVar2.f181481a = 1;
                    arVar.mo59713b("experiment-labels", (C66713aq) apVar2.build());
                }
                for (C19249b bVar2 : bmVar.f384925k) {
                    ayVar.mo59718c(bVar2.mo24427b());
                    arVar.mo59712a(bVar2.mo24426a());
                }
                ayVar.copyOnWrite();
                C66722az azVar = (C66722az) ayVar.instance;
                C66716at atVar = (C66716at) arVar.build();
                atVar.getClass();
                azVar.f181497c = atVar;
                azVar.f181495a |= 1;
                C66483f fVar3 = bmVar.f384922h.f180786c;
                if (fVar3 == null) {
                    fVar3 = C66483f.f180776e;
                }
                C66487j jVar = fVar3.f180781d;
                if (jVar == null) {
                    jVar = C66487j.f180787a;
                }
                ayVar.copyOnWrite();
                C66722az azVar2 = (C66722az) ayVar.instance;
                jVar.getClass();
                azVar2.f181499e = jVar;
                azVar2.f181495a |= 4;
                ayVar.mo59716a(iVar.mo24429a());
            }
            if (!bmVar.f384923i.mo116823e().isEmpty()) {
                ((C59052c) ((C59052c) C141845bm.f384915a.mo56224b()).mo56372aa(41908)).mo56386p("Adding phrases biasing...");
                C66705ai aiVar = (C66705ai) C66706aj.f181455b.createBuilder();
                C58485gu e = bmVar.f384923i.mo116823e();
                int size = e.size();
                for (int i3 = 0; i3 < size; i3++) {
                    String str = (String) e.get(i3);
                    C66703ag agVar = (C66703ag) C66704ah.f181450d.createBuilder();
                    agVar.copyOnWrite();
                    C66704ah ahVar = (C66704ah) agVar.instance;
                    str.getClass();
                    ahVar.f181452a |= 1;
                    ahVar.f181453b = str;
                    aiVar.copyOnWrite();
                    C66706aj ajVar = (C66706aj) aiVar.instance;
                    C66704ah ahVar2 = (C66704ah) agVar.build();
                    ahVar2.getClass();
                    ajVar.mo59711a();
                    ajVar.f181457a.add(ahVar2);
                }
                C66698ab abVar = (C66698ab) C66707ak.f181458e.createBuilder();
                abVar.copyOnWrite();
                C66707ak akVar = (C66707ak) abVar.instance;
                akVar.f181460a = 1 | akVar.f181460a;
                akVar.f181463d = "android-speech-api-generic-phrases";
                abVar.copyOnWrite();
                C66707ak akVar2 = (C66707ak) abVar.instance;
                C66706aj ajVar2 = (C66706aj) aiVar.build();
                ajVar2.getClass();
                akVar2.f181462c = ajVar2;
                akVar2.f181461b = 2;
                ayVar.mo59717b(abVar);
            }
            if (((C66722az) ayVar.instance).f181496b.size() > 0) {
                axVar = C58833ax.m90834k((C66722az) ayVar.build());
            } else {
                axVar = C58836b.f156633a;
            }
            C60856cj.m92911t(yVar.mo24528a(i, i2, inputStream, bVar, axVar, C58836b.f156633a), C47810es.m84974n(new C141838bf(this)), this.f384912d.f384916b);
        } else {
            ((C59052c) ((C59052c) C141845bm.f384915a.mo56224b()).mo56372aa(41902)).mo56386p("Soda already running!");
            this.f384912d.f384924j.mo116728b(new C141758q(2));
        }
    }
}
