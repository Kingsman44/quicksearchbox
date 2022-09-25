package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100788s;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.apps.search.fedora.p10099e.C132815w;
import com.google.android.apps.search.fedora.p10099e.C132818z;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaterializerImpl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5228m.C67270aa;
import com.google.speech.p5228m.C67273ad;
import com.google.speech.p5228m.C67274ae;
import com.google.speech.p5228m.C67318bv;
import com.google.speech.p5228m.C67319bw;
import com.google.speech.p5228m.C67320bx;
import com.google.speech.p5228m.C67322bz;
import com.google.speech.p5228m.C67327cd;
import com.google.speech.p5228m.C67356t;
import com.google.speech.p5228m.C67357u;
import java.io.IOException;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.ah */
/* compiled from: PG */
public final /* synthetic */ class C100896ah implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C100898aj f281898a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f281899b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f281900c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f281901d;

    /* renamed from: e */
    public final /* synthetic */ String f281902e;

    /* renamed from: f */
    public final /* synthetic */ byte[] f281903f;

    /* renamed from: g */
    public final /* synthetic */ byte[] f281904g;

    public /* synthetic */ C100896ah(C100898aj ajVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, String str, byte[] bArr, byte[] bArr2) {
        this.f281898a = ajVar;
        this.f281899b = cxVar;
        this.f281900c = cxVar2;
        this.f281901d = cxVar3;
        this.f281902e = str;
        this.f281903f = bArr;
        this.f281904g = bArr2;
    }

    public final Object call() {
        Object obj;
        Optional optional;
        C100898aj ajVar = this.f281898a;
        C60870cx cxVar = this.f281899b;
        C60870cx cxVar2 = this.f281900c;
        C60870cx cxVar3 = this.f281901d;
        String str = this.f281902e;
        byte[] bArr = this.f281903f;
        byte[] bArr2 = this.f281904g;
        C67322bz bzVar = (C67322bz) C60856cj.m92909r(cxVar);
        C132800h hVar = (C132800h) C60856cj.m92909r(cxVar2);
        C67318bv bvVar = (C67318bv) C60856cj.m92909r(cxVar3);
        C67270aa d = ajVar.f281911e.mo92050d(hVar, false);
        C67274ae f = ajVar.f281911e.mo92052f(hVar);
        C67357u uVar = f.f182873b;
        if (uVar == null) {
            uVar = C67357u.f183084a;
        }
        C62940bt r11 = C62942bv.checkIsLite(C67320bx.f182980f);
        uVar.mo58887l(r11);
        Object l = uVar.f169962ag.mo58854l(r11.f169971d);
        if (l == null) {
            obj = r11.f169969b;
        } else {
            obj = r11.mo58889c(l);
        }
        C67273ad adVar = (C67273ad) f.toBuilder();
        C67356t tVar = (C67356t) C67357u.f183084a.createBuilder();
        C62940bt btVar = C67320bx.f182980f;
        C67319bw bwVar = (C67319bw) ((C67320bx) obj).toBuilder();
        bwVar.copyOnWrite();
        C67320bx bxVar = (C67320bx) bwVar.instance;
        bzVar.getClass();
        bxVar.f182985d = bzVar;
        bxVar.f182982a |= 4;
        C132818z zVar = hVar.f362336d;
        if (zVar == null) {
            zVar = C132818z.f362393h;
        }
        C132815w wVar = zVar.f362397c;
        if (wVar == null) {
            wVar = C132815w.f362363x;
        }
        C67327cd cdVar = wVar.f362380p;
        if (cdVar == null) {
            cdVar = C67327cd.f182998h;
        }
        bwVar.copyOnWrite();
        C67320bx bxVar2 = (C67320bx) bwVar.instance;
        cdVar.getClass();
        bxVar2.f182983b = cdVar;
        bxVar2.f182982a |= 1;
        bwVar.copyOnWrite();
        C67320bx bxVar3 = (C67320bx) bwVar.instance;
        bvVar.getClass();
        bxVar3.f182984c = bvVar;
        bxVar3.f182982a |= 2;
        tVar.mo58885m(btVar, (C67320bx) bwVar.build());
        adVar.copyOnWrite();
        C67274ae aeVar = (C67274ae) adVar.instance;
        C67357u uVar2 = (C67357u) tVar.build();
        uVar2.getClass();
        aeVar.f182873b = uVar2;
        aeVar.f182872a |= 1;
        C67274ae aeVar2 = (C67274ae) adVar.build();
        C100788s sVar = ajVar.f281910d;
        C59104x b = C100788s.f281704a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "EkhoTrainingWrp");
        ((C59052c) ((C59052c) b).mo56372aa(19540)).mo56386p("getMaterializer()");
        if (!sVar.mo92055b()) {
            C59104x b2 = C100788s.f281704a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "EkhoTrainingWrp");
            ((C59052c) ((C59052c) b2).mo56372aa(19541)).mo56386p("getMaterializer(): preconditions failed.");
            optional = Optional.empty();
        } else {
            try {
                optional = Optional.ofNullable(sVar.mo92056c(d, aeVar2, str, bArr, bArr2));
            } catch (IOException unused) {
                optional = Optional.empty();
            }
        }
        if (!optional.isPresent()) {
            ((C59052c) ((C59052c) C100898aj.f281907a.mo56225c()).mo56372aa(19697)).mo56386p("Failed to get materializer");
            return false;
        }
        ajVar.f281912f.set((EkhoMaterializerImpl) optional.get());
        return true;
    }
}
