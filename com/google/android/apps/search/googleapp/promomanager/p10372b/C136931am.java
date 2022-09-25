package com.google.android.apps.search.googleapp.promomanager.p10372b;

import android.content.Context;
import com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10131c.C133220c;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62971cq;
import com.google.protos.p4880aq.C63715ad;
import com.google.protos.p4880aq.C63717af;
import com.google.protos.p4880aq.C63766w;
import com.google.protos.p4880aq.C63768y;
import com.google.protos.p4880aq.C63769z;
import com.google.protos.p5124m.p5125a.C65603f;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.am */
/* compiled from: PG */
public final class C136931am {

    /* renamed from: a */
    public static final C59071e f372671a = C59071e.m91332i("com.google.android.apps.search.googleapp.promomanager.b.am");

    /* renamed from: b */
    private final Executor f372672b;

    /* renamed from: c */
    private final C69464a f372673c;

    /* renamed from: d */
    private final C69464a f372674d;

    /* renamed from: e */
    private final C69464a f372675e;

    /* renamed from: f */
    private final C42876ab f372676f;

    /* renamed from: g */
    private final C42876ab f372677g;

    /* renamed from: h */
    private final C133220c f372678h;

    /* renamed from: i */
    private final Context f372679i;

    /* renamed from: j */
    private final C58528ij f372680j;

    /* renamed from: k */
    private final boolean f372681k;

    public C136931am(Executor executor, C69464a aVar, C69464a aVar2, C69464a aVar3, C42876ab abVar, C42876ab abVar2, C133220c cVar, Context context, boolean z, C65603f fVar) {
        this.f372672b = executor;
        this.f372673c = aVar;
        this.f372674d = aVar2;
        this.f372675e = aVar3;
        this.f372678h = cVar;
        this.f372679i = context;
        this.f372676f = abVar;
        this.f372680j = C58528ij.m90006F(fVar.f178307a);
        this.f372681k = z;
        this.f372677g = abVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x033e, code lost:
        if (r6.getImportance() > 0) goto L_0x0342;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.common.util.concurrent.C60870cx m222589c(com.google.protos.p4880aq.C63766w r22, com.google.android.apps.search.googleapp.promomanager.p10372b.C137009dj r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            int r3 = r1.f172503a
            int r3 = com.google.protos.p4880aq.C63763t.m96305a(r3)
            r4 = 1
            if (r3 != 0) goto L_0x0010
            r3 = 1
        L_0x0010:
            r5 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            com.google.common.util.concurrent.C60856cj.m92900i(r6)
            int r7 = r3 + -1
            java.lang.String r8 = ""
            r9 = -1
            switch(r7) {
                case 0: goto L_0x02f5;
                case 1: goto L_0x02ea;
                case 2: goto L_0x02df;
                case 3: goto L_0x02d2;
                case 4: goto L_0x02b5;
                case 5: goto L_0x026c;
                case 6: goto L_0x0106;
                case 7: goto L_0x00e4;
                case 8: goto L_0x009c;
                case 9: goto L_0x0046;
                case 10: goto L_0x003e;
                default: goto L_0x0020;
            }
        L_0x0020:
            com.google.protobuf.dn r2 = r1.f172504b
            java.lang.String r6 = "notificationCategoryEnum"
            boolean r7 = r2.containsKey(r6)
            if (r7 == 0) goto L_0x035f
            java.lang.Object r2 = r2.get(r6)
            com.google.protos.aq.ab r2 = (com.google.protos.p4880aq.C63713ab) r2
            int r6 = r2.f172260a
            if (r6 != r4) goto L_0x02fa
            java.lang.Object r2 = r2.f172261b
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r9 = r2.intValue()
            goto L_0x02fa
        L_0x003e:
            com.google.android.apps.search.googleapp.accounts.ui.b.c.c r2 = r0.f372678h
            com.google.common.util.concurrent.cx r2 = r2.mo111027a()
            goto L_0x034a
        L_0x0046:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r6 = "android.intent.action.MAIN"
            r2.<init>(r6)
            java.lang.String r6 = "android.intent.category.HOME"
            r2.addCategory(r6)
            android.content.Context r6 = r0.f372679i
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            r7 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r2 = r6.resolveActivity(r2, r7)
            if (r2 == 0) goto L_0x0068
            android.content.pm.ActivityInfo r6 = r2.activityInfo
            if (r6 == 0) goto L_0x0068
            android.content.pm.ActivityInfo r2 = r2.activityInfo
            java.lang.String r8 = r2.packageName
        L_0x0068:
            com.google.common.f.e r2 = f372671a
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r6 = "Default launcher package name is %s"
            r7 = 40839(0x9f87, float:5.7228E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r7)).mo56389s(r6, r8)
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            if (r2 != 0) goto L_0x0084
            com.google.common.b.ij r2 = r0.f372680j
            boolean r2 = r2.contains(r8)
            if (r2 != 0) goto L_0x0091
        L_0x0084:
            android.content.Context r2 = r0.f372679i
            android.appwidget.AppWidgetManager r2 = android.appwidget.AppWidgetManager.getInstance(r2)
            boolean r2 = r2.isRequestPinAppWidgetSupported()
            if (r2 == 0) goto L_0x0091
            goto L_0x0092
        L_0x0091:
            r4 = 0
        L_0x0092:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92900i(r2)
            goto L_0x034a
        L_0x009c:
            g.a.a r2 = r0.f372675e
            java.lang.Object r2 = r2.mo17428b()
            com.google.android.apps.search.googleapp.t.c.b r2 = (com.google.android.apps.search.googleapp.p10516t.p10519c.C139695b) r2
            j$.util.Optional r2 = r2.mo115169a()
            java.lang.Object r2 = r2.orElse(r8)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = com.google.common.base.C58890d.m90988c(r2)
            com.google.protobuf.dn r4 = r1.f172504b
            java.lang.String r5 = "entrySourcePrefix"
            boolean r6 = r4.containsKey(r5)
            if (r6 == 0) goto L_0x00de
            java.lang.Object r4 = r4.get(r5)
            com.google.protos.aq.ab r4 = (com.google.protos.p4880aq.C63713ab) r4
            int r5 = r4.f172260a
            r6 = 3
            if (r5 != r6) goto L_0x00cc
            java.lang.Object r4 = r4.f172261b
            r8 = r4
            java.lang.String r8 = (java.lang.String) r8
        L_0x00cc:
            java.lang.String r4 = com.google.common.base.C58890d.m90988c(r8)
            boolean r2 = r2.startsWith(r4)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92900i(r2)
            goto L_0x034a
        L_0x00de:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x00e4:
            android.content.Context r2 = r0.f372679i
            java.lang.Class<android.content.pm.ShortcutManager> r4 = android.content.pm.ShortcutManager.class
            java.lang.Object r2 = r2.getSystemService(r4)
            android.content.pm.ShortcutManager r2 = (android.content.pm.ShortcutManager) r2
            java.util.List r2 = r2.getPinnedShortcuts()
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.apps.search.googleapp.promomanager.b.z r4 = com.google.android.apps.search.googleapp.promomanager.p10372b.C137031z.f372923a
            boolean r2 = r2.anyMatch(r4)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92900i(r2)
            goto L_0x034a
        L_0x0106:
            com.google.protos.aq.ab r5 = com.google.protos.p4880aq.C63713ab.f172258c
            com.google.protobuf.dn r6 = r1.f172504b
            java.lang.String r7 = "featureTypeEnum"
            boolean r8 = r6.containsKey(r7)
            if (r8 == 0) goto L_0x0118
            java.lang.Object r5 = r6.get(r7)
            com.google.protos.aq.ab r5 = (com.google.protos.p4880aq.C63713ab) r5
        L_0x0118:
            int r6 = r5.f172260a
            if (r6 != r4) goto L_0x0126
            java.lang.Object r5 = r5.f172261b
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r13 = r5
            goto L_0x0127
        L_0x0126:
            r13 = -1
        L_0x0127:
            com.google.protos.aq.ab r5 = com.google.protos.p4880aq.C63713ab.f172258c
            com.google.protobuf.dn r6 = r1.f172504b
            java.lang.String r7 = "metricEnum"
            boolean r8 = r6.containsKey(r7)
            if (r8 == 0) goto L_0x0139
            java.lang.Object r5 = r6.get(r7)
            com.google.protos.aq.ab r5 = (com.google.protos.p4880aq.C63713ab) r5
        L_0x0139:
            int r6 = r5.f172260a
            if (r6 != r4) goto L_0x0148
            java.lang.Object r5 = r5.f172261b
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r17 = r5
            goto L_0x014a
        L_0x0148:
            r17 = -1
        L_0x014a:
            com.google.protobuf.dn r5 = r1.f172504b
            java.lang.String r6 = "engagementEnum"
            boolean r7 = r5.containsKey(r6)
            if (r7 == 0) goto L_0x0266
            java.lang.Object r5 = r5.get(r6)
            com.google.protos.aq.ab r5 = (com.google.protos.p4880aq.C63713ab) r5
            int r6 = r5.f172260a
            if (r6 != r4) goto L_0x0169
            java.lang.Object r5 = r5.f172261b
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r20 = r5
            goto L_0x016b
        L_0x0169:
            r20 = -1
        L_0x016b:
            com.google.protobuf.fg r2 = r2.f372883c
            if (r2 != 0) goto L_0x0171
            com.google.protobuf.fg r2 = com.google.protobuf.C63042fg.f170152c
        L_0x0171:
            j$.time.Instant r2 = com.google.protobuf.p4750c.C62950b.m95474e(r2)
            j$.time.temporal.ChronoUnit r5 = p3186j$.time.temporal.ChronoUnit.DAYS
            j$.time.Instant r2 = r2.truncatedTo(r5)
            r5 = 1
            j$.time.Duration r5 = p3186j$.time.Duration.ofDays(r5)
            j$.time.Instant r2 = r2.minus(r5)
            long r15 = r2.toEpochMilli()
            boolean r2 = r0.f372681k
            java.lang.String r5 = "granularityEnum"
            java.lang.String r6 = "durationEnum"
            r7 = 0
            if (r2 == 0) goto L_0x01fe
            com.google.protobuf.dn r2 = r1.f172504b
            boolean r8 = r2.containsKey(r6)
            if (r8 == 0) goto L_0x01f8
            java.lang.Object r2 = r2.get(r6)
            com.google.protos.aq.ab r2 = (com.google.protos.p4880aq.C63713ab) r2
            int r6 = r2.f172260a
            if (r6 != r4) goto L_0x01ad
            java.lang.Object r2 = r2.f172261b
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L_0x01ae
        L_0x01ad:
            r2 = -1
        L_0x01ae:
            int r14 = com.google.protos.p5145v.C65914r.m96827a(r2)
            if (r14 == 0) goto L_0x01f7
            com.google.protobuf.dn r2 = r1.f172504b
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x01f1
            java.lang.Object r2 = r2.get(r5)
            com.google.protos.aq.ab r2 = (com.google.protos.p4880aq.C63713ab) r2
            int r5 = r2.f172260a
            if (r5 != r4) goto L_0x01ce
            java.lang.Object r2 = r2.f172261b
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r9 = r2.intValue()
        L_0x01ce:
            int r2 = com.google.protos.p5145v.C65915s.m96828a(r9)
            if (r2 == 0) goto L_0x01f0
            com.google.android.libraries.storage.protostore.ab r4 = r0.f372677g
            com.google.common.util.concurrent.cx r4 = r4.mo46042d()
            com.google.android.apps.search.googleapp.promomanager.b.ah r5 = new com.google.android.apps.search.googleapp.promomanager.b.ah
            r10 = r5
            r11 = r15
            r15 = r2
            r16 = r20
            r10.<init>(r11, r13, r14, r15, r16)
            java.util.concurrent.Executor r2 = r0.f372672b
            com.google.common.base.ah r5 = com.google.apps.tiktok.tracing.C47810es.m84963c(r5)
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60922j.m93044g(r4, r5, r2)
            goto L_0x034a
        L_0x01f0:
            throw r7
        L_0x01f1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x01f7:
            throw r7
        L_0x01f8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x01fe:
            com.google.protobuf.dn r2 = r1.f172504b
            boolean r8 = r2.containsKey(r6)
            if (r8 == 0) goto L_0x0260
            java.lang.Object r2 = r2.get(r6)
            com.google.protos.aq.ab r2 = (com.google.protos.p4880aq.C63713ab) r2
            int r6 = r2.f172260a
            if (r6 != r4) goto L_0x0219
            java.lang.Object r2 = r2.f172261b
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L_0x021a
        L_0x0219:
            r2 = -1
        L_0x021a:
            int r18 = p5451f.p5452a.p5453a.p5454a.C69452q.m100763a(r2)
            if (r18 == 0) goto L_0x025f
            com.google.protobuf.dn r2 = r1.f172504b
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x0259
            java.lang.Object r2 = r2.get(r5)
            com.google.protos.aq.ab r2 = (com.google.protos.p4880aq.C63713ab) r2
            int r5 = r2.f172260a
            if (r5 != r4) goto L_0x023a
            java.lang.Object r2 = r2.f172261b
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r9 = r2.intValue()
        L_0x023a:
            int r19 = p5451f.p5452a.p5453a.p5454a.C69453r.m100764a(r9)
            if (r19 == 0) goto L_0x0258
            com.google.android.libraries.storage.protostore.ab r2 = r0.f372676f
            com.google.common.util.concurrent.cx r2 = r2.mo46042d()
            com.google.android.apps.search.googleapp.promomanager.b.ai r4 = new com.google.android.apps.search.googleapp.promomanager.b.ai
            r14 = r4
            r14.<init>(r15, r17, r18, r19, r20)
            java.util.concurrent.Executor r5 = r0.f372672b
            com.google.common.base.ah r4 = com.google.apps.tiktok.tracing.C47810es.m84963c(r4)
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60922j.m93044g(r2, r4, r5)
            goto L_0x034a
        L_0x0258:
            throw r7
        L_0x0259:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x025f:
            throw r7
        L_0x0260:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x0266:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x026c:
            com.google.protobuf.dn r2 = r1.f172504b
            java.lang.String r6 = "settingEnum"
            boolean r7 = r2.containsKey(r6)
            if (r7 == 0) goto L_0x02af
            java.lang.Object r2 = r2.get(r6)
            com.google.protos.aq.ab r2 = (com.google.protos.p4880aq.C63713ab) r2
            int r6 = r2.f172260a
            if (r6 != r4) goto L_0x0288
            java.lang.Object r2 = r2.f172261b
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r9 = r2.intValue()
        L_0x0288:
            com.google.android.libraries.search.udcdataservice.c r2 = com.google.android.libraries.search.udcdataservice.C41387c.m72380a(r9)
            g.a.a r6 = r0.f372674d
            java.lang.Object r6 = r6.mo17428b()
            com.google.android.libraries.search.udcdataservice.h r6 = (com.google.android.libraries.search.udcdataservice.C41409h) r6
            com.google.android.libraries.search.udcdataservice.c[] r4 = new com.google.android.libraries.search.udcdataservice.C41387c[r4]
            r4[r5] = r2
            com.google.android.libraries.search.udcdataservice.a r5 = com.google.android.libraries.search.udcdataservice.C41385a.PROMO_MANAGER
            com.google.common.util.concurrent.cx r4 = r6.mo43949b(r4, r5)
            com.google.android.apps.search.googleapp.promomanager.b.ac r5 = new com.google.android.apps.search.googleapp.promomanager.b.ac
            r5.<init>(r2)
            java.util.concurrent.Executor r2 = r0.f372672b
            com.google.common.base.ah r5 = com.google.apps.tiktok.tracing.C47810es.m84963c(r5)
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60922j.m93044g(r4, r5, r2)
            goto L_0x034a
        L_0x02af:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x02b5:
            g.a.a r4 = r0.f372673c
            java.lang.Object r4 = r4.mo17428b()
            com.google.android.apps.search.googleapp.promomanager.a.a r4 = (com.google.android.apps.search.googleapp.promomanager.p10371a.C136897a) r4
            com.google.common.util.concurrent.cx r4 = r4.mo103976a()
            com.google.android.apps.search.googleapp.promomanager.b.y r5 = new com.google.android.apps.search.googleapp.promomanager.b.y
            r5.<init>(r2, r1)
            java.util.concurrent.Executor r2 = r0.f372672b
            com.google.common.base.ah r5 = com.google.apps.tiktok.tracing.C47810es.m84963c(r5)
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60922j.m93044g(r4, r5, r2)
            goto L_0x034a
        L_0x02d2:
            g.a.a r2 = r0.f372673c
            java.lang.Object r2 = r2.mo17428b()
            com.google.android.apps.search.googleapp.promomanager.a.a r2 = (com.google.android.apps.search.googleapp.promomanager.p10371a.C136897a) r2
            com.google.common.util.concurrent.cx r2 = r2.mo103977b()
            goto L_0x034a
        L_0x02df:
            boolean r2 = r2.f372884d
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92900i(r2)
            goto L_0x034a
        L_0x02ea:
            boolean r2 = r2.f372885e
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92900i(r2)
            goto L_0x034a
        L_0x02f5:
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
            goto L_0x034a
        L_0x02fa:
            android.content.Context r2 = r0.f372679i
            androidx.core.app.aq r6 = new androidx.core.app.aq
            r6.<init>(r2)
            android.app.NotificationManager r2 = r6.f5622a
            boolean r2 = androidx.core.app.C1793aj.m4937b(r2)
            if (r2 == 0) goto L_0x0341
            int r2 = com.google.p4283bv.p4345d.p4350b.p4352b.C56992b.m88249a(r9)
            if (r2 == r4) goto L_0x0342
            android.content.Context r2 = r0.f372679i
            androidx.core.app.aq r6 = new androidx.core.app.aq
            r6.<init>(r2)
            android.app.NotificationManager r2 = r6.f5622a
            java.util.List r2 = androidx.core.app.C1794ak.m4942e(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0320:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0342
            java.lang.Object r6 = r2.next()
            android.app.NotificationChannel r6 = (android.app.NotificationChannel) r6
            java.lang.String r7 = r6.getId()
            java.lang.String r8 = java.lang.String.valueOf(r9)
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0320
            int r2 = r6.getImportance()
            if (r2 <= 0) goto L_0x0341
            goto L_0x0342
        L_0x0341:
            r4 = 0
        L_0x0342:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92900i(r2)
        L_0x034a:
            com.google.apps.tiktok.tracing.contrib.b.f r4 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r2)
            com.google.android.apps.search.googleapp.promomanager.b.al r5 = new com.google.android.apps.search.googleapp.promomanager.b.al
            r5.<init>(r3, r1)
            java.util.concurrent.Executor r1 = r0.f372672b
            com.google.common.util.concurrent.cx r3 = r4.f164926b
            com.google.common.util.concurrent.bz r4 = com.google.apps.tiktok.tracing.C47810es.m84974n(r5)
            com.google.common.util.concurrent.C60856cj.m92911t(r3, r4, r1)
            return r2
        L_0x035f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            goto L_0x0366
        L_0x0365:
            throw r1
        L_0x0366:
            goto L_0x0365
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.promomanager.p10372b.C136931am.m222589c(com.google.protos.aq.w, com.google.android.apps.search.googleapp.promomanager.b.dj):com.google.common.util.concurrent.cx");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo113439a(C63715ad adVar, C137009dj djVar) {
        C63715ad adVar2;
        C63766w wVar;
        C63715ad adVar3;
        C63766w wVar2;
        C63715ad adVar4;
        C63766w wVar3;
        C62971cq<C63769z> cqVar = adVar.f172265b;
        if (cqVar.isEmpty()) {
            return C60856cj.m92900i(true);
        }
        if (cqVar.size() == 1) {
            C63769z zVar = (C63769z) cqVar.get(0);
            int i = zVar.f172508a;
            int a = C63768y.m96306a(i);
            int i2 = a - 1;
            if (a == 0) {
                throw null;
            } else if (i2 == 0) {
                if (i == 1) {
                    adVar4 = (C63715ad) zVar.f172509b;
                } else {
                    adVar4 = C63715ad.f172262c;
                }
                return C60922j.m93044g(mo113439a(adVar4, djVar), C47810es.m84963c(new C136924af(adVar)), this.f372672b);
            } else if (i2 != 1) {
                ((C59052c) ((C59052c) f372671a.mo56225c()).mo56372aa(40836)).mo56386p("Unknown condition node");
                return C60856cj.m92900i(false);
            } else {
                if (i == 2) {
                    wVar3 = (C63766w) zVar.f172509b;
                } else {
                    wVar3 = C63766w.f172501c;
                }
                return C60922j.m93044g(m222589c(wVar3, djVar), C47810es.m84963c(new C136925ag(adVar)), this.f372672b);
            }
        } else {
            int a2 = C63717af.m96288a(adVar.f172264a);
            if (a2 == 0) {
                a2 = 1;
            }
            int i3 = a2 - 1;
            if (i3 == 0) {
                ((C59052c) ((C59052c) f372671a.mo56225c()).mo56372aa(40834)).mo56386p("Unknown condition operation");
                return C60856cj.m92900i(false);
            } else if (i3 == 1) {
                ArrayList arrayList = new ArrayList();
                for (C63769z zVar2 : cqVar) {
                    int i4 = zVar2.f172508a;
                    int a3 = C63768y.m96306a(i4);
                    int i5 = a3 - 1;
                    if (a3 == 0) {
                        throw null;
                    } else if (i5 == 0) {
                        if (i4 == 1) {
                            adVar2 = (C63715ad) zVar2.f172509b;
                        } else {
                            adVar2 = C63715ad.f172262c;
                        }
                        arrayList.add(mo113439a(adVar2, djVar));
                    } else if (i5 != 1) {
                        ((C59052c) ((C59052c) f372671a.mo56225c()).mo56372aa(40833)).mo56386p("Cannot AND an unknown condition node");
                        int size = arrayList.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((C60870cx) arrayList.get(i6)).cancel(true);
                        }
                        return C60856cj.m92900i(false);
                    } else {
                        if (i4 == 2) {
                            wVar = (C63766w) zVar2.f172509b;
                        } else {
                            wVar = C63766w.f172501c;
                        }
                        arrayList.add(m222589c(wVar, djVar));
                    }
                }
                return C60922j.m93044g(C60856cj.m92896e(arrayList), C47810es.m84963c(C136929ak.f372668a), this.f372672b);
            } else if (i3 != 3) {
                ArrayList arrayList2 = new ArrayList();
                for (C63769z zVar3 : cqVar) {
                    int i7 = zVar3.f172508a;
                    int a4 = C63768y.m96306a(i7);
                    int i8 = a4 - 1;
                    if (a4 == 0) {
                        throw null;
                    } else if (i8 == 0) {
                        if (i7 == 1) {
                            adVar3 = (C63715ad) zVar3.f172509b;
                        } else {
                            adVar3 = C63715ad.f172262c;
                        }
                        arrayList2.add(mo113439a(adVar3, djVar));
                    } else if (i8 != 1) {
                        ((C59052c) ((C59052c) f372671a.mo56225c()).mo56372aa(40837)).mo56386p("Cannot OR an unknown condition node");
                        int size2 = arrayList2.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            ((C60870cx) arrayList2.get(i9)).cancel(true);
                        }
                        return C60856cj.m92900i(false);
                    } else {
                        if (i7 == 2) {
                            wVar2 = (C63766w) zVar3.f172509b;
                        } else {
                            wVar2 = C63766w.f172501c;
                        }
                        arrayList2.add(m222589c(wVar2, djVar));
                    }
                }
                return C60922j.m93044g(C60856cj.m92906o(arrayList2), C47810es.m84963c(C136919aa.f372650a), this.f372672b);
            } else {
                ((C59052c) ((C59052c) f372671a.mo56225c()).mo56372aa(40835)).mo56386p("Cannot use NOT operation for multiple nodes");
                return C60856cj.m92900i(false);
            }
        }
    }

    /* renamed from: b */
    public final C60870cx mo113440b(C63715ad adVar, C137009dj djVar) {
        C60870cx a = mo113439a(adVar, djVar);
        C136920ab abVar = C136920ab.f372651a;
        return C60846c.m92878g(a, RuntimeException.class, C47810es.m84963c(abVar), this.f372672b);
    }
}
