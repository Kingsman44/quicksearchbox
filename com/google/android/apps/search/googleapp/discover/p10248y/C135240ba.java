package com.google.android.apps.search.googleapp.discover.p10248y;

import com.google.android.apps.search.googleapp.discover.p10249z.C135319az;
import java.util.UUID;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamdataservice.RenderableStreamDataSource$toRenderableStreamCacheResult$2", mo61344c = "RenderableStreamDataSource.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.googleapp.discover.y.ba */
/* compiled from: PG */
final class C135240ba extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C135319az f368394a;

    /* renamed from: b */
    final /* synthetic */ C135241bb f368395b;

    /* renamed from: c */
    final /* synthetic */ UUID f368396c;

    /* renamed from: d */
    private /* synthetic */ Object f368397d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135240ba(C135319az azVar, C135241bb bbVar, UUID uuid, C69577g gVar) {
        super(2, gVar);
        this.f368394a = azVar;
        this.f368395b = bbVar;
        this.f368396c = uuid;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135240ba) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: type inference failed for: r2v26, types: [com.google.android.apps.search.googleapp.discover.y.ad] */
    /* JADX WARNING: type inference failed for: r2v27, types: [com.google.android.apps.search.googleapp.discover.y.ad] */
    /* JADX WARNING: type inference failed for: r2v30, types: [com.google.android.apps.search.googleapp.discover.y.ab] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0171 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01cd  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            p5462h.C69714l.m101134b(r18)
            java.lang.Object r0 = r1.f368397d
            kotlinx.coroutines.aw r0 = (kotlinx.coroutines.C71422aw) r0
            com.google.common.f.e r2 = com.google.android.apps.search.googleapp.discover.p10248y.C135241bb.f368398a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.android.apps.search.googleapp.discover.z.az r3 = r1.f368394a
            com.google.android.apps.search.googleapp.discover.z.ab r3 = r3.f368672c
            com.google.android.apps.search.googleapp.discover.s.at r3 = r3.f368542a
            java.lang.String r3 = r3.name()
            com.google.common.f.n r4 = new com.google.common.f.n
            r5 = 40435(0x9df3, float:5.6662E-41)
            r4.<init>(r5)
            r2.mo56379ah(r4)
            java.lang.String r4 = "RenderableStreamDataSource#loadData - sessionStatus(%s)"
            r2.mo56389s(r4, r3)
            com.google.android.apps.search.googleapp.discover.y.bb r2 = r1.f368395b
            com.google.android.apps.search.googleapp.discover.y.d r3 = r2.f368407j
            com.google.android.apps.search.googleapp.discover.z.az r4 = r1.f368394a
            com.google.android.apps.search.googleapp.discover.y.be r2 = r2.f368409l
            java.util.UUID r5 = r1.f368396c
            java.lang.String r6 = "subtree"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r6)
            java.lang.String r6 = "loadDataId"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r6)
            com.google.android.apps.search.googleapp.discover.z.ab r6 = r4.f368672c
            com.google.android.apps.search.googleapp.discover.s.at r6 = r6.f368542a
            com.google.android.apps.search.googleapp.discover.s.at r7 = com.google.android.apps.search.googleapp.discover.p10214s.C134555at.EMPTY_SESSION
            if (r6 != r7) goto L_0x0071
            com.google.common.f.e r0 = com.google.android.apps.search.googleapp.discover.p10248y.C135253d.f368456a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r2 = new com.google.common.f.n
            r4 = 40428(0x9dec, float:5.6652E-41)
            r2.<init>(r4)
            r0.mo56379ah(r2)
            java.lang.String r2 = "CacheManager#shouldBeCacheMiss - cache miss, EMPTY_SESSION"
            r0.mo56386p(r2)
            com.google.android.apps.search.googleapp.discover.d.aq r0 = r3.f368460e
            com.google.android.apps.gsa.shared.logger.d.b r2 = com.google.android.apps.gsa.shared.logger.p7054d.C89885b.FEED_LAUNCH_CACHE_EMPTY_SESSION
            r0.mo111642c(r2)
            com.google.android.apps.search.googleapp.discover.d.l r0 = r3.f368461f
            com.google.android.apps.search.googleapp.discover.d.h r2 = com.google.android.apps.search.googleapp.discover.p10181d.C134219h.EMPTY_SESSION
            r0.mo111655a(r5, r2)
            goto L_0x01ca
        L_0x0071:
            com.google.common.v.i r6 = r3.f368459d
            j$.time.Instant r6 = r6.mo57444a()
            java.lang.String r7 = "timeSource.now()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            com.google.android.apps.search.googleapp.discover.z.ab r7 = r4.f368672c
            j$.time.Instant r7 = r7.f368544c
            j$.time.Duration r6 = p3186j$.time.Duration.between(r7, r6)
            com.google.android.apps.search.googleapp.discover.z.ab r7 = r4.f368672c
            com.google.android.apps.search.googleapp.discover.s.am r7 = r7.f368549h
            boolean r8 = r3.f368465j
            if (r8 == 0) goto L_0x00aa
            com.google.protobuf.ar r8 = r7.f366416c
            if (r8 != 0) goto L_0x0092
            com.google.protobuf.ar r8 = com.google.protobuf.C62910ar.f169858c
        L_0x0092:
            com.google.protobuf.ar r9 = com.google.android.apps.search.googleapp.discover.p10248y.C135253d.f368458c
            int r8 = com.google.protobuf.p4750c.C62948a.m95450a(r8, r9)
            if (r8 <= 0) goto L_0x00aa
            com.google.protobuf.ar r7 = r7.f366416c
            if (r7 != 0) goto L_0x00a0
            com.google.protobuf.ar r7 = com.google.protobuf.C62910ar.f169858c
        L_0x00a0:
            java.lang.String r8 = "contentLifetime.invalidAge"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            j$.time.Duration r7 = com.google.protobuf.p4750c.p4751a.C62949a.m95468c(r7)
            goto L_0x00b0
        L_0x00aa:
            com.google.protobuf.ar r7 = r3.f368464i
            j$.time.Duration r7 = com.google.protobuf.p4750c.p4751a.C62949a.m95468c(r7)
        L_0x00b0:
            int r6 = r6.compareTo((p3186j$.time.Duration) r7)
            java.util.List r7 = r4.f368670a
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x00e6
            if (r6 < 0) goto L_0x00e6
            com.google.common.f.e r0 = com.google.android.apps.search.googleapp.discover.p10248y.C135253d.f368456a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r2 = new com.google.common.f.n
            r4 = 40427(0x9deb, float:5.665E-41)
            r2.<init>(r4)
            r0.mo56379ah(r2)
            java.lang.String r2 = "CacheManager#shouldBeCacheMiss - cacheMiss, invalid data"
            r0.mo56386p(r2)
            com.google.android.apps.search.googleapp.discover.d.aq r0 = r3.f368460e
            com.google.android.apps.gsa.shared.logger.d.b r2 = com.google.android.apps.gsa.shared.logger.p7054d.C89885b.FEED_LAUNCH_CACHE_DATA_INVALIDATED
            r0.mo111642c(r2)
            com.google.android.apps.search.googleapp.discover.d.l r0 = r3.f368461f
            com.google.android.apps.search.googleapp.discover.d.h r2 = com.google.android.apps.search.googleapp.discover.p10181d.C134219h.INVALID
            r0.mo111655a(r5, r2)
            goto L_0x01ca
        L_0x00e6:
            com.google.common.v.i r6 = r3.f368459d
            j$.time.Instant r6 = r6.mo57444a()
            java.lang.String r7 = "timeSource.now()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            com.google.android.apps.search.googleapp.discover.z.ab r7 = r4.f368672c
            j$.time.Instant r7 = r7.f368544c
            j$.time.Duration r7 = p3186j$.time.Duration.between(r7, r6)
            com.google.android.apps.search.googleapp.discover.z.ab r8 = r4.f368672c
            j$.time.Instant r8 = r8.f368543b
            j$.time.Duration r6 = p3186j$.time.Duration.between(r8, r6)
            com.google.android.apps.search.googleapp.discover.z.ab r8 = r4.f368672c
            com.google.android.apps.search.googleapp.discover.s.am r8 = r8.f368549h
            boolean r9 = r3.f368465j
            if (r9 == 0) goto L_0x0127
            com.google.protobuf.ar r9 = r8.f366415b
            if (r9 != 0) goto L_0x010f
            com.google.protobuf.ar r9 = com.google.protobuf.C62910ar.f169858c
        L_0x010f:
            com.google.protobuf.ar r10 = com.google.android.apps.search.googleapp.discover.p10248y.C135253d.f368457b
            int r9 = com.google.protobuf.p4750c.C62948a.m95450a(r9, r10)
            if (r9 <= 0) goto L_0x0127
            com.google.protobuf.ar r8 = r8.f366415b
            if (r8 != 0) goto L_0x011d
            com.google.protobuf.ar r8 = com.google.protobuf.C62910ar.f169858c
        L_0x011d:
            java.lang.String r9 = "contentLifetime.staleAge"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)
            j$.time.Duration r8 = com.google.protobuf.p4750c.p4751a.C62949a.m95468c(r8)
            goto L_0x0129
        L_0x0127:
            j$.time.Duration r8 = r3.f368463h
        L_0x0129:
            int r7 = r7.compareTo((p3186j$.time.Duration) r8)
            r9 = 0
            r10 = 1
            if (r7 < 0) goto L_0x0133
            r7 = 1
            goto L_0x0134
        L_0x0133:
            r7 = 0
        L_0x0134:
            com.google.protobuf.ar r11 = r3.f368462g
            j$.time.Duration r11 = com.google.protobuf.p4750c.p4751a.C62949a.m95468c(r11)
            int r6 = r6.compareTo((p3186j$.time.Duration) r11)
            if (r6 < 0) goto L_0x0142
            r6 = 1
            goto L_0x0143
        L_0x0142:
            r6 = 0
        L_0x0143:
            com.google.android.apps.search.googleapp.discover.z.ab r11 = r4.f368672c
            j$.time.Instant r11 = r11.f368544c
            j$.time.Instant r2 = r2.mo112182d()
            j$.time.Duration r2 = p3186j$.time.Duration.between(r11, r2)
            int r2 = r2.compareTo((p3186j$.time.Duration) r8)
            if (r7 == 0) goto L_0x016f
            if (r6 != 0) goto L_0x016f
            com.google.common.f.e r8 = com.google.android.apps.search.googleapp.discover.p10248y.C135253d.f368456a
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r11 = new com.google.common.f.n
            r12 = 40429(0x9ded, float:5.6653E-41)
            r11.<init>(r12)
            r8.mo56379ah(r11)
            java.lang.String r11 = "Data is stale but it is too early to perform a refresh"
            r8.mo56386p(r11)
        L_0x016f:
            if (r7 == 0) goto L_0x019c
            if (r6 == 0) goto L_0x019c
            if (r2 <= 0) goto L_0x019c
            com.google.common.f.e r0 = com.google.android.apps.search.googleapp.discover.p10248y.C135253d.f368456a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r2 = new com.google.common.f.n
            r4 = 40426(0x9dea, float:5.6649E-41)
            r2.<init>(r4)
            r0.mo56379ah(r2)
            java.lang.String r2 = "CacheManager#shouldBeCacheMiss - cacheMiss, staleness"
            r0.mo56386p(r2)
            com.google.android.apps.search.googleapp.discover.d.aq r0 = r3.f368460e
            com.google.android.apps.gsa.shared.logger.d.b r2 = com.google.android.apps.gsa.shared.logger.p7054d.C89885b.FEED_LAUNCH_CACHE_DATA_STALE
            r0.mo111642c(r2)
            com.google.android.apps.search.googleapp.discover.d.l r0 = r3.f368461f
            com.google.android.apps.search.googleapp.discover.d.h r2 = com.google.android.apps.search.googleapp.discover.p10181d.C134219h.STALE
            r0.mo111655a(r5, r2)
            goto L_0x01ca
        L_0x019c:
            com.google.android.apps.search.googleapp.discover.z.ab r2 = r4.f368672c
            com.google.android.apps.search.googleapp.discover.s.at r2 = r2.f368542a
            com.google.android.apps.search.googleapp.discover.s.at r4 = com.google.android.apps.search.googleapp.discover.p10214s.C134555at.UNKNOWN
            if (r2 != r4) goto L_0x01cd
            com.google.common.f.e r0 = com.google.android.apps.search.googleapp.discover.p10248y.C135253d.f368456a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r2 = new com.google.common.f.n
            r4 = 40425(0x9de9, float:5.6647E-41)
            r2.<init>(r4)
            r0.mo56379ah(r2)
            java.lang.String r2 = "CacheManager#shouldBeCacheMiss - cacheMiss, UNKNOWN"
            r0.mo56386p(r2)
            com.google.android.apps.search.googleapp.discover.d.aq r0 = r3.f368460e
            com.google.android.apps.gsa.shared.logger.d.b r2 = com.google.android.apps.gsa.shared.logger.p7054d.C89885b.FEED_LAUNCH_CACHE_STORAGE_FAILURE
            r0.mo111642c(r2)
            com.google.android.apps.search.googleapp.discover.d.l r0 = r3.f368461f
            com.google.android.apps.search.googleapp.discover.d.h r2 = com.google.android.apps.search.googleapp.discover.p10181d.C134219h.UNKNOWN
            r0.mo111655a(r5, r2)
        L_0x01ca:
            com.google.apps.tiktok.dataservice.af r0 = com.google.apps.tiktok.dataservice.C46688af.f121976a
            return r0
        L_0x01cd:
            com.google.android.apps.search.googleapp.discover.y.bb r2 = r1.f368395b
            com.google.android.apps.search.googleapp.discover.z.az r3 = r1.f368394a
            java.util.Map r3 = r3.f368671b
            java.util.Collection r3 = r3.values()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x01e0:
            boolean r5 = r3.hasNext()
            r6 = 19
            if (r5 == 0) goto L_0x01f7
            java.lang.Object r5 = r3.next()
            r7 = r5
            com.google.android.apps.search.googleapp.discover.s.ay r7 = (com.google.android.apps.search.googleapp.discover.p10214s.C134560ay) r7
            int r7 = r7.f366456b
            if (r7 != r6) goto L_0x01e0
            r4.add(r5)
            goto L_0x01e0
        L_0x01f7:
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r5 = p5462h.p5463a.C69540x.m100804k(r4, r5)
            r3.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x0206:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0221
            java.lang.Object r5 = r4.next()
            com.google.android.apps.search.googleapp.discover.s.ay r5 = (com.google.android.apps.search.googleapp.discover.p10214s.C134560ay) r5
            int r7 = r5.f366456b
            if (r7 != r6) goto L_0x021b
            java.lang.Object r5 = r5.f366457c
            com.google.android.apps.search.googleapp.discover.s.ao r5 = (com.google.android.apps.search.googleapp.discover.p10214s.C134550ao) r5
            goto L_0x021d
        L_0x021b:
            com.google.android.apps.search.googleapp.discover.s.ao r5 = com.google.android.apps.search.googleapp.discover.p10214s.C134550ao.f366417b
        L_0x021d:
            r3.add(r5)
            goto L_0x0206
        L_0x0221:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x022a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0241
            java.lang.Object r5 = r3.next()
            com.google.android.apps.search.googleapp.discover.s.ao r5 = (com.google.android.apps.search.googleapp.discover.p10214s.C134550ao) r5
            com.google.protobuf.cq r5 = r5.f366419a
            java.lang.String r6 = "it.resourcesList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            p5462h.p5463a.C69540x.m100811r(r4, r5)
            goto L_0x022a
        L_0x0241:
            java.util.Set r3 = p5462h.p5463a.C69540x.m100846ab(r4)
            com.google.android.apps.search.googleapp.discover.j.b.a r2 = r2.f368403f
            r2.mo111779a(r3)
            com.google.android.apps.search.googleapp.discover.y.az r2 = new com.google.android.apps.search.googleapp.discover.y.az
            com.google.android.apps.search.googleapp.discover.y.bb r3 = r1.f368395b
            com.google.android.apps.search.googleapp.discover.z.az r4 = r1.f368394a
            r5 = 0
            r2.<init>(r3, r4, r5)
            r3 = 3
            kotlinx.coroutines.C71803m.m105043d(r0, r5, r5, r2, r3)
            com.google.android.apps.search.googleapp.discover.y.bb r0 = r1.f368395b
            com.google.android.apps.search.googleapp.discover.z.az r2 = r1.f368394a
            java.lang.String r4 = "RSDS.createRenderableStream"
            com.google.apps.tiktok.tracing.bi r4 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r4)
            com.google.android.apps.search.googleapp.discover.y.ai r0 = r0.f368412o     // Catch:{ all -> 0x03bb }
            java.lang.String r6 = "subtree"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r6)     // Catch:{ all -> 0x03bb }
            com.google.android.apps.search.googleapp.discover.z.ab r6 = r2.f368672c     // Catch:{ all -> 0x03bb }
            com.google.android.apps.search.googleapp.discover.s.at r6 = r6.f368542a     // Catch:{ all -> 0x03bb }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x03bb }
            if (r6 == 0) goto L_0x0398
            if (r6 == r10) goto L_0x0301
            r7 = 2
            if (r6 == r7) goto L_0x0283
            if (r6 == r3) goto L_0x0283
            r0 = 4
            if (r6 == r0) goto L_0x0398
            h.g r0 = new h.g     // Catch:{ all -> 0x03bb }
            r0.<init>()     // Catch:{ all -> 0x03bb }
            throw r0     // Catch:{ all -> 0x03bb }
        L_0x0283:
            j$.time.Instant r3 = r0.f368333e     // Catch:{ all -> 0x03bb }
            com.google.android.apps.search.googleapp.discover.z.ab r6 = r2.f368672c     // Catch:{ all -> 0x03bb }
            j$.time.Instant r6 = r6.f368543b     // Catch:{ all -> 0x03bb }
            int r3 = r3.compareTo((p3186j$.time.Instant) r6)     // Catch:{ all -> 0x03bb }
            if (r3 > 0) goto L_0x02f8
            com.google.android.apps.search.googleapp.discover.z.ab r3 = r2.f368672c     // Catch:{ all -> 0x03bb }
            com.google.android.apps.search.googleapp.discover.s.at r3 = r3.f368542a     // Catch:{ all -> 0x03bb }
            com.google.android.apps.search.googleapp.discover.s.at r6 = com.google.android.apps.search.googleapp.discover.p10214s.C134555at.REQUEST_ERROR     // Catch:{ all -> 0x03bb }
            if (r3 != r6) goto L_0x029a
            com.google.android.apps.search.googleapp.discover.y.u r3 = com.google.android.apps.search.googleapp.discover.p10248y.C135270u.REQUEST_FAILED     // Catch:{ all -> 0x03bb }
            goto L_0x029c
        L_0x029a:
            com.google.android.apps.search.googleapp.discover.y.u r3 = com.google.android.apps.search.googleapp.discover.p10248y.C135270u.REQUEST_FAILED_NO_INTERNET     // Catch:{ all -> 0x03bb }
        L_0x029c:
            com.google.android.apps.search.googleapp.discover.y.h r15 = new com.google.android.apps.search.googleapp.discover.y.h     // Catch:{ all -> 0x03bb }
            com.google.android.apps.search.googleapp.discover.y.o r6 = new com.google.android.apps.search.googleapp.discover.y.o     // Catch:{ all -> 0x03bb }
            com.google.android.apps.search.googleapp.discover.z.ab r7 = r2.f368672c     // Catch:{ all -> 0x03bb }
            j$.time.Instant r7 = r7.f368544c     // Catch:{ all -> 0x03bb }
            r6.<init>(r7)     // Catch:{ all -> 0x03bb }
            r15.<init>(r3, r6)     // Catch:{ all -> 0x03bb }
            com.google.android.apps.search.googleapp.discover.y.u r3 = r15.f368480a     // Catch:{ all -> 0x03bb }
            com.google.android.apps.search.googleapp.discover.y.ah r0 = r0.mo112179b(r2, r3)     // Catch:{ all -> 0x03bb }
            boolean r2 = r0 instanceof com.google.android.apps.search.googleapp.discover.p10248y.C135219ag     // Catch:{ all -> 0x03bb }
            if (r2 == 0) goto L_0x02e9
            com.google.android.apps.search.googleapp.discover.y.ag r0 = (com.google.android.apps.search.googleapp.discover.p10248y.C135219ag) r0     // Catch:{ all -> 0x03bb }
            com.google.android.apps.search.googleapp.discover.y.ac r0 = r0.f368327a     // Catch:{ all -> 0x03bb }
            com.google.android.apps.search.googleapp.discover.y.y r7 = r0.f368313a     // Catch:{ all -> 0x03bb }
            j$.time.Instant r8 = r0.f368314b     // Catch:{ all -> 0x03bb }
            com.google.common.o.l.r r9 = r0.f368315c     // Catch:{ all -> 0x03bb }
            com.google.android.apps.search.googleapp.discover.y.s r10 = r0.f368316d     // Catch:{ all -> 0x03bb }
            java.util.List r11 = r0.f368317e     // Catch:{ all -> 0x03bb }
            com.google.android.apps.search.googleapp.discover.y.w r12 = r0.f368318f     // Catch:{ all -> 0x03bb }
            java.util.List r13 = r0.f368319g     // Catch:{ all -> 0x03bb }
            com.google.android.apps.search.googleapp.discover.streamui.i.i r14 = r0.f368320h     // Catch:{ all -> 0x03bb }
            com.google.bv.e.b r0 = r0.f368321i     // Catch:{ all -> 0x03bb }
            java.lang.String r2 = "sessionCreateTime"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r2)     // Catch:{ all -> 0x03bb }
            java.lang.String r2 = "rootResponseEventId"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r2)     // Catch:{ all -> 0x03bb }
            java.lang.String r2 = "elementsRenderData"
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r2)     // Catch:{ all -> 0x03bb }
            java.lang.String r2 = "feedId"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r2)     // Catch:{ all -> 0x03bb }
            com.google.android.apps.search.googleapp.discover.y.ac r2 = new com.google.android.apps.search.googleapp.discover.y.ac     // Catch:{ all -> 0x03bb }
            r6 = r2
            r3 = r15
            r15 = r0
            r16 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x03bb }
            goto L_0x0309
        L_0x02e9:
            boolean r2 = r0 instanceof com.google.android.apps.search.googleapp.discover.p10248y.C135218af     // Catch:{ all -> 0x03bb }
            if (r2 == 0) goto L_0x02f2
            com.google.android.apps.search.googleapp.discover.y.af r0 = (com.google.android.apps.search.googleapp.discover.p10248y.C135218af) r0     // Catch:{ all -> 0x03bb }
            com.google.android.apps.search.googleapp.discover.y.ab r2 = r0.f368326a     // Catch:{ all -> 0x03bb }
            goto L_0x0309
        L_0x02f2:
            h.g r0 = new h.g     // Catch:{ all -> 0x03bb }
            r0.<init>()     // Catch:{ all -> 0x03bb }
            throw r0     // Catch:{ all -> 0x03bb }
        L_0x02f8:
            com.google.android.apps.search.googleapp.discover.y.u r3 = com.google.android.apps.search.googleapp.discover.p10248y.C135270u.NO_CARDS_FOUND_PREVIOUS_REQUEST_FAILURE     // Catch:{ all -> 0x03bb }
            com.google.android.apps.search.googleapp.discover.y.ah r0 = r0.mo112179b(r2, r3)     // Catch:{ all -> 0x03bb }
            com.google.android.apps.search.googleapp.discover.y.ad r2 = r0.f368328b     // Catch:{ all -> 0x03bb }
            goto L_0x0309
        L_0x0301:
            com.google.android.apps.search.googleapp.discover.y.u r3 = com.google.android.apps.search.googleapp.discover.p10248y.C135270u.NO_CARDS_FOUND_OTHER     // Catch:{ all -> 0x03bb }
            com.google.android.apps.search.googleapp.discover.y.ah r0 = r0.mo112179b(r2, r3)     // Catch:{ all -> 0x03bb }
            com.google.android.apps.search.googleapp.discover.y.ad r2 = r0.f368328b     // Catch:{ all -> 0x03bb }
        L_0x0309:
            p5462h.p5472e.C69598b.m101013a(r4, r5)
            boolean r0 = r2 instanceof com.google.android.apps.search.googleapp.discover.p10248y.C135214ab
            if (r0 == 0) goto L_0x0316
            r0 = r2
            com.google.android.apps.search.googleapp.discover.y.ab r0 = (com.google.android.apps.search.googleapp.discover.p10248y.C135214ab) r0
            com.google.android.apps.search.googleapp.discover.y.u r5 = r0.f368310a
            goto L_0x031f
        L_0x0316:
            boolean r0 = r2 instanceof com.google.android.apps.search.googleapp.discover.p10248y.C135215ac
            if (r0 == 0) goto L_0x031f
            r0 = r2
            com.google.android.apps.search.googleapp.discover.y.ac r0 = (com.google.android.apps.search.googleapp.discover.p10248y.C135215ac) r0
            com.google.android.apps.search.googleapp.discover.y.u r5 = r0.f368322j
        L_0x031f:
            com.google.android.apps.search.googleapp.discover.y.u r0 = com.google.android.apps.search.googleapp.discover.p10248y.C135270u.NO_CARDS_FOUND_PREVIOUS_REQUEST_FAILURE
            if (r5 == r0) goto L_0x0369
            com.google.common.f.e r0 = com.google.android.apps.search.googleapp.discover.p10248y.C135241bb.f368398a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 40436(0x9df4, float:5.6663E-41)
            r3.<init>(r4)
            r0.mo56379ah(r3)
            java.lang.String r3 = "RenderableStreamDataSource#loadData - cacheHit"
            r0.mo56386p(r3)
            com.google.android.apps.search.googleapp.discover.y.bb r0 = r1.f368395b
            com.google.android.apps.search.googleapp.discover.d.aq r0 = r0.f368401d
            java.lang.Object r3 = r0.f365586d
            monitor-enter(r3)
            com.google.android.apps.search.googleapp.discover.d.ak r0 = r0.f365587e     // Catch:{ all -> 0x0366 }
            if (r0 != 0) goto L_0x0348
            monitor-exit(r3)     // Catch:{ all -> 0x0366 }
            goto L_0x034c
        L_0x0348:
            r0.mo111632k()     // Catch:{ all -> 0x0366 }
            monitor-exit(r3)     // Catch:{ all -> 0x0366 }
        L_0x034c:
            com.google.android.apps.search.googleapp.discover.y.bb r0 = r1.f368395b
            com.google.android.apps.search.googleapp.discover.d.l r0 = r0.f368402e
            java.util.UUID r3 = r1.f368396c
            com.google.android.apps.search.googleapp.discover.d.h r4 = com.google.android.apps.search.googleapp.discover.p10181d.C134219h.CACHE_READ_OK
            r0.mo111655a(r3, r4)
            com.google.android.apps.search.googleapp.discover.z.az r0 = r1.f368394a
            com.google.android.apps.search.googleapp.discover.z.ab r0 = r0.f368672c
            j$.time.Instant r0 = r0.f368544c
            long r3 = r0.toEpochMilli()
            com.google.apps.tiktok.dataservice.af r0 = com.google.apps.tiktok.dataservice.C46688af.m83205b(r2, r3)
            return r0
        L_0x0366:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0366 }
            throw r0
        L_0x0369:
            com.google.common.f.e r0 = com.google.android.apps.search.googleapp.discover.p10248y.C135241bb.f368398a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 40437(0x9df5, float:5.6664E-41)
            r2.<init>(r3)
            r0.mo56379ah(r2)
            java.lang.String r2 = "RenderableStreamDataSource#loadData - cacheMiss, NO_CARDS_FOUND_PREVIOUS_REQUEST_FAILURE"
            r0.mo56386p(r2)
            com.google.android.apps.search.googleapp.discover.y.bb r0 = r1.f368395b
            com.google.android.apps.search.googleapp.discover.d.aq r0 = r0.f368401d
            com.google.android.apps.gsa.shared.logger.d.b r2 = com.google.android.apps.gsa.shared.logger.p7054d.C89885b.FEED_LAUNCH_CACHE_EMPTY_SESSION
            r0.mo111642c(r2)
            com.google.android.apps.search.googleapp.discover.y.bb r0 = r1.f368395b
            com.google.android.apps.search.googleapp.discover.d.l r0 = r0.f368402e
            java.util.UUID r2 = r1.f368396c
            com.google.android.apps.search.googleapp.discover.d.h r3 = com.google.android.apps.search.googleapp.discover.p10181d.C134219h.NO_CARDS_FOUND_PREVIOUS_REQUEST_FAILURE
            r0.mo111655a(r2, r3)
            com.google.apps.tiktok.dataservice.af r0 = com.google.apps.tiktok.dataservice.C46688af.f121976a
            return r0
        L_0x0398:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x03bb }
            java.lang.String r3 = "Can't render a stream with status: %s."
            java.lang.Object[] r5 = new java.lang.Object[r10]     // Catch:{ all -> 0x03bb }
            com.google.android.apps.search.googleapp.discover.z.ab r2 = r2.f368672c     // Catch:{ all -> 0x03bb }
            com.google.android.apps.search.googleapp.discover.s.at r2 = r2.f368542a     // Catch:{ all -> 0x03bb }
            int r2 = r2.f366434f     // Catch:{ all -> 0x03bb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x03bb }
            r5[r9] = r2     // Catch:{ all -> 0x03bb }
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r10)     // Catch:{ all -> 0x03bb }
            java.lang.String r2 = java.lang.String.format(r3, r2)     // Catch:{ all -> 0x03bb }
            java.lang.String r3 = "format(format, *args)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)     // Catch:{ all -> 0x03bb }
            r0.<init>(r2)     // Catch:{ all -> 0x03bb }
            throw r0     // Catch:{ all -> 0x03bb }
        L_0x03bb:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x03be }
        L_0x03be:
            r0 = move-exception
            r3 = r0
            p5462h.p5472e.C69598b.m101013a(r4, r2)
            goto L_0x03c5
        L_0x03c4:
            throw r3
        L_0x03c5:
            goto L_0x03c4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10248y.C135240ba.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C135240ba baVar = new C135240ba(this.f368394a, this.f368395b, this.f368396c, gVar);
        baVar.f368397d = obj;
        return baVar;
    }
}
