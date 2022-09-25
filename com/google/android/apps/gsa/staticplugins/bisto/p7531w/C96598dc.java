package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.dc */
/* compiled from: PG */
public final /* synthetic */ class C96598dc implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C96600de f270226a;

    public /* synthetic */ C96598dc(C96600de deVar) {
        this.f270226a = deVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:25|26|27|28|29) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:61|62|63|64|65|66) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:41|(2:43|(1:45))|46|47|48|49|50|51|52) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0085 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00d3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0119 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:27:0x0085=Splitter:B:27:0x0085, B:64:0x0119=Splitter:B:64:0x0119} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r21 = this;
            r1 = r21
            com.google.android.apps.gsa.staticplugins.bisto.w.de r2 = r1.f270226a
            com.google.android.apps.search.assistant.surfaces.bisto.d.bp r0 = r2.f270239c     // Catch:{ Exception -> 0x02bc }
            java.lang.String r0 = r0.f343897f     // Catch:{ Exception -> 0x02bc }
            boolean r3 = com.google.common.base.C58837ba.m90859h(r0)     // Catch:{ Exception -> 0x02bc }
            if (r3 != 0) goto L_0x02af
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x02bc }
            r3.<init>(r0)     // Catch:{ Exception -> 0x02bc }
            long r4 = r3.length()     // Catch:{ Exception -> 0x02bc }
            int r5 = (int) r4     // Catch:{ Exception -> 0x02bc }
            r2.f270230B = r5     // Catch:{ Exception -> 0x02bc }
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96600de.f270228a     // Catch:{ Exception -> 0x02bc }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ Exception -> 0x02bc }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ Exception -> 0x02bc }
            java.lang.String r6 = "UploadOtaTask"
            r4.mo56378ag(r5, r6)     // Catch:{ Exception -> 0x02bc }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ Exception -> 0x02bc }
            r5 = 16718(0x414e, float:2.3427E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ Exception -> 0x02bc }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ Exception -> 0x02bc }
            java.lang.String r5 = "Sending Ota data to device #%d. [filepath=%s, length=%d]."
            int r6 = r2.f270240d     // Catch:{ Exception -> 0x02bc }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x02bc }
            int r7 = r2.f270230B     // Catch:{ Exception -> 0x02bc }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x02bc }
            r4.mo56359L(r5, r6, r0, r7)     // Catch:{ Exception -> 0x02bc }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x029f }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x029f }
            int r0 = r2.f270242v     // Catch:{ Exception -> 0x02bc }
            int r3 = r2.f270230B     // Catch:{ Exception -> 0x02bc }
            if (r0 > r3) goto L_0x0277
            int r0 = r2.f270242v     // Catch:{ Exception -> 0x02bc }
            long r11 = (long) r0
            long r9 = r4.skip(r11)     // Catch:{ IOException -> 0x0232 }
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0209
            com.google.android.libraries.f.a r0 = r2.f270200l     // Catch:{ Exception -> 0x02bc }
            long r5 = r0.mo26870b()     // Catch:{ Exception -> 0x02bc }
            java.nio.channels.FileChannel r0 = p3186j$.wrapper.java.p3189io.FileInputStreamWrapper.getChannel(r4)     // Catch:{ cs -> 0x01ec }
            int r3 = r2.f270242v     // Catch:{ cs -> 0x01ec }
            int r7 = r2.f270241e     // Catch:{ cs -> 0x01ec }
            byte[] r7 = new byte[r7]     // Catch:{ cs -> 0x01ec }
            r8 = 0
            r2.mo90271c(r8)     // Catch:{ cs -> 0x01ec }
            r2.mo90265m()     // Catch:{ cs -> 0x01ec }
            r9 = 0
            r10 = 0
        L_0x0071:
            com.google.common.util.concurrent.SettableFuture r11 = r2.f270229A     // Catch:{ cs -> 0x01ec }
            boolean r11 = r11.isDone()     // Catch:{ cs -> 0x01ec }
            if (r11 != 0) goto L_0x01b4
            long r11 = r2.f270244x     // Catch:{ cs -> 0x01ec }
            r13 = 0
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x008d
            java.lang.Thread.sleep(r11)     // Catch:{ InterruptedException -> 0x0085 }
            goto L_0x008d
        L_0x0085:
            com.google.android.apps.gsa.staticplugins.bisto.w.cs r0 = new com.google.android.apps.gsa.staticplugins.bisto.w.cs     // Catch:{ cs -> 0x01ec }
            java.lang.String r3 = "ERROR_DURING_UPLOADING: sleep interrupted"
            r0.<init>(r3)     // Catch:{ cs -> 0x01ec }
            throw r0     // Catch:{ cs -> 0x01ec }
        L_0x008d:
            boolean r11 = r2.mo90263k()     // Catch:{ cs -> 0x01ec }
            if (r11 != 0) goto L_0x01ac
            monitor-enter(r2)     // Catch:{ cs -> 0x01ec }
            java.lang.Integer r11 = r2.f270246z     // Catch:{ all -> 0x01a9 }
            if (r11 != 0) goto L_0x009e
            if (r9 > 0) goto L_0x009e
            if (r10 == 0) goto L_0x009e
            r13 = 1
            goto L_0x009f
        L_0x009e:
            r13 = 0
        L_0x009f:
            if (r11 == 0) goto L_0x00ea
            int r16 = r11.intValue()     // Catch:{ all -> 0x01a9 }
            int r12 = r2.f270243w     // Catch:{ all -> 0x01a9 }
            int r12 = r12 + -10
            r2.f270243w = r12     // Catch:{ all -> 0x01a9 }
            int r3 = r3 - r16
            int r14 = r2.f270241e     // Catch:{ all -> 0x01a9 }
            int r3 = r3 / r14
            int r12 = r12 - r3
            r2.f270243w = r12     // Catch:{ all -> 0x01a9 }
            r3 = -100
            if (r12 >= r3) goto L_0x00c7
            long r14 = r2.f270244x     // Catch:{ all -> 0x01a9 }
            r19 = 100
            int r3 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r3 >= 0) goto L_0x00c7
            r2.f270243w = r8     // Catch:{ all -> 0x01a9 }
            r17 = 5
            long r14 = r14 + r17
            r2.f270244x = r14     // Catch:{ all -> 0x01a9 }
        L_0x00c7:
            int r3 = r11.intValue()     // Catch:{ all -> 0x01a9 }
            r11 = 0
            r2.f270246z = r11     // Catch:{ all -> 0x01a9 }
            long r11 = (long) r3
            r0.position(r11)     // Catch:{ IOException -> 0x00d3 }
            goto L_0x0103
        L_0x00d3:
            com.google.android.apps.gsa.staticplugins.bisto.w.cs r0 = new com.google.android.apps.gsa.staticplugins.bisto.w.cs     // Catch:{ all -> 0x01a9 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a9 }
            r5.<init>()     // Catch:{ all -> 0x01a9 }
            java.lang.String r6 = "ERROR_DURING_UPLOADING: Failed to follow NACK and set position to "
            r5.append(r6)     // Catch:{ all -> 0x01a9 }
            r5.append(r3)     // Catch:{ all -> 0x01a9 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x01a9 }
            r0.<init>(r3)     // Catch:{ all -> 0x01a9 }
            throw r0     // Catch:{ all -> 0x01a9 }
        L_0x00ea:
            int r11 = r2.f270243w     // Catch:{ all -> 0x01a9 }
            r12 = 1
            int r11 = r11 + r12
            r2.f270243w = r11     // Catch:{ all -> 0x01a9 }
            r12 = 100
            if (r11 <= r12) goto L_0x0103
            long r11 = r2.f270244x     // Catch:{ all -> 0x01a9 }
            r14 = 5
            int r16 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x0103
            r2.f270243w = r8     // Catch:{ all -> 0x01a9 }
            r14 = -5
            long r11 = r11 + r14
            r2.f270244x = r11     // Catch:{ all -> 0x01a9 }
        L_0x0103:
            int r11 = r2.f270241e     // Catch:{ all -> 0x01a9 }
            int r11 = r11 + r3
            int r12 = r2.f270230B     // Catch:{ all -> 0x01a9 }
            int r11 = java.lang.Math.min(r11, r12)     // Catch:{ all -> 0x01a9 }
            r2.mo90271c(r11)     // Catch:{ all -> 0x01a9 }
            monitor-exit(r2)     // Catch:{ all -> 0x01a9 }
            if (r13 == 0) goto L_0x0121
            r11 = 20
            java.lang.Thread.sleep(r11)     // Catch:{ InterruptedException -> 0x0119 }
            goto L_0x0071
        L_0x0119:
            com.google.android.apps.gsa.staticplugins.bisto.w.cs r0 = new com.google.android.apps.gsa.staticplugins.bisto.w.cs     // Catch:{ cs -> 0x01ec }
            java.lang.String r3 = "ERROR_DURING_UPLOADING: sleep interrupted"
            r0.<init>(r3)     // Catch:{ cs -> 0x01ec }
            throw r0     // Catch:{ cs -> 0x01ec }
        L_0x0121:
            int r9 = r2.f270241e     // Catch:{ cs -> 0x01ec }
            int r10 = r2.f270230B     // Catch:{ cs -> 0x01ec }
            int r10 = r10 - r3
            int r9 = java.lang.Math.min(r9, r10)     // Catch:{ cs -> 0x01ec }
            int r10 = r7.length     // Catch:{ cs -> 0x01ec }
            if (r10 == r9) goto L_0x012f
            byte[] r7 = new byte[r9]     // Catch:{ cs -> 0x01ec }
        L_0x012f:
            int r9 = r4.read(r7, r8, r9)     // Catch:{ IOException -> 0x018c }
            if (r9 > 0) goto L_0x0138
        L_0x0135:
            r10 = 1
            goto L_0x0071
        L_0x0138:
            com.google.android.d.fv r10 = com.google.android.p10712d.C142451fv.f386546d     // Catch:{ IOException -> 0x018c }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ IOException -> 0x018c }
            com.google.android.d.fu r10 = (com.google.android.p10712d.C142450fu) r10     // Catch:{ IOException -> 0x018c }
            com.google.protobuf.z r11 = com.google.protobuf.C63088z.m96142D(r7, r8, r9)     // Catch:{ IOException -> 0x018c }
            r10.copyOnWrite()     // Catch:{ IOException -> 0x018c }
            com.google.protobuf.bv r12 = r10.instance     // Catch:{ IOException -> 0x018c }
            com.google.android.d.fv r12 = (com.google.android.p10712d.C142451fv) r12     // Catch:{ IOException -> 0x018c }
            int r13 = r12.f386548a     // Catch:{ IOException -> 0x018c }
            r14 = 1
            r13 = r13 | r14
            r12.f386548a = r13     // Catch:{ IOException -> 0x018c }
            r12.f386549b = r11     // Catch:{ IOException -> 0x018c }
            r10.copyOnWrite()     // Catch:{ IOException -> 0x018c }
            com.google.protobuf.bv r11 = r10.instance     // Catch:{ IOException -> 0x018c }
            com.google.android.d.fv r11 = (com.google.android.p10712d.C142451fv) r11     // Catch:{ IOException -> 0x018c }
            int r12 = r11.f386548a     // Catch:{ IOException -> 0x018c }
            r12 = r12 | 2
            r11.f386548a = r12     // Catch:{ IOException -> 0x018c }
            r11.f386550c = r3     // Catch:{ IOException -> 0x018c }
            com.google.protobuf.bv r10 = r10.build()     // Catch:{ IOException -> 0x018c }
            com.google.android.d.fv r10 = (com.google.android.p10712d.C142451fv) r10     // Catch:{ IOException -> 0x018c }
            int r11 = r2.f270230B     // Catch:{ IOException -> 0x018c }
            int r3 = r3 + r9
            int r11 = r2.f270230B     // Catch:{ IOException -> 0x018c }
            if (r3 < r11) goto L_0x0178
            monitor-enter(r2)     // Catch:{ IOException -> 0x018c }
            r11 = 1
            r2.f270245y = r11     // Catch:{ all -> 0x0175 }
            monitor-exit(r2)     // Catch:{ all -> 0x0175 }
            goto L_0x0179
        L_0x0175:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0175 }
            throw r0     // Catch:{ IOException -> 0x018c }
        L_0x0178:
            r11 = 1
        L_0x0179:
            com.google.android.d.fz r12 = com.google.android.p10712d.C142455fz.OTA_DATA     // Catch:{ IOException -> 0x018c }
            com.google.android.apps.gsa.staticplugins.bisto.w.cr r13 = r2.f270238b     // Catch:{ IOException -> 0x018c }
            boolean r10 = r2.mo90264l(r10, r12, r13)     // Catch:{ IOException -> 0x018c }
            if (r10 == 0) goto L_0x0184
            goto L_0x0135
        L_0x0184:
            com.google.android.apps.gsa.staticplugins.bisto.w.cs r0 = new com.google.android.apps.gsa.staticplugins.bisto.w.cs     // Catch:{ IOException -> 0x018c }
            java.lang.String r3 = "ERROR_DURING_UPLOADING: send message"
            r0.<init>(r3)     // Catch:{ IOException -> 0x018c }
            throw r0     // Catch:{ IOException -> 0x018c }
        L_0x018c:
            r0 = move-exception
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96600de.f270228a     // Catch:{ cs -> 0x01ec }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ cs -> 0x01ec }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ cs -> 0x01ec }
            java.lang.String r6 = "UploadOtaTask"
            r3.mo56378ag(r5, r6)     // Catch:{ cs -> 0x01ec }
            java.lang.String r5 = "Retrieving data to send."
            r6 = 16729(0x4159, float:2.3442E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r6)).mo56386p(r5)     // Catch:{ cs -> 0x01ec }
            com.google.android.apps.gsa.staticplugins.bisto.w.cs r0 = new com.google.android.apps.gsa.staticplugins.bisto.w.cs     // Catch:{ cs -> 0x01ec }
            java.lang.String r3 = "ERROR_DURING_UPLOADING: exception"
            r0.<init>(r3)     // Catch:{ cs -> 0x01ec }
            throw r0     // Catch:{ cs -> 0x01ec }
        L_0x01a9:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01a9 }
            throw r0     // Catch:{ cs -> 0x01ec }
        L_0x01ac:
            com.google.android.apps.gsa.staticplugins.bisto.w.cs r0 = new com.google.android.apps.gsa.staticplugins.bisto.w.cs     // Catch:{ cs -> 0x01ec }
            java.lang.String r3 = "ERROR_DURING_UPLOADING:interrupted"
            r0.<init>(r3)     // Catch:{ cs -> 0x01ec }
            throw r0     // Catch:{ cs -> 0x01ec }
        L_0x01b4:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x02bc }
            com.google.android.libraries.f.a r3 = r2.f270200l     // Catch:{ Exception -> 0x02bc }
            long r7 = r3.mo26870b()     // Catch:{ Exception -> 0x02bc }
            long r7 = r7 - r5
            r0.toSeconds(r7)     // Catch:{ Exception -> 0x02bc }
            int r0 = r2.f270230B     // Catch:{ Exception -> 0x02bc }
            r4.close()     // Catch:{ Exception -> 0x01c6 }
            goto L_0x01dc
        L_0x01c6:
            r0 = move-exception
            r3 = r0
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96600de.f270228a     // Catch:{ Exception -> 0x02bc }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ Exception -> 0x02bc }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ Exception -> 0x02bc }
            java.lang.String r5 = "UploadOtaTask"
            r0.mo56378ag(r4, r5)     // Catch:{ Exception -> 0x02bc }
            java.lang.String r4 = "Failed to close FileInputStream"
            r5 = 16733(0x415d, float:2.3448E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r3)).mo56372aa(r5)).mo56386p(r4)     // Catch:{ Exception -> 0x02bc }
        L_0x01dc:
            r2.mo90265m()     // Catch:{ Exception -> 0x02bc }
            com.google.common.util.concurrent.SettableFuture r0 = r2.f270229A     // Catch:{ Exception -> 0x02bc }
            com.google.android.apps.gsa.shared.s.a.a r3 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a     // Catch:{ Exception -> 0x02bc }
            r0.get()     // Catch:{ Exception -> 0x02bc }
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a     // Catch:{ Exception -> 0x02bc }
            r2.mo90261i(r0)     // Catch:{ Exception -> 0x02bc }
            return
        L_0x01ec:
            r0 = move-exception
            r3 = r0
            r4.close()     // Catch:{ Exception -> 0x01f2 }
            goto L_0x0208
        L_0x01f2:
            r0 = move-exception
            r4 = r0
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96600de.f270228a     // Catch:{ Exception -> 0x02bc }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ Exception -> 0x02bc }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ Exception -> 0x02bc }
            java.lang.String r6 = "UploadOtaTask"
            r0.mo56378ag(r5, r6)     // Catch:{ Exception -> 0x02bc }
            java.lang.String r5 = "Failed to close FileInputStream"
            r6 = 16734(0x415e, float:2.345E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r4)).mo56372aa(r6)).mo56386p(r5)     // Catch:{ Exception -> 0x02bc }
        L_0x0208:
            throw r3     // Catch:{ Exception -> 0x02bc }
        L_0x0209:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96600de.f270228a     // Catch:{ IOException -> 0x0232 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ IOException -> 0x0232 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x0232 }
            java.lang.String r5 = "UploadOtaTask"
            r0.mo56378ag(r3, r5)     // Catch:{ IOException -> 0x0232 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ IOException -> 0x0232 }
            r3 = 16719(0x414f, float:2.3428E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r3)     // Catch:{ IOException -> 0x0232 }
            r5 = r0
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ IOException -> 0x0232 }
            java.lang.String r6 = "Wanted to skip %d bytes, actually skipped %d"
            r7 = r11
            r5.mo56350C(r6, r7, r9)     // Catch:{ IOException -> 0x0232 }
            r4.close()     // Catch:{ IOException -> 0x0232 }
            com.google.android.apps.gsa.staticplugins.bisto.w.cs r0 = new com.google.android.apps.gsa.staticplugins.bisto.w.cs     // Catch:{ IOException -> 0x0232 }
            java.lang.String r3 = "ERROR_DURING_UPLOADING: file skip"
            r0.<init>(r3)     // Catch:{ IOException -> 0x0232 }
            throw r0     // Catch:{ IOException -> 0x0232 }
        L_0x0232:
            r0 = move-exception
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96600de.f270228a     // Catch:{ Exception -> 0x02bc }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ Exception -> 0x02bc }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ Exception -> 0x02bc }
            java.lang.String r6 = "UploadOtaTask"
            r3.mo56378ag(r5, r6)     // Catch:{ Exception -> 0x02bc }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ Exception -> 0x02bc }
            com.google.common.f.x r0 = r3.mo56382g(r0)     // Catch:{ Exception -> 0x02bc }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ Exception -> 0x02bc }
            r3 = 16720(0x4150, float:2.343E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r3)     // Catch:{ Exception -> 0x02bc }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ Exception -> 0x02bc }
            java.lang.String r3 = "Skipping %d bytes failed"
            r0.mo56388r(r3, r11)     // Catch:{ Exception -> 0x02bc }
            r4.close()     // Catch:{ Exception -> 0x0259 }
            goto L_0x026f
        L_0x0259:
            r0 = move-exception
            r3 = r0
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96600de.f270228a     // Catch:{ Exception -> 0x02bc }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ Exception -> 0x02bc }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ Exception -> 0x02bc }
            java.lang.String r5 = "UploadOtaTask"
            r0.mo56378ag(r4, r5)     // Catch:{ Exception -> 0x02bc }
            java.lang.String r4 = "Failed to close FileInputStream"
            r5 = 16721(0x4151, float:2.3431E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r3)).mo56372aa(r5)).mo56386p(r4)     // Catch:{ Exception -> 0x02bc }
        L_0x026f:
            com.google.android.apps.gsa.staticplugins.bisto.w.cs r0 = new com.google.android.apps.gsa.staticplugins.bisto.w.cs     // Catch:{ Exception -> 0x02bc }
            java.lang.String r3 = "ERROR_DURING_UPLOADING: file exception"
            r0.<init>(r3)     // Catch:{ Exception -> 0x02bc }
            throw r0     // Catch:{ Exception -> 0x02bc }
        L_0x0277:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96600de.f270228a     // Catch:{ Exception -> 0x02bc }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ Exception -> 0x02bc }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ Exception -> 0x02bc }
            java.lang.String r4 = "UploadOtaTask"
            r0.mo56378ag(r3, r4)     // Catch:{ Exception -> 0x02bc }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ Exception -> 0x02bc }
            r3 = 16735(0x415f, float:2.3451E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r3)     // Catch:{ Exception -> 0x02bc }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ Exception -> 0x02bc }
            java.lang.String r3 = "Incorrect offset: %d with total length: %d"
            int r4 = r2.f270242v     // Catch:{ Exception -> 0x02bc }
            int r5 = r2.f270230B     // Catch:{ Exception -> 0x02bc }
            r0.mo56393w(r3, r4, r5)     // Catch:{ Exception -> 0x02bc }
            com.google.android.apps.gsa.staticplugins.bisto.w.cs r0 = new com.google.android.apps.gsa.staticplugins.bisto.w.cs     // Catch:{ Exception -> 0x02bc }
            java.lang.String r3 = "Incorrect offset"
            r0.<init>(r3)     // Catch:{ Exception -> 0x02bc }
            throw r0     // Catch:{ Exception -> 0x02bc }
        L_0x029f:
            com.google.android.apps.gsa.staticplugins.bisto.w.cs r3 = new com.google.android.apps.gsa.staticplugins.bisto.w.cs     // Catch:{ Exception -> 0x02bc }
            java.lang.String r4 = "ERROR_DURING_UPLOADING: Not found exception for "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x02bc }
            java.lang.String r0 = r4.concat(r0)     // Catch:{ Exception -> 0x02bc }
            r3.<init>(r0)     // Catch:{ Exception -> 0x02bc }
            throw r3     // Catch:{ Exception -> 0x02bc }
        L_0x02af:
            java.lang.String r0 = "No file"
            com.google.android.apps.gsa.shared.bisto.C89655j.m145957a(r0)     // Catch:{ Exception -> 0x02bc }
            com.google.android.apps.gsa.staticplugins.bisto.w.cs r0 = new com.google.android.apps.gsa.staticplugins.bisto.w.cs     // Catch:{ Exception -> 0x02bc }
            java.lang.String r3 = "ERROR_DURING_UPLOADING"
            r0.<init>(r3)     // Catch:{ Exception -> 0x02bc }
            throw r0     // Catch:{ Exception -> 0x02bc }
        L_0x02bc:
            r0 = move-exception
            monitor-enter(r2)
            boolean r3 = r2.mo90263k()     // Catch:{ all -> 0x02c9 }
            if (r3 != 0) goto L_0x02c7
            r2.mo90262j(r0)     // Catch:{ all -> 0x02c9 }
        L_0x02c7:
            monitor-exit(r2)     // Catch:{ all -> 0x02c9 }
            return
        L_0x02c9:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02c9 }
            goto L_0x02cd
        L_0x02cc:
            throw r0
        L_0x02cd:
            goto L_0x02cc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96598dc.run():void");
    }
}
