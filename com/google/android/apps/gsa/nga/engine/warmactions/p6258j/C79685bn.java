package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.am.c.ay;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5917c.C74886bd;
import com.google.android.apps.gsa.nga.engine.p5964av.p5967c.p5969b.C75113bn;
import com.google.android.apps.gsa.nga.engine.p6029g.C76087c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.assistant.p3897e.p3917i.p3918a.C51593nl;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.bn */
/* compiled from: PG */
public final class C79685bn extends C79708q {

    /* renamed from: e */
    private static final C58974d f218538e = C58974d.m91136j();

    public C79685bn(C79646ab abVar, C75113bn bnVar, ay ayVar, C74886bd bdVar, C76087c cVar) {
        super(abVar, bnVar, ayVar, bdVar, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Optional mo74188a(C79690bs bsVar) {
        bsVar.mo74199g();
        bsVar.mo74198f();
        if (!this.f218600b.c.a.get()) {
            ((C58970a) ((C58970a) f218538e.mo56226d()).mo56372aa(5778)).mo56386p("#MWW There is no timer firing.");
            return Optional.empty();
        } else if (!bsVar.mo74198f().equals("stop")) {
            ((C58970a) ((C58970a) f218538e.mo56225c()).mo56372aa(5777)).mo56354G("#MWW Unsupported timer query: %s [command: %s].", bsVar.mo74199g(), bsVar.mo74198f());
            return Optional.empty();
        } else {
            C80399l d = m127802d();
            d.mo74319k(24444);
            if (mo74211c()) {
                C58485gu guVar = (C58485gu) Collection.EL.stream(this.f218599a.b().mo71275c()).filter(C79684bm.f218537a).collect(C58370cn.f155946a);
                if (!guVar.isEmpty()) {
                    C51593nl nlVar = (C51593nl) C51594nm.f134474f.createBuilder();
                    nlVar.mo53648b(guVar);
                    C81442m.m129557s(d, t.p("timer.REMOVE_TIMER", (C51594nm) nlVar.build()));
                    return Optional.m71637of((C80401n) d.build());
                }
                ((C58970a) ((C58970a) f218538e.mo56226d()).mo56372aa(5779)).mo56386p("#MWW No firing timer found in Icing. Fallback to legacy intent.");
            }
            C81442m.m129557s(d, t.u(new Intent("android.intent.action.DISMISS_TIMER"), 1, bsVar.mo74193a().b().b(), false, false));
            return Optional.m71637of((C80401n) d.build());
        }
    }
}
