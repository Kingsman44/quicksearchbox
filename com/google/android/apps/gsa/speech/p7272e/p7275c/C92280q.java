package com.google.android.apps.gsa.speech.p7272e.p7275c;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.assistant.soda.C19243af;
import com.google.android.libraries.assistant.soda.C19347o;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5218j.C67037is;
import com.google.speech.p5218j.C67038it;
import com.google.speech.p5218j.C67042ix;
import com.google.speech.p5218j.C67066ju;
import com.google.speech.p5218j.C67083kk;
import com.google.speech.p5218j.C67087ko;
import com.google.speech.p5218j.C67095kw;
import com.google.speech.recognizer.p5233a.C67432aa;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67439ah;
import com.google.speech.recognizer.p5233a.C67442ak;
import com.google.speech.recognizer.p5233a.C67446ao;
import com.google.speech.recognizer.p5233a.C67461i;
import com.google.speech.recognizer.p5233a.C67463k;
import com.google.speech.recognizer.p5233a.C67464l;
import com.google.speech.recognizer.p5233a.C67468p;
import com.google.speech.recognizer.p5233a.C67473u;
import com.google.speech.recognizer.p5233a.C67474v;
import com.google.speech.recognizer.p5233a.C67475w;
import com.google.speech.recognizer.p5233a.C67476x;

/* renamed from: com.google.android.apps.gsa.speech.e.c.q */
/* compiled from: PG */
final class C92280q implements C19347o {

    /* renamed from: a */
    C92265b f257319a;

    /* renamed from: b */
    final long f257320b;

    /* renamed from: c */
    final /* synthetic */ C92281r f257321c;

    public C92280q(C92281r rVar, C92265b bVar, long j) {
        this.f257321c = rVar;
        this.f257319a = bVar;
        this.f257320b = j;
    }

    /* renamed from: t */
    public final void mo23782t(C67087ko koVar) {
        C67463k kVar;
        C67066ju juVar;
        C67042ix ixVar;
        C67438ag agVar;
        int i = koVar.f182368a;
        if ((i & 2) != 0) {
            C67083kk kkVar = koVar.f182370c;
            if (kkVar == null) {
                kkVar = C67083kk.f182351g;
            }
            if (kkVar.f182354b == 1) {
                C67083kk kkVar2 = koVar.f182370c;
                if (kkVar2 == null) {
                    kkVar2 = C67083kk.f182351g;
                }
                if (kkVar2.f182354b == 1) {
                    ixVar = (C67042ix) kkVar2.f182355c;
                } else {
                    ixVar = C67042ix.f182227l;
                }
                if (ixVar.f182230b.size() > 0) {
                    C59104x b = C92281r.f257322a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "SodaEngManager");
                    ((C59052c) ((C59052c) b).mo56372aa(12398)).mo56389s("Final recognition: %s", (String) ixVar.f182230b.get(0));
                    if (ixVar.f182230b.size() == 0) {
                        agVar = C67438ag.f183256k;
                    } else {
                        C67432aa aaVar = (C67432aa) C67438ag.f183256k.createBuilder();
                        C67439ah ahVar = (C67439ah) C67442ak.f183276i.createBuilder();
                        ahVar.mo59869b(C92264aa.m151497a((String) ixVar.f182230b.get(0)));
                        aaVar.copyOnWrite();
                        C67438ag agVar2 = (C67438ag) aaVar.instance;
                        C67442ak akVar = (C67442ak) ahVar.build();
                        akVar.getClass();
                        agVar2.f183261d = akVar;
                        agVar2.f183258a |= 4;
                        C67439ah ahVar2 = (C67439ah) C67442ak.f183276i.createBuilder();
                        for (String a : ixVar.f182230b) {
                            ahVar2.mo59869b(C92264aa.m151497a(a));
                        }
                        C67095kw kwVar = ixVar.f182237i;
                        if (kwVar == null) {
                            kwVar = C67095kw.f182399i;
                        }
                        long j = kwVar.f182404d;
                        ahVar2.copyOnWrite();
                        C67442ak akVar2 = (C67442ak) ahVar2.instance;
                        akVar2.f183278a |= 4;
                        akVar2.f183280c = j;
                        C67442ak akVar3 = (C67442ak) ahVar2.build();
                        aaVar.copyOnWrite();
                        C67438ag agVar3 = (C67438ag) aaVar.instance;
                        akVar3.getClass();
                        agVar3.f183263f = akVar3;
                        agVar3.f183258a |= 16;
                        aaVar.copyOnWrite();
                        C67438ag agVar4 = (C67438ag) aaVar.instance;
                        agVar4.f183259b = 1;
                        agVar4.f183258a |= 1;
                        agVar = (C67438ag) aaVar.build();
                    }
                    C92278o.m151529a(C58836b.f156633a, C89849ae.SODA_OFFLINE_RECOGNITION_SUCCESS, this.f257320b, this.f257321c.f257327f);
                    this.f257319a.mo59867h(agVar);
                    return;
                }
                C59104x b2 = C92281r.f257322a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "SodaEngManager");
                ((C59052c) ((C59052c) b2).mo56372aa(12397)).mo56386p("No hypothesis in final result");
                return;
            }
            C67083kk kkVar3 = koVar.f182370c;
            if ((kkVar3 == null ? C67083kk.f182351g : kkVar3).f182354b == 2) {
                if (kkVar3 == null) {
                    kkVar3 = C67083kk.f182351g;
                }
                if (kkVar3.f182354b == 2) {
                    juVar = (C67066ju) kkVar3.f182355c;
                } else {
                    juVar = C67066ju.f182302g;
                }
                if (juVar.f182305b.size() > 0) {
                    C59104x b3 = C92281r.f257322a.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "SodaEngManager");
                    ((C59052c) ((C59052c) b3).mo56372aa(12400)).mo56389s("Partial recognition: %s", (String) juVar.f182305b.get(0));
                    String str = (String) juVar.f182305b.get(0);
                    C67468p a2 = C92264aa.m151497a(str);
                    C67432aa aaVar2 = (C67432aa) C67438ag.f183256k.createBuilder();
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
                    C67095kw kwVar2 = juVar.f182308e;
                    if (kwVar2 == null) {
                        kwVar2 = C67095kw.f182399i;
                    }
                    long j2 = kwVar2.f182404d;
                    wVar.copyOnWrite();
                    C67476x xVar = (C67476x) wVar.instance;
                    xVar.f183392a |= 2;
                    xVar.f183395d = j2;
                    wVar.mo59874a(a2);
                    aaVar2.copyOnWrite();
                    C67438ag agVar5 = (C67438ag) aaVar2.instance;
                    C67476x xVar2 = (C67476x) wVar.build();
                    xVar2.getClass();
                    agVar5.f183262e = xVar2;
                    agVar5.f183258a |= 8;
                    C67446ao aoVar = C67446ao.STATUS_SUCCESS;
                    aaVar2.copyOnWrite();
                    C67438ag agVar6 = (C67438ag) aaVar2.instance;
                    agVar6.f183260c = aoVar.f183298f;
                    agVar6.f183258a |= 2;
                    aaVar2.copyOnWrite();
                    C67438ag agVar7 = (C67438ag) aaVar2.instance;
                    agVar7.f183259b = 0;
                    agVar7.f183258a |= 1;
                    this.f257319a.mo59867h((C67438ag) aaVar2.build());
                    return;
                }
                C59104x b4 = C92281r.f257322a.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "SodaEngManager");
                ((C59052c) ((C59052c) b4).mo56372aa(12399)).mo56386p("No hypothesis in partial result");
            }
        } else if ((i & 8) != 0) {
            C59104x b5 = C92281r.f257322a.mo56224b();
            b5.mo56378ag(C58975e.f156826a, "SodaEngManager");
            C59052c cVar = (C59052c) ((C59052c) b5).mo56372aa(12396);
            C67038it itVar = koVar.f182372e;
            if (itVar == null) {
                itVar = C67038it.f182220d;
            }
            C67037is a3 = C67037is.m97413a(itVar.f182223b);
            if (a3 == null) {
                a3 = C67037is.START_OF_SPEECH;
            }
            cVar.mo56389s("Endpoint Event: %s", a3);
            C67461i iVar = (C67461i) C67464l.f183356e.createBuilder();
            C67038it itVar2 = koVar.f182372e;
            if (itVar2 == null) {
                itVar2 = C67038it.f182220d;
            }
            C67037is a4 = C67037is.m97413a(itVar2.f182223b);
            if (a4 == null) {
                a4 = C67037is.START_OF_SPEECH;
            }
            int ordinal = a4.ordinal();
            if (ordinal == 0) {
                kVar = C67463k.START_OF_SPEECH;
            } else if (ordinal == 1) {
                kVar = C67463k.END_OF_SPEECH;
            } else if (ordinal == 2 || ordinal == 3) {
                kVar = C67463k.END_OF_AUDIO;
            } else {
                kVar = C67463k.END_OF_SPEECH;
            }
            iVar.copyOnWrite();
            C67464l lVar = (C67464l) iVar.instance;
            lVar.f183359b = kVar.f183355e;
            lVar.f183358a |= 1;
            this.f257319a.mo59866g((C67464l) iVar.build());
        }
    }

    /* renamed from: u */
    public final /* synthetic */ void mo23783u() {
    }

    /* renamed from: v */
    public final /* synthetic */ void mo23784v(C19243af afVar) {
    }
}
