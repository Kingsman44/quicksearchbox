package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a;

import android.content.pm.PackageManager;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111583h;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112037ao;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k.C112130p;
import com.google.assistant.p3781ad.p3789d.C48578al;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.h */
/* compiled from: PG */
final class C111671h implements C111674k {

    /* renamed from: c */
    public static final /* synthetic */ int f310452c = 0;

    /* renamed from: d */
    private static final C59071e f310453d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.h");

    /* renamed from: e */
    private static final C58528ij f310454e = C58528ij.m90012L("Create_alarm", "Get_alarm_info", "Create_timer");

    /* renamed from: a */
    public final C111583h f310455a;

    /* renamed from: b */
    public final C111248k f310456b;

    /* renamed from: f */
    private final PackageManager f310457f;

    /* renamed from: g */
    private final C112037ao f310458g;

    /* renamed from: h */
    private final C68214a f310459h;

    /* renamed from: i */
    private final C112130p f310460i;

    /* renamed from: j */
    private final C86124t f310461j;

    /* renamed from: k */
    private final C111678o f310462k;

    public C111671h(C111583h hVar, PackageManager packageManager, C112037ao aoVar, C68214a aVar, C112130p pVar, C86124t tVar, C111678o oVar, C111248k kVar) {
        this.f310455a = hVar;
        this.f310457f = packageManager;
        this.f310458g = aoVar;
        this.f310459h = aVar;
        this.f310460i = pVar;
        this.f310461j = tVar;
        this.f310462k = oVar;
        this.f310456b = kVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo99199a(C48578al alVar) {
        throw null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo99200b(com.google.assistant.p3781ad.p3789d.C48578al r13, java.lang.String r14) {
        /*
            r12 = this;
            j$.util.Optional r14 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf.m187156c(r13)
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x0013
            com.google.common.b.gu r13 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.cx r13 = com.google.common.util.concurrent.C60856cj.m92900i(r13)
            return r13
        L_0x0013:
            com.google.android.apps.gsa.staticplugins.opa.tapas.g.ao r0 = r12.f310458g
            java.lang.Object r14 = r14.get()
            com.google.assistant.ad.d.ad r14 = (com.google.assistant.p3781ad.p3789d.C48570ad) r14
            com.google.android.apps.gsa.staticplugins.opa.tapas.g.an r14 = r0.mo99348a(r14)
            java.lang.String r0 = r13.f125508b
            j$.util.Optional r1 = r14.mo99343e()
            boolean r2 = r1.isEmpty()
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0039
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x0036:
            r9 = r0
            goto L_0x024f
        L_0x0039:
            java.lang.Object r1 = r1.get()
            java.lang.String r1 = (java.lang.String) r1
            dagger.a r2 = r12.f310459h
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.m.p r2 = (com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111591p) r2
            java.lang.String r2 = r2.mo99187a(r1)
            j$.util.Optional r2 = p3186j$.util.Optional.ofNullable(r2)
            boolean r6 = r2.isEmpty()
            java.lang.String r7 = "AppActionsSliceProc"
            if (r6 == 0) goto L_0x006b
            com.google.common.f.e r0 = f310453d
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r7)
            java.lang.String r1 = "Slice URI optional is not present"
            r2 = 27340(0x6acc, float:3.8312E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            goto L_0x0233
        L_0x006b:
            java.lang.Object r6 = r2.get()
            java.lang.String r6 = (java.lang.String) r6
            android.net.Uri r6 = android.net.Uri.parse(r6)
            if (r6 == 0) goto L_0x0233
            android.content.pm.PackageManager r8 = r12.f310457f
            java.lang.String r6 = r6.getAuthority()
            r6.getClass()
            android.content.pm.ProviderInfo r6 = r8.resolveContentProvider(r6, r5)
            if (r6 == 0) goto L_0x0233
            java.lang.Object r2 = r2.get()
            java.lang.String r2 = (java.lang.String) r2
            int r6 = r1.hashCode()
            switch(r6) {
                case -1384585454: goto L_0x00da;
                case -1144657654: goto L_0x00d0;
                case 46834225: goto L_0x00c6;
                case 917696521: goto L_0x00bc;
                case 1116286597: goto L_0x00b2;
                case 1838311808: goto L_0x00a8;
                case 2025923950: goto L_0x009e;
                case 2043392610: goto L_0x0094;
                default: goto L_0x0093;
            }
        L_0x0093:
            goto L_0x00e4
        L_0x0094:
            java.lang.String r6 = "Create_timer"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00e4
            r1 = 2
            goto L_0x00e5
        L_0x009e:
            java.lang.String r6 = "Create_alarm"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00e4
            r1 = 0
            goto L_0x00e5
        L_0x00a8:
            java.lang.String r6 = "Get_schedule"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00e4
            r1 = 7
            goto L_0x00e5
        L_0x00b2:
            java.lang.String r6 = "Get_alarm_info"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00e4
            r1 = 1
            goto L_0x00e5
        L_0x00bc:
            java.lang.String r6 = "Get_personal_event_info"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00e4
            r1 = 6
            goto L_0x00e5
        L_0x00c6:
            java.lang.String r6 = "Get_calendar_events"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00e4
            r1 = 5
            goto L_0x00e5
        L_0x00d0:
            java.lang.String r6 = "CalendarAgenda"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00e4
            r1 = 4
            goto L_0x00e5
        L_0x00da:
            java.lang.String r6 = "Get_reminder_info"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00e4
            r1 = 3
            goto L_0x00e5
        L_0x00e4:
            r1 = -1
        L_0x00e5:
            switch(r1) {
                case 0: goto L_0x01ef;
                case 1: goto L_0x01e5;
                case 2: goto L_0x01bd;
                case 3: goto L_0x01ab;
                case 4: goto L_0x00f2;
                case 5: goto L_0x00f2;
                case 6: goto L_0x00f2;
                case 7: goto L_0x00f2;
                default: goto L_0x00e8;
            }
        L_0x00e8:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0036
        L_0x00f2:
            com.google.android.apps.gsa.search.core.i.t r1 = r12.f310461j
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249366cF
            boolean r1 = r1.mo79746e(r6)
            if (r1 == 0) goto L_0x0199
            android.net.Uri r1 = android.net.Uri.parse(r2)
            android.net.Uri$Builder r1 = r1.buildUpon()
            com.google.android.apps.gsa.staticplugins.opa.tapas.k.p r2 = r12.f310460i
            com.google.android.apps.gsa.staticplugins.opa.tapas.k.b.a r6 = r2.f311374a
            com.google.android.libraries.assistant.s.a.c r6 = r6.mo99400a()
            com.google.android.apps.gsa.staticplugins.opa.tapas.k.b.a r2 = r2.f311374a
            com.google.android.libraries.assistant.s.a.c r2 = r2.mo99400a()
            if (r2 != 0) goto L_0x011d
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92900i(r2)
            goto L_0x0184
        L_0x011d:
            com.google.android.libraries.assistant.s.c.b r2 = com.google.android.libraries.assistant.p1594s.p1599c.C19200b.f53754f
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.assistant.s.c.a r2 = (com.google.android.libraries.assistant.p1594s.p1599c.C19199a) r2
            com.google.android.libraries.assistant.s.c.o r7 = com.google.android.libraries.assistant.p1594s.p1599c.C19213o.f53797f
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.assistant.s.c.m r7 = (com.google.android.libraries.assistant.p1594s.p1599c.C19211m) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.android.libraries.assistant.s.c.o r8 = (com.google.android.libraries.assistant.p1594s.p1599c.C19213o) r8
            r0.getClass()
            int r9 = r8.f53799a
            r9 = r9 | r4
            r8.f53799a = r9
            r8.f53801c = r0
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.android.libraries.assistant.s.c.o r8 = (com.google.android.libraries.assistant.p1594s.p1599c.C19213o) r8
            com.google.protobuf.ch r9 = r8.f53800b
            boolean r10 = r9.mo58948c()
            if (r10 != 0) goto L_0x0153
            com.google.protobuf.ch r9 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r9)
            r8.f53800b = r9
        L_0x0153:
            com.google.protobuf.ch r8 = r8.f53800b
            r9 = 174(0xae, float:2.44E-43)
            r8.mo58916g(r9)
            r2.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.android.libraries.assistant.s.c.b r8 = (com.google.android.libraries.assistant.p1594s.p1599c.C19200b) r8
            com.google.protobuf.bv r7 = r7.build()
            com.google.android.libraries.assistant.s.c.o r7 = (com.google.android.libraries.assistant.p1594s.p1599c.C19213o) r7
            r7.getClass()
            r8.f53759d = r7
            int r7 = r8.f53756a
            r7 = r7 | 128(0x80, float:1.794E-43)
            r8.f53756a = r7
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.libraries.assistant.s.c.b r2 = (com.google.android.libraries.assistant.p1594s.p1599c.C19200b) r2
            com.google.common.util.concurrent.cx r2 = r6.mo24295b(r2)
            com.google.android.apps.gsa.staticplugins.opa.tapas.k.o r6 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k.C112129o.f311373a
            com.google.common.util.concurrent.bg r7 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60922j.m93044g(r2, r6, r7)
        L_0x0184:
            com.google.common.util.concurrent.cx[] r6 = new com.google.common.util.concurrent.C60870cx[r4]
            r6[r5] = r2
            com.google.common.util.concurrent.cf r6 = com.google.common.util.concurrent.C60856cj.m92895d(r6)
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.g r7 = new com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.g
            r7.<init>(r12, r2, r0, r1)
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = r6.mo57334a(r7, r0)
            goto L_0x0036
        L_0x0199:
            android.net.Uri r0 = android.net.Uri.parse(r2)
            java.lang.String r0 = r0.toString()
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0036
        L_0x01ab:
            android.net.Uri r0 = android.net.Uri.parse(r2)
            java.lang.String r0 = r0.toString()
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0036
        L_0x01bd:
            android.net.Uri r0 = android.net.Uri.parse(r2)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r1 = "duration"
            j$.util.Optional r1 = r14.mo99340b(r1)
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.f r2 = new com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.f
            r2.<init>(r0)
            r1.ifPresent(r2)
            android.net.Uri r0 = r0.build()
            java.lang.String r0 = r0.toString()
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0036
        L_0x01e5:
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r2)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0036
        L_0x01ef:
            android.net.Uri r0 = android.net.Uri.parse(r2)
            android.net.Uri$Builder r0 = r0.buildUpon()
            java.lang.String r1 = "trigger_time"
            j$.util.Optional r1 = r14.mo99340b(r1)
            boolean r2 = r1.isPresent()
            if (r2 == 0) goto L_0x0221
            java.lang.Object r1 = r1.get()
            com.google.knowledge.a.a.j r1 = (com.google.knowledge.p4661a.p4662a.C61748j) r1
            j$.util.Optional r1 = r14.mo99341c(r1)
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.c r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111666c.f310444a
            j$.util.Optional r1 = r1.filter(r2)
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.d r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111667d.f310445a
            j$.util.Optional r1 = r1.map(r2)
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.e r2 = new com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.e
            r2.<init>(r0)
            r1.ifPresent(r2)
        L_0x0221:
            android.net.Uri r0 = r0.build()
            java.lang.String r0 = r0.toString()
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0036
        L_0x0233:
            com.google.common.f.e r0 = f310453d
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r7)
            java.lang.String r1 = "Slice URI is invalid and AppActionsSliceCompletionProcessor ends"
            r2 = 27338(0x6aca, float:3.8309E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0036
        L_0x024f:
            j$.util.Optional r14 = r14.mo99343e()
            com.google.common.b.ij r0 = f310454e
            p3186j$.util.Objects.requireNonNull(r0)
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.a r1 = new com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.a
            r1.<init>(r0)
            j$.util.Optional r14 = r14.filter(r1)
            boolean r10 = r14.isPresent()
            if (r10 == 0) goto L_0x026e
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.o r14 = r12.f310462k
            com.google.common.util.concurrent.cx r14 = r14.mo99199a(r13)
            goto L_0x0276
        L_0x026e:
            com.google.common.b.gu r14 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60856cj.m92900i(r14)
        L_0x0276:
            r11 = r14
            com.google.common.util.concurrent.cx[] r14 = new com.google.common.util.concurrent.C60870cx[r3]
            r14[r5] = r9
            r14[r4] = r11
            com.google.common.util.concurrent.cf r14 = com.google.common.util.concurrent.C60856cj.m92895d(r14)
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.b r0 = new com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.b
            r6 = r0
            r7 = r12
            r8 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            com.google.common.util.concurrent.bg r13 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r13 = r14.mo57334a(r0, r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a.C111671h.mo99200b(com.google.assistant.ad.d.al, java.lang.String):com.google.common.util.concurrent.cx");
    }
}
