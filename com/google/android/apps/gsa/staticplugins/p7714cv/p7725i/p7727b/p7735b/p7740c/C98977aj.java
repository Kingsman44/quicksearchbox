package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7740c;

import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8889z.p8893c.p8899f.C118895a;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8912b.C118978s;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.speech.p7272e.p7275c.C92265b;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7715a.C98708a;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7736a.C98909aa;
import com.google.android.libraries.gsa.p1929o.p1930a.C23319a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;
import com.google.speech.recognizer.p5233a.C67437af;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67442ak;
import com.google.speech.recognizer.p5233a.C67446ao;
import com.google.speech.recognizer.p5233a.C67458f;
import com.google.speech.recognizer.p5233a.C67463k;
import com.google.speech.recognizer.p5233a.C67464l;
import com.google.speech.recognizer.p5233a.C67468p;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.b.c.aj */
/* compiled from: PG */
public final class C98977aj implements C92265b {

    /* renamed from: a */
    private static final C59071e f276699a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cv.i.b.b.c.aj");

    /* renamed from: b */
    private final Query f276700b;

    /* renamed from: c */
    private final C98708a f276701c = new C98708a();

    /* renamed from: d */
    private final C23319a f276702d = new C23319a();

    /* renamed from: e */
    private final C98909aa f276703e;

    public C98977aj(Query query, C98909aa aaVar) {
        this.f276700b = query;
        this.f276703e = aaVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo86945a() {
    }

    /* renamed from: b */
    public final void mo86946b(C90528t tVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f276703e.mo91326d(2, this.f276702d.f63817b, tVar, (C86232bo) null);
    }

    /* renamed from: c */
    public final void mo86947c(long j) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: d */
    public final void mo59864d() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: f */
    public final void mo59865f(C67458f fVar) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: g */
    public final void mo59866g(C67464l lVar) {
        C58976aa aaVar = C58975e.f156826a;
        int i = lVar.f183359b;
        C67463k kVar = C67463k.START_OF_SPEECH;
    }

    /* renamed from: h */
    public final void mo59867h(C67438ag agVar) {
        C67438ag a;
        C58976aa aaVar = C58975e.f156826a;
        if ((agVar.f183258a & 1) != 0) {
            C67446ao a2 = C67446ao.m97470a(agVar.f183260c);
            if (a2 == null) {
                a2 = C67446ao.STATUS_SUCCESS;
            }
            if (a2 != C67446ao.STATUS_SUCCESS) {
                C59104x d = f276699a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "AHybridGreco3Callback");
                ((C59052c) ((C59052c) d).mo56372aa(31418)).mo56386p("Ignoring recognition event without success status code.");
                return;
            }
            this.f276701c.mo91274b(agVar);
            int a3 = C67437af.m97466a(agVar.f183259b);
            if (a3 == 0 || a3 == 1) {
                int i = agVar.f183258a;
                if ((i & 8) != 0 || (i & 4) != 0) {
                    Pair a4 = this.f276702d.mo28812a(agVar);
                    this.f276703e.mo91330h(2, new C118895a((String) a4.first, (String) a4.second, false, (String) null));
                    return;
                }
                return;
            }
            int a5 = C67437af.m97466a(agVar.f183259b);
            if (a5 != 0 && a5 == 2 && (a = this.f276701c.mo91273a()) != null) {
                C23319a aVar = this.f276702d;
                if (!aVar.f63817b) {
                    C67442ak akVar = a.f183263f;
                    if (akVar == null) {
                        akVar = C67442ak.f183276i;
                    }
                    Pair a6 = C118978s.m197518a(aVar.mo28813b(akVar), BuildConfig.FLAVOR);
                    if (a6.first == null || TextUtils.isEmpty((CharSequence) a6.first)) {
                        C59104x b = f276699a.mo56224b();
                        b.mo56378ag(C58975e.f156826a, "AHybridGreco3Callback");
                        ((C59052c) ((C59052c) b).mo56372aa(31421)).mo56386p("Empty final recognition result");
                        this.f276703e.mo91328f(2);
                        return;
                    }
                    this.f276703e.mo91331i(2);
                    this.f276703e.mo91330h(2, new C118895a(((SpannedString) a6.first).toString(), BuildConfig.FLAVOR, true, (String) null));
                    C67442ak akVar2 = a.f183263f;
                    if (akVar2 == null) {
                        akVar2 = C67442ak.f183276i;
                    }
                    long j = (long) (((C67468p) akVar2.f183281d.get(0)).f183370e / 1000);
                    if (j == 0) {
                        C67442ak akVar3 = a.f183263f;
                        if (akVar3 == null) {
                            akVar3 = C67442ak.f183276i;
                        }
                        j = akVar3.f183280c / 1000;
                    }
                    Query aG = this.f276700b.mo84270aG((CharSequence) a6.first, (C58485gu) a6.second, j, true);
                    C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar.copyOnWrite();
                    C60555uf ufVar = (C60555uf) tzVar.instance;
                    ufVar.f164093a |= 2;
                    ufVar.f164258m = 555;
                    String b2 = C39191a.m68623b(aG.f252749G);
                    tzVar.copyOnWrite();
                    C60555uf ufVar2 = (C60555uf) tzVar.instance;
                    b2.getClass();
                    ufVar2.f164093a |= 4;
                    ufVar2.f164259n = b2;
                    tzVar.copyOnWrite();
                    C60555uf ufVar3 = (C60555uf) tzVar.instance;
                    ufVar3.f164251f |= 1024;
                    ufVar3.f164112aS = true;
                    tzVar.copyOnWrite();
                    C60555uf ufVar4 = (C60555uf) tzVar.instance;
                    ufVar4.f164250e |= 2;
                    ufVar4.f164144ay = j;
                    C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                    this.f276703e.mo91329g(2, aG, (C86232bo) null);
                    return;
                }
                C59104x c = f276699a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "AHybridGreco3Callback");
                ((C59052c) ((C59052c) c).mo56372aa(31423)).mo56386p("Result after completed recognition.");
                return;
            }
            return;
        }
        C59104x d2 = f276699a.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "AHybridGreco3Callback");
        ((C59052c) ((C59052c) d2).mo56372aa(31419)).mo56386p("Ignoring recognition event without type.");
    }
}
