package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider;

import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138235n;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m;
import com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.C138283i;
import com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138445bt;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.v */
/* compiled from: PG */
public final class C138312v {

    /* renamed from: b */
    private static final C59071e f376306b = C59071e.m91331h();

    /* renamed from: a */
    public final C71422aw f376307a;

    /* renamed from: c */
    private final C138445bt f376308c;

    /* renamed from: d */
    private final C138235n f376309d;

    /* renamed from: e */
    private final C138300j f376310e;

    /* renamed from: f */
    private final C138283i f376311f;

    /* renamed from: g */
    private final C138315y f376312g;

    /* renamed from: h */
    private final C138165m f376313h;

    /* renamed from: i */
    private final C21370a f376314i;

    public C138312v(C138445bt btVar, C138235n nVar, C138300j jVar, C138283i iVar, C138315y yVar, C138165m mVar, C71422aw awVar, C21370a aVar) {
        C69664n.m101061g(jVar, "suggestionConverter");
        C69664n.m101061g(iVar, "imageProvider");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(aVar, "clock");
        this.f376308c = btVar;
        this.f376309d = nVar;
        this.f376310e = jVar;
        this.f376311f = iVar;
        this.f376312g = yVar;
        this.f376313h = mVar;
        this.f376307a = awVar;
        this.f376314i = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0198, code lost:
        if (r2 == r4) goto L_0x01a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114239a(com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138263n r19, p5462h.p5466c.C69577g r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138311u
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.u r3 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138311u) r3
            int r4 = r3.f376305g
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f376305g = r4
            goto L_0x001e
        L_0x0019:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.u r3 = new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.u
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f376303e
            h.c.a.a r4 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r5 = r3.f376305g
            java.lang.String r6 = "newBuilder()"
            r7 = 0
            r8 = 5
            r9 = 3
            r10 = 4
            r11 = 2
            r12 = 1
            if (r5 == 0) goto L_0x009a
            if (r5 == r12) goto L_0x0087
            if (r5 == r11) goto L_0x0074
            if (r5 == r9) goto L_0x0064
            if (r5 == r10) goto L_0x004f
            if (r5 != r8) goto L_0x0047
            java.lang.Object r1 = r3.f376301c
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.o r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138264o) r1
            java.lang.Object r4 = r3.f376300b
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bu r4 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138213bu) r4
            java.lang.Object r3 = r3.f376299a
            p5462h.C69714l.m101134b(r2)
            goto L_0x0317
        L_0x0047:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004f:
            java.lang.Object r1 = r3.f376302d
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.o r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138264o) r1
            java.lang.Object r5 = r3.f376301c
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bu r5 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138213bu) r5
            java.lang.Object r9 = r3.f376300b
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.n r9 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138263n) r9
            java.lang.Object r11 = r3.f376299a
            p5462h.C69714l.m101134b(r2)
            r13 = r9
            r9 = r11
            goto L_0x0271
        L_0x0064:
            java.lang.Object r1 = r3.f376301c
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bu r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138213bu) r1
            java.lang.Object r5 = r3.f376300b
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.n r5 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138263n) r5
            java.lang.Object r9 = r3.f376299a
            p5462h.C69714l.m101134b(r2)
            r13 = r5
            goto L_0x01da
        L_0x0074:
            java.lang.Object r1 = r3.f376302d
            com.google.android.apps.search.googleapp.search.suggest.o r1 = (com.google.android.apps.search.googleapp.search.suggest.C138133o) r1
            java.lang.Object r5 = r3.f376301c
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bu r5 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138213bu) r5
            java.lang.Object r13 = r3.f376300b
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.n r13 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138263n) r13
            java.lang.Object r14 = r3.f376299a
            p5462h.C69714l.m101134b(r2)
            goto L_0x019a
        L_0x0087:
            java.lang.Object r1 = r3.f376302d
            com.google.android.apps.search.googleapp.search.suggest.o r1 = (com.google.android.apps.search.googleapp.search.suggest.C138133o) r1
            java.lang.Object r5 = r3.f376301c
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bu r5 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138213bu) r5
            java.lang.Object r13 = r3.f376300b
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.n r13 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138263n) r13
            java.lang.Object r14 = r3.f376299a
            p5462h.C69714l.m101134b(r2)
            goto L_0x0170
        L_0x009a:
            p5462h.C69714l.m101134b(r2)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bv r2 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138214bv.f376051f
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bu r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138213bu) r2
            com.google.android.libraries.f.a r5 = r0.f376314i
            long r13 = r5.mo26871c()
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bv r5 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138214bv) r5
            int r15 = r5.f376053a
            r15 = r15 | r12
            r5.f376053a = r15
            r5.f376054b = r13
            java.lang.String r5 = "oneSearchRequest"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r5)
            int r5 = r1.f376171a
            r5 = r5 & r11
            if (r5 == 0) goto L_0x00c6
            int r5 = r1.f376173c
            goto L_0x00cc
        L_0x00c6:
            java.lang.String r5 = r1.f376172b
            int r5 = r5.length()
        L_0x00cc:
            com.google.android.apps.search.googleapp.search.suggest.o r13 = com.google.android.apps.search.googleapp.search.suggest.C138133o.f375822o
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.n r13 = (com.google.android.apps.search.googleapp.search.suggest.C138132n) r13
            java.lang.String r14 = r1.f376172b
            r13.copyOnWrite()
            com.google.protobuf.bv r15 = r13.instance
            com.google.android.apps.search.googleapp.search.suggest.o r15 = (com.google.android.apps.search.googleapp.search.suggest.C138133o) r15
            r14.getClass()
            int r8 = r15.f375824a
            r8 = r8 | r12
            r15.f375824a = r8
            r15.f375825b = r14
            r13.copyOnWrite()
            com.google.protobuf.bv r8 = r13.instance
            com.google.android.apps.search.googleapp.search.suggest.o r8 = (com.google.android.apps.search.googleapp.search.suggest.C138133o) r8
            int r14 = r8.f375824a
            r14 = r14 | 8
            r8.f375824a = r14
            r8.f375828e = r5
            r13.copyOnWrite()
            com.google.protobuf.bv r5 = r13.instance
            com.google.android.apps.search.googleapp.search.suggest.o r5 = (com.google.android.apps.search.googleapp.search.suggest.C138133o) r5
            int r8 = r5.f375824a
            r8 = r8 | 2048(0x800, float:2.87E-42)
            r5.f375824a = r8
            r5.f375836m = r12
            int r5 = r1.f376176f
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.af r5 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138171af.m224536a(r5)
            if (r5 != 0) goto L_0x010f
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.af r5 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138171af.ENTRY_POINT_UNKNOWN
        L_0x010f:
            java.lang.String r8 = "oneSearchRequest.entryPoint"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r8)
            java.lang.String r8 = "oneSearchEntryPoint"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r8)
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x012f
            if (r5 == r12) goto L_0x012c
            if (r5 != r11) goto L_0x0126
            com.google.android.apps.search.googleapp.t.e.d r5 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.ONE_SEARCH_ALL_APPS
            goto L_0x0131
        L_0x0126:
            h.g r1 = new h.g
            r1.<init>()
            throw r1
        L_0x012c:
            com.google.android.apps.search.googleapp.t.e.d r5 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.ONE_SEARCH_QSB
            goto L_0x0131
        L_0x012f:
            com.google.android.apps.search.googleapp.t.e.d r5 = com.google.android.apps.search.googleapp.p10516t.p10521e.C139704d.UNKNOWN
        L_0x0131:
            r13.copyOnWrite()
            com.google.protobuf.bv r8 = r13.instance
            com.google.android.apps.search.googleapp.search.suggest.o r8 = (com.google.android.apps.search.googleapp.search.suggest.C138133o) r8
            int r5 = r5.f379715p
            r8.f375830g = r5
            int r5 = r8.f375824a
            r5 = r5 | 32
            r8.f375824a = r5
            com.google.protobuf.bv r5 = r13.build()
            java.lang.String r8 = "newBuilder()\n      .setQ…tryPoint))\n      .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r8)
            com.google.android.apps.search.googleapp.search.suggest.o r5 = (com.google.android.apps.search.googleapp.search.suggest.C138133o) r5
            boolean r8 = r1.f376174d
            if (r8 == 0) goto L_0x01a1
            com.google.android.apps.search.googleapp.search.suggest.sources.a.bt r8 = r0.f376308c
            com.google.common.util.concurrent.cx r8 = r8.mo114252e()
            java.lang.String r13 = "completeServerSuggestSource.reset()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r13)
            r3.f376299a = r0
            r3.f376300b = r1
            r3.f376301c = r2
            r3.f376302d = r5
            r3.f376305g = r12
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r3)
            if (r8 == r4) goto L_0x01a0
            r14 = r0
            r13 = r1
            r1 = r5
            r5 = r2
        L_0x0170:
            r2 = r14
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.v r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138312v) r2
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.n r2 = r2.f376309d
            r3.f376299a = r14
            r3.f376300b = r13
            r3.f376301c = r5
            r3.f376302d = r1
            r3.f376305g = r11
            com.google.android.libraries.storage.protostore.ab r2 = r2.f376113a
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.h r8 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138229h.f376096a
            com.google.common.util.concurrent.bg r15 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r2 = r2.mo46039a(r8, r15)
            java.lang.String r8 = "cache.updateData({ OneSe…ce() }, directExecutor())"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r8)
            java.lang.Object r2 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r3)
            h.c.a.a r8 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            if (r2 == r8) goto L_0x0198
            h.q r2 = p5462h.C69788q.f186170a
        L_0x0198:
            if (r2 == r4) goto L_0x01a0
        L_0x019a:
            r17 = r5
            r5 = r1
            r1 = r17
            goto L_0x01a4
        L_0x01a0:
            return r4
        L_0x01a1:
            r14 = r0
            r13 = r1
            r1 = r2
        L_0x01a4:
            com.google.common.f.e r2 = f376306b
            h.f r8 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138165m.f375923a
            java.util.logging.Level r8 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138154b.m224512a()
            com.google.common.f.c r2 = r2.mo56223a(r8)
            com.google.common.f.n r8 = new com.google.common.f.n
            r15 = 41141(0xa0b5, float:5.7651E-41)
            r8.<init>(r15)
            r2.mo56379ah(r8)
            java.lang.String r8 = "Fetching suggestions from CompleteServerSuggestSource"
            r2.mo56386p(r8)
            r2 = r14
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.v r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138312v) r2
            com.google.android.apps.search.googleapp.search.suggest.sources.a.bt r2 = r2.f376308c
            com.google.common.util.concurrent.cx r2 = r2.mo114250c(r5)
            r3.f376299a = r14
            r3.f376300b = r13
            r3.f376301c = r1
            r3.f376302d = r7
            r3.f376305g = r9
            java.lang.Object r2 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r3)
            if (r2 == r4) goto L_0x036b
            r9 = r14
        L_0x01da:
            com.google.android.apps.search.googleapp.search.suggest.v r2 = (com.google.android.apps.search.googleapp.search.suggest.C138678v) r2
            com.google.android.apps.search.googleapp.search.suggest.t r5 = r2.f377200d
            if (r5 != 0) goto L_0x01e2
            com.google.android.apps.search.googleapp.search.suggest.t r5 = com.google.android.apps.search.googleapp.search.suggest.C138542t.f376811i
        L_0x01e2:
            java.lang.String r8 = "it.responseParameters"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r8)
            long r14 = r5.f376818f
            r1.copyOnWrite()
            com.google.protobuf.bv r8 = r1.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bv r8 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138214bv) r8
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bv r16 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138214bv.f376051f
            int r7 = r8.f376053a
            r7 = r7 | r11
            r8.f376053a = r7
            r8.f376055c = r14
            long r7 = r5.f376819g
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bv r5 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138214bv) r5
            int r11 = r5.f376053a
            r11 = r11 | r10
            r5.f376053a = r11
            r5.f376056d = r7
            r5 = r9
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.v r5 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138312v) r5
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.a.m r7 = r5.f376313h
            com.google.android.apps.search.googleapp.search.suggest.b.y r7 = r7.f375924b
            com.google.android.apps.search.googleapp.search.suggest.b.l r7 = r7.f375646b
            r7.mo114100a()
            com.google.common.f.e r7 = f376306b
            java.util.logging.Level r8 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.p10458a.C138154b.m224512a()
            com.google.common.f.c r7 = r7.mo56223a(r8)
            com.google.common.f.n r8 = new com.google.common.f.n
            r11 = 41142(0xa0b6, float:5.7652E-41)
            r8.<init>(r11)
            r7.mo56379ah(r8)
            java.lang.String r8 = "Converting suggestions to OneSearch protos"
            r7.mo56386p(r8)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.r r7 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138317r.f376326j
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.o r7 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138264o) r7
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r6)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.j r8 = r5.f376310e
            java.lang.String r11 = "suggestResponse"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r11)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.s r2 = r8.mo114234a(r13, r2, r7)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.n r5 = r5.f376309d
            r3.f376299a = r9
            r3.f376300b = r13
            r3.f376301c = r1
            r3.f376302d = r7
            r3.f376305g = r10
            com.google.android.libraries.storage.protostore.ab r5 = r5.f376113a
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.g r8 = new com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.g
            r8.<init>(r13, r2)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r2 = r5.mo46039a(r8, r2)
            java.lang.String r5 = "getSuggestionsRequest: G… directExecutor()\n      )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)
            java.lang.Object r2 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r3)
            h.c.a.a r5 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            if (r2 == r5) goto L_0x026d
            h.q r2 = p5462h.C69788q.f186170a
        L_0x026d:
            if (r2 == r4) goto L_0x036b
            r5 = r1
            r1 = r7
        L_0x0271:
            java.lang.String r2 = r13.f376172b
            java.lang.String r7 = "request.query"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r7)
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x02fe
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.r r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138317r) r2
            com.google.protobuf.cq r2 = r2.f376331d
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            java.lang.String r7 = "oneSearchResponseBuilder.suggestionList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0296:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x02ad
            java.lang.Object r8 = r2.next()
            r11 = r8
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r11 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r11
            int r11 = r11.f376009a
            r11 = r11 & 32
            if (r11 == 0) goto L_0x0296
            r7.add(r8)
            goto L_0x0296
        L_0x02ad:
            java.util.Iterator r2 = r7.iterator()
        L_0x02b1:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x02fe
            java.lang.Object r7 = r2.next()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bb r7 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138194bb) r7
            r8 = r9
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.v r8 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138312v) r8
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.images.i r8 = r8.f376311f
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.j r11 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138259j.f376158d
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.i r11 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138258i) r11
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r6)
            java.lang.String r13 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r13)
            java.lang.String r7 = r7.f376015g
            java.lang.String r13 = "it.imageUrl"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r13)
            java.lang.String r13 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r13)
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.j r13 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138259j) r13
            r7.getClass()
            int r14 = r13.f376160a
            r14 = r14 | r12
            r13.f376160a = r14
            r13.f376161b = r7
            com.google.protobuf.bv r7 = r11.build()
            java.lang.String r11 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r11)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.j r7 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138259j) r7
            r8.mo114229b(r7)
            goto L_0x02b1
        L_0x02fe:
            r2 = r9
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.v r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138312v) r2
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.y r2 = r2.f376312g
            r3.f376299a = r9
            r3.f376300b = r5
            r3.f376301c = r1
            r6 = 0
            r3.f376302d = r6
            r6 = 5
            r3.f376305g = r6
            java.lang.Object r2 = r2.mo114240a(r3)
            if (r2 == r4) goto L_0x036b
            r4 = r5
            r3 = r9
        L_0x0317:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.ch r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138252ch) r2
            if (r2 == 0) goto L_0x032c
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.r r5 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138317r) r5
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.r r6 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138317r.f376326j
            r5.f376333f = r2
            int r2 = r5.f376328a
            r2 = r2 | 8
            r5.f376328a = r2
        L_0x032c:
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.v r3 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138312v) r3
            com.google.android.libraries.f.a r2 = r3.f376314i
            long r2 = r2.mo26871c()
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bv r5 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138214bv) r5
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bv r6 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138214bv.f376051f
            int r6 = r5.f376053a
            r6 = r6 | 8
            r5.f376053a = r6
            r5.f376057e = r2
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.r r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138317r) r2
            com.google.protobuf.bv r3 = r4.build()
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bv r3 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138214bv) r3
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.r r4 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138317r.f376326j
            r3.getClass()
            r2.f376332e = r3
            int r3 = r2.f376328a
            r3 = r3 | r10
            r2.f376328a = r3
            com.google.protobuf.bv r1 = r1.build()
            java.lang.String r2 = "oneSearchResponseBuilder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            r2 = r1
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.r r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138317r) r2
            return r1
        L_0x036b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.C138312v.mo114239a(com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.n, h.c.g):java.lang.Object");
    }
}
