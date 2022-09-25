package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.ib */
/* compiled from: PG */
public final /* synthetic */ class C29195ib implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29211ir f79160a;

    /* renamed from: b */
    public final /* synthetic */ C29334dr f79161b;

    /* renamed from: c */
    public final /* synthetic */ C29392ep f79162c;

    /* renamed from: d */
    public final /* synthetic */ C60931s f79163d;

    public /* synthetic */ C29195ib(C29211ir irVar, C29334dr drVar, C29392ep epVar, C60931s sVar) {
        this.f79160a = irVar;
        this.f79161b = drVar;
        this.f79162c = epVar;
        this.f79163d = sVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x021d, code lost:
        r19 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0223, code lost:
        if (com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m.m54015k(r13) == false) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0229, code lost:
        if (r8.mo34446z() != false) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x022b, code lost:
        com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53937i("%s File detected as sideloaded, but sideloading is not enabled. group = %s, file id = %s, file url = %s", "DataFileGroupValidator", r0.f79501c, r13.f79473b, r13.f79474c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x024d, code lost:
        com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53937i("%s File details missing in added group = %s, file id = %s", "DataFileGroupValidator", r0.f79501c, r13.f79473b);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r24) {
        /*
            r23 = this;
            r1 = r23
            java.lang.String r2 = "MDDManager"
            java.lang.String r3 = "%s %s"
            com.google.android.libraries.mdi.download.d.ir r4 = r1.f79160a
            com.google.android.libraries.mdi.download.dr r0 = r1.f79161b
            com.google.android.libraries.mdi.download.ep r5 = r1.f79162c
            com.google.common.util.concurrent.s r6 = r1.f79163d
            r7 = r24
            java.lang.Void r7 = (java.lang.Void) r7
            android.content.Context r7 = r4.f79192b
            com.google.android.libraries.mdi.download.cb r8 = r4.f79206p
            java.lang.String r9 = r0.f79501c
            boolean r9 = r9.isEmpty()
            java.lang.String r10 = "DataFileGroupValidator"
            if (r9 == 0) goto L_0x0027
            java.lang.String r2 = "%s Group name missing in added group"
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53935g(r2, r10)
            goto L_0x02f2
        L_0x0027:
            java.lang.String r9 = r0.f79501c
            java.lang.String r12 = "|"
            boolean r9 = r9.contains(r12)
            if (r9 == 0) goto L_0x003a
            java.lang.String r2 = "%s Group name = %s contains '|'"
            java.lang.String r3 = r0.f79501c
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53936h(r2, r10, r3)
            goto L_0x02f2
        L_0x003a:
            java.lang.String r9 = r0.f79502d
            boolean r9 = r9.contains(r12)
            if (r9 == 0) goto L_0x004b
            java.lang.String r2 = "%s Owner package = %s contains '|'"
            java.lang.String r3 = r0.f79502d
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53936h(r2, r10, r3)
            goto L_0x02f2
        L_0x004b:
            com.google.protobuf.cq r9 = r0.f79512n
            java.util.Iterator r9 = r9.iterator()
        L_0x0051:
            boolean r13 = r9.hasNext()
            r15 = 2
            if (r13 == 0) goto L_0x0264
            java.lang.Object r13 = r9.next()
            com.google.android.libraries.mdi.download.dl r13 = (com.google.android.libraries.mdi.download.C29328dl) r13
            java.lang.String r11 = r13.f79473b
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x024d
            java.lang.String r11 = r13.f79473b
            boolean r11 = r11.contains(r12)
            if (r11 != 0) goto L_0x024d
            boolean r11 = com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m.m54011g(r13)
            if (r11 == 0) goto L_0x0083
            int r11 = r13.f79472a
            r11 = r11 & 64
            if (r11 == 0) goto L_0x0093
            java.lang.String r11 = r13.f79479h
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x0093
            goto L_0x0091
        L_0x0083:
            int r11 = r13.f79472a
            r11 = r11 & 16
            if (r11 == 0) goto L_0x0093
            java.lang.String r11 = r13.f79477f
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x0093
        L_0x0091:
            r11 = 1
            goto L_0x0094
        L_0x0093:
            r11 = 0
        L_0x0094:
            int r14 = r13.f79476e
            int r14 = com.google.android.libraries.mdi.download.C29327dk.m54216a(r14)
            if (r14 != 0) goto L_0x009d
            r14 = 1
        L_0x009d:
            int r14 = r14 + -1
            if (r14 == 0) goto L_0x00a4
            r14 = r11 ^ 1
            goto L_0x00a5
        L_0x00a4:
            r14 = r11
        L_0x00a5:
            boolean r17 = com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m.m54011g(r13)
            if (r17 == 0) goto L_0x00af
            if (r11 != 0) goto L_0x00af
            r11 = 1
            goto L_0x00b0
        L_0x00af:
            r11 = 0
        L_0x00b0:
            r11 = r11 | r14
            int r14 = r13.f79484m
            int r14 = com.google.android.libraries.mdi.download.C29322df.m54214a(r14)
            if (r14 != 0) goto L_0x00bb
        L_0x00b9:
            r14 = 1
            goto L_0x00c7
        L_0x00bb:
            if (r14 != r15) goto L_0x00b9
            java.lang.String r14 = r13.f79485n
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x00c6
            goto L_0x00b9
        L_0x00c6:
            r14 = 0
        L_0x00c7:
            java.lang.String r15 = r13.f79474c
            boolean r15 = r15.isEmpty()
            if (r15 != 0) goto L_0x024d
            java.lang.String r15 = r13.f79474c
            boolean r15 = r15.contains(r12)
            if (r15 != 0) goto L_0x024d
            int r15 = r13.f79475d
            if (r15 < 0) goto L_0x024d
            if (r11 == 0) goto L_0x024d
            if (r14 == 0) goto L_0x024d
            java.lang.String r11 = com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m.m54009e(r13)
            boolean r11 = r11.contains(r12)
            if (r11 != 0) goto L_0x024d
            int r11 = r13.f79472a
            r11 = r11 & 32
            if (r11 == 0) goto L_0x0176
            com.google.bz.b.n r11 = r13.f79478g
            if (r11 != 0) goto L_0x00f5
            com.google.bz.b.n r11 = com.google.p4433bz.p4437b.C57909n.f154891b
        L_0x00f5:
            boolean r11 = com.google.android.libraries.mdi.download.p2236d.C28844b.m53796a(r11)
            if (r11 == 0) goto L_0x02f2
            java.lang.String r11 = r0.f79501c
            boolean r15 = com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m.m54011g(r13)
            if (r15 == 0) goto L_0x0158
            boolean r15 = r8.mo34412B()
            if (r15 != 0) goto L_0x0112
            java.lang.String r2 = "Feature enableZipFolder is not enabled. Group = %s, file id = %s"
            java.lang.String r3 = r13.f79473b
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53936h(r2, r11, r3)
            goto L_0x02f2
        L_0x0112:
            com.google.bz.b.n r15 = r13.f79478g
            if (r15 != 0) goto L_0x0118
            com.google.bz.b.n r15 = com.google.p4433bz.p4437b.C57909n.f154891b
        L_0x0118:
            com.google.protobuf.cq r15 = r15.f154893a
            int r15 = r15.size()
            r14 = 1
            if (r15 <= r14) goto L_0x012a
            java.lang.String r2 = "Download zip folder transform cannot not be applied with other transforms. Group = %s, file id = %s"
            java.lang.String r3 = r13.f79473b
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53936h(r2, r11, r3)
            goto L_0x02f2
        L_0x012a:
            com.google.bz.b.n r14 = r13.f79478g
            if (r14 != 0) goto L_0x0130
            com.google.bz.b.n r14 = com.google.p4433bz.p4437b.C57909n.f154891b
        L_0x0130:
            com.google.protobuf.cq r14 = r14.f154893a
            r15 = 0
            java.lang.Object r14 = r14.get(r15)
            com.google.bz.b.l r14 = (com.google.p4433bz.p4437b.C57907l) r14
            int r15 = r14.f154889a
            r1 = 4
            if (r15 != r1) goto L_0x0143
            java.lang.Object r1 = r14.f154890b
            com.google.bz.b.p r1 = (com.google.p4433bz.p4437b.C57911p) r1
            goto L_0x0145
        L_0x0143:
            com.google.bz.b.p r1 = com.google.p4433bz.p4437b.C57911p.f154894c
        L_0x0145:
            java.lang.String r14 = "*"
            java.lang.String r1 = r1.f154897b
            boolean r1 = r14.equals(r1)
            if (r1 != 0) goto L_0x0158
            java.lang.String r1 = "Download zip folder transform can only have * as target. Group = %s, file id = %s"
            java.lang.String r2 = r13.f79473b
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53936h(r1, r11, r2)
            goto L_0x02f2
        L_0x0158:
            int r1 = r13.f79476e
            int r1 = com.google.android.libraries.mdi.download.C29327dk.m54216a(r1)
            if (r1 != 0) goto L_0x0161
            goto L_0x0164
        L_0x0161:
            r11 = 2
            if (r1 == r11) goto L_0x0176
        L_0x0164:
            int r1 = r13.f79472a
            r1 = r1 & 64
            if (r1 == 0) goto L_0x016b
            goto L_0x0176
        L_0x016b:
            java.lang.String r1 = r0.f79501c
            java.lang.String r2 = r13.f79473b
            java.lang.String r3 = "Download checksum must be provided. Group = %s, file id = %s"
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53936h(r3, r1, r2)
            goto L_0x02f2
        L_0x0176:
            int r1 = r13.f79472a
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0188
            com.google.bz.b.n r1 = r13.f79481j
            if (r1 != 0) goto L_0x0182
            com.google.bz.b.n r1 = com.google.p4433bz.p4437b.C57909n.f154891b
        L_0x0182:
            boolean r1 = com.google.android.libraries.mdi.download.p2236d.C28844b.m53796a(r1)
            if (r1 == 0) goto L_0x02f2
        L_0x0188:
            java.lang.String r1 = r0.f79501c
            com.google.protobuf.cq r11 = r13.f79482k
            java.util.Iterator r11 = r11.iterator()
        L_0x0190:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x021d
            java.lang.Object r14 = r11.next()
            com.google.android.libraries.mdi.download.dv r14 = (com.google.android.libraries.mdi.download.C29338dv) r14
            java.lang.String r15 = r14.f79525b
            boolean r15 = r15.isEmpty()
            if (r15 != 0) goto L_0x0203
            java.lang.String r15 = r14.f79525b
            boolean r15 = r15.contains(r12)
            if (r15 != 0) goto L_0x0203
            int r15 = r14.f79524a
            r17 = 2
            r15 = r15 & 2
            if (r15 == 0) goto L_0x0203
            int r15 = r14.f79526c
            if (r15 < 0) goto L_0x0203
            java.lang.String r15 = r14.f79527d
            boolean r15 = r15.isEmpty()
            if (r15 != 0) goto L_0x0203
            java.lang.String r15 = r14.f79527d
            boolean r15 = r15.contains(r12)
            if (r15 != 0) goto L_0x0203
            int r15 = r14.f79524a
            r19 = r15 & 8
            if (r19 == 0) goto L_0x0203
            r19 = r9
            int r9 = r14.f79528e
            int r9 = com.google.android.libraries.mdi.download.C29337du.m54219a(r9)
            if (r9 != 0) goto L_0x01d9
            goto L_0x0203
        L_0x01d9:
            r20 = r11
            r11 = 1
            if (r9 == r11) goto L_0x0203
            r9 = r15 & 16
            if (r9 == 0) goto L_0x0203
            com.google.android.libraries.mdi.download.dd r9 = r14.f79529f
            if (r9 != 0) goto L_0x01e8
            com.google.android.libraries.mdi.download.dd r9 = com.google.android.libraries.mdi.download.C29318dd.f79461c
        L_0x01e8:
            java.lang.String r9 = r9.f79464b
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0203
            com.google.android.libraries.mdi.download.dd r9 = r14.f79529f
            if (r9 != 0) goto L_0x01f6
            com.google.android.libraries.mdi.download.dd r9 = com.google.android.libraries.mdi.download.C29318dd.f79461c
        L_0x01f6:
            java.lang.String r9 = r9.f79464b
            boolean r9 = r9.contains(r12)
            if (r9 != 0) goto L_0x0203
            r9 = r19
            r11 = r20
            goto L_0x0190
        L_0x0203:
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r10
            r3 = 1
            r2[r3] = r1
            java.lang.String r1 = r13.f79473b
            r3 = 2
            r2[r3] = r1
            java.lang.String r1 = r14.f79525b
            r3 = 3
            r2[r3] = r1
            java.lang.String r1 = "%s Delta File of Datafile details missing in added group = %s, file id = %s, delta file UrlToDownload = %s."
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53937i(r1, r2)
            goto L_0x02f2
        L_0x021d:
            r19 = r9
            boolean r1 = com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m.m54015k(r13)
            if (r1 == 0) goto L_0x0247
            boolean r1 = r8.mo34446z()
            if (r1 != 0) goto L_0x0247
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r10
            java.lang.String r2 = r0.f79501c
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = r13.f79473b
            r3 = 2
            r1[r3] = r2
            java.lang.String r2 = r13.f79474c
            r3 = 3
            r1[r3] = r2
            java.lang.String r2 = "%s File detected as sideloaded, but sideloading is not enabled. group = %s, file id = %s, file url = %s"
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53937i(r2, r1)
            goto L_0x02f2
        L_0x0247:
            r1 = r23
            r9 = r19
            goto L_0x0051
        L_0x024d:
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r10
            java.lang.String r2 = r0.f79501c
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = r13.f79473b
            r3 = 2
            r1[r3] = r2
            java.lang.String r2 = "%s File details missing in added group = %s, file id = %s"
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53937i(r2, r1)
            goto L_0x02f2
        L_0x0264:
            r1 = 0
        L_0x0265:
            com.google.protobuf.cq r8 = r0.f79512n
            int r8 = r8.size()
            if (r1 >= r8) goto L_0x02b5
            int r8 = r1 + 1
            r9 = r8
        L_0x0270:
            com.google.protobuf.cq r11 = r0.f79512n
            int r11 = r11.size()
            if (r9 >= r11) goto L_0x02b3
            com.google.protobuf.cq r11 = r0.f79512n
            java.lang.Object r11 = r11.get(r1)
            com.google.android.libraries.mdi.download.dl r11 = (com.google.android.libraries.mdi.download.C29328dl) r11
            java.lang.String r11 = r11.f79473b
            com.google.protobuf.cq r12 = r0.f79512n
            java.lang.Object r12 = r12.get(r9)
            com.google.android.libraries.mdi.download.dl r12 = (com.google.android.libraries.mdi.download.C29328dl) r12
            java.lang.String r12 = r12.f79473b
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x02b0
            r11 = 3
            java.lang.Object[] r2 = new java.lang.Object[r11]
            r3 = 0
            r2[r3] = r10
            java.lang.String r3 = r0.f79501c
            r5 = 1
            r2[r5] = r3
            com.google.protobuf.cq r3 = r0.f79512n
            java.lang.Object r1 = r3.get(r1)
            com.google.android.libraries.mdi.download.dl r1 = (com.google.android.libraries.mdi.download.C29328dl) r1
            java.lang.String r1 = r1.f79473b
            r3 = 2
            r2[r3] = r1
            java.lang.String r1 = "%s Repeated file id in added group = %s, file id = %s"
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53937i(r1, r2)
            goto L_0x02f2
        L_0x02b0:
            int r9 = r9 + 1
            goto L_0x0270
        L_0x02b3:
            r1 = r8
            goto L_0x0265
        L_0x02b5:
            com.google.android.libraries.mdi.download.ed r1 = r0.f79510l
            if (r1 != 0) goto L_0x02bb
            com.google.android.libraries.mdi.download.ed r1 = com.google.android.libraries.mdi.download.C29380ed.f79641f
        L_0x02bb:
            int r1 = r1.f79645c
            int r1 = com.google.android.libraries.mdi.download.C29377ea.m54303a(r1)
            if (r1 != 0) goto L_0x02c4
            goto L_0x02db
        L_0x02c4:
            r8 = 3
            if (r1 != r8) goto L_0x02db
            com.google.android.libraries.mdi.download.ed r1 = r0.f79510l
            if (r1 != 0) goto L_0x02cd
            com.google.android.libraries.mdi.download.ed r1 = com.google.android.libraries.mdi.download.C29380ed.f79641f
        L_0x02cd:
            long r8 = r1.f79646d
            r11 = 0
            int r1 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r1 > 0) goto L_0x02db
            java.lang.String r1 = "%s For DOWNLOAD_FIRST_ON_WIFI_THEN_ON_ANY_NETWORK policy, the download_first_on_wifi_period_secs must be > 0"
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53935g(r1, r10)
            goto L_0x02f2
        L_0x02db:
            boolean r1 = com.google.android.libraries.mdi.download.p2236d.C29173hg.m54129c(r7)
            if (r1 != 0) goto L_0x0316
            int r1 = r0.f79507i
            int r1 = com.google.android.libraries.mdi.download.C29332dp.m54217a(r1)
            if (r1 != 0) goto L_0x02ea
            goto L_0x0316
        L_0x02ea:
            r7 = 3
            if (r1 != r7) goto L_0x0316
            java.lang.String r1 = "%s For AllowedReaders ALL_APPS policy, the device should be migrated to new key"
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53935g(r1, r10)
        L_0x02f2:
            com.google.android.libraries.mdi.download.d.e.d r1 = r4.f79193c
            r17 = 1020(0x3fc, float:1.43E-42)
            java.lang.String r2 = r0.f79501c
            int r3 = r0.f79503e
            long r4 = r0.f79516r
            java.lang.String r0 = r0.f79517s
            r16 = r1
            r18 = r2
            r19 = r3
            r20 = r4
            r22 = r0
            r16.mo34544i(r17, r18, r19, r20, r22)
            r1 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0408
        L_0x0316:
            com.google.protobuf.cq r1 = r0.f79512n
            com.google.common.b.gu r1 = com.google.android.libraries.mdi.download.p2236d.C29211ir.m54132a(r1)
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.android.libraries.mdi.download.dq r0 = (com.google.android.libraries.mdi.download.C29333dq) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.android.libraries.mdi.download.dr r7 = (com.google.android.libraries.mdi.download.C29334dr) r7
            com.google.protobuf.cq r8 = com.google.android.libraries.mdi.download.C29334dr.emptyProtobufList()
            r7.f79512n = r8
            r0.mo34654a(r1)
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.mdi.download.dr r0 = (com.google.android.libraries.mdi.download.C29334dr) r0
            com.google.android.libraries.mdi.download.d.fe r1 = r4.f79194d     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            com.google.android.libraries.mdi.download.ie r7 = r1.f78977f     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            long r8 = com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m.m54005a(r0)     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            boolean r7 = com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m.m54012h(r8, r7)     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            java.lang.String r8 = "FileGroupManager"
            if (r7 != 0) goto L_0x03cd
            java.lang.String r7 = r5.f79683c     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            boolean r7 = r1.mo34594s(r7)     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            if (r7 == 0) goto L_0x03ab
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60866ct.f164955a     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            com.google.android.libraries.mdi.download.cb r8 = r1.f78984m     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            boolean r8 = r8.mo34442v()     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            if (r8 == 0) goto L_0x0381
            com.google.android.libraries.mdi.download.ed r8 = r0.f79510l     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            if (r8 != 0) goto L_0x0360
            com.google.android.libraries.mdi.download.ed r8 = com.google.android.libraries.mdi.download.C29380ed.f79641f     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
        L_0x0360:
            int r8 = r8.f79647e     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            int r8 = com.google.android.libraries.mdi.download.C29340dx.m54220a(r8)     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            if (r8 != 0) goto L_0x0369
            goto L_0x0381
        L_0x0369:
            r9 = 2
            if (r8 != r9) goto L_0x0381
            com.google.android.libraries.mdi.download.d.ff r7 = r1.f78975d     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            com.google.common.util.concurrent.cx r7 = r7.mo34603h(r5)     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            com.google.android.libraries.mdi.download.d.ad r8 = new com.google.android.libraries.mdi.download.d.ad     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            r8.<init>(r1, r5, r0)     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            java.util.concurrent.Executor r9 = r1.f78980i     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            com.google.common.util.concurrent.s r8 = com.google.apps.tiktok.tracing.C47810es.m84966f(r8)     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60922j.m93045h(r7, r8, r9)     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
        L_0x0381:
            com.google.android.libraries.mdi.download.l.b r7 = com.google.android.libraries.mdi.download.p2257l.C29670b.m54719g(r7)     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            com.google.android.libraries.mdi.download.d.ae r8 = new com.google.android.libraries.mdi.download.d.ae     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            r8.<init>(r1, r5, r0)     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            java.util.concurrent.Executor r9 = r1.f78980i     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            com.google.android.libraries.mdi.download.l.b r7 = r7.mo34822i(r8, r9)     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            com.google.android.libraries.mdi.download.d.af r8 = new com.google.android.libraries.mdi.download.d.af     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            r8.<init>(r1, r5, r0)     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            java.util.concurrent.Executor r1 = r1.f78980i     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            com.google.android.libraries.mdi.download.l.b r1 = r7.mo34822i(r8, r1)     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            com.google.android.libraries.mdi.download.d.ia r7 = new com.google.android.libraries.mdi.download.d.ia     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            r7.<init>(r4, r5, r0, r6)     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            java.util.concurrent.Executor r0 = r4.f79204n     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            com.google.common.util.concurrent.s r5 = com.google.apps.tiktok.tracing.C47810es.m84966f(r7)     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60922j.m93045h(r1, r5, r0)     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            goto L_0x0408
        L_0x03ab:
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            r7 = 0
            r6[r7] = r8     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            java.lang.String r7 = r5.f79682b     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            r8 = 1
            r6[r8] = r7     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            java.lang.String r5 = r5.f79683c     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            r7 = 2
            r6[r7] = r5     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            java.lang.String r5 = "%s: Trying to add group %s for uninstalled app %s."
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53937i(r5, r6)     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            com.google.android.libraries.mdi.download.d.e.d r1 = r1.f78973b     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            r5 = 1042(0x412, float:1.46E-42)
            com.google.android.libraries.mdi.download.p2236d.C29117fe.m54053v(r5, r1, r0)     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            com.google.android.libraries.mdi.download.d.lz r0 = new com.google.android.libraries.mdi.download.d.lz     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            r0.<init>()     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            throw r0     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
        L_0x03cd:
            java.lang.String r6 = "%s: Trying to add expired group %s."
            java.lang.String r5 = r5.f79682b     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53936h(r6, r8, r5)     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            com.google.android.libraries.mdi.download.d.e.d r1 = r1.f78973b     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            r5 = 1048(0x418, float:1.469E-42)
            com.google.android.libraries.mdi.download.p2236d.C29117fe.m54053v(r5, r1, r0)     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            com.google.android.libraries.mdi.download.d.aa r0 = new com.google.android.libraries.mdi.download.d.aa     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            r0.<init>()     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
            throw r0     // Catch:{ aa -> 0x03fc, lz -> 0x03fa, a -> 0x03f8, IOException -> 0x03e1 }
        L_0x03e1:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53936h(r3, r2, r1)
            com.google.android.libraries.mdi.download.ia r1 = r4.f79199i
            java.lang.String r2 = "Failed to add group to MDD"
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r1.mo34497a(r0, r2, r3)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92899h(r0)
            goto L_0x0408
        L_0x03f8:
            r0 = move-exception
            goto L_0x03fd
        L_0x03fa:
            r0 = move-exception
            goto L_0x03fd
        L_0x03fc:
            r0 = move-exception
        L_0x03fd:
            java.lang.Class r1 = r0.getClass()
            com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l.m53944p(r3, r2, r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92899h(r0)
        L_0x0408:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.mdi.download.p2236d.C29195ib.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
