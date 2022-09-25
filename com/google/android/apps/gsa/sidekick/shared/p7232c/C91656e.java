package com.google.android.apps.gsa.sidekick.shared.p7232c;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7129r.C90460b;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1730f.C21383f;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59593aq;
import com.google.common.p4552o.C59594ar;
import com.google.common.p4552o.C59596at;
import com.google.common.p4552o.C59599aw;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C59742e;
import com.google.common.p4552o.C59770f;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.time.Instant;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.c.e */
/* compiled from: PG */
public final class C91656e implements C90460b {

    /* renamed from: b */
    public static final long f255614b = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: l */
    private static final C59071e f255615l = C59071e.m91332i("com.google.android.apps.gsa.sidekick.shared.c.e");

    /* renamed from: c */
    public final C89859i f255616c;

    /* renamed from: d */
    public final C22871g f255617d;

    /* renamed from: e */
    public final C21370a f255618e;

    /* renamed from: f */
    public final AtomicBoolean f255619f = new AtomicBoolean(false);

    /* renamed from: g */
    public final C58495hd f255620g = C58495hd.m89901o("FeedNextPageSnaSession", new AtomicBoolean(false), "FeedNextPageMinusOneSession", new AtomicBoolean(false));

    /* renamed from: h */
    public final Map f255621h = new ConcurrentHashMap();

    /* renamed from: i */
    public boolean f255622i = false;

    /* renamed from: j */
    public boolean f255623j = false;

    /* renamed from: k */
    volatile C60870cx f255624k;

    /* renamed from: m */
    private final AtomicInteger f255625m = new AtomicInteger(0);

    /* renamed from: n */
    private C91655d f255626n;

    public C91656e(C89859i iVar, C22871g gVar, C21370a aVar) {
        this.f255616c = iVar;
        this.f255617d = gVar;
        this.f255618e = aVar;
    }

    /* renamed from: b */
    public static C59582aj m149938b(boolean z) {
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        cbVar.f160062a |= 524288;
        cbVar.f160141v = 8;
        if (z) {
            ajVar.copyOnWrite();
            C59687cb cbVar2 = (C59687cb) ajVar.instance;
            cbVar2.f160140u = 2;
            cbVar2.f160062a = 262144 | cbVar2.f160062a;
        } else {
            ajVar.copyOnWrite();
            C59687cb cbVar3 = (C59687cb) ajVar.instance;
            cbVar3.f160140u = 1;
            cbVar3.f160062a = 262144 | cbVar3.f160062a;
        }
        return ajVar;
    }

    /* renamed from: c */
    public static String m149939c(boolean z) {
        return true != z ? "FeedNextPageSnaSession" : "FeedNextPageMinusOneSession";
    }

    /* renamed from: w */
    private final void m149940w() {
        if (this.f255624k != null) {
            this.f255624k.cancel(true);
            this.f255624k = null;
        }
    }

    /* renamed from: x */
    private final void m149941x(C89849ae aeVar, C59596at atVar) {
        C59582aj b = m149938b(this.f255622i);
        b.copyOnWrite();
        C59687cb cbVar = (C59687cb) b.instance;
        C59687cb cbVar2 = C59687cb.f160034bf;
        cbVar.f160120be = atVar.f159810e;
        cbVar.f160123d |= 33554432;
        mo86041f(aeVar, (C59687cb) b.build());
    }

    /* renamed from: y */
    private final void m149942y(C89849ae aeVar) {
        this.f255624k = this.f255617d.mo28208h("FeedAppFlowTimeoutTask", f255614b, new C91653b(this, aeVar));
    }

    /* renamed from: a */
    public final void mo84197a(C90461c cVar) {
        C91655d dVar = this.f255626n;
        if (dVar != null) {
            C91652a aVar = (C91652a) dVar;
            C89857g gVar = aVar.f255608a;
            C89849ae aeVar = gVar.f246206a;
            cVar.mo84200d("Feed Launch Result", aeVar.name());
            cVar.mo84200d("Feed Launch Event Timestamp", new Date(aVar.f255609b).toString());
            switch (aeVar.ordinal()) {
                case 860:
                case 861:
                    C59687cb cbVar = gVar.f246209d;
                    if (cbVar != null && cbVar.f160125f.size() > 0) {
                        int i = ((C59770f) cbVar.f160125f.get(0)).f161505c;
                        C89885b a = C89885b.m146362a(i);
                        if (a != null) {
                            cVar.mo84200d(aeVar == C89849ae.FEED_LAUNCH_DISABLED ? "Feed Launch Disabled Reason" : "Feed Launch Error Reason", a.name());
                            return;
                        } else {
                            ((C59052c) ((C59052c) f255615l.mo56226d()).mo56372aa(11790)).mo56387q("Invalid feed launch error code: %d", i);
                            return;
                        }
                    } else {
                        return;
                    }
                case 862:
                case 863:
                    C59687cb cbVar2 = gVar.f246209d;
                    if (cbVar2 != null && (cbVar2.f160115b & 8) != 0) {
                        int b = C59599aw.m92466b(cbVar2.f160041F);
                        if (b == 0) {
                            b = 1;
                        }
                        cVar.mo84200d("Feed Launch Cancel Reason", C59599aw.m92465a(b));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: d */
    public final void mo86039d(String str) {
        C60870cx cxVar = (C60870cx) this.f255621h.get(str);
        if (cxVar != null) {
            cxVar.cancel(true);
        }
        this.f255621h.remove(str);
    }

    /* renamed from: e */
    public final void mo86040e(long j, C89849ae aeVar) {
        if (!mo86056u()) {
            m149940w();
            C89856f fVar = new C89856f();
            fVar.f246201a = aeVar;
            fVar.f246203c = (C59687cb) m149938b(this.f255622i).build();
            fVar.f246204d = j;
            C89857g a = fVar.mo83699a();
            this.f255616c.mo74236a(a);
            mo86054s(a);
        }
    }

    /* renamed from: f */
    public final void mo86041f(C89849ae aeVar, C59687cb cbVar) {
        if (this.f255625m.get() == 1) {
            C89856f fVar = new C89856f();
            fVar.f246201a = aeVar;
            fVar.f246203c = cbVar;
            this.f255616c.mo74236a(fVar.mo83699a());
        }
    }

    /* renamed from: g */
    public final void mo86042g(long j, C89849ae aeVar, C89849ae aeVar2, C59687cb cbVar) {
        if (!this.f255623j) {
            if (this.f255625m.compareAndSet(0, 1)) {
                m149942y(aeVar2);
            } else if (this.f255625m.compareAndSet(2, 1)) {
                this.f255622i = true;
                m149942y(aeVar2);
            } else {
                return;
            }
            this.f255619f.set(true);
            C89856f fVar = new C89856f();
            fVar.f246201a = aeVar;
            fVar.f246203c = cbVar;
            fVar.f246204d = j;
            this.f255616c.mo74236a(fVar.mo83699a());
            this.f255626n = null;
        }
    }

    /* renamed from: h */
    public final void mo86043h(C89885b bVar) {
        if (this.f255619f.getAndSet(false)) {
            C59582aj b = m149938b(this.f255622i);
            C59742e eVar = (C59742e) C59770f.f161501d.createBuilder();
            eVar.copyOnWrite();
            C59770f fVar = (C59770f) eVar.instance;
            fVar.f161503a |= 1;
            fVar.f161504b = 0;
            int i = bVar.f246280a;
            eVar.copyOnWrite();
            C59770f fVar2 = (C59770f) eVar.instance;
            fVar2.f161503a |= 2;
            fVar2.f161505c = i;
            b.mo57008e((C59770f) eVar.build());
            C89856f fVar3 = new C89856f();
            fVar3.f246201a = C89849ae.FEED_LAUNCH_CACHE_MISS;
            fVar3.f246203c = (C59687cb) b.build();
            this.f255616c.mo74236a(fVar3.mo83699a());
        }
    }

    /* renamed from: i */
    public final void mo86044i(C59770f fVar) {
        if (!mo86056u()) {
            m149940w();
            C59582aj b = m149938b(this.f255622i);
            b.mo57008e(fVar);
            C89856f fVar2 = new C89856f();
            fVar2.f246201a = C89849ae.FEED_LAUNCH_DISABLED;
            fVar2.f246203c = (C59687cb) b.build();
            C89857g a = fVar2.mo83699a();
            this.f255616c.mo74236a(a);
            mo86054s(a);
        }
    }

    /* renamed from: j */
    public final void mo86045j(C59770f fVar) {
        if (!mo86056u()) {
            m149940w();
            C59582aj b = m149938b(this.f255622i);
            b.mo57008e(fVar);
            C89856f fVar2 = new C89856f();
            fVar2.f246201a = C89849ae.FEED_LAUNCH_ERROR;
            fVar2.f246203c = (C59687cb) b.build();
            C89857g a = fVar2.mo83699a();
            this.f255616c.mo74236a(a);
            mo86054s(a);
        }
    }

    /* renamed from: k */
    public final void mo86046k(C59687cb cbVar) {
        long d = this.f255618e.mo26872d();
        C89849ae aeVar = C89849ae.FEED_LAUNCH_FROM_NOTIFICATION_START;
        C89849ae aeVar2 = C89849ae.FEED_LAUNCH_FROM_NOTIFICATION_TIMEOUT;
        C59582aj ajVar = (C59582aj) cbVar.toBuilder();
        int i = true != this.f255622i ? 2 : 3;
        ajVar.copyOnWrite();
        C59687cb cbVar2 = (C59687cb) ajVar.instance;
        cbVar2.f160140u = i - 1;
        cbVar2.f160062a |= C89885b.HTTP_VALUE;
        mo86042g(d, aeVar, aeVar2, (C59687cb) ajVar.build());
    }

    /* renamed from: l */
    public final void mo86047l(C58833ax axVar, C58833ax axVar2) {
        if (!mo86056u()) {
            m149940w();
            C59582aj b = m149938b(this.f255622i);
            if (axVar2.mo56113h()) {
                C59593aq aqVar = (C59593aq) C59594ar.f159800c.createBuilder();
                C63042fg c = C62950b.m95472c((Instant) axVar2.mo56107c());
                aqVar.copyOnWrite();
                C59594ar arVar = (C59594ar) aqVar.instance;
                c.getClass();
                arVar.f159803b = c;
                arVar.f159802a |= 1;
                C59594ar arVar2 = (C59594ar) aqVar.build();
                b.copyOnWrite();
                C59687cb cbVar = (C59687cb) b.instance;
                C59687cb cbVar2 = C59687cb.f160034bf;
                arVar2.getClass();
                cbVar.f160086aX = arVar2;
                cbVar.f160123d |= C89885b.HTTP_VALUE;
            } else {
                ((C59052c) ((C59052c) f255615l.mo56226d()).mo56372aa(11800)).mo56386p("Missing originalResponseTime for feedLaunchSuccess");
            }
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.FEED_LAUNCH_SUCCESS;
            fVar.f246203c = (C59687cb) b.build();
            if (axVar.mo56113h()) {
                fVar.f246204d = ((Long) axVar.mo56107c()).longValue();
            }
            C89857g a = fVar.mo83699a();
            this.f255616c.mo74236a(a);
            mo86054s(a);
        }
    }

    /* renamed from: m */
    public final void mo86048m(boolean z) {
        String c = m149939c(z);
        if (!mo86055t(c)) {
            mo86039d(c);
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.FEED_NEXT_PAGE_SUCCESS;
            fVar.mo83701c("SessionLoggerId", c);
            this.f255616c.mo74236a(fVar.mo83699a());
        }
    }

    /* renamed from: n */
    public final void mo86049n(C59596at atVar, C59770f fVar) {
        C89849ae aeVar = C89849ae.DISCOVER_FEED_REQUEST_FAILURE;
        C59582aj b = m149938b(this.f255622i);
        b.mo57008e(fVar);
        b.copyOnWrite();
        C59687cb cbVar = (C59687cb) b.instance;
        C59687cb cbVar2 = C59687cb.f160034bf;
        cbVar.f160120be = atVar.f159810e;
        cbVar.f160123d |= 33554432;
        mo86041f(aeVar, (C59687cb) b.build());
    }

    /* renamed from: o */
    public final void mo86050o(C59596at atVar) {
        m149941x(C89849ae.DISCOVER_FEED_REQUEST_SENT, atVar);
    }

    /* renamed from: p */
    public final void mo86051p(C59596at atVar) {
        m149941x(C89849ae.DISCOVER_FEED_REQUEST_START, atVar);
    }

    /* renamed from: q */
    public final void mo86052q(C59596at atVar) {
        m149941x(C89849ae.DISCOVER_FEED_REQUEST_SUCCESS, atVar);
    }

    /* renamed from: r */
    public final void mo86053r(C59596at atVar) {
        m149941x(C89849ae.DISCOVER_FEED_RESPONSE_RECEIVED, atVar);
    }

    /* renamed from: s */
    public final void mo86054s(C89857g gVar) {
        long j;
        if (gVar.f246210e > 0) {
            j = C21383f.m40448a(this.f255618e, TimeUnit.NANOSECONDS.toMillis(gVar.f246210e));
        } else {
            j = this.f255618e.mo26870b();
        }
        this.f255626n = new C91652a(gVar, j);
    }

    /* renamed from: t */
    public final boolean mo86055t(String str) {
        if (!this.f255620g.containsKey(str) || ((AtomicBoolean) this.f255620g.get(str)).getAndSet(false)) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public final boolean mo86056u() {
        if (!this.f255625m.compareAndSet(1, 2)) {
            return true;
        }
        this.f255619f.set(false);
        return false;
    }

    /* renamed from: v */
    public final void mo86057v(int i) {
        if (!mo86056u()) {
            m149940w();
            int i2 = i - 1;
            C89849ae aeVar = i2 != 1 ? C89849ae.FEED_LAUNCH_CANCEL_GOOD : C89849ae.FEED_LAUNCH_CANCEL_BAD;
            C59582aj b = m149938b(this.f255622i);
            b.copyOnWrite();
            C59687cb cbVar = (C59687cb) b.instance;
            C59687cb cbVar2 = C59687cb.f160034bf;
            cbVar.f160041F = i2;
            cbVar.f160115b |= 8;
            C89856f fVar = new C89856f();
            fVar.f246201a = aeVar;
            fVar.f246203c = (C59687cb) b.build();
            C89857g a = fVar.mo83699a();
            this.f255616c.mo74236a(a);
            mo86054s(a);
        }
    }
}
