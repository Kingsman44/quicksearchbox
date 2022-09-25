package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import java.util.Comparator;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.er */
/* compiled from: PG */
public final /* synthetic */ class C123418er implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ C123459ge f341189a;

    /* renamed from: b */
    public final /* synthetic */ C123427f f341190b;

    public /* synthetic */ C123418er(C123459ge geVar, C123427f fVar) {
        this.f341189a = geVar;
        this.f341190b = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        if (r2.equals(com.google.assistant.p3817aj.p3818a.p3819a.C49190b.GOOGLE_PLAY_STORE) != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r3.equals(com.google.assistant.p3817aj.p3818a.p3819a.C49190b.GOOGLE_PLAY_STORE) != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008c, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00aa, code lost:
        if (r1.equals(com.google.assistant.p3817aj.p3818a.p3819a.C49190b.YOUTUBE) != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c9, code lost:
        if (r1.equals(com.google.assistant.p3817aj.p3818a.p3819a.C49190b.YOUTUBE) != false) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ge r0 = r8.f341189a
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.f r1 = r8.f341190b
            com.google.android.apps.gsa.nga.shared.a.aa r9 = (com.google.android.apps.gsa.nga.shared.p6274a.C80047aa) r9
            com.google.android.apps.gsa.nga.shared.a.aa r10 = (com.google.android.apps.gsa.nga.shared.p6274a.C80047aa) r10
            java.lang.String r1 = r1.mo105929i()
            int r2 = r9.f219660d
            int r3 = r9.f219661e
            java.lang.String r2 = r1.substring(r2, r3)
            int r3 = r10.f219660d
            int r4 = r10.f219661e
            java.lang.String r1 = r1.substring(r3, r4)
            boolean r3 = r2.contains(r1)
            r4 = -1
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x0031
            int r3 = r2.length()
            int r7 = r1.length()
            if (r3 <= r7) goto L_0x0031
            r1 = -1
            goto L_0x0044
        L_0x0031:
            boolean r3 = r1.contains(r2)
            if (r3 == 0) goto L_0x0043
            int r2 = r2.length()
            int r1 = r1.length()
            if (r2 >= r1) goto L_0x0043
            r1 = 1
            goto L_0x0044
        L_0x0043:
            r1 = 0
        L_0x0044:
            if (r1 != 0) goto L_0x0145
            j$.util.Optional r1 = r0.mo106018k(r9)
            boolean r2 = r1.isPresent()
            if (r2 == 0) goto L_0x006a
            java.lang.Object r2 = r1.get()
            com.google.assistant.aj.a.a.d r2 = (com.google.assistant.p3817aj.p3818a.p3819a.C49192d) r2
            int r2 = r2.f127202b
            com.google.assistant.aj.a.a.b r2 = com.google.assistant.p3817aj.p3818a.p3819a.C49190b.m85387a(r2)
            if (r2 != 0) goto L_0x0060
            com.google.assistant.aj.a.a.b r2 = com.google.assistant.p3817aj.p3818a.p3819a.C49190b.OTHER
        L_0x0060:
            com.google.assistant.aj.a.a.b r3 = com.google.assistant.p3817aj.p3818a.p3819a.C49190b.GOOGLE_PLAY_STORE
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006a
        L_0x0068:
            r1 = -1
            goto L_0x00cd
        L_0x006a:
            j$.util.Optional r2 = r0.mo106018k(r10)
            boolean r3 = r2.isPresent()
            if (r3 == 0) goto L_0x008e
            java.lang.Object r3 = r2.get()
            com.google.assistant.aj.a.a.d r3 = (com.google.assistant.p3817aj.p3818a.p3819a.C49192d) r3
            int r3 = r3.f127202b
            com.google.assistant.aj.a.a.b r3 = com.google.assistant.p3817aj.p3818a.p3819a.C49190b.m85387a(r3)
            if (r3 != 0) goto L_0x0084
            com.google.assistant.aj.a.a.b r3 = com.google.assistant.p3817aj.p3818a.p3819a.C49190b.OTHER
        L_0x0084:
            com.google.assistant.aj.a.a.b r7 = com.google.assistant.p3817aj.p3818a.p3819a.C49190b.GOOGLE_PLAY_STORE
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x008e
        L_0x008c:
            r1 = 1
            goto L_0x00cd
        L_0x008e:
            boolean r3 = r1.isPresent()
            if (r3 == 0) goto L_0x00ad
            java.lang.Object r1 = r1.get()
            com.google.assistant.aj.a.a.d r1 = (com.google.assistant.p3817aj.p3818a.p3819a.C49192d) r1
            int r1 = r1.f127202b
            com.google.assistant.aj.a.a.b r1 = com.google.assistant.p3817aj.p3818a.p3819a.C49190b.m85387a(r1)
            if (r1 != 0) goto L_0x00a4
            com.google.assistant.aj.a.a.b r1 = com.google.assistant.p3817aj.p3818a.p3819a.C49190b.OTHER
        L_0x00a4:
            com.google.assistant.aj.a.a.b r3 = com.google.assistant.p3817aj.p3818a.p3819a.C49190b.YOUTUBE
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00ad
            goto L_0x0068
        L_0x00ad:
            boolean r1 = r2.isPresent()
            if (r1 == 0) goto L_0x00cc
            java.lang.Object r1 = r2.get()
            com.google.assistant.aj.a.a.d r1 = (com.google.assistant.p3817aj.p3818a.p3819a.C49192d) r1
            int r1 = r1.f127202b
            com.google.assistant.aj.a.a.b r1 = com.google.assistant.p3817aj.p3818a.p3819a.C49190b.m85387a(r1)
            if (r1 != 0) goto L_0x00c3
            com.google.assistant.aj.a.a.b r1 = com.google.assistant.p3817aj.p3818a.p3819a.C49190b.OTHER
        L_0x00c3:
            com.google.assistant.aj.a.a.b r2 = com.google.assistant.p3817aj.p3818a.p3819a.C49190b.YOUTUBE
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00cc
            goto L_0x008c
        L_0x00cc:
            r1 = 0
        L_0x00cd:
            if (r1 != 0) goto L_0x0145
            j$.util.Optional r1 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123459ge.m202807i(r9)
            j$.util.Optional r2 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123459ge.m202807i(r10)
            boolean r3 = r1.isPresent()
            if (r3 == 0) goto L_0x013f
            boolean r3 = r2.isPresent()
            if (r3 == 0) goto L_0x013f
            java.lang.Object r1 = r1.get()
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.i r1 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123503i) r1
            java.lang.Object r2 = r2.get()
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.i r2 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123503i) r2
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.dr r3 = r0.f341249c
            java.lang.String r7 = r1.mo106026d()
            boolean r3 = r3.mo105998b(r7)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.dr r0 = r0.f341249c
            java.lang.String r7 = r2.mo106026d()
            boolean r0 = r0.mo105998b(r7)
            if (r3 == 0) goto L_0x0109
            if (r0 != 0) goto L_0x0108
            goto L_0x013a
        L_0x0108:
            r0 = 1
        L_0x0109:
            if (r3 != 0) goto L_0x010f
            if (r0 == 0) goto L_0x010f
        L_0x010d:
            r4 = 1
            goto L_0x013a
        L_0x010f:
            java.lang.String r0 = r1.mo106026d()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0124
            java.lang.String r0 = r2.mo106026d()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0124
            goto L_0x013a
        L_0x0124:
            java.lang.String r0 = r1.mo106026d()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0139
            java.lang.String r0 = r2.mo106026d()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0139
            goto L_0x010d
        L_0x0139:
            r4 = 0
        L_0x013a:
            if (r4 != 0) goto L_0x013d
            goto L_0x013f
        L_0x013d:
            r1 = r4
            goto L_0x0145
        L_0x013f:
            int r10 = r10.f219660d
            int r9 = r9.f219660d
            int r10 = r10 - r9
            return r10
        L_0x0145:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig.C123418er.compare(java.lang.Object, java.lang.Object):int");
    }
}
