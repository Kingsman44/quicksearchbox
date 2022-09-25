package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6083d;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80293ao;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80338cf;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.d.at */
/* compiled from: PG */
public final class C76850at implements C76591c {

    /* renamed from: a */
    private final Context f212260a;

    public C76850at(Context context) {
        this.f212260a = context;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.SEND_THIS_EMAIL));
        h.mo72244c(C58485gu.m89846n("Send_this_email"));
        h.mo72277g("Send_this_email", C90126fx.f251236ex);
        ((C76541a) h).f211766c = 10206;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        if (((Boolean) nVar.mo71339n().map(C76849as.f212259a).orElse(false)).booleanValue()) {
            C80293ao aoVar = (C80293ao) C80295aq.f220357c.createBuilder();
            C80338cf cfVar = C80338cf.f220449a;
            aoVar.copyOnWrite();
            C80295aq aqVar = (C80295aq) aoVar.instance;
            cfVar.getClass();
            aqVar.f220360b = cfVar;
            aqVar.f220359a = 7;
            C81442m.m129555q(lVar, aoVar);
            C81442m.m129557s(lVar, t.r(this.f212260a.getString(R.string.fulfillers_send_this_email_instruction_text)));
        }
        return C60856cj.m92900i((C80401n) lVar.build());
    }
}
