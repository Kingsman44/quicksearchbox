package com.google.android.apps.gsa.staticplugins.voiceaccess;

import android.util.Pair;
import com.google.android.apps.gsa.shared.speech.C90607o;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.speech.p7294j.C92436f;
import com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8788c.C117628b;
import com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8790e.C117674e;
import com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8791f.C117675a;
import com.google.android.apps.gsa.staticplugins.voiceaccess.session.p8792g.C117676a;
import com.google.android.libraries.accessibility.voiceaccess.api.p10973a.C147335a;
import com.google.android.libraries.accessibility.voiceaccess.api.p10973a.C147336b;
import com.google.android.libraries.gsa.p1929o.p1930a.C23319a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62971cq;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67442ak;
import com.google.speech.recognizer.p5233a.C67468p;
import com.google.speech.recognizer.p5233a.C67474v;
import com.google.speech.recognizer.p5233a.C67476x;

/* renamed from: com.google.android.apps.gsa.staticplugins.voiceaccess.g */
/* compiled from: PG */
final class C117617g extends C92436f {

    /* renamed from: a */
    final /* synthetic */ C117618h f326487a;

    /* renamed from: b */
    private final C23319a f326488b = new C23319a();

    /* renamed from: c */
    private final C117676a f326489c;

    public C117617g(C117618h hVar, C117676a aVar) {
        this.f326487a = hVar;
        this.f326489c = aVar;
    }

    /* renamed from: a */
    public final void mo87095a(C90528t tVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f326489c.mo103428a();
        C117618h hVar = this.f326487a;
        if (hVar.f326497j) {
            hVar.mo103407f("updateStateAfterError", new C117616f(this));
        }
    }

    /* renamed from: g */
    public final void mo87101g(C90607o oVar) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: j */
    public final void mo87104j() {
        C58976aa aaVar = C58975e.f156826a;
        C117618h hVar = this.f326487a;
        if (hVar.f326497j) {
            hVar.mo103407f("restartListening", new C117615e(this));
        } else if (!hVar.f326496i) {
            this.f326489c.mo103428a();
        }
    }

    /* renamed from: k */
    public final void mo87105k(C90607o oVar) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: s */
    public final void mo87113s() {
        C58976aa aaVar = C58975e.f156826a;
        this.f326489c.f326629b.mo103418a(C117628b.m195531b(1));
    }

    /* renamed from: t */
    public final void mo87114t(C67438ag agVar, String str) {
        C60870cx cxVar;
        C58976aa aaVar = C58975e.f156826a;
        int i = agVar.f183258a;
        if ((i & 8) != 0) {
            C67476x xVar = agVar.f183262e;
            if (xVar == null) {
                xVar = C67476x.f183390i;
            }
            if (xVar.f183393b.size() > 0 && !((C67474v) xVar.f183393b.get(0)).f183387b.isEmpty()) {
                Pair a = this.f326488b.mo28812a(agVar);
                C117676a aVar = this.f326489c;
                String str2 = (String) a.second;
                C117628b bVar = aVar.f326629b;
                C147335a b = C117628b.m195531b(2);
                b.mo124107a((String) a.first);
                b.copyOnWrite();
                C147336b bVar2 = (C147336b) b.instance;
                C147336b bVar3 = C147336b.f397726f;
                str2.getClass();
                bVar2.f397728a = 2 | bVar2.f397728a;
                bVar2.f397731d = str2;
                bVar.mo103418a(b);
            }
        } else if ((i & 4) != 0) {
            C67442ak akVar = agVar.f183261d;
            if (akVar == null) {
                akVar = C67442ak.f183276i;
            }
            if (akVar.f183281d.size() > 0 && !((C67468p) akVar.f183281d.get(0)).f183367b.isEmpty()) {
                C117676a aVar2 = this.f326489c;
                C67442ak akVar2 = agVar.f183261d;
                if (akVar2 == null) {
                    akVar2 = C67442ak.f183276i;
                }
                C62971cq<C67468p> cqVar = akVar2.f183281d;
                C117675a aVar3 = aVar2.f326628a;
                String str3 = ((C67468p) cqVar.get(0)).f183367b;
                C117674e eVar = (C117674e) aVar3;
                if (!eVar.f326619a.mo78228b()) {
                    eVar.f326623e.f326537h = str3;
                    if (eVar.f326623e.f326539j) {
                        cxVar = eVar.mo103425b().h.mo60297gq();
                    } else {
                        cxVar = eVar.mo103425b().g.mo60297gq();
                    }
                    eVar.f326623e.f326535f = cxVar;
                } else {
                    eVar.f326623e.f326537h = null;
                    eVar.f326623e.f326538i = null;
                }
                C117628b bVar4 = aVar2.f326629b;
                C147335a b2 = C117628b.m195531b(3);
                for (C67468p pVar : cqVar) {
                    b2.mo124107a(pVar.f183367b);
                }
                bVar4.mo103418a(b2);
            }
        }
    }
}
