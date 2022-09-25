package com.google.android.libraries.search.logging.appflows.startup.p3037a;

import android.app.Activity;
import android.app.Application;
import android.os.Process;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.appflows.startup.C38797a;
import com.google.android.libraries.search.logging.appflows.startup.C38807b;
import com.google.android.libraries.search.logging.appflows.startup.logger.C38824e;
import com.google.android.libraries.search.logging.appflows.startup.p3038b.C38811d;
import com.google.android.libraries.search.logging.appflows.startup.p3038b.C38817j;
import com.google.android.libraries.search.logging.p3040c.C38835b;
import com.google.android.libraries.search.logging.p3043f.p3045b.C39194a;
import com.google.android.libraries.search.p2871b.p2893h.p2894a.C37248a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37257f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59710cy;
import com.google.common.p4552o.C59711cz;
import com.google.common.p4552o.C59740dy;
import com.google.common.p4552o.C59741dz;
import com.google.common.p4552o.C59747ed;
import com.google.common.p4580v.C60944c;
import com.google.protobuf.C62940bt;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.logging.appflows.startup.a.i */
/* compiled from: PG */
public final class C38806i implements C38802e {

    /* renamed from: b */
    private static final C59071e f102400b = C59071e.m91332i("com.google.android.libraries.search.logging.appflows.startup.a.i");

    /* renamed from: c */
    private static final Duration f102401c = Duration.ofMillis(C37248a.f98962d.mo40782f().mo40798c().mo40696a());

    /* renamed from: d */
    private static final Duration f102402d = Duration.ofMillis(C37248a.f98963e.mo40782f().mo40798c().mo40696a());

    /* renamed from: a */
    public final C38807b f102403a;

    /* renamed from: e */
    private final C38824e f102404e;

    /* renamed from: f */
    private final C38811d f102405f;

    /* renamed from: g */
    private final C21370a f102406g;

    /* renamed from: h */
    private final C38835b f102407h;

    public C38806i(C38824e eVar, C38807b bVar, C38811d dVar, C21370a aVar, C38835b bVar2) {
        this.f102404e = eVar;
        this.f102403a = bVar;
        this.f102405f = dVar;
        this.f102406g = aVar;
        this.f102407h = bVar2;
    }

    /* renamed from: k */
    private final void m68120k() {
        C58833ax axVar = this.f102403a.f102410c;
        if (axVar.mo56113h()) {
            Duration duration = (Duration) axVar.mo56107c();
            Duration duration2 = (Duration) this.f102403a.f102409b.mo56108d(new C38804g(this, duration));
            long nanos = duration2.toNanos();
            C37252a d = C37248a.f98959a.mo40811d(nanos);
            C37252a d2 = C37248a.f98960b.mo40811d(nanos);
            C37252a d3 = C37248a.f98961c.mo40811d(C60944c.m93091d(duration));
            C38807b bVar = this.f102403a;
            bVar.f102421n = 2;
            bVar.f102422o = 2;
            bVar.f102411d = C58833ax.m90834k(duration2);
            this.f102403a.f102418k.mo40774b(d);
            this.f102403a.f102420m.mo40774b(d2);
            this.f102403a.f102418k.mo40774b(d3);
        }
    }

    /* renamed from: l */
    private final void m68121l(Duration duration, C58833ax axVar) {
        if (C38797a.m68109a(this.f102403a.f102421n)) {
            m68122m();
        }
        this.f102403a.mo41647c(axVar);
        C38807b bVar = this.f102403a;
        boolean z = true;
        if (bVar.f102415h && bVar.f102422o != 2) {
            z = false;
        }
        if (!C38797a.m68109a(bVar.f102421n) && z) {
            m68120k();
        }
        if (m68123n(duration)) {
            m68122m();
        }
        C38807b bVar2 = this.f102403a;
        if (C38797a.m68109a(bVar2.f102421n)) {
            bVar2.f102418k.mo40774b(C37248a.f98964f.mo40811d(C60944c.m93091d(duration)));
        } else {
            bVar2.f102411d = C58833ax.m90834k(duration);
            C38807b bVar3 = this.f102403a;
            if (bVar3.f102422o == 3) {
                bVar3.f102418k.mo40774b(C37248a.f98953S.mo40811d(C60944c.m93091d(duration)));
                C38807b bVar4 = this.f102403a;
                bVar4.f102420m.mo40774b(C37248a.f98954T.mo40811d(C60944c.m93091d(duration)));
            } else {
                bVar3.f102418k.mo40774b(C37248a.f98962d.mo40811d(C60944c.m93091d(duration)));
                C38807b bVar5 = this.f102403a;
                bVar5.f102420m.mo40774b(C37248a.f98963e.mo40811d(C60944c.m93091d(duration)));
                this.f102403a.f102422o = 4;
            }
        }
        this.f102403a.f102421n = 3;
    }

    /* renamed from: m */
    private final void m68122m() {
        this.f102403a.mo41645a(this.f102404e);
        if (this.f102405f.mo41656b(this.f102403a.f102414g)) {
            C38807b bVar = this.f102403a;
            this.f102404e.mo41659g(bVar.f102420m);
            bVar.f102420m = bVar.f102408a.mo40826a();
        }
        this.f102403a.mo41646b();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void m68124o(com.google.android.libraries.search.p2871b.p2895i.C37252a r4, android.app.Activity r5) {
        /*
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            int r0 = r5.hashCode()
            r1 = 2
            switch(r0) {
                case -2127535076: goto L_0x00aa;
                case -2118757827: goto L_0x009f;
                case -2002089489: goto L_0x0095;
                case -1406618483: goto L_0x008a;
                case -714938929: goto L_0x007f;
                case -639584343: goto L_0x0075;
                case 36214510: goto L_0x006b;
                case 44285024: goto L_0x0060;
                case 624983087: goto L_0x0056;
                case 845789373: goto L_0x004b;
                case 1122438297: goto L_0x0040;
                case 1846423851: goto L_0x0034;
                case 1965134647: goto L_0x0028;
                case 2107432905: goto L_0x001d;
                case 2118830438: goto L_0x0012;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x00b4
        L_0x0012:
            java.lang.String r0 = "com.google.android.apps.gsa.monet.appcompat.AppCompatActivity"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x00b4
            r5 = 6
            goto L_0x00b5
        L_0x001d:
            java.lang.String r0 = "com.google.android.apps.gsa.lockscreenentry.LockscreenEntryActivity"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x00b4
            r5 = 1
            goto L_0x00b5
        L_0x0028:
            java.lang.String r0 = "com.google.android.apps.gsa.staticplugins.opa.OpaActivity"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x00b4
            r5 = 11
            goto L_0x00b5
        L_0x0034:
            java.lang.String r0 = "com.google.android.apps.gsa.staticplugins.opa.hq.OpaHqActivity"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x00b4
            r5 = 14
            goto L_0x00b5
        L_0x0040:
            java.lang.String r0 = "com.google.android.apps.gsa.monet.TransparentMonetActivity"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x00b4
            r5 = 7
            goto L_0x00b5
        L_0x004b:
            java.lang.String r0 = "com.google.android.apps.gsa.monet.searchwidget.WidgetCustomizationActivity"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x00b4
            r5 = 8
            goto L_0x00b5
        L_0x0056:
            java.lang.String r0 = "com.google.android.apps.gsa.searchnow.SearchNowActivity"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x00b4
            r5 = 2
            goto L_0x00b5
        L_0x0060:
            java.lang.String r0 = "com.google.android.apps.gsa.staticplugins.opa.ZeroStateActivity"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x00b4
            r5 = 13
            goto L_0x00b5
        L_0x006b:
            java.lang.String r0 = "com.google.android.apps.gsa.sidekick.main.optin.BaseOptInActivity"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x00b4
            r5 = 4
            goto L_0x00b5
        L_0x0075:
            java.lang.String r0 = "com.google.android.apps.gsa.monet.MonetActivity"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x00b4
            r5 = 3
            goto L_0x00b5
        L_0x007f:
            java.lang.String r0 = "com.google.android.apps.search.googleapp.activity.GoogleAppActivity"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x00b4
            r5 = 12
            goto L_0x00b5
        L_0x008a:
            java.lang.String r0 = "com.google.android.apps.gsa.monet.nowstream.NowStreamMonetActivity"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x00b4
            r5 = 10
            goto L_0x00b5
        L_0x0095:
            java.lang.String r0 = "com.google.android.apps.gsa.queryentry.QueryEntryActivity"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x00b4
            r5 = 0
            goto L_0x00b5
        L_0x009f:
            java.lang.String r0 = "com.google.android.apps.gsa.monet.dialog.DialogMonetActivity"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x00b4
            r5 = 9
            goto L_0x00b5
        L_0x00aa:
            java.lang.String r0 = "com.google.android.apps.gsa.monet.paymentsauth.PaymentsAuthActivity"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x00b4
            r5 = 5
            goto L_0x00b5
        L_0x00b4:
            r5 = -1
        L_0x00b5:
            switch(r5) {
                case 0: goto L_0x00e4;
                case 1: goto L_0x00e1;
                case 2: goto L_0x00de;
                case 3: goto L_0x00db;
                case 4: goto L_0x00d8;
                case 5: goto L_0x00d5;
                case 6: goto L_0x00d2;
                case 7: goto L_0x00cf;
                case 8: goto L_0x00cc;
                case 9: goto L_0x00c9;
                case 10: goto L_0x00c6;
                case 11: goto L_0x00c3;
                case 12: goto L_0x00c0;
                case 13: goto L_0x00bd;
                case 14: goto L_0x00ba;
                default: goto L_0x00b8;
            }
        L_0x00b8:
            r5 = 0
            goto L_0x00e6
        L_0x00ba:
            com.google.common.o.ty r5 = com.google.common.p4552o.C60547ty.OPA_HQ_ACTIVITY
            goto L_0x00e6
        L_0x00bd:
            com.google.common.o.ty r5 = com.google.common.p4552o.C60547ty.ZERO_STATE_ACTIVITY
            goto L_0x00e6
        L_0x00c0:
            com.google.common.o.ty r5 = com.google.common.p4552o.C60547ty.GOOGLE_APP_ACTIVITY
            goto L_0x00e6
        L_0x00c3:
            com.google.common.o.ty r5 = com.google.common.p4552o.C60547ty.OPA_ACTIVITY
            goto L_0x00e6
        L_0x00c6:
            com.google.common.o.ty r5 = com.google.common.p4552o.C60547ty.NOW_STREAM_MONET_ACTIVITY
            goto L_0x00e6
        L_0x00c9:
            com.google.common.o.ty r5 = com.google.common.p4552o.C60547ty.DIALOG_MONET_ACTIVITY
            goto L_0x00e6
        L_0x00cc:
            com.google.common.o.ty r5 = com.google.common.p4552o.C60547ty.WIDGET_CUSTOMIZATION_ACTIVITY
            goto L_0x00e6
        L_0x00cf:
            com.google.common.o.ty r5 = com.google.common.p4552o.C60547ty.TRANSPARENT_MONET_ACTIVITY
            goto L_0x00e6
        L_0x00d2:
            com.google.common.o.ty r5 = com.google.common.p4552o.C60547ty.APP_COMPAT_ACTIVITY
            goto L_0x00e6
        L_0x00d5:
            com.google.common.o.ty r5 = com.google.common.p4552o.C60547ty.PAYMENT_AUTH_ACTIVITY
            goto L_0x00e6
        L_0x00d8:
            com.google.common.o.ty r5 = com.google.common.p4552o.C60547ty.NOW_OPTIN_ACTIVITY
            goto L_0x00e6
        L_0x00db:
            com.google.common.o.ty r5 = com.google.common.p4552o.C60547ty.MONET_ACTIVITY
            goto L_0x00e6
        L_0x00de:
            com.google.common.o.ty r5 = com.google.common.p4552o.C60547ty.SEARCH_NOW_ACTIVITY
            goto L_0x00e6
        L_0x00e1:
            com.google.common.o.ty r5 = com.google.common.p4552o.C60547ty.LOCKSCREEN_ENTRY_ACTIVITY
            goto L_0x00e6
        L_0x00e4:
            com.google.common.o.ty r5 = com.google.common.p4552o.C60547ty.QUERY_ENTRY_ACTIVITY
        L_0x00e6:
            if (r5 != 0) goto L_0x00e9
            return
        L_0x00e9:
            com.google.common.o.dz r0 = com.google.common.p4552o.C59741dz.f160357d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.common.o.dy r0 = (com.google.common.p4552o.C59740dy) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.common.o.dz r2 = (com.google.common.p4552o.C59741dz) r2
            int r5 = r5.f164058x
            r2.f160360b = r5
            int r5 = r2.f160359a
            r5 = r5 | r1
            r2.f160359a = r5
            com.google.protobuf.bv r5 = r0.build()
            com.google.common.o.dz r5 = (com.google.common.p4552o.C59741dz) r5
            com.google.protobuf.bt r0 = com.google.common.p4552o.C59711cz.f160208s
            com.google.common.o.cz r1 = com.google.common.p4552o.C59711cz.f160207r
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.common.o.cy r1 = (com.google.common.p4552o.C59710cy) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.common.o.cz r2 = (com.google.common.p4552o.C59711cz) r2
            r5.getClass()
            r2.f160225p = r5
            int r5 = r2.f160210a
            r3 = 32768(0x8000, float:4.5918E-41)
            r5 = r5 | r3
            r2.f160210a = r5
            com.google.protobuf.bv r5 = r1.build()
            com.google.common.o.cz r5 = (com.google.common.p4552o.C59711cz) r5
            com.google.android.libraries.search.b.i.b r4 = (com.google.android.libraries.search.p2871b.p2895i.C37253b) r4
            r4.mo40792p(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.logging.appflows.startup.p3037a.C38806i.m68124o(com.google.android.libraries.search.b.i.a, android.app.Activity):void");
    }

    /* renamed from: p */
    private final void m68125p(C37252a aVar) {
        C58833ax axVar = this.f102403a.f102412e;
        if (axVar.mo56113h()) {
            C59740dy dyVar = (C59740dy) C59741dz.f160357d.createBuilder();
            C59747ed b = C39194a.m68627b(((Activity) axVar.mo56107c()).getIntent());
            dyVar.copyOnWrite();
            C59741dz dzVar = (C59741dz) dyVar.instance;
            b.getClass();
            dzVar.f160361c = b;
            dzVar.f160359a |= 4;
            C59741dz dzVar2 = (C59741dz) dyVar.build();
            C62940bt btVar = C59711cz.f160208s;
            C59710cy cyVar = (C59710cy) C59711cz.f160207r.createBuilder();
            cyVar.copyOnWrite();
            C59711cz czVar = (C59711cz) cyVar.instance;
            dzVar2.getClass();
            czVar.f160225p = dzVar2;
            czVar.f160210a |= 32768;
            ((C37253b) aVar).mo40792p(btVar, (C59711cz) cyVar.build());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[LOOP:0: B:18:0x0044->B:21:0x004f, LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41627a(p3186j$.time.Duration r8, android.app.Activity r9) {
        /*
            r7 = this;
            com.google.android.libraries.search.logging.appflows.startup.b r0 = r7.f102403a
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r9)
            r0.mo41647c(r1)
            com.google.android.libraries.search.logging.appflows.startup.b r0 = r7.f102403a
            boolean r1 = r0.f102415h
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0017
            int r1 = r0.f102422o
            if (r1 != r2) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            int r0 = r0.f102421n
            boolean r0 = com.google.android.libraries.search.logging.appflows.startup.C38797a.m68109a(r0)
            if (r0 != 0) goto L_0x0024
            if (r3 == 0) goto L_0x0024
            r7.m68120k()
        L_0x0024:
            com.google.android.libraries.search.logging.appflows.startup.b r0 = r7.f102403a
            int r1 = r0.f102422o
            r3 = 0
            if (r1 == 0) goto L_0x00ef
            r4 = 3
            if (r1 == r2) goto L_0x0030
            if (r1 != r4) goto L_0x0051
        L_0x0030:
            com.google.android.libraries.search.logging.c.b r1 = r7.f102407h
            j.a.i.b.a.an r0 = r0.f102414g
            com.google.android.libraries.performance.primes.metrics.h.r r2 = com.google.android.libraries.performance.primes.metrics.p2414h.C31499r.f84816a
            java.lang.String r5 = "AGSA_"
            com.google.android.libraries.performance.primes.au r5 = com.google.android.libraries.performance.primes.C31164au.m58093c(r5, r0)
            com.google.android.libraries.performance.primes.au r6 = r2.f84826k
            if (r6 != 0) goto L_0x0042
            r2.f84826k = r5
        L_0x0042:
            java.util.concurrent.atomic.AtomicReference r1 = r1.f102491a
        L_0x0044:
            boolean r2 = r1.compareAndSet(r3, r0)
            if (r2 == 0) goto L_0x004b
            goto L_0x0051
        L_0x004b:
            java.lang.Object r2 = r1.get()
            if (r2 == 0) goto L_0x0044
        L_0x0051:
            com.google.android.libraries.search.logging.appflows.startup.b r0 = r7.f102403a
            int r0 = r0.f102421n
            if (r0 == 0) goto L_0x00ee
            r1 = 6
            r2 = 4
            if (r0 == r1) goto L_0x0066
            if (r0 == r2) goto L_0x0066
            r1 = 5
            if (r0 == r1) goto L_0x0066
            boolean r0 = r7.m68123n(r8)
            if (r0 == 0) goto L_0x0069
        L_0x0066:
            r7.m68122m()
        L_0x0069:
            com.google.android.libraries.search.logging.appflows.startup.b r0 = r7.f102403a
            int r1 = r0.f102421n
            boolean r1 = com.google.android.libraries.search.logging.appflows.startup.C38797a.m68109a(r1)
            if (r1 == 0) goto L_0x0088
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2893h.p2894a.C37248a.f98967i
            long r3 = com.google.common.p4580v.C60944c.m93091d(r8)
            com.google.android.libraries.search.b.i.a r8 = r0.mo40811d(r3)
            m68124o(r8, r9)
            com.google.android.libraries.search.logging.appflows.startup.b r9 = r7.f102403a
            com.google.android.libraries.search.b.i r9 = r9.f102418k
            r9.mo40774b(r8)
            goto L_0x00e9
        L_0x0088:
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r8)
            r0.f102411d = r1
            com.google.android.libraries.search.logging.appflows.startup.b r0 = r7.f102403a
            int r0 = r0.f102422o
            if (r0 != r4) goto L_0x00bd
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2893h.p2894a.C37248a.f98955U
            long r3 = com.google.common.p4580v.C60944c.m93091d(r8)
            com.google.android.libraries.search.b.i.a r0 = r0.mo40811d(r3)
            m68124o(r0, r9)
            com.google.android.libraries.search.b.i.g r1 = com.google.android.libraries.search.p2871b.p2893h.p2894a.C37248a.f98956V
            long r3 = com.google.common.p4580v.C60944c.m93091d(r8)
            com.google.android.libraries.search.b.i.a r8 = r1.mo40811d(r3)
            m68124o(r8, r9)
            com.google.android.libraries.search.logging.appflows.startup.b r9 = r7.f102403a
            com.google.android.libraries.search.b.i r9 = r9.f102418k
            r9.mo40774b(r0)
            com.google.android.libraries.search.logging.appflows.startup.b r9 = r7.f102403a
            com.google.android.libraries.search.b.i r9 = r9.f102420m
            r9.mo40774b(r8)
            goto L_0x00e9
        L_0x00bd:
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2893h.p2894a.C37248a.f98965g
            long r3 = com.google.common.p4580v.C60944c.m93091d(r8)
            com.google.android.libraries.search.b.i.a r0 = r0.mo40811d(r3)
            m68124o(r0, r9)
            com.google.android.libraries.search.b.i.g r1 = com.google.android.libraries.search.p2871b.p2893h.p2894a.C37248a.f98966h
            long r3 = com.google.common.p4580v.C60944c.m93091d(r8)
            com.google.android.libraries.search.b.i.a r8 = r1.mo40811d(r3)
            m68124o(r8, r9)
            com.google.android.libraries.search.logging.appflows.startup.b r9 = r7.f102403a
            com.google.android.libraries.search.b.i r9 = r9.f102418k
            r9.mo40774b(r0)
            com.google.android.libraries.search.logging.appflows.startup.b r9 = r7.f102403a
            com.google.android.libraries.search.b.i r9 = r9.f102420m
            r9.mo40774b(r8)
            com.google.android.libraries.search.logging.appflows.startup.b r8 = r7.f102403a
            r8.f102422o = r2
        L_0x00e9:
            com.google.android.libraries.search.logging.appflows.startup.b r8 = r7.f102403a
            r8.f102421n = r2
            return
        L_0x00ee:
            throw r3
        L_0x00ef:
            goto L_0x00f1
        L_0x00f0:
            throw r3
        L_0x00f1:
            goto L_0x00f0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.logging.appflows.startup.p3037a.C38806i.mo41627a(j$.time.Duration, android.app.Activity):void");
    }

    /* renamed from: c */
    public final void mo41629c(Duration duration, Application application) {
        this.f102403a.f102409b = C58833ax.m90834k(Duration.ofMillis(Process.getStartElapsedRealtime()));
        this.f102403a.f102410c = C58833ax.m90834k(duration);
        application.registerActivityLifecycleCallbacks(new C38805h(this));
        C19559g.m37302a().post(new C38803f(this));
    }

    /* renamed from: d */
    public final void mo41630d(C37252a aVar) {
        if (C38797a.m68109a(this.f102403a.f102421n)) {
            C37253b bVar = (C37253b) aVar;
            if (!bVar.f99001c) {
                bVar.mo40791o(this.f102406g.mo26872d());
            }
            if (m68123n(Duration.ofNanos(bVar.f99002d))) {
                m68122m();
            } else {
                this.f102403a.f102418k.mo40774b(aVar);
            }
        }
    }

    /* renamed from: e */
    public final void mo41631e(Duration duration, Activity activity) {
        this.f102403a.f102411d = C58836b.f156633a;
        m68121l(duration, C58833ax.m90834k(activity));
    }

    /* renamed from: f */
    public final void mo41632f(Duration duration) {
        this.f102403a.f102411d = C58833ax.m90834k(duration);
        m68121l(duration, C58836b.f156633a);
    }

    /* renamed from: g */
    public final void mo41633g() {
        Duration ofNanos = Duration.ofNanos(this.f102406g.mo26872d());
        if (m68123n(ofNanos)) {
            m68122m();
            return;
        }
        C38807b bVar = this.f102403a;
        int i = bVar.f102421n;
        if (!C38797a.m68109a(i)) {
            ((C59052c) ((C59052c) f102400b.mo56226d()).mo56372aa(53182)).mo56386p("Attempted to log a first draw done event when no flow was in progress.");
        } else if (i == 0) {
            throw null;
        } else if (i == 6) {
            ((C59052c) ((C59052c) f102400b.mo56226d()).mo56372aa(53181)).mo56386p("Attempted to log a first draw done event when one was already logged.");
        } else if (bVar.f102419l) {
            mo41635i(3);
        } else {
            C37252a a = ((C37257f) this.f102405f.mo41655a(bVar.f102414g).mo41651b()).mo40803a(0, "agsa_startup_success");
            ((C37253b) a).mo40791o(ofNanos.toNanos());
            m68125p(a);
            this.f102403a.f102418k.mo40774b(a);
            this.f102403a.mo41645a(this.f102404e);
            if (!this.f102405f.mo41656b(this.f102403a.f102414g)) {
                this.f102403a.mo41646b();
            } else {
                this.f102403a.f102421n = 6;
            }
        }
    }

    /* renamed from: h */
    public final void mo41634h() {
        Duration ofNanos = Duration.ofNanos(this.f102406g.mo26872d());
        if (m68123n(ofNanos)) {
            m68122m();
            return;
        }
        C38807b bVar = this.f102403a;
        int i = bVar.f102421n;
        if (C38797a.m68109a(i)) {
            if (i == 0) {
                throw null;
            } else if (i != 6) {
                mo41635i(4);
            } else if (bVar.f102419l) {
                mo41635i(3);
            } else {
                C58833ax a = this.f102405f.mo41655a(bVar.f102414g).mo41650a();
                if (!a.mo56113h()) {
                    ((C59052c) ((C59052c) f102400b.mo56226d()).mo56372aa(53183)).mo56386p("Attempted to log time to interactive when the current launch mode does not have a TTI event.");
                    return;
                }
                C37252a a2 = ((C37257f) a.mo56107c()).mo40803a(0, "agsa_startup_success");
                ((C37253b) a2).mo40791o(ofNanos.toNanos());
                m68125p(a2);
                this.f102403a.f102420m.mo40774b(a2);
                m68122m();
            }
        }
    }

    /* renamed from: i */
    public final void mo41635i(int i) {
        Duration ofNanos = Duration.ofNanos(this.f102406g.mo26872d());
        if (C38797a.m68109a(this.f102403a.f102421n)) {
            if (m68123n(ofNanos)) {
                m68122m();
                return;
            }
            C38817j a = this.f102405f.mo41655a(this.f102403a.f102414g);
            int i2 = this.f102403a.f102421n;
            if (i2 != 0) {
                if (i2 != 6) {
                    C37252a a2 = ((C37257f) a.mo41651b()).mo40803a(i - 1, "agsa_startup_failure");
                    ((C37253b) a2).mo40791o(ofNanos.toNanos());
                    m68125p(a2);
                    this.f102403a.f102418k.mo40774b(a2);
                }
                if (a.mo41650a().mo56113h()) {
                    C37252a a3 = ((C37257f) a.mo41650a().mo56107c()).mo40803a(i - 1, "agsa_startup_failure");
                    ((C37253b) a3).mo40791o(ofNanos.toNanos());
                    m68125p(a3);
                    this.f102403a.f102420m.mo40774b(a3);
                }
                m68122m();
                return;
            }
            throw null;
        }
    }

    /* renamed from: j */
    public final void mo41644j(Activity activity) {
        C38807b bVar = this.f102403a;
        C58833ax axVar = bVar.f102412e;
        if (C38797a.m68109a(bVar.f102421n) && axVar.mo56113h() && ((Activity) axVar.mo56107c()).equals(activity)) {
            C58833ax axVar2 = this.f102403a.f102413f;
            if (!axVar2.mo56113h() || ((Activity) axVar2.mo56107c()).equals(activity)) {
                Duration ofNanos = Duration.ofNanos(this.f102406g.mo26872d());
                if (C38797a.m68109a(this.f102403a.f102421n)) {
                    if (m68123n(ofNanos)) {
                        m68122m();
                        return;
                    }
                    C38817j a = this.f102405f.mo41655a(this.f102403a.f102414g);
                    int i = this.f102403a.f102421n;
                    if (i != 0) {
                        if (i != 6) {
                            C37252a a2 = ((C37257f) a.mo41651b()).mo40803a(2, "agsa_startup_cancel");
                            ((C37253b) a2).mo40791o(ofNanos.toNanos());
                            m68125p(a2);
                            this.f102403a.f102418k.mo40774b(a2);
                        }
                        if (a.mo41650a().mo56113h()) {
                            C37252a a3 = ((C37257f) a.mo41650a().mo56107c()).mo40803a(2, "agsa_startup_cancel");
                            ((C37253b) a3).mo40791o(ofNanos.toNanos());
                            m68125p(a3);
                            this.f102403a.f102420m.mo40774b(a3);
                        }
                        m68122m();
                        return;
                    }
                    throw null;
                }
                return;
            }
            m68122m();
        }
    }

    /* renamed from: n */
    private final boolean m68123n(Duration duration) {
        Duration duration2;
        C38807b bVar = this.f102403a;
        C58833ax axVar = bVar.f102411d;
        int i = bVar.f102421n;
        if (i != 0) {
            if (i == 6) {
                duration2 = f102402d;
            } else {
                duration2 = f102401c;
            }
            return axVar.mo56113h() && ((Duration) axVar.mo56107c()).plus(duration2).compareTo(duration) < 0;
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo41628b(Duration duration, Activity activity) {
        C38807b bVar = this.f102403a;
        int i = bVar.f102421n;
        if (C38797a.m68109a(i)) {
            if (i == 0) {
                throw null;
            } else if (i == 3) {
                bVar.mo41646b();
            } else if (i == 5 || i == 6 || m68123n(duration)) {
                m68122m();
            } else {
                this.f102403a.mo41647c(C58833ax.m90834k(activity));
                C38807b bVar2 = this.f102403a;
                bVar2.f102421n = 5;
                bVar2.f102418k.mo40774b(C37248a.f98957W.mo40811d(C60944c.m93091d(duration)));
            }
        }
    }
}
