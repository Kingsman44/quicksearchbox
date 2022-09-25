package com.google.android.libraries.p10923ac.p10925b.p10934e;

import android.accounts.Account;
import com.google.android.apps.gsa.staticplugins.p7611bv.p7612a.C97255k;
import com.google.android.libraries.p10923ac.p10925b.p10942i.C147078aw;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147112i;
import com.google.android.libraries.p10923ac.p10925b.p10943j.C147116m;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a;
import com.google.common.base.C58885cv;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import com.google.protos.p4895aw.p4902b.C63971ah;
import com.google.protos.p4895aw.p4902b.C63999bi;
import com.google.protos.p4895aw.p4902b.C64000bj;
import com.google.protos.p4895aw.p4902b.C64001bk;
import com.google.protos.p4895aw.p4902b.C64002bl;
import com.google.protos.p4895aw.p4902b.C64010bt;
import com.google.protos.p4895aw.p4902b.C64011bu;
import com.google.protos.p4895aw.p4902b.C64012bv;
import com.google.protos.p4895aw.p4902b.C64027cj;
import com.google.protos.p4895aw.p4902b.C64028ck;
import com.google.protos.p4895aw.p4902b.C64029cl;
import com.google.protos.p4895aw.p4902b.C64031cn;
import com.google.protos.p4895aw.p4902b.C64042cy;
import com.google.protos.p4895aw.p4902b.C64043cz;
import com.google.protos.p4895aw.p4902b.C64057dm;
import com.google.protos.p4895aw.p4902b.C64095m;
import com.google.protos.p4895aw.p4902b.C64098p;
import com.google.protos.p4895aw.p4902b.C64107y;
import com.google.protos.p4895aw.p4902b.C64108z;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.ac.b.e.br */
/* compiled from: PG */
final class C146915br {
    /* renamed from: a */
    public static C64002bl m239472a(Account account, C64098p pVar, C64057dm dmVar, C147116m mVar, boolean z, C147266a aVar) {
        C64010bt btVar;
        C63999bi biVar = (C63999bi) C64002bl.f173078f.createBuilder();
        biVar.copyOnWrite();
        C64002bl blVar = (C64002bl) biVar.instance;
        pVar.getClass();
        blVar.f173081b = pVar;
        blVar.f173080a |= 1;
        biVar.copyOnWrite();
        C64002bl blVar2 = (C64002bl) biVar.instance;
        dmVar.getClass();
        blVar2.f173083d = dmVar;
        blVar2.f173080a |= 4;
        if (z) {
            C64000bj bjVar = (C64000bj) C64001bk.f173074c.createBuilder();
            bjVar.copyOnWrite();
            C64001bk bkVar = (C64001bk) bjVar.instance;
            bkVar.f173076a |= 1;
            bkVar.f173077b = true;
            biVar.copyOnWrite();
            C64002bl blVar3 = (C64002bl) biVar.instance;
            C64001bk bkVar2 = (C64001bk) bjVar.build();
            bkVar2.getClass();
            blVar3.f173084e = bkVar2;
            blVar3.f173080a |= 8;
        }
        C97255k kVar = aVar.f397502a;
        if (((Boolean) ((C58885cv) C97255k.m160960a()).f156729a).booleanValue()) {
            C64107y yVar = (C64107y) C64108z.f173317c.createBuilder();
            ArrayList arrayList = new ArrayList();
            for (C147112i e : mVar.mo123935c(account, pVar)) {
                C64095m e2 = e.mo123926e();
                if (e2 != null && e2.f173285a == 1) {
                    C64027cj cjVar = (C64027cj) C64028ck.f173133b.createBuilder();
                    if (e2.f173285a == 1) {
                        btVar = (C64010bt) e2.f173286b;
                    } else {
                        btVar = C64010bt.f173097b;
                    }
                    for (C64043cz czVar : btVar.f173099a) {
                        C64029cl clVar = (C64029cl) C64031cn.f173137d.createBuilder();
                        int a = C64042cy.m96339a(czVar.f173166c);
                        if (a == 0) {
                            a = 1;
                        }
                        int i = a - 1;
                        if (i == 0) {
                            clVar.copyOnWrite();
                            C64031cn cnVar = (C64031cn) clVar.instance;
                            cnVar.f173141c = 0;
                            cnVar.f173139a |= 2;
                        } else if (i != 1) {
                            clVar.copyOnWrite();
                            C64031cn cnVar2 = (C64031cn) clVar.instance;
                            cnVar2.f173141c = 2;
                            cnVar2.f173139a |= 2;
                        } else {
                            clVar.copyOnWrite();
                            C64031cn cnVar3 = (C64031cn) clVar.instance;
                            cnVar3.f173141c = 1;
                            cnVar3.f173139a |= 2;
                        }
                        if ((czVar.f173164a & 1) != 0) {
                            C63088z zVar = czVar.f173165b;
                            clVar.copyOnWrite();
                            C64031cn cnVar4 = (C64031cn) clVar.instance;
                            zVar.getClass();
                            cnVar4.f173139a |= 1;
                            cnVar4.f173140b = zVar;
                        }
                        C64031cn cnVar5 = (C64031cn) clVar.build();
                        cjVar.copyOnWrite();
                        C64028ck ckVar = (C64028ck) cjVar.instance;
                        cnVar5.getClass();
                        ckVar.mo59250a();
                        ckVar.f173135a.add(cnVar5);
                    }
                    arrayList.add((C64028ck) cjVar.build());
                }
            }
            C64011bu buVar = (C64011bu) C64012bv.f173100b.createBuilder();
            buVar.copyOnWrite();
            C64012bv bvVar = (C64012bv) buVar.instance;
            C62971cq cqVar = bvVar.f173102a;
            if (!cqVar.mo58948c()) {
                bvVar.f173102a = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) arrayList, (List) bvVar.f173102a);
            C64012bv bvVar2 = (C64012bv) buVar.build();
            yVar.copyOnWrite();
            C64108z zVar2 = (C64108z) yVar.instance;
            bvVar2.getClass();
            zVar2.f173320b = bvVar2;
            zVar2.f173319a = 3;
            C64108z zVar3 = (C64108z) yVar.build();
            biVar.copyOnWrite();
            C64002bl blVar4 = (C64002bl) biVar.instance;
            zVar3.getClass();
            blVar4.f173082c = zVar3;
            blVar4.f173080a |= 2;
        }
        return (C64002bl) biVar.build();
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x024b A[SYNTHETIC, Splitter:B:122:0x024b] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m239473b(dagger.C68214a r25, com.google.protos.p4895aw.p4902b.C64098p r26, com.google.protos.p4895aw.p4902b.C64006bp r27, com.google.android.libraries.p10923ac.p10925b.p10934e.C146856az r28, java.lang.Long r29, java.lang.Long r30, java.lang.Integer r31, com.google.android.libraries.p10923ac.p10925b.p10945l.C147177k r32) {
        /*
            r0 = r26
            r1 = r27
            r2 = r28
            r12 = r32
            com.google.protobuf.cq r13 = r1.f173088a
            int r3 = r27.getSerializedSize()
            long r14 = (long) r3
            com.google.android.libraries.ac.b.i.ar r3 = r28.mo123790m()
            com.google.android.libraries.ac.b.i.aw r10 = r3.mo123904b()
            r8 = 1
            com.google.android.libraries.ac.b.i.m r3 = r28.mo123781d()     // Catch:{ all -> 0x0242 }
            boolean r3 = r3.mo123909b(r10)     // Catch:{ all -> 0x0242 }
            if (r3 == 0) goto L_0x0232
            java.util.Iterator r3 = r13.iterator()     // Catch:{ all -> 0x0242 }
            r5 = r14
        L_0x0027:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0242 }
            r7 = 2
            if (r4 == 0) goto L_0x01ab
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x01a2 }
            com.google.protos.aw.b.g r4 = (com.google.protos.p4895aw.p4902b.C64089g) r4     // Catch:{ all -> 0x01a2 }
            int r11 = r4.f173269d     // Catch:{ all -> 0x019e }
            int r17 = com.google.protos.p4895aw.p4902b.C64088f.m96350a(r11)     // Catch:{ all -> 0x019e }
            if (r17 != 0) goto L_0x003e
            r17 = 1
        L_0x003e:
            int r9 = r17 + -1
            if (r9 == r8) goto L_0x0190
            r8 = 4
            if (r9 == r7) goto L_0x017c
            r7 = 3
            if (r9 == r7) goto L_0x015d
            if (r9 == r8) goto L_0x0098
            r1 = 5
            if (r9 == r1) goto L_0x007d
            com.google.android.libraries.ac.b.k.h r1 = new com.google.android.libraries.ac.b.k.h     // Catch:{ all -> 0x01a2 }
            int r2 = com.google.protos.p4895aw.p4902b.C64088f.m96350a(r11)     // Catch:{ all -> 0x01a2 }
            if (r2 != 0) goto L_0x0056
            r2 = 1
        L_0x0056:
            int r2 = r2 + -1
            java.lang.String r2 = java.lang.Integer.toString(r2)     // Catch:{ all -> 0x01a2 }
            java.lang.String r0 = java.lang.String.valueOf(r26)     // Catch:{ all -> 0x01a2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a2 }
            r3.<init>()     // Catch:{ all -> 0x01a2 }
            java.lang.String r4 = "Got unknown change type "
            r3.append(r4)     // Catch:{ all -> 0x01a2 }
            r3.append(r2)     // Catch:{ all -> 0x01a2 }
            java.lang.String r2 = " while syncing channel "
            r3.append(r2)     // Catch:{ all -> 0x01a2 }
            r3.append(r0)     // Catch:{ all -> 0x01a2 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x01a2 }
            r1.<init>(r0)     // Catch:{ all -> 0x01a2 }
            throw r1     // Catch:{ all -> 0x01a2 }
        L_0x007d:
            com.google.android.libraries.ac.b.k.h r1 = new com.google.android.libraries.ac.b.k.h     // Catch:{ all -> 0x01a2 }
            java.lang.String r0 = java.lang.String.valueOf(r26)     // Catch:{ all -> 0x01a2 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a2 }
            r2.<init>()     // Catch:{ all -> 0x01a2 }
            java.lang.String r3 = "Unsupported change type DELETE_RANGE while syncing channel "
            r2.append(r3)     // Catch:{ all -> 0x01a2 }
            r2.append(r0)     // Catch:{ all -> 0x01a2 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01a2 }
            r1.<init>(r0)     // Catch:{ all -> 0x01a2 }
            throw r1     // Catch:{ all -> 0x01a2 }
        L_0x0098:
            int r7 = r4.f173267b     // Catch:{ all -> 0x0157 }
            r9 = 6
            if (r7 != r9) goto L_0x0131
            java.lang.Object r0 = r4.f173268c     // Catch:{ all -> 0x0157 }
            r1 = r0
            com.google.protos.aw.b.aj r1 = (com.google.protos.p4895aw.p4902b.C63973aj) r1     // Catch:{ all -> 0x0157 }
            com.google.protobuf.z r0 = r1.f173013b     // Catch:{ all -> 0x0157 }
            com.google.android.libraries.ac.b.c.b.k r3 = com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146815l.m239247b()     // Catch:{ all -> 0x0157 }
            byte[] r4 = r0.mo59174N()     // Catch:{ all -> 0x0157 }
            r5 = 1
            r3.mo123709c(r4, r5)     // Catch:{ all -> 0x0129 }
            com.google.android.libraries.ac.b.c.b.l r3 = r3.mo123677a()     // Catch:{ all -> 0x0129 }
            r4 = 0
            java.util.List r2 = r2.mo123784g(r10, r3, r4)     // Catch:{ all -> 0x0129 }
            int r3 = r2.size()     // Catch:{ all -> 0x0129 }
            if (r3 == r5) goto L_0x00db
            java.lang.Object r1 = r25.mo27525b()     // Catch:{ all -> 0x00d9 }
            com.google.android.libraries.ac.d.b.b.d.m r1 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r1     // Catch:{ all -> 0x00d9 }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x00d9 }
            java.lang.String r0 = com.google.android.libraries.p10923ac.p10925b.p10934e.C146854ax.m239337g(r0)     // Catch:{ all -> 0x01a2 }
            r3 = 0
            r2[r3] = r0     // Catch:{ all -> 0x01a2 }
            java.lang.String r0 = "Attempted to apply delta on footprint with secondary id '%s', but no such footprint exists on local storage!"
            r1.mo124066i(r0, r2)     // Catch:{ all -> 0x01a2 }
            com.google.android.libraries.ac.b.k.c r0 = new com.google.android.libraries.ac.b.k.c     // Catch:{ all -> 0x01a2 }
            r0.<init>()     // Catch:{ all -> 0x01a2 }
            throw r0     // Catch:{ all -> 0x01a2 }
        L_0x00d9:
            r0 = move-exception
            goto L_0x012c
        L_0x00db:
            r3 = 0
            java.lang.Object r0 = r2.get(r3)     // Catch:{ all -> 0x0127 }
            com.google.android.libraries.ac.b.c.b.m r0 = (com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146816m) r0     // Catch:{ all -> 0x0157 }
            byte[] r2 = r0.mo123684b()     // Catch:{ all -> 0x0157 }
            com.google.protobuf.z r0 = r1.f173014c     // Catch:{ all -> 0x0157 }
            r0.mo59174N()     // Catch:{ all -> 0x0157 }
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ d -> 0x00f3 }
            java.lang.String r3 = "UnsupportedVcDiffService doesn't support decoding!"
            r0.<init>(r3)     // Catch:{ d -> 0x00f3 }
            throw r0     // Catch:{ d -> 0x00f3 }
        L_0x00f3:
            r0 = move-exception
            java.lang.Object r3 = r25.mo27525b()     // Catch:{ all -> 0x0157 }
            com.google.android.libraries.ac.d.b.b.d.m r3 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r3     // Catch:{ all -> 0x0157 }
            r11 = 3
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ all -> 0x0157 }
            com.google.protobuf.z r5 = r1.f173013b     // Catch:{ all -> 0x0157 }
            java.lang.String r5 = com.google.android.libraries.p10923ac.p10925b.p10934e.C146854ax.m239337g(r5)     // Catch:{ all -> 0x0157 }
            r16 = 0
            r4[r16] = r5     // Catch:{ all -> 0x0127 }
            com.google.protobuf.z r2 = com.google.protobuf.C63088z.m96139A(r2)     // Catch:{ all -> 0x0127 }
            java.lang.String r2 = com.google.android.libraries.p10923ac.p10925b.p10934e.C146854ax.m239337g(r2)     // Catch:{ all -> 0x0127 }
            r17 = 1
            r4[r17] = r2     // Catch:{ all -> 0x01a2 }
            com.google.protobuf.z r1 = r1.f173014c     // Catch:{ all -> 0x01a2 }
            java.lang.String r1 = com.google.android.libraries.p10923ac.p10925b.p10934e.C146854ax.m239337g(r1)     // Catch:{ all -> 0x01a2 }
            r7 = 2
            r4[r7] = r1     // Catch:{ all -> 0x01a2 }
            java.lang.String r1 = "Decoding failed when trying to apply delta '%s' on footprint with secondary id '%s' and data '%s'!"
            r3.mo124062e(r1, r0, r4)     // Catch:{ all -> 0x01a2 }
            com.google.android.libraries.ac.b.k.c r1 = new com.google.android.libraries.ac.b.k.c     // Catch:{ all -> 0x01a2 }
            r1.<init>(r0)     // Catch:{ all -> 0x01a2 }
            throw r1     // Catch:{ all -> 0x01a2 }
        L_0x0127:
            r0 = move-exception
            goto L_0x015a
        L_0x0129:
            r0 = move-exception
            r16 = 0
        L_0x012c:
            r1 = r0
            r16 = r10
            goto L_0x01a7
        L_0x0131:
            r11 = 3
            r16 = 0
            r17 = 1
            if (r7 != r8) goto L_0x013d
            java.lang.Object r7 = r4.f173268c     // Catch:{ all -> 0x01a2 }
            com.google.protos.aw.b.ah r7 = (com.google.protos.p4895aw.p4902b.C63971ah) r7     // Catch:{ all -> 0x01a2 }
            goto L_0x013f
        L_0x013d:
            com.google.protos.aw.b.ah r7 = com.google.protos.p4895aw.p4902b.C63971ah.f173003f     // Catch:{ all -> 0x01a2 }
        L_0x013f:
            m239474c(r2, r10, r7)     // Catch:{ all -> 0x01a2 }
            int r8 = r4.f173267b     // Catch:{ all -> 0x01a2 }
            if (r8 != r9) goto L_0x019b
            java.lang.Object r4 = r4.f173268c     // Catch:{ all -> 0x01a2 }
            com.google.protos.aw.b.aj r4 = (com.google.protos.p4895aw.p4902b.C63973aj) r4     // Catch:{ all -> 0x01a2 }
            int r4 = r4.getSerializedSize()     // Catch:{ all -> 0x01a2 }
            long r8 = (long) r4     // Catch:{ all -> 0x01a2 }
            long r5 = r5 - r8
            int r4 = r7.getSerializedSize()     // Catch:{ all -> 0x01a2 }
            long r7 = (long) r4     // Catch:{ all -> 0x01a2 }
            long r5 = r5 + r7
            goto L_0x019b
        L_0x0157:
            r0 = move-exception
            r16 = 0
        L_0x015a:
            r17 = 1
            goto L_0x01a3
        L_0x015d:
            r16 = 0
            r17 = 1
            com.google.android.libraries.ac.b.k.h r1 = new com.google.android.libraries.ac.b.k.h     // Catch:{ all -> 0x01a2 }
            java.lang.String r0 = java.lang.String.valueOf(r26)     // Catch:{ all -> 0x01a2 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a2 }
            r2.<init>()     // Catch:{ all -> 0x01a2 }
            java.lang.String r3 = "Unsupported change type DELETE while syncing channel "
            r2.append(r3)     // Catch:{ all -> 0x01a2 }
            r2.append(r0)     // Catch:{ all -> 0x01a2 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01a2 }
            r1.<init>(r0)     // Catch:{ all -> 0x01a2 }
            throw r1     // Catch:{ all -> 0x01a2 }
        L_0x017c:
            r11 = 3
            r16 = 0
            r17 = 1
            int r7 = r4.f173267b     // Catch:{ all -> 0x01a2 }
            if (r7 != r8) goto L_0x018a
            java.lang.Object r4 = r4.f173268c     // Catch:{ all -> 0x01a2 }
            com.google.protos.aw.b.ah r4 = (com.google.protos.p4895aw.p4902b.C63971ah) r4     // Catch:{ all -> 0x01a2 }
            goto L_0x018c
        L_0x018a:
            com.google.protos.aw.b.ah r4 = com.google.protos.p4895aw.p4902b.C63971ah.f173003f     // Catch:{ all -> 0x01a2 }
        L_0x018c:
            m239474c(r2, r10, r4)     // Catch:{ all -> 0x01a2 }
            goto L_0x019b
        L_0x0190:
            r11 = 3
            r16 = 0
            r17 = 1
            r2.mo123785h(r10)     // Catch:{ all -> 0x01a2 }
            r32.mo123999c()     // Catch:{ all -> 0x01a2 }
        L_0x019b:
            r8 = 1
            goto L_0x0027
        L_0x019e:
            r0 = move-exception
            r16 = 0
            goto L_0x01a3
        L_0x01a2:
            r0 = move-exception
        L_0x01a3:
            r1 = r0
            r16 = r10
            r5 = 1
        L_0x01a7:
            r17 = 0
            goto L_0x0249
        L_0x01ab:
            r11 = 3
            r16 = 0
            r17 = 1
            com.google.protos.aw.b.dm r3 = r1.f173089b     // Catch:{ all -> 0x0242 }
            if (r3 != 0) goto L_0x01b6
            com.google.protos.aw.b.dm r3 = com.google.protos.p4895aw.p4902b.C64057dm.f173196c     // Catch:{ all -> 0x01a2 }
        L_0x01b6:
            r2.mo123787j(r10, r3)     // Catch:{ all -> 0x0242 }
            com.google.android.libraries.ac.b.c.b.l r4 = com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146815l.f396376b     // Catch:{ all -> 0x0242 }
            long r8 = r29.longValue()     // Catch:{ all -> 0x0242 }
            int r18 = r31.intValue()     // Catch:{ all -> 0x0242 }
            long r19 = r30.longValue()     // Catch:{ all -> 0x0242 }
            long r11 = r1.f173091d     // Catch:{ all -> 0x0242 }
            r2 = r28
            r3 = r10
            r21 = r5
            r5 = r8
            r8 = 2
            r7 = r18
            r23 = r14
            r14 = 2
            r15 = 3
            r8 = r19
            r16 = r10
            r17 = 0
            r10 = r11
            r2.mo123786i(r3, r4, r5, r7, r8, r10)     // Catch:{ all -> 0x022f }
            r16.mo123901j()     // Catch:{ all -> 0x022f }
            if (r16 == 0) goto L_0x01e8
            r16.close()
        L_0x01e8:
            int r2 = r0.f173294a
            if (r2 != r14) goto L_0x01f1
            java.lang.Object r0 = r0.f173295b
            com.google.protos.aw.b.ap r0 = (com.google.protos.p4895aw.p4902b.C63979ap) r0
            goto L_0x01f3
        L_0x01f1:
            com.google.protos.aw.b.ap r0 = com.google.protos.p4895aw.p4902b.C63979ap.f173026e
        L_0x01f3:
            java.lang.Object r2 = r25.mo27525b()
            com.google.android.libraries.ac.d.b.b.d.m r2 = (com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m) r2
            java.lang.Object[] r3 = new java.lang.Object[r15]
            int r4 = r13.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r17] = r4
            int r4 = r0.f173029b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 1
            r3[r5] = r4
            int r0 = r0.f173030c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r14] = r0
            java.lang.String r0 = "Downloaded %d changes to the local %s/%s InternalFootprintsLatestOnlySyncVariant."
            r2.mo124065h(r0, r3)
            com.google.protobuf.cq r0 = r1.f173088a
            int r0 = r0.size()
            long r0 = (long) r0
            r2 = r32
            r2.mo124001e(r0)
            r14 = r21
            r0 = r23
            r2.mo124002f(r0, r14)
            return
        L_0x022f:
            r0 = move-exception
            r5 = 1
            goto L_0x0248
        L_0x0232:
            r16 = r10
            r5 = 1
            r15 = 3
            r17 = 0
            com.google.android.libraries.ac.b.k.ai r0 = new com.google.android.libraries.ac.b.k.ai     // Catch:{ all -> 0x0240 }
            java.lang.String r1 = "GetChanges aborted due to pending local changes"
            r0.<init>((java.lang.String) r1, (int) r15)     // Catch:{ all -> 0x0240 }
            throw r0     // Catch:{ all -> 0x0240 }
        L_0x0240:
            r0 = move-exception
            goto L_0x0248
        L_0x0242:
            r0 = move-exception
            r16 = r10
            r5 = 1
            r17 = 0
        L_0x0248:
            r1 = r0
        L_0x0249:
            if (r16 == 0) goto L_0x0266
            r16.close()     // Catch:{ all -> 0x024f }
            goto L_0x0266
        L_0x024f:
            r0 = move-exception
            r2 = r0
            java.lang.Class[] r0 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0266 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r0[r17] = r3     // Catch:{ Exception -> 0x0266 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            java.lang.String r4 = "addSuppressed"
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r4, r0)     // Catch:{ Exception -> 0x0266 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0266 }
            r3[r17] = r2     // Catch:{ Exception -> 0x0266 }
            r0.invoke(r1, r3)     // Catch:{ Exception -> 0x0266 }
        L_0x0266:
            goto L_0x0268
        L_0x0267:
            throw r1
        L_0x0268:
            goto L_0x0267
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10923ac.p10925b.p10934e.C146915br.m239473b(dagger.a, com.google.protos.aw.b.p, com.google.protos.aw.b.bp, com.google.android.libraries.ac.b.e.az, java.lang.Long, java.lang.Long, java.lang.Integer, com.google.android.libraries.ac.b.l.k):void");
    }

    /* renamed from: c */
    private static void m239474c(C146856az azVar, C147078aw awVar, C63971ah ahVar) {
        azVar.mo123789l(awVar, azVar.mo123782e(ahVar.f173007c), ahVar.f173008d, ahVar.f173006b);
    }
}
