package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import com.google.android.apps.gsa.binaries.satin.app.ane;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123730ax;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130931bp;
import com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131377ai;
import com.google.android.libraries.assistant.pcp.p1573k.C18912aa;
import com.google.assistant.p3886c.C50818do;
import com.google.common.p4526f.p4527a.C58974d;
import kotlinx.coroutines.C71422aw;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ak */
/* compiled from: PG */
public final class C123935ak {

    /* renamed from: a */
    public final C71422aw f342324a;

    /* renamed from: b */
    public final C130931bp f342325b;

    /* renamed from: c */
    private final C131377ai f342326c;

    /* renamed from: d */
    private final C18912aa f342327d;

    /* renamed from: e */
    private final C123939ao f342328e;

    /* renamed from: f */
    private final C69626l f342329f;

    /* renamed from: g */
    private final C58974d f342330g;

    /* renamed from: h */
    private final ane f342331h;

    public C123935ak(C131377ai aiVar, ane ane, C18912aa aaVar, C123939ao aoVar, C71422aw awVar, C130603a aVar, C130931bp bpVar, C69626l lVar) {
        C69664n.m101061g(ane, "mediaManagerCacheFactory");
        C69664n.m101061g(awVar, "backgroundScope");
        C69664n.m101061g(aVar, "loggerFactory");
        C69664n.m101061g(bpVar, "syncType");
        C69664n.m101061g(lVar, "appSelectionMethod");
        this.f342326c = aiVar;
        this.f342331h = ane;
        this.f342327d = aaVar;
        this.f342328e = aoVar;
        this.f342324a = awVar;
        this.f342325b = bpVar;
        this.f342329f = lVar;
        this.f342330g = aVar.mo109740b(this);
    }

    /* renamed from: e */
    private final Object m203249e(C69577g gVar) {
        C123730ax axVar = C123730ax.f341767b;
        C69664n.m101060f(axVar, "getDefaultInstance()");
        return m203250f(axVar, (C50818do) null, gVar);
    }

    /* renamed from: f */
    private final Object m203250f(C123730ax axVar, C50818do doVar, C69577g gVar) {
        return this.f342328e.mo106203a(axVar, doVar, gVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106193a(p3186j$.time.Instant r10, p5462h.p5466c.C69577g r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123930af
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.af r0 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123930af) r0
            int r1 = r0.f342302f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f342302f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.af r0 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.af
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f342300d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f342302f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r5) goto L_0x003a
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            p5462h.C69714l.m101134b(r11)
            goto L_0x00bc
        L_0x002e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0036:
            p5462h.C69714l.m101134b(r11)
            goto L_0x0096
        L_0x003a:
            java.lang.Object r10 = r0.f342299c
            java.lang.Object r2 = r0.f342298b
            java.lang.Object r5 = r0.f342297a
            p5462h.C69714l.m101134b(r11)
            goto L_0x007a
        L_0x0044:
            p5462h.C69714l.m101134b(r11)
            com.google.common.f.a.d r11 = r9.f342330g
            com.google.common.f.x r11 = r11.mo56224b()
            com.google.common.f.a.a r11 = (com.google.common.p4526f.p4527a.C58970a) r11
            com.google.android.apps.search.assistant.verticals.ambient.m.bp r2 = r9.f342325b
            java.lang.String r2 = r2.f358263c
            java.lang.String r6 = "#fetch: Executing fetch for: %s"
            r11.mo56389s(r6, r2)
            com.google.assistant.c.a.h r11 = com.google.assistant.p3886c.p3887a.C50672h.f131816d
            java.lang.String r2 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r2)
            h.f.a.l r2 = r9.f342329f
            java.lang.Object r2 = r2.mo5761a(r11)
            com.google.common.util.concurrent.cx r2 = (com.google.common.util.concurrent.C60870cx) r2
            r0.f342297a = r9
            r0.f342298b = r10
            r0.f342299c = r11
            r0.f342302f = r5
            java.lang.Object r2 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r0)
            if (r2 == r1) goto L_0x00bd
            r5 = r9
            r8 = r2
            r2 = r10
            r10 = r11
            r11 = r8
        L_0x007a:
            j$.util.Optional r11 = (p3186j$.util.Optional) r11
            boolean r6 = r11.isEmpty()
            r7 = 0
            if (r6 == 0) goto L_0x0097
            r0.f342297a = r7
            r0.f342298b = r7
            r0.f342299c = r7
            r0.f342302f = r4
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ak r5 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123935ak) r5
            j$.time.Instant r2 = (p3186j$.time.Instant) r2
            java.lang.Object r11 = r5.mo106195c(r2, r0)
            if (r11 != r1) goto L_0x0096
            return r1
        L_0x0096:
            return r11
        L_0x0097:
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a.b r4 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a.b
            java.lang.Object r11 = r11.get()
            java.lang.String r6 = "selectedApp.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r6)
            android.content.ComponentName r11 = (android.content.ComponentName) r11
            com.google.assistant.c.a.h r10 = (com.google.assistant.p3886c.p3887a.C50672h) r10
            r4.<init>(r11, r10)
            r0.f342297a = r7
            r0.f342298b = r7
            r0.f342299c = r7
            r0.f342302f = r3
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ak r5 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123935ak) r5
            j$.time.Instant r2 = (p3186j$.time.Instant) r2
            java.lang.Object r11 = r5.mo106196d(r4, r2, r0)
            if (r11 != r1) goto L_0x00bc
            return r1
        L_0x00bc:
            return r11
        L_0x00bd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123935ak.mo106193a(j$.time.Instant, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106194b(android.content.ComponentName r6, p3186j$.time.Instant r7, p5462h.p5466c.C69577g r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123932ah
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ah r0 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123932ah) r0
            int r1 = r0.f342311f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f342311f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ah r0 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ah
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f342309d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f342311f
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.f342308c
            java.lang.Object r6 = r0.f342307b
            java.lang.Object r0 = r0.f342306a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0058
        L_0x002d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0035:
            p5462h.C69714l.m101134b(r8)
            com.google.common.f.a.d r8 = r5.f342330g
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.a.a r8 = (com.google.common.p4526f.p4527a.C58970a) r8
            java.lang.String r2 = "%s generated no recommendations."
            java.lang.String r4 = r6.getPackageName()
            r8.mo56389s(r2, r4)
            r0.f342306a = r5
            r0.f342307b = r6
            r0.f342308c = r7
            r0.f342311f = r3
            java.lang.Object r8 = r5.m203249e(r0)
            if (r8 == r1) goto L_0x0098
            r0 = r5
        L_0x0058:
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.an r8 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123938an) r8
            boolean r1 = r8 instanceof com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123937am
            java.lang.String r2 = "component.packageName"
            if (r1 == 0) goto L_0x0079
            com.google.android.apps.search.assistant.verticals.ambient.m.bd r1 = new com.google.android.apps.search.assistant.verticals.ambient.m.bd
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ak r0 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123935ak) r0
            com.google.android.apps.search.assistant.verticals.ambient.m.bp r0 = r0.f342325b
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.am r8 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123937am) r8
            j$.time.Instant r8 = r8.f342333a
            android.content.ComponentName r6 = (android.content.ComponentName) r6
            java.lang.String r6 = r6.getPackageName()
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r2)
            j$.time.Instant r7 = (p3186j$.time.Instant) r7
            r1.<init>(r0, r7, r8, r6)
            goto L_0x0091
        L_0x0079:
            boolean r8 = r8 instanceof com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123936al
            if (r8 == 0) goto L_0x0092
            com.google.android.apps.search.assistant.verticals.ambient.m.be r1 = new com.google.android.apps.search.assistant.verticals.ambient.m.be
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ak r0 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123935ak) r0
            com.google.android.apps.search.assistant.verticals.ambient.m.bp r8 = r0.f342325b
            android.content.ComponentName r6 = (android.content.ComponentName) r6
            java.lang.String r6 = r6.getPackageName()
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r2)
            j$.time.Instant r7 = (p3186j$.time.Instant) r7
            r1.<init>(r8, r7, r6)
        L_0x0091:
            return r1
        L_0x0092:
            h.g r6 = new h.g
            r6.<init>()
            throw r6
        L_0x0098:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123935ak.mo106194b(android.content.ComponentName, j$.time.Instant, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106195c(p3186j$.time.Instant r5, p5462h.p5466c.C69577g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123933ai
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ai r0 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123933ai) r0
            int r1 = r0.f342316e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f342316e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ai r0 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ai
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f342314c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f342316e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.f342313b
            java.lang.Object r0 = r0.f342312a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0050
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            p5462h.C69714l.m101134b(r6)
            com.google.common.f.a.d r6 = r4.f342330g
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.common.f.a.a r6 = (com.google.common.p4526f.p4527a.C58970a) r6
            java.lang.String r2 = "No app selected."
            r6.mo56386p(r2)
            r0.f342312a = r4
            r0.f342313b = r5
            r0.f342316e = r3
            java.lang.Object r6 = r4.m203249e(r0)
            if (r6 == r1) goto L_0x007c
            r0 = r4
        L_0x0050:
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.an r6 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123938an) r6
            boolean r1 = r6 instanceof com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123937am
            if (r1 == 0) goto L_0x0066
            com.google.android.apps.search.assistant.verticals.ambient.m.bh r1 = new com.google.android.apps.search.assistant.verticals.ambient.m.bh
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ak r0 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123935ak) r0
            com.google.android.apps.search.assistant.verticals.ambient.m.bp r0 = r0.f342325b
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.am r6 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123937am) r6
            j$.time.Instant r6 = r6.f342333a
            j$.time.Instant r5 = (p3186j$.time.Instant) r5
            r1.<init>(r0, r5, r6)
            goto L_0x0075
        L_0x0066:
            boolean r6 = r6 instanceof com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123936al
            if (r6 == 0) goto L_0x0076
            com.google.android.apps.search.assistant.verticals.ambient.m.bi r1 = new com.google.android.apps.search.assistant.verticals.ambient.m.bi
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ak r0 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123935ak) r0
            com.google.android.apps.search.assistant.verticals.ambient.m.bp r6 = r0.f342325b
            j$.time.Instant r5 = (p3186j$.time.Instant) r5
            r1.<init>(r6, r5)
        L_0x0075:
            return r1
        L_0x0076:
            h.g r5 = new h.g
            r5.<init>()
            throw r5
        L_0x007c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123935ak.mo106195c(j$.time.Instant, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ak} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ak} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ak} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: android.content.ComponentName} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: j$.time.Instant} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v19, resolved type: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ak} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0451  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0508  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0528  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0582  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x05b4 A[SYNTHETIC, Splitter:B:147:0x05b4] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0259 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0247 A[Catch:{ all -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0260 A[Catch:{ all -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106196d(com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9335a.C123918b r32, p3186j$.time.Instant r33, p5462h.p5466c.C69577g r34) {
        /*
            r31 = this;
            r1 = r31
            r0 = r32
            r2 = r34
            boolean r3 = r2 instanceof com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123934aj
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.aj r3 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123934aj) r3
            int r4 = r3.f342323g
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f342323g = r4
            goto L_0x001e
        L_0x0019:
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.aj r3 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.aj
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f342321e
            h.c.a.a r4 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r5 = r3.f342323g
            r6 = 5
            r7 = 2
            r8 = 4
            r9 = 3
            r10 = 0
            java.lang.String r11 = "component.packageName"
            r12 = 1
            if (r5 == 0) goto L_0x0096
            if (r5 == r12) goto L_0x007d
            if (r5 == r7) goto L_0x0078
            if (r5 == r9) goto L_0x0067
            if (r5 == r8) goto L_0x0053
            if (r5 != r6) goto L_0x004b
            java.lang.Object r0 = r3.f342320d
            j$.util.Optional r0 = (p3186j$.util.Optional) r0
            java.lang.Object r4 = r3.f342319c
            android.content.ComponentName r4 = (android.content.ComponentName) r4
            java.lang.Object r5 = r3.f342318b
            j$.time.Instant r5 = (p3186j$.time.Instant) r5
            java.lang.Object r3 = r3.f342317a
            p5462h.C69714l.m101134b(r2)
            goto L_0x0530
        L_0x004b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0053:
            java.lang.Object r0 = r3.f342320d
            com.google.android.apps.search.assistant.platform.pcp.f.ax r0 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123730ax) r0
            java.lang.Object r5 = r3.f342319c
            android.content.ComponentName r5 = (android.content.ComponentName) r5
            java.lang.Object r7 = r3.f342318b
            j$.time.Instant r7 = (p3186j$.time.Instant) r7
            java.lang.Object r8 = r3.f342317a
            p5462h.C69714l.m101134b(r2)
            r15 = r8
            goto L_0x050b
        L_0x0067:
            java.lang.Object r0 = r3.f342319c
            android.content.ComponentName r0 = (android.content.ComponentName) r0
            java.lang.Object r5 = r3.f342318b
            j$.time.Instant r5 = (p3186j$.time.Instant) r5
            java.lang.Object r7 = r3.f342317a
            p5462h.C69714l.m101134b(r2)
            r15 = r7
            r7 = 1
            goto L_0x0296
        L_0x0078:
            p5462h.C69714l.m101134b(r2)
            goto L_0x05b3
        L_0x007d:
            java.lang.Object r0 = r3.f342320d
            r5 = r0
            android.content.ComponentName r5 = (android.content.ComponentName) r5
            java.lang.Object r0 = r3.f342319c
            r14 = r0
            j$.time.Instant r14 = (p3186j$.time.Instant) r14
            java.lang.Object r0 = r3.f342318b
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a.b r0 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9335a.C123918b) r0
            java.lang.Object r15 = r3.f342317a
            p5462h.C69714l.m101134b(r2)     // Catch:{ all -> 0x0093 }
            r7 = 1
            goto L_0x023b
        L_0x0093:
            r0 = move-exception
            goto L_0x05c1
        L_0x0096:
            p5462h.C69714l.m101134b(r2)
            android.content.ComponentName r5 = r0.f342275a
            com.google.android.apps.gsa.binaries.satin.app.ane r2 = r1.f342331h     // Catch:{ all -> 0x05bc }
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap     // Catch:{ all -> 0x05bc }
            r14.<init>()     // Catch:{ all -> 0x05bc }
            com.google.android.apps.gsa.binaries.satin.app.ang r15 = r2.f197999a     // Catch:{ all -> 0x05bc }
            com.google.android.apps.gsa.binaries.satin.app.aqy r15 = r15.a     // Catch:{ all -> 0x05bc }
            com.google.android.apps.gsa.binaries.satin.app.asp r15 = r15.a     // Catch:{ all -> 0x05bc }
            g.a.a r15 = r15.f202894fg     // Catch:{ all -> 0x05bc }
            java.lang.Object r15 = r15.mo17428b()     // Catch:{ all -> 0x05bc }
            com.google.android.libraries.assistant.pcp.k.j r15 = (com.google.android.libraries.assistant.pcp.p1573k.C18930j) r15     // Catch:{ all -> 0x05bc }
            com.google.android.apps.gsa.binaries.satin.app.ang r7 = r2.f197999a     // Catch:{ all -> 0x05bc }
            com.google.android.apps.gsa.binaries.satin.app.aqy r7 = r7.a     // Catch:{ all -> 0x05bc }
            com.google.android.apps.gsa.binaries.satin.app.arz r7 = r7.c     // Catch:{ all -> 0x05bc }
            com.google.android.apps.gsa.binaries.satin.app.aqy r7 = r7.f201166a     // Catch:{ all -> 0x05bc }
            com.google.android.apps.gsa.binaries.satin.app.ars r7 = r7.b     // Catch:{ all -> 0x05bc }
            e.a.a.u.a.a.ce r7 = r7.mo67421dZ()     // Catch:{ all -> 0x05bc }
            g.a.a r7 = r7.f185325a     // Catch:{ all -> 0x05bc }
            java.lang.Object r7 = r7.mo17428b()     // Catch:{ all -> 0x05bc }
            com.google.apps.tiktok.experiments.i r7 = (com.google.apps.tiktok.experiments.C46897i) r7     // Catch:{ all -> 0x05bc }
            java.lang.String r6 = "com.google.android.apps.gsa.pcp.device 45377054"
            com.google.apps.tiktok.experiments.p r6 = r7.mo50901a(r6)     // Catch:{ all -> 0x05bc }
            long r6 = r6.mo50903b()     // Catch:{ all -> 0x05bc }
            com.google.android.apps.gsa.binaries.satin.app.ang r8 = r2.f197999a     // Catch:{ all -> 0x05bc }
            com.google.android.apps.gsa.binaries.satin.app.aqy r8 = r8.a     // Catch:{ all -> 0x05bc }
            com.google.android.apps.gsa.binaries.satin.app.arz r8 = r8.c     // Catch:{ all -> 0x05bc }
            com.google.android.apps.gsa.binaries.satin.app.aqy r8 = r8.f201166a     // Catch:{ all -> 0x05bc }
            com.google.android.apps.gsa.binaries.satin.app.ars r8 = r8.b     // Catch:{ all -> 0x05bc }
            e.a.a.u.a.a.ce r8 = r8.mo67421dZ()     // Catch:{ all -> 0x05bc }
            g.a.a r8 = r8.f185325a     // Catch:{ all -> 0x05bc }
            java.lang.Object r8 = r8.mo17428b()     // Catch:{ all -> 0x05bc }
            com.google.apps.tiktok.experiments.i r8 = (com.google.apps.tiktok.experiments.C46897i) r8     // Catch:{ all -> 0x05bc }
            java.lang.String r13 = "com.google.android.apps.gsa.pcp.device 45377317"
            com.google.apps.tiktok.experiments.p r8 = r8.mo50901a(r13)     // Catch:{ all -> 0x05bc }
            long r16 = r8.mo50903b()     // Catch:{ all -> 0x05bc }
            com.google.android.apps.gsa.binaries.satin.app.ang r2 = r2.f197999a     // Catch:{ all -> 0x05bc }
            com.google.android.apps.gsa.binaries.satin.app.aqy r2 = r2.a     // Catch:{ all -> 0x05bc }
            g.a.a r2 = r2.n     // Catch:{ all -> 0x05bc }
            java.lang.Object r2 = r2.mo17428b()     // Catch:{ all -> 0x05bc }
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2     // Catch:{ all -> 0x05bc }
            java.lang.String r8 = "mediaManager"
            p5462h.p5473f.p5475b.C69664n.m101061g(r15, r8)     // Catch:{ all -> 0x05bc }
            java.lang.String r8 = "lightweightExecutor"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r8)     // Catch:{ all -> 0x05bc }
            com.google.common.util.concurrent.dr r8 = new com.google.common.util.concurrent.dr     // Catch:{ all -> 0x05bc }
            r8.<init>(r2)     // Catch:{ all -> 0x05bc }
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89846n(r32)     // Catch:{ all -> 0x05bc }
            java.lang.String r13 = "of(appContext)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r13)     // Catch:{ all -> 0x05bc }
            java.lang.String r13 = "appContexts"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r13)     // Catch:{ all -> 0x05bc }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x05bc }
            r9 = 10
            int r9 = p5462h.p5463a.C69540x.m100804k(r2, r9)     // Catch:{ all -> 0x05bc }
            r13.<init>(r9)     // Catch:{ all -> 0x05bc }
            com.google.common.b.sm r2 = r2.listIterator(r10)     // Catch:{ all -> 0x05bc }
            r9 = 0
        L_0x0129:
            boolean r18 = r2.hasNext()     // Catch:{ all -> 0x05bc }
            if (r18 == 0) goto L_0x0213
            java.lang.Object r18 = r2.next()     // Catch:{ all -> 0x05bc }
            int r19 = r9 + 1
            if (r9 >= 0) goto L_0x013a
            p5462h.p5463a.C69540x.m100952j()     // Catch:{ all -> 0x05bc }
        L_0x013a:
            r10 = r18
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a.b r10 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9335a.C123918b) r10     // Catch:{ all -> 0x05bc }
            r20 = r13
            long r12 = (long) r9     // Catch:{ all -> 0x05bc }
            int r9 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r9 < 0) goto L_0x015c
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a.c r9 = r10.f342276b     // Catch:{ all -> 0x05bc }
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a.e r12 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a.e     // Catch:{ all -> 0x05bc }
            r12.<init>(r10)     // Catch:{ all -> 0x05bc }
            com.google.common.util.concurrent.cx r12 = com.google.common.util.concurrent.C60856cj.m92900i(r12)     // Catch:{ all -> 0x05bc }
            java.lang.Object r9 = p3186j$.util.Map.EL.getOrDefault(r14, r9, r12)     // Catch:{ all -> 0x05bc }
            com.google.common.util.concurrent.cx r9 = (com.google.common.util.concurrent.C60870cx) r9     // Catch:{ all -> 0x05bc }
            r21 = r2
            r23 = r6
            goto L_0x01fe
        L_0x015c:
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a.c r9 = r10.f342276b     // Catch:{ all -> 0x05bc }
            java.util.Set r12 = r14.entrySet()     // Catch:{ all -> 0x05bc }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x05bc }
            r13.<init>()     // Catch:{ all -> 0x05bc }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x05bc }
        L_0x016b:
            boolean r21 = r12.hasNext()     // Catch:{ all -> 0x05bc }
            if (r21 == 0) goto L_0x0197
            r21 = r2
            java.lang.Object r2 = r12.next()     // Catch:{ all -> 0x05bc }
            r22 = r2
            java.util.Map$Entry r22 = (java.util.Map.Entry) r22     // Catch:{ all -> 0x05bc }
            java.lang.Object r22 = r22.getKey()     // Catch:{ all -> 0x05bc }
            r23 = r6
            r6 = r22
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a.c r6 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9335a.C123919c) r6     // Catch:{ all -> 0x05bc }
            android.content.ComponentName r6 = r6.f342278a     // Catch:{ all -> 0x05bc }
            android.content.ComponentName r7 = r9.f342278a     // Catch:{ all -> 0x05bc }
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r6, r7)     // Catch:{ all -> 0x05bc }
            if (r6 == 0) goto L_0x0192
            r13.add(r2)     // Catch:{ all -> 0x05bc }
        L_0x0192:
            r2 = r21
            r6 = r23
            goto L_0x016b
        L_0x0197:
            r21 = r2
            r23 = r6
            int r2 = r13.size()     // Catch:{ all -> 0x05bc }
            long r6 = (long) r2     // Catch:{ all -> 0x05bc }
            int r2 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x01da
            java.util.Iterator r2 = r13.iterator()     // Catch:{ all -> 0x05bc }
        L_0x01a8:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x05bc }
            if (r6 == 0) goto L_0x01c2
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x05bc }
            r7 = r6
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ all -> 0x05bc }
            java.lang.Object r7 = r7.getKey()     // Catch:{ all -> 0x05bc }
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a.c r7 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9335a.C123919c) r7     // Catch:{ all -> 0x05bc }
            com.google.assistant.s.a.j r7 = r7.f342279b     // Catch:{ all -> 0x05bc }
            com.google.assistant.s.a.j r9 = com.google.assistant.p3994s.p3995a.C53306j.AMBIENT_ASSISTANT     // Catch:{ all -> 0x05bc }
            if (r7 != r9) goto L_0x01a8
            goto L_0x01c3
        L_0x01c2:
            r6 = 0
        L_0x01c3:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ all -> 0x05bc }
            if (r6 == 0) goto L_0x01d0
            java.lang.Object r2 = r6.getValue()     // Catch:{ all -> 0x05bc }
            r9 = r2
            com.google.common.util.concurrent.cx r9 = (com.google.common.util.concurrent.C60870cx) r9     // Catch:{ all -> 0x05bc }
            if (r9 != 0) goto L_0x01fe
        L_0x01d0:
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a.e r2 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a.e     // Catch:{ all -> 0x05bc }
            r2.<init>(r10)     // Catch:{ all -> 0x05bc }
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60856cj.m92900i(r2)     // Catch:{ all -> 0x05bc }
            goto L_0x01fe
        L_0x01da:
            android.content.ComponentName r2 = r9.f342278a     // Catch:{ all -> 0x05bc }
            com.google.assistant.s.a.j r6 = r9.f342279b     // Catch:{ all -> 0x05bc }
            com.google.common.b.gu r7 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ all -> 0x05bc }
            com.google.common.util.concurrent.cx r2 = r15.mo24192a(r2, r6, r7)     // Catch:{ all -> 0x05bc }
            com.google.apps.tiktok.tracing.contrib.b.f r2 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r2)     // Catch:{ all -> 0x05bc }
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.r r6 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.r     // Catch:{ all -> 0x05bc }
            r6.<init>(r10)     // Catch:{ all -> 0x05bc }
            com.google.apps.tiktok.tracing.contrib.b.f r2 = r2.mo51515h(r6, r8)     // Catch:{ all -> 0x05bc }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.s r7 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.s     // Catch:{ all -> 0x05bc }
            r7.<init>(r10)     // Catch:{ all -> 0x05bc }
            com.google.apps.tiktok.tracing.contrib.b.f r9 = r2.mo51513e(r6, r7, r8)     // Catch:{ all -> 0x05bc }
        L_0x01fe:
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a.c r2 = r10.f342276b     // Catch:{ all -> 0x05bc }
            p3186j$.util.Map.EL.putIfAbsent(r14, r2, r9)     // Catch:{ all -> 0x05bc }
            r2 = r20
            r2.add(r9)     // Catch:{ all -> 0x05bc }
            r13 = r2
            r9 = r19
            r2 = r21
            r6 = r23
            r10 = 0
            r12 = 1
            goto L_0x0129
        L_0x0213:
            r2 = r13
            com.google.apps.tiktok.tracing.contrib.b.h r6 = com.google.apps.tiktok.tracing.contrib.p3700b.C47636i.m84743b(r2)     // Catch:{ all -> 0x05bc }
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.q r7 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.q     // Catch:{ all -> 0x05bc }
            r7.<init>(r2)     // Catch:{ all -> 0x05bc }
            com.google.apps.tiktok.tracing.contrib.b.f r2 = r6.mo51518a(r7, r8)     // Catch:{ all -> 0x05bc }
            java.lang.String r6 = "val topAppContextMediaIt… } }, sequentialExecutor)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r6)     // Catch:{ all -> 0x05bc }
            r3.f342317a = r1     // Catch:{ all -> 0x05bc }
            r3.f342318b = r0     // Catch:{ all -> 0x05bc }
            r6 = r33
            r3.f342319c = r6     // Catch:{ all -> 0x05ba }
            r3.f342320d = r5     // Catch:{ all -> 0x05ba }
            r7 = 1
            r3.f342323g = r7     // Catch:{ all -> 0x05ba }
            java.lang.Object r2 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r3)     // Catch:{ all -> 0x05ba }
            if (r2 == r4) goto L_0x05b9
            r15 = r1
            r14 = r6
        L_0x023b:
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ all -> 0x0093 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0093 }
        L_0x0241:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x0093 }
            if (r6 == 0) goto L_0x0259
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x0093 }
            r8 = r6
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a.h r8 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9335a.C123924h) r8     // Catch:{ all -> 0x0093 }
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a.b r8 = r8.mo106181a()     // Catch:{ all -> 0x0093 }
            boolean r8 = p5462h.p5473f.p5475b.C69664n.m101066l(r8, r0)     // Catch:{ all -> 0x0093 }
            if (r8 == 0) goto L_0x0241
            goto L_0x025a
        L_0x0259:
            r6 = 0
        L_0x025a:
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a.h r6 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9335a.C123924h) r6     // Catch:{ all -> 0x0093 }
            boolean r0 = r6 instanceof com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9335a.C123920d     // Catch:{ all -> 0x0093 }
            if (r0 != 0) goto L_0x05b4
            java.lang.String r0 = "null cannot be cast to non-null type com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.data.TopAppContextMediaItems.Success"
            p5462h.p5473f.p5475b.C69664n.m101059e(r6, r0)     // Catch:{ all -> 0x0093 }
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a.g r6 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9335a.C123923g) r6     // Catch:{ all -> 0x0093 }
            com.google.android.libraries.assistant.pcp.k.ab r0 = r6.mo106185b()
            if (r0 == 0) goto L_0x059e
            java.util.Queue r2 = r0.mo24150g()
            if (r2 == 0) goto L_0x059e
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x059e
            r2 = r15
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ak r2 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123935ak) r2
            com.google.android.libraries.assistant.pcp.k.aa r2 = r2.f342327d
            r6 = 3
            com.google.common.util.concurrent.cx r0 = r2.mo24220b(r0, r6)
            r3.f342317a = r15
            r3.f342318b = r14
            r3.f342319c = r5
            r2 = 0
            r3.f342320d = r2
            r3.f342323g = r6
            java.lang.Object r2 = kotlinx.coroutines.p5578d.C71663i.m104690c(r0, r3)
            if (r2 == r4) goto L_0x059d
            r0 = r5
            r5 = r14
        L_0x0296:
            com.google.android.apps.search.assistant.platform.pcp.f.av r2 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123728av) r2
            r6 = r15
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ak r6 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123935ak) r6
            com.google.common.f.a.d r8 = r6.f342330g
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.a.a r8 = (com.google.common.p4526f.p4527a.C58970a) r8
            java.lang.String r9 = r2.f341756b
            com.google.protobuf.cq r10 = r2.f341758d
            int r10 = r10.size()
            java.lang.String r12 = "%s: %d items"
            r8.mo56352E(r12, r9, r10)
            com.google.android.apps.search.assistant.platform.pcp.f.ax r8 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123730ax.f341767b
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.search.assistant.platform.pcp.f.aw r8 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123729aw) r8
            java.util.List r9 = p5462h.p5463a.C69540x.m100944b(r2)
            r8.mo106114a(r9)
            com.google.protobuf.bv r8 = r8.build()
            java.lang.String r9 = "newBuilder()\n        .ad…dation))\n        .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)
            com.google.android.apps.search.assistant.platform.pcp.f.ax r8 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123730ax) r8
            com.google.android.apps.search.assistant.verticals.ambient.s.j.ai r6 = r6.f342326c
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.aw r9 = r6.f359124g
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ax r10 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ax
            java.lang.String r12 = "com.google.android.apps.youtube.music"
            java.lang.String r13 = r2.f341756b
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x030b
            com.google.protobuf.fb r12 = r2.f341763i
            if (r12 != 0) goto L_0x02e0
            com.google.protobuf.fb r12 = com.google.protobuf.C63037fb.f170144b
        L_0x02e0:
            com.google.protobuf.dn r12 = r12.f170146a
            java.util.Map r12 = java.util.Collections.unmodifiableMap(r12)
            java.lang.String r13 = "com.google.android.apps.youtube.music.mediabrowser.user_has_premium_entitlement"
            boolean r14 = r12.containsKey(r13)
            if (r14 == 0) goto L_0x030b
            java.lang.Object r12 = r12.get(r13)
            com.google.protobuf.ga r12 = (com.google.protobuf.C63063ga) r12
            if (r12 == 0) goto L_0x030b
            int r13 = r12.f170181a
            r14 = 4
            if (r13 != r14) goto L_0x0308
            java.lang.Object r12 = r12.f170182b
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x0308
            com.google.android.libraries.assistant.auto.tng.morris.e.qe r12 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14626qe.YOUTUBE_PREMIUM_USER
            goto L_0x030d
        L_0x0308:
            com.google.android.libraries.assistant.auto.tng.morris.e.qe r12 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14626qe.YOUTUBE_FREE_USER
            goto L_0x030d
        L_0x030b:
            com.google.android.libraries.assistant.auto.tng.morris.e.qe r12 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14626qe.STATUS_UNKNOWN
        L_0x030d:
            g.a.a r13 = r9.f342347a
            java.lang.Object r13 = r13.mo17428b()
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.e r13 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123968e) r13
            g.a.a r14 = r9.f342348b
            java.lang.Object r14 = r14.mo17428b()
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.o r14 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123978o) r14
            g.a.a r9 = r9.f342349c
            java.lang.Object r9 = r9.mo17428b()
            com.google.android.apps.search.assistant.verticals.ambient.e.a r9 = (com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a) r9
            r10.<init>(r12, r13, r14, r9)
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.e r9 = r6.f359123f
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.h r12 = r6.f359125h
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.i r27 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.i
            g.a.a r13 = r12.f342433b
            java.lang.Object r13 = r13.mo17428b()
            r21 = r13
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.o r21 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123978o) r21
            g.a.a r13 = r12.f342434c
            java.lang.Object r13 = r13.mo17428b()
            r22 = r13
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.e r22 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123968e) r22
            g.a.a r13 = r12.f342436e
            java.lang.Object r13 = r13.mo17428b()
            r23 = r13
            com.google.android.apps.search.assistant.verticals.ambient.e.a r23 = (com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a) r23
            g.a.a r13 = r12.f342432a     // Catch:{ NameNotFoundException -> 0x0361 }
            java.lang.Object r13 = r13.mo17428b()     // Catch:{ NameNotFoundException -> 0x0361 }
            android.content.Context r13 = (android.content.Context) r13     // Catch:{ NameNotFoundException -> 0x0361 }
            android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0361 }
            java.lang.String r14 = "com.google.android.apps.podcasts"
            r7 = 0
            r13.getPackageInfo(r14, r7)     // Catch:{ NameNotFoundException -> 0x0362 }
            r24 = 1
            goto L_0x0364
        L_0x0361:
            r7 = 0
        L_0x0362:
            r24 = 0
        L_0x0364:
            g.a.a r7 = r12.f342435d
            java.lang.Object r7 = r7.mo17428b()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r25 = r7.booleanValue()
            r20 = r27
            r20.<init>(r21, r22, r23, r24, r25)
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.c r7 = r6.f359126i
            java.lang.String r20 = "com.google.android.apps.youtube.music"
            java.lang.String r22 = "com.pandora.android"
            java.lang.String r24 = "com.spotify.music"
            java.lang.String r26 = "com.google.android.googlequicksearchbox"
            java.lang.String r28 = "deezer.android.app"
            r21 = r10
            r23 = r9
            r25 = r9
            r29 = r7
            com.google.common.b.hd r7 = com.google.common.p4522b.C58495hd.m89904r(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            com.google.protobuf.cq r2 = r2.f341758d
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.apps.search.assistant.verticals.ambient.s.j.o r9 = new com.google.android.apps.search.assistant.verticals.ambient.s.j.o
            r9.<init>(r6, r7)
            j$.util.stream.Stream r2 = r2.map(r9)
            com.google.android.apps.search.assistant.verticals.ambient.s.j.p r7 = com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131406p.f359212a
            j$.util.stream.Stream r2 = r2.filter(r7)
            com.google.android.apps.search.assistant.verticals.ambient.s.j.q r7 = com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131407q.f359213a
            j$.util.stream.Stream r2 = r2.map(r7)
            j$.util.stream.Collector r7 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r2 = r2.collect(r7)
            com.google.common.b.gu r2 = (com.google.common.p4522b.C58485gu) r2
            com.google.common.b.gp r7 = com.google.common.p4522b.C58485gu.m89837e()
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x03bd:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x03f6
            java.lang.Object r10 = r2.next()
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.m r10 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123976m) r10
            j$.util.Optional r12 = r10.mo106208c()
            boolean r12 = r12.isPresent()
            if (r12 == 0) goto L_0x03bd
            j$.util.Optional r12 = r10.mo106208c()
            java.lang.Object r12 = r12.get()
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = r9.add(r12)
            if (r13 == 0) goto L_0x03e7
            r7.mo55395g(r10)
            goto L_0x03bd
        L_0x03e7:
            com.google.common.f.a.d r10 = r6.f359119b
            com.google.common.f.x r10 = r10.mo56224b()
            java.lang.String r13 = "Deduping %s"
            r14 = 39240(0x9948, float:5.4987E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r10).mo56372aa(r14)).mo56389s(r13, r12)
            goto L_0x03bd
        L_0x03f6:
            com.google.common.b.gu r2 = r7.mo55394f()
            j$.util.stream.Stream r7 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.apps.search.assistant.verticals.ambient.s.j.r r9 = com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131408r.f359214a
            com.google.android.apps.search.assistant.verticals.ambient.s.j.s r10 = com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131409s.f359215a
            com.google.android.apps.search.assistant.verticals.ambient.s.j.t r12 = com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131410t.f359216a
            j$.util.stream.Collector r9 = com.google.common.p4522b.C58370cn.m89403c(r9, r10, r12)
            java.lang.Object r7 = r7.collect(r9)
            com.google.common.b.hd r7 = (com.google.common.p4522b.C58495hd) r7
            com.google.common.b.ij r7 = r7.entrySet()
            j$.util.stream.Stream r7 = p3186j$.util.Collection.EL.stream(r7)
            com.google.android.apps.search.assistant.verticals.ambient.s.j.u r9 = new com.google.android.apps.search.assistant.verticals.ambient.s.j.u
            r9.<init>(r6)
            j$.util.stream.Stream r7 = r7.peek(r9)
            com.google.android.apps.search.assistant.verticals.ambient.s.j.v r9 = new com.google.android.apps.search.assistant.verticals.ambient.s.j.v
            r9.<init>(r6)
            j$.util.stream.Stream r7 = r7.filter(r9)
            com.google.android.apps.search.assistant.verticals.ambient.s.j.x r9 = com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131414x.f359220a
            j$.util.stream.Stream r7 = r7.map(r9)
            j$.util.stream.Collector r9 = com.google.common.p4522b.C58370cn.f155947b
            java.lang.Object r7 = r7.collect(r9)
            com.google.common.b.ij r7 = (com.google.common.p4522b.C58528ij) r7
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.apps.search.assistant.verticals.ambient.s.j.y r9 = new com.google.android.apps.search.assistant.verticals.ambient.s.j.y
            r9.<init>(r7)
            j$.util.stream.Stream r2 = r2.filter(r9)
            j$.util.stream.Collector r7 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r2 = r2.collect(r7)
            com.google.common.b.gu r2 = (com.google.common.p4522b.C58485gu) r2
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L_0x046d
            com.google.common.f.a.d r2 = r6.f359119b
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r6 = "#process: No apps has enough recommendations. Returning empty."
            r7 = 39242(0x994a, float:5.499E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r7)).mo56386p(r6)
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92900i(r2)
            com.google.apps.tiktok.tracing.contrib.b.f r2 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r2)
            goto L_0x04f2
        L_0x046d:
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
            long r9 = r6.f359127j
            r12 = 6
            long r9 = r9 + r12
            j$.util.stream.Stream r2 = r2.limit(r9)
            j$.util.stream.Collector r7 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r2 = r2.collect(r7)
            com.google.common.b.gu r2 = (com.google.common.p4522b.C58485gu) r2
            com.google.common.f.a.d r7 = r6.f359119b
            com.google.common.f.x r7 = r7.mo56224b()
            int r9 = r2.size()
            r10 = 39241(0x9949, float:5.4988E-41)
            java.lang.String r12 = "#process: Loading %d images."
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r7).mo56372aa(r10)).mo56387q(r12, r9)
            j$.util.stream.Stream r7 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.apps.search.assistant.verticals.ambient.s.j.aa r9 = com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131369aa.f359108a
            j$.util.stream.Stream r7 = r7.map(r9)
            com.google.android.apps.search.assistant.verticals.ambient.s.j.ab r9 = com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131370ab.f359109a
            j$.util.stream.Stream r7 = r7.filter(r9)
            com.google.android.apps.search.assistant.verticals.ambient.s.j.ac r9 = com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131371ac.f359110a
            j$.util.stream.Stream r7 = r7.map(r9)
            j$.util.stream.Stream r7 = r7.distinct()
            com.google.android.apps.search.assistant.verticals.ambient.s.j.ad r9 = com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131372ad.f359111a
            com.google.android.apps.search.assistant.verticals.ambient.s.j.ae r10 = new com.google.android.apps.search.assistant.verticals.ambient.s.j.ae
            r10.<init>(r6)
            com.google.android.apps.search.assistant.verticals.ambient.s.j.af r12 = com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131374af.f359113a
            j$.util.stream.Collector r9 = com.google.common.p4522b.C58370cn.m89403c(r9, r10, r12)
            java.lang.Object r7 = r7.collect(r9)
            com.google.common.b.hd r7 = (com.google.common.p4522b.C58495hd) r7
            com.google.common.b.gg r9 = r7.values()
            com.google.apps.tiktok.tracing.contrib.b.h r9 = com.google.apps.tiktok.tracing.contrib.p3700b.C47636i.m84743b(r9)
            com.google.android.apps.search.assistant.verticals.ambient.s.j.ag r10 = new com.google.android.apps.search.assistant.verticals.ambient.s.j.ag
            r10.<init>(r6, r7)
            java.util.concurrent.Executor r7 = r6.f359120c
            com.google.apps.tiktok.tracing.contrib.b.f r7 = r9.mo51519b(r10, r7)
            com.google.android.apps.search.assistant.verticals.ambient.s.j.ah r9 = new com.google.android.apps.search.assistant.verticals.ambient.s.j.ah
            r9.<init>(r6, r2)
            java.util.concurrent.Executor r10 = r6.f359120c
            com.google.apps.tiktok.tracing.contrib.b.f r7 = r7.mo51515h(r9, r10)
            com.google.android.apps.search.assistant.verticals.ambient.s.j.m r9 = com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131403m.f359207a
            java.util.concurrent.Executor r10 = r6.f359120c
            com.google.apps.tiktok.tracing.contrib.b.f r7 = r7.mo51515h(r9, r10)
            com.google.android.apps.search.assistant.verticals.ambient.s.j.n r9 = new com.google.android.apps.search.assistant.verticals.ambient.s.j.n
            r9.<init>(r6, r2)
            java.util.concurrent.Executor r2 = r6.f359120c
            com.google.apps.tiktok.tracing.contrib.b.f r2 = r7.mo51515h(r9, r2)
        L_0x04f2:
            java.lang.String r6 = "initialCardBuilder.build…spaceCard(recommendation)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r6)
            r3.f342317a = r15
            r3.f342318b = r5
            r3.f342319c = r0
            r3.f342320d = r8
            r6 = 4
            r3.f342323g = r6
            java.lang.Object r2 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r3)
            if (r2 == r4) goto L_0x059d
            r7 = r5
            r5 = r0
            r0 = r8
        L_0x050b:
            j$.util.Optional r2 = (p3186j$.util.Optional) r2
            r6 = 0
            java.lang.Object r6 = r2.orElse(r6)
            com.google.assistant.c.do r6 = (com.google.assistant.p3886c.C50818do) r6
            r3.f342317a = r15
            r3.f342318b = r7
            r3.f342319c = r5
            r3.f342320d = r2
            r8 = 5
            r3.f342323g = r8
            r8 = r15
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ak r8 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123935ak) r8
            java.lang.Object r0 = r8.m203250f(r0, r6, r3)
            if (r0 == r4) goto L_0x059d
            r4 = r5
            r5 = r7
            r3 = r15
            r30 = r2
            r2 = r0
            r0 = r30
        L_0x0530:
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.an r2 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123938an) r2
            boolean r6 = r2 instanceof com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123937am
            if (r6 == 0) goto L_0x0582
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x055e
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ak r3 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123935ak) r3
            com.google.common.f.a.d r0 = r3.f342330g
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            java.lang.String r6 = "No Smartspace card generated."
            r0.mo56386p(r6)
            com.google.android.apps.search.assistant.verticals.ambient.m.bk r0 = new com.google.android.apps.search.assistant.verticals.ambient.m.bk
            com.google.android.apps.search.assistant.verticals.ambient.m.bp r3 = r3.f342325b
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.am r2 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123937am) r2
            j$.time.Instant r2 = r2.f342333a
            java.lang.String r4 = r4.getPackageName()
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r11)
            r0.<init>(r3, r5, r2, r4)
            goto L_0x057f
        L_0x055e:
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ak r3 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123935ak) r3
            com.google.common.f.a.d r0 = r3.f342330g
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            java.lang.String r6 = "Smartspace card saved."
            r0.mo56386p(r6)
            com.google.android.apps.search.assistant.verticals.ambient.m.bm r0 = new com.google.android.apps.search.assistant.verticals.ambient.m.bm
            com.google.android.apps.search.assistant.verticals.ambient.m.bp r3 = r3.f342325b
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.am r2 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123937am) r2
            j$.time.Instant r2 = r2.f342333a
            java.lang.String r4 = r4.getPackageName()
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r11)
            r0.<init>(r3, r5, r2, r4)
        L_0x057f:
            com.google.android.apps.search.assistant.verticals.ambient.m.bo r0 = (com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130930bo) r0
            goto L_0x0596
        L_0x0582:
            boolean r0 = r2 instanceof com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123936al
            if (r0 == 0) goto L_0x0597
            com.google.android.apps.search.assistant.verticals.ambient.m.bl r0 = new com.google.android.apps.search.assistant.verticals.ambient.m.bl
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ak r3 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123935ak) r3
            com.google.android.apps.search.assistant.verticals.ambient.m.bp r2 = r3.f342325b
            java.lang.String r3 = r4.getPackageName()
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r11)
            r0.<init>(r2, r5, r3)
        L_0x0596:
            return r0
        L_0x0597:
            h.g r0 = new h.g
            r0.<init>()
            throw r0
        L_0x059d:
            return r4
        L_0x059e:
            r0 = 0
            r3.f342317a = r0
            r3.f342318b = r0
            r3.f342319c = r0
            r3.f342320d = r0
            r0 = 2
            r3.f342323g = r0
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ak r15 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123935ak) r15
            java.lang.Object r2 = r15.mo106194b(r5, r14, r3)
            if (r2 != r4) goto L_0x05b3
            return r4
        L_0x05b3:
            return r2
        L_0x05b4:
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a.d r6 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9335a.C123920d) r6     // Catch:{ all -> 0x0093 }
            java.lang.Throwable r0 = r6.f342280a     // Catch:{ all -> 0x0093 }
            throw r0     // Catch:{ all -> 0x0093 }
        L_0x05b9:
            return r4
        L_0x05ba:
            r0 = move-exception
            goto L_0x05bf
        L_0x05bc:
            r0 = move-exception
            r6 = r33
        L_0x05bf:
            r15 = r1
            r14 = r6
        L_0x05c1:
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.ak r15 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123935ak) r15
            com.google.common.f.a.d r2 = r15.f342330g
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            com.google.common.f.x r0 = r2.mo56382g(r0)
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            java.lang.String r2 = "Recommendations query for %s failed."
            r0.mo56389s(r2, r5)
            com.google.android.apps.search.assistant.verticals.ambient.m.bj r0 = new com.google.android.apps.search.assistant.verticals.ambient.m.bj
            com.google.android.apps.search.assistant.verticals.ambient.m.bp r2 = r15.f342325b
            java.lang.String r3 = r5.getPackageName()
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r11)
            r0.<init>(r2, r14, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123935ak.mo106196d(com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.a.b, j$.time.Instant, h.c.g):java.lang.Object");
    }
}
