package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.am.d.k;
import com.google.android.apps.gsa.nga.engine.am.d.m;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.shared.p7066m.C90056dh;
import com.google.assistant.p3897e.p3902c.p3907c.C50984cb;
import com.google.assistant.p3897e.p3902c.p3907c.C50987ce;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3902c.p3907c.C51149ie;
import com.google.assistant.p3897e.p3902c.p3907c.C51152ih;
import com.google.assistant.p3897e.p3917i.p3918a.C51591nj;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import com.google.assistant.p3897e.p3917i.p3918a.C51593nl;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.assistant.p3897e.p3921j.C52459sn;
import com.google.assistant.p3897e.p3921j.C52460so;
import com.google.assistant.p3897e.p3921j.p3926e.C51934en;
import com.google.assistant.p3897e.p3921j.p3926e.C51936ep;
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51942ev;
import com.google.assistant.p3897e.p3921j.p3926e.C51943ew;
import com.google.assistant.p3897e.p3921j.p3926e.C51944ex;
import com.google.assistant.p3897e.p3921j.p3926e.C51948fa;
import com.google.assistant.p3897e.p3921j.p3926e.C51950fc;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4580v.C60948g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.by */
/* compiled from: PG */
public final /* synthetic */ class C77199by implements C77193bs {

    /* renamed from: a */
    public final /* synthetic */ C77200bz f213013a;

    public /* synthetic */ C77199by(C77200bz bzVar) {
        this.f213013a = bzVar;
    }

    /* renamed from: a */
    public final C60870cx mo72467a(C76590bg bgVar, C74965n nVar, C58485gu guVar) {
        long j;
        C58485gu guVar2 = guVar;
        C77200bz bzVar = this.f213013a;
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        lVar.mo74319k(23233);
        if (!bzVar.f213014a.mo85405j(C90056dh.f249002c) || !nVar.mo71338m().isPresent() || nVar.mo71338m().get() != e.aU || !bzVar.f213015b.mo71220e()) {
            C51593nl nlVar = (C51593nl) C51594nm.f134474f.createBuilder();
            nlVar.mo53648b(guVar2);
            nlVar.copyOnWrite();
            C51594nm nmVar = (C51594nm) nlVar.instance;
            nmVar.f134476a |= 1;
            nmVar.f134478c = true;
            C81442m.m129557s(lVar, t.p("timer.SHOW_TIMER", (C51594nm) nlVar.build()));
        } else {
            C51934en enVar = (C51934en) C51953ff.f136315l.createBuilder();
            C58485gu F = C58485gu.m89836F(k.a, guVar2);
            C51944ex exVar = (C51944ex) C51948fa.f136294i.createBuilder();
            exVar.copyOnWrite();
            C51948fa faVar = (C51948fa) exVar.instance;
            faVar.f136296a |= 16;
            faVar.f136301f = true;
            int i = 0;
            while (true) {
                C58724pq pqVar = (C58724pq) F;
                if (i >= pqVar.f156474d) {
                    break;
                }
                C51592nk nkVar = (C51592nk) F.get(i);
                C51591nj a = C51591nj.m86227a(nkVar.f134468e);
                if (a == null) {
                    a = C51591nj.UNKNOWN_TIMER_STATUS;
                }
                long j2 = 0;
                int i2 = 4;
                if (a != C51591nj.RUNNING) {
                    if (nkVar.f134465b == 4) {
                        j2 = ((Long) nkVar.f134466c).longValue();
                    }
                    j = j2 / 1000;
                } else {
                    if (nkVar.f134465b == 5) {
                        j2 = ((Long) nkVar.f134466c).longValue();
                    }
                    C60948g gVar = C60948g.f165068a;
                    j = (j2 - Instant.now().toEpochMilli()) / 1000;
                }
                C51149ie ieVar = (C51149ie) C51152ih.f133149f.createBuilder();
                C52459sn snVar = (C52459sn) C52460so.f137714d.createBuilder();
                snVar.copyOnWrite();
                C52460so soVar = (C52460so) snVar.instance;
                soVar.f137716a |= 1;
                soVar.f137717b = j;
                C52460so soVar2 = (C52460so) snVar.build();
                ieVar.copyOnWrite();
                C51152ih ihVar = (C51152ih) ieVar.instance;
                soVar2.getClass();
                ihVar.f133154d = soVar2;
                ihVar.f133151a |= 4;
                C52459sn snVar2 = (C52459sn) C52460so.f137714d.createBuilder();
                long j3 = nkVar.f134469f;
                snVar2.copyOnWrite();
                C52460so soVar3 = (C52460so) snVar2.instance;
                soVar3.f137716a |= 1;
                soVar3.f137717b = j3 / 1000;
                C52460so soVar4 = (C52460so) snVar2.build();
                ieVar.copyOnWrite();
                C51152ih ihVar2 = (C51152ih) ieVar.instance;
                soVar4.getClass();
                ihVar2.f133153c = soVar4;
                ihVar2.f133151a |= 2;
                C51591nj a2 = C51591nj.m86227a(nkVar.f134468e);
                if (a2 == null) {
                    a2 = C51591nj.UNKNOWN_TIMER_STATUS;
                }
                int ordinal = a2.ordinal();
                if (ordinal == 1) {
                    i2 = 2;
                } else if (ordinal == 2) {
                    i2 = 3;
                } else if (ordinal != 3) {
                    i2 = 1;
                }
                ieVar.copyOnWrite();
                C51152ih ihVar3 = (C51152ih) ieVar.instance;
                ihVar3.f133152b = i2 - 1;
                ihVar3.f133151a |= 1;
                if ((nkVar.f134464a & 32) != 0 && !nkVar.f134470g.isEmpty()) {
                    String str = nkVar.f134470g;
                    ieVar.copyOnWrite();
                    C51152ih ihVar4 = (C51152ih) ieVar.instance;
                    str.getClass();
                    ihVar4.f133151a |= 8;
                    ihVar4.f133155e = str;
                }
                C51152ih ihVar5 = (C51152ih) ieVar.build();
                C51937eq eqVar = (C51937eq) C51941eu.f136271l.createBuilder();
                String str2 = nkVar.f134467d;
                eqVar.copyOnWrite();
                C51941eu euVar = (C51941eu) eqVar.instance;
                str2.getClass();
                euVar.f136273a |= 8;
                euVar.f136279g = str2;
                C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
                C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
                esVar.copyOnWrite();
                C51058ev evVar = (C51058ev) esVar.instance;
                evVar.f132943a |= 1;
                evVar.f132944b = "com.google.android.deskclock";
                String b = m.b(nkVar);
                esVar.copyOnWrite();
                C51058ev evVar2 = (C51058ev) esVar.instance;
                b.getClass();
                evVar2.f132943a |= 32;
                evVar2.f132949g = b;
                ggVar.copyOnWrite();
                C51098gh ghVar = (C51098gh) ggVar.instance;
                C51058ev evVar3 = (C51058ev) esVar.build();
                evVar3.getClass();
                ghVar.f133013c = evVar3;
                ghVar.f133012b = 1;
                eqVar.copyOnWrite();
                C51941eu euVar2 = (C51941eu) eqVar.instance;
                C51098gh ghVar2 = (C51098gh) ggVar.build();
                ghVar2.getClass();
                euVar2.f136276d = ghVar2;
                euVar2.f136275c = 22;
                eqVar.copyOnWrite();
                C51941eu euVar3 = (C51941eu) eqVar.instance;
                ihVar5.getClass();
                euVar3.f136278f = ihVar5;
                euVar3.f136277e = 29;
                C51942ev evVar4 = (C51942ev) C51943ew.f136285f.createBuilder();
                evVar4.mo53759b((C51941eu) eqVar.build());
                exVar.mo53763b((C51943ew) evVar4.build());
                if (i != pqVar.f156474d - 1) {
                    C51942ev evVar5 = (C51942ev) C51943ew.f136285f.createBuilder();
                    C51937eq eqVar2 = (C51937eq) C51941eu.f136271l.createBuilder();
                    C50984cb cbVar = (C50984cb) C50987ce.f132736c.createBuilder();
                    cbVar.copyOnWrite();
                    C50987ce ceVar = (C50987ce) cbVar.instance;
                    ceVar.f132739b = 2;
                    ceVar.f132738a |= 1;
                    C50987ce ceVar2 = (C50987ce) cbVar.build();
                    eqVar2.copyOnWrite();
                    C51941eu euVar4 = (C51941eu) eqVar2.instance;
                    ceVar2.getClass();
                    euVar4.f136278f = ceVar2;
                    euVar4.f136277e = 30;
                    evVar5.mo53758a(eqVar2);
                    exVar.mo53763b((C51943ew) evVar5.build());
                }
                i++;
            }
            enVar.mo53755b((C51948fa) exVar.build());
            enVar.copyOnWrite();
            C51953ff ffVar = (C51953ff) enVar.instance;
            ffVar.f136317a |= 16;
            ffVar.f136322f = true;
            C51936ep epVar = C51936ep.TIMER;
            enVar.copyOnWrite();
            C51953ff ffVar2 = (C51953ff) enVar.instance;
            ffVar2.f136323g = epVar.f136236u;
            ffVar2.f136317a |= 32;
            C51950fc fcVar = C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY;
            enVar.copyOnWrite();
            C51953ff ffVar3 = (C51953ff) enVar.instance;
            ffVar3.f136324h = fcVar.f136309c;
            ffVar3.f136317a |= 64;
            C81442m.m129557s(lVar, t.m((C51953ff) enVar.build()));
        }
        return C60856cj.m92900i((C80401n) lVar.build());
    }
}
