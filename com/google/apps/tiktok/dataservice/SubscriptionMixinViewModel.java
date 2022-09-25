package com.google.apps.tiktok.dataservice;

import androidx.lifecycle.C2358bf;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.concurrent.C46427an;
import com.google.apps.tiktok.concurrent.futuresmixin.C46435a;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
public final class SubscriptionMixinViewModel extends C2358bf {

    /* renamed from: a */
    public final Map f121948a = new HashMap();

    /* renamed from: b */
    public final C46435a f121949b = new C46435a("SubscriptionMixinVM");

    /* renamed from: c */
    public final C46427an f121950c;

    /* renamed from: d */
    private final C21370a f121951d;

    /* renamed from: e */
    private final C46780cx f121952e;

    /* renamed from: f */
    private final Executor f121953f;

    public SubscriptionMixinViewModel(C21370a aVar, C46780cx cxVar, Executor executor) {
        this.f121951d = aVar;
        this.f121952e = cxVar;
        this.f121953f = executor;
        C46427an anVar = new C46427an(executor, true);
        this.f121950c = anVar;
        anVar.mo50407c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50710a(C46689ag agVar, C46816ed edVar, C46792di diVar) {
        C46815ec ecVar;
        int i;
        C46689ag agVar2 = agVar;
        C46792di diVar2 = diVar;
        C19559g.m37304c();
        C58838bb.m90866a(agVar2, "Subscribed to a null DataSource. Are you mocking a DataService? Instead, use the real implementation and mock any stubs/interfaces it calls. See go/mocks#prefer-real-objects");
        Class<?> cls = diVar.getClass();
        C46815ec ecVar2 = (C46815ec) this.f121948a.get(cls);
        if (ecVar2 == null) {
            ecVar = new C46815ec(agVar, this.f121951d, this.f121952e, this.f121950c, this.f121953f);
            this.f121948a.put(cls, ecVar);
        } else {
            ecVar = ecVar2;
        }
        C46435a aVar = this.f121949b;
        C19559g.m37304c();
        Class<?> cls2 = diVar.getClass();
        if (aVar.f121537c.containsKey(cls2)) {
            i = ((Integer) aVar.f121537c.get(cls2)).intValue();
        } else {
            int andIncrement = C46435a.f121535a.getAndIncrement();
            aVar.f121537c.put(cls2, Integer.valueOf(andIncrement));
            i = andIncrement;
        }
        Object put = aVar.f121536b.put(Integer.valueOf(i), diVar2);
        boolean z = false;
        boolean z2 = !(put != null);
        C58838bb.m90866a(agVar.mo18088c(), "Cannot subscribe with a null key");
        C58838bb.m90868c(!(diVar2 instanceof C46791dh) || !(diVar2 instanceof C46685ac));
        Object c = ((C46886z) ecVar.f122197h).f122328a.mo18088c();
        C46789df dfVar = ecVar.f122197h;
        long b = ecVar.f122190a.mo26870b();
        C46886z zVar = (C46886z) dfVar;
        if (zVar.f122330c != Long.MAX_VALUE) {
            z = true;
        }
        C58838bb.m90884s(z, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        agVar.getClass();
        diVar.getClass();
        ecVar.f122197h = new C46886z(agVar, edVar, zVar.f122330c + 1, 3, zVar.f122331d.mo50803g(agVar2, b));
        C46794dj djVar = ecVar.f122198i;
        ecVar.f122198i = new C46684ab(djVar.mo50725a() + 1, diVar, djVar.mo50729e(), djVar.mo50728d(), C58836b.f156633a);
        if (ecVar.f122194e == null) {
            ecVar.f122194e = new C46814eb(ecVar);
            ecVar.f122191b.mo50790d(agVar.mo18088c(), ecVar.f122194e);
        } else if (!agVar.mo18088c().equals(c)) {
            ecVar.f122191b.mo50791e(c, ecVar.f122194e);
            ecVar.f122191b.mo50790d(agVar.mo18088c(), ecVar.f122194e);
        }
        if (!z2 || !ecVar.f122198i.mo50728d().mo56113h()) {
            ecVar.mo50821c(((C46886z) ecVar.f122197h).f122331d);
            return;
        }
        C58838bb.m90884s(!ecVar.f122198i.mo50727c().mo56113h(), "Cannot be the case that subscription has data.");
        C46794dj djVar2 = ecVar.f122198i;
        ecVar.f122198i = C46815ec.m83393h(djVar2, (C46768cl) djVar2.mo50728d().mo56107c());
        C58838bb.m90884s(ecVar.f122198i.mo50727c().mo56113h(), "Callbacks did not accept pinned data after rotation.");
        if ((ecVar.f122198i.mo50726b() instanceof C46685ac) && !ecVar.f122199j.mo50398b()) {
            ecVar.f122198i = ecVar.f122198i.mo50808g(true);
            C46815ec.m83391d((C46685ac) ecVar.f122198i.mo50726b());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo639d() {
        for (C46815ec ecVar : this.f121948a.values()) {
            if (ecVar.f122194e != null) {
                ecVar.f122191b.mo50791e(((C46886z) ecVar.f122197h).f122328a.mo18088c(), ecVar.f122194e);
                ecVar.f122194e = null;
            }
            ecVar.f122199j.mo50397a();
            ecVar.f122200k.mo50397a();
            if (ecVar.f122198i.mo50728d().mo56113h()) {
                ((C46768cl) ecVar.f122198i.mo50728d().mo56107c()).mo50780c();
            }
            if (ecVar.f122198i.mo50727c().mo56113h() && !ecVar.f122198i.mo50727c().equals(ecVar.f122198i.mo50728d())) {
                ((C46768cl) ecVar.f122198i.mo50727c().mo56107c()).mo50780c();
            }
        }
        this.f121950c.mo50404a().clear();
    }
}
