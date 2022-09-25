package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1160d;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p797c.p798a.C12393a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p797c.p798a.p799a.C12395b;
import com.google.android.libraries.assistant.auto.tng.p1035m.p1038b.C13901e;
import com.google.android.libraries.assistant.soda.C19245ah;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4449cd.p4456g.p4459c.C58000d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63088z;
import com.google.speech.context.p5201a.C66483f;
import com.google.speech.context.p5201a.C66485h;
import com.google.speech.context.p5201a.C66487j;
import com.google.speech.p5218j.C67049jd;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67071jz;
import com.google.speech.p5218j.C67073ka;
import com.google.speech.p5218j.C67104le;
import com.google.speech.p5218j.C67105lf;
import com.google.speech.p5218j.C67142mp;
import com.google.speech.p5218j.C67143mq;
import com.google.speech.p5218j.C67170o;
import com.google.speech.p5218j.C67171p;
import com.google.speech.p5218j.C67172q;
import com.google.speech.p5218j.C67175t;
import com.google.speech.p5218j.p5219a.C66712ap;
import com.google.speech.p5218j.p5219a.C66713aq;
import com.google.speech.p5218j.p5219a.C66714ar;
import com.google.speech.p5218j.p5219a.C66716at;
import com.google.speech.p5218j.p5219a.C66721ay;
import com.google.speech.p5218j.p5219a.C66722az;
import com.google.speech.p5218j.p5219a.C66751r;
import com.google.speech.p5218j.p5219a.C66752s;
import com.google.speech.p5218j.p5219a.C66753t;
import com.google.speech.p5218j.p5219a.C66754u;
import p3186j$.util.Collection;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.d.o */
/* compiled from: PG */
public final /* synthetic */ class C15721o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C15706an f46895a;

    /* renamed from: b */
    public final /* synthetic */ C12395b f46896b;

    public /* synthetic */ C15721o(C15706an anVar, C12395b bVar) {
        this.f46895a = anVar;
        this.f46896b = bVar;
    }

    public final C60870cx apply(Object obj) {
        int i;
        C15706an anVar = this.f46895a;
        C12395b bVar = this.f46896b;
        C12393a aVar = (C12393a) obj;
        C70862aj ajVar = anVar.f46865n;
        if (ajVar != null) {
            C67104le leVar = (C67104le) C67105lf.f182433a.createBuilder();
            C62940bt btVar = C67143mq.f182509d;
            C67142mp mpVar = (C67142mp) C67143mq.f182508c.createBuilder();
            C66751r rVar = (C66751r) C66752s.f181544q.createBuilder();
            C19245ah.m36702j(rVar, bVar.f39246c, bVar.f39247d);
            C58833ax a = aVar.mo20571a();
            C66714ar arVar = (C66714ar) C66716at.f181484b.createBuilder();
            C66712ap apVar = (C66712ap) C66713aq.f181479c.createBuilder();
            C66753t tVar = (C66753t) C66754u.f181563b.createBuilder();
            tVar.mo59735b(C63088z.m96143E("AUTO"));
            apVar.copyOnWrite();
            C66713aq aqVar = (C66713aq) apVar.instance;
            C66754u uVar = (C66754u) tVar.build();
            uVar.getClass();
            aqVar.f181482b = uVar;
            aqVar.f181481a = 1;
            arVar.mo59713b("client-id", (C66713aq) apVar.build());
            C66716at atVar = (C66716at) arVar.build();
            C66721ay ayVar = (C66721ay) C66722az.f181493f.createBuilder();
            ayVar.copyOnWrite();
            C66722az azVar = (C66722az) ayVar.instance;
            atVar.getClass();
            azVar.f181497c = atVar;
            azVar.f181495a |= 1;
            C66485h hVar = (C66485h) anVar.f46853b.mo17428b();
            if (!(hVar == null || (hVar.f180784a & 2) == 0)) {
                C66483f fVar = hVar.f180786c;
                if (fVar == null) {
                    fVar = C66483f.f180776e;
                }
                if (fVar.f180780c.size() > 0) {
                    C66483f fVar2 = hVar.f180786c;
                    if (fVar2 == null) {
                        fVar2 = C66483f.f180776e;
                    }
                    ayVar.mo59716a(fVar2.f180780c);
                }
                C66483f fVar3 = hVar.f180786c;
                if (fVar3 == null) {
                    fVar3 = C66483f.f180776e;
                }
                if (fVar3.f180779b.size() > 0) {
                    C66716at atVar2 = ((C66722az) ayVar.instance).f181497c;
                    if (atVar2 == null) {
                        atVar2 = C66716at.f181484b;
                    }
                    C66714ar arVar2 = (C66714ar) atVar2.toBuilder();
                    C66712ap apVar2 = (C66712ap) C66713aq.f181479c.createBuilder();
                    C66753t tVar2 = (C66753t) C66754u.f181563b.createBuilder();
                    C66483f fVar4 = hVar.f180786c;
                    if (fVar4 == null) {
                        fVar4 = C66483f.f180776e;
                    }
                    tVar2.mo59734a((Iterable) Collection.EL.stream(fVar4.f180779b).map(C15725s.f46901a).collect(C58370cn.f155946a));
                    C66754u uVar2 = (C66754u) tVar2.build();
                    apVar2.copyOnWrite();
                    C66713aq aqVar2 = (C66713aq) apVar2.instance;
                    uVar2.getClass();
                    aqVar2.f181482b = uVar2;
                    aqVar2.f181481a = 1;
                    arVar2.mo59713b("experiment-labels", (C66713aq) apVar2.build());
                    ayVar.copyOnWrite();
                    C66722az azVar2 = (C66722az) ayVar.instance;
                    C66716at atVar3 = (C66716at) arVar2.build();
                    atVar3.getClass();
                    azVar2.f181497c = atVar3;
                    i = 1;
                    azVar2.f181495a |= 1;
                } else {
                    i = 1;
                }
                C66483f fVar5 = hVar.f180786c;
                if (((fVar5 == null ? C66483f.f180776e : fVar5).f180778a & i) != 0) {
                    if (fVar5 == null) {
                        fVar5 = C66483f.f180776e;
                    }
                    C66487j jVar = fVar5.f180781d;
                    if (jVar == null) {
                        jVar = C66487j.f180787a;
                    }
                    ayVar.copyOnWrite();
                    C66722az azVar3 = (C66722az) ayVar.instance;
                    jVar.getClass();
                    azVar3.f181499e = jVar;
                    azVar3.f181495a |= 4;
                }
            }
            C66722az azVar4 = (C66722az) ayVar.build();
            rVar.copyOnWrite();
            C66752s sVar = (C66752s) rVar.instance;
            azVar4.getClass();
            sVar.f181552g = azVar4;
            sVar.f181546a |= 32;
            if (a.mo56113h()) {
                C67172q qVar = (C67172q) C67175t.f182588e.createBuilder();
                int i2 = bVar.f39246c;
                qVar.copyOnWrite();
                C67175t tVar3 = (C67175t) qVar.instance;
                tVar3.f182590a |= 2;
                tVar3.f182592c = i2;
                int i3 = bVar.f39247d;
                qVar.copyOnWrite();
                C67175t tVar4 = (C67175t) qVar.instance;
                tVar4.f182590a |= 4;
                tVar4.f182593d = i3;
                C67175t tVar5 = (C67175t) qVar.build();
                C67170o oVar = (C67170o) C67171p.f182575e.createBuilder();
                oVar.copyOnWrite();
                C67171p pVar = (C67171p) oVar.instance;
                tVar5.getClass();
                pVar.f182579c = tVar5;
                pVar.f182577a |= 2;
                C67073ka kaVar = ((C13901e) a.mo56107c()).f42333b;
                if (kaVar == null) {
                    kaVar = C67073ka.f182324f;
                }
                C67171p pVar2 = kaVar.f182327b;
                if (pVar2 == null) {
                    pVar2 = C67171p.f182575e;
                }
                C63088z zVar = pVar2.f182578b;
                oVar.copyOnWrite();
                C67171p pVar3 = (C67171p) oVar.instance;
                zVar.getClass();
                pVar3.f182577a |= 1;
                pVar3.f182578b = zVar;
                C67171p pVar4 = (C67171p) oVar.build();
                C67071jz jzVar = (C67071jz) C67073ka.f182324f.createBuilder();
                jzVar.copyOnWrite();
                C67073ka kaVar2 = (C67073ka) jzVar.instance;
                pVar4.getClass();
                kaVar2.f182327b = pVar4;
                kaVar2.f182326a |= 1;
                C67073ka kaVar3 = (C67073ka) jzVar.build();
                C67049jd jdVar = (C67049jd) C67050je.f182262f.createBuilder();
                jdVar.copyOnWrite();
                C67050je jeVar = (C67050je) jdVar.instance;
                kaVar3.getClass();
                jeVar.f182266c = kaVar3;
                jeVar.f182264a |= 2;
                C67050je jeVar2 = (C67050je) jdVar.build();
                rVar.copyOnWrite();
                C66752s sVar2 = (C66752s) rVar.instance;
                jeVar2.getClass();
                sVar2.f181558m = jeVar2;
                sVar2.f181546a |= C89885b.S3REQUEST_VALUE;
            }
            mpVar.copyOnWrite();
            C67143mq mqVar = (C67143mq) mpVar.instance;
            C66752s sVar3 = (C66752s) rVar.build();
            sVar3.getClass();
            mqVar.f182512b = sVar3;
            mqVar.f182511a |= 1;
            leVar.mo58885m(btVar, (C67143mq) mpVar.build());
            ajVar.mo20123c((C67105lf) leVar.build());
        }
        return C58000d.m88748a(anVar.f46863l.f46850b, C15723q.f46899a);
    }
}
