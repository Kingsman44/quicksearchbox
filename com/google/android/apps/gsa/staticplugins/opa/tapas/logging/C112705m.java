package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89851ag;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C111792a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113191cv;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113388b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.p4553a.C59529cz;
import dagger.C68214a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.m */
/* compiled from: PG */
public final class C112705m implements C113388b {

    /* renamed from: c */
    private static final C59071e f312432c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.logging.m");

    /* renamed from: a */
    public final AtomicBoolean f312433a = new AtomicBoolean(true);

    /* renamed from: b */
    final AtomicLong f312434b = new AtomicLong(0);

    /* renamed from: d */
    private final C68214a f312435d;

    /* renamed from: e */
    private final C22871g f312436e;

    /* renamed from: f */
    private final C21370a f312437f;

    /* renamed from: g */
    private final AtomicInteger f312438g = new AtomicInteger(2);

    /* renamed from: h */
    private final C68214a f312439h;

    /* renamed from: i */
    private final Map f312440i = new HashMap();

    /* renamed from: j */
    private String f312441j = BuildConfig.FLAVOR;

    /* renamed from: k */
    private final C68214a f312442k;

    /* renamed from: l */
    private final C68214a f312443l;

    /* renamed from: m */
    private final boolean f312444m;

    /* renamed from: n */
    private final C111792a f312445n;

    /* renamed from: o */
    private int f312446o = 1;

    public C112705m(C68214a aVar, C86124t tVar, C22871g gVar, C21370a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C111792a aVar6) {
        this.f312435d = aVar;
        this.f312436e = gVar;
        this.f312437f = aVar2;
        this.f312439h = aVar3;
        this.f312442k = aVar4;
        this.f312443l = aVar5;
        this.f312445n = aVar6;
        this.f312444m = tVar.mo79746e(C90063do.f249319bL);
    }

    /* renamed from: q */
    private final void m186538q(C89851ag agVar) {
        C112704l lVar = (C112704l) this.f312440i.get(agVar);
        if (lVar != null && !lVar.mo99646b().isCancelled()) {
            lVar.mo99646b().cancel(false);
        }
    }

    /* renamed from: r */
    private final void m186539r(C89857g gVar) {
        C58976aa aaVar = C58975e.f156826a;
        ((C89859i) this.f312435d.mo27525b()).mo74236a(gVar);
    }

    /* renamed from: s */
    private final void m186540s(long j, C89851ag agVar, C112703k kVar) {
        C58976aa aaVar = C58975e.f156826a;
        Map map = this.f312440i;
        long b = this.f312437f.mo26870b();
        C22871g gVar = this.f312436e;
        Objects.requireNonNull(kVar);
        map.put(agVar, new C112689b(b, gVar.mo28208h("tapas-endstate-timed-out", j, new C112700h(kVar))));
    }

    /* renamed from: a */
    public final void mo99666a(C89849ae aeVar) {
        C58976aa aaVar = C58975e.f156826a;
        aeVar.name();
        ((C89859i) this.f312435d.mo27525b()).mo83702b(aeVar);
    }

    /* renamed from: b */
    public final void mo99667b() {
        if (!mo99679n()) {
            for (Map.Entry entry : this.f312445n.f310697b.entrySet()) {
                mo99668c(((Long) entry.getKey()).longValue(), (String) entry.getValue());
            }
        }
    }

    /* renamed from: c */
    public final void mo99668c(long j, String str) {
        C89849ae aeVar;
        if (str.isEmpty()) {
            aeVar = C89849ae.TAPAS_ZERO_PREFIX_CANCEL_SUGGESTIONS_DRAWN;
        } else {
            aeVar = C89849ae.TAPAS_N_PREFIX_CANCEL_SUGGESTIONS_DRAWN;
        }
        mo99674i(aeVar, j);
        mo99679n();
    }

    /* renamed from: d */
    public final void mo99669d(C89849ae aeVar) {
        if (this.f312438g.get() != 2) {
            m186538q(C89851ag.TAPAS_ACTION_FLOW);
            C89856f fVar = new C89856f();
            fVar.f246201a = aeVar;
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            C59529cz a = ((C112685aw) this.f312439h.mo27525b()).mo99626a();
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            a.getClass();
            cbVar.f160106ar = a;
            cbVar.f160122c |= 256;
            fVar.f246203c = (C59687cb) ajVar.build();
            m186539r(fVar.mo83699a());
            this.f312438g.set(2);
            ((C112685aw) this.f312439h.mo27525b()).mo99634i();
        }
    }

    /* renamed from: e */
    public final void mo99670e(long j, String str) {
        mo99674i(str.isEmpty() ? C89849ae.TAPAS_ZERO_PREFIX_UPDATE : C89849ae.TAPAS_N_PREFIX_UPDATE, j);
    }

    /* renamed from: f */
    public final void mo99671f(long j, String str) {
        C89849ae aeVar;
        if (str.isEmpty()) {
            aeVar = C89849ae.TAPAS_ZERO_PREFIX_SUGGESTIONS_DRAWN;
        } else {
            aeVar = C89849ae.TAPAS_N_PREFIX_SUGGESTIONS_DRAWN;
        }
        mo99674i(aeVar, j);
        if (this.f312433a.getAndSet(false)) {
            C59104x b = f312432c.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TapasAppFlowLogger");
            ((C59052c) ((C59052c) b).mo56372aa(27502)).mo56386p("Tapas cold start first drawn");
            m186538q(C89851ag.TAPAS_START_UP_FLOW);
            mo99666a(C89849ae.TAPAS_SUGGESTIONS_FIRST_DRAWN);
        }
    }

    /* renamed from: g */
    public final void mo99672g(long j) {
        mo99674i(C89849ae.TAPAS_BEGIN_RENDERING_RESULTS, j);
    }

    /* renamed from: h */
    public final void mo99673h() {
        C89849ae aeVar;
        if (((C113191cv) this.f312442k.mo27525b()).mo99907c()) {
            if (this.f312434b.get() != 0) {
                long andSet = this.f312434b.getAndSet(0);
                int i = this.f312446o;
                if (i == 2) {
                    aeVar = C89849ae.TAPAS_OPA_KEYBOARD_INDICATOR_CLICKED;
                } else if (i == 3) {
                    aeVar = C89849ae.TAPAS_NGA_KEYBOARD_INDICATOR_CLICKED;
                } else {
                    aeVar = C89849ae.TAPAS_NGA_KEYBOARD_INDICATOR_CLICKED_OPA_ACTIVE;
                }
                C58976aa aaVar = C58975e.f156826a;
                ((C89859i) this.f312435d.mo27525b()).mo83703p(aeVar, andSet);
                m186540s(Duration.ofSeconds(20).toMillis(), C89851ag.TAPAS_START_UP_FLOW, new C112701i(this));
            } else if (this.f312446o == 5) {
                mo99666a(C89849ae.OPA_ACTIVITY_START_WITH_TAPAS);
            }
            this.f312446o = 1;
        }
    }

    /* renamed from: i */
    public final void mo99674i(C89849ae aeVar, long j) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.mo83701c("rId", Long.toString(j));
        m186539r(fVar.mo83699a());
    }

    /* renamed from: j */
    public final void mo99675j(long j, C89849ae aeVar) {
        mo99676k(j, aeVar);
        mo99674i(aeVar, j);
    }

    /* renamed from: k */
    public final void mo99676k(long j, C89849ae aeVar) {
        Optional optional;
        Optional optional2;
        if (this.f312444m) {
            C111792a aVar = this.f312445n;
            Map map = aVar.f310696a;
            Long valueOf = Long.valueOf(j);
            if (map.containsKey(valueOf)) {
                Long l = (Long) aVar.f310696a.get(valueOf);
                l.getClass();
                optional = Optional.m71637of(l);
            } else {
                optional = Optional.empty();
            }
            C111792a aVar2 = this.f312445n;
            if (aVar2.f310697b.containsKey(valueOf)) {
                String str = (String) aVar2.f310697b.get(valueOf);
                str.getClass();
                optional2 = Optional.m71637of(str);
            } else {
                optional2 = Optional.empty();
            }
            if (optional.isPresent() && optional2.isPresent()) {
                ((C111248k) this.f312443l.mo27525b()).mo99076a(C111255r.LATENCY, String.format("prefix [%s] %s received after [%d]ms from source fetch start", new Object[]{optional2.get(), aeVar.name(), Long.valueOf(this.f312437f.mo26870b() - ((Long) optional.get()).longValue())}));
            }
        }
    }

    /* renamed from: l */
    public final void mo99677l() {
        if (this.f312438g.get() != 1) {
            m186540s(TimeUnit.SECONDS.toMillis(300), C89851ag.TAPAS_ACTION_FLOW, new C112702j(this));
            if (TextUtils.isEmpty(this.f312441j)) {
                mo99666a(C89849ae.TAPAS_START);
            } else {
                mo99666a(C89849ae.TAPAS_START_MID_QUERY);
            }
            this.f312438g.set(1);
        }
    }

    /* renamed from: m */
    public final void mo99678m(String str) {
        if (this.f312438g.get() == 1 && !TextUtils.isEmpty(this.f312441j) && TextUtils.isEmpty(str)) {
            mo99669d(C89849ae.TAPAS_USER_CLEARED_QUERY);
            mo99677l();
        } else if (this.f312438g.get() == 2 && !TextUtils.equals(this.f312441j, str) && !TextUtils.isEmpty(str)) {
            mo99677l();
        }
        this.f312441j = str;
    }

    /* renamed from: n */
    public final boolean mo99679n() {
        if (!this.f312433a.getAndSet(false)) {
            return false;
        }
        m186538q(C89851ag.TAPAS_START_UP_FLOW);
        mo99666a(C89849ae.TAPAS_CANCEL_SUGGESTIONS_FIRST_DRAWN);
        return true;
    }

    /* renamed from: o */
    public final void mo99680o(String str, long j, int i) {
        C89849ae aeVar;
        C89849ae aeVar2 = C89849ae.UNKNOWN_EVENT;
        int i2 = i - 1;
        if (i2 != 0) {
            aeVar = i2 != 1 ? i2 != 2 ? str.isEmpty() ? C89849ae.TAPAS_SERVER_SOURCE_ZERO_PREFIX_CANCELLED : C89849ae.TAPAS_SERVER_SOURCE_N_PREFIX_CANCELLED : str.isEmpty() ? C89849ae.TAPAS_SERVER_SOURCE_ZERO_PREFIX_FAILED : C89849ae.TAPAS_SERVER_SOURCE_N_PREFIX_FAILED : str.isEmpty() ? C89849ae.TAPAS_SERVER_SOURCE_ZERO_PREFIX_TIMEOUT : C89849ae.TAPAS_SERVER_SOURCE_N_PREFIX_TIMEOUT;
        } else {
            aeVar = str.isEmpty() ? C89849ae.TAPAS_SERVER_SOURCE_ZERO_PREFIX_LOADED : C89849ae.TAPAS_SERVER_SOURCE_N_PREFIX_LOADED;
        }
        mo99674i(aeVar, j);
        mo99676k(j, aeVar);
    }

    /* renamed from: p */
    public final void mo99681p(int i) {
        if (this.f312433a.get()) {
            int i2 = i - 1;
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                this.f312434b.set(this.f312437f.mo26872d());
            } else {
                int i3 = this.f312446o;
                if (i3 == 3 || i3 == 4) {
                    return;
                }
            }
            this.f312446o = i;
        }
    }
}
