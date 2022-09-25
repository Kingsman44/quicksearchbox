package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120810c;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120811d;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120815h;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1390c.C17251p;
import com.google.android.libraries.search.assistant.p2511d.C32542e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.speech.p5208h.C66585bk;
import com.google.speech.p5208h.C66586bl;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5224k.p5225a.C67226d;
import com.google.speech.p5224k.p5225a.C67227e;
import com.google.speech.recognizer.p5233a.C67432aa;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67439ah;
import com.google.speech.recognizer.p5233a.C67442ak;
import com.google.speech.recognizer.p5233a.C67446ao;
import com.google.speech.recognizer.p5233a.C67467o;
import com.google.speech.recognizer.p5233a.C67468p;
import com.google.speech.recognizer.p5233a.C67473u;
import com.google.speech.recognizer.p5233a.C67474v;
import com.google.speech.recognizer.p5233a.C67475w;
import com.google.speech.recognizer.p5233a.C67476x;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.az */
/* compiled from: PG */
public final /* synthetic */ class C120208az implements C32542e {

    /* renamed from: a */
    public final /* synthetic */ C120212bb f334527a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f334528b;

    public /* synthetic */ C120208az(C120212bb bbVar, Consumer consumer) {
        this.f334527a = bbVar;
        this.f334528b = consumer;
    }

    /* renamed from: a */
    public final C60870cx mo38138a(Object obj) {
        C120815h hVar;
        C120815h hVar2;
        C120815h hVar3;
        C120815h hVar4;
        C120212bb bbVar = this.f334527a;
        Consumer consumer = this.f334528b;
        C120245cc ccVar = (C120245cc) obj;
        if (ccVar.mo104706b() && !bbVar.f334534b) {
            boolean z = bbVar.f334533a;
            C58976aa aaVar = C58975e.f156826a;
            C66606cd cdVar = (C66606cd) C66607ce.f181191f.createBuilder();
            C62940bt btVar = C67227e.f182707d;
            C67226d dVar = (C67226d) C67227e.f182706c.createBuilder();
            dVar.copyOnWrite();
            C67227e eVar = (C67227e) dVar.instance;
            eVar.f182710b = 2;
            eVar.f182709a |= 1;
            cdVar.mo58885m(btVar, (C67227e) dVar.build());
            if (z) {
                C62940bt btVar2 = C66586bl.f181122d;
                C66585bk bkVar = (C66585bk) C66586bl.f181121c.createBuilder();
                C120811d a = ccVar.mo104705a();
                List b = C120212bb.m199159b(C120212bb.m199160d(a));
                C67439ah ahVar = (C67439ah) C67442ak.f183276i.createBuilder();
                if (a.f335967a == 1) {
                    hVar3 = (C120815h) a.f335968b;
                } else {
                    hVar3 = C120815h.f335972f;
                }
                if ((2 & hVar3.f335974a) != 0) {
                    if (a.f335967a == 1) {
                        hVar4 = (C120815h) a.f335968b;
                    } else {
                        hVar4 = C120815h.f335972f;
                    }
                    boolean z2 = hVar4.f335978e;
                    ahVar.copyOnWrite();
                    C67442ak akVar = (C67442ak) ahVar.instance;
                    akVar.f183278a |= 256;
                    akVar.f183283f = z2;
                }
                C67432aa aaVar2 = (C67432aa) C67438ag.f183256k.createBuilder();
                ahVar.mo59868a(b);
                aaVar2.copyOnWrite();
                C67438ag agVar = (C67438ag) aaVar2.instance;
                C67442ak akVar2 = (C67442ak) ahVar.build();
                akVar2.getClass();
                agVar.f183261d = akVar2;
                agVar.f183258a |= 4;
                aaVar2.copyOnWrite();
                C67438ag agVar2 = (C67438ag) aaVar2.instance;
                agVar2.f183259b = 1;
                agVar2.f183258a |= 1;
                C67438ag agVar3 = (C67438ag) aaVar2.build();
                bkVar.copyOnWrite();
                C66586bl blVar = (C66586bl) bkVar.instance;
                agVar3.getClass();
                blVar.f181125b = agVar3;
                blVar.f181124a |= 1;
                cdVar.mo58885m(btVar2, (C66586bl) bkVar.build());
            }
            ((C17251p) consumer).accept((C66607ce) cdVar.build());
        } else if (bbVar.f334533a) {
            C58976aa aaVar3 = C58975e.f156826a;
            C66606cd cdVar2 = (C66606cd) C66607ce.f181191f.createBuilder();
            C62940bt btVar3 = C66586bl.f181122d;
            C66585bk bkVar2 = (C66585bk) C66586bl.f181121c.createBuilder();
            C120811d a2 = ccVar.mo104705a();
            int i = a2.f335967a;
            if (i == 1) {
                String str = ((C120815h) a2.f335968b).f335975b;
                C67467o oVar = (C67467o) C67468p.f183364g.createBuilder();
                oVar.copyOnWrite();
                C67468p pVar = (C67468p) oVar.instance;
                str.getClass();
                pVar.f183366a |= 1;
                pVar.f183367b = str;
                oVar.copyOnWrite();
                C67468p pVar2 = (C67468p) oVar.instance;
                pVar2.f183366a |= 8;
                pVar2.f183368c = 1.0f;
                C67468p pVar3 = (C67468p) oVar.build();
                List b2 = C120212bb.m199159b(C120212bb.m199160d(a2));
                C67439ah ahVar2 = (C67439ah) C67442ak.f183276i.createBuilder();
                int i2 = a2.f335967a;
                if (i2 == 1) {
                    hVar = (C120815h) a2.f335968b;
                } else {
                    hVar = C120815h.f335972f;
                }
                if ((hVar.f335974a & 2) != 0) {
                    if (i2 == 1) {
                        hVar2 = (C120815h) a2.f335968b;
                    } else {
                        hVar2 = C120815h.f335972f;
                    }
                    boolean z3 = hVar2.f335978e;
                    ahVar2.copyOnWrite();
                    C67442ak akVar3 = (C67442ak) ahVar2.instance;
                    akVar3.f183278a |= 256;
                    akVar3.f183283f = z3;
                }
                C67432aa aaVar4 = (C67432aa) C67438ag.f183256k.createBuilder();
                C67475w wVar = (C67475w) C67476x.f183390i.createBuilder();
                C67473u uVar = (C67473u) C67474v.f183384d.createBuilder();
                uVar.copyOnWrite();
                C67474v vVar = (C67474v) uVar.instance;
                str.getClass();
                vVar.f183386a |= 1;
                vVar.f183387b = str;
                uVar.copyOnWrite();
                C67474v vVar2 = (C67474v) uVar.instance;
                vVar2.f183386a |= 2;
                vVar2.f183388c = 1.0d;
                wVar.mo59875b(uVar);
                wVar.mo59874a(pVar3);
                aaVar4.copyOnWrite();
                C67438ag agVar4 = (C67438ag) aaVar4.instance;
                C67476x xVar = (C67476x) wVar.build();
                xVar.getClass();
                agVar4.f183262e = xVar;
                agVar4.f183258a |= 8;
                ahVar2.mo59868a(b2);
                aaVar4.copyOnWrite();
                C67438ag agVar5 = (C67438ag) aaVar4.instance;
                C67442ak akVar4 = (C67442ak) ahVar2.build();
                akVar4.getClass();
                agVar5.f183264g = akVar4;
                agVar5.f183258a |= 32;
                C67446ao aoVar = C67446ao.STATUS_SUCCESS;
                aaVar4.copyOnWrite();
                C67438ag agVar6 = (C67438ag) aaVar4.instance;
                agVar6.f183260c = aoVar.f183298f;
                agVar6.f183258a = 2 | agVar6.f183258a;
                aaVar4.copyOnWrite();
                C67438ag agVar7 = (C67438ag) aaVar4.instance;
                agVar7.f183259b = 0;
                agVar7.f183258a |= 1;
                C67438ag agVar8 = (C67438ag) aaVar4.build();
                bkVar2.copyOnWrite();
                C66586bl blVar2 = (C66586bl) bkVar2.instance;
                agVar8.getClass();
                blVar2.f181125b = agVar8;
                blVar2.f181124a |= 1;
                cdVar2.mo58885m(btVar3, (C66586bl) bkVar2.build());
                ((C17251p) consumer).accept((C66607ce) cdVar2.build());
            } else {
                throw new C120365ge(C120810c.m200013b(i), C120243ca.RECOGNITION_PASSTHROUGH);
            }
        }
        return C60866ct.f164955a;
    }
}
