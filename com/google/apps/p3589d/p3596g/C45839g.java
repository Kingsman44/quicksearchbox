package com.google.apps.p3589d.p3596g;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.apps.p3589d.p3591b.C45712c;
import com.google.apps.p3589d.p3591b.C45719j;
import com.google.apps.p3589d.p3592c.C45725a;
import com.google.apps.p3589d.p3592c.C45730f;
import com.google.apps.p3589d.p3592c.C45731g;
import com.google.apps.p3589d.p3593d.C45737ae;
import com.google.apps.p3589d.p3593d.C45739ag;
import com.google.apps.p3589d.p3593d.C45747f;
import com.google.apps.p3589d.p3593d.C45748g;
import com.google.apps.p3589d.p3593d.C45755n;
import com.google.apps.p3589d.p3593d.C45757p;
import com.google.apps.p3589d.p3593d.C45758q;
import com.google.apps.p3589d.p3593d.C45759r;
import com.google.apps.p3589d.p3593d.C45760s;
import com.google.apps.p3589d.p3593d.C45761t;
import com.google.apps.p3589d.p3593d.C45762u;
import com.google.apps.p3589d.p3593d.C45763v;
import com.google.apps.p3589d.p3593d.C45764w;
import com.google.apps.p3589d.p3593d.C45765x;
import com.google.apps.p3589d.p3593d.C45766y;
import com.google.apps.p3589d.p3593d.C45767z;
import com.google.apps.p3589d.p3595f.C45798aa;
import com.google.apps.p3589d.p3595f.C45821x;

/* renamed from: com.google.apps.d.g.g */
/* compiled from: PG */
public final class C45839g {

    /* renamed from: a */
    public final StringBuilder f120518a = new StringBuilder();

    /* renamed from: b */
    private final boolean f120519b;

    /* renamed from: c */
    private final C45837e f120520c;

    /* renamed from: d */
    private final C45838f f120521d;

    public C45839g(boolean z, C45837e eVar, C45838f fVar) {
        this.f120519b = z;
        this.f120520c = eVar == null ? C45835c.f120516a : eVar;
        this.f120521d = fVar == null ? C45836d.f120517a : fVar;
    }

    /* renamed from: b */
    private final void m81790b(C45763v vVar) {
        this.f120518a.append("{");
        if (vVar != null) {
            m81792d(C45731g.m81514l(vVar));
        }
        this.f120518a.append("}");
    }

    /* renamed from: d */
    private final void m81792d(C45731g gVar) {
        if (this.f120519b) {
            int length = this.f120518a.length();
            C45730f fVar = new C45730f(gVar);
            while (fVar.hasNext()) {
                mo49985a(fVar.next());
            }
            this.f120521d.mo49844a(((C45725a) gVar).f120226a, length, this.f120518a.length());
            return;
        }
        C45821x xVar = C45821x.DEFAULT;
        C45730f fVar2 = new C45730f(gVar);
        while (fVar2.hasNext()) {
            C45755n a = fVar2.next();
            if (xVar != a.f120317f) {
                if (xVar != C45821x.DEFAULT) {
                    this.f120518a.append("}");
                }
                C45821x xVar2 = a.f120317f;
                if (xVar2 != C45821x.DEFAULT) {
                    this.f120518a.append(C45833ai.m81770i(xVar2));
                    this.f120518a.append("{");
                }
                xVar = a.f120317f;
            }
            m81791c(a);
            if (!(xVar == C45821x.DEFAULT || (a.f120315d == null && a.f120316e == null))) {
                this.f120518a.append("}");
                xVar = C45821x.DEFAULT;
            }
            m81794f(a);
        }
        if (xVar != C45821x.DEFAULT) {
            this.f120518a.append("}");
        }
    }

    /* renamed from: e */
    private final void m81793e(String str) {
        this.f120518a.append(str);
        this.f120518a.append(true != str.startsWith("\\") ? BuildConfig.FLAVOR : " ");
    }

    /* renamed from: f */
    private final void m81794f(C45755n nVar) {
        C45763v vVar = nVar.f120316e;
        if (vVar != null) {
            this.f120518a.append("_");
            m81790b(vVar);
        }
        C45763v vVar2 = nVar.f120315d;
        if (vVar2 != null) {
            this.f120518a.append("^");
            m81790b(vVar2);
        }
    }

    /* renamed from: a */
    public final void mo49985a(C45755n nVar) {
        int length = this.f120518a.length();
        m81791c(nVar);
        int length2 = this.f120518a.length();
        m81794f(nVar);
        this.f120520c.mo49843a(nVar, length, length2, this.f120518a.length());
    }

    /* renamed from: c */
    private final void m81791c(C45755n nVar) {
        String str;
        int i = nVar.f120319h - 1;
        boolean z = true;
        if (i == 4) {
            C45762u uVar = (C45762u) nVar;
            String k = C45833ai.m81772k(uVar);
            if (k != null) {
                m81793e(k);
                if (uVar.f120340i) {
                    this.f120518a.append(true != uVar.mo49894n(1) ? "\\nolimits " : "\\limits ");
                }
            }
        } else if (i == 9) {
            C45760s sVar = (C45760s) nVar;
            if (sVar.f120331a) {
                if (sVar.f120332b) {
                    this.f120518a.append("\\cfrac");
                } else {
                    int i2 = sVar.f120336l;
                    if (i2 == 1) {
                        this.f120518a.append("\\dfrac");
                    } else if (i2 == 2) {
                        this.f120518a.append("\\tfrac");
                    } else {
                        this.f120518a.append("\\frac");
                    }
                }
                m81790b(sVar.f120333i);
                m81790b(sVar.f120334j);
                return;
            }
            this.f120518a.append("{");
            m81792d(C45731g.m81514l(sVar.f120333i));
            this.f120518a.append(" \\");
            C45747f fVar = sVar.f120335k;
            if (fVar.equals(C45748g.f120273E)) {
                this.f120518a.append("atop");
            } else if (fVar.equals(C45748g.f120278J)) {
                this.f120518a.append("choose");
            } else if (fVar.equals(C45748g.f120277I)) {
                this.f120518a.append("brace");
            } else if (fVar.equals(C45748g.f120276H)) {
                this.f120518a.append("brack");
            } else {
                this.f120518a.append("atopwithdelims");
                String str2 = ".";
                this.f120518a.append(fVar.mo49870a() == C45748g.NONE ? str2 : fVar.mo49870a().f120308L);
                if (fVar.mo49871b() != C45748g.NONE) {
                    str2 = fVar.mo49871b().f120308L;
                }
                this.f120518a.append(str2);
            }
            this.f120518a.append(" ");
            m81792d(C45731g.m81514l(sVar.f120334j));
            this.f120518a.append("}");
        } else if (i != 10) {
            switch (i) {
                case 12:
                    C45761t tVar = (C45761t) nVar;
                    C45747f fVar2 = tVar.f120337a;
                    if (fVar2.mo49870a() == C45748g.NONE && fVar2.mo49871b() == C45748g.NONE) {
                        this.f120518a.append("\\mathinner");
                        m81790b(tVar.f120344i);
                        return;
                    }
                    this.f120518a.append("\\left");
                    this.f120518a.append(C45833ai.m81768g(fVar2.mo49870a()));
                    this.f120518a.append(" ");
                    m81792d(C45731g.m81514l(tVar.f120344i));
                    this.f120518a.append("\\right");
                    this.f120518a.append(C45833ai.m81768g(fVar2.mo49871b()));
                    this.f120518a.append(" ");
                    return;
                case 13:
                    C45758q qVar = (C45758q) nVar;
                    int i3 = qVar.f120329a;
                    this.f120518a.append(i3 == 1 ? "\\cancel" : i3 == 2 ? "\\bcancel" : "\\xcancel");
                    m81790b(qVar.f120344i);
                    return;
                case 14:
                case 15:
                    C45739ag agVar = (C45739ag) nVar;
                    this.f120518a.append(agVar.f120319h == 15 ? "\\underline" : "\\overline");
                    m81790b(agVar.f120344i);
                    return;
                case 16:
                case 17:
                case 18:
                    this.f120518a.append(C45833ai.m81769h(nVar));
                    m81790b(((C45764w) nVar).f120344i);
                    return;
                case 19:
                    C45759r rVar = (C45759r) nVar;
                    this.f120518a.append("\\textcolor");
                    String h = rVar.f120330a.mo50054h();
                    this.f120518a.append("{");
                    this.f120518a.append(h);
                    this.f120518a.append("}");
                    m81790b(rVar.f120344i);
                    return;
                case 20:
                    C45737ae aeVar = (C45737ae) nVar;
                    String str3 = aeVar.f120247b;
                    if (str3 != null) {
                        this.f120518a.append("\\begin{");
                        this.f120518a.append(str3);
                        this.f120518a.append("}");
                    }
                    for (int i4 = 0; i4 < aeVar.f120249j.f120220a.size(); i4++) {
                        C45719j jVar = (C45719j) aeVar.f120249j.mo49815d(i4);
                        for (int i5 = 0; i5 < jVar.f120220a.size(); i5++) {
                            m81792d(C45731g.m81514l((C45763v) jVar.mo49815d(i5)));
                            if (i5 < jVar.f120220a.size() - 1) {
                                this.f120518a.append("&");
                            }
                        }
                        if (i4 < aeVar.f120249j.f120220a.size() - 1) {
                            this.f120518a.append("\\\\ ");
                        }
                    }
                    if (str3 != null) {
                        this.f120518a.append("\\end{");
                        this.f120518a.append(str3);
                        this.f120518a.append("}");
                        return;
                    }
                    return;
                case 21:
                    C45766y yVar = (C45766y) nVar;
                    C45712c cVar = new C45712c(C45833ai.f120504e);
                    while (true) {
                        if (cVar.hasNext()) {
                            C45830af afVar = (C45830af) cVar.next();
                            if (afVar.f120498a == yVar.f120347a) {
                                str = afVar.f120499b;
                            }
                        } else {
                            str = null;
                        }
                    }
                    if (str != null) {
                        this.f120518a.append(str);
                        return;
                    }
                    this.f120518a.append("\\mkern");
                    this.f120518a.append(String.valueOf(yVar.f120347a));
                    this.f120518a.append("mu");
                    return;
                case 22:
                    m81793e((String) C45833ai.f120501b.mo49822a(C45798aa.m81676a(((C45767z) nVar).f120348a)));
                    return;
                default:
                    if (nVar instanceof C45757p) {
                        C45757p pVar = (C45757p) nVar;
                        String str4 = pVar.f120328b.f120325e;
                        int i6 = pVar.f120319h - 1;
                        this.f120518a.append(String.valueOf(str4).concat(i6 != 6 ? i6 != 7 ? i6 != 8 ? BuildConfig.FLAVOR : C33259r.f88929b : "l" : "m"));
                        this.f120518a.append(C45833ai.m81768g(pVar.f120327a));
                        this.f120518a.append(" ");
                        return;
                    }
                    String str5 = nVar.f120314c;
                    if (str5.isEmpty()) {
                        this.f120518a.append("{}");
                        return;
                    }
                    if (!this.f120519b || !nVar.mo49890j() || nVar.f120317f == C45821x.DEFAULT) {
                        z = false;
                    }
                    if (z) {
                        this.f120518a.append(C45833ai.m81770i(nVar.f120317f));
                        this.f120518a.append("{");
                    }
                    String k2 = C45833ai.m81772k(nVar);
                    if (k2 != null) {
                        m81793e(k2);
                    } else {
                        this.f120518a.append(str5);
                    }
                    if (z) {
                        this.f120518a.append("}");
                        return;
                    }
                    return;
            }
        } else {
            C45765x xVar = (C45765x) nVar;
            this.f120518a.append("\\sqrt");
            C45763v vVar = xVar.f120345a;
            if (vVar != null) {
                this.f120518a.append("[");
                m81792d(C45731g.m81514l(vVar));
                this.f120518a.append("]");
            }
            m81790b(xVar.f120346b);
        }
    }
}
