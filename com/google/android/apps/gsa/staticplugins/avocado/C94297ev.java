package com.google.android.apps.gsa.staticplugins.avocado;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.settings.shared.b.a;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83923j;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.ev */
/* compiled from: PG */
public final class C94297ev extends C84036z {

    /* renamed from: a */
    public static final C59071e f263493a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.avocado.ev");

    /* renamed from: b */
    public final C83923j f263494b;

    /* renamed from: c */
    public int f263495c = 1;

    /* renamed from: d */
    private final C94256dh f263496d;

    /* renamed from: e */
    private final C94327n f263497e;

    /* renamed from: f */
    private final C84026u f263498f;

    /* renamed from: g */
    private final C69464a f263499g;

    /* renamed from: h */
    private final C22871g f263500h;

    /* renamed from: i */
    private final C86124t f263501i;

    /* renamed from: j */
    private final boolean f263502j;

    public C94297ev(C94327n nVar, C83923j jVar, boolean z, C94256dh dhVar, C84026u uVar, C69464a aVar, C22871g gVar, C86124t tVar) {
        this.f263497e = nVar;
        this.f263494b = jVar;
        this.f263496d = dhVar;
        this.f263498f = uVar;
        this.f263499g = aVar;
        this.f263500h = gVar;
        this.f263501i = tVar;
        this.f263502j = z;
    }

    /* renamed from: b */
    public final C58485gu mo88437b(C94327n nVar) {
        return C58485gu.m89846n(C83875ai.m133541f((C94286ek) this.f263499g.mo17428b(), a.a("enrollment_errors_key", nVar), new C94294es(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        if ((this.f263497e.f263600a & 2) == 0) {
            C60870cx h = this.f263500h.mo28208h("Showing the OK screen", (long) ((int) this.f263501i.mo79743a(C90082eg.f249984bu)), C94291ep.f263485a);
            if (this.f263502j) {
                C94256dh dhVar = this.f263496d;
                C60870cx j = dhVar.f263392g.mo28210j(dhVar.f263399n.mo88399a(), "Cloud validation and enable avocado", new C94241ct(dhVar, this.f263494b));
                return C58485gu.m89848p(this.f263498f.mo77487a(h, C94292eq.f263486a), this.f263498f.mo77487a(j, C94293er.f263487a), new C94295et(this, j));
            }
            C94256dh dhVar2 = this.f263496d;
            C83923j jVar = this.f263494b;
            ((C59052c) ((C59052c) C94256dh.f263378a.mo56224b()).mo56372aa(14312)).mo56386p("Start enable and check the status");
            C94251dc dcVar = new C94251dc(jVar);
            Account account = (Account) dhVar2.f263396k.mo77278a().mo56107c();
            if (account == null) {
                ((C59052c) ((C59052c) C94256dh.f263378a.mo56225c()).mo56372aa(14313)).mo56386p("No Account present!");
            }
            C60870cx j2 = dhVar2.f263392g.mo28210j(dhVar2.f263399n.mo88399a(), "Check all image requests and enable avocado", new C94243cv(dhVar2, account, jVar, dcVar));
            C59104x b = f263493a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "progressUpdate");
            ((C59052c) ((C59052c) b).mo56372aa(14429)).mo56386p("Start checking enable and check the status");
            return C58485gu.m89848p(this.f263498f.mo77487a(h, C94292eq.f263486a), this.f263498f.mo77487a(j2, C94293er.f263487a), new C94296eu(this, j2));
        }
        C59104x b2 = f263493a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "progressUpdate");
        ((C59052c) ((C59052c) b2).mo56372aa(14430)).mo56386p("Failed before update!");
        return mo88437b(this.f263497e);
    }
}
