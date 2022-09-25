package com.google.android.apps.gsa.staticplugins.opa.morris2.framework;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.C109714ms;
import com.google.android.apps.gsa.staticplugins.opa.morris2.p8399j.C109707a;
import com.google.android.apps.gsa.staticplugins.opa.p8346bm.C108100a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14987i;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1079a.C14658e;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14718s;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14113an;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14115ap;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14495li;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14647d;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15390r;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3917i.p3918a.C51474ja;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import p001a.p007b.p011b.p012a.C0027c;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.time.temporal.Temporal;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.m */
/* compiled from: PG */
public final class C109636m implements C14986h {

    /* renamed from: a */
    public static final C59071e f305314a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.morris2.framework.m");

    /* renamed from: A */
    private final ServiceConnection f305315A = new C109635l(this);

    /* renamed from: B */
    private final C108100a f305316B;

    /* renamed from: C */
    private final C109714ms f305317C;

    /* renamed from: b */
    public final C109638o f305318b;

    /* renamed from: c */
    public final C14113an f305319c;

    /* renamed from: d */
    public final C14115ap f305320d;

    /* renamed from: e */
    public final C14647d f305321e;

    /* renamed from: f */
    public final Context f305322f;

    /* renamed from: g */
    public Optional f305323g = Optional.empty();

    /* renamed from: h */
    public volatile C14495li f305324h = C14495li.STATUS_INSTANTIATED;

    /* renamed from: i */
    private final C109613b f305325i;

    /* renamed from: j */
    private final C109640q f305326j;

    /* renamed from: k */
    private final Executor f305327k;

    /* renamed from: l */
    private final C21370a f305328l;

    /* renamed from: m */
    private final C69464a f305329m;

    /* renamed from: n */
    private final C14718s f305330n;

    /* renamed from: o */
    private final C14658e f305331o;

    /* renamed from: p */
    private final C86124t f305332p;

    /* renamed from: q */
    private final C14749d f305333q;

    /* renamed from: r */
    private final C69464a f305334r;

    /* renamed from: s */
    private final Optional f305335s;

    /* renamed from: t */
    private final C60887da f305336t;

    /* renamed from: u */
    private Optional f305337u;

    /* renamed from: v */
    private Optional f305338v;

    /* renamed from: w */
    private C14987i f305339w;

    /* renamed from: x */
    private int f305340x;

    /* renamed from: y */
    private volatile C14324f f305341y;

    /* renamed from: z */
    private C14499lm f305342z;

    public C109636m(Context context, C109613b bVar, C109640q qVar, C109638o oVar, C14113an anVar, C14115ap apVar, C21370a aVar, C109707a aVar2, C69464a aVar3, C14718s sVar, C14658e eVar, C108100a aVar4, C86124t tVar, C14647d dVar, C109714ms msVar, C14749d dVar2, C69464a aVar5, Optional optional, C60887da daVar, C60888db dbVar) {
        this.f305322f = context;
        this.f305325i = bVar;
        this.f305326j = qVar;
        this.f305318b = oVar;
        this.f305327k = new C60904dr(dbVar);
        this.f305319c = anVar;
        this.f305320d = apVar;
        this.f305328l = aVar;
        this.f305330n = sVar;
        this.f305331o = eVar;
        this.f305316B = aVar4;
        this.f305332p = tVar;
        this.f305321e = dVar;
        this.f305317C = msVar;
        this.f305335s = optional;
        this.f305336t = daVar;
        this.f305333q = dVar2;
        this.f305334r = aVar5;
        this.f305337u = Optional.empty();
        this.f305338v = Optional.empty();
        this.f305341y = C14324f.f43330f;
        this.f305342z = C14499lm.f43848e;
        this.f305329m = aVar3;
        C58976aa aaVar = C58975e.f156826a;
        Thread.setDefaultUncaughtExceptionHandler(aVar2);
    }

    /* renamed from: a */
    public static Intent m182435a(String str) {
        return new Intent(str).setFlags(268435456);
    }

    /* renamed from: n */
    private static Optional m182436n(C14216b bVar) {
        if (bVar.equals(C14216b.f43007f)) {
            return Optional.empty();
        }
        return Optional.m71637of(bVar.f43011c);
    }

    /* renamed from: b */
    public final C0027c mo21870b() {
        C0027c a = C0027c.m9a(this.f305341y.f43332a);
        return a == null ? C0027c.UNRECOGNIZED : a;
    }

    /* renamed from: c */
    public final C51474ja mo21871c() {
        return this.f305331o.f44276k;
    }

    /* renamed from: d */
    public final Duration mo21872d() {
        if (this.f305338v.isPresent()) {
            return Duration.between((Temporal) this.f305338v.get(), Instant.ofEpochMilli(this.f305328l.mo26871c()));
        }
        return Duration.ZERO;
    }

    /* renamed from: e */
    public final void mo21873e() {
        C109638o oVar = this.f305318b;
        Objects.requireNonNull(oVar);
        C109632i iVar = new C109632i(oVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(iVar), this.f305327k), "#morrisReady() failed", new Object[0]);
    }

    /* renamed from: f */
    public final void mo21874f() {
        C58976aa aaVar = C58975e.f156826a;
        C109638o oVar = this.f305318b;
        Objects.requireNonNull(oVar);
        C109633j jVar = new C109633j(oVar);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(jVar), this.f305327k), "#onNavigationStopped() failed", new Object[0]);
    }

    /* renamed from: g */
    public final void mo21875g(C14492lf lfVar) {
        C58976aa aaVar = C58975e.f156826a;
        C15390r rVar = new C15390r(this.f305328l);
        rVar.mo22281c();
        C109629f fVar = new C109629f(this, lfVar, rVar);
        C46459k.m82829b(C60856cj.m92904m(C47810es.m84978r(fVar), this.f305327k), "State processing failed", new Object[0]);
    }

    /* renamed from: h */
    public final void mo21876h(C14987i iVar) {
        this.f305339w = iVar;
    }

    /* renamed from: i */
    public final void mo21877i(C14492lf lfVar) {
        C15390r rVar = new C15390r(this.f305328l);
        rVar.mo22281c();
        this.f305319c.mo21424b(C37182a.f98007ea.mo40813g());
        C109627d dVar = new C109627d(this, lfVar, rVar);
        C46459k.m82829b(C60856cj.m92904m(C47810es.m84978r(dVar), this.f305327k), "#startMorris() failed", new Object[0]);
    }

    /* renamed from: j */
    public final void mo21878j() {
        C58976aa aaVar = C58975e.f156826a;
        C15390r rVar = new C15390r(this.f305328l);
        rVar.mo22281c();
        this.f305320d.mo21430d(C37182a.f98001eU.mo40813g(), this.f305321e.mo21608v());
        C109628e eVar = new C109628e(this, rVar);
        C46459k.m82829b(C60856cj.m92904m(C47810es.m84978r(eVar), this.f305327k), "#stopMorris() failed", new Object[0]);
    }

    /* renamed from: k */
    public final boolean mo21879k() {
        C0027c a = C0027c.m9a(this.f305341y.f43332a);
        if (a == null) {
            a = C0027c.UNRECOGNIZED;
        }
        return a != C0027c.OFF;
    }

    /* renamed from: l */
    public final boolean mo21880l() {
        return this.f305330n.mo21705l();
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x03a8 A[Catch:{ RuntimeException -> 0x0566 }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x03d8 A[Catch:{ RuntimeException -> 0x0566 }] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x054f A[Catch:{ RuntimeException -> 0x0566 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0561 A[Catch:{ RuntimeException -> 0x0566 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0375 A[Catch:{ RuntimeException -> 0x0566 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x037a A[Catch:{ RuntimeException -> 0x0566 }] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo97931m(com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf r14, com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15390r r15) {
        /*
            r13 = this;
            java.lang.String r0 = "Morris.FrameworkCntr"
            r1 = 0
            com.google.android.libraries.f.a r2 = r15.f46174d     // Catch:{ RuntimeException -> 0x0566 }
            long r2 = r2.mo26870b()     // Catch:{ RuntimeException -> 0x0566 }
            r15.f46176f = r2     // Catch:{ RuntimeException -> 0x0566 }
            java.util.List r2 = com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15390r.f46171a     // Catch:{ RuntimeException -> 0x0566 }
            long r3 = r15.f46176f     // Catch:{ RuntimeException -> 0x0566 }
            long r5 = r15.f46175e     // Catch:{ RuntimeException -> 0x0566 }
            long r3 = r3 - r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ RuntimeException -> 0x0566 }
            r2.add(r3)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.li r2 = r13.f305324h     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.li r3 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14495li.STATUS_RUNNING     // Catch:{ RuntimeException -> 0x0566 }
            r4 = 1
            if (r2 == r3) goto L_0x0089
            com.google.android.libraries.assistant.auto.tng.morris.f.d r2 = r13.f305321e     // Catch:{ RuntimeException -> 0x0566 }
            boolean r2 = r2.mo21594D()     // Catch:{ RuntimeException -> 0x0566 }
            if (r2 == 0) goto L_0x002d
            int r2 = r14.f43798a     // Catch:{ RuntimeException -> 0x0566 }
            if (r2 != r4) goto L_0x002d
            goto L_0x0089
        L_0x002d:
            com.google.common.f.e r2 = f305314a     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.x r3 = r2.mo56226d()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RuntimeException -> 0x0566 }
            r3.mo56378ag(r4, r0)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ RuntimeException -> 0x0566 }
            r4 = 24839(0x6107, float:3.4807E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.String r4 = "Received MorrisEvent=%s when Morris isn't running. morrisStatus=%s"
            com.google.android.libraries.assistant.auto.tng.morris.e.li r5 = r13.f305324h     // Catch:{ RuntimeException -> 0x0566 }
            r3.mo56354G(r4, r14, r5)     // Catch:{ RuntimeException -> 0x0566 }
            r15.mo22280b()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.f.d r14 = r13.f305321e     // Catch:{ RuntimeException -> 0x0566 }
            boolean r14 = r14.mo21594D()     // Catch:{ RuntimeException -> 0x0566 }
            if (r14 != 0) goto L_0x0088
            com.google.common.f.x r14 = r2.mo56225c()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RuntimeException -> 0x0566 }
            r14.mo56378ag(r2, r0)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.aa r2 = com.google.android.libraries.search.integrations.p3018c.C38505d.f101863a     // Catch:{ RuntimeException -> 0x0566 }
            r3 = 3014658(0x2e0002, float:4.224436E-39)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ RuntimeException -> 0x0566 }
            r14.mo56378ag(r2, r3)     // Catch:{ RuntimeException -> 0x0566 }
            r2 = 24840(0x6108, float:3.4808E-41)
            com.google.common.f.x r14 = r14.mo56372aa(r2)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.String r2 = "Force stopping Morris."
            r14.mo56386p(r2)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.apps.gsa.staticplugins.opa.morris2.framework.o r14 = r13.f305318b     // Catch:{ RuntimeException -> 0x0566 }
            r14.mo97934c()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.f.d r14 = r13.f305321e     // Catch:{ RuntimeException -> 0x0566 }
            j$.util.Optional r2 = p3186j$.util.Optional.empty()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r3 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf.f43796e     // Catch:{ RuntimeException -> 0x0566 }
            r14.mo21591A(r2, r3)     // Catch:{ RuntimeException -> 0x0566 }
        L_0x0088:
            return r1
        L_0x0089:
            g.a.a r2 = r13.f305334r     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.Object r2 = r2.mo17428b()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.framework.c.a r2 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.C14730a) r2     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.framework.d r3 = r13.f305333q     // Catch:{ RuntimeException -> 0x0566 }
            r3.mo21715b(r2)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.f r3 = r13.f305341y     // Catch:{ RuntimeException -> 0x0566 }
            int r3 = r3.f43332a     // Catch:{ RuntimeException -> 0x0566 }
            a.b.b.a.c r3 = p001a.p007b.p011b.p012a.C0027c.m9a(r3)     // Catch:{ RuntimeException -> 0x0566 }
            if (r3 != 0) goto L_0x00a2
            a.b.b.a.c r3 = p001a.p007b.p011b.p012a.C0027c.UNRECOGNIZED     // Catch:{ RuntimeException -> 0x0566 }
        L_0x00a2:
            com.google.android.libraries.assistant.auto.tng.morris.framework.d r5 = r13.f305333q     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.apps.gsa.staticplugins.opa.morris2.framework.b r6 = r13.f305325i     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.f r7 = r13.f305341y     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.lm r8 = r13.f305342z     // Catch:{ RuntimeException -> 0x0566 }
            r5.mo21717d(r7)     // Catch:{ RuntimeException -> 0x0566 }
            r5.mo21718e(r8)     // Catch:{ RuntimeException -> 0x0566 }
            int r8 = r14.f43798a     // Catch:{ RuntimeException -> 0x0566 }
            int r8 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14366go.m30613a(r8)     // Catch:{ RuntimeException -> 0x0566 }
            r9 = 5
            if (r8 == r9) goto L_0x00bf
            boolean r14 = r6.mo97911f(r14, r5)     // Catch:{ RuntimeException -> 0x0566 }
            goto L_0x0158
        L_0x00bf:
            int r8 = r14.f43800c     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.hp r8 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14394hp.m30615a(r8)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.hp r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14394hp.FEATUREEVENT_NOT_SET     // Catch:{ RuntimeException -> 0x0566 }
            if (r8 == r9) goto L_0x035b
            com.google.android.libraries.assistant.auto.tng.morris.framework.e r8 = new com.google.android.libraries.assistant.auto.tng.morris.framework.e     // Catch:{ RuntimeException -> 0x0566 }
            r8.<init>()     // Catch:{ RuntimeException -> 0x0566 }
            java.util.Map r9 = r6.f305248b     // Catch:{ RuntimeException -> 0x0566 }
            int r10 = r14.f43800c     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.hp r10 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14394hp.m30615a(r10)     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.Object r9 = r9.get(r10)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.a r9 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.C14653a) r9     // Catch:{ RuntimeException -> 0x0566 }
            r9.getClass()
            boolean r14 = r9.mo21623h(r14, r7, r8, r5)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.b.gp r7 = r8.f44887a     // Catch:{ RuntimeException -> 0x0566 }
            if (r7 != 0) goto L_0x00ec
            com.google.common.b.gu r7 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ RuntimeException -> 0x0566 }
            goto L_0x00f0
        L_0x00ec:
            com.google.common.b.gu r7 = r7.mo55394f()     // Catch:{ RuntimeException -> 0x0566 }
        L_0x00f0:
            r9 = r7
            com.google.common.b.pq r9 = (com.google.common.p4522b.C58724pq) r9     // Catch:{ RuntimeException -> 0x0566 }
            int r9 = r9.f156474d     // Catch:{ RuntimeException -> 0x0566 }
            r10 = 0
        L_0x00f6:
            if (r10 >= r9) goto L_0x0106
            java.lang.Object r11 = r7.get(r10)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r11 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf) r11     // Catch:{ RuntimeException -> 0x0566 }
            boolean r11 = r6.mo97911f(r11, r5)     // Catch:{ RuntimeException -> 0x0566 }
            r14 = r14 | r11
            int r10 = r10 + 1
            goto L_0x00f6
        L_0x0106:
            com.google.common.b.gz r7 = r8.f44888b     // Catch:{ RuntimeException -> 0x0566 }
            if (r7 != 0) goto L_0x010d
            com.google.common.b.hd r7 = com.google.common.p4522b.C58729pv.f156485a     // Catch:{ RuntimeException -> 0x0566 }
            goto L_0x0111
        L_0x010d:
            com.google.common.b.hd r7 = r7.mo55427f(r1)     // Catch:{ RuntimeException -> 0x0566 }
        L_0x0111:
            com.google.common.b.ij r7 = r7.entrySet()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.b.sl r7 = r7.iterator()     // Catch:{ RuntimeException -> 0x0566 }
        L_0x0119:
            boolean r8 = r7.hasNext()     // Catch:{ RuntimeException -> 0x0566 }
            if (r8 == 0) goto L_0x0158
            java.lang.Object r8 = r7.next()     // Catch:{ RuntimeException -> 0x0566 }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.Object r9 = r8.getKey()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.lf r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf) r9     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.Object r8 = r8.getValue()     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ RuntimeException -> 0x0566 }
            int r8 = r8.intValue()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a r10 = new com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a     // Catch:{ RuntimeException -> 0x0566 }
            r10.<init>(r6, r9)     // Catch:{ RuntimeException -> 0x0566 }
            long r8 = (long) r8     // Catch:{ RuntimeException -> 0x0566 }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.util.concurrent.db r12 = r6.f305249c     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.util.concurrent.r r10 = com.google.apps.tiktok.tracing.C47810es.m84965e(r10)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92902k(r10, r8, r11, r12)     // Catch:{ RuntimeException -> 0x0566 }
            java.util.List r9 = r6.f305250d     // Catch:{ RuntimeException -> 0x0566 }
            if (r9 != 0) goto L_0x0152
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ RuntimeException -> 0x0566 }
            r9.<init>()     // Catch:{ RuntimeException -> 0x0566 }
            r6.f305250d = r9     // Catch:{ RuntimeException -> 0x0566 }
        L_0x0152:
            java.util.List r9 = r6.f305250d     // Catch:{ RuntimeException -> 0x0566 }
            r9.add(r8)     // Catch:{ RuntimeException -> 0x0566 }
            goto L_0x0119
        L_0x0158:
            if (r14 != 0) goto L_0x015c
            goto L_0x035b
        L_0x015c:
            com.google.android.apps.gsa.staticplugins.opa.morris2.framework.q r14 = r13.f305326j     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.framework.b.b r6 = new com.google.android.libraries.assistant.auto.tng.morris.framework.b.b     // Catch:{ RuntimeException -> 0x0566 }
            r6.<init>()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.b.gu r14 = r14.f305348a     // Catch:{ RuntimeException -> 0x0566 }
            r7 = r14
            com.google.common.b.pq r7 = (com.google.common.p4522b.C58724pq) r7     // Catch:{ RuntimeException -> 0x0566 }
            int r7 = r7.f156474d     // Catch:{ RuntimeException -> 0x0566 }
            r8 = 0
        L_0x016b:
            if (r8 >= r7) goto L_0x017b
            java.lang.Object r9 = r14.get(r8)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.framework.b r9 = (com.google.android.libraries.assistant.auto.tng.morris.framework.C14726b) r9     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.e r10 = r6.f44510a     // Catch:{ RuntimeException -> 0x0566 }
            r9.mo21625f(r10)     // Catch:{ RuntimeException -> 0x0566 }
            int r8 = r8 + 1
            goto L_0x016b
        L_0x017b:
            com.google.android.libraries.assistant.auto.tng.morris.e.f r14 = r6.mo21711a()     // Catch:{ RuntimeException -> 0x0566 }
            r5.mo21717d(r14)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.framework.b.a r14 = new com.google.android.libraries.assistant.auto.tng.morris.framework.b.a     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.f r7 = r13.f305341y     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.f r8 = r6.mo21711a()     // Catch:{ RuntimeException -> 0x0566 }
            r14.<init>(r7, r8)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.f r7 = r6.mo21711a()     // Catch:{ RuntimeException -> 0x0566 }
            r13.f305341y = r7     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.f.d r7 = r13.f305321e     // Catch:{ RuntimeException -> 0x0566 }
            boolean r7 = r7.mo21594D()     // Catch:{ RuntimeException -> 0x0566 }
            if (r7 == 0) goto L_0x0263
            boolean r7 = r14.mo21710d()     // Catch:{ RuntimeException -> 0x0566 }
            if (r7 == 0) goto L_0x0263
            com.google.android.apps.gsa.staticplugins.opa.ms r7 = r13.f305317C     // Catch:{ RuntimeException -> 0x0566 }
            r7.mo98044a()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.f.a r7 = r13.f305328l     // Catch:{ RuntimeException -> 0x0566 }
            long r7 = r7.mo26871c()     // Catch:{ RuntimeException -> 0x0566 }
            j$.time.Instant r7 = p3186j$.time.Instant.ofEpochMilli(r7)     // Catch:{ RuntimeException -> 0x0566 }
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r7)     // Catch:{ RuntimeException -> 0x0566 }
            r13.f305338v = r7     // Catch:{ RuntimeException -> 0x0566 }
            j$.util.Optional r7 = r13.f305335s     // Catch:{ RuntimeException -> 0x0566 }
            boolean r7 = r7.isEmpty()     // Catch:{ RuntimeException -> 0x0566 }
            if (r7 == 0) goto L_0x01d3
            com.google.common.f.e r7 = f305314a     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.x r7 = r7.mo56225c()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RuntimeException -> 0x0566 }
            r7.mo56378ag(r8, r0)     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.String r8 = "#startMorrisSessionTimer(): primesWrapper not presented!"
            r9 = 24833(0x6101, float:3.4798E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r9)).mo56386p(r8)     // Catch:{ RuntimeException -> 0x0566 }
            goto L_0x0219
        L_0x01d3:
            j$.util.Optional r7 = r13.f305337u     // Catch:{ RuntimeException -> 0x0566 }
            boolean r7 = r7.isPresent()     // Catch:{ RuntimeException -> 0x0566 }
            if (r7 == 0) goto L_0x01ed
            com.google.common.f.e r7 = f305314a     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.x r7 = r7.mo56225c()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RuntimeException -> 0x0566 }
            r7.mo56378ag(r8, r0)     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.String r8 = "#startMorrisSessionTimer(): Previous morrisSessionTimerEvent is not stopped!"
            r9 = 24832(0x6100, float:3.4797E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r9)).mo56386p(r8)     // Catch:{ RuntimeException -> 0x0566 }
        L_0x01ed:
            j$.util.Optional r7 = r13.f305335s     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.Object r7 = r7.get()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.apps.gsa.staticplugins.cn.e r7 = (com.google.android.apps.gsa.staticplugins.p7684cn.C98043e) r7     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.performance.primes.ax r7 = r7.f273769a     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.performance.primes.metrics.i.m r7 = r7.mo36912c()     // Catch:{ RuntimeException -> 0x0566 }
            j$.util.Optional r7 = p3186j$.util.Optional.ofNullable(r7)     // Catch:{ RuntimeException -> 0x0566 }
            r13.f305337u = r7     // Catch:{ RuntimeException -> 0x0566 }
            boolean r7 = r7.isEmpty()     // Catch:{ RuntimeException -> 0x0566 }
            if (r7 == 0) goto L_0x0219
            com.google.common.f.e r7 = f305314a     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.x r7 = r7.mo56225c()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RuntimeException -> 0x0566 }
            r7.mo56378ag(r8, r0)     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.String r8 = "#startMorrisSessionTimer(): morrisSessionTimer is not started!"
            r9 = 24831(0x60ff, float:3.4796E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r9)).mo56386p(r8)     // Catch:{ RuntimeException -> 0x0566 }
        L_0x0219:
            com.google.android.libraries.assistant.auto.tng.morris.c.an r7 = r13.f305319c     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.search.b.i.g r8 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98008eb     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.search.b.i.a r8 = r8.mo40813g()     // Catch:{ RuntimeException -> 0x0566 }
            r7.mo21424b(r8)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.apps.gsa.staticplugins.opa.morris2.framework.o r7 = r13.f305318b     // Catch:{ RuntimeException -> 0x0566 }
            r7.mo97933b()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.li r7 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14495li.STATUS_RUNNING     // Catch:{ RuntimeException -> 0x0566 }
            r13.f305324h = r7     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.c.an r7 = r13.f305319c     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.search.b.i.g r8 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98009ec     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.search.b.i.a r8 = r8.mo40813g()     // Catch:{ RuntimeException -> 0x0566 }
            r7.mo21424b(r8)     // Catch:{ RuntimeException -> 0x0566 }
            android.content.Context r7 = r13.f305322f     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.String r8 = "com.google.android.apps.gsa.staticplugins.opa.morris.shared.INTENT_ACTION_MORRIS_STARTED"
            android.content.Intent r8 = m182435a(r8)     // Catch:{ RuntimeException -> 0x0566 }
            r7.sendBroadcast(r8)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.f.d r7 = r13.f305321e     // Catch:{ RuntimeException -> 0x0566 }
            boolean r7 = r7.mo21592B()     // Catch:{ RuntimeException -> 0x0566 }
            if (r7 == 0) goto L_0x0263
            android.content.Context r7 = r13.f305322f     // Catch:{ RuntimeException -> 0x0566 }
            android.content.Intent r8 = new android.content.Intent     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.String r9 = "com.google.android.libraries.assistant.auto.tng.morris.service.MorrisService"
            r8.<init>(r9)     // Catch:{ RuntimeException -> 0x0566 }
            android.content.Context r9 = r13.f305322f     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.String r9 = r9.getPackageName()     // Catch:{ RuntimeException -> 0x0566 }
            android.content.Intent r8 = r8.setPackage(r9)     // Catch:{ RuntimeException -> 0x0566 }
            android.content.ServiceConnection r9 = r13.f305315A     // Catch:{ RuntimeException -> 0x0566 }
            r7.bindService(r8, r9, r4)     // Catch:{ RuntimeException -> 0x0566 }
        L_0x0263:
            com.google.android.apps.gsa.staticplugins.opa.morris2.framework.q r7 = r13.f305326j     // Catch:{ RuntimeException -> 0x0566 }
            r7.mo97935a(r14, r5, r6)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.lm r5 = r6.mo21712b()     // Catch:{ RuntimeException -> 0x0566 }
            r13.f305342z = r5     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.f.d r5 = r13.f305321e     // Catch:{ RuntimeException -> 0x0566 }
            boolean r5 = r5.mo21594D()     // Catch:{ RuntimeException -> 0x0566 }
            if (r5 == 0) goto L_0x0356
            boolean r5 = r14.mo21709c()     // Catch:{ RuntimeException -> 0x0566 }
            if (r5 == 0) goto L_0x0356
            com.google.android.libraries.assistant.auto.tng.morris.c.ap r5 = r13.f305320d     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.search.b.i.g r7 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98002eV     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.search.b.i.a r7 = r7.mo40813g()     // Catch:{ RuntimeException -> 0x0566 }
            j$.time.Duration r8 = r13.mo21872d()     // Catch:{ RuntimeException -> 0x0566 }
            r5.mo21430d(r7, r8)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.apps.gsa.staticplugins.opa.morris2.framework.o r5 = r13.f305318b     // Catch:{ RuntimeException -> 0x0566 }
            r5.mo97934c()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.li r5 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14495li.STATUS_STOPPED     // Catch:{ RuntimeException -> 0x0566 }
            r13.f305324h = r5     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RuntimeException -> 0x0566 }
            j$.util.Optional r5 = r13.f305337u     // Catch:{ RuntimeException -> 0x0566 }
            r5.isPresent()     // Catch:{ RuntimeException -> 0x0566 }
            j$.util.Optional r5 = r13.f305335s     // Catch:{ RuntimeException -> 0x0566 }
            boolean r5 = r5.isEmpty()     // Catch:{ RuntimeException -> 0x0566 }
            if (r5 == 0) goto L_0x02b6
            com.google.common.f.e r5 = f305314a     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RuntimeException -> 0x0566 }
            r5.mo56378ag(r7, r0)     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.String r7 = "#stopMorrisSessionTimer(): primesWrapper not presented!"
            r8 = 24836(0x6104, float:3.4803E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r8)).mo56386p(r7)     // Catch:{ RuntimeException -> 0x0566 }
            goto L_0x02e0
        L_0x02b6:
            j$.util.Optional r5 = r13.f305337u     // Catch:{ RuntimeException -> 0x0566 }
            boolean r5 = r5.isEmpty()     // Catch:{ RuntimeException -> 0x0566 }
            if (r5 != 0) goto L_0x02e0
            j$.util.Optional r5 = r13.f305335s     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.Object r5 = r5.get()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.apps.gsa.staticplugins.cn.e r5 = (com.google.android.apps.gsa.staticplugins.p7684cn.C98043e) r5     // Catch:{ RuntimeException -> 0x0566 }
            j$.util.Optional r7 = r13.f305337u     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.Object r7 = r7.get()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.performance.primes.metrics.i.m r7 = (com.google.android.libraries.performance.primes.metrics.p2415i.C31520m) r7     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.String r8 = "MorrisSessionV2"
            com.google.android.libraries.performance.primes.au r8 = com.google.android.libraries.performance.primes.C31164au.m58092b(r8)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.performance.primes.ax r5 = r5.f273769a     // Catch:{ RuntimeException -> 0x0566 }
            r9 = 2
            r5.mo36918j(r7, r8, r9)     // Catch:{ RuntimeException -> 0x0566 }
            j$.util.Optional r5 = p3186j$.util.Optional.empty()     // Catch:{ RuntimeException -> 0x0566 }
            r13.f305337u = r5     // Catch:{ RuntimeException -> 0x0566 }
        L_0x02e0:
            com.google.android.libraries.assistant.auto.tng.morris.c.ap r5 = r13.f305320d     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.search.b.i.g r7 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98003eW     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.search.b.i.a r7 = r7.mo40813g()     // Catch:{ RuntimeException -> 0x0566 }
            j$.time.Duration r8 = r13.mo21872d()     // Catch:{ RuntimeException -> 0x0566 }
            r5.mo21430d(r7, r8)     // Catch:{ RuntimeException -> 0x0566 }
            android.content.Context r5 = r13.f305322f     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.String r7 = "com.google.android.apps.gsa.staticplugins.opa.morris.shared.INTENT_ACTION_MORRIS_STOPPED"
            android.content.Intent r7 = m182435a(r7)     // Catch:{ RuntimeException -> 0x0566 }
            r5.sendBroadcast(r7)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.f.d r5 = r13.f305321e     // Catch:{ RuntimeException -> 0x0566 }
            boolean r5 = r5.mo21592B()     // Catch:{ RuntimeException -> 0x0566 }
            if (r5 == 0) goto L_0x0309
            android.content.Context r5 = r13.f305322f     // Catch:{ RuntimeException -> 0x0566 }
            android.content.ServiceConnection r7 = r13.f305315A     // Catch:{ RuntimeException -> 0x0566 }
            r5.unbindService(r7)     // Catch:{ RuntimeException -> 0x0566 }
        L_0x0309:
            boolean r5 = r14.mo21708b()     // Catch:{ RuntimeException -> 0x0566 }
            if (r5 == 0) goto L_0x0356
            boolean r5 = r14.mo21709c()     // Catch:{ RuntimeException -> 0x0566 }
            if (r5 != 0) goto L_0x0356
            boolean r14 = r14.mo21710d()     // Catch:{ RuntimeException -> 0x0566 }
            if (r14 != 0) goto L_0x0356
            com.google.android.apps.gsa.staticplugins.opa.morris2.framework.o r14 = r13.f305318b     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.f r5 = r6.mo21711a()     // Catch:{ RuntimeException -> 0x0566 }
            int r5 = r5.f43332a     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.opa.morris2.framework.C109638o.f305343a     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.x r5 = r5.mo56224b()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.String r8 = "Morris.LifecycleMng"
            r5.mo56378ag(r7, r8)     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.String r7 = "#onMorrisModeChange"
            r8 = 24842(0x610a, float:3.4811E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r8)).mo56386p(r7)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.b.ij r5 = r14.f305344b     // Catch:{ RuntimeException -> 0x0566 }
            boolean r5 = r5.isEmpty()     // Catch:{ RuntimeException -> 0x0566 }
            if (r5 == 0) goto L_0x0340
            goto L_0x0356
        L_0x0340:
            com.google.common.b.ij r14 = r14.f305344b     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.b.sl r14 = r14.iterator()     // Catch:{ RuntimeException -> 0x0566 }
        L_0x0346:
            boolean r5 = r14.hasNext()     // Catch:{ RuntimeException -> 0x0566 }
            if (r5 == 0) goto L_0x0356
            java.lang.Object r5 = r14.next()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.framework.g r5 = (com.google.android.libraries.assistant.auto.tng.morris.framework.C14985g) r5     // Catch:{ RuntimeException -> 0x0566 }
            r5.mo21506g()     // Catch:{ RuntimeException -> 0x0566 }
            goto L_0x0346
        L_0x0356:
            j$.util.Optional r14 = p3186j$.util.Optional.m71637of(r6)     // Catch:{ RuntimeException -> 0x0566 }
            goto L_0x035f
        L_0x035b:
            j$.util.Optional r14 = p3186j$.util.Optional.empty()     // Catch:{ RuntimeException -> 0x0566 }
        L_0x035f:
            g.a.a r5 = r13.f305329m     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.Object r5 = r5.mo17428b()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.ai r5 = (com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.C14794ai) r5     // Catch:{ RuntimeException -> 0x0566 }
            java.util.Map r6 = r2.f44520c     // Catch:{ RuntimeException -> 0x0566 }
            if (r6 == 0) goto L_0x03cf
            boolean r6 = r6.isEmpty()     // Catch:{ RuntimeException -> 0x0566 }
            if (r6 != 0) goto L_0x03cf
            java.util.Map r2 = r2.f44520c     // Catch:{ RuntimeException -> 0x0566 }
            if (r2 != 0) goto L_0x037a
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ RuntimeException -> 0x0566 }
            goto L_0x0382
        L_0x037a:
            java.util.Collection r2 = r2.values()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89842j(r2)     // Catch:{ RuntimeException -> 0x0566 }
        L_0x0382:
            com.google.android.libraries.assistant.auto.tng.morris.h.r r6 = r5.f44576d     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.f.a r7 = r6.f46174d     // Catch:{ RuntimeException -> 0x0566 }
            long r7 = r7.mo26870b()     // Catch:{ RuntimeException -> 0x0566 }
            r6.f46177g = r7     // Catch:{ RuntimeException -> 0x0566 }
            com.google.apps.tiktok.tracing.contrib.b.j r6 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84750a(r2)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.af r7 = new com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.af     // Catch:{ RuntimeException -> 0x0566 }
            r7.<init>(r5, r2)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.util.concurrent.bg r8 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.util.concurrent.cx r6 = r6.mo51520a(r7, r8)     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.String r7 = "Fails to process datasourcereadyevent."
            java.lang.Object[] r8 = new java.lang.Object[r1]     // Catch:{ RuntimeException -> 0x0566 }
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r6, r7, r8)     // Catch:{ RuntimeException -> 0x0566 }
            int r6 = r2.size()     // Catch:{ RuntimeException -> 0x0566 }
            if (r6 == r4) goto L_0x03cf
            j$.time.Duration r6 = r5.f44577e     // Catch:{ RuntimeException -> 0x0566 }
            boolean r6 = r6.isNegative()     // Catch:{ RuntimeException -> 0x0566 }
            if (r6 == 0) goto L_0x03b1
            goto L_0x03cf
        L_0x03b1:
            int r6 = r2.size()     // Catch:{ RuntimeException -> 0x0566 }
            r7 = 0
        L_0x03b6:
            if (r7 >= r6) goto L_0x03cf
            java.lang.Object r8 = r2.get(r7)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.util.concurrent.cx r8 = (com.google.common.util.concurrent.C60870cx) r8     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.ah r9 = new com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.ah     // Catch:{ RuntimeException -> 0x0566 }
            r9.<init>(r5)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.util.concurrent.bg r10 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.util.concurrent.bz r9 = com.google.apps.tiktok.tracing.C47810es.m84974n(r9)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.util.concurrent.C60856cj.m92911t(r8, r9, r10)     // Catch:{ RuntimeException -> 0x0566 }
            int r7 = r7 + 1
            goto L_0x03b6
        L_0x03cf:
            r15.mo22280b()     // Catch:{ RuntimeException -> 0x0566 }
            boolean r2 = r14.isPresent()     // Catch:{ RuntimeException -> 0x0566 }
            if (r2 == 0) goto L_0x054b
            java.lang.Object r2 = r14.get()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.framework.b.b r2 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1081b.C14728b) r2     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.f r2 = r2.mo21711a()     // Catch:{ RuntimeException -> 0x0566 }
            int r2 = r2.f43332a     // Catch:{ RuntimeException -> 0x0566 }
            a.b.b.a.c r2 = p001a.p007b.p011b.p012a.C0027c.m9a(r2)     // Catch:{ RuntimeException -> 0x0566 }
            if (r2 != 0) goto L_0x03ec
            a.b.b.a.c r2 = p001a.p007b.p011b.p012a.C0027c.UNRECOGNIZED     // Catch:{ RuntimeException -> 0x0566 }
        L_0x03ec:
            a.b.b.a.c r5 = p001a.p007b.p011b.p012a.C0027c.DRIVING_SCREEN     // Catch:{ RuntimeException -> 0x0566 }
            boolean r5 = r3.equals(r5)     // Catch:{ RuntimeException -> 0x0566 }
            if (r5 != 0) goto L_0x040c
            a.b.b.a.c r5 = p001a.p007b.p011b.p012a.C0027c.DRIVING_SCREEN     // Catch:{ RuntimeException -> 0x0566 }
            boolean r5 = r2.equals(r5)     // Catch:{ RuntimeException -> 0x0566 }
            if (r5 != 0) goto L_0x040c
            a.b.b.a.c r5 = p001a.p007b.p011b.p012a.C0027c.MINI     // Catch:{ RuntimeException -> 0x0566 }
            boolean r5 = r3.equals(r5)     // Catch:{ RuntimeException -> 0x0566 }
            if (r5 != 0) goto L_0x040c
            a.b.b.a.c r5 = p001a.p007b.p011b.p012a.C0027c.MINI     // Catch:{ RuntimeException -> 0x0566 }
            boolean r5 = r2.equals(r5)     // Catch:{ RuntimeException -> 0x0566 }
            if (r5 == 0) goto L_0x0438
        L_0x040c:
            com.google.android.libraries.assistant.auto.tng.morris.framework.i r5 = r13.f305339w     // Catch:{ RuntimeException -> 0x0566 }
            if (r5 == 0) goto L_0x041e
            java.lang.Object r6 = r14.get()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.framework.b.b r6 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1081b.C14728b) r6     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.lm r6 = r6.mo21712b()     // Catch:{ RuntimeException -> 0x0566 }
            r5.mo21881n(r6)     // Catch:{ RuntimeException -> 0x0566 }
            goto L_0x0438
        L_0x041e:
            com.google.common.f.e r5 = f305314a     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RuntimeException -> 0x0566 }
            r5.mo56378ag(r6, r0)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ RuntimeException -> 0x0566 }
            r6 = 24838(0x6106, float:3.4805E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r6)     // Catch:{ RuntimeException -> 0x0566 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.String r6 = "No uiUpdater registered to process UiState change."
            r5.mo56386p(r6)     // Catch:{ RuntimeException -> 0x0566 }
        L_0x0438:
            a.b.b.a.c r5 = p001a.p007b.p011b.p012a.C0027c.MICRO     // Catch:{ RuntimeException -> 0x0566 }
            boolean r3 = r3.equals(r5)     // Catch:{ RuntimeException -> 0x0566 }
            if (r3 != 0) goto L_0x0448
            a.b.b.a.c r3 = p001a.p007b.p011b.p012a.C0027c.MICRO     // Catch:{ RuntimeException -> 0x0566 }
            boolean r2 = r2.equals(r3)     // Catch:{ RuntimeException -> 0x0566 }
            if (r2 == 0) goto L_0x045e
        L_0x0448:
            j$.util.Optional r2 = r13.f305323g     // Catch:{ RuntimeException -> 0x0566 }
            boolean r2 = r2.isPresent()     // Catch:{ RuntimeException -> 0x0566 }
            if (r2 == 0) goto L_0x045e
            com.google.common.util.concurrent.da r2 = r13.f305336t     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.apps.gsa.staticplugins.opa.morris2.framework.k r3 = new com.google.android.apps.gsa.staticplugins.opa.morris2.framework.k     // Catch:{ RuntimeException -> 0x0566 }
            r3.<init>(r13, r14)     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.Runnable r3 = com.google.apps.tiktok.tracing.C47810es.m84977q(r3)     // Catch:{ RuntimeException -> 0x0566 }
            r2.mo19398a(r3)     // Catch:{ RuntimeException -> 0x0566 }
        L_0x045e:
            com.google.android.apps.gsa.staticplugins.opa.bm.a r2 = r13.f305316B     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.Object r14 = r14.get()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.framework.b.b r14 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1081b.C14728b) r14     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.lm r14 = r14.mo21712b()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.f r3 = r13.f305341y     // Catch:{ RuntimeException -> 0x0566 }
            a.b.b.a.g r5 = p001a.p007b.p011b.p012a.C0031g.f92d     // Catch:{ RuntimeException -> 0x0566 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ RuntimeException -> 0x0566 }
            a.b.b.a.f r5 = (p001a.p007b.p011b.p012a.C0030f) r5     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.apps.gsa.search.core.i.t r6 = r13.f305332p     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248826ah     // Catch:{ RuntimeException -> 0x0566 }
            boolean r6 = r6.mo79746e(r7)     // Catch:{ RuntimeException -> 0x0566 }
            if (r6 == 0) goto L_0x0516
            int r6 = r14.f43850a     // Catch:{ RuntimeException -> 0x0566 }
            r7 = 3
            if (r6 != r7) goto L_0x0488
            java.lang.Object r14 = r14.f43851b     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.dh r14 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14278dh) r14     // Catch:{ RuntimeException -> 0x0566 }
            goto L_0x048a
        L_0x0488:
            com.google.android.libraries.assistant.auto.tng.morris.e.dh r14 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14278dh.f43183g     // Catch:{ RuntimeException -> 0x0566 }
        L_0x048a:
            int r6 = r14.f43185a     // Catch:{ RuntimeException -> 0x0566 }
            int r8 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14277dg.m30593a(r6)     // Catch:{ RuntimeException -> 0x0566 }
            int r9 = r8 + -1
            if (r8 == 0) goto L_0x0514
            switch(r9) {
                case 0: goto L_0x04f7;
                case 1: goto L_0x04f7;
                case 2: goto L_0x04dd;
                case 3: goto L_0x04c8;
                case 4: goto L_0x04b2;
                case 5: goto L_0x049c;
                case 6: goto L_0x04f7;
                case 7: goto L_0x04f7;
                case 8: goto L_0x04f7;
                case 9: goto L_0x04f7;
                case 10: goto L_0x04f7;
                default: goto L_0x0497;
            }     // Catch:{ RuntimeException -> 0x0566 }
        L_0x0497:
            j$.util.Optional r14 = p3186j$.util.Optional.empty()     // Catch:{ RuntimeException -> 0x0566 }
            goto L_0x04fb
        L_0x049c:
            r7 = 15
            if (r6 != r7) goto L_0x04a5
            java.lang.Object r14 = r14.f43186b     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.ey r14 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14322ey) r14     // Catch:{ RuntimeException -> 0x0566 }
            goto L_0x04a7
        L_0x04a5:
            com.google.android.libraries.assistant.auto.tng.morris.e.ey r14 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14322ey.f43322f     // Catch:{ RuntimeException -> 0x0566 }
        L_0x04a7:
            com.google.android.libraries.assistant.auto.tng.morris.e.b r14 = r14.f43324a     // Catch:{ RuntimeException -> 0x0566 }
            if (r14 != 0) goto L_0x04ad
            com.google.android.libraries.assistant.auto.tng.morris.e.b r14 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b.f43007f     // Catch:{ RuntimeException -> 0x0566 }
        L_0x04ad:
            j$.util.Optional r14 = m182436n(r14)     // Catch:{ RuntimeException -> 0x0566 }
            goto L_0x04fb
        L_0x04b2:
            r7 = 14
            if (r6 != r7) goto L_0x04bb
            java.lang.Object r14 = r14.f43186b     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.ej r14 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14307ej) r14     // Catch:{ RuntimeException -> 0x0566 }
            goto L_0x04bd
        L_0x04bb:
            com.google.android.libraries.assistant.auto.tng.morris.e.ej r14 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14307ej.f43274i     // Catch:{ RuntimeException -> 0x0566 }
        L_0x04bd:
            com.google.android.libraries.assistant.auto.tng.morris.e.b r14 = r14.f43276a     // Catch:{ RuntimeException -> 0x0566 }
            if (r14 != 0) goto L_0x04c3
            com.google.android.libraries.assistant.auto.tng.morris.e.b r14 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b.f43007f     // Catch:{ RuntimeException -> 0x0566 }
        L_0x04c3:
            j$.util.Optional r14 = m182436n(r14)     // Catch:{ RuntimeException -> 0x0566 }
            goto L_0x04fb
        L_0x04c8:
            r7 = 4
            if (r6 != r7) goto L_0x04d0
            java.lang.Object r14 = r14.f43186b     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.dr r14 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14288dr) r14     // Catch:{ RuntimeException -> 0x0566 }
            goto L_0x04d2
        L_0x04d0:
            com.google.android.libraries.assistant.auto.tng.morris.e.dr r14 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14288dr.f43223h     // Catch:{ RuntimeException -> 0x0566 }
        L_0x04d2:
            com.google.android.libraries.assistant.auto.tng.morris.e.b r14 = r14.f43225a     // Catch:{ RuntimeException -> 0x0566 }
            if (r14 != 0) goto L_0x04d8
            com.google.android.libraries.assistant.auto.tng.morris.e.b r14 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b.f43007f     // Catch:{ RuntimeException -> 0x0566 }
        L_0x04d8:
            j$.util.Optional r14 = m182436n(r14)     // Catch:{ RuntimeException -> 0x0566 }
            goto L_0x04fb
        L_0x04dd:
            if (r6 != r7) goto L_0x04e4
            java.lang.Object r14 = r14.f43186b     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.assistant.auto.tng.morris.e.fe r14 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14329fe) r14     // Catch:{ RuntimeException -> 0x0566 }
            goto L_0x04e6
        L_0x04e4:
            com.google.android.libraries.assistant.auto.tng.morris.e.fe r14 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14329fe.f43345c     // Catch:{ RuntimeException -> 0x0566 }
        L_0x04e6:
            com.google.android.libraries.assistant.auto.tng.morris.e.fi r14 = r14.f43348b     // Catch:{ RuntimeException -> 0x0566 }
            if (r14 != 0) goto L_0x04ec
            com.google.android.libraries.assistant.auto.tng.morris.e.fi r14 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14333fi.f43350q     // Catch:{ RuntimeException -> 0x0566 }
        L_0x04ec:
            com.google.android.libraries.assistant.auto.tng.morris.e.b r14 = r14.f43356e     // Catch:{ RuntimeException -> 0x0566 }
            if (r14 != 0) goto L_0x04f2
            com.google.android.libraries.assistant.auto.tng.morris.e.b r14 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b.f43007f     // Catch:{ RuntimeException -> 0x0566 }
        L_0x04f2:
            j$.util.Optional r14 = m182436n(r14)     // Catch:{ RuntimeException -> 0x0566 }
            goto L_0x04fb
        L_0x04f7:
            j$.util.Optional r14 = p3186j$.util.Optional.empty()     // Catch:{ RuntimeException -> 0x0566 }
        L_0x04fb:
            boolean r6 = r14.isPresent()     // Catch:{ RuntimeException -> 0x0566 }
            if (r6 == 0) goto L_0x0516
            java.lang.Object r14 = r14.get()     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ RuntimeException -> 0x0566 }
            r5.copyOnWrite()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ RuntimeException -> 0x0566 }
            a.b.b.a.g r6 = (p001a.p007b.p011b.p012a.C0031g) r6     // Catch:{ RuntimeException -> 0x0566 }
            r14.getClass()     // Catch:{ RuntimeException -> 0x0566 }
            r6.f96c = r14     // Catch:{ RuntimeException -> 0x0566 }
            goto L_0x0516
        L_0x0514:
            r14 = 0
            throw r14     // Catch:{ RuntimeException -> 0x0566 }
        L_0x0516:
            int r14 = r3.f43332a     // Catch:{ RuntimeException -> 0x0566 }
            a.b.b.a.c r14 = p001a.p007b.p011b.p012a.C0027c.m9a(r14)     // Catch:{ RuntimeException -> 0x0566 }
            if (r14 != 0) goto L_0x0520
            a.b.b.a.c r14 = p001a.p007b.p011b.p012a.C0027c.UNRECOGNIZED     // Catch:{ RuntimeException -> 0x0566 }
        L_0x0520:
            r5.copyOnWrite()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ RuntimeException -> 0x0566 }
            a.b.b.a.g r6 = (p001a.p007b.p011b.p012a.C0031g) r6     // Catch:{ RuntimeException -> 0x0566 }
            int r14 = r14.getNumber()     // Catch:{ RuntimeException -> 0x0566 }
            r6.f94a = r14     // Catch:{ RuntimeException -> 0x0566 }
            int r14 = r3.f43333b     // Catch:{ RuntimeException -> 0x0566 }
            int r14 = p001a.p007b.p011b.p012a.C0025a.m8c(r14)     // Catch:{ RuntimeException -> 0x0566 }
            if (r14 != 0) goto L_0x0536
            r14 = 1
        L_0x0536:
            r5.copyOnWrite()     // Catch:{ RuntimeException -> 0x0566 }
            com.google.protobuf.bv r3 = r5.instance     // Catch:{ RuntimeException -> 0x0566 }
            a.b.b.a.g r3 = (p001a.p007b.p011b.p012a.C0031g) r3     // Catch:{ RuntimeException -> 0x0566 }
            int r14 = p001a.p007b.p011b.p012a.C0025a.m7b(r14)     // Catch:{ RuntimeException -> 0x0566 }
            r3.f95b = r14     // Catch:{ RuntimeException -> 0x0566 }
            com.google.protobuf.bv r14 = r5.build()     // Catch:{ RuntimeException -> 0x0566 }
            a.b.b.a.g r14 = (p001a.p007b.p011b.p012a.C0031g) r14     // Catch:{ RuntimeException -> 0x0566 }
            r2.f300691e = r14     // Catch:{ RuntimeException -> 0x0566 }
        L_0x054b:
            int r14 = r13.f305340x     // Catch:{ RuntimeException -> 0x0566 }
            if (r14 > 0) goto L_0x0561
            r14 = 10
            r13.f305340x = r14     // Catch:{ RuntimeException -> 0x0566 }
            com.google.android.libraries.performance.primes.ax r14 = com.google.android.libraries.performance.primes.C31167ax.m58112a()     // Catch:{ RuntimeException -> 0x0566 }
            java.lang.String r2 = "MorrisFrameworkMemorySnapshot"
            com.google.android.libraries.performance.primes.au r2 = com.google.android.libraries.performance.primes.C31164au.m58092b(r2)     // Catch:{ RuntimeException -> 0x0566 }
            r14.mo36917i(r2)     // Catch:{ RuntimeException -> 0x0566 }
            goto L_0x0565
        L_0x0561:
            int r14 = r14 + -1
            r13.f305340x = r14     // Catch:{ RuntimeException -> 0x0566 }
        L_0x0565:
            return r4
        L_0x0566:
            r14 = move-exception
            com.google.common.f.e r2 = f305314a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r0)
            java.lang.String r0 = "Exception thrown processing Morris event."
            r3 = 24837(0x6105, float:3.4804E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r14)).mo56372aa(r3)).mo56386p(r0)
            r15.mo22280b()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.C109636m.mo97931m(com.google.android.libraries.assistant.auto.tng.morris.e.lf, com.google.android.libraries.assistant.auto.tng.morris.h.r):boolean");
    }
}
