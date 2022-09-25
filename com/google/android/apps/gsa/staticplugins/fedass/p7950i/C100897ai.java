package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.android.libraries.assistant.portable.p1586b.C19066aj;
import com.google.android.libraries.assistant.portable.p1586b.C19081m;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.assistant.p3897e.p3912f.C51209d;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63070h;
import com.google.protos.p4985f.p5030q.p5032b.C65033ar;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65833dj;
import com.google.protos.p5129p.p5131b.C65845n;
import com.google.speech.p5228m.C67315bs;
import com.google.speech.p5228m.C67316bt;
import com.google.speech.p5228m.C67321by;
import com.google.speech.p5228m.C67322bz;
import com.google.speech.p5228m.C67330cg;
import com.google.speech.p5228m.C67331ch;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.ai */
/* compiled from: PG */
public final /* synthetic */ class C100897ai implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f281905a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f281906b;

    public /* synthetic */ C100897ai(C60870cx cxVar, C60870cx cxVar2) {
        this.f281905a = cxVar;
        this.f281906b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f281905a;
        C65033ar arVar = (C65033ar) C60856cj.m92909r(this.f281906b);
        ArrayList arrayList = new ArrayList();
        for (C65768az azVar : ((C65033ar) C60856cj.m92909r(cxVar)).f176113a) {
            try {
                C63070h hVar = azVar.f178799e;
                if (hVar == null) {
                    hVar = C63070h.f170215c;
                }
                C65845n nVar = (C65845n) C62942bv.parseFrom((C62942bv) C65845n.f178992c, hVar.f170218b, C62921ba.m95368a());
                C65139d dVar = azVar.f178796b;
                if (dVar == null) {
                    dVar = C65139d.f176307e;
                }
                long j = dVar.f176310b;
                C19088t tVar = nVar.f178995b;
                if (tVar == null) {
                    tVar = C19088t.f53533p;
                }
                C67315bs bsVar = (C67315bs) C67316bt.f182967f.createBuilder();
                bsVar.copyOnWrite();
                C67316bt btVar = (C67316bt) bsVar.instance;
                btVar.f182969a |= 1;
                btVar.f182970b = j;
                String str = tVar.f53536b;
                bsVar.copyOnWrite();
                C67316bt btVar2 = (C67316bt) bsVar.instance;
                str.getClass();
                btVar2.f182969a |= 2;
                btVar2.f182971c = str;
                String str2 = tVar.f53537c;
                bsVar.copyOnWrite();
                C67316bt btVar3 = (C67316bt) bsVar.instance;
                str2.getClass();
                btVar3.f182969a |= 4;
                btVar3.f182973e = str2;
                C19081m mVar = tVar.f53542h;
                if (mVar == null) {
                    mVar = C19081m.f53515g;
                }
                C19066aj ajVar = mVar.f53519c;
                if (ajVar == null) {
                    ajVar = C19066aj.f53483e;
                }
                C62963cj<C51209d> cjVar = new C62963cj(ajVar.f53487c, C19066aj.f53482d);
                bsVar.copyOnWrite();
                C67316bt btVar4 = (C67316bt) bsVar.instance;
                C62961ch chVar = btVar4.f182972d;
                if (!chVar.mo58948c()) {
                    btVar4.f182972d = C62942bv.mutableCopy(chVar);
                }
                for (C51209d dVar2 : cjVar) {
                    btVar4.f182972d.mo58916g(dVar2.f133323n);
                }
                arrayList.add((C67316bt) bsVar.build());
            } catch (Throwable th) {
                ((C59052c) ((C59052c) ((C59052c) C100898aj.f281907a.mo56225c()).mo56382g(th)).mo56372aa(19696)).mo56386p("Error converting to history footprint");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C65768az azVar2 : arVar.f176113a) {
            try {
                C63070h hVar2 = azVar2.f178799e;
                if (hVar2 == null) {
                    hVar2 = C63070h.f170215c;
                }
                C65833dj djVar = (C65833dj) C62942bv.parseFrom((C62942bv) C65833dj.f178962b, hVar2.f170218b, C62921ba.m95368a());
                C67330cg cgVar = (C67330cg) C67331ch.f183011d.createBuilder();
                C65139d dVar3 = azVar2.f178796b;
                if (dVar3 == null) {
                    dVar3 = C65139d.f176307e;
                }
                long j2 = dVar3.f176310b;
                cgVar.copyOnWrite();
                C67331ch chVar2 = (C67331ch) cgVar.instance;
                chVar2.f183013a |= 1;
                chVar2.f183014b = j2;
                String str3 = djVar.f178964a;
                cgVar.copyOnWrite();
                C67331ch chVar3 = (C67331ch) cgVar.instance;
                str3.getClass();
                chVar3.f183013a |= 2;
                chVar3.f183015c = str3;
                arrayList2.add((C67331ch) cgVar.build());
            } catch (Throwable th2) {
                ((C59052c) ((C59052c) ((C59052c) C100898aj.f281907a.mo56225c()).mo56382g(th2)).mo56372aa(19695)).mo56386p("Error converting to web history footprint");
            }
        }
        C67321by byVar = (C67321by) C67322bz.f182986c.createBuilder();
        byVar.copyOnWrite();
        C67322bz bzVar = (C67322bz) byVar.instance;
        C62971cq cqVar = bzVar.f182988a;
        if (!cqVar.mo58948c()) {
            bzVar.f182988a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) arrayList, (List) bzVar.f182988a);
        byVar.copyOnWrite();
        C67322bz bzVar2 = (C67322bz) byVar.instance;
        C62971cq cqVar2 = bzVar2.f182989b;
        if (!cqVar2.mo58948c()) {
            bzVar2.f182989b = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) arrayList2, (List) bzVar2.f182989b);
        return (C67322bz) byVar.build();
    }
}
