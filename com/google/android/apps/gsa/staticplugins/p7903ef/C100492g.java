package com.google.android.apps.gsa.staticplugins.p7903ef;

import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6519al.p6709dk.C85379a;
import com.google.android.apps.gsa.search.shared.actions.errors.VoiceSearchError;
import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90607o;
import com.google.android.apps.gsa.shared.speech.Hypothesis;
import com.google.android.apps.gsa.shared.speech.p7139a.C90526r;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.shared.speech.p7139a.C90529u;
import com.google.android.apps.gsa.shared.util.C90743b;
import com.google.android.apps.gsa.shared.util.p7158b.C90747d;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.speech.audio.C92207r;
import com.google.android.apps.gsa.speech.helper.p7280a.C92303a;
import com.google.android.apps.gsa.speech.p7294j.C92431a;
import com.google.android.apps.gsa.speech.p7294j.C92436f;
import com.google.android.apps.gsa.speech.p7298l.C92475h;
import com.google.android.libraries.gsa.p1929o.p1930a.C23319a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60650xt;
import com.google.common.p4552o.C60651xu;
import com.google.protos.p4816ai.p4818b.C63196b;
import com.google.speech.p5195a.C66453h;
import com.google.speech.recognizer.p5233a.C67437af;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67442ak;
import com.google.speech.recognizer.p5233a.C67468p;
import com.google.speech.recognizer.p5233a.C67474v;
import com.google.speech.recognizer.p5233a.C67476x;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.ef.g */
/* compiled from: PG */
public final class C100492g extends C92436f {

    /* renamed from: a */
    public final C92431a f280921a;

    /* renamed from: b */
    final /* synthetic */ C100493h f280922b;

    /* renamed from: c */
    private final Query f280923c;

    /* renamed from: d */
    private final C85379a f280924d;

    /* renamed from: e */
    private final C90747d f280925e = C90748e.m148223a(false);

    /* renamed from: f */
    private final C23319a f280926f = new C23319a();

    /* renamed from: g */
    private final boolean f280927g;

    /* renamed from: h */
    private boolean f280928h;

    /* renamed from: i */
    private boolean f280929i;

    public C100492g(C100493h hVar, Query query, C85379a aVar, C92431a aVar2) {
        this.f280922b = hVar;
        this.f280923c = query;
        this.f280924d = aVar;
        this.f280921a = aVar2;
        this.f280927g = query.mo84363bw("android.speech.extra.BEEP_SUPPRESSED");
    }

    /* renamed from: u */
    private final String m166568u(C67438ag agVar) {
        StringBuilder sb;
        float f;
        C67438ag agVar2 = agVar;
        if ((agVar2.f183258a & 8) == 0) {
            return null;
        }
        C67476x xVar = agVar2.f183262e;
        if (xVar == null) {
            xVar = C67476x.f183390i;
        }
        int size = xVar.f183393b.size();
        if (size == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        while (i < size) {
            C67474v vVar = (C67474v) xVar.f183393b.get(i);
            if ((vVar.f183386a & 1) != 0) {
                C100493h hVar = this.f280922b;
                Query query = hVar.f280943p;
                C90021c cVar = (C90021c) hVar.f280933f.mo27525b();
                if (query.mo84465ds()) {
                    f = C92475h.m152101a(90);
                } else {
                    f = C92475h.m152101a((int) cVar.mo79743a(C90082eg.f250055dl));
                }
                double d = (double) f;
                C58976aa aaVar = C58975e.f156826a;
                if (vVar.f183388c < d) {
                    break;
                }
                sb2.append(vVar.f183387b);
                double d2 = vVar.f183388c;
                C92303a aVar = (C92303a) this.f280922b.f280938k.mo27525b();
                long c = aVar.f257397a.mo26871c();
                if (!aVar.f257400d && d < 0.8999999761581421d) {
                    long j = aVar.f257398b;
                    if (j != 0) {
                        sb = sb2;
                    } else if (d2 <= d) {
                        aVar.f257398b = c;
                        sb = sb2;
                        j = c;
                    } else {
                        sb = sb2;
                        j = 0;
                    }
                    long j2 = j;
                    long j3 = aVar.f257399c;
                    if (j3 != 0) {
                        c = j;
                    } else if (d2 > d) {
                        aVar.f257399c = c;
                        if (j2 == 0) {
                            aVar.f257398b = c;
                            j3 = c;
                        } else {
                            j3 = c;
                            c = j2;
                        }
                    } else {
                        c = j;
                        j3 = 0;
                    }
                    if (!(c == 0 || j3 == 0)) {
                        aVar.f257400d = true;
                        long j4 = aVar.f257399c;
                        long j5 = aVar.f257398b;
                        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                        tzVar.copyOnWrite();
                        C60555uf ufVar = (C60555uf) tzVar.instance;
                        ufVar.f164093a |= 2;
                        ufVar.f164258m = 1009;
                        C60650xt xtVar = (C60650xt) C60651xu.f164542c.createBuilder();
                        xtVar.copyOnWrite();
                        C60651xu xuVar = (C60651xu) xtVar.instance;
                        xuVar.f164544a = 1 | xuVar.f164544a;
                        xuVar.f164545b = (int) (j4 - j5);
                        tzVar.copyOnWrite();
                        C60555uf ufVar2 = (C60555uf) tzVar.instance;
                        C60651xu xuVar2 = (C60651xu) xtVar.build();
                        xuVar2.getClass();
                        ufVar2.f164147bA = xuVar2;
                        ufVar2.f164253h |= 1024;
                        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                    }
                    i++;
                    sb2 = sb;
                }
            }
            sb = sb2;
            i++;
            sb2 = sb;
        }
        StringBuilder sb3 = sb2;
        if (sb3.length() == 0) {
            return null;
        }
        return sb3.toString();
    }

    /* renamed from: v */
    private final void m166569v(C67438ag agVar, String str, boolean z) {
        this.f280928h = true;
        C58976aa aaVar = C58975e.f156826a;
        String u = m166568u(agVar);
        if ((agVar.f183258a & 4) != 0) {
            C67442ak akVar = agVar.f183261d;
            if (akVar == null) {
                akVar = C67442ak.f183276i;
            }
            C67442ak akVar2 = akVar;
            if (akVar2.f183281d.size() == 0) {
                C59104x d = C100493h.f280930a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "TranscriptionWorker");
                ((C59052c) ((C59052c) d).mo56372aa(33433)).mo56386p("No hypothesis in recognition result.");
            } else if (((C90021c) this.f280922b.f280933f.mo27525b()).mo79746e(C90082eg.f249959bV)) {
                m166570w(this.f280923c, akVar2, true, u, str);
            } else {
                m166570w(this.f280923c, akVar2, z, u, str);
            }
        } else if (u != null) {
            m166572y(u, BuildConfig.FLAVOR);
        }
    }

    /* renamed from: w */
    private final void m166570w(Query query, C67442ak akVar, boolean z, String str, String str2) {
        Hypothesis hypothesis;
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f280927g && !query.mo84363bw("android.speech.extra.DICTATION_MODE")) {
            C100493h hVar = this.f280922b;
            hVar.f280932c.mo86850f(C92207r.m151409a(query, (C90021c) hVar.f280933f.mo27525b()));
        }
        ArrayList arrayList = new ArrayList();
        for (C67468p pVar : akVar.f183281d) {
            if ((pVar.f183366a & 2048) != 0) {
                String str3 = pVar.f183367b;
                float f = pVar.f183368c;
                C66453h hVar2 = pVar.f183369d;
                if (hVar2 == null) {
                    hVar2 = C66453h.f180692b;
                }
                hypothesis = new Hypothesis(str3, f, hVar2.f180694a);
            } else {
                hypothesis = new Hypothesis(pVar.f183367b, pVar.f183368c);
            }
            arrayList.add(hypothesis);
        }
        this.f280924d.mo78905f(this.f280923c, arrayList, str, z, str2);
    }

    /* renamed from: x */
    private final void m166571x(C90528t tVar) {
        Query query = this.f280923c;
        this.f280922b.f280946s.mo86892c(query.f252749G);
        this.f280924d.mo78903d(this.f280923c, new VoiceSearchError(query, tVar, (String) null));
    }

    /* renamed from: y */
    private final void m166572y(String str, String str2) {
        C58976aa aaVar = C58975e.f156826a;
        this.f280924d.mo78907h(str, str2);
    }

    /* renamed from: a */
    public final void mo87095a(C90528t tVar) {
        this.f280922b.mo91936f("onError", new C100490e(this, tVar));
    }

    /* renamed from: g */
    public final void mo87101g(C90607o oVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f280925e.mo85091a();
        this.f280924d.mo78900a();
    }

    /* renamed from: j */
    public final void mo87104j() {
        C58976aa aaVar = C58975e.f156826a;
        this.f280925e.mo85091a();
        if (!this.f280928h && !this.f280929i) {
            C90526r rVar = new C90526r();
            C89886e b = ((C89911f) this.f280922b.f280937j.mo27525b()).mo83756b(rVar);
            b.mo83725d(this.f280923c.f252749G);
            b.mo83721a();
            m166571x(rVar);
        }
        C100493h hVar = this.f280922b;
        boolean z = false;
        if (!this.f280928h && !this.f280927g) {
            z = true;
        }
        hVar.mo91938h(z);
        this.f280924d.mo78901b(this.f280923c);
    }

    /* renamed from: k */
    public final void mo87105k(C90607o oVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f280925e.mo85091a();
        this.f280924d.mo78902c();
        boolean dz = this.f280923c.mo84471dz();
        boolean ds = this.f280923c.mo84465ds();
        boolean c = ((C90743b) this.f280922b.f280936i.mo27525b()).mo85090c();
        if (this.f280927g) {
            return;
        }
        if ((dz || ds) && c) {
            this.f280922b.f280932c.mo86850f(false);
        }
    }

    /* renamed from: o */
    public final void mo87109o() {
        C58976aa aaVar = C58975e.f156826a;
        this.f280925e.mo85091a();
        this.f280929i = true;
        this.f280922b.mo91938h(true ^ this.f280927g);
        m166571x(new C90529u((byte[]) null));
    }

    /* renamed from: s */
    public final void mo87113s() {
        this.f280922b.mo91936f("onReadyForSpeech", new C100491f(this));
    }

    /* renamed from: t */
    public final void mo87114t(C67438ag agVar, String str) {
        C58976aa aaVar = C58975e.f156826a;
        this.f280925e.mo85091a();
        int a = C67437af.m97466a(agVar.f183259b);
        if (a == 0 || a == 1) {
            if (this.f280923c.mo84363bw("android.speech.extra.DICTATION_MODE")) {
                m166569v(agVar, str, false);
            } else {
                int i = agVar.f183258a;
                if ((i & 4) != 0) {
                    m166569v(agVar, str, true);
                } else if ((i & 8) != 0 && this.f280923c.mo84363bw("android.speech.extra.PARTIAL_RESULTS")) {
                    Pair a2 = this.f280926f.mo28812a(agVar);
                    m166572y((String) a2.first, (String) a2.second);
                }
            }
        }
        int a3 = C67437af.m97466a(agVar.f183259b);
        if (a3 != 0 && a3 == 2) {
            C67442ak akVar = agVar.f183263f;
            if (akVar == null) {
                akVar = C67442ak.f183276i;
            }
            if (akVar.f183281d.size() <= 0) {
                if (!this.f280923c.mo84363bw("android.speech.extra.DICTATION_MODE") && !this.f280923c.mo84363bw("android.speech.extra.PREFER_OFFLINE")) {
                    C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar.copyOnWrite();
                    C60555uf ufVar = (C60555uf) tzVar.instance;
                    ufVar.f164093a = 2 | ufVar.f164093a;
                    ufVar.f164258m = 639;
                    C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                }
                m166569v(agVar, str, true);
            } else if (!this.f280923c.mo84363bw("android.speech.extra.DICTATION_MODE") || !((C90021c) this.f280922b.f280933f.mo27525b()).mo79746e(C90082eg.f249959bV)) {
                this.f280928h = true;
                String u = m166568u(agVar);
                if ((agVar.f183258a & 16) != 0) {
                    C67442ak akVar2 = agVar.f183263f;
                    if (akVar2 == null) {
                        akVar2 = C67442ak.f183276i;
                    }
                    C67442ak akVar3 = akVar2;
                    if (akVar3.f183281d.size() == 0) {
                        C59104x d = C100493h.f280930a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "TranscriptionWorker");
                        ((C59052c) ((C59052c) d).mo56372aa(33431)).mo56386p("No hypothesis in recognition result.");
                        return;
                    }
                    m166570w(this.f280923c, akVar3, true, u, str);
                }
            } else {
                m166569v(agVar, str, true);
            }
        }
    }
}
