package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5900ag.C74820be;
import com.google.android.apps.gsa.nga.engine.p5913am.p5917c.C74886bd;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6029g.C76087c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6307af.C80595f;
import com.google.android.apps.gsa.nga.shared.p6307af.C80600k;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80590x;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.bn */
/* compiled from: PG */
public final class C77188bn {

    /* renamed from: a */
    private final C81515c f212996a;

    /* renamed from: b */
    private final C22871g f212997b;

    /* renamed from: c */
    private final C58974d f212998c = C58974d.m91134h(getClass().getName());

    /* renamed from: d */
    private final C76087c f212999d;

    /* renamed from: e */
    private final C74820be f213000e;

    public C77188bn(C81515c cVar, C22871g gVar, C76087c cVar2, C74820be beVar) {
        this.f212996a = cVar;
        this.f212997b = gVar;
        this.f212999d = cVar2;
        this.f213000e = beVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo72480a(C77185bk bkVar, C76590bg bgVar, C74965n nVar) {
        C60870cx cxVar;
        C22871g gVar = this.f212997b;
        C74886bd c = nVar.mo71328c();
        if (!bkVar.mo72478f() && c.mo71264c()) {
            ((C58970a) ((C58970a) this.f212998c.mo56226d()).mo56372aa(3837)).mo56386p("Not fulfilling when an alarm is ringing.");
            bkVar.mo72476d().mo76648a(nVar.mo71336k(), C82835ce.ALARM_RINGING, C83044e.f226656a);
            cxVar = C81442m.f222851a;
        } else if (!this.f212999d.mo72032d() || this.f213000e.mo71218c()) {
            cxVar = ((C77187bm) bkVar.mo72477e().orElse(new C77180bf(bkVar, nVar))).mo72469a(bgVar, nVar);
        } else if (!c.mo71263b()) {
            bkVar.mo72476d().mo76648a(nVar.mo71336k(), C82835ce.SUPPORTED_APPLICATION_NOT_FOUND, C83044e.f226656a);
            cxVar = C81442m.f222851a;
        } else {
            cxVar = this.f212997b.mo28210j(c.mo71262a(), "[NGA] GenericAlarmFulfiller.fulfillInner", new C77181bg(this, bkVar, nVar, bgVar));
        }
        return gVar.mo28209i(cxVar, "[NGA] GenericAlarmFulfiller.fulfill", new C77182bh(bkVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo72481b(Locale locale, C80399l lVar, boolean z) {
        String str;
        if (z) {
            str = this.f212996a.mo75121a(locale).getString(R.string.nga_productivity_no_alarm_found, new Object[0]);
        } else {
            str = this.f212996a.mo75121a(locale).getString(R.string.nga_productivity_no_alarm_exists, new Object[0]);
        }
        C81442m.m129557s(lVar, t.r(str));
        C80595f f = C80595f.m128216f(C80590x.CLIENT_OP_SUGGESTION_ON_DEVICE, this.f212996a.mo75121a(locale).getString(R.string.nga_productivity_show_alarms_suggestion, new Object[0]));
        f.mo74361h(27105);
        C81442m.m129557s(lVar, t.n(C80600k.m128226a(f.mo74357a(new Intent("android.intent.action.SHOW_ALARMS")).mo74356a())));
    }
}
