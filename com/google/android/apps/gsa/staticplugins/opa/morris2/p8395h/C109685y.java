package com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h;

import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Looper;
import android.view.Display;
import android.view.DisplayCutout;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.LiveData;
import com.google.android.apps.gsa.assistant.shared.MorrisRunningStatus;
import com.google.android.apps.gsa.assistant.shared.ax;
import com.google.android.apps.gsa.assistant.shared.ba;
import com.google.android.apps.gsa.nga.api.bq;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.staticplugins.opa.C109714ms;
import com.google.android.apps.gsa.staticplugins.opa.morris2.C109477a;
import com.google.android.apps.gsa.staticplugins.p7684cn.C98043e;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14089q;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14096x;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14113an;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14115ap;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.C14649e;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1073a.C14638a;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1077d.C14648a;
import com.google.android.libraries.assistant.p1467d.p1471b.C17823i;
import com.google.android.libraries.assistant.p1467d.p1471b.C17829o;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3917i.p3918a.C51474ja;
import com.google.assistant.p3897e.p3929l.p3930a.C52686as;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p001a.p007b.p011b.p012a.C0027c;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.time.temporal.Temporal;
import p3186j$.util.Optional;
import p3186j$.util.OptionalLong;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.h.y */
/* compiled from: PG */
public final class C109685y implements ba {

    /* renamed from: a */
    public static final C59071e f305480a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.morris2.h.y");

    /* renamed from: s */
    private static final C58528ij f305481s = C58528ij.m90015O(C51474ja.QUERY, C51474ja.ACTIVITY_RECOGNIZER, C51474ja.ACTIVITY_RECOGNIZER_AUTO_LAUNCH, C51474ja.ACTIVITY_RECOGNIZER_NOTIFICATION_CLICK, C51474ja.BLUETOOTH, C51474ja.BLUETOOTH_AUTO_LAUNCH, C51474ja.BLUETOOTH_NOTIFICATION_CLICK, C51474ja.VANAGON_SETTINGS, C51474ja.VANAGON_PROMO_CARD, C51474ja.LAUNCHER_SHORTCUT, C51474ja.NFC, C51474ja.PERSISTENT_NOTIFICATION_CLICK, C51474ja.DRIVING_SCREEN_UNSPECIFIED);

    /* renamed from: A */
    private final C21370a f305482A;

    /* renamed from: B */
    private final boolean f305483B;

    /* renamed from: C */
    private OptionalLong f305484C = OptionalLong.empty();

    /* renamed from: D */
    private C109684x f305485D = C109684x.UNKNOWN;

    /* renamed from: E */
    private Optional f305486E = Optional.empty();

    /* renamed from: F */
    private boolean f305487F = false;

    /* renamed from: G */
    private final Optional f305488G;

    /* renamed from: H */
    private Optional f305489H;

    /* renamed from: I */
    private final C109658ac f305490I;

    /* renamed from: J */
    private Optional f305491J;

    /* renamed from: K */
    private final C109714ms f305492K;

    /* renamed from: b */
    public final C86124t f305493b;

    /* renamed from: c */
    public final C14113an f305494c;

    /* renamed from: d */
    public final C14115ap f305495d;

    /* renamed from: e */
    public final C14648a f305496e;

    /* renamed from: f */
    public final Context f305497f;

    /* renamed from: g */
    BroadcastReceiver f305498g;

    /* renamed from: h */
    public final C2332ag f305499h = new C2332ag();

    /* renamed from: i */
    public final C14096x f305500i;

    /* renamed from: j */
    public final AtomicReference f305501j = new AtomicReference(C17823i.UNKNOWN);

    /* renamed from: k */
    public final C14638a f305502k;

    /* renamed from: l */
    public final boolean f305503l;

    /* renamed from: m */
    public final boolean f305504m;

    /* renamed from: n */
    C60872cz f305505n;

    /* renamed from: o */
    public Optional f305506o = Optional.empty();

    /* renamed from: p */
    final UiModeManager f305507p;

    /* renamed from: q */
    public final C69464a f305508q;

    /* renamed from: r */
    public final C109477a f305509r;

    /* renamed from: t */
    private final Executor f305510t;

    /* renamed from: u */
    private final Executor f305511u;

    /* renamed from: v */
    private final Executor f305512v;

    /* renamed from: w */
    private final Optional f305513w;

    /* renamed from: x */
    private final AtomicReference f305514x = new AtomicReference(C51474ja.UNKNOWN);

    /* renamed from: y */
    private final AtomicReference f305515y = new AtomicReference(C0027c.OFF);

    /* renamed from: z */
    private final C60888db f305516z;

    public C109685y(Context context, C86124t tVar, C14113an anVar, C14115ap apVar, C109477a aVar, C14648a aVar2, Executor executor, Executor executor2, Executor executor3, C60888db dbVar, Optional optional, C109714ms msVar, C14096x xVar, Optional optional2, C109658ac acVar, C69464a aVar3, C21370a aVar4, C14638a aVar5) {
        C14096x xVar2 = xVar;
        this.f305493b = tVar;
        this.f305494c = anVar;
        this.f305495d = apVar;
        this.f305507p = (UiModeManager) context.getSystemService("uimode");
        context.getPackageManager();
        this.f305509r = aVar;
        this.f305496e = aVar2;
        this.f305510t = executor;
        this.f305512v = executor2;
        this.f305511u = executor3;
        this.f305497f = context;
        boolean e = tVar.mo79746e(C90051dc.f248912i);
        this.f305503l = e;
        if (!e) {
            executor.execute(C47810es.m84977q(new C109678r(this)));
        }
        this.f305513w = optional;
        this.f305492K = msVar;
        this.f305500i = xVar2;
        this.f305488G = optional2;
        this.f305489H = Optional.empty();
        this.f305490I = acVar;
        this.f305508q = aVar3;
        this.f305516z = dbVar;
        this.f305482A = aVar4;
        this.f305502k = aVar5;
        this.f305504m = tVar.mo79746e(C90051dc.f248903ce);
        this.f305483B = tVar.mo79746e(C90051dc.f248901cc);
        this.f305491J = Optional.empty();
        C58976aa aaVar = C58975e.f156826a;
        this.f305498g = new C109682v(this);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.CONFIGURATION_CHANGED");
        context.getClass();
        context.registerReceiver(this.f305498g, intentFilter);
        synchronized (this) {
            this.f305485D = C109684x.INITIALIZING;
        }
        C60870cx d = xVar2.f42764b.mo46042d();
        C109683w wVar = new C109683w(this);
        C60856cj.m92911t(d, C47810es.m84974n(wVar), C60826bg.f164896a);
    }

    /* renamed from: F */
    private final void m182554F(MorrisRunningStatus morrisRunningStatus) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f305493b.mo79746e(C90126fx.f251567lJ) && this.f305513w.isPresent()) {
            ((bq) this.f305513w.get()).o(morrisRunningStatus);
        }
    }

    /* renamed from: G */
    private final void m182555G() {
        C60872cz czVar = this.f305505n;
        if (czVar != null) {
            if (!czVar.isDone() || !this.f305505n.isCancelled()) {
                this.f305505n.cancel(false);
                C58976aa aaVar = C58975e.f156826a;
            }
            this.f305505n = null;
        }
    }

    /* renamed from: H */
    private final void m182556H(C17823i iVar) {
        if (!this.f305503l) {
            this.f305510t.execute(C47810es.m84977q(new C109677q(this, iVar)));
        } else if (Optional.ofNullable(this.f305509r.f304937b).isPresent()) {
            this.f305510t.execute(C47810es.m84977q(new C109676p(this, iVar)));
        }
    }

    /* renamed from: A */
    public final void mo97975A() {
        if (!Optional.ofNullable(this.f305509r.f304937b).isPresent() || !mo97977C()) {
            C58976aa aaVar = C58975e.f156826a;
            mo97985f();
            m182554F(MorrisRunningStatus.c);
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        this.f305495d.mo21431e(C37182a.f98077fr.mo40813g());
        this.f305509r.mo97853b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo97976B() {
        C51474ja jaVar;
        synchronized (this) {
            this.f305485D = C109684x.NOT_RUNNING;
            jaVar = this.f305486E.isPresent() ? (C51474ja) this.f305486E.get() : null;
        }
        if (jaVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            mo97979E(jaVar);
        }
    }

    /* renamed from: C */
    public final boolean mo97977C() {
        C109684x xVar;
        synchronized (this) {
            xVar = this.f305485D;
        }
        return xVar == C109684x.STARTING || xVar == C109684x.RUNNING;
    }

    /* renamed from: D */
    public final boolean mo97978D() {
        DisplayCutout cutout;
        Display defaultDisplay = C14649e.m30711b(this.f305497f).getDefaultDisplay();
        if (!this.f305504m || !this.f305493b.mo79746e(C90051dc.f248914k) || defaultDisplay.getRotation() != 2 || (cutout = defaultDisplay.getCutout()) == null || cutout.getBoundingRects().isEmpty() || cutout.getSafeInsetBottom() <= 0) {
            return false;
        }
        return true;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: E */
    public final synchronized boolean mo97979E(com.google.assistant.p3897e.p3917i.p3918a.C51474ja r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.x r0 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109684x.UNKNOWN     // Catch:{ all -> 0x0215 }
            com.google.android.libraries.assistant.d.b.i r0 = com.google.android.libraries.assistant.p1467d.p1471b.C17823i.UNKNOWN     // Catch:{ all -> 0x0215 }
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.x r0 = r7.f305485D     // Catch:{ all -> 0x0215 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0215 }
            r1 = 0
            if (r0 == 0) goto L_0x01ff
            r2 = 3
            r3 = 1
            if (r0 == r3) goto L_0x0086
            r4 = 2
            if (r0 == r4) goto L_0x0073
            if (r0 == r2) goto L_0x0086
            r2 = 4
            if (r0 == r2) goto L_0x0050
            r2 = 5
            if (r0 == r2) goto L_0x003d
            com.google.common.f.e r8 = f305480a     // Catch:{ all -> 0x0215 }
            com.google.common.f.x r8 = r8.mo56226d()     // Catch:{ all -> 0x0215 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0215 }
            java.lang.String r2 = "Morris.StateImpl"
            r8.mo56378ag(r0, r2)     // Catch:{ all -> 0x0215 }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x0215 }
            r0 = 25085(0x61fd, float:3.5152E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r0)     // Catch:{ all -> 0x0215 }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x0215 }
            java.lang.String r0 = "#startMorrisByEnablingCarMode(): invalid morrisLifecycleState: %s"
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.x r2 = r7.f305485D     // Catch:{ all -> 0x0215 }
            r8.mo56389s(r0, r2)     // Catch:{ all -> 0x0215 }
            monitor-exit(r7)
            return r1
        L_0x003d:
            com.google.android.libraries.assistant.auto.tng.morris.c.an r0 = r7.f305494c     // Catch:{ all -> 0x0215 }
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97981eA     // Catch:{ all -> 0x0215 }
            com.google.android.libraries.search.b.i.a r2 = r2.mo40813g()     // Catch:{ all -> 0x0215 }
            r0.mo21424b(r2)     // Catch:{ all -> 0x0215 }
            j$.util.Optional r8 = p3186j$.util.Optional.m71637of(r8)     // Catch:{ all -> 0x0215 }
            r7.f305486E = r8     // Catch:{ all -> 0x0215 }
            monitor-exit(r7)
            return r1
        L_0x0050:
            com.google.android.libraries.assistant.auto.tng.morris.c.an r8 = r7.f305494c     // Catch:{ all -> 0x0215 }
            com.google.android.libraries.search.b.i.f r0 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97983eC     // Catch:{ all -> 0x0215 }
            com.google.net.a.a.b r2 = com.google.net.p4726a.p4727a.C62722b.FAILED_PRECONDITION     // Catch:{ all -> 0x0215 }
            com.google.android.libraries.search.b.i.a r0 = r0.mo40805c(r2)     // Catch:{ all -> 0x0215 }
            r8.mo21423a(r0)     // Catch:{ all -> 0x0215 }
            com.google.common.f.e r8 = f305480a     // Catch:{ all -> 0x0215 }
            com.google.common.f.x r8 = r8.mo56226d()     // Catch:{ all -> 0x0215 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0215 }
            java.lang.String r2 = "Morris.StateImpl"
            r8.mo56378ag(r0, r2)     // Catch:{ all -> 0x0215 }
            java.lang.String r0 = "#startMorrisByEnablingCarMode(): invalid transition from RUNNING to STARTING"
            r2 = 25089(0x6201, float:3.5157E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r2)).mo56386p(r0)     // Catch:{ all -> 0x0215 }
            monitor-exit(r7)
            return r1
        L_0x0073:
            com.google.android.libraries.assistant.auto.tng.morris.c.an r0 = r7.f305494c     // Catch:{ all -> 0x0215 }
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97982eB     // Catch:{ all -> 0x0215 }
            com.google.android.libraries.search.b.i.a r2 = r2.mo40813g()     // Catch:{ all -> 0x0215 }
            r0.mo21424b(r2)     // Catch:{ all -> 0x0215 }
            j$.util.Optional r8 = p3186j$.util.Optional.m71637of(r8)     // Catch:{ all -> 0x0215 }
            r7.f305486E = r8     // Catch:{ all -> 0x0215 }
            monitor-exit(r7)
            return r1
        L_0x0086:
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r0 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab.ELIGIBLE     // Catch:{ all -> 0x0215 }
            com.google.common.b.ij r4 = f305481s     // Catch:{ all -> 0x0215 }
            boolean r5 = r4.contains(r8)     // Catch:{ all -> 0x0215 }
            if (r5 != 0) goto L_0x00f7
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ac r0 = r7.f305490I     // Catch:{ all -> 0x0215 }
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r0 = r0.mo97941a()     // Catch:{ all -> 0x0215 }
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r5 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab.ELIGIBLE     // Catch:{ all -> 0x0215 }
            if (r0 == r5) goto L_0x009b
            goto L_0x00f7
        L_0x009b:
            monitor-enter(r7)     // Catch:{ all -> 0x0215 }
            android.app.UiModeManager r0 = r7.f305507p     // Catch:{ all -> 0x00f4 }
            int r0 = r0.getCurrentModeType()     // Catch:{ all -> 0x00f4 }
            if (r0 != r2) goto L_0x00da
            com.google.common.f.e r0 = f305480a     // Catch:{ all -> 0x00f4 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x00f4 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00f4 }
            java.lang.String r5 = "Morris.StateImpl"
            r0.mo56378ag(r2, r5)     // Catch:{ all -> 0x00f4 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x00f4 }
            com.google.common.f.aa r2 = com.google.android.libraries.search.integrations.p3018c.C38505d.f101864b     // Catch:{ all -> 0x00f4 }
            r5 = 169183981(0xa158aed, float:7.200218E-33)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00f4 }
            r0.mo56378ag(r2, r5)     // Catch:{ all -> 0x00f4 }
            r2 = 25035(0x61cb, float:3.5082E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ all -> 0x00f4 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x00f4 }
            java.lang.String r2 = "NOT qualified to launch Morris! Carmode is already enabled"
            r0.mo56386p(r2)     // Catch:{ all -> 0x00f4 }
            com.google.android.apps.gsa.search.core.i.t r0 = r7.f305493b     // Catch:{ all -> 0x00f4 }
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248858bM     // Catch:{ all -> 0x00f4 }
            boolean r0 = r0.mo79746e(r2)     // Catch:{ all -> 0x00f4 }
            if (r0 != 0) goto L_0x00da
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r0 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab.NOT_ELIGIBLE_DISABLED_BY_CAR_MODE_ALREADY_ENABLED     // Catch:{ all -> 0x00f4 }
            monitor-exit(r7)     // Catch:{ all -> 0x00f4 }
            goto L_0x00f7
        L_0x00da:
            monitor-exit(r7)     // Catch:{ all -> 0x00f4 }
            boolean r0 = r7.mo97995p()     // Catch:{ all -> 0x0215 }
            if (r0 == 0) goto L_0x00e6
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0215 }
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r0 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab.NOT_ELIGIBLE_DISABLED_BY_LANDSCAPE     // Catch:{ all -> 0x0215 }
            goto L_0x00f7
        L_0x00e6:
            boolean r0 = r7.mo97978D()     // Catch:{ all -> 0x0215 }
            if (r0 == 0) goto L_0x00f1
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0215 }
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r0 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab.NOT_ELIGIBLE_DISABLED_BY_UPSIDE_DOWN     // Catch:{ all -> 0x0215 }
            goto L_0x00f7
        L_0x00f1:
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r0 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab.ELIGIBLE     // Catch:{ all -> 0x0215 }
            goto L_0x00f7
        L_0x00f4:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00f4 }
            throw r8     // Catch:{ all -> 0x0215 }
        L_0x00f7:
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.ab r2 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab.ELIGIBLE     // Catch:{ all -> 0x0215 }
            boolean r2 = r0.equals(r2)     // Catch:{ all -> 0x0215 }
            if (r2 == 0) goto L_0x01e6
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0215 }
            com.google.android.libraries.assistant.auto.tng.morris.c.an r0 = r7.f305494c     // Catch:{ all -> 0x0215 }
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98013eg     // Catch:{ all -> 0x0215 }
            com.google.android.libraries.search.b.i.a r2 = r2.mo40813g()     // Catch:{ all -> 0x0215 }
            r0.mo21424b(r2)     // Catch:{ all -> 0x0215 }
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.x r0 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109684x.STARTING     // Catch:{ all -> 0x0215 }
            r7.f305485D = r0     // Catch:{ all -> 0x0215 }
            com.google.android.apps.gsa.search.core.i.t r0 = r7.f305493b     // Catch:{ all -> 0x0215 }
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251567lJ     // Catch:{ all -> 0x0215 }
            boolean r0 = r0.mo79746e(r2)     // Catch:{ all -> 0x0215 }
            if (r0 != 0) goto L_0x0124
            com.google.android.apps.gsa.search.core.i.t r0 = r7.f305493b     // Catch:{ all -> 0x0215 }
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248803aK     // Catch:{ all -> 0x0215 }
            boolean r0 = r0.mo79746e(r2)     // Catch:{ all -> 0x0215 }
            if (r0 == 0) goto L_0x0129
        L_0x0124:
            com.google.android.apps.gsa.staticplugins.opa.ms r0 = r7.f305492K     // Catch:{ all -> 0x0215 }
            r0.mo98044a()     // Catch:{ all -> 0x0215 }
        L_0x0129:
            monitor-enter(r7)     // Catch:{ all -> 0x0215 }
            r7.mo97990k(r3)     // Catch:{ all -> 0x01e3 }
            com.google.android.libraries.f.a r0 = r7.f305482A     // Catch:{ all -> 0x01e3 }
            long r5 = r0.mo26871c()     // Catch:{ all -> 0x01e3 }
            j$.time.Instant r0 = p3186j$.time.Instant.ofEpochMilli(r5)     // Catch:{ all -> 0x01e3 }
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)     // Catch:{ all -> 0x01e3 }
            r7.f305491J = r0     // Catch:{ all -> 0x01e3 }
            j$.util.Optional r0 = r7.f305488G     // Catch:{ all -> 0x01e3 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01e3 }
            if (r0 == 0) goto L_0x015a
            com.google.common.f.e r0 = f305480a     // Catch:{ all -> 0x01e3 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x01e3 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01e3 }
            java.lang.String r5 = "Morris.StateImpl"
            r0.mo56378ag(r2, r5)     // Catch:{ all -> 0x01e3 }
            java.lang.String r2 = "#startMorrisSessionTimer(): primesWrapper not presented!"
            r5 = 25071(0x61ef, float:3.5132E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r2)     // Catch:{ all -> 0x01e3 }
            goto L_0x01a4
        L_0x015a:
            j$.util.Optional r0 = r7.f305489H     // Catch:{ all -> 0x01e3 }
            boolean r0 = r0.isPresent()     // Catch:{ all -> 0x01e3 }
            if (r0 == 0) goto L_0x0176
            com.google.common.f.e r0 = f305480a     // Catch:{ all -> 0x01e3 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x01e3 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01e3 }
            java.lang.String r5 = "Morris.StateImpl"
            r0.mo56378ag(r2, r5)     // Catch:{ all -> 0x01e3 }
            java.lang.String r2 = "#startMorrisSessionTimer(): Previous morrisSessionTimerEvent is not stopped!"
            r5 = 25070(0x61ee, float:3.513E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r2)     // Catch:{ all -> 0x01e3 }
        L_0x0176:
            j$.util.Optional r0 = r7.f305488G     // Catch:{ all -> 0x01e3 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01e3 }
            com.google.android.apps.gsa.staticplugins.cn.e r0 = (com.google.android.apps.gsa.staticplugins.p7684cn.C98043e) r0     // Catch:{ all -> 0x01e3 }
            com.google.android.libraries.performance.primes.ax r0 = r0.f273769a     // Catch:{ all -> 0x01e3 }
            com.google.android.libraries.performance.primes.metrics.i.m r0 = r0.mo36912c()     // Catch:{ all -> 0x01e3 }
            j$.util.Optional r0 = p3186j$.util.Optional.ofNullable(r0)     // Catch:{ all -> 0x01e3 }
            r7.f305489H = r0     // Catch:{ all -> 0x01e3 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01e3 }
            if (r0 == 0) goto L_0x01a4
            com.google.common.f.e r0 = f305480a     // Catch:{ all -> 0x01e3 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x01e3 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01e3 }
            java.lang.String r5 = "Morris.StateImpl"
            r0.mo56378ag(r2, r5)     // Catch:{ all -> 0x01e3 }
            java.lang.String r2 = "#startMorrisSessionTimer(): morrisSessionTimer is not started!"
            r5 = 25069(0x61ed, float:3.5129E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r2)     // Catch:{ all -> 0x01e3 }
        L_0x01a4:
            java.util.concurrent.atomic.AtomicReference r0 = r7.f305514x     // Catch:{ all -> 0x01e3 }
            r0.set(r8)     // Catch:{ all -> 0x01e3 }
            com.google.android.apps.gsa.assistant.shared.MorrisRunningStatus r0 = com.google.android.apps.gsa.assistant.shared.MorrisRunningStatus.b     // Catch:{ all -> 0x01e3 }
            r7.m182554F(r0)     // Catch:{ all -> 0x01e3 }
            boolean r8 = r4.contains(r8)     // Catch:{ all -> 0x01e3 }
            if (r8 != 0) goto L_0x01db
            boolean r8 = r7.f305504m     // Catch:{ all -> 0x01e3 }
            if (r8 == 0) goto L_0x01cf
            android.os.IBinder r8 = r7.mo97980a()     // Catch:{ all -> 0x01e3 }
            if (r8 != 0) goto L_0x01c0
            monitor-exit(r7)     // Catch:{ all -> 0x01e3 }
            goto L_0x01e1
        L_0x01c0:
            java.util.concurrent.Executor r8 = r7.f305510t     // Catch:{ all -> 0x01e3 }
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.t r0 = new com.google.android.apps.gsa.staticplugins.opa.morris2.h.t     // Catch:{ all -> 0x01e3 }
            r0.<init>(r7)     // Catch:{ all -> 0x01e3 }
            java.lang.Runnable r0 = com.google.apps.tiktok.tracing.C47810es.m84977q(r0)     // Catch:{ all -> 0x01e3 }
            r8.execute(r0)     // Catch:{ all -> 0x01e3 }
            goto L_0x01db
        L_0x01cf:
            android.content.Context r8 = r7.f305497f     // Catch:{ all -> 0x01e3 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x01e3 }
            java.lang.String r2 = "com.google.android.apps.gsa.staticplugins.opa.morris.notification.INTENT_ACTION_ENTER_MORRIS_WITHOUT_CARMODE"
            r0.<init>(r2)     // Catch:{ all -> 0x01e3 }
            r8.sendBroadcast(r0)     // Catch:{ all -> 0x01e3 }
        L_0x01db:
            android.app.UiModeManager r8 = r7.f305507p     // Catch:{ all -> 0x01e3 }
            r8.enableCarMode(r1)     // Catch:{ all -> 0x01e3 }
            monitor-exit(r7)     // Catch:{ all -> 0x01e3 }
        L_0x01e1:
            monitor-exit(r7)
            return r3
        L_0x01e3:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01e3 }
            throw r8     // Catch:{ all -> 0x0215 }
        L_0x01e6:
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0215 }
            com.google.android.libraries.assistant.auto.tng.morris.c.an r8 = r7.f305494c     // Catch:{ all -> 0x0215 }
            com.google.common.b.hd r2 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109658ac.f305405b     // Catch:{ all -> 0x0215 }
            com.google.android.libraries.search.b.i.f r3 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98014eh     // Catch:{ all -> 0x0215 }
            com.google.net.a.a.b r4 = com.google.net.p4726a.p4727a.C62722b.CANCELLED     // Catch:{ all -> 0x0215 }
            com.google.android.libraries.search.b.i.a r3 = r3.mo40805c(r4)     // Catch:{ all -> 0x0215 }
            java.lang.Object r0 = r2.getOrDefault(r0, r3)     // Catch:{ all -> 0x0215 }
            com.google.android.libraries.search.b.i.a r0 = (com.google.android.libraries.search.p2871b.p2895i.C37252a) r0     // Catch:{ all -> 0x0215 }
            r8.mo21423a(r0)     // Catch:{ all -> 0x0215 }
            monitor-exit(r7)
            return r1
        L_0x01ff:
            com.google.common.f.e r8 = f305480a     // Catch:{ all -> 0x0215 }
            com.google.common.f.x r8 = r8.mo56226d()     // Catch:{ all -> 0x0215 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0215 }
            java.lang.String r2 = "Morris.StateImpl"
            r8.mo56378ag(r0, r2)     // Catch:{ all -> 0x0215 }
            java.lang.String r0 = "#startMorrisByEnablingCarMode(): invalid transition from UNKNOWN to STARTING"
            r2 = 25088(0x6200, float:3.5156E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r2)).mo56386p(r0)     // Catch:{ all -> 0x0215 }
            monitor-exit(r7)
            return r1
        L_0x0215:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109685y.mo97979E(com.google.assistant.e.i.a.ja):boolean");
    }

    /* renamed from: a */
    public final synchronized IBinder mo97980a() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f305506o.isEmpty()) {
            C59104x c = f305480a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.StateImpl");
            ((C59052c) ((C59052c) c).mo56372aa(25032)).mo56386p("#getWindowToken(): Token is not present");
            this.f305494c.mo21423a(C37182a.f97988eH.mo40805c(C62722b.ABORTED));
            if (this.f305503l) {
                this.f305501j.set(C17823i.UNKNOWN);
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f305499h.mo5708l(C17823i.UNKNOWN);
            } else {
                this.f305510t.execute(C47810es.m84977q(new C109671k(this)));
                return null;
            }
            mo97975A();
            return null;
        }
        return (IBinder) this.f305506o.get();
    }

    /* renamed from: b */
    public final LiveData mo97981b() {
        return this.f305499h;
    }

    /* renamed from: c */
    public final C17823i mo97982c() {
        return (C17823i) this.f305501j.get();
    }

    /* renamed from: d */
    public final C51474ja mo97983d() {
        return (C51474ja) this.f305514x.get();
    }

    /* renamed from: e */
    public final Duration mo97984e() {
        if (this.f305491J.isPresent()) {
            return Duration.between((Temporal) this.f305491J.get(), Instant.ofEpochMilli(this.f305482A.mo26871c()));
        }
        return Duration.ZERO;
    }

    /* renamed from: f */
    public final void mo97985f() {
        C58976aa aaVar = C58975e.f156826a;
        mo98001v(2);
        synchronized (this) {
            if (this.f305507p.getCurrentModeType() == 3) {
                C59104x c = f305480a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Morris.StateImpl");
                C59052c cVar = (C59052c) c;
                cVar.mo56378ag(C38505d.f101864b, 183518831);
                ((C59052c) cVar.mo56372aa(25051)).mo56386p("Car mode is still on when executing MorrisState.onMorrisStop");
                this.f305507p.disableCarMode(0);
            }
            mo98005z();
            mo97992m(C0027c.OFF);
            this.f305511u.execute(new C109672l(this));
        }
    }

    /* renamed from: g */
    public final void mo97986g(C17823i iVar, String str, Optional optional) {
        C109684x xVar;
        C58976aa aaVar = C58975e.f156826a;
        if (((Boolean) this.f305508q.mo17428b()).booleanValue()) {
            if (this.f305493b.mo79746e(C90051dc.f248897bz) && iVar == C17823i.STOPPED) {
                this.f305500i.f42764b.mo46040b(C14089q.f42756a, C60826bg.f164896a);
                C109658ac acVar = this.f305490I;
                C60870cx d = acVar.f305407d.mo21590d(C52686as.f138291q);
                C109656aa aaVar2 = new C109656aa();
                C60856cj.m92911t(d, C47810es.m84974n(aaVar2), acVar.f305408e);
            }
            if (this.f305493b.mo79746e(C90051dc.f248870bY) && optional.isPresent() && !((Boolean) optional.get()).booleanValue()) {
                if (mo97977C()) {
                    C59104x d2 = f305480a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "Morris.StateImpl");
                    C59052c cVar = (C59052c) ((C59052c) d2).mo56372aa(25055);
                    synchronized (this) {
                        xVar = this.f305485D;
                    }
                    cVar.mo56354G("#onNavigationStateChanged(%s): host app check for Morris eligibilty was false, but morrisLifecycleState is %s", iVar, xVar);
                } else {
                    return;
                }
            }
            if (this.f305493b.mo79743a(C90051dc.f248889br) > 0) {
                m182555G();
                if (this.f305484C.isPresent()) {
                    if (iVar == C17823i.STOPPED) {
                        this.f305484C = OptionalLong.empty();
                    } else {
                        long a = this.f305493b.mo79743a(C90051dc.f248889br) - (this.f305482A.mo26870b() - this.f305484C.getAsLong());
                        if (a > 0) {
                            this.f305505n = this.f305516z.mo29164d(new C109673m(this, iVar, str), a, TimeUnit.MILLISECONDS);
                            return;
                        }
                        this.f305484C = OptionalLong.empty();
                    }
                }
            } else if (iVar != C17823i.RUNNING_IN_BACKGROUND || !this.f305484C.isPresent() || this.f305482A.mo26870b() - this.f305484C.getAsLong() > 1000 || this.f305493b.mo79743a(C90051dc.f248888bq) <= 0) {
                m182555G();
            } else {
                this.f305505n = this.f305516z.mo29164d(new C109679s(this, iVar, str), this.f305493b.mo79743a(C90051dc.f248888bq), TimeUnit.MILLISECONDS);
                this.f305484C = OptionalLong.empty();
                return;
            }
            mo98004y(iVar, str);
        }
    }

    /* renamed from: h */
    public final void mo97987h() {
        C58976aa aaVar = C58975e.f156826a;
        if (!((Boolean) this.f305508q.mo17428b()).booleanValue()) {
            C59104x d = f305480a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.StateImpl");
            ((C59052c) ((C59052c) d).mo56372aa(25060)).mo56386p("#onNightModeStatusChanged(): called when Morris is not enabled.");
        } else if (!Optional.ofNullable(this.f305509r.f304937b).isPresent() || !mo97996q()) {
            C59104x d2 = f305480a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "Morris.StateImpl");
            ((C59052c) ((C59052c) d2).mo56372aa(25059)).mo56386p("#onNightModeStatusChanged(): MorrisMiniController is absent or not resumed.");
        } else {
            ((ax) Optional.ofNullable(this.f305509r.f304937b).get()).d();
        }
    }

    /* renamed from: i */
    public final synchronized void mo97988i(IBinder iBinder) {
        C58976aa aaVar = C58975e.f156826a;
        this.f305506o = Optional.m71637of(iBinder);
    }

    /* renamed from: j */
    public final void mo97989j(C17829o oVar) {
        C58976aa aaVar = C58975e.f156826a;
        oVar.name();
        if (!((Boolean) this.f305508q.mo17428b()).booleanValue()) {
            C59104x d = f305480a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.StateImpl");
            ((C59052c) ((C59052c) d).mo56372aa(25064)).mo56386p("#onUiSuppressionLevelChanged(): called when Morris is not enabled.");
        } else if (!Optional.ofNullable(this.f305509r.f304937b).isPresent()) {
            C59104x d2 = f305480a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "Morris.StateImpl");
            ((C59052c) ((C59052c) d2).mo56372aa(25063)).mo56386p("#onUiSuppressionLevelChanged(): MorrisController is absent.");
        } else if (oVar != C17829o.UI_SUPPRESSION_LEVEL_UNKNOWN) {
            ((ax) Optional.ofNullable(this.f305509r.f304937b).get()).e(oVar);
        }
    }

    /* renamed from: k */
    public final void mo97990k(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this) {
            this.f305487F = z;
        }
        this.f305512v.execute(C47810es.m84977q(new C109674n(this, z)));
    }

    /* renamed from: l */
    public final void mo97991l() {
        this.f305484C = OptionalLong.m71641of(this.f305482A.mo26870b());
    }

    /* renamed from: m */
    public final void mo97992m(C0027c cVar) {
        if (cVar.equals(C0027c.MINI) || cVar.equals(C0027c.DRIVING_SCREEN)) {
            synchronized (this) {
                this.f305485D = C109684x.RUNNING;
            }
        }
        this.f305515y.set(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x015e, code lost:
        m182554F(com.google.android.apps.gsa.assistant.shared.MorrisRunningStatus.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0163, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97993n(p3186j$.util.Optional r5) {
        /*
            r4 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.common.f.ad r0 = com.google.common.p4526f.C58979ad.FULL
            java.lang.String r1 = "stack size"
            com.google.common.p4526f.p4534f.C59081b.m91349a(r0, r1)
            g.a.a r0 = r4.f305508q
            r0.mo17428b()
            g.a.a r0 = r4.f305508q
            java.lang.Object r0 = r0.mo17428b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            java.util.concurrent.Executor r0 = r4.f305510t
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.o r1 = new com.google.android.apps.gsa.staticplugins.opa.morris2.h.o
            r1.<init>(r4, r5)
            java.lang.Runnable r5 = com.google.apps.tiktok.tracing.C47810es.m84977q(r1)
            r0.execute(r5)
            monitor-enter(r4)
            j$.util.Optional r5 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x0164 }
            r4.f305486E = r5     // Catch:{ all -> 0x0164 }
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.x r5 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109684x.UNKNOWN     // Catch:{ all -> 0x0164 }
            com.google.android.libraries.assistant.d.b.i r5 = com.google.android.libraries.assistant.p1467d.p1471b.C17823i.UNKNOWN     // Catch:{ all -> 0x0164 }
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.x r5 = r4.f305485D     // Catch:{ all -> 0x0164 }
            int r5 = r5.ordinal()     // Catch:{ all -> 0x0164 }
            r0 = 179302524(0xaaff07c, float:1.6942347E-32)
            if (r5 == 0) goto L_0x00c7
            r1 = 1
            if (r5 == r1) goto L_0x00a1
            r1 = 2
            if (r5 == r1) goto L_0x007b
            r0 = 5
            if (r5 == r0) goto L_0x004c
            goto L_0x00ec
        L_0x004c:
            com.google.android.libraries.assistant.auto.tng.morris.c.ap r5 = r4.f305495d     // Catch:{ all -> 0x0164 }
            com.google.android.libraries.search.b.i.f r0 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98066fg     // Catch:{ all -> 0x0164 }
            com.google.net.a.a.b r1 = com.google.net.p4726a.p4727a.C62722b.CANCELLED     // Catch:{ all -> 0x0164 }
            com.google.android.libraries.search.b.i.a r0 = r0.mo40805c(r1)     // Catch:{ all -> 0x0164 }
            j$.time.Duration r1 = r4.mo97984e()     // Catch:{ all -> 0x0164 }
            r5.mo21428b(r0, r1)     // Catch:{ all -> 0x0164 }
            com.google.common.f.e r5 = f305480a     // Catch:{ all -> 0x0164 }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ all -> 0x0164 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0164 }
            java.lang.String r1 = "Morris.StateImpl"
            r5.mo56378ag(r0, r1)     // Catch:{ all -> 0x0164 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0164 }
            r0 = 25074(0x61f2, float:3.5136E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r0)     // Catch:{ all -> 0x0164 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = "#stopMorris() is called when Morris is stopping."
            r5.mo56386p(r0)     // Catch:{ all -> 0x0164 }
            monitor-exit(r4)     // Catch:{ all -> 0x0164 }
            return
        L_0x007b:
            com.google.common.f.e r5 = f305480a     // Catch:{ all -> 0x0164 }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ all -> 0x0164 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0164 }
            java.lang.String r2 = "Morris.StateImpl"
            r5.mo56378ag(r1, r2)     // Catch:{ all -> 0x0164 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0164 }
            com.google.common.f.aa r1 = com.google.android.libraries.search.integrations.p3018c.C38505d.f101864b     // Catch:{ all -> 0x0164 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0164 }
            r5.mo56378ag(r1, r0)     // Catch:{ all -> 0x0164 }
            r0 = 25077(0x61f5, float:3.514E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r0)     // Catch:{ all -> 0x0164 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = "#stopMorris() is called when Morris is initializing."
            r5.mo56386p(r0)     // Catch:{ all -> 0x0164 }
            goto L_0x00ec
        L_0x00a1:
            com.google.common.f.e r5 = f305480a     // Catch:{ all -> 0x0164 }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ all -> 0x0164 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0164 }
            java.lang.String r2 = "Morris.StateImpl"
            r5.mo56378ag(r1, r2)     // Catch:{ all -> 0x0164 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0164 }
            com.google.common.f.aa r1 = com.google.android.libraries.search.integrations.p3018c.C38505d.f101864b     // Catch:{ all -> 0x0164 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0164 }
            r5.mo56378ag(r1, r0)     // Catch:{ all -> 0x0164 }
            r0 = 25075(0x61f3, float:3.5138E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r0)     // Catch:{ all -> 0x0164 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = "#stopMorris() is called when Morris is not running."
            r5.mo56386p(r0)     // Catch:{ all -> 0x0164 }
            goto L_0x00ec
        L_0x00c7:
            com.google.common.f.e r5 = f305480a     // Catch:{ all -> 0x0164 }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ all -> 0x0164 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0164 }
            java.lang.String r2 = "Morris.StateImpl"
            r5.mo56378ag(r1, r2)     // Catch:{ all -> 0x0164 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0164 }
            com.google.common.f.aa r1 = com.google.android.libraries.search.integrations.p3018c.C38505d.f101864b     // Catch:{ all -> 0x0164 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0164 }
            r5.mo56378ag(r1, r0)     // Catch:{ all -> 0x0164 }
            r0 = 25076(0x61f4, float:3.5139E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r0)     // Catch:{ all -> 0x0164 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0164 }
            java.lang.String r0 = "#stopMorris() is called when Morris has not been initialized."
            r5.mo56386p(r0)     // Catch:{ all -> 0x0164 }
        L_0x00ec:
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.x r5 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109684x.STOPPING     // Catch:{ all -> 0x0164 }
            r4.f305485D = r5     // Catch:{ all -> 0x0164 }
            boolean r5 = r4.mo97994o()     // Catch:{ all -> 0x0164 }
            if (r5 == 0) goto L_0x0149
            boolean r5 = r4.mo97996q()     // Catch:{ all -> 0x0164 }
            android.app.UiModeManager r0 = r4.f305507p     // Catch:{ all -> 0x0164 }
            int r0 = r0.getCurrentModeType()     // Catch:{ all -> 0x0164 }
            r1 = 3
            if (r0 == r1) goto L_0x012e
            com.google.common.f.e r0 = f305480a     // Catch:{ all -> 0x0164 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x0164 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0164 }
            java.lang.String r2 = "Morris.StateImpl"
            r0.mo56378ag(r1, r2)     // Catch:{ all -> 0x0164 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0164 }
            r1 = 25073(0x61f1, float:3.5135E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x0164 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0164 }
            java.lang.String r1 = "#stopMorris(): is called when CarMode is already disabled."
            r0.mo56386p(r1)     // Catch:{ all -> 0x0164 }
            com.google.android.libraries.assistant.auto.tng.morris.c.ap r0 = r4.f305495d     // Catch:{ all -> 0x0164 }
            com.google.android.libraries.search.b.i.g r1 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98067fh     // Catch:{ all -> 0x0164 }
            com.google.android.libraries.search.b.i.a r1 = r1.mo40813g()     // Catch:{ all -> 0x0164 }
            j$.time.Duration r2 = r4.mo97984e()     // Catch:{ all -> 0x0164 }
            r0.mo21430d(r1, r2)     // Catch:{ all -> 0x0164 }
        L_0x012e:
            android.app.UiModeManager r0 = r4.f305507p     // Catch:{ all -> 0x0164 }
            r1 = 0
            r0.disableCarMode(r1)     // Catch:{ all -> 0x0164 }
            com.google.android.libraries.assistant.auto.tng.morris.c.ap r0 = r4.f305495d     // Catch:{ all -> 0x0164 }
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98062fc     // Catch:{ all -> 0x0164 }
            com.google.android.libraries.search.b.i.a r2 = r2.mo40813g()     // Catch:{ all -> 0x0164 }
            j$.time.Duration r3 = r4.mo97984e()     // Catch:{ all -> 0x0164 }
            r0.mo21430d(r2, r3)     // Catch:{ all -> 0x0164 }
            r4.mo97990k(r1)     // Catch:{ all -> 0x0164 }
            if (r5 != 0) goto L_0x015d
            goto L_0x015a
        L_0x0149:
            com.google.android.libraries.assistant.auto.tng.morris.c.ap r5 = r4.f305495d     // Catch:{ all -> 0x0164 }
            com.google.android.libraries.search.b.i.f r0 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98068fi     // Catch:{ all -> 0x0164 }
            com.google.net.a.a.b r1 = com.google.net.p4726a.p4727a.C62722b.CANCELLED     // Catch:{ all -> 0x0164 }
            com.google.android.libraries.search.b.i.a r0 = r0.mo40805c(r1)     // Catch:{ all -> 0x0164 }
            j$.time.Duration r1 = r4.mo97984e()     // Catch:{ all -> 0x0164 }
            r5.mo21428b(r0, r1)     // Catch:{ all -> 0x0164 }
        L_0x015a:
            r4.mo97976B()     // Catch:{ all -> 0x0164 }
        L_0x015d:
            monitor-exit(r4)     // Catch:{ all -> 0x0164 }
            com.google.android.apps.gsa.assistant.shared.MorrisRunningStatus r5 = com.google.android.apps.gsa.assistant.shared.MorrisRunningStatus.c
            r4.m182554F(r5)
            return
        L_0x0164:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0164 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109685y.mo97993n(j$.util.Optional):void");
    }

    /* renamed from: o */
    public final synchronized boolean mo97994o() {
        return this.f305487F;
    }

    /* renamed from: p */
    public final boolean mo97995p() {
        return mo98003x() == 2;
    }

    /* renamed from: q */
    public final boolean mo97996q() {
        boolean z = false;
        if (Optional.ofNullable(this.f305509r.f304937b).isPresent() && ((ax) Optional.ofNullable(this.f305509r.f304937b).get()).f()) {
            z = true;
        }
        C58976aa aaVar = C58975e.f156826a;
        return z;
    }

    /* renamed from: r */
    public final boolean mo97997r() {
        return this.f305503l;
    }

    /* renamed from: s */
    public final boolean mo97998s() {
        return this.f305483B;
    }

    /* renamed from: t */
    public final boolean mo97999t() {
        return this.f305504m;
    }

    /* renamed from: u */
    public final void mo98000u(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (!((Boolean) this.f305508q.mo17428b()).booleanValue()) {
            C59104x d = f305480a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.StateImpl");
            ((C59052c) ((C59052c) d).mo56372aa(25049)).mo56386p("#onKeyguardDismissStatusChanged(): called when Morris is not enabled.");
        } else if (!Optional.ofNullable(this.f305509r.f304937b).isPresent()) {
            C59104x d2 = f305480a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "Morris.StateImpl");
            ((C59052c) ((C59052c) d2).mo56372aa(25048)).mo56386p("#onKeyguardDismissStatusChanged(): MorrisController is absent.");
        } else if (i != 1) {
            ((ax) Optional.ofNullable(this.f305509r.f304937b).get()).i(i);
        }
    }

    /* renamed from: v */
    public final void mo98001v(int i) {
        C58976aa aaVar = C58975e.f156826a;
        this.f305489H.isPresent();
        if (this.f305488G.isEmpty()) {
            C59104x c = f305480a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.StateImpl");
            ((C59052c) ((C59052c) c).mo56372aa(25082)).mo56386p("#stopMorrisSessionTimer(): primesWrapper not presented!");
        } else if (!this.f305489H.isEmpty()) {
            C31164au b = C31164au.m58092b("MorrisSession");
            ((C98043e) this.f305488G.get()).f273769a.mo36918j((C31520m) this.f305489H.get(), b, i);
            this.f305489H = Optional.empty();
        }
    }

    /* renamed from: w */
    public final void mo98002w(C51474ja jaVar) {
        C58976aa aaVar = C58975e.f156826a;
        mo97979E(jaVar);
    }

    /* renamed from: x */
    public final int mo98003x() {
        return this.f305497f.getResources().getConfiguration().orientation;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e4, code lost:
        return;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo98004y(com.google.android.libraries.assistant.p1467d.p1471b.C17823i r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.assistant.e.i.a.ja r0 = com.google.assistant.p3897e.p3917i.p3918a.C51474ja.UNKNOWN     // Catch:{ all -> 0x00e7 }
            boolean r1 = r4.f305503l     // Catch:{ all -> 0x00e7 }
            if (r1 == 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicReference r1 = r4.f305501j     // Catch:{ all -> 0x00e7 }
            java.lang.Object r1 = r1.getAndSet(r5)     // Catch:{ all -> 0x00e7 }
            com.google.android.libraries.assistant.d.b.i r1 = (com.google.android.libraries.assistant.p1467d.p1471b.C17823i) r1     // Catch:{ all -> 0x00e7 }
            goto L_0x0018
        L_0x0010:
            androidx.lifecycle.ag r1 = r4.f305499h     // Catch:{ all -> 0x00e7 }
            java.lang.Object r1 = r1.mo3842a()     // Catch:{ all -> 0x00e7 }
            com.google.android.libraries.assistant.d.b.i r1 = (com.google.android.libraries.assistant.p1467d.p1471b.C17823i) r1     // Catch:{ all -> 0x00e7 }
        L_0x0018:
            if (r1 == r5) goto L_0x00e5
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.x r2 = com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109684x.UNKNOWN     // Catch:{ all -> 0x00e7 }
            com.google.android.libraries.assistant.d.b.i r2 = com.google.android.libraries.assistant.p1467d.p1471b.C17823i.UNKNOWN     // Catch:{ all -> 0x00e7 }
            int r2 = r5.ordinal()     // Catch:{ all -> 0x00e7 }
            r3 = 1
            if (r2 == r3) goto L_0x009b
            r3 = 2
            if (r2 == r3) goto L_0x0084
            r3 = 3
            if (r2 == r3) goto L_0x0045
            r6 = 4
            if (r2 == r6) goto L_0x0043
            com.google.common.f.e r6 = f305480a     // Catch:{ all -> 0x00e7 }
            com.google.common.f.x r6 = r6.mo56226d()     // Catch:{ all -> 0x00e7 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00e7 }
            java.lang.String r1 = "Morris.StateImpl"
            r6.mo56378ag(r0, r1)     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "onNavigationStateChanged() is called with an unknown navigationState"
            r1 = 25043(0x61d3, float:3.5093E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r1)).mo56386p(r0)     // Catch:{ all -> 0x00e7 }
            goto L_0x0096
        L_0x0043:
            monitor-exit(r4)
            return
        L_0x0045:
            com.google.common.b.gu r2 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p881b.C13009a.f40419b     // Catch:{ all -> 0x00e7 }
            boolean r2 = r2.contains(r6)     // Catch:{ all -> 0x00e7 }
            if (r2 == 0) goto L_0x0050
            com.google.assistant.e.i.a.ja r0 = com.google.assistant.p3897e.p3917i.p3918a.C51474ja.GOOGLE_MAP     // Catch:{ all -> 0x00e7 }
            goto L_0x005a
        L_0x0050:
            com.google.common.b.gu r2 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p881b.C13009a.f40420c     // Catch:{ all -> 0x00e7 }
            boolean r6 = r2.contains(r6)     // Catch:{ all -> 0x00e7 }
            if (r6 == 0) goto L_0x005a
            com.google.assistant.e.i.a.ja r0 = com.google.assistant.p3897e.p3917i.p3918a.C51474ja.WAZE     // Catch:{ all -> 0x00e7 }
        L_0x005a:
            com.google.android.libraries.assistant.d.b.i r6 = com.google.android.libraries.assistant.p1467d.p1471b.C17823i.RUNNING_IN_BACKGROUND     // Catch:{ all -> 0x00e7 }
            if (r1 != r6) goto L_0x006a
            com.google.android.libraries.assistant.auto.tng.morris.c.an r6 = r4.f305494c     // Catch:{ all -> 0x00e7 }
            com.google.android.libraries.search.b.i.g r1 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97946dS     // Catch:{ all -> 0x00e7 }
            com.google.android.libraries.search.b.i.a r1 = r1.mo40813g()     // Catch:{ all -> 0x00e7 }
            r6.mo21425c(r1)     // Catch:{ all -> 0x00e7 }
            goto L_0x0075
        L_0x006a:
            com.google.android.libraries.assistant.auto.tng.morris.c.an r6 = r4.f305494c     // Catch:{ all -> 0x00e7 }
            com.google.android.libraries.search.b.i.g r1 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97992eL     // Catch:{ all -> 0x00e7 }
            com.google.android.libraries.search.b.i.a r1 = r1.mo40813g()     // Catch:{ all -> 0x00e7 }
            r6.mo21425c(r1)     // Catch:{ all -> 0x00e7 }
        L_0x0075:
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00e7 }
            boolean r6 = r4.mo97979E(r0)     // Catch:{ all -> 0x00e7 }
            if (r6 == 0) goto L_0x0082
            r4.m182556H(r5)     // Catch:{ all -> 0x00e7 }
            monitor-exit(r4)
            return
        L_0x0082:
            monitor-exit(r4)
            return
        L_0x0084:
            com.google.android.libraries.assistant.auto.tng.morris.c.ap r6 = r4.f305495d     // Catch:{ all -> 0x00e7 }
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98081fv     // Catch:{ all -> 0x00e7 }
            com.google.android.libraries.search.b.i.a r0 = r0.mo40813g()     // Catch:{ all -> 0x00e7 }
            r6.mo21431e(r0)     // Catch:{ all -> 0x00e7 }
            j$.util.Optional r6 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x00e7 }
            r4.mo97993n(r6)     // Catch:{ all -> 0x00e7 }
        L_0x0096:
            r4.m182556H(r5)     // Catch:{ all -> 0x00e7 }
            monitor-exit(r4)
            return
        L_0x009b:
            com.google.android.apps.gsa.search.core.i.t r6 = r4.f305493b     // Catch:{ all -> 0x00e7 }
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248859bN     // Catch:{ all -> 0x00e7 }
            boolean r6 = r6.mo79746e(r0)     // Catch:{ all -> 0x00e7 }
            if (r6 == 0) goto L_0x00a9
            com.google.android.libraries.assistant.d.b.i r6 = com.google.android.libraries.assistant.p1467d.p1471b.C17823i.RUNNING_IN_BACKGROUND     // Catch:{ all -> 0x00e7 }
            if (r1 == r6) goto L_0x00bb
        L_0x00a9:
            com.google.android.libraries.assistant.auto.tng.morris.c.ap r6 = r4.f305495d     // Catch:{ all -> 0x00e7 }
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98082fw     // Catch:{ all -> 0x00e7 }
            com.google.android.libraries.search.b.i.a r0 = r0.mo40813g()     // Catch:{ all -> 0x00e7 }
            r6.mo21431e(r0)     // Catch:{ all -> 0x00e7 }
            j$.util.Optional r6 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x00e7 }
            r4.mo97993n(r6)     // Catch:{ all -> 0x00e7 }
        L_0x00bb:
            r4.m182556H(r5)     // Catch:{ all -> 0x00e7 }
            boolean r5 = r4.f305504m     // Catch:{ all -> 0x00e7 }
            if (r5 == 0) goto L_0x00e3
            java.util.concurrent.Executor r5 = r4.f305510t     // Catch:{ all -> 0x00e7 }
            com.google.android.apps.gsa.staticplugins.opa.morris2.a r6 = r4.f305509r     // Catch:{ all -> 0x00e7 }
            p3186j$.util.Objects.requireNonNull(r6)     // Catch:{ all -> 0x00e7 }
            com.google.android.apps.gsa.staticplugins.opa.morris2.h.u r0 = new com.google.android.apps.gsa.staticplugins.opa.morris2.h.u     // Catch:{ all -> 0x00e7 }
            r0.<init>(r6)     // Catch:{ all -> 0x00e7 }
            r5.execute(r0)     // Catch:{ all -> 0x00e7 }
            com.google.android.apps.gsa.search.core.i.t r5 = r4.f305493b     // Catch:{ all -> 0x00e7 }
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248918o     // Catch:{ all -> 0x00e7 }
            boolean r5 = r5.mo79746e(r6)     // Catch:{ all -> 0x00e7 }
            if (r5 != 0) goto L_0x00e3
            j$.util.Optional r5 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x00e7 }
            r4.f305506o = r5     // Catch:{ all -> 0x00e7 }
            monitor-exit(r4)
            return
        L_0x00e3:
            monitor-exit(r4)
            return
        L_0x00e5:
            monitor-exit(r4)
            return
        L_0x00e7:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109685y.mo98004y(com.google.android.libraries.assistant.d.b.i, java.lang.String):void");
    }

    /* renamed from: z */
    public final synchronized void mo98005z() {
        mo97990k(false);
    }
}
