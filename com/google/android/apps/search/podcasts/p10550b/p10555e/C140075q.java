package com.google.android.apps.search.podcasts.p10550b.p10555e;

import androidx.p060c.C0984n;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97881ag;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97885ak;
import com.google.protos.p4757ac.p4758a.C63113l;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.search.podcasts.b.e.q */
/* compiled from: PG */
public final class C140075q {

    /* renamed from: d */
    private static final Comparator f380668d = C140073o.f380665a;

    /* renamed from: a */
    public final C0984n f380669a = new C0984n(0);

    /* renamed from: b */
    public List f380670b = new ArrayList();

    /* renamed from: c */
    public List f380671c = new ArrayList();

    public C140075q(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C97881ag agVar = (C97881ag) it.next();
            String str = agVar.f273298b;
            if (!this.f380669a.containsKey(str)) {
                this.f380669a.put(str, new C140074p());
            }
            C140074p pVar = (C140074p) this.f380669a.get(str);
            pVar.getClass();
            C0984n nVar = pVar.f380666a;
            for (C97885ak akVar : agVar.f273299c) {
                nVar.put(akVar.f273308b, akVar);
            }
            if ((agVar.f273297a & 4) != 0) {
                C63113l lVar = agVar.f273300d;
                pVar.f380667b = lVar == null ? C63113l.f170365p : lVar;
            }
        }
        mo115427c();
    }

    /* renamed from: a */
    public final long mo115425a(String str, String str2) {
        C97885ak akVar;
        C140074p pVar = (C140074p) this.f380669a.get(str);
        if (pVar == null || (akVar = (C97885ak) pVar.f380666a.get(str2)) == null) {
            return -1;
        }
        return akVar.f273311e;
    }

    /* renamed from: b */
    public final long mo115426b(String str, String str2) {
        C97885ak akVar;
        C140074p pVar = (C140074p) this.f380669a.get(str);
        if (pVar == null || (akVar = (C97885ak) pVar.f380666a.get(str2)) == null) {
            return 0;
        }
        return akVar.f273309c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x016f A[ADDED_TO_REGION] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo115427c() {
        /*
            r21 = this;
            r0 = r21
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4 = 0
        L_0x000d:
            androidx.c.n r5 = r0.f380669a
            int r6 = r5.f3122d
            if (r4 >= r6) goto L_0x0184
            java.lang.Object r5 = r5.mo3702e(r4)
            java.lang.String r5 = (java.lang.String) r5
            androidx.c.n r6 = r0.f380669a
            java.lang.Object r6 = r6.mo3708h(r4)
            com.google.android.apps.search.podcasts.b.e.p r6 = (com.google.android.apps.search.podcasts.p10550b.p10555e.C140074p) r6
            r7 = 0
        L_0x0022:
            androidx.c.n r8 = r6.f380666a
            int r9 = r8.f3122d
            if (r7 >= r9) goto L_0x017e
            java.lang.Object r8 = r8.mo3702e(r7)
            java.lang.String r8 = (java.lang.String) r8
            androidx.c.n r9 = r6.f380666a
            java.lang.Object r9 = r9.mo3708h(r7)
            com.google.android.apps.gsa.staticplugins.cl.b.ak r9 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97885ak) r9
            com.google.android.apps.gsa.staticplugins.cl.b.bk r10 = com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97912bk.f273376g
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.apps.gsa.staticplugins.cl.b.bj r10 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97911bj) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.android.apps.gsa.staticplugins.cl.b.bk r11 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97912bk) r11
            r5.getClass()
            int r12 = r11.f273378a
            r13 = 2
            r12 = r12 | r13
            r11.f273378a = r12
            r11.f273380c = r5
            com.google.protos.ac.a.l r11 = r6.f380667b
            java.lang.String r11 = r11.f170373g
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.android.apps.gsa.staticplugins.cl.b.bk r12 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97912bk) r12
            r11.getClass()
            int r14 = r12.f273378a
            r15 = 1
            r14 = r14 | r15
            r12.f273378a = r14
            r12.f273379b = r11
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.android.apps.gsa.staticplugins.cl.b.bk r11 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97912bk) r11
            r8.getClass()
            int r12 = r11.f273378a
            r12 = r12 | 4
            r11.f273378a = r12
            r11.f273381d = r8
            float r8 = r9.f273312f
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.android.apps.gsa.staticplugins.cl.b.bk r11 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97912bk) r11
            int r12 = r11.f273378a
            r12 = r12 | 8
            r11.f273378a = r12
            r11.f273382e = r8
            long r11 = r9.f273311e
            r10.copyOnWrite()
            com.google.protobuf.bv r8 = r10.instance
            com.google.android.apps.gsa.staticplugins.cl.b.bk r8 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97912bk) r8
            int r14 = r8.f273378a
            r14 = r14 | 16
            r8.f273378a = r14
            r8.f273383f = r11
            com.google.protobuf.bv r8 = r10.build()
            com.google.android.apps.gsa.staticplugins.cl.b.bk r8 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97912bk) r8
            com.google.protos.ac.a.l r10 = r6.f380667b
            if (r10 == 0) goto L_0x0168
            com.google.protos.ac.a.h r10 = com.google.protos.p4757ac.p4758a.C63109h.f170342e
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.protos.ac.a.g r10 = (com.google.protos.p4757ac.p4758a.C63108g) r10
            com.google.protos.ac.a.l r11 = r6.f380667b
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.protos.ac.a.h r12 = (com.google.protos.p4757ac.p4758a.C63109h) r12
            r11.getClass()
            r12.f170345b = r11
            int r11 = r12.f170344a
            r11 = r11 | r15
            r12.f170344a = r11
            com.google.protobuf.bv r10 = r10.build()
            com.google.protos.ac.a.h r10 = (com.google.protos.p4757ac.p4758a.C63109h) r10
            int r11 = r10.f170344a
            r11 = r11 & r15
            if (r11 == 0) goto L_0x0168
            com.google.protos.ac.a.l r10 = r10.f170345b
            if (r10 != 0) goto L_0x00d0
            com.google.protos.ac.a.l r10 = com.google.protos.p4757ac.p4758a.C63113l.f170365p
        L_0x00d0:
            java.lang.String r10 = r10.f170373g
            android.net.Uri r11 = android.net.Uri.parse(r10)
            java.lang.String r12 = r11.getScheme()
            if (r12 == 0) goto L_0x014e
            java.lang.String r12 = r11.getScheme()
            java.lang.String r14 = "http"
            boolean r12 = r12.equals(r14)
            if (r12 != 0) goto L_0x00f4
            java.lang.String r11 = r11.getScheme()
            java.lang.String r12 = "https"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x014e
        L_0x00f4:
            boolean r10 = r9.f273310d
            if (r10 == 0) goto L_0x00fd
            r20 = r4
        L_0x00fa:
            r13 = 3
            goto L_0x016b
        L_0x00fd:
            int r10 = r9.f273307a
            r10 = r10 & 32
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r10 == 0) goto L_0x011c
            float r10 = r9.f273312f
            r12 = 0
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x011c
            r12 = 1065353216(0x3f800000, float:1.0)
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 > 0) goto L_0x011c
            long r11 = r9.f273309c
            float r11 = (float) r11
            float r11 = r11 / r10
            long r10 = (long) r11
            r16 = r10
        L_0x011c:
            r10 = 20
            j$.time.Duration r10 = p3186j$.time.Duration.ofSeconds(r10)
            long r10 = r10.toMillis()
            r18 = 4
            long r13 = r16 / r18
            long r10 = java.lang.Math.min(r10, r13)
            r18 = 2
            j$.time.Duration r18 = p3186j$.time.Duration.ofMinutes(r18)
            r20 = r4
            long r3 = r18.toMillis()
            long r3 = java.lang.Math.min(r3, r13)
            long r13 = r9.f273309c
            int r9 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r9 >= 0) goto L_0x0145
            goto L_0x0158
        L_0x0145:
            long r16 = r16 - r13
            int r9 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x014c
            goto L_0x00fa
        L_0x014c:
            r13 = 2
            goto L_0x016b
        L_0x014e:
            r20 = r4
            java.lang.String r3 = "News"
            boolean r3 = r10.startsWith(r3)
            if (r3 == 0) goto L_0x0159
        L_0x0158:
            goto L_0x016a
        L_0x0159:
            java.lang.String r3 = "Podcast"
            boolean r3 = r10.startsWith(r3)
            if (r3 == 0) goto L_0x0162
            goto L_0x0158
        L_0x0162:
            java.lang.String r3 = "Story"
            r10.startsWith(r3)
            goto L_0x016a
        L_0x0168:
            r20 = r4
        L_0x016a:
            r13 = 1
        L_0x016b:
            int r13 = r13 + -1
            if (r13 == 0) goto L_0x0172
            if (r13 == r15) goto L_0x0172
            goto L_0x0175
        L_0x0172:
            r2.add(r8)
        L_0x0175:
            r1.add(r8)
            int r7 = r7 + 1
            r4 = r20
            goto L_0x0022
        L_0x017e:
            r20 = r4
            int r4 = r20 + 1
            goto L_0x000d
        L_0x0184:
            java.util.Comparator r3 = f380668d
            java.util.Collections.sort(r1, r3)
            java.util.Collections.sort(r2, r3)
            int r3 = r1.size()
            r4 = 100
            if (r3 <= r4) goto L_0x019a
            r3 = 0
            java.util.List r1 = r1.subList(r3, r4)
            goto L_0x019b
        L_0x019a:
            r3 = 0
        L_0x019b:
            r0.f380670b = r1
            int r1 = r2.size()
            if (r1 <= r4) goto L_0x01a7
            java.util.List r2 = r2.subList(r3, r4)
        L_0x01a7:
            r0.f380671c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.p10550b.p10555e.C140075q.mo115427c():void");
    }

    /* renamed from: d */
    public final boolean mo115428d(String str, String str2) {
        C97885ak akVar;
        C140074p pVar = (C140074p) this.f380669a.get(str);
        if (pVar == null || (akVar = (C97885ak) pVar.f380666a.get(str2)) == null) {
            return false;
        }
        return akVar.f273310d;
    }
}
