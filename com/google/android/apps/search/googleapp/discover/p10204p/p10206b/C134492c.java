package com.google.android.apps.search.googleapp.discover.p10204p.p10206b;

import com.google.android.apps.search.googleapp.discover.p10204p.p10206b.p10207a.C134488b;
import com.google.android.apps.search.googleapp.discover.p10204p.p10206b.p10208b.C134491b;
import com.google.android.libraries.play.p2442a.C31944a;
import com.google.common.p4526f.C59071e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.p.b.c */
/* compiled from: PG */
public final class C134492c implements C134486a {

    /* renamed from: a */
    private static final C59071e f366272a = C59071e.m91331h();

    /* renamed from: b */
    private final C31944a f366273b;

    /* renamed from: c */
    private final C134491b f366274c;

    /* renamed from: d */
    private final C134488b f366275d;

    public C134492c(C31944a aVar, C134491b bVar, C134488b bVar2) {
        C69664n.m101061g(aVar, "appContentService");
        this.f366273b = aVar;
        this.f366274c = bVar;
        this.f366275d = bVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:144:0x05d1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073 A[Catch:{ Exception -> 0x05d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1 A[SYNTHETIC, Splitter:B:31:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111801a(p5462h.p5466c.C69577g r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            java.lang.String r2 = "Year must be specified."
            java.lang.String r3 = "response"
            java.lang.String r4 = "builder"
            java.lang.String r5 = "newBuilder()"
            java.lang.String r6 = "value"
            boolean r7 = r0 instanceof com.google.android.apps.search.googleapp.discover.p10204p.p10206b.C134489b
            if (r7 == 0) goto L_0x0021
            r7 = r0
            com.google.android.apps.search.googleapp.discover.p.b.b r7 = (com.google.android.apps.search.googleapp.discover.p10204p.p10206b.C134489b) r7
            int r8 = r7.f366258d
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r8 & r9
            if (r10 == 0) goto L_0x0021
            int r8 = r8 - r9
            r7.f366258d = r8
            goto L_0x0026
        L_0x0021:
            com.google.android.apps.search.googleapp.discover.p.b.b r7 = new com.google.android.apps.search.googleapp.discover.p.b.b
            r7.<init>(r1, r0)
        L_0x0026:
            java.lang.Object r0 = r7.f366256b
            h.c.a.a r8 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r9 = r7.f366258d
            r10 = 2
            r11 = 1
            if (r9 == 0) goto L_0x0048
            if (r9 == r11) goto L_0x0042
            if (r9 != r10) goto L_0x003a
            java.lang.Object r7 = r7.f366255a
            p5462h.C69714l.m101134b(r0)     // Catch:{ Exception -> 0x05d2 }
            goto L_0x0074
        L_0x003a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0042:
            java.lang.Object r9 = r7.f366255a
            p5462h.C69714l.m101134b(r0)     // Catch:{ Exception -> 0x05d2 }
            goto L_0x0059
        L_0x0048:
            p5462h.C69714l.m101134b(r0)
            com.google.android.apps.search.googleapp.discover.p.b.b.b r0 = r1.f366274c     // Catch:{ Exception -> 0x05d2 }
            r7.f366255a = r1     // Catch:{ Exception -> 0x05d2 }
            r7.f366258d = r11     // Catch:{ Exception -> 0x05d2 }
            java.lang.Object r0 = r0.mo111800a(r7)     // Catch:{ Exception -> 0x05d2 }
            if (r0 != r8) goto L_0x0058
            return r8
        L_0x0058:
            r9 = r1
        L_0x0059:
            com.google.bl.a.i r0 = (com.google.p4222bl.p4223a.C56095i) r0     // Catch:{ Exception -> 0x05d2 }
            r12 = r9
            com.google.android.apps.search.googleapp.discover.p.b.c r12 = (com.google.android.apps.search.googleapp.discover.p10204p.p10206b.C134492c) r12     // Catch:{ Exception -> 0x05d2 }
            com.google.android.libraries.play.a.a r12 = r12.f366273b     // Catch:{ Exception -> 0x05d2 }
            com.google.common.util.concurrent.cx r0 = r12.mo37719a(r0)     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r12 = "appContentService.getCarouselGroups(request)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r12)     // Catch:{ Exception -> 0x05d2 }
            r7.f366255a = r9     // Catch:{ Exception -> 0x05d2 }
            r7.f366258d = r10     // Catch:{ Exception -> 0x05d2 }
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r0, r7)     // Catch:{ Exception -> 0x05d2 }
            if (r0 == r8) goto L_0x05d1
            r7 = r9
        L_0x0074:
            com.google.bl.a.l r0 = (com.google.p4222bl.p4223a.C56098l) r0     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.b.c r7 = (com.google.android.apps.search.googleapp.discover.p10204p.p10206b.C134492c) r7     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.b.a.b r7 = r7.f366275d     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r3)     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r3)     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.f r3 = com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134500f.f366284b     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.e r3 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134499e) r3     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r5)     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r4)     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.cq r0 = r0.f149447a     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r8 = "response.carouselResponseList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r8)     // Catch:{ Exception -> 0x05d2 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x05d2 }
        L_0x0099:
            boolean r8 = r0.hasNext()     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r9 = "_builder.build()"
            if (r8 == 0) goto L_0x05c7
            java.lang.Object r8 = r0.next()     // Catch:{ Exception -> 0x05d2 }
            com.google.bl.a.g r8 = (com.google.p4222bl.p4223a.C56093g) r8     // Catch:{ Exception -> 0x05d2 }
            int r12 = r8.f149438a     // Catch:{ Exception -> 0x05d2 }
            if (r12 != r11) goto L_0x05c3
            java.lang.Object r8 = r8.f149439b     // Catch:{ Exception -> 0x05d2 }
            com.google.bl.a.a.f r8 = (com.google.p4222bl.p4223a.p4224a.C56067f) r8     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.cq r8 = r8.f149391a     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r12 = "carouselGroupResponse.carouselGroup.carouselList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r12)     // Catch:{ Exception -> 0x05d2 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x05d2 }
        L_0x00ba:
            boolean r12 = r8.hasNext()     // Catch:{ Exception -> 0x05d2 }
            if (r12 == 0) goto L_0x05c3
            java.lang.Object r12 = r8.next()     // Catch:{ Exception -> 0x05d2 }
            com.google.bl.a.a.d r12 = (com.google.p4222bl.p4223a.p4224a.C56065d) r12     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.a.b r13 = new com.google.protobuf.a.b     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r14 = r3.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.f r14 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134500f) r14     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.cq r14 = r14.f366286a     // Catch:{ Exception -> 0x05d2 }
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r15 = "_builder.getWatchCollectionList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r15)     // Catch:{ Exception -> 0x05d2 }
            r13.<init>(r14)     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.n r13 = com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134508n.f366301f     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bn r13 = r13.createBuilder()     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.m r13 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134507m) r13     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r5)     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r4)     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r14 = r12.f149385a     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r15 = "carousel.id"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r15)     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r6)     // Catch:{ Exception -> 0x05d2 }
            r13.copyOnWrite()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r15 = r13.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.n r15 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134508n) r15     // Catch:{ Exception -> 0x05d2 }
            r14.getClass()     // Catch:{ Exception -> 0x05d2 }
            int r10 = r15.f366303a     // Catch:{ Exception -> 0x05d2 }
            r10 = r10 | r11
            r15.f366303a = r10     // Catch:{ Exception -> 0x05d2 }
            r15.f366305c = r14     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r10 = r12.f149386b     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r14 = "carousel.title"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r14)     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r6)     // Catch:{ Exception -> 0x05d2 }
            r13.copyOnWrite()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r14 = r13.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.n r14 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134508n) r14     // Catch:{ Exception -> 0x05d2 }
            r10.getClass()     // Catch:{ Exception -> 0x05d2 }
            int r15 = r14.f366303a     // Catch:{ Exception -> 0x05d2 }
            r16 = 2
            r15 = r15 | 2
            r14.f366303a = r15     // Catch:{ Exception -> 0x05d2 }
            r14.f366306d = r10     // Catch:{ Exception -> 0x05d2 }
            com.google.bl.a.a.p r10 = r12.f149388d     // Catch:{ Exception -> 0x05d2 }
            if (r10 != 0) goto L_0x0127
            com.google.bl.a.a.p r10 = com.google.p4222bl.p4223a.p4224a.C56077p.f149413c     // Catch:{ Exception -> 0x05d2 }
        L_0x0127:
            com.google.bl.a.a.af r10 = r10.f149416b     // Catch:{ Exception -> 0x05d2 }
            if (r10 != 0) goto L_0x012d
            com.google.bl.a.a.af r10 = com.google.p4222bl.p4223a.p4224a.C56062af.f149372e     // Catch:{ Exception -> 0x05d2 }
        L_0x012d:
            java.lang.String r14 = "carousel.providerInfo.icon"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r14)     // Catch:{ Exception -> 0x05d2 }
            android.content.Context r14 = r7.f366254a     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.h r10 = com.google.android.apps.search.googleapp.discover.p10204p.p10206b.p10207a.C134487a.m218246a(r10, r14)     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r6)     // Catch:{ Exception -> 0x05d2 }
            r13.copyOnWrite()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r14 = r13.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.n r14 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134508n) r14     // Catch:{ Exception -> 0x05d2 }
            r10.getClass()     // Catch:{ Exception -> 0x05d2 }
            r14.f366307e = r10     // Catch:{ Exception -> 0x05d2 }
            int r10 = r14.f366303a     // Catch:{ Exception -> 0x05d2 }
            r10 = r10 | 4
            r14.f366303a = r10     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.cq r10 = r12.f149387c     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r12 = "carousel.entityList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r12)     // Catch:{ Exception -> 0x05d2 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x05d2 }
        L_0x0158:
            boolean r12 = r10.hasNext()     // Catch:{ Exception -> 0x05d2 }
            if (r12 == 0) goto L_0x058a
            java.lang.Object r12 = r10.next()     // Catch:{ Exception -> 0x05d2 }
            com.google.bl.a.a.h r12 = (com.google.p4222bl.p4223a.p4224a.C56069h) r12     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.a.b r14 = new com.google.protobuf.a.b     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r15 = r13.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.n r15 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134508n) r15     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.cq r15 = r15.f366304b     // Catch:{ Exception -> 0x05d2 }
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r11 = "_builder.getWatchItemList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r11)     // Catch:{ Exception -> 0x05d2 }
            r14.<init>(r15)     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.p r11 = com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134510p.f366308k     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bn r11 = r11.createBuilder()     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.o r11 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134509o) r11     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r5)     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r4)     // Catch:{ Exception -> 0x05d2 }
            com.google.bl.a.a.p r14 = r12.f149397d     // Catch:{ Exception -> 0x05d2 }
            if (r14 != 0) goto L_0x018c
            com.google.bl.a.a.p r14 = com.google.p4222bl.p4223a.p4224a.C56077p.f149413c     // Catch:{ Exception -> 0x05d2 }
        L_0x018c:
            java.lang.String r14 = r14.f149415a     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r15 = "entity.providerInfo.name"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r15)     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r6)     // Catch:{ Exception -> 0x05d2 }
            r11.copyOnWrite()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r15 = r11.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.p r15 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134510p) r15     // Catch:{ Exception -> 0x05d2 }
            r14.getClass()     // Catch:{ Exception -> 0x05d2 }
            r17 = r0
            int r0 = r15.f366310a     // Catch:{ Exception -> 0x05d2 }
            r16 = 1
            r0 = r0 | 1
            r15.f366310a = r0     // Catch:{ Exception -> 0x05d2 }
            r15.f366313d = r14     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r0 = r12.f149396c     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r14 = "entity.title"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r14)     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r6)     // Catch:{ Exception -> 0x05d2 }
            r11.copyOnWrite()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r14 = r11.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.p r14 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134510p) r14     // Catch:{ Exception -> 0x05d2 }
            r0.getClass()     // Catch:{ Exception -> 0x05d2 }
            int r15 = r14.f366310a     // Catch:{ Exception -> 0x05d2 }
            r1 = 8
            r15 = r15 | r1
            r14.f366310a = r15     // Catch:{ Exception -> 0x05d2 }
            r14.f366316g = r0     // Catch:{ Exception -> 0x05d2 }
            com.google.bl.a.a.p r0 = r12.f149397d     // Catch:{ Exception -> 0x05d2 }
            if (r0 != 0) goto L_0x01cf
            com.google.bl.a.a.p r0 = com.google.p4222bl.p4223a.p4224a.C56077p.f149413c     // Catch:{ Exception -> 0x05d2 }
        L_0x01cf:
            com.google.bl.a.a.af r0 = r0.f149416b     // Catch:{ Exception -> 0x05d2 }
            if (r0 != 0) goto L_0x01d5
            com.google.bl.a.a.af r0 = com.google.p4222bl.p4223a.p4224a.C56062af.f149372e     // Catch:{ Exception -> 0x05d2 }
        L_0x01d5:
            java.lang.String r14 = "entity.providerInfo.icon"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r14)     // Catch:{ Exception -> 0x05d2 }
            android.content.Context r14 = r7.f366254a     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.h r0 = com.google.android.apps.search.googleapp.discover.p10204p.p10206b.p10207a.C134487a.m218246a(r0, r14)     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r6)     // Catch:{ Exception -> 0x05d2 }
            r11.copyOnWrite()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r14 = r11.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.p r14 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134510p) r14     // Catch:{ Exception -> 0x05d2 }
            r0.getClass()     // Catch:{ Exception -> 0x05d2 }
            r14.f366315f = r0     // Catch:{ Exception -> 0x05d2 }
            int r0 = r14.f366310a     // Catch:{ Exception -> 0x05d2 }
            r0 = r0 | 4
            r14.f366310a = r0     // Catch:{ Exception -> 0x05d2 }
            com.google.bl.a.a.b r0 = r12.f149398e     // Catch:{ Exception -> 0x05d2 }
            if (r0 != 0) goto L_0x01fb
            com.google.bl.a.a.b r0 = com.google.p4222bl.p4223a.p4224a.C56063b.f149379c     // Catch:{ Exception -> 0x05d2 }
        L_0x01fb:
            int r0 = r0.f149381a     // Catch:{ Exception -> 0x05d2 }
            r14 = 1
            if (r0 != r14) goto L_0x025e
            com.google.bl.a.a.b r0 = r12.f149398e     // Catch:{ Exception -> 0x05d2 }
            if (r0 != 0) goto L_0x0206
            com.google.bl.a.a.b r0 = com.google.p4222bl.p4223a.p4224a.C56063b.f149379c     // Catch:{ Exception -> 0x05d2 }
        L_0x0206:
            int r14 = r0.f149381a     // Catch:{ Exception -> 0x05d2 }
            r15 = 1
            if (r14 != r15) goto L_0x0210
            java.lang.Object r0 = r0.f149382b     // Catch:{ Exception -> 0x05d2 }
            com.google.bl.a.a.j r0 = (com.google.p4222bl.p4223a.p4224a.C56071j) r0     // Catch:{ Exception -> 0x05d2 }
            goto L_0x0212
        L_0x0210:
            com.google.bl.a.a.j r0 = com.google.p4222bl.p4223a.p4224a.C56071j.f149401c     // Catch:{ Exception -> 0x05d2 }
        L_0x0212:
            java.lang.String r0 = r0.f149404b     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r14 = "entity.entityAction.launchAppContent.deepLinkUri"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r14)     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r6)     // Catch:{ Exception -> 0x05d2 }
            r11.copyOnWrite()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r14 = r11.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.p r14 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134510p) r14     // Catch:{ Exception -> 0x05d2 }
            r0.getClass()     // Catch:{ Exception -> 0x05d2 }
            int r15 = r14.f366310a     // Catch:{ Exception -> 0x05d2 }
            r15 = r15 | 16
            r14.f366310a = r15     // Catch:{ Exception -> 0x05d2 }
            r14.f366317h = r0     // Catch:{ Exception -> 0x05d2 }
            com.google.bl.a.a.b r0 = r12.f149398e     // Catch:{ Exception -> 0x05d2 }
            if (r0 != 0) goto L_0x0234
            com.google.bl.a.a.b r0 = com.google.p4222bl.p4223a.p4224a.C56063b.f149379c     // Catch:{ Exception -> 0x05d2 }
        L_0x0234:
            int r14 = r0.f149381a     // Catch:{ Exception -> 0x05d2 }
            r15 = 1
            if (r14 != r15) goto L_0x023e
            java.lang.Object r0 = r0.f149382b     // Catch:{ Exception -> 0x05d2 }
            com.google.bl.a.a.j r0 = (com.google.p4222bl.p4223a.p4224a.C56071j) r0     // Catch:{ Exception -> 0x05d2 }
            goto L_0x0240
        L_0x023e:
            com.google.bl.a.a.j r0 = com.google.p4222bl.p4223a.p4224a.C56071j.f149401c     // Catch:{ Exception -> 0x05d2 }
        L_0x0240:
            java.lang.String r0 = r0.f149403a     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r14 = "entity.entityAction.launchAppContent.packageName"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r14)     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r6)     // Catch:{ Exception -> 0x05d2 }
            r11.copyOnWrite()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r14 = r11.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.p r14 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134510p) r14     // Catch:{ Exception -> 0x05d2 }
            r0.getClass()     // Catch:{ Exception -> 0x05d2 }
            int r15 = r14.f366310a     // Catch:{ Exception -> 0x05d2 }
            r18 = 2
            r15 = r15 | 2
            r14.f366310a = r15     // Catch:{ Exception -> 0x05d2 }
            r14.f366314e = r0     // Catch:{ Exception -> 0x05d2 }
        L_0x025e:
            com.google.android.apps.search.googleapp.discover.p.c.j r0 = com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134504j.f366294b     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.i r0 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134503i) r0     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r5)     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r4)     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.cq r14 = r12.f149399f     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r15 = "entity.thumbnailList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r15)     // Catch:{ Exception -> 0x05d2 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ Exception -> 0x05d2 }
        L_0x0277:
            boolean r15 = r14.hasNext()     // Catch:{ Exception -> 0x05d2 }
            if (r15 == 0) goto L_0x02cd
            java.lang.Object r15 = r14.next()     // Catch:{ Exception -> 0x05d2 }
            com.google.bl.a.a.af r15 = (com.google.p4222bl.p4223a.p4224a.C56062af) r15     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.a.b r1 = new com.google.protobuf.a.b     // Catch:{ Exception -> 0x05d2 }
            r19 = r8
            com.google.protobuf.bv r8 = r0.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.j r8 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134504j) r8     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.cq r8 = r8.f366296a     // Catch:{ Exception -> 0x05d2 }
            java.util.List r8 = java.util.Collections.unmodifiableList(r8)     // Catch:{ Exception -> 0x05d2 }
            r20 = r10
            java.lang.String r10 = "_builder.getThumbnailList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r10)     // Catch:{ Exception -> 0x05d2 }
            r1.<init>(r8)     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r1 = "visual"
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r1)     // Catch:{ Exception -> 0x05d2 }
            android.content.Context r1 = r7.f366254a     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.h r1 = com.google.android.apps.search.googleapp.discover.p10204p.p10206b.p10207a.C134487a.m218246a(r15, r1)     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r6)     // Catch:{ Exception -> 0x05d2 }
            r0.copyOnWrite()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r8 = r0.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.j r8 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134504j) r8     // Catch:{ Exception -> 0x05d2 }
            r1.getClass()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.cq r10 = r8.f366296a     // Catch:{ Exception -> 0x05d2 }
            boolean r15 = r10.mo58948c()     // Catch:{ Exception -> 0x05d2 }
            if (r15 != 0) goto L_0x02c1
            com.google.protobuf.cq r10 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r10)     // Catch:{ Exception -> 0x05d2 }
            r8.f366296a = r10     // Catch:{ Exception -> 0x05d2 }
        L_0x02c1:
            com.google.protobuf.cq r8 = r8.f366296a     // Catch:{ Exception -> 0x05d2 }
            r8.add(r1)     // Catch:{ Exception -> 0x05d2 }
            r8 = r19
            r10 = r20
            r1 = 8
            goto L_0x0277
        L_0x02cd:
            r19 = r8
            r20 = r10
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r9)     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.j r0 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134504j) r0     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r6)     // Catch:{ Exception -> 0x05d2 }
            r11.copyOnWrite()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r1 = r11.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.p r1 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134510p) r1     // Catch:{ Exception -> 0x05d2 }
            r0.getClass()     // Catch:{ Exception -> 0x05d2 }
            r1.f366319j = r0     // Catch:{ Exception -> 0x05d2 }
            int r0 = r1.f366310a     // Catch:{ Exception -> 0x05d2 }
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.f366310a = r0     // Catch:{ Exception -> 0x05d2 }
            int r0 = r12.f149394a     // Catch:{ Exception -> 0x05d2 }
            r1 = 2
            if (r0 != r1) goto L_0x0553
            java.lang.Object r0 = r12.f149395b     // Catch:{ Exception -> 0x05d2 }
            com.google.bl.a.a.ad r0 = (com.google.p4222bl.p4223a.p4224a.C56060ad) r0     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r1 = "entity.videoEntity"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.l r1 = com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134506l.f366297c     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.k r1 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134505k) r1     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r5)     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r4)     // Catch:{ Exception -> 0x05d2 }
            int r8 = r0.f149370a     // Catch:{ Exception -> 0x05d2 }
            r10 = 1
            if (r8 != r10) goto L_0x03fd
            java.lang.Object r0 = r0.f149371b     // Catch:{ Exception -> 0x05d2 }
            com.google.bl.a.a.n r0 = (com.google.p4222bl.p4223a.p4224a.C56075n) r0     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r8 = "this@toOnDeviceVideoItem.movieEntity"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r8)     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.r r8 = com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134512r.f366320d     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.q r8 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134511q) r8     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r5)     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r4)     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.b r10 = com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134496b.f366280b     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.a r10 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134493a) r10     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r5)     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.d r10 = p5462h.p5473f.p5475b.C69664n.m101061g(r10, "builder")     // Catch:{ Exception -> 0x05d2 }
            r10.mo111804c()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.cq r12 = r0.f149411a     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r14 = "movieEntity.genreList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r14)     // Catch:{ Exception -> 0x05d2 }
            r10.mo111803b(r12)     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.b r10 = r10.mo111802a()     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r6)     // Catch:{ Exception -> 0x05d2 }
            r8.copyOnWrite()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r12 = r8.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.r r12 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134512r) r12     // Catch:{ Exception -> 0x05d2 }
            r10.getClass()     // Catch:{ Exception -> 0x05d2 }
            r12.f366323b = r10     // Catch:{ Exception -> 0x05d2 }
            int r10 = r12.f366322a     // Catch:{ Exception -> 0x05d2 }
            r14 = 1
            r10 = r10 | r14
            r12.f366322a = r10     // Catch:{ Exception -> 0x05d2 }
            com.google.cg.d r10 = r0.f149412b     // Catch:{ Exception -> 0x05d2 }
            if (r10 != 0) goto L_0x0362
            com.google.cg.d r10 = com.google.p4479cg.C58072d.f155218d     // Catch:{ Exception -> 0x05d2 }
        L_0x0362:
            int r10 = r10.f155220a     // Catch:{ Exception -> 0x05d2 }
            if (r10 <= 0) goto L_0x03e0
            com.google.cg.d r0 = r0.f149412b     // Catch:{ Exception -> 0x05d2 }
            if (r0 != 0) goto L_0x036c
            com.google.cg.d r0 = com.google.p4479cg.C58072d.f155218d     // Catch:{ Exception -> 0x05d2 }
        L_0x036c:
            java.lang.String r10 = "movieEntity.releaseYear"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r10)     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r10 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r10)     // Catch:{ Exception -> 0x05d2 }
            com.google.p4479cg.p4480a.C58066c.m88821c(r0)     // Catch:{ Exception -> 0x05d2 }
            int r10 = r0.f155220a     // Catch:{ Exception -> 0x05d2 }
            r12 = 0
            if (r10 <= 0) goto L_0x0380
            r10 = 1
            goto L_0x0381
        L_0x0380:
            r10 = 0
        L_0x0381:
            com.google.common.base.C58838bb.m90869d(r10, r2)     // Catch:{ Exception -> 0x05d2 }
            int r10 = r0.f155221b     // Catch:{ Exception -> 0x05d2 }
            if (r10 != 0) goto L_0x0393
            int r0 = r0.f155220a     // Catch:{ Exception -> 0x05d2 }
            r10 = 12
            r12 = 31
            j$.time.LocalDate r0 = p3186j$.time.LocalDate.m71157of(r0, r10, r12)     // Catch:{ Exception -> 0x05d2 }
            goto L_0x03b3
        L_0x0393:
            int r10 = r0.f155222c     // Catch:{ Exception -> 0x05d2 }
            if (r10 != 0) goto L_0x03af
            com.google.p4479cg.p4480a.C58066c.m88821c(r0)     // Catch:{ Exception -> 0x05d2 }
            int r10 = r0.f155220a     // Catch:{ Exception -> 0x05d2 }
            if (r10 <= 0) goto L_0x039f
            r12 = 1
        L_0x039f:
            com.google.common.base.C58838bb.m90869d(r12, r2)     // Catch:{ Exception -> 0x05d2 }
            int r10 = r0.f155220a     // Catch:{ Exception -> 0x05d2 }
            int r0 = r0.f155221b     // Catch:{ Exception -> 0x05d2 }
            j$.time.YearMonth r0 = p3186j$.time.YearMonth.m71264of(r10, r0)     // Catch:{ Exception -> 0x05d2 }
            j$.time.LocalDate r0 = r0.atEndOfMonth()     // Catch:{ Exception -> 0x05d2 }
            goto L_0x03b3
        L_0x03af:
            j$.time.LocalDate r0 = com.google.p4479cg.p4480a.C58068e.m88826d(r0)     // Catch:{ Exception -> 0x05d2 }
        L_0x03b3:
            java.lang.String r10 = "toJavaLocalDateLatest(this)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r10)     // Catch:{ Exception -> 0x05d2 }
            j$.time.ZoneId r10 = com.google.common.p4580v.C60951j.f165070a     // Catch:{ Exception -> 0x05d2 }
            j$.time.ZonedDateTime r0 = r0.atStartOfDay(r10)     // Catch:{ Exception -> 0x05d2 }
            j$.time.Instant r0 = r0.toInstant()     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r10 = "localDate.atStartOfDay(Z…ogleZoneId()).toInstant()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r10)     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.fg r0 = com.google.protobuf.p4750c.p4751a.C62949a.m95467b(r0)     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r6)     // Catch:{ Exception -> 0x05d2 }
            r8.copyOnWrite()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.r r10 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134512r) r10     // Catch:{ Exception -> 0x05d2 }
            r0.getClass()     // Catch:{ Exception -> 0x05d2 }
            r10.f366324c = r0     // Catch:{ Exception -> 0x05d2 }
            int r0 = r10.f366322a     // Catch:{ Exception -> 0x05d2 }
            r12 = 2
            r0 = r0 | r12
            r10.f366322a = r0     // Catch:{ Exception -> 0x05d2 }
        L_0x03e0:
            com.google.protobuf.bv r0 = r8.build()     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r9)     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.r r0 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134512r) r0     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r6)     // Catch:{ Exception -> 0x05d2 }
            r1.copyOnWrite()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r8 = r1.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.l r8 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134506l) r8     // Catch:{ Exception -> 0x05d2 }
            r0.getClass()     // Catch:{ Exception -> 0x05d2 }
            r8.f366300b = r0     // Catch:{ Exception -> 0x05d2 }
            r0 = 1
            r8.f366299a = r0     // Catch:{ Exception -> 0x05d2 }
            goto L_0x04dd
        L_0x03fd:
            r10 = 2
            if (r8 != r10) goto L_0x04df
            java.lang.Object r8 = r0.f149371b     // Catch:{ Exception -> 0x05d2 }
            com.google.bl.a.a.r r8 = (com.google.p4222bl.p4223a.p4224a.C56079r) r8     // Catch:{ Exception -> 0x05d2 }
            int r8 = r8.f149419a     // Catch:{ Exception -> 0x05d2 }
            r10 = 1
            if (r8 != r10) goto L_0x04dd
            com.google.android.apps.search.googleapp.discover.p.c.t r8 = com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134514t.f366325c     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.s r8 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134513s) r8     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r5)     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r4)     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.z r10 = com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134520z.f366333e     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.y r10 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134519y) r10     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r5)     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r4)     // Catch:{ Exception -> 0x05d2 }
            int r12 = r0.f149370a     // Catch:{ Exception -> 0x05d2 }
            r14 = 2
            if (r12 != r14) goto L_0x042f
            java.lang.Object r0 = r0.f149371b     // Catch:{ Exception -> 0x05d2 }
            com.google.bl.a.a.r r0 = (com.google.p4222bl.p4223a.p4224a.C56079r) r0     // Catch:{ Exception -> 0x05d2 }
            goto L_0x0431
        L_0x042f:
            com.google.bl.a.a.r r0 = com.google.p4222bl.p4223a.p4224a.C56079r.f149417c     // Catch:{ Exception -> 0x05d2 }
        L_0x0431:
            int r12 = r0.f149419a     // Catch:{ Exception -> 0x05d2 }
            r14 = 1
            if (r12 != r14) goto L_0x043b
            java.lang.Object r0 = r0.f149420b     // Catch:{ Exception -> 0x05d2 }
            com.google.bl.a.a.x r0 = (com.google.p4222bl.p4223a.p4224a.C56085x) r0     // Catch:{ Exception -> 0x05d2 }
            goto L_0x043d
        L_0x043b:
            com.google.bl.a.a.x r0 = com.google.p4222bl.p4223a.p4224a.C56085x.f149425d     // Catch:{ Exception -> 0x05d2 }
        L_0x043d:
            java.lang.String r12 = "this@toOnDeviceVideoItem.tvEntity.tvShowEntity"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r12)     // Catch:{ Exception -> 0x05d2 }
            int r12 = r0.f149427a     // Catch:{ Exception -> 0x05d2 }
            r10.copyOnWrite()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r14 = r10.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.z r14 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134520z) r14     // Catch:{ Exception -> 0x05d2 }
            int r15 = r14.f366335a     // Catch:{ Exception -> 0x05d2 }
            r16 = 1
            r15 = r15 | 1
            r14.f366335a = r15     // Catch:{ Exception -> 0x05d2 }
            r14.f366336b = r12     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.b r12 = com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134496b.f366280b     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bn r12 = r12.createBuilder()     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.a r12 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134493a) r12     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r5)     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.d r12 = p5462h.p5473f.p5475b.C69664n.m101061g(r12, "builder")     // Catch:{ Exception -> 0x05d2 }
            r12.mo111804c()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.cq r14 = r0.f149428b     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r15 = "tvShowEntity.genreList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r15)     // Catch:{ Exception -> 0x05d2 }
            r12.mo111803b(r14)     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.b r12 = r12.mo111802a()     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r6)     // Catch:{ Exception -> 0x05d2 }
            r10.copyOnWrite()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r14 = r10.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.z r14 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134520z) r14     // Catch:{ Exception -> 0x05d2 }
            r12.getClass()     // Catch:{ Exception -> 0x05d2 }
            r14.f366337c = r12     // Catch:{ Exception -> 0x05d2 }
            int r12 = r14.f366335a     // Catch:{ Exception -> 0x05d2 }
            r15 = 2
            r12 = r12 | r15
            r14.f366335a = r12     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r0 = r0.f149429c     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r12 = "tvShowEntity.displayAirDate"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r12)     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r6)     // Catch:{ Exception -> 0x05d2 }
            r10.copyOnWrite()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r12 = r10.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.z r12 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134520z) r12     // Catch:{ Exception -> 0x05d2 }
            r0.getClass()     // Catch:{ Exception -> 0x05d2 }
            int r14 = r12.f366335a     // Catch:{ Exception -> 0x05d2 }
            r14 = r14 | 4
            r12.f366335a = r14     // Catch:{ Exception -> 0x05d2 }
            r12.f366338d = r0     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r0 = r10.build()     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r9)     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.z r0 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134520z) r0     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r6)     // Catch:{ Exception -> 0x05d2 }
            r8.copyOnWrite()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.t r10 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134514t) r10     // Catch:{ Exception -> 0x05d2 }
            r0.getClass()     // Catch:{ Exception -> 0x05d2 }
            r10.f366328b = r0     // Catch:{ Exception -> 0x05d2 }
            r0 = 1
            r10.f366327a = r0     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r0 = r8.build()     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r9)     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.t r0 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134514t) r0     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r6)     // Catch:{ Exception -> 0x05d2 }
            r1.copyOnWrite()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r8 = r1.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.l r8 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134506l) r8     // Catch:{ Exception -> 0x05d2 }
            r0.getClass()     // Catch:{ Exception -> 0x05d2 }
            r8.f366300b = r0     // Catch:{ Exception -> 0x05d2 }
            r10 = 2
            r8.f366299a = r10     // Catch:{ Exception -> 0x05d2 }
            goto L_0x0534
        L_0x04dd:
            r10 = 2
            goto L_0x0534
        L_0x04df:
            r12 = 3
            if (r8 != r12) goto L_0x0534
            com.google.android.apps.search.googleapp.discover.p.c.ab r8 = com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134495ab.f366276c     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.aa r8 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134494aa) r8     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r5)     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r4)     // Catch:{ Exception -> 0x05d2 }
            int r14 = r0.f149370a     // Catch:{ Exception -> 0x05d2 }
            if (r14 != r12) goto L_0x04f9
            java.lang.Object r0 = r0.f149371b     // Catch:{ Exception -> 0x05d2 }
            com.google.bl.a.a.z r0 = (com.google.p4222bl.p4223a.p4224a.C56087z) r0     // Catch:{ Exception -> 0x05d2 }
            goto L_0x04fb
        L_0x04f9:
            com.google.bl.a.a.z r0 = com.google.p4222bl.p4223a.p4224a.C56087z.f149430b     // Catch:{ Exception -> 0x05d2 }
        L_0x04fb:
            java.lang.String r0 = r0.f149432a     // Catch:{ Exception -> 0x05d2 }
            java.lang.String r14 = "this@toOnDeviceVideoItem…VideoEntity.numberOfViews"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r14)     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r6)     // Catch:{ Exception -> 0x05d2 }
            r8.copyOnWrite()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r14 = r8.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.ab r14 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134495ab) r14     // Catch:{ Exception -> 0x05d2 }
            r0.getClass()     // Catch:{ Exception -> 0x05d2 }
            int r15 = r14.f366278a     // Catch:{ Exception -> 0x05d2 }
            r16 = 1
            r15 = r15 | 1
            r14.f366278a = r15     // Catch:{ Exception -> 0x05d2 }
            r14.f366279b = r0     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r0 = r8.build()     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r9)     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.ab r0 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134495ab) r0     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r6)     // Catch:{ Exception -> 0x05d2 }
            r1.copyOnWrite()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r8 = r1.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.l r8 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134506l) r8     // Catch:{ Exception -> 0x05d2 }
            r0.getClass()     // Catch:{ Exception -> 0x05d2 }
            r8.f366300b = r0     // Catch:{ Exception -> 0x05d2 }
            r8.f366299a = r12     // Catch:{ Exception -> 0x05d2 }
            goto L_0x0536
        L_0x0534:
            r16 = 1
        L_0x0536:
            com.google.protobuf.bv r0 = r1.build()     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r9)     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.l r0 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134506l) r0     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r6)     // Catch:{ Exception -> 0x05d2 }
            r11.copyOnWrite()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r1 = r11.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.p r1 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134510p) r1     // Catch:{ Exception -> 0x05d2 }
            r0.getClass()     // Catch:{ Exception -> 0x05d2 }
            r1.f366312c = r0     // Catch:{ Exception -> 0x05d2 }
            r0 = 8
            r1.f366311b = r0     // Catch:{ Exception -> 0x05d2 }
            goto L_0x0556
        L_0x0553:
            r10 = 2
            r16 = 1
        L_0x0556:
            com.google.protobuf.bv r0 = r11.build()     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r9)     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.p r0 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134510p) r0     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r6)     // Catch:{ Exception -> 0x05d2 }
            r13.copyOnWrite()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r1 = r13.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.n r1 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134508n) r1     // Catch:{ Exception -> 0x05d2 }
            r0.getClass()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.cq r8 = r1.f366304b     // Catch:{ Exception -> 0x05d2 }
            boolean r11 = r8.mo58948c()     // Catch:{ Exception -> 0x05d2 }
            if (r11 != 0) goto L_0x057a
            com.google.protobuf.cq r8 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r8)     // Catch:{ Exception -> 0x05d2 }
            r1.f366304b = r8     // Catch:{ Exception -> 0x05d2 }
        L_0x057a:
            com.google.protobuf.cq r1 = r1.f366304b     // Catch:{ Exception -> 0x05d2 }
            r1.add(r0)     // Catch:{ Exception -> 0x05d2 }
            r1 = r21
            r0 = r17
            r8 = r19
            r10 = r20
            r11 = 1
            goto L_0x0158
        L_0x058a:
            r17 = r0
            r19 = r8
            r10 = 2
            r16 = 1
            com.google.protobuf.bv r0 = r13.build()     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r9)     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.n r0 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134508n) r0     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r6)     // Catch:{ Exception -> 0x05d2 }
            r3.copyOnWrite()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.bv r1 = r3.instance     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.f r1 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134500f) r1     // Catch:{ Exception -> 0x05d2 }
            r0.getClass()     // Catch:{ Exception -> 0x05d2 }
            com.google.protobuf.cq r8 = r1.f366286a     // Catch:{ Exception -> 0x05d2 }
            boolean r11 = r8.mo58948c()     // Catch:{ Exception -> 0x05d2 }
            if (r11 != 0) goto L_0x05b5
            com.google.protobuf.cq r8 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r8)     // Catch:{ Exception -> 0x05d2 }
            r1.f366286a = r8     // Catch:{ Exception -> 0x05d2 }
        L_0x05b5:
            com.google.protobuf.cq r1 = r1.f366286a     // Catch:{ Exception -> 0x05d2 }
            r1.add(r0)     // Catch:{ Exception -> 0x05d2 }
            r1 = r21
            r0 = r17
            r8 = r19
            r11 = 1
            goto L_0x00ba
        L_0x05c3:
            r1 = r21
            goto L_0x0099
        L_0x05c7:
            com.google.protobuf.bv r0 = r3.build()     // Catch:{ Exception -> 0x05d2 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r9)     // Catch:{ Exception -> 0x05d2 }
            com.google.android.apps.search.googleapp.discover.p.c.f r0 = (com.google.android.apps.search.googleapp.discover.p10204p.p10209c.C134500f) r0     // Catch:{ Exception -> 0x05d2 }
            goto L_0x05f2
        L_0x05d1:
            return r8
        L_0x05d2:
            r0 = move-exception
            com.google.common.f.e r1 = f366272a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.x r0 = r1.mo56382g(r0)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 40353(0x9da1, float:5.6547E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "Error fetching BeyondStore data"
            r0.mo56386p(r1)
            r0 = 0
        L_0x05f2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10204p.p10206b.C134492c.mo111801a(h.c.g):java.lang.Object");
    }
}
