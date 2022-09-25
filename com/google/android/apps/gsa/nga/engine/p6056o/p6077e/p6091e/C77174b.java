package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3917i.p3918a.C51588ng;
import com.google.assistant.p3897e.p3917i.p3918a.C51589nh;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import com.google.assistant.p3897e.p3917i.p3918a.C51593nl;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.b */
/* compiled from: PG */
public final /* synthetic */ class C77174b implements C77193bs {

    /* renamed from: a */
    public final /* synthetic */ C77228d f212973a;

    public /* synthetic */ C77174b(C77228d dVar) {
        this.f212973a = dVar;
    }

    /* renamed from: a */
    public final C60870cx mo72467a(C76590bg bgVar, C74965n nVar, C58485gu guVar) {
        C51592nk nkVar;
        C76590bg bgVar2 = bgVar;
        C77228d dVar = this.f212973a;
        Optional map = bgVar2.mo72270l("time_to_add").map(C77201c.f213018a);
        if (guVar.size() != 1) {
            dVar.f213063b.mo76648a(nVar.mo71336k(), C82835ce.QUANTIFIERS_NOT_IMPLEMENTED, C83044e.f226656a);
            return C81442m.f222851a;
        } else if (!map.isPresent()) {
            dVar.f213063b.mo76648a(nVar.mo71336k(), C82835ce.TIME_TO_ADD_NOT_PROVIDED, C83044e.f226656a);
            return C81442m.f222851a;
        } else if (!nVar.mo71328c().mo71266e()) {
            dVar.f213063b.mo76648a(nVar.mo71336k(), C82835ce.SUPPORTED_APPLICATION_NOT_FOUND, C83044e.f226656a);
            return C81442m.f222851a;
        } else {
            C51592nk nkVar2 = (C51592nk) guVar.get(0);
            C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
            lVar.mo74319k(36967);
            lVar.copyOnWrite();
            ((C80401n) lVar.instance).f220663f = true;
            long j = 0;
            if ((nkVar2.f134465b == 4 ? ((Long) nkVar2.f134466c).longValue() : 0) == nkVar2.f134469f) {
                C81442m.m129557s(lVar, t.r(dVar.f213062a.mo75121a(nVar.mo71342q()).getString(R.string.nga_productivity_add_time_to_running_pause_timer_response, new Object[0])));
                return C60856cj.m92900i((C80401n) lVar.build());
            }
            Duration duration = (Duration) bgVar2.mo72270l("time_to_add").map(C77201c.f213018a).get();
            int a = C51589nh.m86226a(nkVar2.f134465b);
            if (a != 0) {
                if (a == 2) {
                    C51588ng ngVar = (C51588ng) nkVar2.toBuilder();
                    if (nkVar2.f134465b == 5) {
                        j = ((Long) nkVar2.f134466c).longValue();
                    }
                    long millis = duration.toMillis();
                    ngVar.copyOnWrite();
                    C51592nk nkVar3 = (C51592nk) ngVar.instance;
                    nkVar3.f134465b = 5;
                    nkVar3.f134466c = Long.valueOf(j + millis);
                    nkVar = (C51592nk) ngVar.build();
                } else {
                    C51588ng ngVar2 = (C51588ng) nkVar2.toBuilder();
                    if (nkVar2.f134465b == 4) {
                        j = ((Long) nkVar2.f134466c).longValue();
                    }
                    long millis2 = duration.toMillis();
                    ngVar2.copyOnWrite();
                    C51592nk nkVar4 = (C51592nk) ngVar2.instance;
                    nkVar4.f134465b = 4;
                    nkVar4.f134466c = Long.valueOf(j + millis2);
                    nkVar = (C51592nk) ngVar2.build();
                }
                C51593nl nlVar = (C51593nl) C51594nm.f134474f.createBuilder();
                nlVar.copyOnWrite();
                C51594nm nmVar = (C51594nm) nlVar.instance;
                nmVar.f134476a |= 1;
                nmVar.f134478c = true;
                nlVar.mo53650d(nkVar);
                C81442m.m129557s(lVar, t.p("timer.UPDATE_TIMER", (C51594nm) nlVar.build()));
                return C60856cj.m92900i((C80401n) lVar.build());
            }
            throw null;
        }
    }
}
