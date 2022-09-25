package com.google.android.apps.gsa.queryentry;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.google.android.apps.gsa.binaries.satin.app.afz;
import com.google.android.apps.gsa.binaries.satin.app.aiz;
import com.google.android.apps.gsa.search.shared.overlay.C87661j;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.logger.p7064i.C89922b;
import com.google.android.apps.gsa.shared.monet.C90347r;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7148ui.C90704p;
import com.google.android.apps.gsa.shared.p7148ui.C90705q;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.search.lens.p10547a.C139921f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59668bv;
import com.google.common.p4552o.C60547ty;
import dagger.C68214a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p3186j$.time.Duration;

/* compiled from: PG */
public class QueryEntryActivity extends C90705q {

    /* renamed from: A */
    private static final C60547ty f229239A = C60547ty.QUERY_ENTRY_ACTIVITY;

    /* renamed from: x */
    public static final /* synthetic */ int f229240x = 0;

    /* renamed from: z */
    private static final C59071e f229241z = C59071e.m91332i("com.google.android.apps.gsa.queryentry.QueryEntryActivity");

    /* renamed from: B */
    private Intent f229242B;

    /* renamed from: C */
    private boolean f229243C;

    /* renamed from: D */
    private boolean f229244D;

    /* renamed from: j */
    public Bundle f229245j;

    /* renamed from: k */
    public boolean f229246k;

    /* renamed from: l */
    boolean f229247l;

    /* renamed from: m */
    boolean f229248m;

    /* renamed from: n */
    public C68214a f229249n;

    /* renamed from: o */
    public C87661j f229250o;

    /* renamed from: p */
    public C90476a f229251p;

    /* renamed from: q */
    public C38802e f229252q;

    /* renamed from: r */
    public C58833ax f229253r;

    /* renamed from: s */
    public C90347r f229254s;

    /* renamed from: t */
    public C139921f f229255t;

    /* renamed from: u */
    public C21370a f229256u;

    /* renamed from: v */
    public C89859i f229257v;

    /* renamed from: w */
    public afz f229258w;

    /* renamed from: com.google.android.apps.gsa.queryentry.QueryEntryActivity$a */
    /* compiled from: PG */
    public interface C84238a {
        /* renamed from: rP */
        aiz mo77725rP();
    }

    public QueryEntryActivity() {
        super("QueryEntryActivity", f229239A);
    }

    /* renamed from: w */
    private final void m134316w(Intent intent, String str) {
        if ("and.gsa.voice.search.icon".equals(str)) {
            this.f229257v.mo83703p(C89849ae.VOICE_SEARCH_ICON_TAP, Duration.ofMillis(intent.getLongExtra("com.google.android.googlequicksearchbox.extra.start_activity_elapsed_realtime_millis", this.f229256u.mo26871c())).toNanos());
        } else if ("and.gsa.launcher.qsb.mic".equals(str)) {
            this.f229257v.mo83702b(C89849ae.QEA_VOICE_ENTRY);
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        C91006f f = C91006f.m148645f(this.f229251p);
        f.mo85291r("QueryEntryActivity");
        f.mo85286m(this.f229250o);
        f.mo85286m(this.f229254s);
        f.mo85295u(printWriter, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            com.google.android.apps.gsa.e.f r0 = com.google.android.apps.gsa.e.f.E
            com.google.android.apps.gsa.p5846e.C74504a.m120462a(r0)
            long r0 = com.google.android.libraries.p1730f.p1731a.C21374d.m40426a()
            j$.time.Duration r0 = p3186j$.time.Duration.ofNanos(r0)
            android.os.Bundle r12 = com.google.android.apps.gsa.shared.p7148ui.C90704p.m148107b(r12)
            android.content.Intent r1 = r11.getIntent()
            android.content.Intent r1 = com.google.android.apps.gsa.shared.p7148ui.C90704p.m148106a(r1)
            r11.setIntent(r1)
            super.onCreate(r12)
            r11.f229245j = r12
            java.lang.Class<com.google.android.apps.gsa.queryentry.QueryEntryActivity$a> r1 = com.google.android.apps.gsa.queryentry.QueryEntryActivity.C84238a.class
            java.lang.Object r1 = com.google.apps.tiktok.inject.C47266f.m84076a(r11, r1)
            com.google.android.apps.gsa.queryentry.QueryEntryActivity$a r1 = (com.google.android.apps.gsa.queryentry.QueryEntryActivity.C84238a) r1
            com.google.android.apps.gsa.binaries.satin.app.aiz r1 = r1.mo77725rP()
            r1.f196263b = r11
            com.google.android.apps.gsa.queryentry.QueryEntryActivity r2 = r1.f196263b
            java.lang.Class<com.google.android.apps.gsa.queryentry.QueryEntryActivity> r3 = com.google.android.apps.gsa.queryentry.QueryEntryActivity.class
            dagger.p5294a.C68225k.m98529a(r2, r3)
            com.google.android.apps.gsa.binaries.satin.app.ajb r2 = new com.google.android.apps.gsa.binaries.satin.app.ajb
            com.google.android.apps.gsa.binaries.satin.app.aqy r3 = r1.f196262a
            com.google.android.apps.gsa.queryentry.QueryEntryActivity r1 = r1.f196263b
            r2.<init>(r3, r1)
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f196321b
            g.a.a r1 = r1.bk
            dagger.a r1 = dagger.p5294a.C68219e.m98518a(r1)
            r11.f229249n = r1
            g.a.a r1 = r2.f196330k
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.search.shared.overlay.j r1 = (com.google.android.apps.gsa.search.shared.overlay.C87661j) r1
            r11.f229250o = r1
            com.google.android.apps.gsa.binaries.satin.app.afz r1 = new com.google.android.apps.gsa.binaries.satin.app.afz
            com.google.android.apps.gsa.binaries.satin.app.aqy r3 = r2.f196321b
            r1.<init>(r3)
            r11.f229258w = r1
            g.a.a r1 = r3.r
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.shared.s.a.a r1 = (com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a) r1
            r11.f229251p = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f196321b
            g.a.a r1 = r1.t
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.shared.s.b.a r1 = (com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a) r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f196321b
            com.google.android.apps.gsa.binaries.satin.app.ars r1 = r1.b
            g.a.a r1 = r1.f200020bh
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.libraries.search.logging.appflows.startup.a.e r1 = (com.google.android.libraries.search.logging.appflows.startup.p3037a.C38802e) r1
            r11.f229252q = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f196321b
            com.google.android.apps.gsa.binaries.satin.app.ars r1 = r1.b
            g.a.a r1 = r1.f200017be
            java.lang.Object r1 = r1.mo17428b()
            com.google.common.base.ax r1 = (com.google.common.base.C58833ax) r1
            r11.f229253r = r1
            g.a.a r1 = r2.f196310ap
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.shared.monet.r r1 = (com.google.android.apps.gsa.shared.monet.C90347r) r1
            r11.f229254s = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f196321b
            g.a.a r1 = r1.bq
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.shared.util.v.g r1 = (com.google.android.apps.gsa.shared.util.p7188v.C91142g) r1
            g.a.a r1 = r2.f196311aq
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.search.lens.a.f r1 = (com.google.android.apps.search.lens.p10547a.C139921f) r1
            r11.f229255t = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f196321b
            g.a.a r1 = r1.i
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.libraries.f.a r1 = (com.google.android.libraries.p1730f.C21370a) r1
            r11.f229256u = r1
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f196321b
            com.google.android.apps.gsa.binaries.satin.app.asp r1 = r1.a
            g.a.a r1 = r1.f202586Q
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.shared.logger.b.i r1 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r1
            r11.f229257v = r1
            com.google.common.base.ax r1 = r11.f229253r
            boolean r1 = r1.mo56113h()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x00f1
            if (r12 == 0) goto L_0x00d2
            r10 = 1
            goto L_0x00d3
        L_0x00d2:
            r10 = 0
        L_0x00d3:
            com.google.common.base.ax r1 = r11.f229253r
            java.lang.Object r1 = r1.mo56107c()
            r4 = r1
            com.google.android.apps.gsa.shared.logger.i.b r4 = (com.google.android.apps.gsa.shared.logger.p7064i.C89922b) r4
            com.google.common.o.ty r5 = f229239A
            java.lang.Class r6 = r11.getClass()
            android.content.Intent r1 = r11.getIntent()
            com.google.common.base.ax r7 = com.google.common.base.C58833ax.m90834k(r1)
            long r8 = com.google.common.p4580v.C60944c.m93090c(r0)
            r4.mo83758b(r5, r6, r7, r8, r10)
        L_0x00f1:
            com.google.android.libraries.search.logging.appflows.startup.a.e r1 = r11.f229252q
            r1.mo41627a(r0, r11)
            if (r12 == 0) goto L_0x0102
            java.lang.String r0 = "qea:changing_configurations"
            boolean r0 = r12.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x0102
            r0 = 1
            goto L_0x0103
        L_0x0102:
            r0 = 0
        L_0x0103:
            com.google.android.apps.gsa.search.shared.overlay.j r1 = r11.f229250o
            com.google.android.apps.gsa.queryentry.b r4 = new com.google.android.apps.gsa.queryentry.b
            r4.<init>(r11)
            r1.mo81822r(r4)
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r4 = "and.gsa.d.at.2.e.voi"
            java.lang.String r5 = com.google.android.libraries.search.logging.p3043f.C39193b.m68624a(r1)
            boolean r4 = r4.equals(r5)
            java.lang.String r5 = "and.gsa.launcher.qsb.mic"
            if (r4 == 0) goto L_0x0124
            java.lang.String r4 = "source"
            r1.putExtra(r4, r5)
        L_0x0124:
            boolean r4 = com.google.android.apps.gsa.shared.util.C90722af.m148174b(r1)
            java.lang.String r6 = "android.intent.action.VOICE_ASSIST"
            if (r4 != 0) goto L_0x0154
            java.lang.String r4 = r1.getAction()
            boolean r4 = android.text.TextUtils.equals(r4, r6)
            if (r4 == 0) goto L_0x0154
            com.google.android.apps.gsa.search.shared.overlay.j r4 = r11.f229250o
            boolean r4 = r4.mo81768A()
            if (r4 != 0) goto L_0x013f
            goto L_0x0154
        L_0x013f:
            java.lang.String r12 = com.google.android.libraries.search.logging.p3043f.C39193b.m68624a(r1)
            r11.m134316w(r1, r12)
            com.google.android.apps.gsa.search.shared.overlay.j r0 = r11.f229250o
            r0.mo81818n(r12, r3)
            com.google.android.apps.gsa.search.shared.overlay.j r12 = r11.f229250o
            r12.mo81828x()
            r11.finish()
            return
        L_0x0154:
            com.google.android.apps.gsa.search.shared.overlay.j r4 = r11.f229250o
            com.google.android.apps.gsa.binaries.satin.app.afz r7 = r11.f229258w
            long r8 = com.google.android.apps.gsa.shared.logger.C89838ab.m146257a(r11)
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r7.f196077a = r8
            com.google.android.apps.gsa.binaries.satin.app.aga r7 = r7.mo65566a()
            com.google.android.apps.gsa.search.shared.overlay.l r7 = r7.a()
            r4.mo81823s(r7)
            com.google.android.apps.gsa.search.shared.overlay.j r4 = r11.f229250o
            android.view.View r4 = r4.mo81811g()
            android.view.ViewGroup$LayoutParams r7 = new android.view.ViewGroup$LayoutParams
            r8 = -1
            r7.<init>(r8, r8)
            r11.setContentView(r4, r7)
            com.google.android.apps.gsa.search.shared.overlay.j r4 = r11.f229250o
            com.google.android.apps.gsa.queryentry.c r7 = new com.google.android.apps.gsa.queryentry.c
            r7.<init>(r11)
            r4.mo81769B(r7)
            r11.f229243C = r3
            java.lang.String r4 = "START_QEA_BACKGROUND_OPAQUE"
            if (r0 == 0) goto L_0x0193
            boolean r4 = r12.getBoolean(r4, r3)
            r11.f229243C = r4
            goto L_0x019b
        L_0x0193:
            if (r1 == 0) goto L_0x01a2
            boolean r4 = r1.getBooleanExtra(r4, r3)
            r11.f229243C = r4
        L_0x019b:
            if (r4 == 0) goto L_0x01a2
            com.google.android.apps.gsa.search.shared.overlay.j r4 = r11.f229250o
            r4.mo81825u()
        L_0x01a2:
            java.lang.String r4 = "DISABLE_ENTERING_TRANSITION"
            boolean r4 = r1.getBooleanExtra(r4, r3)
            if (r4 == 0) goto L_0x01ad
            r11.overridePendingTransition(r3, r3)
        L_0x01ad:
            java.lang.String r4 = "MIC_NOT_SUPPORTED"
            boolean r4 = r1.getBooleanExtra(r4, r3)
            if (r4 == 0) goto L_0x01bc
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.search.shared.overlay.j r4 = r11.f229250o
            r4.mo81816l()
        L_0x01bc:
            if (r0 != 0) goto L_0x027a
            android.content.Intent r0 = r11.getIntent()
            r11.f229242B = r0
            if (r0 == 0) goto L_0x0266
            java.lang.String r4 = com.google.android.libraries.search.logging.p3043f.C39193b.m68624a(r0)
            boolean r7 = com.google.android.apps.gsa.shared.util.C90722af.m148174b(r0)
            if (r7 == 0) goto L_0x01db
            com.google.android.apps.gsa.search.shared.overlay.j r4 = r11.f229250o
            long r5 = com.google.android.apps.gsa.shared.util.C90722af.m148173a(r0)
            r4.mo81826v(r5)
            goto L_0x027a
        L_0x01db:
            java.lang.String r7 = r0.getAction()
            boolean r6 = android.text.TextUtils.equals(r7, r6)
            r7 = 0
            if (r6 == 0) goto L_0x01fd
            r11.m134316w(r0, r4)
            com.google.android.apps.gsa.search.shared.overlay.j r0 = r11.f229250o
            r0.mo81818n(r4, r3)
            com.google.android.apps.gsa.search.shared.overlay.j r0 = r11.f229250o
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01f8
            com.google.android.apps.gsa.shared.search.QueryTriggerType r7 = com.google.android.apps.gsa.shared.search.QueryTriggerType.PIXEL_LAUNCHER_MIC
        L_0x01f8:
            r0.mo81770C(r7)
            goto L_0x027a
        L_0x01fd:
            com.google.android.apps.gsa.shared.search.Query r5 = com.google.android.apps.gsa.plugins.p6468a.p6471c.C84058a.m133962a(r0)
            if (r5 != 0) goto L_0x0213
            dagger.a r5 = r11.f229249n
            com.google.android.apps.gsa.shared.search.Query r5 = com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145442D(r0, r5, r7)
            com.google.android.apps.gsa.shared.search.Query r5 = r5.mo84275aL(r4)
            com.google.common.o.amo r6 = com.google.common.p4552o.amo.ASSIST_ENTRY
            com.google.android.apps.gsa.shared.search.Query r5 = r5.mo84272aI(r6)
        L_0x0213:
            java.lang.String r6 = "overlay_translucent_scrim_color"
            boolean r7 = r0.hasExtra(r6)
            if (r7 == 0) goto L_0x022b
            int r6 = r0.getIntExtra(r6, r3)
            com.google.android.apps.gsa.search.shared.overlay.j r7 = r11.f229250o
            r7.mo81824t(r6)
            android.view.Window r7 = r11.getWindow()
            r7.setNavigationBarColor(r6)
        L_0x022b:
            java.lang.String r6 = "disable_scrim_status_bar"
            boolean r7 = r0.hasExtra(r6)
            if (r7 == 0) goto L_0x023c
            com.google.android.apps.gsa.search.shared.overlay.j r7 = r11.f229250o
            boolean r6 = r0.getBooleanExtra(r6, r3)
            r7.mo81821q(r6)
        L_0x023c:
            com.google.android.apps.gsa.search.shared.overlay.j r6 = r11.f229250o
            r6.mo81818n(r4, r3)
            com.google.android.apps.gsa.search.shared.overlay.j r4 = r11.f229250o
            r4.mo81827w(r5, r3)
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "DISABLE_FINISHING_TRANSITION"
            boolean r5 = r0.hasExtra(r4)
            if (r5 == 0) goto L_0x0257
            boolean r0 = r0.getBooleanExtra(r4, r3)
            r11.f229248m = r0
            goto L_0x027a
        L_0x0257:
            java.lang.String r4 = "USE_DEFAULT_FINISHING_TRANSITION"
            boolean r5 = r0.hasExtra(r4)
            if (r5 == 0) goto L_0x027a
            boolean r0 = r0.getBooleanExtra(r4, r3)
            r11.f229247l = r0
            goto L_0x027a
        L_0x0266:
            com.google.common.f.e r0 = f229241z
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "QueryEntryActivity"
            r0.mo56378ag(r4, r5)
            java.lang.String r4 = "getIntent() returns null."
            r5 = 7114(0x1bca, float:9.969E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r4)
        L_0x027a:
            com.google.android.apps.gsa.search.shared.overlay.j r0 = r11.f229250o
            com.google.android.apps.gsa.search.shared.service.aa r0 = r0.mo81813i()
            r0.getClass()
            com.google.android.apps.gsa.queryentry.a r4 = new com.google.android.apps.gsa.queryentry.a
            r4.<init>(r11)
            com.google.android.apps.gsa.search.shared.service.b.um[] r2 = new com.google.android.apps.gsa.search.shared.service.p6935b.C88244um[r2]
            com.google.android.apps.gsa.search.shared.service.b.um r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.BACK_PRESS
            r2[r3] = r5
            r0.mo81940l(r4, r2)
            com.google.android.apps.gsa.search.shared.overlay.j r0 = r11.f229250o
            r0.mo81784Q(r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.queryentry.QueryEntryActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        super.onDestroy();
        C87661j jVar = this.f229250o;
        isChangingConfigurations();
        jVar.mo81809ap();
        this.f229254s.mo84037h();
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        C87673aa i2 = this.f229250o.mo81813i();
        i2.getClass();
        if (!i2.mo81951w()) {
            return false;
        }
        i2.mo81935g();
        return true;
    }

    public final void onPause() {
        super.onPause();
        this.f229254s.mo84039j();
        if (this.f229244D) {
            C87661j jVar = this.f229250o;
            isChangingConfigurations();
            jVar.mo81808ao();
            if (this.f229246k) {
                finish();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onPostCreate(Bundle bundle) {
        Bundle b = C90704p.m148107b(bundle);
        super.onPostCreate(b);
        this.f229250o.mo81787T(b);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.f229254s.mo84040k();
        this.f229250o.mo81788U();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (isChangingConfigurations()) {
            bundle.putBoolean("qea:changing_configurations", true);
        }
        this.f229250o.mo81789V(bundle);
        bundle.putBoolean("START_QEA_BACKGROUND_OPAQUE", this.f229243C);
        bundle.putBundle("qea:monet_state", this.f229254s.mo84032b());
    }

    public final void onStart() {
        Duration ofNanos = Duration.ofNanos(this.f229256u.mo26872d());
        super.onStart();
        this.f229252q.mo41628b(ofNanos, this);
        getWindow().addFlags(C89885b.NOW_VALUE);
        Intent intent = this.f229242B;
        if (intent != null) {
            Bundle extras = intent.getExtras();
            C87673aa i = this.f229250o.mo81813i();
            if (i != null) {
                i.mo81947s(extras);
            }
            this.f229242B = null;
        }
        this.f229254s.mo84042m();
        this.f229250o.mo81790W();
    }

    public final void onStop() {
        if (isChangingConfigurations()) {
            this.f229250o.mo81791X(true);
        } else if (this.f229244D) {
            this.f229250o.mo81791X(false);
        }
        this.f229254s.mo84043n();
        if (this.f229253r.mo56113h()) {
            ((C89922b) this.f229253r.mo56107c()).mo83761e(C59668bv.STARTUP_CANCEL_ACTIVITY_STOPPED);
        }
        super.onStop();
    }

    public final void onTopResumedActivityChanged(boolean z) {
        super.onTopResumedActivityChanged(z);
        this.f229250o.mo76808e(z);
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f229250o.mo81792Y(z);
        if (z) {
            this.f229244D = true;
        }
    }

    /* renamed from: v */
    public final void mo77724v() {
        finish();
        if (this.f229248m) {
            overridePendingTransition(0, 0);
        } else if (!this.f229247l) {
            overridePendingTransition(0, 17432577);
        }
    }
}
