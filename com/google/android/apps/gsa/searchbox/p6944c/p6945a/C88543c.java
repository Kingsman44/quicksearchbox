package com.google.android.apps.gsa.searchbox.p6944c.p6945a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.searchbox.p6944c.C88614r;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.searchbox.shared.p6959a.C88689a;
import com.google.android.apps.gsa.shared.p6990an.C89212c;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89203h;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89205j;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.android.libraries.searchbox.root.p3199a.C41627a;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.anf;
import com.google.common.p4552o.aoz;
import com.google.p4017at.p4060h.p4073d.p4074a.C54230as;
import com.google.p4017at.p4060h.p4073d.p4074a.C54231at;
import com.google.p4440ca.p4441a.C57922b;
import com.google.p4440ca.p4441a.C57924d;
import com.google.protobuf.C62921ba;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.searchbox.c.a.c */
/* compiled from: PG */
public final class C88543c implements C89200e, C89203h, C89204i {

    /* renamed from: b */
    private static final C59071e f239301b = C59071e.m91332i("com.google.android.apps.gsa.searchbox.c.a.c");

    /* renamed from: a */
    public C89205j f239302a;

    /* renamed from: c */
    private final C88544d f239303c = new C88544d("CompleteServer");

    /* renamed from: d */
    private final C88544d f239304d = new C88544d("Icing");

    /* renamed from: e */
    private final C88544d f239305e = new C88544d("Tapas");

    /* renamed from: f */
    private final C88544d f239306f = new C88544d("All");

    /* renamed from: g */
    private final C21370a f239307g;

    /* renamed from: h */
    private final C86124t f239308h;

    /* renamed from: i */
    private List f239309i;

    /* renamed from: j */
    private final C86338r f239310j;

    /* renamed from: k */
    private final C68214a f239311k;

    /* renamed from: l */
    private final Map f239312l = new ConcurrentHashMap();

    public C88543c(C21370a aVar, C86124t tVar, C86338r rVar, C68214a aVar2) {
        this.f239307g = aVar;
        this.f239308h = tVar;
        this.f239310j = rVar;
        this.f239311k = aVar2;
    }

    /* renamed from: I */
    private final synchronized C54231at m143013I() {
        ProtoParcelable protoParcelable = (ProtoParcelable) this.f239302a.mo83164d("SUGGEST_RESPONSE_PARAMS_TO_LOG");
        if (protoParcelable == null) {
            return C54231at.f142359r;
        }
        C54231at atVar = (C54231at) C23245b.m43557b(protoParcelable, C54231at.f142359r.getParserForType(), C62921ba.m95368a(), true);
        if (atVar != null) {
            return atVar;
        }
        return C54231at.f142359r;
    }

    /* renamed from: J */
    private final synchronized void m143014J(long j) {
        ArrayList s = this.f239302a.mo83179s();
        s.add(Long.valueOf(j));
        this.f239302a.mo83182v(s);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        return true;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean m143015K() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.apps.gsa.shared.an.a.j r0 = r2.f239302a     // Catch:{ all -> 0x001f }
            java.lang.String r1 = "PENDING_REQUEST_COUNT"
            int r0 = r0.mo83161a(r1)     // Catch:{ all -> 0x001f }
            r1 = 10
            if (r0 >= r1) goto L_0x001c
            com.google.android.apps.gsa.shared.an.a.j r0 = r2.f239302a     // Catch:{ all -> 0x001f }
            java.lang.String r1 = "CONNECTION_ERROR_COUNT"
            int r0 = r0.mo83161a(r1)     // Catch:{ all -> 0x001f }
            r1 = 3
            if (r0 < r1) goto L_0x0019
            goto L_0x001c
        L_0x0019:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x001c:
            monitor-exit(r2)
            r0 = 1
            return r0
        L_0x001f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6944c.p6945a.C88543c.m143015K():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        return false;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean m143016L(com.google.android.libraries.searchbox.shared.p3201b.C41642a r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = r6
            com.google.android.apps.gsa.searchbox.c.t r0 = (com.google.android.apps.gsa.searchbox.p6944c.C88616t) r0     // Catch:{ all -> 0x0024 }
            long r0 = r0.f239560e     // Catch:{ all -> 0x0024 }
            com.google.android.apps.gsa.shared.an.a.j r2 = r5.f239302a     // Catch:{ all -> 0x0024 }
            java.lang.String r3 = "SESSION_CUT_OFF_TIME"
            long r2 = r2.mo83162b(r3)     // Catch:{ all -> 0x0024 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0021
            com.google.android.apps.gsa.searchbox.c.t r6 = (com.google.android.apps.gsa.searchbox.p6944c.C88616t) r6     // Catch:{ all -> 0x0024 }
            android.os.Bundle r6 = r6.f239561f     // Catch:{ all -> 0x0024 }
            java.lang.String r0 = "bs:bootstrapping"
            boolean r6 = r6.getBoolean(r0)     // Catch:{ all -> 0x0024 }
            if (r6 != 0) goto L_0x0021
            monitor-exit(r5)
            r6 = 1
            return r6
        L_0x0021:
            monitor-exit(r5)
            r6 = 0
            return r6
        L_0x0024:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6944c.p6945a.C88543c.m143016L(com.google.android.libraries.searchbox.shared.b.a):boolean");
    }

    /* renamed from: A */
    public final synchronized void mo82175A() {
        this.f239302a.mo83169i("NUM_SUPPRESS_BY_SERVER_ON_DEVICE_DEDUPING_REQUESTS");
    }

    /* renamed from: B */
    public final synchronized void mo82176B() {
        this.f239302a.mo83169i("NUM_SUPPRESS_BY_TYPE_REQUESTS");
    }

    /* renamed from: C */
    public final synchronized void mo82177C(C41642a aVar) {
        if (m143016L(aVar)) {
            this.f239302a.mo83170j("ZERO_PREFIX_ENABLED", true);
        }
    }

    /* renamed from: D */
    public final synchronized void mo82178D(int i, boolean z, int i2, boolean z2) {
        if (i == 1) {
            try {
                this.f239302a.mo83170j("TAP_TARGET_GOOGLE_LOGO", true);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            this.f239302a.mo83170j("QSB_DOODLE_ENABLED", true);
        }
        if (i2 != 0) {
            this.f239302a.mo83171k("NUM_DOODLE_LOOPS", i2);
        }
        if (z2) {
            this.f239302a.mo83170j("IS_DOODLE_SETTING_DISABLED", true);
        }
    }

    /* renamed from: E */
    public final synchronized void mo82179E(long j) {
        this.f239302a.mo83173m("LOCATION_DATA_AGE", j);
    }

    /* renamed from: F */
    public final synchronized void mo82180F(C41642a aVar, int i) {
        if (m143016L(aVar)) {
            this.f239302a.mo83169i("TOTAL_ICING_GLOBAL_QUERY_REQUESTS");
            if (i > 0) {
                this.f239302a.mo83171k("TOTAL_ICING_GLOBAL_QUERY_RESULTS", this.f239302a.mo83161a("TOTAL_ICING_GLOBAL_QUERY_RESULTS") + i);
            }
            this.f239304d.mo82210d((int) (this.f239307g.mo26871c() - ((C88616t) aVar).f239560e));
        }
    }

    /* renamed from: G */
    public final synchronized void mo82181G(long j) {
        this.f239302a.mo83173m("ZERO_PREFIX_RESPONSE_AGE", j);
    }

    /* renamed from: H */
    public final synchronized void mo82182H(int i) {
        if (this.f239302a.mo83161a("SUGGEST_ENTRY_POINT") == 0) {
            this.f239302a.mo83171k("SUGGEST_ENTRY_POINT", i - 1);
        }
    }

    /* renamed from: a */
    public final synchronized int mo82183a() {
        return this.f239302a.mo83161a("PENDING_REQUEST_COUNT");
    }

    /* renamed from: c */
    public final synchronized String mo82184c() {
        return this.f239302a.mo83166f("SESSION_ID");
    }

    /* renamed from: d */
    public final /* synthetic */ void mo82185d(Object obj) {
        this.f239309i = ((C88614r) obj).f239538i;
    }

    /* renamed from: e */
    public final void mo78004e() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo82186f(com.google.android.libraries.searchbox.shared.p3201b.C41642a r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.m143016L(r4)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0038
            com.google.android.apps.gsa.searchbox.c.t r4 = (com.google.android.apps.gsa.searchbox.p6944c.C88616t) r4     // Catch:{ all -> 0x003a }
            com.google.android.apps.gsa.shared.search.Query r4 = r4.f239556a     // Catch:{ all -> 0x003a }
            java.lang.String r4 = r4.mo84352bk()     // Catch:{ all -> 0x003a }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x003a }
            if (r4 != 0) goto L_0x0038
            com.google.android.apps.gsa.shared.an.a.j r4 = r3.f239302a     // Catch:{ all -> 0x003a }
            java.lang.Object r0 = r4.f241828a     // Catch:{ all -> 0x003a }
            java.lang.String r1 = "PENDING_REQUEST_COUNT"
            if (r0 == 0) goto L_0x002d
            monitor-enter(r0)     // Catch:{ all -> 0x003a }
            int r2 = r4.mo83161a(r1)     // Catch:{ all -> 0x002a }
            int r2 = r2 + -1
            r4.mo83171k(r1, r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            monitor-exit(r3)
            return
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4     // Catch:{ all -> 0x003a }
        L_0x002d:
            int r0 = r4.mo83161a(r1)     // Catch:{ all -> 0x003a }
            int r0 = r0 + -1
            r4.mo83171k(r1, r0)     // Catch:{ all -> 0x003a }
            monitor-exit(r3)
            return
        L_0x0038:
            monitor-exit(r3)
            return
        L_0x003a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6944c.p6945a.C88543c.mo82186f(com.google.android.libraries.searchbox.shared.b.a):void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:65|66|67|68) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x05fc */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo82187g(com.google.common.p4552o.amt r17, java.lang.String r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            monitor-enter(r16)
            if (r2 != 0) goto L_0x0009
            monitor-exit(r16)
            return
        L_0x0009:
            boolean r3 = android.text.TextUtils.isEmpty(r18)     // Catch:{ all -> 0x07b0 }
            if (r3 == 0) goto L_0x0025
            com.google.common.f.e r2 = f239301b     // Catch:{ all -> 0x07b0 }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x07b0 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x07b0 }
            java.lang.String r4 = "sb.r.Logging"
            r2.mo56378ag(r3, r4)     // Catch:{ all -> 0x07b0 }
            java.lang.String r3 = "Searchbox client name is empty"
            r4 = 9943(0x26d7, float:1.3933E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)     // Catch:{ all -> 0x07b0 }
            monitor-exit(r16)
            return
        L_0x0025:
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r4 = "GENERATED_RESPONSE_COUNT"
            int r3 = r3.mo83161a(r4)     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r5 = com.google.common.p4552o.apd.f159555aA     // Catch:{ all -> 0x07b0 }
            int r5 = r4.f159610b     // Catch:{ all -> 0x07b0 }
            r6 = 1
            r5 = r5 | r6
            r4.f159610b = r5     // Catch:{ all -> 0x07b0 }
            r4.f159559C = r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r4 = "GENERATED_RESPONSE_IMPRESSION_COUNT"
            int r3 = r3.mo83161a(r4)     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            int r5 = r4.f159610b     // Catch:{ all -> 0x07b0 }
            r5 = r5 | 2
            r4.f159610b = r5     // Catch:{ all -> 0x07b0 }
            r4.f159560D = r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r4 = "CACHE_HIT_COUNT"
            int r3 = r3.mo83161a(r4)     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            int r5 = r4.f159583a     // Catch:{ all -> 0x07b0 }
            r7 = 1073741824(0x40000000, float:2.0)
            r5 = r5 | r7
            r4.f159583a = r5     // Catch:{ all -> 0x07b0 }
            r4.f159558B = r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r4 = "FETCHER_REQUEST_COUNT"
            int r3 = r3.mo83161a(r4)     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            int r5 = r4.f159583a     // Catch:{ all -> 0x07b0 }
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            r5 = r5 | r7
            r4.f159583a = r5     // Catch:{ all -> 0x07b0 }
            r4.f159557A = r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r4 = "CONNECTION_REQUEST_COUNT"
            int r3 = r3.mo83161a(r4)     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            int r5 = r4.f159610b     // Catch:{ all -> 0x07b0 }
            r5 = r5 | 4
            r4.f159610b = r5     // Catch:{ all -> 0x07b0 }
            r4.f159561E = r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r4 = "CONNECTION_REJECTED_REQUEST_COUNT"
            int r3 = r3.mo83161a(r4)     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            int r5 = r4.f159610b     // Catch:{ all -> 0x07b0 }
            r5 = r5 | 8
            r4.f159610b = r5     // Catch:{ all -> 0x07b0 }
            r4.f159562F = r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r4 = "CONNECTION_RESPONSE_COUNT"
            int r3 = r3.mo83161a(r4)     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            int r5 = r4.f159610b     // Catch:{ all -> 0x07b0 }
            r5 = r5 | 16
            r4.f159610b = r5     // Catch:{ all -> 0x07b0 }
            r4.f159563G = r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.searchbox.c.a.d r3 = r1.f239303c     // Catch:{ all -> 0x07b0 }
            int r3 = r3.mo82208b()     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            int r5 = r4.f159610b     // Catch:{ all -> 0x07b0 }
            r5 = r5 | 128(0x80, float:1.794E-43)
            r4.f159610b = r5     // Catch:{ all -> 0x07b0 }
            r4.f159566J = r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.searchbox.c.a.d r3 = r1.f239303c     // Catch:{ all -> 0x07b0 }
            int r3 = r3.mo82207a()     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            int r5 = r4.f159610b     // Catch:{ all -> 0x07b0 }
            r5 = r5 | 64
            r4.f159610b = r5     // Catch:{ all -> 0x07b0 }
            r4.f159565I = r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.searchbox.c.a.d r3 = r1.f239303c     // Catch:{ all -> 0x07b0 }
            java.lang.String r3 = r3.mo82209c()     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            int r5 = r4.f159610b     // Catch:{ all -> 0x07b0 }
            r5 = r5 | 512(0x200, float:7.175E-43)
            r4.f159610b = r5     // Catch:{ all -> 0x07b0 }
            r4.f159568L = r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r4 = "ZERO_PREFIX_ROUND_TRIP_TIME"
            int r3 = r3.mo83161a(r4)     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            int r5 = r4.f159610b     // Catch:{ all -> 0x07b0 }
            r5 = r5 | 256(0x100, float:3.59E-43)
            r4.f159610b = r5     // Catch:{ all -> 0x07b0 }
            r4.f159567K = r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r4 = "CANCELLED_FETCH_SHORT_TIMEOUT_COUNT"
            int r3 = r3.mo83161a(r4)     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            int r5 = r4.f159610b     // Catch:{ all -> 0x07b0 }
            r8 = 32768(0x8000, float:4.5918E-41)
            r5 = r5 | r8
            r4.f159610b = r5     // Catch:{ all -> 0x07b0 }
            r4.f159574R = r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r4 = "CANCELLED_FETCH_MEDIUM_TIMEOUT_COUNT"
            int r3 = r3.mo83161a(r4)     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            int r5 = r4.f159610b     // Catch:{ all -> 0x07b0 }
            r9 = 65536(0x10000, float:9.18355E-41)
            r5 = r5 | r9
            r4.f159610b = r5     // Catch:{ all -> 0x07b0 }
            r4.f159575S = r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r4 = "CANCELLED_FETCH_LONG_TIMEOUT_COUNT"
            int r3 = r3.mo83161a(r4)     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            int r5 = r4.f159610b     // Catch:{ all -> 0x07b0 }
            r10 = 131072(0x20000, float:1.83671E-40)
            r5 = r5 | r10
            r4.f159610b = r5     // Catch:{ all -> 0x07b0 }
            r4.f159576T = r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r4 = "CANCELLED_FETCH_FINAL_TIMEOUT_COUNT"
            int r3 = r3.mo83161a(r4)     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            int r5 = r4.f159610b     // Catch:{ all -> 0x07b0 }
            r11 = 262144(0x40000, float:3.67342E-40)
            r5 = r5 | r11
            r4.f159610b = r5     // Catch:{ all -> 0x07b0 }
            r4.f159577U = r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r4 = "HIGH_CONFIDENCE_ICING_RESULT_COUNT"
            int r3 = r3.mo83161a(r4)     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            int r5 = r4.f159610b     // Catch:{ all -> 0x07b0 }
            r12 = 16777216(0x1000000, float:2.3509887E-38)
            r5 = r5 | r12
            r4.f159610b = r5     // Catch:{ all -> 0x07b0 }
            r4.f159584aa = r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r4 = "TOTAL_WAIT_FOR_HIGH_CONFIDENCE_ICING_RESULT_MSEC"
            int r3 = r3.mo83161a(r4)     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            int r5 = r4.f159610b     // Catch:{ all -> 0x07b0 }
            r12 = 33554432(0x2000000, float:9.403955E-38)
            r5 = r5 | r12
            r4.f159610b = r5     // Catch:{ all -> 0x07b0 }
            r4.f159585ab = r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r4 = "TOTAL_ICING_GLOBAL_QUERY_RESULTS"
            int r3 = r3.mo83161a(r4)     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            int r5 = r4.f159610b     // Catch:{ all -> 0x07b0 }
            r13 = 524288(0x80000, float:7.34684E-40)
            r5 = r5 | r13
            r4.f159610b = r5     // Catch:{ all -> 0x07b0 }
            r4.f159578V = r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r4 = "TOTAL_ICING_GLOBAL_QUERY_REQUESTS"
            int r3 = r3.mo83161a(r4)     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            int r5 = r4.f159610b     // Catch:{ all -> 0x07b0 }
            r14 = 1048576(0x100000, float:1.469368E-39)
            r5 = r5 | r14
            r4.f159610b = r5     // Catch:{ all -> 0x07b0 }
            r4.f159579W = r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.searchbox.c.a.d r3 = r1.f239304d     // Catch:{ all -> 0x07b0 }
            int r3 = r3.mo82207a()     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            int r5 = r4.f159610b     // Catch:{ all -> 0x07b0 }
            r14 = 2097152(0x200000, float:2.938736E-39)
            r5 = r5 | r14
            r4.f159610b = r5     // Catch:{ all -> 0x07b0 }
            r4.f159580X = r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.searchbox.c.a.d r3 = r1.f239304d     // Catch:{ all -> 0x07b0 }
            int r3 = r3.mo82208b()     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            int r5 = r4.f159610b     // Catch:{ all -> 0x07b0 }
            r14 = 4194304(0x400000, float:5.877472E-39)
            r5 = r5 | r14
            r4.f159610b = r5     // Catch:{ all -> 0x07b0 }
            r4.f159581Y = r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.searchbox.c.a.d r3 = r1.f239304d     // Catch:{ all -> 0x07b0 }
            java.lang.String r3 = r3.mo82209c()     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            int r5 = r4.f159610b     // Catch:{ all -> 0x07b0 }
            r15 = 8388608(0x800000, float:1.17549435E-38)
            r5 = r5 | r15
            r4.f159610b = r5     // Catch:{ all -> 0x07b0 }
            r4.f159582Z = r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r4 = "ZERO_PREFIX_ENABLED"
            boolean r3 = r3.mo83178r(r4)     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            int r5 = r4.f159583a     // Catch:{ all -> 0x07b0 }
            r5 = r5 | 8192(0x2000, float:1.14794E-41)
            r4.f159583a = r5     // Catch:{ all -> 0x07b0 }
            r4.f159623o = r3     // Catch:{ all -> 0x07b0 }
            com.google.common.o.ant r3 = com.google.common.p4552o.ant.f159403h     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ all -> 0x07b0 }
            com.google.common.o.ans r3 = (com.google.common.p4552o.ans) r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r4 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r5 = "NUM_SUPPRESS_BY_TYPE_REQUESTS"
            int r4 = r4.mo83161a(r5)     // Catch:{ all -> 0x07b0 }
            r3.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.ant r5 = (com.google.common.p4552o.ant) r5     // Catch:{ all -> 0x07b0 }
            int r12 = r5.f159405a     // Catch:{ all -> 0x07b0 }
            r12 = r12 | r6
            r5.f159405a = r12     // Catch:{ all -> 0x07b0 }
            r5.f159406b = r4     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r4 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r5 = "NUM_SUPPRESS_BY_TYPE_FULFILLED"
            int r4 = r4.mo83161a(r5)     // Catch:{ all -> 0x07b0 }
            r3.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.ant r5 = (com.google.common.p4552o.ant) r5     // Catch:{ all -> 0x07b0 }
            int r12 = r5.f159405a     // Catch:{ all -> 0x07b0 }
            r12 = r12 | 2
            r5.f159405a = r12     // Catch:{ all -> 0x07b0 }
            r5.f159407c = r4     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r4 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r5 = "NUM_SUPPRESSED_BY_TYPE"
            int r4 = r4.mo83161a(r5)     // Catch:{ all -> 0x07b0 }
            r3.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.ant r5 = (com.google.common.p4552o.ant) r5     // Catch:{ all -> 0x07b0 }
            int r12 = r5.f159405a     // Catch:{ all -> 0x07b0 }
            r12 = r12 | 4
            r5.f159405a = r12     // Catch:{ all -> 0x07b0 }
            r5.f159408d = r4     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r4 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r5 = "NUM_SUPPRESS_BY_SERVER_ON_DEVICE_DEDUPING_REQUESTS"
            int r4 = r4.mo83161a(r5)     // Catch:{ all -> 0x07b0 }
            r3.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.ant r5 = (com.google.common.p4552o.ant) r5     // Catch:{ all -> 0x07b0 }
            int r12 = r5.f159405a     // Catch:{ all -> 0x07b0 }
            r12 = r12 | 8
            r5.f159405a = r12     // Catch:{ all -> 0x07b0 }
            r5.f159409e = r4     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r4 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r5 = "NUM_SUPPRESS_BY_SERVER_ON_DEVICE_DEDUPING_FULFILLED"
            int r4 = r4.mo83161a(r5)     // Catch:{ all -> 0x07b0 }
            r3.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.ant r5 = (com.google.common.p4552o.ant) r5     // Catch:{ all -> 0x07b0 }
            int r12 = r5.f159405a     // Catch:{ all -> 0x07b0 }
            r12 = r12 | 16
            r5.f159405a = r12     // Catch:{ all -> 0x07b0 }
            r5.f159410f = r4     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r4 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r5 = "NUM_SUPPRESSED_BY_SERVER_ON_DEVICE_DEDUPING"
            int r4 = r4.mo83161a(r5)     // Catch:{ all -> 0x07b0 }
            r3.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.ant r5 = (com.google.common.p4552o.ant) r5     // Catch:{ all -> 0x07b0 }
            int r12 = r5.f159405a     // Catch:{ all -> 0x07b0 }
            r12 = r12 | 32
            r5.f159405a = r12     // Catch:{ all -> 0x07b0 }
            r5.f159411g = r4     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r3 = r3.build()     // Catch:{ all -> 0x07b0 }
            com.google.common.o.ant r3 = (com.google.common.p4552o.ant) r3     // Catch:{ all -> 0x07b0 }
            r3.getClass()     // Catch:{ all -> 0x07b0 }
            r4.f159592ai = r3     // Catch:{ all -> 0x07b0 }
            int r3 = r4.f159611c     // Catch:{ all -> 0x07b0 }
            r3 = r3 | 128(0x80, float:1.794E-43)
            r4.f159611c = r3     // Catch:{ all -> 0x07b0 }
            com.google.common.o.aob r3 = com.google.common.p4552o.aob.f159424i     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ all -> 0x07b0 }
            com.google.common.o.aoa r3 = (com.google.common.p4552o.aoa) r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.searchbox.c.a.d r4 = r1.f239306f     // Catch:{ all -> 0x07b0 }
            int r4 = r4.mo82208b()     // Catch:{ all -> 0x07b0 }
            r3.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.aob r5 = (com.google.common.p4552o.aob) r5     // Catch:{ all -> 0x07b0 }
            int r12 = r5.f159426a     // Catch:{ all -> 0x07b0 }
            r12 = r12 | 4
            r5.f159426a = r12     // Catch:{ all -> 0x07b0 }
            r5.f159429d = r4     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.searchbox.c.a.d r4 = r1.f239306f     // Catch:{ all -> 0x07b0 }
            int r4 = r4.mo82207a()     // Catch:{ all -> 0x07b0 }
            r3.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.aob r5 = (com.google.common.p4552o.aob) r5     // Catch:{ all -> 0x07b0 }
            int r12 = r5.f159426a     // Catch:{ all -> 0x07b0 }
            r12 = r12 | 2
            r5.f159426a = r12     // Catch:{ all -> 0x07b0 }
            r5.f159428c = r4     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.searchbox.c.a.d r4 = r1.f239306f     // Catch:{ all -> 0x07b0 }
            java.lang.String r4 = r4.mo82209c()     // Catch:{ all -> 0x07b0 }
            r3.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.aob r5 = (com.google.common.p4552o.aob) r5     // Catch:{ all -> 0x07b0 }
            int r12 = r5.f159426a     // Catch:{ all -> 0x07b0 }
            r12 = r12 | 8
            r5.f159426a = r12     // Catch:{ all -> 0x07b0 }
            r5.f159430e = r4     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r3 = r3.build()     // Catch:{ all -> 0x07b0 }
            com.google.common.o.aob r3 = (com.google.common.p4552o.aob) r3     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            r3.getClass()     // Catch:{ all -> 0x07b0 }
            r4.f159609az = r3     // Catch:{ all -> 0x07b0 }
            int r3 = r4.f159611c     // Catch:{ all -> 0x07b0 }
            r3 = r3 | r15
            r4.f159611c = r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r4 = "SESSION_ID"
            java.lang.String r3 = r3.mo83166f(r4)     // Catch:{ all -> 0x07b0 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x07b0 }
            if (r4 != 0) goto L_0x0361
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            r3.getClass()     // Catch:{ all -> 0x07b0 }
            int r5 = r4.f159611c     // Catch:{ all -> 0x07b0 }
            r5 = r5 | 4
            r4.f159611c = r5     // Catch:{ all -> 0x07b0 }
            r4.f159589af = r3     // Catch:{ all -> 0x07b0 }
        L_0x0361:
            com.google.android.apps.gsa.searchbox.c.a.d r3 = r1.f239305e     // Catch:{ all -> 0x07b0 }
            int r3 = r3.mo82208b()     // Catch:{ all -> 0x07b0 }
            r4 = 0
            if (r3 == 0) goto L_0x043f
            com.google.common.o.aob r3 = com.google.common.p4552o.aob.f159424i     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ all -> 0x07b0 }
            com.google.common.o.aoa r3 = (com.google.common.p4552o.aoa) r3     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.searchbox.c.a.d r5 = r1.f239305e     // Catch:{ all -> 0x07b0 }
            int r5 = r5.mo82208b()     // Catch:{ all -> 0x07b0 }
            r3.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r12 = r3.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.aob r12 = (com.google.common.p4552o.aob) r12     // Catch:{ all -> 0x07b0 }
            int r15 = r12.f159426a     // Catch:{ all -> 0x07b0 }
            r15 = r15 | 4
            r12.f159426a = r15     // Catch:{ all -> 0x07b0 }
            r12.f159429d = r5     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.searchbox.c.a.d r5 = r1.f239305e     // Catch:{ all -> 0x07b0 }
            int r5 = r5.mo82207a()     // Catch:{ all -> 0x07b0 }
            r3.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r12 = r3.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.aob r12 = (com.google.common.p4552o.aob) r12     // Catch:{ all -> 0x07b0 }
            int r15 = r12.f159426a     // Catch:{ all -> 0x07b0 }
            r15 = r15 | 2
            r12.f159426a = r15     // Catch:{ all -> 0x07b0 }
            r12.f159428c = r5     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.searchbox.c.a.d r5 = r1.f239305e     // Catch:{ all -> 0x07b0 }
            java.lang.String r5 = r5.mo82209c()     // Catch:{ all -> 0x07b0 }
            r3.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r12 = r3.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.aob r12 = (com.google.common.p4552o.aob) r12     // Catch:{ all -> 0x07b0 }
            int r15 = r12.f159426a     // Catch:{ all -> 0x07b0 }
            r15 = r15 | 8
            r12.f159426a = r15     // Catch:{ all -> 0x07b0 }
            r12.f159430e = r5     // Catch:{ all -> 0x07b0 }
            java.util.Map r5 = r1.f239312l     // Catch:{ all -> 0x07b0 }
            com.google.android.libraries.searchbox.root.a.a r12 = com.google.android.libraries.searchbox.root.p3199a.C41627a.SUCCESS     // Catch:{ all -> 0x07b0 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x07b0 }
            java.lang.Object r5 = p3186j$.util.Map.EL.getOrDefault(r5, r12, r15)     // Catch:{ all -> 0x07b0 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x07b0 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x07b0 }
            r3.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r12 = r3.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.aob r12 = (com.google.common.p4552o.aob) r12     // Catch:{ all -> 0x07b0 }
            int r13 = r12.f159426a     // Catch:{ all -> 0x07b0 }
            r13 = r13 | 16
            r12.f159426a = r13     // Catch:{ all -> 0x07b0 }
            r12.f159431f = r5     // Catch:{ all -> 0x07b0 }
            java.util.Map r5 = r1.f239312l     // Catch:{ all -> 0x07b0 }
            com.google.android.libraries.searchbox.root.a.a r12 = com.google.android.libraries.searchbox.root.p3199a.C41627a.FAILURE     // Catch:{ all -> 0x07b0 }
            java.lang.Object r5 = p3186j$.util.Map.EL.getOrDefault(r5, r12, r15)     // Catch:{ all -> 0x07b0 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x07b0 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x07b0 }
            r3.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r12 = r3.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.aob r12 = (com.google.common.p4552o.aob) r12     // Catch:{ all -> 0x07b0 }
            int r13 = r12.f159426a     // Catch:{ all -> 0x07b0 }
            r13 = r13 | 32
            r12.f159426a = r13     // Catch:{ all -> 0x07b0 }
            r12.f159432g = r5     // Catch:{ all -> 0x07b0 }
            java.util.Map r5 = r1.f239312l     // Catch:{ all -> 0x07b0 }
            com.google.android.libraries.searchbox.root.a.a r12 = com.google.android.libraries.searchbox.root.p3199a.C41627a.CANCELLED     // Catch:{ all -> 0x07b0 }
            java.lang.Object r5 = p3186j$.util.Map.EL.getOrDefault(r5, r12, r15)     // Catch:{ all -> 0x07b0 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x07b0 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x07b0 }
            r3.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r12 = r3.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.aob r12 = (com.google.common.p4552o.aob) r12     // Catch:{ all -> 0x07b0 }
            int r13 = r12.f159426a     // Catch:{ all -> 0x07b0 }
            r13 = r13 | r6
            r12.f159426a = r13     // Catch:{ all -> 0x07b0 }
            r12.f159427b = r5     // Catch:{ all -> 0x07b0 }
            java.util.Map r5 = r1.f239312l     // Catch:{ all -> 0x07b0 }
            com.google.android.libraries.searchbox.root.a.a r12 = com.google.android.libraries.searchbox.root.p3199a.C41627a.TIMEOUT     // Catch:{ all -> 0x07b0 }
            java.lang.Object r5 = p3186j$.util.Map.EL.getOrDefault(r5, r12, r15)     // Catch:{ all -> 0x07b0 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x07b0 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x07b0 }
            r3.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r12 = r3.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.aob r12 = (com.google.common.p4552o.aob) r12     // Catch:{ all -> 0x07b0 }
            int r13 = r12.f159426a     // Catch:{ all -> 0x07b0 }
            r13 = r13 | 64
            r12.f159426a = r13     // Catch:{ all -> 0x07b0 }
            r12.f159433h = r5     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r3 = r3.build()     // Catch:{ all -> 0x07b0 }
            com.google.common.o.aob r3 = (com.google.common.p4552o.aob) r3     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r5 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r5 = (com.google.common.p4552o.apd) r5     // Catch:{ all -> 0x07b0 }
            r3.getClass()     // Catch:{ all -> 0x07b0 }
            r5.f159608ay = r3     // Catch:{ all -> 0x07b0 }
            int r3 = r5.f159611c     // Catch:{ all -> 0x07b0 }
            r3 = r3 | r14
            r5.f159611c = r3     // Catch:{ all -> 0x07b0 }
        L_0x043f:
            com.google.android.apps.gsa.search.core.preferences.r r3 = r1.f239310j     // Catch:{ all -> 0x07b0 }
            java.lang.String r5 = "gsa_server_response_timestamp"
            r12 = -1
            long r14 = r3.getLong(r5, r12)     // Catch:{ all -> 0x07b0 }
            int r3 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x045b
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r3 = (com.google.common.p4552o.apd) r3     // Catch:{ all -> 0x07b0 }
            int r5 = r3.f159611c     // Catch:{ all -> 0x07b0 }
            r5 = r5 | r8
            r3.f159611c = r5     // Catch:{ all -> 0x07b0 }
            r3.f159601ar = r14     // Catch:{ all -> 0x07b0 }
        L_0x045b:
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r5 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r5 = (com.google.common.p4552o.apd) r5     // Catch:{ all -> 0x07b0 }
            java.lang.String r5 = r5.f159618j     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.searchbox.shared.p6959a.C88689a.m143518b(r3, r5)     // Catch:{ all -> 0x07b0 }
            java.lang.String r5 = "CLIENT_EXPERIMENT_TRIGGERED_FLAGS"
            java.lang.String r8 = "CLIENT_EXPERIMENT_TRIGGERED_FLAGS"
            long r12 = r3.mo83162b(r8)     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r8 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r8 = (com.google.common.p4552o.apd) r8     // Catch:{ all -> 0x07b0 }
            long r14 = r8.f159588ae     // Catch:{ all -> 0x07b0 }
            long r12 = r12 | r14
            r3.mo83173m(r5, r12)     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.searchbox.shared.p6959a.C88689a.m143517a(r3, r2)     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.search.core.preferences.r r3 = r1.f239310j     // Catch:{ all -> 0x07b0 }
            java.lang.String r5 = "launcher_quickstep_enabled"
            boolean r3 = r3.getBoolean(r5, r4)     // Catch:{ all -> 0x07b0 }
            if (r3 == 0) goto L_0x0495
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r3 = (com.google.common.p4552o.apd) r3     // Catch:{ all -> 0x07b0 }
            int r5 = r3.f159611c     // Catch:{ all -> 0x07b0 }
            r5 = r5 | r9
            r3.f159611c = r5     // Catch:{ all -> 0x07b0 }
            r3.f159604au = r6     // Catch:{ all -> 0x07b0 }
        L_0x0495:
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r3 = (com.google.common.p4552o.apd) r3     // Catch:{ all -> 0x07b0 }
            int r5 = r3.f159611c     // Catch:{ all -> 0x07b0 }
            r5 = r5 & 8192(0x2000, float:1.14794E-41)
            if (r5 == 0) goto L_0x04ac
            com.google.common.o.amv r3 = r3.f159599ap     // Catch:{ all -> 0x07b0 }
            if (r3 != 0) goto L_0x04a5
            com.google.common.o.amv r3 = com.google.common.p4552o.amv.f159247f     // Catch:{ all -> 0x07b0 }
        L_0x04a5:
            com.google.protobuf.bn r3 = r3.toBuilder()     // Catch:{ all -> 0x07b0 }
            com.google.common.o.amu r3 = (com.google.common.p4552o.amu) r3     // Catch:{ all -> 0x07b0 }
            goto L_0x04b4
        L_0x04ac:
            com.google.common.o.amv r3 = com.google.common.p4552o.amv.f159247f     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ all -> 0x07b0 }
            com.google.common.o.amu r3 = (com.google.common.p4552o.amu) r3     // Catch:{ all -> 0x07b0 }
        L_0x04b4:
            com.google.android.apps.gsa.shared.an.a.j r5 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r8 = "TAP_TARGET_GOOGLE_LOGO"
            boolean r5 = r5.mo83178r(r8)     // Catch:{ all -> 0x07b0 }
            if (r5 == 0) goto L_0x04cc
            r3.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.amv r5 = (com.google.common.p4552o.amv) r5     // Catch:{ all -> 0x07b0 }
            int r8 = r5.f159249a     // Catch:{ all -> 0x07b0 }
            r8 = r8 | r6
            r5.f159249a = r8     // Catch:{ all -> 0x07b0 }
            r5.f159250b = r6     // Catch:{ all -> 0x07b0 }
        L_0x04cc:
            com.google.android.apps.gsa.shared.an.a.j r5 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r8 = "QSB_DOODLE_ENABLED"
            boolean r5 = r5.mo83178r(r8)     // Catch:{ all -> 0x07b0 }
            if (r5 == 0) goto L_0x04e5
            r3.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.amv r5 = (com.google.common.p4552o.amv) r5     // Catch:{ all -> 0x07b0 }
            int r8 = r5.f159249a     // Catch:{ all -> 0x07b0 }
            r8 = r8 | 2
            r5.f159249a = r8     // Catch:{ all -> 0x07b0 }
            r5.f159251c = r6     // Catch:{ all -> 0x07b0 }
        L_0x04e5:
            com.google.android.apps.gsa.shared.an.a.j r5 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r8 = "NUM_DOODLE_LOOPS"
            int r5 = r5.mo83161a(r8)     // Catch:{ all -> 0x07b0 }
            if (r5 == 0) goto L_0x04fe
            r3.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r8 = r3.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.amv r8 = (com.google.common.p4552o.amv) r8     // Catch:{ all -> 0x07b0 }
            int r9 = r8.f159249a     // Catch:{ all -> 0x07b0 }
            r9 = r9 | 4
            r8.f159249a = r9     // Catch:{ all -> 0x07b0 }
            r8.f159252d = r5     // Catch:{ all -> 0x07b0 }
        L_0x04fe:
            com.google.android.apps.gsa.shared.an.a.j r5 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r8 = "IS_DOODLE_SETTING_DISABLED"
            boolean r5 = r5.mo83178r(r8)     // Catch:{ all -> 0x07b0 }
            if (r5 == 0) goto L_0x0517
            r3.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.amv r5 = (com.google.common.p4552o.amv) r5     // Catch:{ all -> 0x07b0 }
            int r8 = r5.f159249a     // Catch:{ all -> 0x07b0 }
            r8 = r8 | 8
            r5.f159249a = r8     // Catch:{ all -> 0x07b0 }
            r5.f159253e = r6     // Catch:{ all -> 0x07b0 }
        L_0x0517:
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r5 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r5 = (com.google.common.p4552o.apd) r5     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r3 = r3.build()     // Catch:{ all -> 0x07b0 }
            com.google.common.o.amv r3 = (com.google.common.p4552o.amv) r3     // Catch:{ all -> 0x07b0 }
            r3.getClass()     // Catch:{ all -> 0x07b0 }
            r5.f159599ap = r3     // Catch:{ all -> 0x07b0 }
            int r3 = r5.f159611c     // Catch:{ all -> 0x07b0 }
            r3 = r3 | 8192(0x2000, float:1.14794E-41)
            r5.f159611c = r3     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r3 = (com.google.common.p4552o.apd) r3     // Catch:{ all -> 0x07b0 }
            r18.getClass()     // Catch:{ all -> 0x07b0 }
            int r5 = r3.f159583a     // Catch:{ all -> 0x07b0 }
            r5 = r5 | 16
            r3.f159583a = r5     // Catch:{ all -> 0x07b0 }
            r5 = r18
            r3.f159613e = r5     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r5 = "ZERO_PREFIX_RESPONSE_AGE"
            long r8 = r3.mo83162b(r5)     // Catch:{ all -> 0x07b0 }
            r12 = 0
            int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r3 == 0) goto L_0x0595
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r5 = "ZERO_PREFIX_RESPONSE_AGE"
            long r8 = r3.mo83162b(r5)     // Catch:{ all -> 0x07b0 }
            int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x0573
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r3 > 0) goto L_0x0573
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r3 = (com.google.common.p4552o.apd) r3     // Catch:{ all -> 0x07b0 }
            int r5 = r3.f159583a     // Catch:{ all -> 0x07b0 }
            r5 = r5 | r10
            r3.f159583a = r5     // Catch:{ all -> 0x07b0 }
            int r5 = (int) r8     // Catch:{ all -> 0x07b0 }
            r3.f159627s = r5     // Catch:{ all -> 0x07b0 }
        L_0x0573:
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r5 = "LOCATION_DATA_AGE"
            long r8 = r3.mo83162b(r5)     // Catch:{ all -> 0x07b0 }
            int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x0595
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r3 > 0) goto L_0x0595
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r3 = (com.google.common.p4552o.apd) r3     // Catch:{ all -> 0x07b0 }
            int r5 = r3.f159583a     // Catch:{ all -> 0x07b0 }
            r5 = r5 | r11
            r3.f159583a = r5     // Catch:{ all -> 0x07b0 }
            int r5 = (int) r8     // Catch:{ all -> 0x07b0 }
            r3.f159628t = r5     // Catch:{ all -> 0x07b0 }
        L_0x0595:
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r3 = (com.google.common.p4552o.apd) r3     // Catch:{ all -> 0x07b0 }
            int r5 = r3.f159610b     // Catch:{ all -> 0x07b0 }
            r5 = r5 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x05b8
            int r5 = r3.f159583a     // Catch:{ all -> 0x07b0 }
            r5 = r5 & r7
            if (r5 == 0) goto L_0x05b8
            int r5 = r3.f159557A     // Catch:{ all -> 0x07b0 }
            int r3 = r3.f159570N     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r7 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r7 = (com.google.common.p4552o.apd) r7     // Catch:{ all -> 0x07b0 }
            int r8 = r7.f159610b     // Catch:{ all -> 0x07b0 }
            r8 = r8 | 1024(0x400, float:1.435E-42)
            r7.f159610b = r8     // Catch:{ all -> 0x07b0 }
            int r5 = r5 - r3
            r7.f159569M = r5     // Catch:{ all -> 0x07b0 }
        L_0x05b8:
            boolean r3 = r16.m143015K()     // Catch:{ all -> 0x07b0 }
            if (r3 == 0) goto L_0x05ce
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r3 = (com.google.common.p4552o.apd) r3     // Catch:{ all -> 0x07b0 }
            int r5 = r3.f159583a     // Catch:{ all -> 0x07b0 }
            r7 = 4194304(0x400000, float:5.877472E-39)
            r5 = r5 | r7
            r3.f159583a = r5     // Catch:{ all -> 0x07b0 }
            r3.f159629u = r6     // Catch:{ all -> 0x07b0 }
        L_0x05ce:
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r5 = "VALID_WINDOW_SUPPRESSION"
            android.os.Parcelable r3 = r3.mo83164d(r5)     // Catch:{ all -> 0x07b0 }
            if (r3 == 0) goto L_0x05fe
            com.google.android.libraries.gsa.monet.shared.ProtoParcelable r3 = (com.google.android.libraries.gsa.monet.shared.ProtoParcelable) r3     // Catch:{ ct -> 0x05fc }
            byte[] r3 = r3.mo28513b()     // Catch:{ ct -> 0x05fc }
            com.google.protobuf.ba r5 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x05fc }
            com.google.common.o.aoz r7 = com.google.common.p4552o.aoz.f159538d     // Catch:{ ct -> 0x05fc }
            com.google.protobuf.bv r3 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r7, (byte[]) r3, (com.google.protobuf.C62921ba) r5)     // Catch:{ ct -> 0x05fc }
            com.google.common.o.aoz r3 = (com.google.common.p4552o.aoz) r3     // Catch:{ ct -> 0x05fc }
            r17.copyOnWrite()     // Catch:{ ct -> 0x05fc }
            com.google.protobuf.bv r5 = r2.instance     // Catch:{ ct -> 0x05fc }
            com.google.common.o.apd r5 = (com.google.common.p4552o.apd) r5     // Catch:{ ct -> 0x05fc }
            r3.getClass()     // Catch:{ ct -> 0x05fc }
            r5.f159605av = r3     // Catch:{ ct -> 0x05fc }
            int r3 = r5.f159611c     // Catch:{ ct -> 0x05fc }
            r3 = r3 | r10
            r5.f159611c = r3     // Catch:{ ct -> 0x05fc }
            goto L_0x05fe
        L_0x05fc:
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x07b0 }
        L_0x05fe:
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.lang.String r5 = "SUGGEST_ENTRY_POINT"
            int r3 = r3.mo83161a(r5)     // Catch:{ all -> 0x07b0 }
            if (r3 == 0) goto L_0x0637
            int r3 = com.google.common.p4552o.aol.m92445a(r3)     // Catch:{ all -> 0x07b0 }
            if (r3 == 0) goto L_0x0621
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r5 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r5 = (com.google.common.p4552o.apd) r5     // Catch:{ all -> 0x07b0 }
            int r3 = r3 + -1
            r5.f159606aw = r3     // Catch:{ all -> 0x07b0 }
            int r3 = r5.f159611c     // Catch:{ all -> 0x07b0 }
            r7 = 524288(0x80000, float:7.34684E-40)
            r3 = r3 | r7
            r5.f159611c = r3     // Catch:{ all -> 0x07b0 }
            goto L_0x064c
        L_0x0621:
            dagger.a r3 = r1.f239311k     // Catch:{ all -> 0x07b0 }
            java.lang.Object r3 = r3.mo27525b()     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.logger.f r3 = (com.google.android.apps.gsa.shared.logger.C89911f) r3     // Catch:{ all -> 0x07b0 }
            r5 = 173261541(0xa53c2e5, float:1.0195936E-32)
            r7 = 29
            r8 = 0
            com.google.android.apps.gsa.shared.logger.e r3 = r3.mo83755a(r8, r5, r7)     // Catch:{ all -> 0x07b0 }
            r3.mo83721a()     // Catch:{ all -> 0x07b0 }
            goto L_0x064c
        L_0x0637:
            dagger.a r3 = r1.f239311k     // Catch:{ all -> 0x07b0 }
            java.lang.Object r3 = r3.mo27525b()     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.logger.f r3 = (com.google.android.apps.gsa.shared.logger.C89911f) r3     // Catch:{ all -> 0x07b0 }
            r5 = 173150221(0xa52100d, float:1.0114151E-32)
            r7 = 29
            r8 = 0
            com.google.android.apps.gsa.shared.logger.e r3 = r3.mo83755a(r8, r5, r7)     // Catch:{ all -> 0x07b0 }
            r3.mo83721a()     // Catch:{ all -> 0x07b0 }
        L_0x064c:
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r3 = (com.google.common.p4552o.apd) r3     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.cq r3 = r3.f159587ad     // Catch:{ all -> 0x07b0 }
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)     // Catch:{ all -> 0x07b0 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x07b0 }
            if (r3 != 0) goto L_0x06d4
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r3 = (com.google.common.p4552o.apd) r3     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.cq r3 = r3.f159587ad     // Catch:{ all -> 0x07b0 }
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)     // Catch:{ all -> 0x07b0 }
            com.google.common.o.anf[] r5 = new com.google.common.p4552o.anf[r4]     // Catch:{ all -> 0x07b0 }
            java.lang.Object[] r3 = r3.toArray(r5)     // Catch:{ all -> 0x07b0 }
            com.google.common.o.anf[] r3 = (com.google.common.p4552o.anf[]) r3     // Catch:{ all -> 0x07b0 }
            com.google.android.libraries.searchbox.shared.a.a r5 = new com.google.android.libraries.searchbox.shared.a.a     // Catch:{ all -> 0x07b0 }
            r5.<init>()     // Catch:{ all -> 0x07b0 }
            int r7 = r3.length     // Catch:{ all -> 0x07b0 }
        L_0x0674:
            if (r4 >= r7) goto L_0x06d9
            r8 = r3[r4]     // Catch:{ all -> 0x07b0 }
            int r9 = r8.f159357a     // Catch:{ all -> 0x07b0 }
            r10 = r9 & 1
            if (r10 == 0) goto L_0x06a6
            r10 = r9 & 8
            if (r10 == 0) goto L_0x0692
            int r9 = r8.f159358b     // Catch:{ all -> 0x07b0 }
            com.google.common.o.ane r9 = com.google.common.p4552o.ane.m92439a(r9)     // Catch:{ all -> 0x07b0 }
            if (r9 != 0) goto L_0x068c
            com.google.common.o.ane r9 = com.google.common.p4552o.ane.QUERY_BUILDER_CHIPS_TAP_COUNT     // Catch:{ all -> 0x07b0 }
        L_0x068c:
            int r8 = r8.f159361e     // Catch:{ all -> 0x07b0 }
            r5.mo44227b(r9, r8)     // Catch:{ all -> 0x07b0 }
            goto L_0x06d1
        L_0x0692:
            r9 = r9 & 4
            if (r9 == 0) goto L_0x06d1
            int r9 = r8.f159358b     // Catch:{ all -> 0x07b0 }
            com.google.common.o.ane r9 = com.google.common.p4552o.ane.m92439a(r9)     // Catch:{ all -> 0x07b0 }
            if (r9 != 0) goto L_0x06a0
            com.google.common.o.ane r9 = com.google.common.p4552o.ane.QUERY_BUILDER_CHIPS_TAP_COUNT     // Catch:{ all -> 0x07b0 }
        L_0x06a0:
            java.lang.String r8 = r8.f159360d     // Catch:{ all -> 0x07b0 }
            r5.mo44228c(r9, r8)     // Catch:{ all -> 0x07b0 }
            goto L_0x06d1
        L_0x06a6:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x06d1
            r10 = r9 & 8
            if (r10 == 0) goto L_0x06c0
            int r9 = r8.f159359c     // Catch:{ all -> 0x07b0 }
            int r8 = r8.f159361e     // Catch:{ all -> 0x07b0 }
            java.util.Map r10 = r5.f108852a     // Catch:{ all -> 0x07b0 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x07b0 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x07b0 }
            r10.put(r9, r8)     // Catch:{ all -> 0x07b0 }
            goto L_0x06d1
        L_0x06c0:
            r9 = r9 & 4
            if (r9 == 0) goto L_0x06d1
            int r9 = r8.f159359c     // Catch:{ all -> 0x07b0 }
            java.lang.String r8 = r8.f159360d     // Catch:{ all -> 0x07b0 }
            java.util.Map r10 = r5.f108853b     // Catch:{ all -> 0x07b0 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x07b0 }
            r10.put(r9, r8)     // Catch:{ all -> 0x07b0 }
        L_0x06d1:
            int r4 = r4 + 1
            goto L_0x0674
        L_0x06d4:
            com.google.android.libraries.searchbox.shared.a.a r5 = new com.google.android.libraries.searchbox.shared.a.a     // Catch:{ all -> 0x07b0 }
            r5.<init>()     // Catch:{ all -> 0x07b0 }
        L_0x06d9:
            java.util.List r3 = r1.f239309i     // Catch:{ all -> 0x07b0 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x07b0 }
        L_0x06df:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x07b0 }
            if (r4 == 0) goto L_0x06ef
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x07b0 }
            com.google.android.libraries.searchbox.shared.a.b r4 = (com.google.android.libraries.searchbox.shared.p3200a.C41641b) r4     // Catch:{ all -> 0x07b0 }
            r4.mo44232l(r5)     // Catch:{ all -> 0x07b0 }
            goto L_0x06df
        L_0x06ef:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x07b0 }
            com.google.common.o.anf[] r4 = r5.mo44230e()     // Catch:{ all -> 0x07b0 }
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ all -> 0x07b0 }
            r3.<init>(r4)     // Catch:{ all -> 0x07b0 }
            com.google.at.h.d.a.at r4 = r16.m143013I()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.cq r5 = r4.f142375o     // Catch:{ all -> 0x07b0 }
            r3.addAll(r5)     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.search.core.i.t r5 = r1.f239308h     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90085ej.f250186bJ     // Catch:{ all -> 0x07b0 }
            boolean r5 = r5.mo79746e(r7)     // Catch:{ all -> 0x07b0 }
            if (r5 != 0) goto L_0x0714
            j$.util.Optional r5 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x07b0 }
            goto L_0x0750
        L_0x0714:
            com.google.android.apps.gsa.search.core.preferences.r r5 = r1.f239310j     // Catch:{ all -> 0x07b0 }
            java.lang.String r7 = "suggest_trends_enabled"
            boolean r5 = r5.getBoolean(r7, r6)     // Catch:{ all -> 0x07b0 }
            com.google.common.o.anf r7 = com.google.common.p4552o.anf.f159355f     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ all -> 0x07b0 }
            com.google.common.o.anc r7 = (com.google.common.p4552o.anc) r7     // Catch:{ all -> 0x07b0 }
            com.google.common.o.ane r8 = com.google.common.p4552o.ane.TRENDS_DISABLED     // Catch:{ all -> 0x07b0 }
            r7.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r9 = r7.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.anf r9 = (com.google.common.p4552o.anf) r9     // Catch:{ all -> 0x07b0 }
            int r8 = r8.f159354aE     // Catch:{ all -> 0x07b0 }
            r9.f159358b = r8     // Catch:{ all -> 0x07b0 }
            int r8 = r9.f159357a     // Catch:{ all -> 0x07b0 }
            r8 = r8 | r6
            r9.f159357a = r8     // Catch:{ all -> 0x07b0 }
            r7.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r8 = r7.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.anf r8 = (com.google.common.p4552o.anf) r8     // Catch:{ all -> 0x07b0 }
            int r9 = r8.f159357a     // Catch:{ all -> 0x07b0 }
            r9 = r9 | 8
            r8.f159357a = r9     // Catch:{ all -> 0x07b0 }
            r5 = r5 ^ r6
            r8.f159361e = r5     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r5 = r7.build()     // Catch:{ all -> 0x07b0 }
            com.google.common.o.anf r5 = (com.google.common.p4552o.anf) r5     // Catch:{ all -> 0x07b0 }
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r5)     // Catch:{ all -> 0x07b0 }
        L_0x0750:
            p3186j$.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x07b0 }
            com.google.android.apps.gsa.searchbox.c.a.b r6 = new com.google.android.apps.gsa.searchbox.c.a.b     // Catch:{ all -> 0x07b0 }
            r6.<init>(r3)     // Catch:{ all -> 0x07b0 }
            r5.ifPresent(r6)     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r5 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r5 = (com.google.common.p4552o.apd) r5     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.cq r6 = com.google.common.p4552o.apd.emptyProtobufList()     // Catch:{ all -> 0x07b0 }
            r5.f159587ad = r6     // Catch:{ all -> 0x07b0 }
            r2.mo57025a(r3)     // Catch:{ all -> 0x07b0 }
            int r3 = r4.f142361a     // Catch:{ all -> 0x07b0 }
            r5 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r3 & r5
            if (r3 == 0) goto L_0x0783
            long r3 = r4.f142373m     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r5 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r5 = (com.google.common.p4552o.apd) r5     // Catch:{ all -> 0x07b0 }
            int r6 = r5.f159611c     // Catch:{ all -> 0x07b0 }
            r6 = r6 | 2048(0x800, float:2.87E-42)
            r5.f159611c = r6     // Catch:{ all -> 0x07b0 }
            r5.f159596am = r3     // Catch:{ all -> 0x07b0 }
        L_0x0783:
            com.google.android.apps.gsa.shared.an.a.j r3 = r1.f239302a     // Catch:{ all -> 0x07b0 }
            java.util.ArrayList r3 = r3.mo83179s()     // Catch:{ all -> 0x07b0 }
            r17.copyOnWrite()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x07b0 }
            com.google.common.o.apd r4 = (com.google.common.p4552o.apd) r4     // Catch:{ all -> 0x07b0 }
            r4.mo57033c()     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.ck r4 = r4.f159597an     // Catch:{ all -> 0x07b0 }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r3, (java.util.List) r4)     // Catch:{ all -> 0x07b0 }
            java.util.List r3 = r1.f239309i     // Catch:{ all -> 0x07b0 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x07b0 }
        L_0x079e:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x07b0 }
            if (r4 == 0) goto L_0x07ae
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x07b0 }
            com.google.android.libraries.searchbox.shared.a.b r4 = (com.google.android.libraries.searchbox.shared.p3200a.C41641b) r4     // Catch:{ all -> 0x07b0 }
            r4.mo44231f(r2)     // Catch:{ all -> 0x07b0 }
            goto L_0x079e
        L_0x07ae:
            monitor-exit(r16)
            return
        L_0x07b0:
            r0 = move-exception
            r2 = r0
            monitor-exit(r16)
            goto L_0x07b5
        L_0x07b4:
            throw r2
        L_0x07b5:
            goto L_0x07b4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6944c.p6945a.C88543c.mo82187g(com.google.common.o.amt, java.lang.String):void");
    }

    /* renamed from: h */
    public final synchronized void mo82188h(C41642a aVar) {
        if (m143016L(aVar)) {
            this.f239302a.mo83169i("CACHE_HIT_COUNT");
        }
    }

    /* renamed from: hC */
    public final void mo78005hC(C89205j jVar) {
        this.f239302a = jVar;
        this.f239303c.f239315a = jVar;
        this.f239304d.f239315a = jVar;
        this.f239305e.f239315a = jVar;
        this.f239306f.f239315a = jVar;
    }

    /* renamed from: hE */
    public final synchronized void mo78006hE() {
        this.f239302a.mo83173m("SESSION_CUT_OFF_TIME", this.f239307g.mo26871c());
        this.f239302a.mo83171k("GENERATED_RESPONSE_COUNT", 0);
        this.f239302a.mo83171k("GENERATED_RESPONSE_IMPRESSION_COUNT", 0);
        this.f239302a.mo83171k("CACHE_HIT_COUNT", 0);
        this.f239302a.mo83171k("FETCHER_REQUEST_COUNT", 0);
        this.f239302a.mo83171k("CONNECTION_REQUEST_COUNT", 0);
        this.f239302a.mo83171k("CONNECTION_REJECTED_REQUEST_COUNT", 0);
        this.f239302a.mo83171k("CONNECTION_ERROR_COUNT", 0);
        this.f239302a.mo83171k("PENDING_REQUEST_COUNT", 0);
        this.f239302a.mo83171k("CONNECTION_RESPONSE_COUNT", 0);
        this.f239302a.mo83171k("ZERO_PREFIX_ROUND_TRIP_TIME", 0);
        this.f239302a.mo83171k("CANCELLED_FETCH_SHORT_TIMEOUT_COUNT", 0);
        this.f239302a.mo83171k("CANCELLED_FETCH_MEDIUM_TIMEOUT_COUNT", 0);
        this.f239302a.mo83171k("CANCELLED_FETCH_LONG_TIMEOUT_COUNT", 0);
        this.f239302a.mo83171k("CANCELLED_FETCH_FINAL_TIMEOUT_COUNT", 0);
        this.f239302a.mo83171k("HIGH_CONFIDENCE_ICING_RESULT_COUNT", 0);
        this.f239302a.mo83171k("TOTAL_WAIT_FOR_HIGH_CONFIDENCE_ICING_RESULT_MSEC", 0);
        this.f239302a.mo83173m("ZERO_PREFIX_RESPONSE_AGE", 0);
        this.f239302a.mo83173m("LOCATION_DATA_AGE", 0);
        this.f239302a.mo83170j("ZERO_PREFIX_ENABLED", false);
        this.f239302a.mo83171k("TOTAL_ICING_GLOBAL_QUERY_RESULTS", 0);
        this.f239302a.mo83171k("TOTAL_ICING_GLOBAL_QUERY_REQUESTS", 0);
        this.f239302a.mo83171k("NUM_SUPPRESS_BY_TYPE_REQUESTS", 0);
        this.f239302a.mo83170j("SUPPRESS_BY_TYPE_FULFILLED", false);
        this.f239302a.mo83171k("NUM_SUPPRESS_BY_TYPE_FULFILLED", 0);
        this.f239302a.mo83171k("NUM_SUPPRESSED_BY_TYPE", 0);
        this.f239302a.mo83171k("NUM_SUPPRESS_BY_SERVER_ON_DEVICE_DEDUPING_REQUESTS", 0);
        this.f239302a.mo83170j("SUPPRESS_BY_SERVER_ON_DEVICE_DEDUPING_FULFILLED", false);
        this.f239302a.mo83171k("NUM_SUPPRESS_BY_SERVER_ON_DEVICE_DEDUPING_FULFILLED", 0);
        this.f239302a.mo83171k("NUM_SUPPRESSED_BY_SERVER_ON_DEVICE_DEDUPING", 0);
        this.f239302a.mo83176p("PREVIOUS_QUERY", BuildConfig.FLAVOR);
        this.f239302a.mo83170j("QSB_DOODLE_ENABLED", false);
        this.f239302a.mo83170j("TAP_TARGET_GOOGLE_LOGO", false);
        this.f239302a.mo83171k("NUM_DOODLE_LOOPS", 0);
        this.f239302a.mo83170j("IS_DOODLE_SETTING_DISABLED", false);
        this.f239302a.mo83171k("SUGGEST_ENTRY_POINT", 0);
        this.f239302a.mo83174n("SUGGEST_RESPONSE_PARAMS_TO_LOG", C23245b.m43556a(C54231at.f142359r));
        this.f239302a.mo83174n("VALID_WINDOW_SUPPRESSION", C23245b.m43556a(aoz.f159538d));
        this.f239302a.mo83182v(new ArrayList());
        this.f239302a.mo83176p("SESSION_ID", C39191a.m68623b(C90719ac.f253778a.f253779b.nextLong()));
        C88689a.m143519c(this.f239302a);
        this.f239303c.mo82211e();
        this.f239304d.mo82211e();
        this.f239305e.mo82211e();
        this.f239306f.mo82211e();
        this.f239312l.clear();
    }

    /* renamed from: i */
    public final synchronized void mo82189i(C41642a aVar) {
        if (m143016L(aVar)) {
            this.f239302a.mo83169i("CANCELLED_FETCH_FINAL_TIMEOUT_COUNT");
        }
    }

    /* renamed from: j */
    public final synchronized void mo82190j(C41642a aVar) {
        if (m143016L(aVar)) {
            this.f239302a.mo83169i("CANCELLED_FETCH_LONG_TIMEOUT_COUNT");
        }
    }

    /* renamed from: k */
    public final synchronized void mo82191k(C41642a aVar) {
        if (m143016L(aVar)) {
            this.f239302a.mo83169i("CANCELLED_FETCH_MEDIUM_TIMEOUT_COUNT");
        }
    }

    /* renamed from: l */
    public final synchronized void mo82192l(C41642a aVar) {
        if (m143016L(aVar)) {
            this.f239302a.mo83169i("CANCELLED_FETCH_SHORT_TIMEOUT_COUNT");
        }
    }

    /* renamed from: m */
    public final synchronized void mo82193m(C41642a aVar) {
        if (m143016L(aVar)) {
            this.f239302a.mo83169i("FETCHER_REQUEST_COUNT");
        }
    }

    /* renamed from: n */
    public final synchronized void mo82194n(C41642a aVar) {
        if (m143016L(aVar)) {
            this.f239302a.mo83169i("GENERATED_RESPONSE_COUNT");
        }
    }

    /* renamed from: o */
    public final synchronized void mo82195o(C41642a aVar) {
        if (m143016L(aVar)) {
            this.f239302a.mo83169i("GENERATED_RESPONSE_IMPRESSION_COUNT");
        }
    }

    /* renamed from: p */
    public final synchronized void mo82196p(C41642a aVar) {
        if (m143016L(aVar)) {
            this.f239302a.mo83169i("HIGH_CONFIDENCE_ICING_RESULT_COUNT");
            this.f239302a.mo83171k("TOTAL_WAIT_FOR_HIGH_CONFIDENCE_ICING_RESULT_MSEC", this.f239302a.mo83161a("TOTAL_WAIT_FOR_HIGH_CONFIDENCE_ICING_RESULT_MSEC") + ((int) (this.f239307g.mo26871c() - ((C88616t) aVar).f239560e)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        return;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo82197q(com.google.android.libraries.searchbox.shared.p3201b.C41642a r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.m143016L(r2)     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x001e
            com.google.android.apps.gsa.searchbox.c.t r2 = (com.google.android.apps.gsa.searchbox.p6944c.C88616t) r2     // Catch:{ all -> 0x0020 }
            com.google.android.apps.gsa.shared.search.Query r2 = r2.f239556a     // Catch:{ all -> 0x0020 }
            java.lang.String r2 = r2.mo84352bk()     // Catch:{ all -> 0x0020 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0020 }
            if (r2 != 0) goto L_0x001e
            com.google.android.apps.gsa.shared.an.a.j r2 = r1.f239302a     // Catch:{ all -> 0x0020 }
            java.lang.String r0 = "PENDING_REQUEST_COUNT"
            r2.mo83169i(r0)     // Catch:{ all -> 0x0020 }
            monitor-exit(r1)
            return
        L_0x001e:
            monitor-exit(r1)
            return
        L_0x0020:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6944c.p6945a.C88543c.mo82197q(com.google.android.libraries.searchbox.shared.b.a):void");
    }

    /* renamed from: r */
    public final synchronized void mo82198r(C41642a aVar, long j) {
        if (m143016L(aVar)) {
            int c = (int) (this.f239307g.mo26871c() - j);
            if (c >= 0) {
                if (((C88616t) aVar).f239556a.mo84352bk().isEmpty()) {
                    this.f239302a.mo83171k("ZERO_PREFIX_ROUND_TRIP_TIME", c);
                    return;
                }
                this.f239302a.mo83169i("CONNECTION_RESPONSE_COUNT");
                this.f239303c.mo82210d(c);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        return;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo82199s(com.google.android.libraries.searchbox.shared.p3201b.C41642a r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.m143016L(r2)     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x001e
            com.google.android.apps.gsa.searchbox.c.t r2 = (com.google.android.apps.gsa.searchbox.p6944c.C88616t) r2     // Catch:{ all -> 0x0020 }
            com.google.android.apps.gsa.shared.search.Query r2 = r2.f239556a     // Catch:{ all -> 0x0020 }
            java.lang.String r2 = r2.mo84352bk()     // Catch:{ all -> 0x0020 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0020 }
            if (r2 != 0) goto L_0x001e
            com.google.android.apps.gsa.shared.an.a.j r2 = r1.f239302a     // Catch:{ all -> 0x0020 }
            java.lang.String r0 = "CONNECTION_REQUEST_COUNT"
            r2.mo83169i(r0)     // Catch:{ all -> 0x0020 }
            monitor-exit(r1)
            return
        L_0x001e:
            monitor-exit(r1)
            return
        L_0x0020:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6944c.p6945a.C88543c.mo82199s(com.google.android.libraries.searchbox.shared.b.a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        return;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo82200t(com.google.android.libraries.searchbox.shared.p3201b.C41642a r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.m143016L(r2)     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x001e
            com.google.android.apps.gsa.searchbox.c.t r2 = (com.google.android.apps.gsa.searchbox.p6944c.C88616t) r2     // Catch:{ all -> 0x0020 }
            com.google.android.apps.gsa.shared.search.Query r2 = r2.f239556a     // Catch:{ all -> 0x0020 }
            java.lang.String r2 = r2.mo84352bk()     // Catch:{ all -> 0x0020 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0020 }
            if (r2 != 0) goto L_0x001e
            com.google.android.apps.gsa.shared.an.a.j r2 = r1.f239302a     // Catch:{ all -> 0x0020 }
            java.lang.String r0 = "CONNECTION_ERROR_COUNT"
            r2.mo83169i(r0)     // Catch:{ all -> 0x0020 }
            monitor-exit(r1)
            return
        L_0x001e:
            monitor-exit(r1)
            return
        L_0x0020:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6944c.p6945a.C88543c.mo82200t(com.google.android.libraries.searchbox.shared.b.a):void");
    }

    /* renamed from: u */
    public final synchronized void mo82201u(C54231at atVar) {
        if ((atVar.f142361a & 268435456) != 0) {
            m143014J(atVar.f142376p);
        }
        C54231at I = m143013I();
        if (atVar.f142375o.isEmpty()) {
            if ((atVar.f142361a & 33554432) == 0) {
                if ((I.f142361a & 33554432) == 0) {
                    return;
                }
            }
            if (atVar.f142373m == I.f142373m) {
                return;
            }
        }
        C54230as asVar = (C54230as) I.toBuilder();
        if (!atVar.f142375o.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (anf hashCode : I.f142375o) {
                hashSet.add(Integer.valueOf(hashCode.hashCode()));
            }
            for (anf anf : atVar.f142375o) {
                if (!hashSet.contains(Integer.valueOf(anf.hashCode()))) {
                    if (this.f239308h.mo79746e(C90085ej.f250122Z) && anf.f159359c == 10001) {
                        C57924d dVar = atVar.f142377q;
                        if (dVar == null) {
                            dVar = C57924d.f154931b;
                        }
                        long b = this.f239307g.mo26870b();
                        if (anf.f159359c == 10001) {
                            C58480gp gpVar = new C58480gp(4);
                            int i = -1;
                            for (String str : C58869cf.m90936b(new C58903m(':')).mo56153g(anf.f159360d)) {
                                if (i < 0) {
                                    try {
                                        i = Integer.parseInt(str);
                                    } catch (NumberFormatException unused) {
                                    }
                                } else {
                                    gpVar.mo55395g(Integer.valueOf(str));
                                }
                            }
                            Iterator it = dVar.f154933a.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C57922b bVar = (C57922b) it.next();
                                HashSet hashSet2 = new HashSet(bVar.f154928d);
                                if (i == bVar.f154927c && hashSet2.containsAll(gpVar.mo55394f()) && C89212c.m145117a(bVar.f154929e, b)) {
                                    break;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    asVar.mo54077a(anf);
                    hashSet.add(Integer.valueOf(anf.hashCode()));
                }
            }
        }
        if ((atVar.f142361a & 33554432) != 0) {
            long j = atVar.f142373m;
            asVar.copyOnWrite();
            C54231at atVar2 = (C54231at) asVar.instance;
            atVar2.f142361a |= 33554432;
            atVar2.f142373m = j;
        } else {
            asVar.copyOnWrite();
            C54231at atVar3 = (C54231at) asVar.instance;
            atVar3.f142361a &= -33554433;
            atVar3.f142373m = 0;
        }
        this.f239302a.mo83174n("SUGGEST_RESPONSE_PARAMS_TO_LOG", C23245b.m43556a((C54231at) asVar.build()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        return;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo82202v(com.google.android.libraries.searchbox.shared.p3201b.C41642a r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.m143016L(r2)     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x001e
            com.google.android.apps.gsa.searchbox.c.t r2 = (com.google.android.apps.gsa.searchbox.p6944c.C88616t) r2     // Catch:{ all -> 0x0020 }
            com.google.android.apps.gsa.shared.search.Query r2 = r2.f239556a     // Catch:{ all -> 0x0020 }
            java.lang.String r2 = r2.mo84352bk()     // Catch:{ all -> 0x0020 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0020 }
            if (r2 != 0) goto L_0x001e
            com.google.android.apps.gsa.shared.an.a.j r2 = r1.f239302a     // Catch:{ all -> 0x0020 }
            java.lang.String r0 = "CONNECTION_REJECTED_REQUEST_COUNT"
            r2.mo83169i(r0)     // Catch:{ all -> 0x0020 }
            monitor-exit(r1)
            return
        L_0x001e:
            monitor-exit(r1)
            return
        L_0x0020:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6944c.p6945a.C88543c.mo82202v(com.google.android.libraries.searchbox.shared.b.a):void");
    }

    /* renamed from: w */
    public final synchronized void mo82203w(C41642a aVar) {
        this.f239306f.mo82210d((int) (this.f239307g.mo26871c() - ((C88616t) aVar).f239560e));
    }

    /* renamed from: x */
    public final synchronized void mo82204x(C41627a aVar, C41642a aVar2) {
        int c = (int) (this.f239307g.mo26871c() - ((C88616t) aVar2).f239560e);
        if (aVar == C41627a.SUCCESS) {
            this.f239305e.mo82210d(c);
        }
        Map map = this.f239312l;
        map.put(aVar, Integer.valueOf(((Integer) Map.EL.getOrDefault(map, aVar, 0)).intValue() + 1));
    }

    /* renamed from: y */
    public final synchronized void mo82205y() {
        if (this.f239302a.mo83178r("SUPPRESS_BY_SERVER_ON_DEVICE_DEDUPING_FULFILLED")) {
            this.f239302a.mo83169i("NUM_SUPPRESS_BY_SERVER_ON_DEVICE_DEDUPING_FULFILLED");
            this.f239302a.mo83170j("SUPPRESS_BY_SERVER_ON_DEVICE_DEDUPING_FULFILLED", false);
        }
        if (this.f239302a.mo83178r("SUPPRESS_BY_TYPE_FULFILLED")) {
            this.f239302a.mo83169i("NUM_SUPPRESS_BY_TYPE_FULFILLED");
            this.f239302a.mo83170j("SUPPRESS_BY_TYPE_FULFILLED", false);
        }
    }

    /* renamed from: z */
    public final synchronized void mo82206z(int i, int i2) {
        if (i != 0) {
            try {
                C89205j jVar = this.f239302a;
                jVar.mo83171k("NUM_SUPPRESSED_BY_SERVER_ON_DEVICE_DEDUPING", jVar.mo83161a("NUM_SUPPRESSED_BY_SERVER_ON_DEVICE_DEDUPING") + i);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 != 0) {
            C89205j jVar2 = this.f239302a;
            jVar2.mo83171k("NUM_SUPPRESSED_BY_TYPE", jVar2.mo83161a("NUM_SUPPRESSED_BY_TYPE") + i2);
        }
        if (i > 0) {
            this.f239302a.mo83170j("SUPPRESS_BY_SERVER_ON_DEVICE_DEDUPING_FULFILLED", true);
        }
        if (i2 > 0) {
            this.f239302a.mo83170j("SUPPRESS_BY_TYPE_FULFILLED", true);
        }
    }
}
