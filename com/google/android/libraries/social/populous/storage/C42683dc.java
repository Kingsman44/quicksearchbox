package com.google.android.libraries.social.populous.storage;

import android.util.Log;
import com.google.android.libraries.social.populous.p3296e.p3301e.C42518g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58526ih;
import com.google.p4181bi.C55794ad;
import com.google.p4181bi.C55810at;
import com.google.p4181bi.C55815ay;
import com.google.p4181bi.C55817b;
import com.google.p4181bi.C55828ba;
import com.google.p4181bi.C55846h;
import com.google.p4181bi.C55847i;
import com.google.p4181bi.C55858t;
import com.google.p4181bi.C55864z;
import com.google.p4420by.p4425c.p4426a.p4427a.C57872b;
import com.google.p4420by.p4425c.p4426a.p4427a.C57873c;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.social.populous.storage.dc */
/* compiled from: PG */
public final class C42683dc implements C42682db {

    /* renamed from: a */
    private final C42518g f111900a;

    public C42683dc(C42518g gVar) {
        this.f111900a = gVar;
    }

    /* renamed from: c */
    private static void m75380c(List list, long j, double d, C42675cv cvVar, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            list.add(new C42681da(j, ((C57872b) it.next()).f154597c, d, cvVar));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m75381d(java.util.List r18, long r19, com.google.p4181bi.C55815ay r21, com.google.android.libraries.social.populous.storage.C42675cv r22, java.lang.Double r23) {
        /*
            r17 = this;
            r0 = r21
            com.google.protobuf.cq r0 = r0.f147279c
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0155
            java.lang.Object r1 = r0.next()
            com.google.bi.r r1 = (com.google.p4181bi.C55856r) r1
            if (r23 == 0) goto L_0x001b
            double r2 = r23.doubleValue()
            goto L_0x0029
        L_0x001b:
            com.google.bi.t r2 = r1.f147385d
            if (r2 != 0) goto L_0x0021
            com.google.bi.t r2 = com.google.p4181bi.C55858t.f147392f
        L_0x0021:
            com.google.bi.b r2 = r2.f147397d
            if (r2 != 0) goto L_0x0027
            com.google.bi.b r2 = com.google.p4181bi.C55817b.f147283d
        L_0x0027:
            double r2 = r2.f147287c
        L_0x0029:
            r12 = 4
            r13 = 1
            r14 = 0
            r15 = 2
            if (r22 == 0) goto L_0x0032
            r16 = r22
            goto L_0x0072
        L_0x0032:
            int r4 = r1.f147383b
            int r5 = com.google.p4181bi.C55855q.m87794a(r4)
            int r6 = r5 + -1
            if (r5 == 0) goto L_0x0153
            if (r6 == 0) goto L_0x006e
            if (r6 == r13) goto L_0x006b
            if (r6 == r15) goto L_0x0045
            r16 = r14
            goto L_0x0072
        L_0x0045:
            if (r4 != r12) goto L_0x004c
            java.lang.Object r4 = r1.f147384c
            com.google.bi.ag r4 = (com.google.p4181bi.C55797ag) r4
            goto L_0x004e
        L_0x004c:
            com.google.bi.ag r4 = com.google.p4181bi.C55797ag.f147232e
        L_0x004e:
            int r4 = r4.f147235b
            int r4 = com.google.p4181bi.C55796af.m87735a(r4)
            int r5 = r4 + -1
            if (r4 == 0) goto L_0x006a
            if (r5 == 0) goto L_0x0067
            if (r5 == r13) goto L_0x0064
            if (r5 == r15) goto L_0x0061
            com.google.android.libraries.social.populous.storage.cv r4 = com.google.android.libraries.social.populous.storage.C42675cv.IN_APP_NOTIFICATION_TARGET
            goto L_0x0070
        L_0x0061:
            com.google.android.libraries.social.populous.storage.cv r4 = com.google.android.libraries.social.populous.storage.C42675cv.IN_APP_GAIA
            goto L_0x0070
        L_0x0064:
            com.google.android.libraries.social.populous.storage.cv r4 = com.google.android.libraries.social.populous.storage.C42675cv.IN_APP_PHONE
            goto L_0x0070
        L_0x0067:
            com.google.android.libraries.social.populous.storage.cv r4 = com.google.android.libraries.social.populous.storage.C42675cv.IN_APP_EMAIL
            goto L_0x0070
        L_0x006a:
            throw r14
        L_0x006b:
            com.google.android.libraries.social.populous.storage.cv r4 = com.google.android.libraries.social.populous.storage.C42675cv.PHONE
            goto L_0x0070
        L_0x006e:
            com.google.android.libraries.social.populous.storage.cv r4 = com.google.android.libraries.social.populous.storage.C42675cv.EMAIL
        L_0x0070:
            r16 = r4
        L_0x0072:
            com.google.bi.t r4 = r1.f147385d
            if (r4 != 0) goto L_0x0078
            com.google.bi.t r4 = com.google.p4181bi.C55858t.f147392f
        L_0x0078:
            com.google.bi.at r4 = r4.f147396c
            if (r4 != 0) goto L_0x007e
            com.google.bi.at r4 = com.google.p4181bi.C55810at.f147265f
        L_0x007e:
            r7 = r4
            r4 = r18
            r5 = r19
            r8 = r2
            r10 = r16
            m75384g(r4, r5, r7, r8, r10)
            int r4 = r1.f147383b
            if (r4 != r15) goto L_0x009c
            java.lang.Object r4 = r1.f147384c
            r7 = r4
            com.google.bi.z r7 = (com.google.p4181bi.C55864z) r7
            r4 = r18
            r5 = r19
            r8 = r2
            r10 = r16
            m75383f(r4, r5, r7, r8, r10)
        L_0x009c:
            int r4 = r1.f147383b
            r11 = 3
            if (r4 != r11) goto L_0x00b4
            java.lang.Object r4 = r1.f147384c
            r8 = r4
            com.google.bi.ba r8 = (com.google.p4181bi.C55828ba) r8
            r4 = r17
            r5 = r18
            r6 = r19
            r9 = r2
            r14 = 3
            r11 = r16
            r4.m75382e(r5, r6, r8, r9, r11)
            goto L_0x00b5
        L_0x00b4:
            r14 = 3
        L_0x00b5:
            int r4 = r1.f147383b
            if (r4 != r12) goto L_0x0008
            java.lang.Object r4 = r1.f147384c
            com.google.bi.ag r4 = (com.google.p4181bi.C55797ag) r4
            int r4 = r4.f147235b
            int r4 = com.google.p4181bi.C55796af.m87735a(r4)
            int r5 = r4 + -1
            if (r4 == 0) goto L_0x0151
            java.lang.String r4 = ""
            if (r5 == 0) goto L_0x0111
            if (r5 == r13) goto L_0x00cf
            goto L_0x0008
        L_0x00cf:
            com.google.bi.ba r5 = com.google.p4181bi.C55828ba.f147322d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.bi.az r5 = (com.google.p4181bi.C55816az) r5
            int r6 = r1.f147383b
            if (r6 != r12) goto L_0x00e0
            java.lang.Object r1 = r1.f147384c
            com.google.bi.ag r1 = (com.google.p4181bi.C55797ag) r1
            goto L_0x00e2
        L_0x00e0:
            com.google.bi.ag r1 = com.google.p4181bi.C55797ag.f147232e
        L_0x00e2:
            int r6 = r1.f147235b
            if (r6 != r14) goto L_0x00eb
            java.lang.Object r1 = r1.f147236c
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
        L_0x00eb:
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.bi.ba r1 = (com.google.p4181bi.C55828ba) r1
            r4.getClass()
            int r6 = r1.f147324a
            r6 = r6 | r15
            r1.f147324a = r6
            r1.f147326c = r4
            com.google.protobuf.bv r1 = r5.build()
            r8 = r1
            com.google.bi.ba r8 = (com.google.p4181bi.C55828ba) r8
            r4 = r17
            r5 = r18
            r6 = r19
            r9 = r2
            r11 = r16
            r4.m75382e(r5, r6, r8, r9, r11)
            goto L_0x0008
        L_0x0111:
            com.google.bi.z r5 = com.google.p4181bi.C55864z.f147406f
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.bi.u r5 = (com.google.p4181bi.C55859u) r5
            int r6 = r1.f147383b
            if (r6 != r12) goto L_0x0122
            java.lang.Object r1 = r1.f147384c
            com.google.bi.ag r1 = (com.google.p4181bi.C55797ag) r1
            goto L_0x0124
        L_0x0122:
            com.google.bi.ag r1 = com.google.p4181bi.C55797ag.f147232e
        L_0x0124:
            int r6 = r1.f147235b
            if (r6 != r15) goto L_0x012d
            java.lang.Object r1 = r1.f147236c
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
        L_0x012d:
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.bi.z r1 = (com.google.p4181bi.C55864z) r1
            r4.getClass()
            int r6 = r1.f147408a
            r6 = r6 | r13
            r1.f147408a = r6
            r1.f147409b = r4
            com.google.protobuf.bv r1 = r5.build()
            r7 = r1
            com.google.bi.z r7 = (com.google.p4181bi.C55864z) r7
            r4 = r18
            r5 = r19
            r8 = r2
            r10 = r16
            m75383f(r4, r5, r7, r8, r10)
            goto L_0x0008
        L_0x0151:
            r1 = 0
            throw r1
        L_0x0153:
            r1 = r14
            throw r1
        L_0x0155:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.storage.C42683dc.m75381d(java.util.List, long, com.google.bi.ay, com.google.android.libraries.social.populous.storage.cv, java.lang.Double):void");
    }

    /* renamed from: e */
    private final void m75382e(List list, long j, C55828ba baVar, double d, C42675cv cvVar) {
        String str;
        C42518g gVar = this.f111900a;
        if (!baVar.f147326c.isEmpty()) {
            str = baVar.f147326c;
        } else {
            str = baVar.f147325b;
        }
        m75380c(list, j, d, cvVar, gVar.mo45539a(str));
    }

    /* renamed from: f */
    private static final void m75383f(List list, long j, C55864z zVar, double d, C42675cv cvVar) {
        if (!zVar.f147409b.isEmpty()) {
            m75380c(list, j, d, cvVar, C57873c.m88540b(zVar.f147409b, true));
        }
    }

    /* renamed from: g */
    private static final void m75384g(List list, long j, C55810at atVar, double d, C42675cv cvVar) {
        if (!atVar.f147268b.isEmpty()) {
            C58485gu n = C58485gu.m89846n(C57873c.m88544f(atVar.f147268b));
            C58485gu b = C57873c.m88540b(atVar.f147268b, false);
            C58526ih ihVar = new C58526ih();
            ihVar.mo55489i(n);
            ihVar.mo55489i(b);
            m75380c(list, j, d, cvVar, ihVar.mo55486f());
        }
    }

    /* renamed from: b */
    public final void mo45783b(C42685f fVar, C55847i iVar) {
        mo45782a(fVar.f111905e, fVar.f111901a, iVar);
    }

    /* renamed from: a */
    public final void mo45782a(List list, long j, C55847i iVar) {
        C55815ay ayVar;
        C55794ad adVar;
        int i = iVar.f147360a;
        int a = C55846h.m87793a(i);
        int i2 = a - 1;
        if (a == 0) {
            throw null;
        } else if (i2 == 0) {
            if (i == 1) {
                ayVar = (C55815ay) iVar.f147361b;
            } else {
                ayVar = C55815ay.f147275f;
            }
            m75381d(list, j, ayVar, (C42675cv) null, (Double) null);
        } else if (i2 != 1) {
            Log.d("TokenWriter", "Unsupported autocompletion proto type.");
        } else {
            if (i == 2) {
                adVar = (C55794ad) iVar.f147361b;
            } else {
                adVar = C55794ad.f147223g;
            }
            C55858t tVar = adVar.f147226b;
            if (tVar == null) {
                tVar = C55858t.f147392f;
            }
            C55817b bVar = tVar.f147397d;
            if (bVar == null) {
                bVar = C55817b.f147283d;
            }
            double d = bVar.f147287c;
            C55858t tVar2 = adVar.f147226b;
            if (tVar2 == null) {
                tVar2 = C55858t.f147392f;
            }
            C42675cv cvVar = C42675cv.GROUP;
            C55810at atVar = tVar2.f147396c;
            if (atVar == null) {
                atVar = C55810at.f147265f;
            }
            m75384g(list, j, atVar, d, cvVar);
            C55858t tVar3 = adVar.f147226b;
            if (tVar3 == null) {
                tVar3 = C55858t.f147392f;
            }
            C55810at atVar2 = tVar3.f147396c;
            if (atVar2 == null) {
                atVar2 = C55810at.f147265f;
            }
            if (atVar2.f147268b.isEmpty()) {
                for (C55815ay d2 : adVar.f147227c) {
                    m75381d(list, j, d2, C42675cv.GROUP, Double.valueOf(d));
                }
            }
        }
    }
}
