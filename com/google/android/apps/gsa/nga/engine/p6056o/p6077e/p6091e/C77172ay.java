package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6307af.C80595f;
import com.google.android.apps.gsa.nga.shared.p6307af.C80600k;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80590x;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import com.google.assistant.p3897e.p3917i.p3918a.C51593nl;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4538j.C59302a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import p3186j$.time.Duration;
import p3186j$.time.temporal.ChronoUnit;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.ay */
/* compiled from: PG */
public final /* synthetic */ class C77172ay implements C77193bs {

    /* renamed from: a */
    public final /* synthetic */ C77175ba f212971a;

    public /* synthetic */ C77172ay(C77175ba baVar) {
        this.f212971a = baVar;
    }

    /* renamed from: a */
    public final C60870cx mo72467a(C76590bg bgVar, C74965n nVar, C58485gu guVar) {
        String str;
        C77175ba baVar = this.f212971a;
        C80399l c = C77175ba.m123880c();
        if (guVar.size() == 1 || nVar.mo71328c().mo71266e()) {
            C51593nl nlVar = (C51593nl) C51594nm.f134474f.createBuilder();
            nlVar.mo53648b(guVar);
            C81442m.m129557s(c, t.p("timer.REMOVE_TIMER", (C51594nm) nlVar.build()));
            if (nVar.mo71348w()) {
                C51808dx dxVar = (C51808dx) C51809dy.f135933f.createBuilder();
                dxVar.copyOnWrite();
                C51809dy dyVar = (C51809dy) dxVar.instance;
                dyVar.f135935a |= 1;
                dyVar.f135936b = "core.DISMISS_ASSISTANT";
                C81442m.m129557s(c, (C51809dy) dxVar.build());
            } else {
                Locale q = nVar.mo71342q();
                if (guVar.size() != 1) {
                    str = baVar.f212974a.mo75121a(q).getString(R.string.nga_productivity_delete_timer_multiple_response, new Object[]{Integer.valueOf(guVar.size())});
                } else {
                    C51592nk nkVar = (C51592nk) guVar.get(0);
                    String string = baVar.f212974a.mo75121a(q).getString(R.string.nga_productivity_delete_timer_time_response, new Object[]{baVar.f212975b.mo74016h(q, Duration.ofMillis(nkVar.f134469f), ChronoUnit.SECONDS)});
                    if ((nkVar.f134464a & 32) == 0 || nkVar.f134470g.isEmpty()) {
                        str = string;
                    } else {
                        str = baVar.f212974a.mo75121a(q).getString(R.string.nga_productivity_delete_timer_label_response, new Object[]{C59302a.f157435a.mo56216a(nkVar.f134470g)});
                    }
                }
                C81442m.m129557s(c, t.r(str));
                C80595f f = C80595f.m128216f(C80590x.CLIENT_OP_SUGGESTION_ON_DEVICE, baVar.f212974a.mo75121a(q).getString(R.string.nga_productivity_show_timers_suggestion, new Object[0]));
                f.mo74361h(27105);
                C81442m.m129557s(c, t.n(C80600k.m128226a(f.mo74357a(new Intent("android.intent.action.SHOW_TIMERS")).mo74356a())));
            }
            return C60856cj.m92900i((C80401n) c.build());
        }
        baVar.f212976c.mo76648a(nVar.mo71336k(), C82835ce.SUPPORTED_APPLICATION_NOT_FOUND, C83044e.f226656a);
        return C81442m.f222851a;
    }
}
