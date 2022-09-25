package com.google.android.apps.gsa.staticplugins.fedass.p7953k;

import android.content.Context;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.C89978aq;
import com.google.android.apps.gsa.speech.hotword.C92354c;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.k.aa */
/* compiled from: PG */
public final class C101077aa implements C118549h {

    /* renamed from: a */
    public static final C59071e f282243a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.k.aa");

    /* renamed from: i */
    private static final long f282244i = TimeUnit.HOURS.toMillis(6);

    /* renamed from: b */
    public final C21370a f282245b;

    /* renamed from: c */
    public final C86338r f282246c;

    /* renamed from: d */
    public final C69464a f282247d;

    /* renamed from: e */
    public final C69464a f282248e;

    /* renamed from: f */
    public final C69464a f282249f;

    /* renamed from: g */
    public final C69464a f282250g;

    /* renamed from: h */
    public final C69464a f282251h;

    /* renamed from: j */
    private final Context f282252j;

    /* renamed from: k */
    private final C69464a f282253k;

    /* renamed from: l */
    private final C69464a f282254l;

    public C101077aa(Context context, C21370a aVar, C86338r rVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6, C69464a aVar7, C69464a aVar8) {
        this.f282252j = context;
        this.f282245b = aVar;
        this.f282246c = rVar;
        this.f282253k = aVar2;
        this.f282247d = aVar3;
        this.f282248e = aVar4;
        this.f282249f = aVar5;
        this.f282254l = aVar6;
        this.f282250g = aVar7;
        this.f282251h = aVar8;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C59071e eVar = f282243a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainMaintainTask");
        ((C59052c) ((C59052c) b).mo56372aa(19778)).mo56386p("perform()");
        if (((C86124t) this.f282253k.mo17428b()).mo79746e(C89978aq.f246602a)) {
            if (!C92354c.m151658d(this.f282252j)) {
                if (this.f282245b.mo26870b() - this.f282246c.getLong("FedAss.TrainPeriodicTask.LastSuccess", 0) < f282244i) {
                    C59104x b2 = eVar.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "TrainMaintainTask");
                    ((C59052c) ((C59052c) b2).mo56372aa(19779)).mo56386p("Last successful run was less than minimum allowed wait time. no-op()");
                    return C118826c.f331423b;
                }
            }
            ((C19435g) this.f282254l.mo17428b()).mo24619a("FedAss.PeriodicTask.NumExecutions");
            C100742h d = C100742h.m166943a(new C101116x(this)).mo92035e(new C101117y(this)).mo92035e(new C101118z(this)).mo92035e(new C101105m(this)).mo92035e(new C101106n(this)).mo92035e(new C101107o(this)).mo92035e(new C101108p(this)).mo92035e(new C101109q(this)).mo92034d(C101111s.f282308a);
            d.mo92039j(new C101112t(this));
            d.mo92038i(C101113u.f282310a);
            return d.f281631a;
        }
        C59104x b3 = eVar.mo56224b();
        b3.mo56378ag(C58975e.f156826a, "TrainMaintainTask");
        ((C59052c) ((C59052c) b3).mo56372aa(19780)).mo56386p("ekho is not enabled. no-op()");
        return C118826c.f331423b;
    }
}
