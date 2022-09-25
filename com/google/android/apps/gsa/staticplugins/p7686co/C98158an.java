package com.google.android.apps.gsa.staticplugins.p7686co;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.google.android.apps.gsa.search.core.C84513aj;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.udc.C87204ah;
import com.google.android.apps.gsa.sidekick.main.p7199b.C91266f;
import com.google.android.apps.gsa.sidekick.main.p7199b.C91272l;
import com.google.android.apps.gsa.sidekick.shared.util.C91982bf;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.an */
/* compiled from: PG */
public final class C98158an {

    /* renamed from: b */
    private static final C59071e f274099b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.co.an");

    /* renamed from: a */
    public final C22871g f274100a;

    /* renamed from: c */
    private final Context f274101c;

    /* renamed from: d */
    private final C21370a f274102d;

    /* renamed from: e */
    private final C91982bf f274103e;

    /* renamed from: f */
    private final C91266f f274104f;

    /* renamed from: g */
    private final WifiManager f274105g;

    /* renamed from: h */
    private final C84513aj f274106h;

    /* renamed from: i */
    private final C91272l f274107i;

    /* renamed from: j */
    private final C92486a f274108j;

    /* renamed from: k */
    private final C87204ah f274109k;

    /* renamed from: l */
    private final C86127w f274110l;

    public C98158an(Context context, C21370a aVar, C91982bf bfVar, C91266f fVar, WifiManager wifiManager, C84513aj ajVar, C91272l lVar, C92486a aVar2, C87204ah ahVar, C86127w wVar, C22871g gVar) {
        this.f274101c = context;
        this.f274102d = aVar;
        this.f274103e = bfVar;
        this.f274104f = fVar;
        this.f274105g = wifiManager;
        this.f274106h = ajVar;
        this.f274107i = lVar;
        this.f274108j = aVar2;
        this.f274109k = ahVar;
        this.f274110l = wVar;
        this.f274100a = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x02cb A[SYNTHETIC, Splitter:B:61:0x02cb] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0363  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p375ai.p378b.C7975qx mo91000a(android.accounts.Account r13, com.google.p375ai.p378b.C7975qx r14) {
        /*
            r12 = this;
            com.google.android.apps.gsa.shared.util.p7158b.C90748e.m148224b()
            com.google.protobuf.bn r14 = r14.toBuilder()
            com.google.ai.b.qw r14 = (com.google.p375ai.p378b.C7974qw) r14
            com.google.android.apps.gsa.sidekick.main.b.f r0 = r12.f274104f
            com.google.android.apps.gsa.search.core.google.gaia.o r1 = r0.f254717a
            android.accounts.Account r1 = r1.mo79668a()
            if (r1 != 0) goto L_0x0016
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x001a
        L_0x0016:
            com.google.common.util.concurrent.cx r0 = r0.mo85541e(r1)
        L_0x001a:
            android.content.Context r1 = r12.f274101c
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            java.util.Locale r1 = r1.locale
            java.lang.String r1 = r1.toString()
            r14.copyOnWrite()
            com.google.protobuf.bv r2 = r14.instance
            com.google.ai.b.qx r2 = (com.google.p375ai.p378b.C7975qx) r2
            r1.getClass()
            int r3 = r2.f28009a
            r4 = 1
            r3 = r3 | r4
            r2.f28009a = r3
            r2.f28010b = r1
            com.google.android.libraries.f.a r1 = r12.f274102d
            long r1 = r1.mo26870b()
            r14.copyOnWrite()
            com.google.protobuf.bv r3 = r14.instance
            com.google.ai.b.qx r3 = (com.google.p375ai.p378b.C7975qx) r3
            int r5 = r3.f28009a
            r5 = r5 | 128(0x80, float:1.794E-43)
            r3.f28009a = r5
            r5 = 1000(0x3e8, double:4.94E-321)
            long r5 = r1 / r5
            r3.f28016h = r5
            java.util.TimeZone r3 = java.util.TimeZone.getDefault()
            int r1 = r3.getOffset(r1)
            r14.copyOnWrite()
            com.google.protobuf.bv r2 = r14.instance
            com.google.ai.b.qx r2 = (com.google.p375ai.p378b.C7975qx) r2
            int r3 = r2.f28009a
            r3 = r3 | 256(0x100, float:3.59E-43)
            r2.f28009a = r3
            int r1 = r1 / 1000
            r2.f28017i = r1
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
            java.lang.String r1 = r1.getID()
            if (r1 == 0) goto L_0x0087
            r14.copyOnWrite()
            com.google.protobuf.bv r2 = r14.instance
            com.google.ai.b.qx r2 = (com.google.p375ai.p378b.C7975qx) r2
            int r3 = r2.f28009a
            r3 = r3 | 512(0x200, float:7.175E-43)
            r2.f28009a = r3
            r2.f28018j = r1
        L_0x0087:
            android.content.Context r1 = r12.f274101c
            boolean r1 = android.text.format.DateFormat.is24HourFormat(r1)
            r2 = 3
            r3 = 2
            if (r4 == r1) goto L_0x0093
            r1 = 2
            goto L_0x0094
        L_0x0093:
            r1 = 3
        L_0x0094:
            r14.copyOnWrite()
            com.google.protobuf.bv r5 = r14.instance
            com.google.ai.b.qx r5 = (com.google.p375ai.p378b.C7975qx) r5
            int r1 = r1 + -1
            r5.f28020l = r1
            int r1 = r5.f28009a
            r1 = r1 | 2048(0x800, float:2.87E-42)
            r5.f28009a = r1
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.android.apps.gsa.shared.util.p7159c.C90933cc.m148547b(r0, r1)
            r1 = 0
            java.lang.Object r0 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148475i(r0, r1)
            com.google.android.libraries.gcoreclient.q.b.b r0 = (com.google.android.libraries.gcoreclient.p1788q.p1791b.C21628b) r0
            r5 = 0
            if (r13 == 0) goto L_0x0129
            com.google.android.apps.gsa.search.core.udc.ah r6 = r12.f274109k
            boolean r6 = r6.mo80840h()
            if (r6 == 0) goto L_0x00f5
            com.google.android.apps.gsa.search.core.udc.ah r6 = r12.f274109k
            com.google.bn.b.a.a.a.b r7 = com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b.LOCATION_REPORTING
            boolean r6 = r6.mo80837e(r13, r7)
            if (r6 == 0) goto L_0x0129
            com.google.android.apps.gsa.search.core.udc.ah r6 = r12.f274109k
            com.google.bn.b.a.a.a.b r7 = com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b.LOCATION_REPORTING
            boolean r6 = r6.mo80839g(r13, r7)
            r14.copyOnWrite()
            com.google.protobuf.bv r7 = r14.instance
            com.google.ai.b.qx r7 = (com.google.p375ai.p378b.C7975qx) r7
            int r8 = r7.f28009a
            r8 = r8 | 4096(0x1000, float:5.74E-42)
            r7.f28009a = r8
            r7.f28021m = r6
            com.google.android.apps.gsa.search.core.udc.ah r6 = r12.f274109k
            com.google.bn.b.a.a.a.b r7 = com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b.LOCATION_REPORTING
            boolean r6 = r6.mo80838f(r13, r7)
            r14.copyOnWrite()
            com.google.protobuf.bv r7 = r14.instance
            com.google.ai.b.qx r7 = (com.google.p375ai.p378b.C7975qx) r7
            int r8 = r7.f28009a
            r8 = r8 | 8192(0x2000, float:1.14794E-41)
            r7.f28009a = r8
            r7.f28022n = r6
            goto L_0x0129
        L_0x00f5:
            if (r0 == 0) goto L_0x0129
            boolean r6 = r0.mo27026e()
            r14.copyOnWrite()
            com.google.protobuf.bv r7 = r14.instance
            com.google.ai.b.qx r7 = (com.google.p375ai.p378b.C7975qx) r7
            int r8 = r7.f28009a
            r8 = r8 | 4096(0x1000, float:5.74E-42)
            r7.f28009a = r8
            r7.f28021m = r6
            boolean r6 = r0.mo27026e()
            if (r6 != 0) goto L_0x0119
            boolean r6 = r0.mo27029g()
            if (r6 == 0) goto L_0x0117
            goto L_0x0119
        L_0x0117:
            r6 = 0
            goto L_0x011a
        L_0x0119:
            r6 = 1
        L_0x011a:
            r14.copyOnWrite()
            com.google.protobuf.bv r7 = r14.instance
            com.google.ai.b.qx r7 = (com.google.p375ai.p378b.C7975qx) r7
            int r8 = r7.f28009a
            r8 = r8 | 8192(0x2000, float:1.14794E-41)
            r7.f28009a = r8
            r7.f28022n = r6
        L_0x0129:
            android.net.wifi.WifiManager r6 = r12.f274105g
            int r6 = r6.getWifiState()
            if (r6 == r2) goto L_0x0136
            if (r6 != r3) goto L_0x0134
            goto L_0x0136
        L_0x0134:
            r2 = 0
            goto L_0x0137
        L_0x0136:
            r2 = 1
        L_0x0137:
            r14.copyOnWrite()
            com.google.protobuf.bv r6 = r14.instance
            com.google.ai.b.qx r6 = (com.google.p375ai.p378b.C7975qx) r6
            int r7 = r6.f28009a
            r7 = r7 | 8
            r6.f28009a = r7
            r6.f28012d = r2
            android.net.wifi.WifiManager r2 = r12.f274105g     // Catch:{ NoSuchMethodError -> 0x015c }
            boolean r2 = r2.isScanAlwaysAvailable()     // Catch:{ NoSuchMethodError -> 0x015c }
            r14.copyOnWrite()     // Catch:{ NoSuchMethodError -> 0x015c }
            com.google.protobuf.bv r6 = r14.instance     // Catch:{ NoSuchMethodError -> 0x015c }
            com.google.ai.b.qx r6 = (com.google.p375ai.p378b.C7975qx) r6     // Catch:{ NoSuchMethodError -> 0x015c }
            int r7 = r6.f28009a     // Catch:{ NoSuchMethodError -> 0x015c }
            r7 = r7 | 16
            r6.f28009a = r7     // Catch:{ NoSuchMethodError -> 0x015c }
            r6.f28013e = r2     // Catch:{ NoSuchMethodError -> 0x015c }
            goto L_0x016a
        L_0x015c:
            r2 = move-exception
            com.google.common.f.e r6 = f274099b
            com.google.common.f.x r6 = r6.mo56226d()
            java.lang.String r7 = "Failed to get isScanAlwaysAvailable"
            r8 = 30462(0x76fe, float:4.2686E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r2)).mo56372aa(r8)).mo56386p(r7)
        L_0x016a:
            r14.copyOnWrite()
            com.google.protobuf.bv r2 = r14.instance
            com.google.ai.b.qx r2 = (com.google.p375ai.p378b.C7975qx) r2
            int r6 = r2.f28009a
            r6 = r6 | 32
            r2.f28009a = r6
            r2.f28014f = r5
            com.google.android.apps.gsa.sidekick.shared.util.bf r2 = r12.f274103e
            android.content.Context r6 = r2.f256482b
            android.appwidget.AppWidgetManager r6 = android.appwidget.AppWidgetManager.getInstance(r6)
            if (r6 != 0) goto L_0x0192
            com.google.common.f.e r2 = com.google.android.apps.gsa.sidekick.shared.util.C91982bf.f256481a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r6 = "No AppWidgetManager present!"
            r7 = 11948(0x2eac, float:1.6743E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r7)).mo56386p(r6)
        L_0x0190:
            r2 = 0
            goto L_0x01a3
        L_0x0192:
            android.content.ComponentName r7 = new android.content.ComponentName
            android.content.Context r2 = r2.f256482b
            java.lang.String r8 = "com.google.android.apps.sidekick.widget.PredictiveCardsWidgetProvider"
            r7.<init>(r2, r8)
            int[] r2 = r6.getAppWidgetIds(r7)
            if (r2 != 0) goto L_0x01a2
            goto L_0x0190
        L_0x01a2:
            int r2 = r2.length
        L_0x01a3:
            r14.copyOnWrite()
            com.google.protobuf.bv r6 = r14.instance
            com.google.ai.b.qx r6 = (com.google.p375ai.p378b.C7975qx) r6
            int r7 = r6.f28009a
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r6.f28009a = r7
            r6.f28019k = r2
            android.content.Context r2 = r12.f274101c
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r6 = r2.getDisplayMetrics()
            int r7 = r6.heightPixels
            int r8 = r6.widthPixels
            int r7 = java.lang.Math.max(r7, r8)
            int r8 = r6.heightPixels
            int r9 = r6.widthPixels
            int r8 = java.lang.Math.min(r8, r9)
            android.content.Context r9 = r12.f274101c
            int r10 = r6.widthPixels
            int r9 = com.google.android.apps.gsa.shared.p7148ui.p7155g.C90686c.m148056b(r9, r10, r4)
            int r10 = r6.widthPixels
            int r9 = r9 + r9
            int r10 = r10 - r9
            r9 = 2131492917(0x7f0c0035, float:1.86093E38)
            int r9 = r2.getInteger(r9)
            if (r9 <= r4) goto L_0x01ee
            r11 = 2131166909(0x7f0706bd, float:1.7948077E38)
            int r2 = r2.getDimensionPixelSize(r11)
            int r11 = r9 + -1
            int r2 = r2 * r11
            int r10 = r10 - r2
            int r10 = r10 / r9
        L_0x01ee:
            com.google.ai.b.kl r2 = com.google.p375ai.p378b.C7801kl.f27272g
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.ai.b.kk r2 = (com.google.p375ai.p378b.C7800kk) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r9 = r2.instance
            com.google.ai.b.kl r9 = (com.google.p375ai.p378b.C7801kl) r9
            int r11 = r9.f27274a
            r11 = r11 | r4
            r9.f27274a = r11
            r9.f27275b = r7
            r2.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.ai.b.kl r7 = (com.google.p375ai.p378b.C7801kl) r7
            int r9 = r7.f27274a
            r9 = r9 | r3
            r7.f27274a = r9
            r7.f27276c = r8
            float r6 = r6.density
            r2.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.ai.b.kl r7 = (com.google.p375ai.p378b.C7801kl) r7
            int r8 = r7.f27274a
            r8 = r8 | 4
            r7.f27274a = r8
            r7.f27277d = r6
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.ai.b.kl r6 = (com.google.p375ai.p378b.C7801kl) r6
            int r7 = r6.f27274a
            r7 = r7 | 16
            r6.f27274a = r7
            r6.f27279f = r10
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.ai.b.kl r6 = (com.google.p375ai.p378b.C7801kl) r6
            int r7 = r6.f27274a
            r7 = r7 | 8
            r6.f27274a = r7
            r6.f27278e = r10
            r14.copyOnWrite()
            com.google.protobuf.bv r6 = r14.instance
            com.google.ai.b.qx r6 = (com.google.p375ai.p378b.C7975qx) r6
            com.google.protobuf.bv r2 = r2.build()
            com.google.ai.b.kl r2 = (com.google.p375ai.p378b.C7801kl) r2
            r2.getClass()
            r6.f28015g = r2
            int r2 = r6.f28009a
            r2 = r2 | 64
            r6.f28009a = r2
            com.google.android.apps.gsa.sidekick.main.b.l r2 = r12.f274107i
            com.google.android.apps.gsa.search.core.h r13 = r2.mo85548a(r13, r4)
            if (r13 == 0) goto L_0x0289
            boolean r2 = r13.mo79717a()
            r14.copyOnWrite()
            com.google.protobuf.bv r6 = r14.instance
            com.google.ai.b.qx r6 = (com.google.p375ai.p378b.C7975qx) r6
            int r7 = r6.f28009a
            r8 = 32768(0x8000, float:4.5918E-41)
            r7 = r7 | r8
            r6.f28009a = r7
            r6.f28024p = r2
            boolean r13 = r13.mo79718b()
            r14.copyOnWrite()
            com.google.protobuf.bv r2 = r14.instance
            com.google.ai.b.qx r2 = (com.google.p375ai.p378b.C7975qx) r2
            int r6 = r2.f28009a
            r6 = r6 | 16384(0x4000, float:2.2959E-41)
            r2.f28009a = r6
            r2.f28023o = r13
        L_0x0289:
            com.google.android.apps.gsa.search.core.i.w r13 = r12.f274110l
            com.google.android.apps.gsa.search.core.i.aa r13 = r13.f232790a
            com.google.android.apps.gsa.search.core.preferences.r r13 = r13.mo79722a()
            java.lang.String r2 = "fake_sim_country"
            java.lang.String r6 = ""
            java.lang.String r13 = r13.getString(r2, r6)
            boolean r2 = r13.isEmpty()
            if (r2 == 0) goto L_0x02a9
            com.google.android.apps.gsa.search.core.aj r13 = r12.f274106h
            android.content.ContentResolver r13 = r13.f230010a
            java.lang.String r2 = "device_country"
            java.lang.String r13 = com.google.android.p10905k.C146606e.m238841c(r13, r2, r1)
        L_0x02a9:
            if (r13 == 0) goto L_0x02b9
            int r2 = r13.length()
            if (r2 != r3) goto L_0x02b9
            boolean r2 = android.text.TextUtils.isGraphic(r13)
            if (r2 != 0) goto L_0x02b8
            goto L_0x02b9
        L_0x02b8:
            r1 = r13
        L_0x02b9:
            if (r1 == 0) goto L_0x02c9
            r14.copyOnWrite()
            com.google.protobuf.bv r13 = r14.instance
            com.google.ai.b.qx r13 = (com.google.p375ai.p378b.C7975qx) r13
            int r2 = r13.f28009a
            r2 = r2 | r3
            r13.f28009a = r2
            r13.f28011c = r1
        L_0x02c9:
            if (r0 == 0) goto L_0x02ee
            int r13 = r0.mo27023a()     // Catch:{ SecurityException -> 0x02e0 }
            r14.copyOnWrite()     // Catch:{ SecurityException -> 0x02e0 }
            com.google.protobuf.bv r0 = r14.instance     // Catch:{ SecurityException -> 0x02e0 }
            com.google.ai.b.qx r0 = (com.google.p375ai.p378b.C7975qx) r0     // Catch:{ SecurityException -> 0x02e0 }
            int r1 = r0.f28009a     // Catch:{ SecurityException -> 0x02e0 }
            r2 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r2
            r0.f28009a = r1     // Catch:{ SecurityException -> 0x02e0 }
            r0.f28025q = r13     // Catch:{ SecurityException -> 0x02e0 }
            goto L_0x02ee
        L_0x02e0:
            r13 = move-exception
            com.google.common.f.e r0 = f274099b
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "Failed to get device tag"
            r2 = 30461(0x76fd, float:4.2685E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r13)).mo56372aa(r2)).mo56386p(r1)
        L_0x02ee:
            com.google.android.apps.gsa.speech.microdetection.a r13 = r12.f274108j
            boolean r13 = r13.mo87246t()
            r14.copyOnWrite()
            com.google.protobuf.bv r0 = r14.instance
            com.google.ai.b.qx r0 = (com.google.p375ai.p378b.C7975qx) r0
            int r1 = r0.f28009a
            r2 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 | r2
            r0.f28009a = r1
            r0.f28026r = r13
            com.google.android.apps.gsa.speech.microdetection.a r13 = r12.f274108j
            boolean r13 = r13.mo87244r()
            r14.copyOnWrite()
            com.google.protobuf.bv r0 = r14.instance
            com.google.ai.b.qx r0 = (com.google.p375ai.p378b.C7975qx) r0
            int r1 = r0.f28009a
            r2 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r2
            r0.f28009a = r1
            r0.f28027s = r13
            com.google.android.apps.gsa.speech.microdetection.a r13 = r12.f274108j
            com.google.android.apps.gsa.speech.hotword.a r0 = r13.f258091e
            com.google.android.apps.gsa.speech.hotword.a r1 = com.google.android.apps.gsa.speech.hotword.C92343a.AVAILABLE
            if (r0 == r1) goto L_0x0324
        L_0x0322:
            r4 = 0
            goto L_0x036e
        L_0x0324:
            com.google.android.apps.gsa.shared.m.c r0 = r13.f258089c
            com.google.android.apps.gsa.shared.m.b.f r1 = r13.f258088b
            boolean r0 = r13.mo87240n(r0, r1)
            if (r0 != 0) goto L_0x032f
            goto L_0x0322
        L_0x032f:
            boolean r0 = r13.mo87251y()
            if (r0 == 0) goto L_0x0336
            goto L_0x0322
        L_0x0336:
            boolean r0 = r13.mo87247u()
            if (r0 == 0) goto L_0x033d
            goto L_0x0322
        L_0x033d:
            boolean r0 = r13.mo87245s()
            if (r0 != 0) goto L_0x0344
            goto L_0x0322
        L_0x0344:
            boolean r0 = r13.mo87248v()
            if (r0 != 0) goto L_0x034b
            goto L_0x0322
        L_0x034b:
            boolean r0 = r13.mo87244r()
            if (r0 == 0) goto L_0x035a
            com.google.android.apps.gsa.shared.m.b.f r0 = r13.f258088b
            boolean r0 = r0.mo83818g()
            if (r0 == 0) goto L_0x035a
            goto L_0x0322
        L_0x035a:
            com.google.android.apps.gsa.shared.util.b r0 = r13.f258092f
            boolean r0 = r0.mo85090c()
            if (r0 == 0) goto L_0x0363
            goto L_0x0322
        L_0x0363:
            dagger.a r13 = r13.f258094h
            java.lang.Object r13 = r13.mo27525b()
            com.google.android.apps.gsa.speech.microdetection.d r13 = (com.google.android.apps.gsa.speech.microdetection.C92532d) r13
            r13.mo85077a()
        L_0x036e:
            r14.copyOnWrite()
            com.google.protobuf.bv r13 = r14.instance
            com.google.ai.b.qx r13 = (com.google.p375ai.p378b.C7975qx) r13
            int r0 = r13.f28009a
            r1 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 | r1
            r13.f28009a = r0
            r13.f28028t = r4
            com.google.protobuf.bv r13 = r14.build()
            com.google.ai.b.qx r13 = (com.google.p375ai.p378b.C7975qx) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7686co.C98158an.mo91000a(android.accounts.Account, com.google.ai.b.qx):com.google.ai.b.qx");
    }
}
