package com.google.android.libraries.appdoctor.p573a;

import android.text.TextUtils;
import com.google.android.gms.p10747b.p10748a.C142954b;
import com.google.android.gms.p10747b.p10748a.C142967o;
import com.google.android.libraries.appdoctor.p575c.C10470b;
import com.google.android.libraries.appdoctor.p575c.C10471c;
import com.google.android.libraries.appdoctor.p575c.C10472d;
import com.google.android.libraries.appdoctor.p575c.C10473e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4552o.p4566l.C60223w;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.appdoctor.a.i */
/* compiled from: PG */
public final class C10452i {

    /* renamed from: a */
    public static final C58528ij f35186a = C58528ij.m90011K(C60223w.STARTUP, C60223w.TELEDOCTOR);

    /* renamed from: b */
    public final String f35187b;

    /* renamed from: c */
    public final C142954b f35188c;

    /* renamed from: d */
    public final C58833ax f35189d;

    /* renamed from: e */
    public final C10448e f35190e;

    /* renamed from: f */
    public boolean f35191f = true;

    /* renamed from: g */
    private final C58528ij f35192g;

    /* renamed from: h */
    private final Random f35193h;

    /* renamed from: i */
    private String f35194i;

    public C10452i(String str, C142954b bVar, C142967o oVar, C10448e eVar, C58528ij ijVar) {
        C58838bb.m90884s(true ^ TextUtils.isEmpty(str), "Given String is empty or null");
        this.f35187b = str;
        bVar.getClass();
        this.f35188c = bVar;
        this.f35189d = C58833ax.m90833j(oVar);
        eVar.getClass();
        this.f35190e = eVar;
        ijVar.getClass();
        this.f35192g = ijVar;
        this.f35191f = false;
        this.f35193h = new Random();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:34|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r0 = new com.google.android.libraries.appdoctor.p573a.C10453j(r2);
        r0.mo18498c(r3, 5);
        r0 = com.google.common.base.C58833ax.m90834k(r0.mo18496a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0108, code lost:
        r9 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x014f, code lost:
        if (r0 != 3) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0196, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0197, code lost:
        r7 = 5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00f8 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:54:0x0142=Splitter:B:54:0x0142, B:75:0x019a=Splitter:B:75:0x019a} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.appdoctor.p573a.C10451h mo18493a(com.google.android.libraries.appdoctor.p573a.C10454k r17, com.google.android.libraries.appdoctor.p573a.C10445b r18, com.google.android.libraries.appdoctor.p573a.C10448e r19) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r19
            java.lang.String r4 = "Exception shutting down executor, we may leak a thread: "
            java.lang.String r5 = "App_Doctor_Fixer"
            java.lang.String r0 = r1.f35187b
            int r6 = r0.length()
            r7 = 23
            int r6 = java.lang.Math.min(r6, r7)
            r7 = 0
            java.lang.String r0 = r0.substring(r7, r6)
            java.lang.String r6 = "Running fixer!"
            android.util.Log.i(r0, r6)
            com.google.common.o.l.z r0 = com.google.common.p4552o.p4566l.C60226z.f162945g
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.common.o.l.u r0 = (com.google.common.p4552o.p4566l.C60221u) r0
            com.google.common.o.l.w r6 = r2.f35202a
            r0.copyOnWrite()
            com.google.protobuf.bv r7 = r0.instance
            com.google.common.o.l.z r7 = (com.google.common.p4552o.p4566l.C60226z) r7
            int r6 = r6.f162943d
            r7.f162952f = r6
            int r6 = r7.f162947a
            r6 = r6 | 16
            r7.f162947a = r6
            com.google.protobuf.bv r0 = r0.build()
            com.google.common.o.l.z r0 = (com.google.common.p4552o.p4566l.C60226z) r0
            com.google.protobuf.bn r0 = r0.toBuilder()
            r6 = r0
            com.google.common.o.l.u r6 = (com.google.common.p4552o.p4566l.C60221u) r6
            java.lang.String r0 = r1.f35194i
            r7 = 1
            if (r0 != 0) goto L_0x0078
            android.content.Context r0 = r2.f35203b
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r8 = com.google.android.libraries.p11012aj.C147596b.m240671b()
            java.lang.String r9 = ""
            if (r8 != 0) goto L_0x005d
        L_0x005b:
            r8 = r9
            goto L_0x0076
        L_0x005d:
            if (r0 != 0) goto L_0x0060
            goto L_0x0076
        L_0x0060:
            boolean r10 = r8.startsWith(r0)
            if (r10 == 0) goto L_0x0076
            int r0 = r0.length()
            int r10 = r8.length()
            if (r10 != r0) goto L_0x0071
            goto L_0x005b
        L_0x0071:
            int r0 = r0 + r7
            java.lang.String r8 = r8.substring(r0)
        L_0x0076:
            r1.f35194i = r8
        L_0x0078:
            java.lang.String r0 = r1.f35194i
            boolean r0 = r0.isEmpty()
            r8 = 2
            if (r0 != 0) goto L_0x0094
            java.lang.String r0 = r1.f35194i
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            com.google.common.o.l.z r9 = (com.google.common.p4552o.p4566l.C60226z) r9
            r0.getClass()
            int r10 = r9.f162947a
            r10 = r10 | r8
            r9.f162947a = r10
            r9.f162949c = r0
        L_0x0094:
            r11 = 0
            com.google.android.libraries.appdoctor.a.j r0 = new com.google.android.libraries.appdoctor.a.j     // Catch:{ all -> 0x01ba }
            r0.<init>(r2)     // Catch:{ all -> 0x01ba }
            com.google.android.libraries.appdoctor.a.f r12 = new com.google.android.libraries.appdoctor.a.f     // Catch:{ all -> 0x01ba }
            com.google.android.libraries.appdoctor.a.e r13 = r1.f35190e     // Catch:{ all -> 0x01ba }
            com.google.android.gms.b.a.b r13 = r13.f35176a     // Catch:{ all -> 0x01ba }
            r12.<init>(r13, r8)     // Catch:{ all -> 0x01ba }
            r0.mo18497b(r12)     // Catch:{ all -> 0x01ba }
            com.google.android.libraries.appdoctor.a.k r2 = r0.mo18496a()     // Catch:{ all -> 0x01ba }
            java.util.concurrent.ExecutorService r11 = java.util.concurrent.Executors.newSingleThreadExecutor()     // Catch:{ all -> 0x01ba }
            r12 = 3
            com.google.common.base.ax r0 = r1.f35189d     // Catch:{ all -> 0x0199 }
            r13 = 5
            r3.mo18489c(r2, r0)     // Catch:{ RuntimeException -> 0x00ce }
            com.google.android.gms.b.a.b r0 = r3.f35176a     // Catch:{ RuntimeException -> 0x00ce }
            com.google.android.libraries.appdoctor.a.f r0 = r2.mo18499a(r0)     // Catch:{ RuntimeException -> 0x00ce }
            int r0 = r0.f35179b     // Catch:{ RuntimeException -> 0x00ce }
            if (r0 != r8) goto L_0x00cc
            com.google.android.libraries.appdoctor.a.j r0 = new com.google.android.libraries.appdoctor.a.j     // Catch:{ RuntimeException -> 0x00ce }
            r0.<init>(r2)     // Catch:{ RuntimeException -> 0x00ce }
            r0.mo18498c(r3, r12)     // Catch:{ RuntimeException -> 0x00ce }
            com.google.android.libraries.appdoctor.a.k r0 = r0.mo18496a()     // Catch:{ RuntimeException -> 0x00ce }
            goto L_0x00e4
        L_0x00cc:
            r0 = r2
            goto L_0x00e4
        L_0x00ce:
            r0 = move-exception
            java.lang.String r14 = r19.mo18488b()     // Catch:{ all -> 0x0199 }
            com.google.common.o.l.w r15 = r2.f35202a     // Catch:{ all -> 0x0199 }
            com.google.android.libraries.appdoctor.p573a.C10447d.m25415a(r0, r15, r14)     // Catch:{ all -> 0x0199 }
            com.google.android.libraries.appdoctor.a.j r0 = new com.google.android.libraries.appdoctor.a.j     // Catch:{ all -> 0x0199 }
            r0.<init>(r2)     // Catch:{ all -> 0x0199 }
            r0.mo18498c(r3, r13)     // Catch:{ all -> 0x0199 }
            com.google.android.libraries.appdoctor.a.k r0 = r0.mo18496a()     // Catch:{ all -> 0x0199 }
        L_0x00e4:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ all -> 0x0199 }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)     // Catch:{ all -> 0x0199 }
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00f8 }
            r9 = -1
            java.lang.Object r0 = r0.get(r9, r14)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00f8 }
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x00f8 }
            r9 = 1
            goto L_0x0109
        L_0x00f8:
            com.google.android.libraries.appdoctor.a.j r0 = new com.google.android.libraries.appdoctor.a.j     // Catch:{ all -> 0x0196 }
            r0.<init>(r2)     // Catch:{ all -> 0x0196 }
            r0.mo18498c(r3, r13)     // Catch:{ all -> 0x0196 }
            com.google.android.libraries.appdoctor.a.k r0 = r0.mo18496a()     // Catch:{ all -> 0x0196 }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)     // Catch:{ all -> 0x0196 }
            r9 = 5
        L_0x0109:
            boolean r10 = r0.mo56113h()     // Catch:{ all -> 0x0193 }
            r14 = 4
            if (r10 == 0) goto L_0x0141
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ all -> 0x0193 }
            com.google.android.libraries.appdoctor.a.k r0 = (com.google.android.libraries.appdoctor.p573a.C10454k) r0     // Catch:{ all -> 0x0193 }
            r10 = r18
            com.google.android.libraries.appdoctor.a.k r2 = r1.mo18495c(r0, r3, r10)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.b.a.b r0 = r3.f35176a     // Catch:{ all -> 0x0193 }
            com.google.android.libraries.appdoctor.a.f r0 = r2.mo18499a(r0)     // Catch:{ all -> 0x0193 }
            int r0 = r0.f35179b     // Catch:{ all -> 0x0193 }
            if (r0 == r8) goto L_0x0142
            com.google.android.gms.b.a.b r0 = r3.f35176a     // Catch:{ all -> 0x0193 }
            com.google.android.libraries.appdoctor.a.f r0 = r2.mo18499a(r0)     // Catch:{ all -> 0x0193 }
            int r0 = r0.f35179b     // Catch:{ all -> 0x0193 }
            int r0 = r0 + -2
            if (r0 == 0) goto L_0x013f
            if (r0 == r7) goto L_0x013e
            if (r0 == r12) goto L_0x013c
            if (r0 == r14) goto L_0x013a
            r7 = 2
            goto L_0x013f
        L_0x013a:
            r7 = 5
            goto L_0x013f
        L_0x013c:
            r7 = 3
            goto L_0x013f
        L_0x013e:
            r7 = 4
        L_0x013f:
            r9 = r7
            goto L_0x0142
        L_0x0141:
            r9 = 4
        L_0x0142:
            com.google.protobuf.bv r0 = r6.instance     // Catch:{ all -> 0x01ba }
            com.google.common.o.l.z r0 = (com.google.common.p4552o.p4566l.C60226z) r0     // Catch:{ all -> 0x01ba }
            int r0 = r0.f162951e     // Catch:{ all -> 0x01ba }
            int r0 = com.google.common.p4552o.p4566l.C60225y.m92550a(r0)     // Catch:{ all -> 0x01ba }
            if (r0 != 0) goto L_0x014f
            goto L_0x0151
        L_0x014f:
            if (r0 == r12) goto L_0x0162
        L_0x0151:
            r6.copyOnWrite()     // Catch:{ all -> 0x01ba }
            com.google.protobuf.bv r0 = r6.instance     // Catch:{ all -> 0x01ba }
            com.google.common.o.l.z r0 = (com.google.common.p4552o.p4566l.C60226z) r0     // Catch:{ all -> 0x01ba }
            int r9 = r9 + -1
            r0.f162951e = r9     // Catch:{ all -> 0x01ba }
            int r3 = r0.f162947a     // Catch:{ all -> 0x01ba }
            r3 = r3 | 8
            r0.f162947a = r3     // Catch:{ all -> 0x01ba }
        L_0x0162:
            if (r11 == 0) goto L_0x0175
            r11.shutdownNow()     // Catch:{ SecurityException -> 0x0168 }
            goto L_0x0175
        L_0x0168:
            r0 = move-exception
            r3 = r0
            java.lang.String r0 = r3.toString()
            java.lang.String r0 = r4.concat(r0)
            android.util.Log.e(r5, r0)
        L_0x0175:
            java.util.Random r0 = r1.f35193h
            float r0 = r0.nextFloat()
            double r3 = (double) r0
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x018d
            com.google.android.libraries.appdoctor.a.a r0 = r2.f35204c
            com.google.protobuf.bv r3 = r6.build()
            com.google.common.o.l.z r3 = (com.google.common.p4552o.p4566l.C60226z) r3
            r0.mo18486a(r3)
        L_0x018d:
            com.google.android.libraries.appdoctor.a.h r0 = new com.google.android.libraries.appdoctor.a.h
            r0.<init>(r1, r2)
            return r0
        L_0x0193:
            r0 = move-exception
            r7 = r9
            goto L_0x019a
        L_0x0196:
            r0 = move-exception
            r7 = 5
            goto L_0x019a
        L_0x0199:
            r0 = move-exception
        L_0x019a:
            com.google.protobuf.bv r3 = r6.instance     // Catch:{ all -> 0x01ba }
            com.google.common.o.l.z r3 = (com.google.common.p4552o.p4566l.C60226z) r3     // Catch:{ all -> 0x01ba }
            int r3 = r3.f162951e     // Catch:{ all -> 0x01ba }
            int r3 = com.google.common.p4552o.p4566l.C60225y.m92550a(r3)     // Catch:{ all -> 0x01ba }
            if (r3 == 0) goto L_0x01a8
            if (r3 == r12) goto L_0x01b9
        L_0x01a8:
            r6.copyOnWrite()     // Catch:{ all -> 0x01ba }
            com.google.protobuf.bv r3 = r6.instance     // Catch:{ all -> 0x01ba }
            com.google.common.o.l.z r3 = (com.google.common.p4552o.p4566l.C60226z) r3     // Catch:{ all -> 0x01ba }
            int r7 = r7 + -1
            r3.f162951e = r7     // Catch:{ all -> 0x01ba }
            int r7 = r3.f162947a     // Catch:{ all -> 0x01ba }
            r7 = r7 | 8
            r3.f162947a = r7     // Catch:{ all -> 0x01ba }
        L_0x01b9:
            throw r0     // Catch:{ all -> 0x01ba }
        L_0x01ba:
            r0 = move-exception
            r3 = r0
            if (r11 == 0) goto L_0x01cf
            r11.shutdownNow()     // Catch:{ SecurityException -> 0x01c2 }
            goto L_0x01cf
        L_0x01c2:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = r7.toString()
            java.lang.String r0 = r4.concat(r0)
            android.util.Log.e(r5, r0)
        L_0x01cf:
            java.util.Random r0 = r1.f35193h
            float r0 = r0.nextFloat()
            double r4 = (double) r0
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x01e7
            com.google.android.libraries.appdoctor.a.a r0 = r2.f35204c
            com.google.protobuf.bv r2 = r6.build()
            com.google.common.o.l.z r2 = (com.google.common.p4552o.p4566l.C60226z) r2
            r0.mo18486a(r2)
        L_0x01e7:
            goto L_0x01e9
        L_0x01e8:
            throw r3
        L_0x01e9:
            goto L_0x01e8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.appdoctor.p573a.C10452i.mo18493a(com.google.android.libraries.appdoctor.a.k, com.google.android.libraries.appdoctor.a.b, com.google.android.libraries.appdoctor.a.e):com.google.android.libraries.appdoctor.a.h");
    }

    /* renamed from: b */
    public final boolean mo18494b(C10454k kVar) {
        C10471c cVar;
        long j;
        C10453j jVar = new C10453j(kVar);
        jVar.f35201g = this;
        C10454k a = jVar.mo18496a();
        if (!this.f35192g.contains(a.f35202a)) {
            return false;
        }
        C10448e eVar = this.f35190e;
        String str = this.f35187b;
        int i = 0;
        while (true) {
            if (i >= a.mo18500b().size()) {
                cVar = null;
                break;
            }
            cVar = (C10471c) a.mo18500b().get(i);
            if (cVar.f35229c.equals(str)) {
                break;
            }
            i++;
        }
        if (cVar == null) {
            j = 0;
        } else {
            C10473e eVar2 = cVar.f35230d;
            if (eVar2 == null) {
                eVar2 = C10473e.f35231e;
            }
            j = eVar2.f35235c;
        }
        try {
            if (!eVar.mo18490d() || j > System.currentTimeMillis()) {
                return false;
            }
            return true;
        } catch (RuntimeException e) {
            C10447d.m25415a(e, a.f35202a, eVar.mo18488b());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C10454k mo18495c(C10454k kVar, C10448e eVar, C10445b bVar) {
        long currentTimeMillis = System.currentTimeMillis();
        int i = kVar.mo18499a(eVar.f35176a).f35179b;
        long millis = (i == 5 ? TimeUnit.SECONDS.toMillis(eVar.f35177b) : 3600000) + currentTimeMillis;
        C10470b bVar2 = (C10470b) C10471c.f35225e.createBuilder();
        String str = this.f35187b;
        bVar2.copyOnWrite();
        str.getClass();
        ((C10471c) bVar2.instance).f35229c = str;
        C142954b bVar3 = eVar.f35176a;
        bVar2.copyOnWrite();
        ((C10471c) bVar2.instance).f35228b = bVar3.getNumber();
        C10472d dVar = (C10472d) C10473e.f35231e.createBuilder();
        dVar.copyOnWrite();
        C10473e eVar2 = (C10473e) dVar.instance;
        eVar2.f35236d = i - 2;
        eVar2.f35233a |= 4;
        dVar.copyOnWrite();
        C10473e eVar3 = (C10473e) dVar.instance;
        eVar3.f35233a |= 1;
        eVar3.f35234b = currentTimeMillis;
        dVar.copyOnWrite();
        C10473e eVar4 = (C10473e) dVar.instance;
        eVar4.f35233a |= 2;
        eVar4.f35235c = millis;
        C10473e eVar5 = (C10473e) dVar.build();
        bVar2.copyOnWrite();
        C10471c cVar = (C10471c) bVar2.instance;
        eVar5.getClass();
        cVar.f35230d = eVar5;
        cVar.f35227a |= 1;
        C10471c cVar2 = (C10471c) bVar2.build();
        try {
            ((C10457n) bVar).f35211a.mo46039a(new C10455l(cVar2), ((C10457n) bVar).f35212b).get();
            C10453j jVar = new C10453j(kVar);
            C58480gp e = C58485gu.m89837e();
            e.mo55396h(jVar.f35199e);
            e.mo55395g(cVar2);
            jVar.f35199e = e.mo55394f();
            return jVar.mo18496a();
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalArgumentException("Update of recent fix data failed", e2);
        }
    }
}
