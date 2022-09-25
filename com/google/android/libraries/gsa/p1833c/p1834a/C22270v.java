package com.google.android.libraries.gsa.p1833c.p1834a;

import android.content.Context;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.gsa.c.a.v */
/* compiled from: PG */
public final /* synthetic */ class C22270v implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C22209ah f61538a;

    /* renamed from: b */
    public final /* synthetic */ Context f61539b;

    /* renamed from: c */
    public final /* synthetic */ C22871g f61540c;

    /* renamed from: d */
    public final /* synthetic */ C90021c f61541d;

    /* renamed from: e */
    public final /* synthetic */ boolean f61542e;

    /* renamed from: f */
    public final /* synthetic */ C58833ax f61543f;

    /* renamed from: g */
    public final /* synthetic */ C58833ax f61544g;

    /* renamed from: h */
    public final /* synthetic */ C22216ao f61545h;

    public /* synthetic */ C22270v(C22209ah ahVar, Context context, C22871g gVar, C90021c cVar, boolean z, C58833ax axVar, C58833ax axVar2, C22216ao aoVar) {
        this.f61538a = ahVar;
        this.f61539b = context;
        this.f61540c = gVar;
        this.f61541d = cVar;
        this.f61542e = z;
        this.f61543f = axVar;
        this.f61544g = axVar2;
        this.f61545h = aoVar;
    }

    /* JADX WARNING: type inference failed for: r0v30, types: [org.chromium.net.CronetEngine] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0188 A[SYNTHETIC, Splitter:B:46:0x0188] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x026e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17947a() {
        /*
            r16 = this;
            r1 = r16
            com.google.android.libraries.gsa.c.a.ah r2 = r1.f61538a
            android.content.Context r3 = r1.f61539b
            com.google.android.libraries.gsa.k.g r4 = r1.f61540c
            com.google.android.apps.gsa.shared.m.c r5 = r1.f61541d
            boolean r6 = r1.f61542e
            com.google.common.base.ax r7 = r1.f61543f
            com.google.common.base.ax r8 = r1.f61544g
            com.google.android.libraries.gsa.c.a.ao r9 = r1.f61545h
            boolean r10 = r2.f61297e
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "App-Packaged-Cronet-Provider"
            org.chromium.net.CronetProvider r0 = r9.mo27470a(r3, r0)
            r11 = 44
            r12 = 1
            r13 = 443(0x1bb, float:6.21E-43)
            if (r0 == 0) goto L_0x00f4
            org.chromium.net.CronetEngine$Builder r0 = r0.createBuilder()     // Catch:{ all -> 0x00a7 }
            org.chromium.net.ExperimentalCronetEngine$Builder r0 = (org.chromium.net.ExperimentalCronetEngine.Builder) r0     // Catch:{ all -> 0x00a7 }
            java.lang.String r15 = "cronet-async"
            com.google.android.apps.gsa.shared.m.d r14 = com.google.android.apps.gsa.shared.p7066m.C90008bn.f246902p     // Catch:{ all -> 0x00a7 }
            boolean r14 = r5.mo79746e(r14)     // Catch:{ all -> 0x00a7 }
            if (r14 != 0) goto L_0x0084
            r0.enableHttp2((boolean) r12)     // Catch:{ all -> 0x00a7 }
            com.google.android.apps.gsa.shared.m.d r14 = com.google.android.apps.gsa.shared.p7066m.C90008bn.f246900n     // Catch:{ all -> 0x00a7 }
            boolean r14 = r5.mo79746e(r14)     // Catch:{ all -> 0x00a7 }
            r0.enableQuic((boolean) r14)     // Catch:{ all -> 0x00a7 }
            com.google.android.apps.gsa.shared.m.d r14 = com.google.android.apps.gsa.shared.p7066m.C90008bn.f246892f     // Catch:{ all -> 0x00a7 }
            boolean r14 = r5.mo79746e(r14)     // Catch:{ all -> 0x00a7 }
            r0.enableBrotli(r14)     // Catch:{ all -> 0x00a7 }
            com.google.android.apps.gsa.shared.m.h r14 = com.google.android.apps.gsa.shared.p7066m.C90008bn.f246888b     // Catch:{ all -> 0x00a7 }
            java.lang.String r14 = r5.mo79758x(r14)     // Catch:{ all -> 0x00a7 }
            r0.setExperimentalOptions(r14)     // Catch:{ all -> 0x00a7 }
            r14 = -2
            r0.setThreadPriority(r14)     // Catch:{ all -> 0x00a7 }
            com.google.android.apps.gsa.shared.m.d r14 = com.google.android.apps.gsa.shared.p7066m.C90008bn.f246900n     // Catch:{ all -> 0x00a7 }
            boolean r14 = r5.mo79746e(r14)     // Catch:{ all -> 0x00a7 }
            if (r14 == 0) goto L_0x0084
            com.google.common.base.m r14 = new com.google.common.base.m     // Catch:{ all -> 0x00a7 }
            r14.<init>(r11)     // Catch:{ all -> 0x00a7 }
            com.google.common.base.cf r14 = com.google.common.base.C58869cf.m90936b(r14)     // Catch:{ all -> 0x00a7 }
            com.google.android.apps.gsa.shared.m.h r11 = com.google.android.apps.gsa.shared.p7066m.C90008bn.f246901o     // Catch:{ all -> 0x00a7 }
            java.lang.String r11 = r5.mo79758x(r11)     // Catch:{ all -> 0x00a7 }
            java.lang.Iterable r11 = r14.mo56153g(r11)     // Catch:{ all -> 0x00a7 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x00a7 }
        L_0x0074:
            boolean r14 = r11.hasNext()     // Catch:{ all -> 0x00a7 }
            if (r14 == 0) goto L_0x0084
            java.lang.Object r14 = r11.next()     // Catch:{ all -> 0x00a7 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x00a7 }
            r0.addQuicHint((java.lang.String) r14, (int) r13, (int) r13)     // Catch:{ all -> 0x00a7 }
            goto L_0x0074
        L_0x0084:
            r0.enableNetworkQualityEstimator(r10)     // Catch:{ all -> 0x00a7 }
            com.google.android.libraries.gsa.p1833c.p1834a.C22209ah.m41538m(r3, r15, r5, r0, r7)     // Catch:{ all -> 0x00a7 }
            org.chromium.net.ExperimentalCronetEngine r0 = r0.build()     // Catch:{ all -> 0x00a7 }
            com.google.android.libraries.gsa.c.a.w r11 = new com.google.android.libraries.gsa.c.a.w     // Catch:{ all -> 0x00a7 }
            r11.<init>(r4)     // Catch:{ all -> 0x00a7 }
            com.google.android.libraries.gsa.c.a.ag r14 = new com.google.android.libraries.gsa.c.a.ag     // Catch:{ all -> 0x00a7 }
            r14.<init>(r11)     // Catch:{ all -> 0x00a7 }
            r0.addRequestFinishedListener(r14)     // Catch:{ all -> 0x00a7 }
            com.google.android.apps.gsa.shared.m.d r11 = com.google.android.apps.gsa.shared.p7066m.C90008bn.f246893g     // Catch:{ all -> 0x00a7 }
            boolean r11 = r5.mo79746e(r11)     // Catch:{ all -> 0x00a7 }
            if (r11 == 0) goto L_0x00f5
            com.google.android.libraries.gsa.p1833c.p1834a.C22209ah.m41539n(r3, r0)     // Catch:{ all -> 0x00a7 }
            goto L_0x00f5
        L_0x00a7:
            r0 = move-exception
            boolean r11 = r7.mo56113h()
            if (r11 == 0) goto L_0x00df
            com.google.android.apps.gsa.shared.q.d r11 = new com.google.android.apps.gsa.shared.q.d
            r14 = 656399(0xa040f, float:9.19811E-40)
            r11.<init>((java.lang.Throwable) r0, (int) r14)
            java.lang.Object r0 = r7.mo56107c()
            dagger.a r0 = (dagger.C68214a) r0
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.logger.f r0 = (com.google.android.apps.gsa.shared.logger.C89911f) r0
            com.google.android.apps.gsa.shared.logger.e r0 = r0.mo83756b(r11)
            r0.mo83721a()
            com.google.common.f.e r0 = com.google.android.libraries.gsa.p1833c.p1834a.C22209ah.f61294b
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r15 = "CronetEngineProvidrImpl"
            r0.mo56378ag(r14, r15)
            java.lang.String r14 = "Unable to instantiate the Cronet engine.\nWARNING for AGSA developers:\nThis is usually caused by architecture mismatch, i.e. you've installed 32 bit app on 64 bit system.\nPlease check your build flags."
            r15 = 48463(0xbd4f, float:6.7911E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r11)).mo56372aa(r15)).mo56386p(r14)
            goto L_0x00f4
        L_0x00df:
            com.google.common.f.e r11 = com.google.android.libraries.gsa.p1833c.p1834a.C22209ah.f61294b
            com.google.common.f.x r11 = r11.mo56225c()
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r15 = "CronetEngineProvidrImpl"
            r11.mo56378ag(r14, r15)
            java.lang.String r14 = "Unable to instantiate the Cronet engine."
            r15 = 48462(0xbd4e, float:6.791E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56382g(r0)).mo56372aa(r15)).mo56386p(r14)
        L_0x00f4:
            r0 = 0
        L_0x00f5:
            if (r0 != 0) goto L_0x0236
            boolean r0 = r8.mo56113h()
            if (r0 == 0) goto L_0x0180
            java.lang.Object r0 = r8.mo56107c()     // Catch:{ a -> 0x015c, b -> 0x0139 }
            com.google.android.libraries.gcoreclient.u.a.a r0 = (com.google.android.libraries.gcoreclient.p1798u.p1799a.C21697a) r0     // Catch:{ a -> 0x015c, b -> 0x0139 }
            com.google.android.gms.net.C145577a.m236660b(r3)     // Catch:{ z -> 0x011f, y -> 0x0108 }
            goto L_0x0180
        L_0x0108:
            r0 = move-exception
            r8 = r0
            com.google.android.libraries.gcoreclient.h.a r0 = new com.google.android.libraries.gcoreclient.h.a     // Catch:{ a -> 0x015c, b -> 0x0139 }
            java.lang.String r11 = r8.getMessage()     // Catch:{ a -> 0x015c, b -> 0x0139 }
            java.lang.Throwable r14 = r8.getCause()     // Catch:{ a -> 0x015c, b -> 0x0139 }
            r0.<init>(r11, r14)     // Catch:{ a -> 0x015c, b -> 0x0139 }
            java.lang.StackTraceElement[] r8 = r8.getStackTrace()     // Catch:{ a -> 0x015c, b -> 0x0139 }
            r0.setStackTrace(r8)     // Catch:{ a -> 0x015c, b -> 0x0139 }
            throw r0     // Catch:{ a -> 0x015c, b -> 0x0139 }
        L_0x011f:
            r0 = move-exception
            r8 = r0
            com.google.android.libraries.gcoreclient.h.b r0 = new com.google.android.libraries.gcoreclient.h.b     // Catch:{ a -> 0x015c, b -> 0x0139 }
            java.lang.String r11 = r8.getMessage()     // Catch:{ a -> 0x015c, b -> 0x0139 }
            r8.mo119087a()     // Catch:{ a -> 0x015c, b -> 0x0139 }
            java.lang.Throwable r14 = r8.getCause()     // Catch:{ a -> 0x015c, b -> 0x0139 }
            r0.<init>(r11, r14)     // Catch:{ a -> 0x015c, b -> 0x0139 }
            java.lang.StackTraceElement[] r8 = r8.getStackTrace()     // Catch:{ a -> 0x015c, b -> 0x0139 }
            r0.setStackTrace(r8)     // Catch:{ a -> 0x015c, b -> 0x0139 }
            throw r0     // Catch:{ a -> 0x015c, b -> 0x0139 }
        L_0x0139:
            r0 = move-exception
            boolean r8 = r7.mo56113h()
            if (r8 == 0) goto L_0x017e
            java.lang.Object r8 = r7.mo56107c()
            dagger.a r8 = (dagger.C68214a) r8
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.shared.logger.f r8 = (com.google.android.apps.gsa.shared.logger.C89911f) r8
            com.google.android.apps.gsa.shared.q.d r11 = new com.google.android.apps.gsa.shared.q.d
            r14 = 6563401(0x642649, float:9.197284E-39)
            r11.<init>((java.lang.Throwable) r0, (int) r14)
            com.google.android.apps.gsa.shared.logger.e r0 = r8.mo83756b(r11)
            r0.mo83721a()
            goto L_0x017e
        L_0x015c:
            r0 = move-exception
            boolean r8 = r7.mo56113h()
            if (r8 == 0) goto L_0x017e
            java.lang.Object r8 = r7.mo56107c()
            dagger.a r8 = (dagger.C68214a) r8
            java.lang.Object r8 = r8.mo27525b()
            com.google.android.apps.gsa.shared.logger.f r8 = (com.google.android.apps.gsa.shared.logger.C89911f) r8
            com.google.android.apps.gsa.shared.q.d r11 = new com.google.android.apps.gsa.shared.q.d
            r14 = 6563400(0x642648, float:9.197282E-39)
            r11.<init>((java.lang.Throwable) r0, (int) r14)
            com.google.android.apps.gsa.shared.logger.e r0 = r8.mo83756b(r11)
            r0.mo83721a()
        L_0x017e:
            r0 = 0
            goto L_0x0186
        L_0x0180:
            java.lang.String r0 = "Google-Play-Services-Cronet-Provider"
            org.chromium.net.CronetProvider r0 = r9.mo27470a(r3, r0)
        L_0x0186:
            if (r0 == 0) goto L_0x0234
            org.chromium.net.CronetEngine$Builder r0 = r0.createBuilder()     // Catch:{ all -> 0x01e5 }
            org.chromium.net.ExperimentalCronetEngine$Builder r0 = (org.chromium.net.ExperimentalCronetEngine.Builder) r0     // Catch:{ all -> 0x01e5 }
            r0.enableHttp2((boolean) r12)     // Catch:{ all -> 0x01e5 }
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90008bn.f246900n     // Catch:{ all -> 0x01e5 }
            boolean r8 = r5.mo79746e(r8)     // Catch:{ all -> 0x01e5 }
            r0.enableQuic((boolean) r8)     // Catch:{ all -> 0x01e5 }
            r0.enableNetworkQualityEstimator(r10)     // Catch:{ all -> 0x01e5 }
            java.lang.String r8 = "cronet-gcore-cache"
            com.google.android.libraries.gsa.p1833c.p1834a.C22209ah.m41538m(r3, r8, r5, r0, r7)     // Catch:{ all -> 0x01e5 }
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90008bn.f246900n     // Catch:{ all -> 0x01e5 }
            boolean r8 = r5.mo79746e(r8)     // Catch:{ all -> 0x01e5 }
            if (r8 == 0) goto L_0x01d3
            com.google.common.base.m r8 = new com.google.common.base.m     // Catch:{ all -> 0x01e5 }
            r10 = 44
            r8.<init>(r10)     // Catch:{ all -> 0x01e5 }
            com.google.common.base.cf r8 = com.google.common.base.C58869cf.m90936b(r8)     // Catch:{ all -> 0x01e5 }
            com.google.android.apps.gsa.shared.m.h r10 = com.google.android.apps.gsa.shared.p7066m.C90008bn.f246901o     // Catch:{ all -> 0x01e5 }
            java.lang.String r5 = r5.mo79758x(r10)     // Catch:{ all -> 0x01e5 }
            java.lang.Iterable r5 = r8.mo56153g(r5)     // Catch:{ all -> 0x01e5 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x01e5 }
        L_0x01c3:
            boolean r8 = r5.hasNext()     // Catch:{ all -> 0x01e5 }
            if (r8 == 0) goto L_0x01d3
            java.lang.Object r8 = r5.next()     // Catch:{ all -> 0x01e5 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01e5 }
            r0.addQuicHint((java.lang.String) r8, (int) r13, (int) r13)     // Catch:{ all -> 0x01e5 }
            goto L_0x01c3
        L_0x01d3:
            org.chromium.net.ExperimentalCronetEngine r0 = r0.build()     // Catch:{ all -> 0x01e5 }
            com.google.android.libraries.gsa.c.a.x r5 = new com.google.android.libraries.gsa.c.a.x     // Catch:{ all -> 0x01e5 }
            r5.<init>(r4)     // Catch:{ all -> 0x01e5 }
            com.google.android.libraries.gsa.c.a.ag r4 = new com.google.android.libraries.gsa.c.a.ag     // Catch:{ all -> 0x01e5 }
            r4.<init>(r5)     // Catch:{ all -> 0x01e5 }
            r0.addRequestFinishedListener(r4)     // Catch:{ all -> 0x01e5 }
            goto L_0x0236
        L_0x01e5:
            r0 = move-exception
            boolean r4 = r7.mo56113h()
            if (r4 == 0) goto L_0x021f
            com.google.android.apps.gsa.shared.q.d r4 = new com.google.android.apps.gsa.shared.q.d
            r5 = 6563402(0x64264a, float:9.197285E-39)
            r4.<init>((java.lang.Throwable) r0, (int) r5)
            java.lang.Object r0 = r7.mo56107c()
            dagger.a r0 = (dagger.C68214a) r0
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.logger.f r0 = (com.google.android.apps.gsa.shared.logger.C89911f) r0
            com.google.android.apps.gsa.shared.logger.e r0 = r0.mo83756b(r4)
            r0.mo83721a()
            com.google.common.f.e r0 = com.google.android.libraries.gsa.p1833c.p1834a.C22209ah.f61294b
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "CronetEngineProvidrImpl"
            r0.mo56378ag(r5, r7)
            java.lang.String r5 = "Unable to instantiate the Cronet Gcore engine."
            r7 = 48461(0xbd4d, float:6.7908E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r4)).mo56372aa(r7)).mo56386p(r5)
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            goto L_0x0234
        L_0x021f:
            com.google.common.f.e r4 = com.google.android.libraries.gsa.p1833c.p1834a.C22209ah.f61294b
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "CronetEngineProvidrImpl"
            r4.mo56378ag(r5, r7)
            java.lang.String r5 = "Unable to instantiate the Cronet Gcore engine."
            r7 = 48460(0xbd4c, float:6.7907E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r0)).mo56372aa(r7)).mo56386p(r5)
        L_0x0234:
            r14 = 0
            goto L_0x0237
        L_0x0236:
            r14 = r0
        L_0x0237:
            if (r14 != 0) goto L_0x026c
            com.google.common.f.e r0 = com.google.android.libraries.gsa.p1833c.p1834a.C22209ah.f61294b
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "CronetEngineProvidrImpl"
            r0.mo56378ag(r4, r5)
            java.lang.String r4 = "Falling back to using the Cronet Java Engine. This is suboptimal."
            r5 = 48457(0xbd49, float:6.7903E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r4)
            r2.f61298f = r12
            java.lang.String r0 = "Fallback-Cronet-Provider"
            org.chromium.net.CronetProvider r0 = r9.mo27470a(r3, r0)
            if (r0 == 0) goto L_0x0264
            org.chromium.net.CronetEngine$Builder r0 = r0.createBuilder()
            org.chromium.net.CronetEngine r0 = r0.build()
            r14 = r0
            org.chromium.net.ExperimentalCronetEngine r14 = (org.chromium.net.ExperimentalCronetEngine) r14
            goto L_0x026c
        L_0x0264:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Fallback Cronet engine provider not found."
            r0.<init>(r2)
            throw r0
        L_0x026c:
            if (r6 == 0) goto L_0x030d
            r14.getClass()
            com.google.android.libraries.performance.primes.bi r0 = com.google.android.libraries.performance.primes.C31190bi.f84090c
            if (r0 != 0) goto L_0x0288
            java.lang.Object r2 = com.google.android.libraries.performance.primes.C31190bi.f84089b
            monitor-enter(r2)
            com.google.android.libraries.performance.primes.bi r0 = com.google.android.libraries.performance.primes.C31190bi.f84090c     // Catch:{ all -> 0x0285 }
            if (r0 != 0) goto L_0x0283
            com.google.android.libraries.performance.primes.bi r0 = new com.google.android.libraries.performance.primes.bi     // Catch:{ all -> 0x0285 }
            r0.<init>()     // Catch:{ all -> 0x0285 }
            com.google.android.libraries.performance.primes.C31190bi.f84090c = r0     // Catch:{ all -> 0x0285 }
        L_0x0283:
            monitor-exit(r2)     // Catch:{ all -> 0x0285 }
            goto L_0x0288
        L_0x0285:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0285 }
            throw r0
        L_0x0288:
            com.google.android.libraries.performance.primes.bi r0 = com.google.android.libraries.performance.primes.C31190bi.f84090c
            com.google.android.libraries.performance.primes.ax r2 = com.google.android.libraries.performance.primes.C31167ax.m58112a()
            boolean r2 = r2.mo36916h()
            if (r2 != 0) goto L_0x02a3
            com.google.common.f.e r0 = com.google.android.libraries.performance.primes.C31190bi.f84088a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r2 = "Network metric disabled. Skip initializing network monitor."
            r3 = 50345(0xc4a9, float:7.0548E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            goto L_0x030d
        L_0x02a3:
            java.lang.Object r2 = r0.f84091d
            monitor-enter(r2)
            java.util.Set r3 = r0.f84092e     // Catch:{ all -> 0x030a }
            boolean r3 = r3.contains(r14)     // Catch:{ all -> 0x030a }
            if (r3 == 0) goto L_0x02c6
            com.google.common.f.e r0 = com.google.android.libraries.performance.primes.C31190bi.f84088a     // Catch:{ all -> 0x030a }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x030a }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x030a }
            r3 = 50344(0xc4a8, float:7.0547E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r3)     // Catch:{ all -> 0x030a }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x030a }
            java.lang.String r3 = "Network monitoring is already started for the specified CronetEngine object, startNetworkMonitor() call is ignored"
            r0.mo56386p(r3)     // Catch:{ all -> 0x030a }
            monitor-exit(r2)     // Catch:{ all -> 0x030a }
            goto L_0x030d
        L_0x02c6:
            java.util.Set r3 = r0.f84092e     // Catch:{ all -> 0x030a }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x030a }
            if (r3 != 0) goto L_0x02e6
            com.google.common.f.e r0 = com.google.android.libraries.performance.primes.C31190bi.f84088a     // Catch:{ all -> 0x030a }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x030a }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x030a }
            r3 = 50343(0xc4a7, float:7.0546E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r3)     // Catch:{ all -> 0x030a }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x030a }
            java.lang.String r3 = "Only 1 CronetEngine monitoring is supported, startNetworkMonitor() call is ignored"
            r0.mo56386p(r3)     // Catch:{ all -> 0x030a }
            monitor-exit(r2)     // Catch:{ all -> 0x030a }
            goto L_0x030d
        L_0x02e6:
            java.util.Set r0 = r0.f84092e     // Catch:{ all -> 0x030a }
            r0.add(r14)     // Catch:{ all -> 0x030a }
            com.google.android.libraries.performance.primes.metrics.f.q r0 = new com.google.android.libraries.performance.primes.metrics.f.q     // Catch:{ all -> 0x030a }
            com.google.android.libraries.performance.primes.ax r3 = com.google.android.libraries.performance.primes.C31167ax.m58112a()     // Catch:{ all -> 0x030a }
            com.google.android.libraries.performance.primes.ay r3 = r3.f84035a     // Catch:{ all -> 0x030a }
            com.google.common.base.cr r3 = r3.mo36897b()     // Catch:{ all -> 0x030a }
            r3.getClass()
            java.lang.Object r3 = r3.mo6453a()     // Catch:{ all -> 0x030a }
            java.util.concurrent.Executor r3 = (java.util.concurrent.Executor) r3     // Catch:{ all -> 0x030a }
            com.google.android.libraries.f.a r4 = com.google.android.libraries.performance.primes.metrics.p2411f.C31458q.f84720a     // Catch:{ all -> 0x030a }
            r0.<init>(r3, r4)     // Catch:{ all -> 0x030a }
            r14.addRequestFinishedListener(r0)     // Catch:{ all -> 0x030a }
            monitor-exit(r2)     // Catch:{ all -> 0x030a }
            goto L_0x030d
        L_0x030a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x030a }
            throw r0
        L_0x030d:
            r14.getVersionString()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.p1833c.p1834a.C22270v.mo17947a():java.lang.Object");
    }
}
