package com.google.android.apps.gsa.sidekick.main.p7227s;

import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.search.core.preferences.C86317h;
import com.google.android.apps.gsa.search.core.preferences.C86319j;
import com.google.android.apps.gsa.sidekick.main.p7219n.C91480f;
import com.google.common.p4526f.C59071e;
import com.google.p375ai.p378b.C7661fg;
import com.google.p375ai.p378b.C8098vl;

/* renamed from: com.google.android.apps.gsa.sidekick.main.s.a */
/* compiled from: PG */
public final class C91611a {

    /* renamed from: a */
    private static final C59071e f255527a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.s.a");

    /* renamed from: b */
    public static void m149878b(String str, C7661fg fgVar, C85651bb bbVar) {
        if (bbVar.mo79136I(fgVar, str)) {
            C8098vl vlVar = fgVar.f26591e;
            if (vlVar == null) {
                vlVar = C8098vl.f28472k;
            }
            if ((vlVar.f28474a & 128) != 0) {
                C8098vl vlVar2 = fgVar.f26591e;
                if (vlVar2 == null) {
                    vlVar2 = C8098vl.f28472k;
                }
                if (!vlVar2.f28478e) {
                    return;
                }
            } else {
                return;
            }
        }
        ((C91480f) bbVar.f231498i.mo27525b()).mo85825e();
        bbVar.mo79153p(str);
        C86319j jVar = bbVar.f231494e;
        synchronized (jVar.f233390a) {
            C86317h hVar = (C86317h) jVar.f233394e.remove(str);
            if (hVar != null) {
                synchronized (hVar.f233379b) {
                    hVar.f233382e = null;
                    hVar.f233380c.edit().remove(hVar.f233383f).apply();
                }
            }
        }
        bbVar.mo79150m();
    }

    /* JADX WARNING: type inference failed for: r0v19, types: [com.google.protobuf.bv] */
    /* JADX WARNING: type inference failed for: r4v20, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01c1, code lost:
        if (r9.f28459c != (r8 == null ? com.google.p375ai.p378b.C8091ve.f28455e : r8).f28459c) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0215, code lost:
        if (com.google.common.base.C58832aw.m90831a(r8, r7.f28460d) == false) goto L_0x0217;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m149877a(com.google.android.apps.gsa.search.core.preferences.C86319j r16, java.lang.String r17, com.google.p375ai.p378b.C7950pz r18) {
        /*
            r0 = r16
            r1 = r17
            r2 = 0
            if (r1 != 0) goto L_0x0009
            goto L_0x03e2
        L_0x0009:
            java.lang.Object r3 = r0.f233390a
            monitor-enter(r3)
            com.google.android.apps.gsa.search.core.preferences.h r4 = r16.mo80041b(r17)     // Catch:{ all -> 0x0413 }
            android.content.SharedPreferences r5 = r4.f233380c     // Catch:{ all -> 0x0413 }
            java.lang.String r6 = r4.f233383f     // Catch:{ all -> 0x0413 }
            r5.contains(r6)     // Catch:{ all -> 0x0413 }
            com.google.android.apps.gsa.search.core.bd r0 = r0.f233392c     // Catch:{ all -> 0x0413 }
            com.google.ai.b.fg r0 = r0.mo79166c(r1)     // Catch:{ all -> 0x0413 }
            if (r0 == 0) goto L_0x03e1
            int r1 = r0.f26587a     // Catch:{ all -> 0x0413 }
            r1 = r1 & 8
            if (r1 == 0) goto L_0x03e1
            com.google.ai.b.vl r0 = r0.f26591e     // Catch:{ all -> 0x0413 }
            if (r0 != 0) goto L_0x002b
            com.google.ai.b.vl r0 = com.google.p375ai.p378b.C8098vl.f28472k     // Catch:{ all -> 0x0413 }
        L_0x002b:
            java.lang.Object r1 = r4.f233379b     // Catch:{ all -> 0x0413 }
            monitor-enter(r1)     // Catch:{ all -> 0x0413 }
            com.google.ai.b.us r5 = r4.mo80033a()     // Catch:{ all -> 0x03de }
            if (r5 == 0) goto L_0x03b9
            com.google.protobuf.bv r7 = r5.instance     // Catch:{ all -> 0x03de }
            com.google.ai.b.vl r7 = (com.google.p375ai.p378b.C8098vl) r7     // Catch:{ all -> 0x03de }
            int r8 = r7.f28475b     // Catch:{ all -> 0x03de }
            r8 = r8 & 16384(0x4000, float:2.2959E-41)
            if (r8 == 0) goto L_0x03b9
            com.google.ai.b.ve r7 = r7.f28483j     // Catch:{ all -> 0x03de }
            if (r7 != 0) goto L_0x0044
            com.google.ai.b.ve r7 = com.google.p375ai.p378b.C8091ve.f28455e     // Catch:{ all -> 0x03de }
        L_0x0044:
            com.google.protobuf.cq r7 = r7.f28458b     // Catch:{ all -> 0x03de }
            int r7 = r7.size()     // Catch:{ all -> 0x03de }
            if (r7 != 0) goto L_0x004e
            goto L_0x03b9
        L_0x004e:
            com.google.protobuf.bv r7 = r5.instance     // Catch:{ all -> 0x03de }
            com.google.ai.b.vl r7 = (com.google.p375ai.p378b.C8098vl) r7     // Catch:{ all -> 0x03de }
            com.google.ai.b.ve r7 = r7.f28483j     // Catch:{ all -> 0x03de }
            if (r7 != 0) goto L_0x0058
            com.google.ai.b.ve r7 = com.google.p375ai.p378b.C8091ve.f28455e     // Catch:{ all -> 0x03de }
        L_0x0058:
            com.google.android.apps.gsa.sidekick.main.f.o r4 = r4.f233381d     // Catch:{ all -> 0x03de }
            java.util.List r4 = r4.mo85700b()     // Catch:{ all -> 0x03de }
            if (r4 != 0) goto L_0x0062
            goto L_0x00e1
        L_0x0062:
            r8 = 0
            r9 = r2
        L_0x0064:
            com.google.protobuf.cq r10 = r7.f28458b     // Catch:{ all -> 0x03de }
            int r10 = r10.size()     // Catch:{ all -> 0x03de }
            if (r8 >= r10) goto L_0x00d8
            com.google.protobuf.cq r10 = r7.f28458b     // Catch:{ all -> 0x03de }
            java.lang.Object r10 = r10.get(r8)     // Catch:{ all -> 0x03de }
            com.google.ai.b.vd r10 = (com.google.p375ai.p378b.C8090vd) r10     // Catch:{ all -> 0x03de }
            java.lang.String r11 = com.google.android.apps.gsa.search.core.preferences.C86315f.m139020b(r10)     // Catch:{ all -> 0x03de }
            java.util.Iterator r12 = r4.iterator()     // Catch:{ all -> 0x03de }
        L_0x007c:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x03de }
            if (r13 == 0) goto L_0x00d5
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x03de }
            android.app.NotificationChannel r13 = (android.app.NotificationChannel) r13     // Catch:{ all -> 0x03de }
            java.lang.String r14 = r13.getId()     // Catch:{ all -> 0x03de }
            boolean r14 = r11.equals(r14)     // Catch:{ all -> 0x03de }
            if (r14 == 0) goto L_0x007c
            if (r9 != 0) goto L_0x009a
            com.google.protobuf.bn r9 = r7.toBuilder()     // Catch:{ all -> 0x03de }
            com.google.ai.b.uz r9 = (com.google.p375ai.p378b.C8085uz) r9     // Catch:{ all -> 0x03de }
        L_0x009a:
            com.google.protobuf.bn r14 = r10.toBuilder()     // Catch:{ all -> 0x03de }
            com.google.ai.b.va r14 = (com.google.p375ai.p378b.C8087va) r14     // Catch:{ all -> 0x03de }
            int r13 = r13.getImportance()     // Catch:{ all -> 0x03de }
            int r13 = com.google.p375ai.p378b.C8089vc.m22934a(r13)     // Catch:{ all -> 0x03de }
            r14.copyOnWrite()     // Catch:{ all -> 0x03de }
            com.google.protobuf.bv r15 = r14.instance     // Catch:{ all -> 0x03de }
            com.google.ai.b.vd r15 = (com.google.p375ai.p378b.C8090vd) r15     // Catch:{ all -> 0x03de }
            int r6 = r13 + -1001
            if (r13 == 0) goto L_0x00d4
            r15.f28454d = r6     // Catch:{ all -> 0x03de }
            int r6 = r15.f28451a     // Catch:{ all -> 0x03de }
            r6 = r6 | 16
            r15.f28451a = r6     // Catch:{ all -> 0x03de }
            r9.copyOnWrite()     // Catch:{ all -> 0x03de }
            com.google.protobuf.bv r6 = r9.instance     // Catch:{ all -> 0x03de }
            com.google.ai.b.ve r6 = (com.google.p375ai.p378b.C8091ve) r6     // Catch:{ all -> 0x03de }
            com.google.protobuf.bv r13 = r14.build()     // Catch:{ all -> 0x03de }
            com.google.ai.b.vd r13 = (com.google.p375ai.p378b.C8090vd) r13     // Catch:{ all -> 0x03de }
            r13.getClass()     // Catch:{ all -> 0x03de }
            r6.mo17011a()     // Catch:{ all -> 0x03de }
            com.google.protobuf.cq r6 = r6.f28458b     // Catch:{ all -> 0x03de }
            r6.set(r8, r13)     // Catch:{ all -> 0x03de }
            goto L_0x007c
        L_0x00d4:
            throw r2     // Catch:{ all -> 0x03de }
        L_0x00d5:
            int r8 = r8 + 1
            goto L_0x0064
        L_0x00d8:
            if (r9 == 0) goto L_0x00e1
            com.google.protobuf.bv r4 = r9.build()     // Catch:{ all -> 0x03de }
            r7 = r4
            com.google.ai.b.ve r7 = (com.google.p375ai.p378b.C8091ve) r7     // Catch:{ all -> 0x03de }
        L_0x00e1:
            r5.copyOnWrite()     // Catch:{ all -> 0x03de }
            com.google.protobuf.bv r4 = r5.instance     // Catch:{ all -> 0x03de }
            com.google.ai.b.vl r4 = (com.google.p375ai.p378b.C8098vl) r4     // Catch:{ all -> 0x03de }
            r7.getClass()     // Catch:{ all -> 0x03de }
            r4.f28483j = r7     // Catch:{ all -> 0x03de }
            int r6 = r4.f28475b     // Catch:{ all -> 0x03de }
            r6 = r6 | 16384(0x4000, float:2.2959E-41)
            r4.f28475b = r6     // Catch:{ all -> 0x03de }
            com.google.protobuf.bv r4 = r5.build()     // Catch:{ all -> 0x03de }
            com.google.ai.b.vl r4 = (com.google.p375ai.p378b.C8098vl) r4     // Catch:{ all -> 0x03de }
            com.google.ai.b.vl r5 = com.google.p375ai.p378b.C8098vl.f28472k     // Catch:{ all -> 0x03de }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x03de }
            com.google.ai.b.us r5 = (com.google.p375ai.p378b.C8078us) r5     // Catch:{ all -> 0x03de }
            int r6 = r4.f28474a     // Catch:{ all -> 0x03de }
            r6 = r6 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x0131
            int r6 = r0.f28481h     // Catch:{ all -> 0x03de }
            int r6 = com.google.p375ai.p378b.C7859mp.m22879a(r6)     // Catch:{ all -> 0x03de }
            if (r6 != 0) goto L_0x0110
            r6 = 1
        L_0x0110:
            int r7 = r4.f28481h     // Catch:{ all -> 0x03de }
            int r8 = com.google.p375ai.p378b.C7859mp.m22879a(r7)     // Catch:{ all -> 0x03de }
            if (r8 != 0) goto L_0x0119
            r8 = 1
        L_0x0119:
            if (r6 == r8) goto L_0x0131
            int r6 = com.google.p375ai.p378b.C7859mp.m22879a(r7)     // Catch:{ all -> 0x03de }
            if (r6 != 0) goto L_0x0122
            r6 = 1
        L_0x0122:
            r5.copyOnWrite()     // Catch:{ all -> 0x03de }
            com.google.protobuf.bv r7 = r5.instance     // Catch:{ all -> 0x03de }
            com.google.ai.b.vl r7 = (com.google.p375ai.p378b.C8098vl) r7     // Catch:{ all -> 0x03de }
            r7.f28481h = r6     // Catch:{ all -> 0x03de }
            int r6 = r7.f28474a     // Catch:{ all -> 0x03de }
            r6 = r6 | 4096(0x1000, float:5.74E-42)
            r7.f28474a = r6     // Catch:{ all -> 0x03de }
        L_0x0131:
            int r6 = r4.f28474a     // Catch:{ all -> 0x03de }
            r6 = r6 & 256(0x100, float:3.59E-43)
            r7 = 2
            if (r6 == 0) goto L_0x0164
            int r6 = r0.f28479f     // Catch:{ all -> 0x03de }
            int r6 = com.google.p375ai.p378b.C8097vk.m22936a(r6)     // Catch:{ all -> 0x03de }
            if (r6 != 0) goto L_0x0141
            r6 = 2
        L_0x0141:
            int r8 = r4.f28479f     // Catch:{ all -> 0x03de }
            int r9 = com.google.p375ai.p378b.C8097vk.m22936a(r8)     // Catch:{ all -> 0x03de }
            if (r9 != 0) goto L_0x014a
            r9 = 2
        L_0x014a:
            if (r6 == r9) goto L_0x0164
            int r6 = com.google.p375ai.p378b.C8097vk.m22936a(r8)     // Catch:{ all -> 0x03de }
            if (r6 != 0) goto L_0x0153
            r6 = 2
        L_0x0153:
            r5.copyOnWrite()     // Catch:{ all -> 0x03de }
            com.google.protobuf.bv r8 = r5.instance     // Catch:{ all -> 0x03de }
            com.google.ai.b.vl r8 = (com.google.p375ai.p378b.C8098vl) r8     // Catch:{ all -> 0x03de }
            int r6 = r6 + -1
            r8.f28479f = r6     // Catch:{ all -> 0x03de }
            int r6 = r8.f28474a     // Catch:{ all -> 0x03de }
            r6 = r6 | 256(0x100, float:3.59E-43)
            r8.f28474a = r6     // Catch:{ all -> 0x03de }
        L_0x0164:
            int r6 = r4.f28474a     // Catch:{ all -> 0x03de }
            r6 = r6 & 512(0x200, float:7.175E-43)
            if (r6 == 0) goto L_0x0196
            int r6 = r0.f28480g     // Catch:{ all -> 0x03de }
            int r6 = com.google.p375ai.p378b.C8080uu.m22933a(r6)     // Catch:{ all -> 0x03de }
            if (r6 != 0) goto L_0x0173
            r6 = 1
        L_0x0173:
            int r8 = r4.f28480g     // Catch:{ all -> 0x03de }
            int r9 = com.google.p375ai.p378b.C8080uu.m22933a(r8)     // Catch:{ all -> 0x03de }
            if (r9 != 0) goto L_0x017c
            r9 = 1
        L_0x017c:
            if (r6 == r9) goto L_0x0196
            int r6 = com.google.p375ai.p378b.C8080uu.m22933a(r8)     // Catch:{ all -> 0x03de }
            if (r6 != 0) goto L_0x0185
            r6 = 1
        L_0x0185:
            r5.copyOnWrite()     // Catch:{ all -> 0x03de }
            com.google.protobuf.bv r8 = r5.instance     // Catch:{ all -> 0x03de }
            com.google.ai.b.vl r8 = (com.google.p375ai.p378b.C8098vl) r8     // Catch:{ all -> 0x03de }
            int r6 = r6 + -1
            r8.f28480g = r6     // Catch:{ all -> 0x03de }
            int r6 = r8.f28474a     // Catch:{ all -> 0x03de }
            r6 = r6 | 512(0x200, float:7.175E-43)
            r8.f28474a = r6     // Catch:{ all -> 0x03de }
        L_0x0196:
            com.google.ai.b.ve r6 = com.google.p375ai.p378b.C8091ve.f28455e     // Catch:{ all -> 0x03de }
            com.google.protobuf.bn r6 = r6.createBuilder()     // Catch:{ all -> 0x03de }
            com.google.ai.b.uz r6 = (com.google.p375ai.p378b.C8085uz) r6     // Catch:{ all -> 0x03de }
            com.google.ai.b.ve r8 = r4.f28483j     // Catch:{ all -> 0x03de }
            if (r8 != 0) goto L_0x01a5
            com.google.ai.b.ve r9 = com.google.p375ai.p378b.C8091ve.f28455e     // Catch:{ all -> 0x03de }
            goto L_0x01a6
        L_0x01a5:
            r9 = r8
        L_0x01a6:
            int r9 = r9.f28457a     // Catch:{ all -> 0x03de }
            r9 = r9 & r7
            if (r9 == 0) goto L_0x01ef
            int r9 = r0.f28475b     // Catch:{ all -> 0x03de }
            r9 = r9 & 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x01c3
            com.google.ai.b.ve r9 = r0.f28483j     // Catch:{ all -> 0x03de }
            if (r9 != 0) goto L_0x01b7
            com.google.ai.b.ve r9 = com.google.p375ai.p378b.C8091ve.f28455e     // Catch:{ all -> 0x03de }
        L_0x01b7:
            boolean r9 = r9.f28459c     // Catch:{ all -> 0x03de }
            if (r8 != 0) goto L_0x01be
            com.google.ai.b.ve r10 = com.google.p375ai.p378b.C8091ve.f28455e     // Catch:{ all -> 0x03de }
            goto L_0x01bf
        L_0x01be:
            r10 = r8
        L_0x01bf:
            boolean r10 = r10.f28459c     // Catch:{ all -> 0x03de }
            if (r9 == r10) goto L_0x01ef
        L_0x01c3:
            if (r8 != 0) goto L_0x01c7
            com.google.ai.b.ve r8 = com.google.p375ai.p378b.C8091ve.f28455e     // Catch:{ all -> 0x03de }
        L_0x01c7:
            boolean r8 = r8.f28459c     // Catch:{ all -> 0x03de }
            r6.copyOnWrite()     // Catch:{ all -> 0x03de }
            com.google.protobuf.bv r9 = r6.instance     // Catch:{ all -> 0x03de }
            com.google.ai.b.ve r9 = (com.google.p375ai.p378b.C8091ve) r9     // Catch:{ all -> 0x03de }
            int r10 = r9.f28457a     // Catch:{ all -> 0x03de }
            r7 = r7 | r10
            r9.f28457a = r7     // Catch:{ all -> 0x03de }
            r9.f28459c = r8     // Catch:{ all -> 0x03de }
            r5.copyOnWrite()     // Catch:{ all -> 0x03de }
            com.google.protobuf.bv r7 = r5.instance     // Catch:{ all -> 0x03de }
            com.google.ai.b.vl r7 = (com.google.p375ai.p378b.C8098vl) r7     // Catch:{ all -> 0x03de }
            com.google.protobuf.bv r8 = r6.build()     // Catch:{ all -> 0x03de }
            com.google.ai.b.ve r8 = (com.google.p375ai.p378b.C8091ve) r8     // Catch:{ all -> 0x03de }
            r8.getClass()     // Catch:{ all -> 0x03de }
            r7.f28483j = r8     // Catch:{ all -> 0x03de }
            int r8 = r7.f28475b     // Catch:{ all -> 0x03de }
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
            r7.f28475b = r8     // Catch:{ all -> 0x03de }
        L_0x01ef:
            com.google.ai.b.ve r7 = r4.f28483j     // Catch:{ all -> 0x03de }
            if (r7 != 0) goto L_0x01f6
            com.google.ai.b.ve r8 = com.google.p375ai.p378b.C8091ve.f28455e     // Catch:{ all -> 0x03de }
            goto L_0x01f7
        L_0x01f6:
            r8 = r7
        L_0x01f7:
            int r8 = r8.f28457a     // Catch:{ all -> 0x03de }
            r8 = r8 & 4
            if (r8 == 0) goto L_0x0249
            int r8 = r0.f28475b     // Catch:{ all -> 0x03de }
            r8 = r8 & 16384(0x4000, float:2.2959E-41)
            if (r8 == 0) goto L_0x0217
            com.google.ai.b.ve r8 = r0.f28483j     // Catch:{ all -> 0x03de }
            if (r8 != 0) goto L_0x0209
            com.google.ai.b.ve r8 = com.google.p375ai.p378b.C8091ve.f28455e     // Catch:{ all -> 0x03de }
        L_0x0209:
            java.lang.String r8 = r8.f28460d     // Catch:{ all -> 0x03de }
            if (r7 != 0) goto L_0x020f
            com.google.ai.b.ve r7 = com.google.p375ai.p378b.C8091ve.f28455e     // Catch:{ all -> 0x03de }
        L_0x020f:
            java.lang.String r7 = r7.f28460d     // Catch:{ all -> 0x03de }
            boolean r7 = com.google.common.base.C58832aw.m90831a(r8, r7)     // Catch:{ all -> 0x03de }
            if (r7 != 0) goto L_0x0249
        L_0x0217:
            com.google.ai.b.ve r7 = r4.f28483j     // Catch:{ all -> 0x03de }
            if (r7 != 0) goto L_0x021d
            com.google.ai.b.ve r7 = com.google.p375ai.p378b.C8091ve.f28455e     // Catch:{ all -> 0x03de }
        L_0x021d:
            java.lang.String r7 = r7.f28460d     // Catch:{ all -> 0x03de }
            r6.copyOnWrite()     // Catch:{ all -> 0x03de }
            com.google.protobuf.bv r8 = r6.instance     // Catch:{ all -> 0x03de }
            com.google.ai.b.ve r8 = (com.google.p375ai.p378b.C8091ve) r8     // Catch:{ all -> 0x03de }
            r7.getClass()     // Catch:{ all -> 0x03de }
            int r9 = r8.f28457a     // Catch:{ all -> 0x03de }
            r9 = r9 | 4
            r8.f28457a = r9     // Catch:{ all -> 0x03de }
            r8.f28460d = r7     // Catch:{ all -> 0x03de }
            r5.copyOnWrite()     // Catch:{ all -> 0x03de }
            com.google.protobuf.bv r7 = r5.instance     // Catch:{ all -> 0x03de }
            com.google.ai.b.vl r7 = (com.google.p375ai.p378b.C8098vl) r7     // Catch:{ all -> 0x03de }
            com.google.protobuf.bv r8 = r6.build()     // Catch:{ all -> 0x03de }
            com.google.ai.b.ve r8 = (com.google.p375ai.p378b.C8091ve) r8     // Catch:{ all -> 0x03de }
            r8.getClass()     // Catch:{ all -> 0x03de }
            r7.f28483j = r8     // Catch:{ all -> 0x03de }
            int r8 = r7.f28475b     // Catch:{ all -> 0x03de }
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
            r7.f28475b = r8     // Catch:{ all -> 0x03de }
        L_0x0249:
            com.google.ai.b.uy r7 = r0.f28482i     // Catch:{ all -> 0x03de }
            if (r7 != 0) goto L_0x024f
            com.google.ai.b.uy r7 = com.google.p375ai.p378b.C8084uy.f28441b     // Catch:{ all -> 0x03de }
        L_0x024f:
            com.google.protobuf.cq r7 = r7.f28443a     // Catch:{ all -> 0x03de }
            int r7 = r7.size()     // Catch:{ all -> 0x03de }
            if (r7 == 0) goto L_0x02fc
            int r7 = r4.f28475b     // Catch:{ all -> 0x03de }
            r7 = r7 & 512(0x200, float:7.175E-43)
            if (r7 == 0) goto L_0x02fc
            com.google.ai.b.uy r7 = r4.f28482i     // Catch:{ all -> 0x03de }
            if (r7 != 0) goto L_0x0263
            com.google.ai.b.uy r7 = com.google.p375ai.p378b.C8084uy.f28441b     // Catch:{ all -> 0x03de }
        L_0x0263:
            com.google.protobuf.cq r7 = r7.f28443a     // Catch:{ all -> 0x03de }
            int r7 = r7.size()     // Catch:{ all -> 0x03de }
            if (r7 == 0) goto L_0x02fc
            com.google.ai.b.uy r7 = r4.f28482i     // Catch:{ all -> 0x03de }
            if (r7 != 0) goto L_0x0271
            com.google.ai.b.uy r7 = com.google.p375ai.p378b.C8084uy.f28441b     // Catch:{ all -> 0x03de }
        L_0x0271:
            com.google.protobuf.cq r7 = r7.f28443a     // Catch:{ all -> 0x03de }
            com.google.common.base.ah r8 = com.google.android.apps.gsa.sidekick.main.p7223o.C91555c.f255354a     // Catch:{ all -> 0x03de }
            java.util.Map r7 = com.google.android.apps.gsa.sidekick.main.p7223o.C91555c.m149785a(r7, r8)     // Catch:{ all -> 0x03de }
            com.google.ai.b.uy r8 = r0.f28482i     // Catch:{ all -> 0x03de }
            if (r8 != 0) goto L_0x027f
            com.google.ai.b.uy r8 = com.google.p375ai.p378b.C8084uy.f28441b     // Catch:{ all -> 0x03de }
        L_0x027f:
            com.google.protobuf.cq r8 = r8.f28443a     // Catch:{ all -> 0x03de }
            com.google.common.base.ah r9 = com.google.android.apps.gsa.sidekick.main.p7223o.C91555c.f255354a     // Catch:{ all -> 0x03de }
            java.util.Map r8 = com.google.android.apps.gsa.sidekick.main.p7223o.C91555c.m149785a(r8, r9)     // Catch:{ all -> 0x03de }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x03de }
            r9.<init>()     // Catch:{ all -> 0x03de }
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x03de }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x03de }
        L_0x0294:
            boolean r10 = r8.hasNext()     // Catch:{ all -> 0x03de }
            if (r10 == 0) goto L_0x02bc
            java.lang.Object r10 = r8.next()     // Catch:{ all -> 0x03de }
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ all -> 0x03de }
            java.lang.Object r11 = r10.getValue()     // Catch:{ all -> 0x03de }
            com.google.ai.b.ux r11 = (com.google.p375ai.p378b.C8083ux) r11     // Catch:{ all -> 0x03de }
            java.lang.Object r10 = r10.getKey()     // Catch:{ all -> 0x03de }
            java.lang.Object r10 = r7.get(r10)     // Catch:{ all -> 0x03de }
            com.google.ai.b.ux r10 = (com.google.p375ai.p378b.C8083ux) r10     // Catch:{ all -> 0x03de }
            if (r10 == 0) goto L_0x0294
            boolean r11 = r11.equals(r10)     // Catch:{ all -> 0x03de }
            if (r11 != 0) goto L_0x0294
            r9.add(r10)     // Catch:{ all -> 0x03de }
            goto L_0x0294
        L_0x02bc:
            boolean r7 = r9.isEmpty()     // Catch:{ all -> 0x03de }
            if (r7 != 0) goto L_0x02fc
            com.google.ai.b.uy r7 = com.google.p375ai.p378b.C8084uy.f28441b     // Catch:{ all -> 0x03de }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ all -> 0x03de }
            com.google.ai.b.uv r7 = (com.google.p375ai.p378b.C8081uv) r7     // Catch:{ all -> 0x03de }
            r7.copyOnWrite()     // Catch:{ all -> 0x03de }
            com.google.protobuf.bv r8 = r7.instance     // Catch:{ all -> 0x03de }
            com.google.ai.b.uy r8 = (com.google.p375ai.p378b.C8084uy) r8     // Catch:{ all -> 0x03de }
            com.google.protobuf.cq r10 = r8.f28443a     // Catch:{ all -> 0x03de }
            boolean r11 = r10.mo58948c()     // Catch:{ all -> 0x03de }
            if (r11 != 0) goto L_0x02df
            com.google.protobuf.cq r10 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r10)     // Catch:{ all -> 0x03de }
            r8.f28443a = r10     // Catch:{ all -> 0x03de }
        L_0x02df:
            com.google.protobuf.cq r8 = r8.f28443a     // Catch:{ all -> 0x03de }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r9, (java.util.List) r8)     // Catch:{ all -> 0x03de }
            r5.copyOnWrite()     // Catch:{ all -> 0x03de }
            com.google.protobuf.bv r8 = r5.instance     // Catch:{ all -> 0x03de }
            com.google.ai.b.vl r8 = (com.google.p375ai.p378b.C8098vl) r8     // Catch:{ all -> 0x03de }
            com.google.protobuf.bv r7 = r7.build()     // Catch:{ all -> 0x03de }
            com.google.ai.b.uy r7 = (com.google.p375ai.p378b.C8084uy) r7     // Catch:{ all -> 0x03de }
            r7.getClass()     // Catch:{ all -> 0x03de }
            r8.f28482i = r7     // Catch:{ all -> 0x03de }
            int r7 = r8.f28475b     // Catch:{ all -> 0x03de }
            r7 = r7 | 512(0x200, float:7.175E-43)
            r8.f28475b = r7     // Catch:{ all -> 0x03de }
        L_0x02fc:
            int r7 = r0.f28475b     // Catch:{ all -> 0x03de }
            r7 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r7 == 0) goto L_0x0386
            int r7 = r4.f28475b     // Catch:{ all -> 0x03de }
            r7 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r7 == 0) goto L_0x0386
            com.google.ai.b.ve r4 = r4.f28483j     // Catch:{ all -> 0x03de }
            if (r4 != 0) goto L_0x030e
            com.google.ai.b.ve r4 = com.google.p375ai.p378b.C8091ve.f28455e     // Catch:{ all -> 0x03de }
        L_0x030e:
            com.google.protobuf.cq r4 = r4.f28458b     // Catch:{ all -> 0x03de }
            com.google.common.base.ah r7 = com.google.android.apps.gsa.sidekick.main.p7223o.C91555c.f255355b     // Catch:{ all -> 0x03de }
            java.util.Map r4 = com.google.android.apps.gsa.sidekick.main.p7223o.C91555c.m149785a(r4, r7)     // Catch:{ all -> 0x03de }
            com.google.ai.b.ve r0 = r0.f28483j     // Catch:{ all -> 0x03de }
            if (r0 != 0) goto L_0x031c
            com.google.ai.b.ve r0 = com.google.p375ai.p378b.C8091ve.f28455e     // Catch:{ all -> 0x03de }
        L_0x031c:
            com.google.protobuf.cq r0 = r0.f28458b     // Catch:{ all -> 0x03de }
            com.google.common.base.ah r7 = com.google.android.apps.gsa.sidekick.main.p7223o.C91555c.f255355b     // Catch:{ all -> 0x03de }
            java.util.Map r0 = com.google.android.apps.gsa.sidekick.main.p7223o.C91555c.m149785a(r0, r7)     // Catch:{ all -> 0x03de }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x03de }
            r7.<init>()     // Catch:{ all -> 0x03de }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x03de }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x03de }
        L_0x0331:
            boolean r8 = r0.hasNext()     // Catch:{ all -> 0x03de }
            if (r8 == 0) goto L_0x0359
            java.lang.Object r8 = r0.next()     // Catch:{ all -> 0x03de }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ all -> 0x03de }
            java.lang.Object r9 = r8.getValue()     // Catch:{ all -> 0x03de }
            com.google.ai.b.vd r9 = (com.google.p375ai.p378b.C8090vd) r9     // Catch:{ all -> 0x03de }
            java.lang.Object r8 = r8.getKey()     // Catch:{ all -> 0x03de }
            java.lang.Object r8 = r4.get(r8)     // Catch:{ all -> 0x03de }
            com.google.ai.b.vd r8 = (com.google.p375ai.p378b.C8090vd) r8     // Catch:{ all -> 0x03de }
            if (r8 == 0) goto L_0x0331
            boolean r9 = r9.equals(r8)     // Catch:{ all -> 0x03de }
            if (r9 != 0) goto L_0x0331
            r7.add(r8)     // Catch:{ all -> 0x03de }
            goto L_0x0331
        L_0x0359:
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x03de }
            if (r0 != 0) goto L_0x0386
            r6.copyOnWrite()     // Catch:{ all -> 0x03de }
            com.google.protobuf.bv r0 = r6.instance     // Catch:{ all -> 0x03de }
            com.google.ai.b.ve r0 = (com.google.p375ai.p378b.C8091ve) r0     // Catch:{ all -> 0x03de }
            r0.mo17011a()     // Catch:{ all -> 0x03de }
            com.google.protobuf.cq r0 = r0.f28458b     // Catch:{ all -> 0x03de }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r7, (java.util.List) r0)     // Catch:{ all -> 0x03de }
            r5.copyOnWrite()     // Catch:{ all -> 0x03de }
            com.google.protobuf.bv r0 = r5.instance     // Catch:{ all -> 0x03de }
            com.google.ai.b.vl r0 = (com.google.p375ai.p378b.C8098vl) r0     // Catch:{ all -> 0x03de }
            com.google.protobuf.bv r4 = r6.build()     // Catch:{ all -> 0x03de }
            com.google.ai.b.ve r4 = (com.google.p375ai.p378b.C8091ve) r4     // Catch:{ all -> 0x03de }
            r4.getClass()     // Catch:{ all -> 0x03de }
            r0.f28483j = r4     // Catch:{ all -> 0x03de }
            int r4 = r0.f28475b     // Catch:{ all -> 0x03de }
            r4 = r4 | 16384(0x4000, float:2.2959E-41)
            r0.f28475b = r4     // Catch:{ all -> 0x03de }
        L_0x0386:
            com.google.ai.b.ur r0 = com.google.p375ai.p378b.C8077ur.f28431c     // Catch:{ all -> 0x03de }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ all -> 0x03de }
            com.google.ai.b.uq r0 = (com.google.p375ai.p378b.C8076uq) r0     // Catch:{ all -> 0x03de }
            com.google.ai.b.vl r4 = com.google.p375ai.p378b.C8098vl.f28472k     // Catch:{ all -> 0x03de }
            com.google.protobuf.bv r6 = r5.build()     // Catch:{ all -> 0x03de }
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x03de }
            if (r4 != 0) goto L_0x03b2
            r0.copyOnWrite()     // Catch:{ all -> 0x03de }
            com.google.protobuf.bv r4 = r0.instance     // Catch:{ all -> 0x03de }
            com.google.ai.b.ur r4 = (com.google.p375ai.p378b.C8077ur) r4     // Catch:{ all -> 0x03de }
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ all -> 0x03de }
            com.google.ai.b.vl r5 = (com.google.p375ai.p378b.C8098vl) r5     // Catch:{ all -> 0x03de }
            r5.getClass()     // Catch:{ all -> 0x03de }
            r4.f28434b = r5     // Catch:{ all -> 0x03de }
            int r5 = r4.f28433a     // Catch:{ all -> 0x03de }
            r6 = 1
            r5 = r5 | r6
            r4.f28433a = r5     // Catch:{ all -> 0x03de }
        L_0x03b2:
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x03de }
            com.google.ai.b.ur r0 = (com.google.p375ai.p378b.C8077ur) r0     // Catch:{ all -> 0x03de }
            goto L_0x03ba
        L_0x03b9:
            r0 = r2
        L_0x03ba:
            monitor-exit(r1)     // Catch:{ all -> 0x03de }
            monitor-exit(r3)     // Catch:{ all -> 0x0413 }
            if (r0 != 0) goto L_0x03bf
            goto L_0x03e2
        L_0x03bf:
            com.google.ai.b.wt r1 = com.google.p375ai.p378b.C8133wt.f28602c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.ai.b.ws r1 = (com.google.p375ai.p378b.C8132ws) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.ai.b.wt r2 = (com.google.p375ai.p378b.C8133wt) r2
            r2.f28605b = r0
            int r0 = r2.f28604a
            r3 = 1
            r0 = r0 | r3
            r2.f28604a = r0
            com.google.protobuf.bv r0 = r1.build()
            r2 = r0
            com.google.ai.b.wt r2 = (com.google.p375ai.p378b.C8133wt) r2
            goto L_0x03e2
        L_0x03de:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x03de }
            throw r0     // Catch:{ all -> 0x0413 }
        L_0x03e1:
            monitor-exit(r3)     // Catch:{ all -> 0x0413 }
        L_0x03e2:
            if (r2 == 0) goto L_0x0412
            com.google.ai.b.ur r0 = r2.f28605b
            if (r0 != 0) goto L_0x03ea
            com.google.ai.b.ur r0 = com.google.p375ai.p378b.C8077ur.f28431c
        L_0x03ea:
            com.google.ai.b.ur r1 = com.google.p375ai.p378b.C8077ur.f28431c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0412
            com.google.common.f.e r0 = f255527a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "maybeUpdateStateChanges : updating State Changes"
            r3 = 11783(0x2e07, float:1.6511E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r1)
            r18.copyOnWrite()
            r0 = r18
            com.google.protobuf.bv r0 = r0.instance
            com.google.ai.b.qa r0 = (com.google.p375ai.p378b.C7952qa) r0
            com.google.ai.b.qa r1 = com.google.p375ai.p378b.C7952qa.f27916z
            r0.f27927h = r2
            int r1 = r0.f27920a
            r1 = r1 | 128(0x80, float:1.794E-43)
            r0.f27920a = r1
        L_0x0412:
            return
        L_0x0413:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0413 }
            goto L_0x0417
        L_0x0416:
            throw r0
        L_0x0417:
            goto L_0x0416
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.sidekick.main.p7227s.C91611a.m149877a(com.google.android.apps.gsa.search.core.preferences.j, java.lang.String, com.google.ai.b.pz):void");
    }
}
