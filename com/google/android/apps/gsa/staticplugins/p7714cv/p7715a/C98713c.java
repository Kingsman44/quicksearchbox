package com.google.android.apps.gsa.staticplugins.p7714cv.p7715a;

import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.speech.C90603k;
import com.google.android.apps.gsa.shared.speech.C90604l;
import com.google.android.apps.gsa.speech.p7269b.C92216a;
import com.google.android.apps.gsa.speech.p7272e.p7274b.C92252n;
import com.google.common.p4526f.C59071e;
import com.google.p4152bb.p4153a.C54946ad;
import com.google.p4152bb.p4153a.C55139hh;
import com.google.p4152bb.p4153a.C55140hi;
import com.google.p4152bb.p4153a.C55348pa;
import com.google.p4152bb.p4153a.C55349pb;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.speech.p5208h.C66608cf;
import com.google.speech.p5208h.C66610ch;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5224k.p5225a.C67182a;
import com.google.speech.p5224k.p5225a.C67209b;
import com.google.speech.p5224k.p5225a.C67236n;
import com.google.speech.p5224k.p5225a.C67238p;
import com.google.speech.recognizer.p5233a.C67438ag;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.a.c */
/* compiled from: PG */
public final class C98713c {

    /* renamed from: a */
    public static final C59071e f275710a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cv.a.c");

    /* renamed from: b */
    public final C92252n f275711b;

    /* renamed from: c */
    public final C92216a f275712c;

    /* renamed from: d */
    public final C98708a f275713d = new C98708a();

    /* renamed from: a */
    public static C90603k m163500a(C66611ci ciVar) {
        return new C90604l(1, ciVar);
    }

    /* renamed from: b */
    public static C66611ci m163501b(C67438ag agVar) {
        C66608cf cfVar = (C66608cf) C66611ci.f181206g.createBuilder();
        C66610ch chVar = C66610ch.IN_PROGRESS;
        cfVar.copyOnWrite();
        C66611ci ciVar = (C66611ci) cfVar.instance;
        ciVar.f181209b = chVar.f181205e;
        ciVar.f181208a |= 1;
        C62940bt btVar = C67238p.f182737f;
        C67236n nVar = (C67236n) C67238p.f182736e.createBuilder();
        nVar.copyOnWrite();
        C67238p pVar = (C67238p) nVar.instance;
        agVar.getClass();
        pVar.f182741c = agVar;
        pVar.f182740b = 1;
        cfVar.mo58885m(btVar, (C67238p) nVar.build());
        return (C66611ci) cfVar.build();
    }

    /* renamed from: c */
    public static final C66611ci m163502c(C54946ad adVar) {
        C89911f.m146435c(110981450);
        C55348pa paVar = (C55348pa) C55349pb.f145830g.createBuilder();
        paVar.copyOnWrite();
        C55349pb pbVar = (C55349pb) paVar.instance;
        pbVar.f145832a |= 128;
        pbVar.f145836e = 6;
        paVar.mo54248a(adVar);
        paVar.copyOnWrite();
        C55349pb pbVar2 = (C55349pb) paVar.instance;
        pbVar2.f145832a |= 512;
        pbVar2.f145837f = true;
        C55349pb pbVar3 = (C55349pb) paVar.build();
        C55139hh hhVar = (C55139hh) C55140hi.f145150b.createBuilder();
        hhVar.copyOnWrite();
        C55140hi hiVar = (C55140hi) hhVar.instance;
        pbVar3.getClass();
        C62971cq cqVar = hiVar.f145152a;
        if (!cqVar.mo58948c()) {
            hiVar.f145152a = C62942bv.mutableCopy(cqVar);
        }
        hiVar.f145152a.add(pbVar3);
        C55140hi hiVar2 = (C55140hi) hhVar.build();
        C66608cf cfVar = (C66608cf) C66611ci.f181206g.createBuilder();
        C66610ch chVar = C66610ch.IN_PROGRESS;
        cfVar.copyOnWrite();
        C66611ci ciVar = (C66611ci) cfVar.instance;
        ciVar.f181209b = chVar.f181205e;
        ciVar.f181208a |= 1;
        C62940bt btVar = C67209b.f182667e;
        C67182a aVar = (C67182a) C67209b.f182666d.createBuilder();
        aVar.copyOnWrite();
        C67209b bVar = (C67209b) aVar.instance;
        hiVar2.getClass();
        bVar.f182670b = hiVar2;
        bVar.f182669a |= 1;
        cfVar.mo58885m(btVar, (C67209b) aVar.build());
        return (C66611ci) cfVar.build();
    }

    public C98713c(C92252n nVar, C92216a aVar) {
        this.f275711b = nVar;
        aVar.getClass();
        this.f275712c = aVar;
    }
}
