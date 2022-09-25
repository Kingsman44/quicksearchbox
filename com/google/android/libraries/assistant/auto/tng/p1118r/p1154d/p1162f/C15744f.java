package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1162f;

import com.google.common.p4522b.C58370cn;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63088z;
import com.google.speech.context.p5201a.C66483f;
import com.google.speech.context.p5201a.C66485h;
import com.google.speech.context.p5201a.C66487j;
import com.google.speech.p5218j.C67166nm;
import com.google.speech.p5218j.C67167nn;
import com.google.speech.p5218j.p5219a.C66712ap;
import com.google.speech.p5218j.p5219a.C66713aq;
import com.google.speech.p5218j.p5219a.C66714ar;
import com.google.speech.p5218j.p5219a.C66716at;
import com.google.speech.p5218j.p5219a.C66721ay;
import com.google.speech.p5218j.p5219a.C66722az;
import com.google.speech.p5218j.p5219a.C66753t;
import com.google.speech.p5218j.p5219a.C66754u;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.f.f */
/* compiled from: PG */
public final /* synthetic */ class C15744f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C15750l f46934a;

    public /* synthetic */ C15744f(C15750l lVar) {
        this.f46934a = lVar;
    }

    public final C60870cx apply(Object obj) {
        C15750l lVar = this.f46934a;
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
        azVar.mo59719a();
        C62947c.addAll((Iterable) (List) obj, (List) azVar.f181496b);
        ayVar.copyOnWrite();
        C66722az azVar2 = (C66722az) ayVar.instance;
        atVar.getClass();
        azVar2.f181497c = atVar;
        azVar2.f181495a |= 1;
        C66485h hVar = (C66485h) lVar.f46945f.mo17428b();
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
                tVar2.mo59734a((Iterable) Collection.EL.stream(fVar4.f180779b).map(C15747i.f46937a).collect(C58370cn.f155946a));
                C66754u uVar2 = (C66754u) tVar2.build();
                apVar2.copyOnWrite();
                C66713aq aqVar2 = (C66713aq) apVar2.instance;
                uVar2.getClass();
                aqVar2.f181482b = uVar2;
                aqVar2.f181481a = 1;
                arVar2.mo59713b("experiment-labels", (C66713aq) apVar2.build());
                ayVar.copyOnWrite();
                C66722az azVar3 = (C66722az) ayVar.instance;
                C66716at atVar3 = (C66716at) arVar2.build();
                atVar3.getClass();
                azVar3.f181497c = atVar3;
                azVar3.f181495a |= 1;
            }
            C66483f fVar5 = hVar.f180786c;
            if (((fVar5 == null ? C66483f.f180776e : fVar5).f180778a & 1) != 0) {
                if (fVar5 == null) {
                    fVar5 = C66483f.f180776e;
                }
                C66487j jVar = fVar5.f180781d;
                if (jVar == null) {
                    jVar = C66487j.f180787a;
                }
                ayVar.copyOnWrite();
                C66722az azVar4 = (C66722az) ayVar.instance;
                jVar.getClass();
                azVar4.f181499e = jVar;
                azVar4.f181495a |= 4;
            }
        }
        C67166nm nmVar = (C67166nm) C67167nn.f182564c.createBuilder();
        C66722az azVar5 = (C66722az) ayVar.build();
        nmVar.copyOnWrite();
        C67167nn nnVar = (C67167nn) nmVar.instance;
        azVar5.getClass();
        nnVar.f182568b = azVar5;
        nnVar.f182567a |= 1;
        return lVar.f46941b.mo22519d((C67167nn) nmVar.build());
    }
}
