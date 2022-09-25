package com.google.android.gms.learning.dynamite.training;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.google.android.gms.common.util.C144005e;
import com.google.android.gms.learning.C144573b;
import com.google.android.gms.learning.C144827n;
import com.google.android.gms.learning.p10820a.C144547dk;
import com.google.android.gms.learning.p10823d.C144588ad;
import com.google.android.libraries.micore.learning.base.C29711c;
import com.google.android.libraries.micore.learning.base.C29712d;
import com.google.android.libraries.micore.learning.base.C29716h;
import com.google.android.libraries.micore.learning.base.C29719k;
import com.google.android.libraries.micore.learning.p2258a.C29695e;
import com.google.android.libraries.micore.learning.p2258a.C29697g;
import com.google.android.libraries.micore.learning.p2258a.C29700j;
import com.google.android.libraries.micore.learning.p2258a.C29706p;
import com.google.android.libraries.micore.learning.training.util.C29760e;
import com.google.android.libraries.micore.learning.training.util.C29761f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60916ec;
import com.google.p3728as.p3729a.p3730a.p3731a.C48021b;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.learning.dynamite.training.bt */
/* compiled from: PG */
public final class C144704bt {

    /* renamed from: a */
    static final C29719k f391492a = C29712d.m54802b("brella", "TrainingJob");

    /* renamed from: b */
    static final Object f391493b = new Object();

    /* renamed from: c */
    public C144703bs f391494c = null;

    /* renamed from: d */
    public C60887da f391495d;

    /* renamed from: e */
    public C29711c f391496e;

    /* renamed from: f */
    public C144573b f391497f;

    /* renamed from: g */
    public C144588ad f391498g;

    /* renamed from: h */
    public C144827n f391499h;

    /* renamed from: i */
    public C29716h f391500i;

    /* renamed from: j */
    public final C144666ai f391501j;

    /* renamed from: k */
    private C29761f f391502k;

    /* renamed from: l */
    private C144547dk f391503l;

    /* JADX INFO: finally extract failed */
    public C144704bt(C144666ai aiVar, C60887da daVar) {
        try {
            this.f391501j = aiVar;
            this.f391495d = daVar;
            C29711c b = C29711c.m54796b(aiVar.f391420a.getApplicationContext());
            this.f391496e = b;
            this.f391497f = (C144573b) b.mo34852c(C144573b.class);
            this.f391502k = (C29761f) this.f391496e.mo34852c(C29761f.class);
            this.f391498g = (C144588ad) this.f391496e.mo34852c(C144588ad.class);
            this.f391499h = (C144827n) this.f391496e.mo34852c(C144827n.class);
            this.f391500i = (C29716h) this.f391496e.mo34852c(C29716h.class);
            this.f391503l = (C144547dk) this.f391496e.mo34852c(C144547dk.class);
            this.f391499h.mo120056h(1200);
        } catch (Throwable th) {
            C144827n nVar = this.f391499h;
            if (nVar != null) {
                nVar.mo120056h(1199);
            }
            C144005e.m234184a(aiVar.f391420a.getApplicationContext(), th);
            throw th;
        }
    }

    /* renamed from: a */
    public static C144706bv m235207a(C29706p pVar) {
        C29697g gVar;
        int i = pVar.f80450a;
        if (i == 4) {
            return C144708d.m235218a((C29695e) pVar.f80451b);
        }
        if (i == 13) {
            gVar = (C29697g) pVar.f80451b;
        } else {
            gVar = C29697g.f80430f;
        }
        return C144708d.m235219b(gVar);
    }

    /* renamed from: b */
    public static void m235208b(C60870cx cxVar, Context context) {
        try {
            C60856cj.m92909r(cxVar);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            f391492a.mo34868j(e, "Training failed");
            C60916ec ecVar = new C60916ec(e);
            C144005e.m234184a(context, ecVar);
            throw ecVar;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v45, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v61, resolved type: com.google.android.gms.learning.dynamite.training.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v62, resolved type: com.google.android.gms.learning.dynamite.training.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v43, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v44, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v48, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v53, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v55, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v56, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v57, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v92, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v93, resolved type: boolean} */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x04b1  */
    /* renamed from: c */
    public final void mo120168c(com.google.android.gms.learning.dynamite.training.C144703bs r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            com.google.android.gms.learning.dynamite.training.ai r0 = r1.f391501j
            android.app.job.JobService r0 = r0.f391420a
            android.content.Context r0 = r0.getApplicationContext()
            com.google.android.libraries.micore.learning.a.p r3 = r2.f391487b
            java.lang.String r5 = r3.f80453d
            int r4 = r3.f80450a
            r14 = 0
            r6 = 4
            if (r4 != r6) goto L_0x001d
            java.lang.Object r3 = r3.f80451b
            com.google.android.libraries.micore.learning.a.e r3 = (com.google.android.libraries.micore.learning.p2258a.C29695e) r3
            java.lang.String r3 = r3.f80427a
            goto L_0x001e
        L_0x001d:
            r3 = r14
        L_0x001e:
            java.lang.String r0 = r0.getPackageName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = "/"
            r4.append(r0)
            r4.append(r5)
            java.lang.String r0 = r4.toString()
            java.lang.String r4 = com.google.common.base.C58837ba.m90858g(r3)
            java.lang.String r0 = com.google.android.libraries.micore.learning.training.C29728d.m54829a(r0, r4)
            r15 = 1190(0x4a6, float:1.668E-42)
            r13 = 1
            r12 = 0
            com.google.android.libraries.micore.learning.a.p r4 = r2.f391487b     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            int r7 = r4.f80450a     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            if (r7 != r6) goto L_0x004a
            r7 = 1
            goto L_0x004b
        L_0x004a:
            r7 = 0
        L_0x004b:
            com.google.android.libraries.micore.learning.a.j r4 = r4.f80461l     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            if (r4 != 0) goto L_0x0051
            com.google.android.libraries.micore.learning.a.j r4 = com.google.android.libraries.micore.learning.p2258a.C29700j.f80437f     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
        L_0x0051:
            boolean r4 = r1.mo120170e(r7, r0, r4)     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            if (r4 != 0) goto L_0x006e
            com.google.android.libraries.micore.learning.base.k r0 = f391492a     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            java.lang.String r3 = "Training conditions not satisfied (before starting training)!"
            r0.mo34866h(r3)     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            com.google.android.gms.learning.n r0 = r1.f391499h
            r0.mo120056h(r15)
            java.lang.Object r3 = f391493b
            monitor-enter(r3)
            r1.mo120169d(r2, r14, r13, r12)     // Catch:{ all -> 0x006b }
            monitor-exit(r3)     // Catch:{ all -> 0x006b }
            return
        L_0x006b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x006b }
            throw r0
        L_0x006e:
            r4 = 1129(0x469, float:1.582E-42)
            r7 = 0
            r9 = 13
            if (r3 == 0) goto L_0x00ac
            com.google.android.gms.learning.b r10 = r1.f391497f     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            long r10 = r10.mo119949J()     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 <= 0) goto L_0x00fe
            com.google.android.gms.learning.a.dk r7 = r1.f391503l     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            android.content.Context r7 = r7.f391188a     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            java.io.File r7 = r7.getCacheDir()     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            long r7 = r7.getUsableSpace()     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            int r16 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r16 >= 0) goto L_0x00fe
            com.google.android.gms.learning.n r0 = r1.f391499h     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            r0.mo120056h(r4)     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            com.google.android.libraries.micore.learning.base.k r0 = f391492a     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            java.lang.String r3 = "Available disk space is not enough (before starting training)!"
            r0.mo34866h(r3)     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            com.google.android.gms.learning.n r0 = r1.f391499h
            r0.mo120056h(r15)
            java.lang.Object r3 = f391493b
            monitor-enter(r3)
            r1.mo120169d(r2, r14, r13, r12)     // Catch:{ all -> 0x00a9 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a9 }
            return
        L_0x00a9:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a9 }
            throw r0
        L_0x00ac:
            com.google.android.gms.learning.b r10 = r1.f391497f     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            long r10 = r10.mo119950K()     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 <= 0) goto L_0x00fe
            com.google.android.libraries.micore.learning.base.c r7 = r1.f391496e     // Catch:{ ErrorStatusException -> 0x00f7 }
            android.content.Context r7 = r7.mo34851a()     // Catch:{ ErrorStatusException -> 0x00f7 }
            com.google.android.libraries.micore.learning.a.p r8 = r2.f391487b     // Catch:{ ErrorStatusException -> 0x00f7 }
            int r6 = r8.f80450a     // Catch:{ ErrorStatusException -> 0x00f7 }
            if (r6 != r9) goto L_0x00c7
            java.lang.Object r6 = r8.f80451b     // Catch:{ ErrorStatusException -> 0x00f7 }
            com.google.android.libraries.micore.learning.a.g r6 = (com.google.android.libraries.micore.learning.p2258a.C29697g) r6     // Catch:{ ErrorStatusException -> 0x00f7 }
            goto L_0x00c9
        L_0x00c7:
            com.google.android.libraries.micore.learning.a.g r6 = com.google.android.libraries.micore.learning.p2258a.C29697g.f80430f     // Catch:{ ErrorStatusException -> 0x00f7 }
        L_0x00c9:
            java.lang.String r6 = r6.f80434c     // Catch:{ ErrorStatusException -> 0x00f7 }
            java.net.URI r6 = com.google.android.gms.learning.p10825e.p10826a.C144750m.m235267e(r6)     // Catch:{ ErrorStatusException -> 0x00f7 }
            java.io.File r6 = com.google.android.gms.learning.p10825e.p10826a.C144750m.m235264b(r7, r6)     // Catch:{ ErrorStatusException -> 0x00f7 }
            long r6 = r6.getUsableSpace()     // Catch:{ ErrorStatusException -> 0x00f7 }
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x00fe
            com.google.android.gms.learning.n r0 = r1.f391499h     // Catch:{ ErrorStatusException -> 0x00f7 }
            r0.mo120056h(r4)     // Catch:{ ErrorStatusException -> 0x00f7 }
            com.google.android.libraries.micore.learning.base.k r0 = f391492a     // Catch:{ ErrorStatusException -> 0x00f7 }
            java.lang.String r3 = "Available disk space is not enough (before starting training)!"
            r0.mo34866h(r3)     // Catch:{ ErrorStatusException -> 0x00f7 }
            com.google.android.gms.learning.n r0 = r1.f391499h
            r0.mo120056h(r15)
            java.lang.Object r3 = f391493b
            monitor-enter(r3)
            r1.mo120169d(r2, r14, r13, r12)     // Catch:{ all -> 0x00f4 }
            monitor-exit(r3)     // Catch:{ all -> 0x00f4 }
            return
        L_0x00f4:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00f4 }
            throw r0
        L_0x00f7:
            r0 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            r3.<init>(r0)     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            throw r3     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
        L_0x00fe:
            com.google.android.gms.learning.n r4 = r1.f391499h     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            r6 = 1191(0x4a7, float:1.669E-42)
            r4.mo120056h(r6)     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            java.lang.Object r17 = f391493b     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            monitor-enter(r17)     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            com.google.android.gms.learning.dynamite.training.bs r4 = r1.f391494c     // Catch:{ all -> 0x0486 }
            if (r4 == r2) goto L_0x011b
            monitor-exit(r17)     // Catch:{ all -> 0x0486 }
            com.google.android.gms.learning.n r0 = r1.f391499h
            r0.mo120056h(r15)
            monitor-enter(r17)
            r1.mo120169d(r2, r14, r13, r12)     // Catch:{ all -> 0x0118 }
            monitor-exit(r17)     // Catch:{ all -> 0x0118 }
            return
        L_0x0118:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x0118 }
            throw r0
        L_0x011b:
            com.google.android.gms.learning.dynamite.training.ai r4 = r1.f391501j     // Catch:{ all -> 0x0486 }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x0486 }
            java.lang.String r7 = "com.google.android.gms.learning.training.START"
            r6.<init>(r7)     // Catch:{ all -> 0x0486 }
            android.app.job.JobService r4 = r4.f391420a     // Catch:{ all -> 0x0486 }
            android.content.Context r4 = r4.getApplicationContext()     // Catch:{ all -> 0x0486 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x0486 }
            android.content.Intent r4 = r6.setPackage(r4)     // Catch:{ all -> 0x0486 }
            com.google.common.util.concurrent.SettableFuture r6 = new com.google.common.util.concurrent.SettableFuture     // Catch:{ all -> 0x0486 }
            r6.<init>()     // Catch:{ all -> 0x0486 }
            com.google.android.gms.learning.dynamite.training.bq r7 = new com.google.android.gms.learning.dynamite.training.bq     // Catch:{ all -> 0x0486 }
            r7.<init>(r6)     // Catch:{ all -> 0x0486 }
            r2.f391490e = r7     // Catch:{ all -> 0x0486 }
            if (r3 != 0) goto L_0x0143
            java.lang.String r7 = ""
            goto L_0x0144
        L_0x0143:
            r7 = r3
        L_0x0144:
            java.lang.String r7 = com.google.android.libraries.micore.learning.training.C29728d.m54829a(r5, r7)     // Catch:{ all -> 0x0486 }
            com.google.android.gms.learning.b r8 = r1.f391497f     // Catch:{ all -> 0x0486 }
            boolean r8 = r8.mo119986aT(r7)     // Catch:{ all -> 0x0486 }
            if (r13 == r8) goto L_0x0152
            r8 = 1
            goto L_0x0154
        L_0x0152:
            r8 = 33
        L_0x0154:
            com.google.android.gms.learning.b r10 = r1.f391497f     // Catch:{ all -> 0x0486 }
            boolean r10 = r10.mo119983aQ(r7)     // Catch:{ all -> 0x0486 }
            if (r10 == 0) goto L_0x015e
            r8 = r8 | 16
        L_0x015e:
            com.google.android.gms.learning.b r10 = r1.f391497f     // Catch:{ all -> 0x0486 }
            boolean r10 = r10.mo119984aR(r7)     // Catch:{ all -> 0x0486 }
            if (r10 == 0) goto L_0x0168
            r8 = r8 | 4
        L_0x0168:
            com.google.android.gms.learning.b r10 = r1.f391497f     // Catch:{ all -> 0x0486 }
            boolean r7 = r10.mo119985aS(r7)     // Catch:{ all -> 0x0486 }
            if (r7 == 0) goto L_0x0172
            r8 = r8 | 256(0x100, float:3.59E-43)
        L_0x0172:
            com.google.android.gms.learning.dynamite.training.ai r7 = r1.f391501j     // Catch:{ all -> 0x0486 }
            android.app.job.JobService r7 = r7.f391420a     // Catch:{ all -> 0x0486 }
            android.content.ServiceConnection r10 = r2.f391490e     // Catch:{ all -> 0x0486 }
            boolean r4 = r7.bindService(r4, r10, r8)     // Catch:{ all -> 0x0486 }
            if (r4 != 0) goto L_0x019b
            com.google.android.libraries.micore.learning.base.k r0 = f391492a     // Catch:{ all -> 0x0486 }
            java.lang.String r3 = "bindService returned false"
            r0.mo34866h(r3)     // Catch:{ all -> 0x0486 }
            com.google.android.gms.learning.n r0 = r1.f391499h     // Catch:{ all -> 0x0486 }
            r3 = 1189(0x4a5, float:1.666E-42)
            r0.mo120056h(r3)     // Catch:{ all -> 0x0486 }
            monitor-exit(r17)     // Catch:{ all -> 0x0486 }
            com.google.android.gms.learning.n r0 = r1.f391499h
            r0.mo120056h(r15)
            monitor-enter(r17)
            r1.mo120169d(r2, r14, r13, r12)     // Catch:{ all -> 0x0198 }
            monitor-exit(r17)     // Catch:{ all -> 0x0198 }
            return
        L_0x0198:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x0198 }
            throw r0
        L_0x019b:
            monitor-exit(r17)     // Catch:{ all -> 0x0486 }
            com.google.android.gms.learning.b r4 = r1.f391497f     // Catch:{ InterruptedException -> 0x0465, TimeoutException -> 0x0444, ExecutionException -> 0x043b }
            long r7 = r4.mo119944E()     // Catch:{ InterruptedException -> 0x0465, TimeoutException -> 0x0444, ExecutionException -> 0x043b }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0465, TimeoutException -> 0x0444, ExecutionException -> 0x043b }
            java.lang.Object r4 = r6.get(r7, r4)     // Catch:{ InterruptedException -> 0x0465, TimeoutException -> 0x0444, ExecutionException -> 0x043b }
            android.os.IBinder r4 = (android.os.IBinder) r4     // Catch:{ InterruptedException -> 0x0465, TimeoutException -> 0x0444, ExecutionException -> 0x043b }
            com.google.android.libraries.micore.learning.a.p r6 = r2.f391487b     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            int r7 = r6.f80450a     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            r8 = 4
            if (r7 != r8) goto L_0x01b3
            r7 = 1
            goto L_0x01b4
        L_0x01b3:
            r7 = 0
        L_0x01b4:
            com.google.android.libraries.micore.learning.a.j r6 = r6.f80461l     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            if (r6 != 0) goto L_0x01ba
            com.google.android.libraries.micore.learning.a.j r6 = com.google.android.libraries.micore.learning.p2258a.C29700j.f80437f     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
        L_0x01ba:
            boolean r0 = r1.mo120170e(r7, r0, r6)     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            if (r0 != 0) goto L_0x01d5
            com.google.android.libraries.micore.learning.base.k r0 = f391492a     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            java.lang.String r3 = "Training conditions not satisfied (before starting training)!"
            r0.mo34866h(r3)     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            com.google.android.gms.learning.n r0 = r1.f391499h
            r0.mo120056h(r15)
            monitor-enter(r17)
            r1.mo120169d(r2, r14, r13, r12)     // Catch:{ all -> 0x01d2 }
            monitor-exit(r17)     // Catch:{ all -> 0x01d2 }
            return
        L_0x01d2:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x01d2 }
            throw r0
        L_0x01d5:
            com.google.common.util.concurrent.SettableFuture r0 = new com.google.common.util.concurrent.SettableFuture     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            monitor-enter(r17)     // Catch:{ RuntimeException -> 0x0497, all -> 0x0491 }
            com.google.android.gms.learning.dynamite.training.bs r6 = r1.f391494c     // Catch:{ all -> 0x042f }
            if (r6 == r2) goto L_0x01ee
            monitor-exit(r17)     // Catch:{ all -> 0x042f }
            com.google.android.gms.learning.n r0 = r1.f391499h
            r0.mo120056h(r15)
            monitor-enter(r17)
            r1.mo120169d(r2, r14, r13, r12)     // Catch:{ all -> 0x01eb }
            monitor-exit(r17)     // Catch:{ all -> 0x01eb }
            return
        L_0x01eb:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x01eb }
            throw r0
        L_0x01ee:
            com.google.android.gms.learning.dynamite.training.bm r6 = new com.google.android.gms.learning.dynamite.training.bm     // Catch:{ RemoteException -> 0x040b }
            r6.<init>(r1, r0)     // Catch:{ RemoteException -> 0x040b }
            r4.linkToDeath(r6, r12)     // Catch:{ RemoteException -> 0x040b }
            com.google.android.gms.learning.dynamite.training.bn r10 = new com.google.android.gms.learning.dynamite.training.bn     // Catch:{ RemoteException -> 0x040b }
            r10.<init>(r4, r6)     // Catch:{ RemoteException -> 0x040b }
            if (r4 != 0) goto L_0x01ff
            r6 = r14
            goto L_0x0211
        L_0x01ff:
            java.lang.String r6 = "com.google.android.gms.learning.dynamite.training.IInAppTrainingController"
            android.os.IInterface r6 = r4.queryLocalInterface(r6)     // Catch:{ all -> 0x0403 }
            boolean r7 = r6 instanceof com.google.android.gms.learning.dynamite.training.C144716l     // Catch:{ all -> 0x0403 }
            if (r7 == 0) goto L_0x020c
            com.google.android.gms.learning.dynamite.training.l r6 = (com.google.android.gms.learning.dynamite.training.C144716l) r6     // Catch:{ all -> 0x0403 }
            goto L_0x0211
        L_0x020c:
            com.google.android.gms.learning.dynamite.training.j r6 = new com.google.android.gms.learning.dynamite.training.j     // Catch:{ all -> 0x0403 }
            r6.<init>(r4)     // Catch:{ all -> 0x0403 }
        L_0x0211:
            r2.f391491f = r6     // Catch:{ all -> 0x0403 }
            com.google.android.gms.learning.dynamite.training.br r8 = new com.google.android.gms.learning.dynamite.training.br     // Catch:{ all -> 0x0403 }
            r8.<init>(r0)     // Catch:{ all -> 0x0403 }
            com.google.android.libraries.micore.learning.a.p r4 = r2.f391487b     // Catch:{ all -> 0x0403 }
            com.google.android.libraries.micore.learning.a.j r4 = r4.f80461l     // Catch:{ all -> 0x0403 }
            if (r4 != 0) goto L_0x0221
            com.google.android.libraries.micore.learning.a.j r6 = com.google.android.libraries.micore.learning.p2258a.C29700j.f80437f     // Catch:{ all -> 0x0403 }
            goto L_0x0222
        L_0x0221:
            r6 = r4
        L_0x0222:
            com.google.protobuf.o r6 = r6.f80443e     // Catch:{ all -> 0x0403 }
            if (r6 == 0) goto L_0x0238
            if (r4 != 0) goto L_0x022a
            com.google.android.libraries.micore.learning.a.j r4 = com.google.android.libraries.micore.learning.p2258a.C29700j.f80437f     // Catch:{ all -> 0x0403 }
        L_0x022a:
            com.google.protobuf.o r4 = r4.f80443e     // Catch:{ all -> 0x0403 }
            if (r4 != 0) goto L_0x0230
            com.google.protobuf.o r4 = com.google.protobuf.C63077o.f170228b     // Catch:{ all -> 0x0403 }
        L_0x0230:
            boolean r4 = r4.f170230a     // Catch:{ all -> 0x0403 }
            if (r4 == 0) goto L_0x0235
            goto L_0x0238
        L_0x0235:
            r18 = 0
            goto L_0x023a
        L_0x0238:
            r18 = 1
        L_0x023a:
            com.google.android.libraries.micore.learning.a.p r4 = r2.f391487b     // Catch:{ RemoteException -> 0x03da }
            com.google.protobuf.z r4 = r4.f80463n     // Catch:{ RemoteException -> 0x03da }
            byte[] r19 = r4.mo59174N()     // Catch:{ RemoteException -> 0x03da }
            if (r3 == 0) goto L_0x0288
            com.google.android.gms.learning.dynamite.training.l r4 = r2.f391491f     // Catch:{ RemoteException -> 0x03da }
            com.google.android.libraries.micore.learning.a.p r6 = r2.f391487b     // Catch:{ RemoteException -> 0x03da }
            java.lang.String r7 = r6.f80460k     // Catch:{ RemoteException -> 0x03da }
            int r9 = r6.f80450a     // Catch:{ RemoteException -> 0x03da }
            r11 = 4
            if (r9 != r11) goto L_0x0254
            java.lang.Object r6 = r6.f80451b     // Catch:{ RemoteException -> 0x03da }
            com.google.android.libraries.micore.learning.a.e r6 = (com.google.android.libraries.micore.learning.p2258a.C29695e) r6     // Catch:{ RemoteException -> 0x03da }
            goto L_0x0256
        L_0x0254:
            com.google.android.libraries.micore.learning.a.e r6 = com.google.android.libraries.micore.learning.p2258a.C29695e.f80425d     // Catch:{ RemoteException -> 0x03da }
        L_0x0256:
            int r6 = r6.f80428b     // Catch:{ RemoteException -> 0x03da }
            int r6 = com.google.android.libraries.micore.learning.p2258a.C29693c.m54785b(r6)     // Catch:{ RemoteException -> 0x03da }
            if (r6 != 0) goto L_0x025f
            r6 = 1
        L_0x025f:
            int r9 = com.google.android.libraries.micore.learning.p2258a.C29693c.m54784a(r6)     // Catch:{ RemoteException -> 0x03da }
            com.google.android.libraries.micore.learning.a.p r6 = r2.f391487b     // Catch:{ RemoteException -> 0x03da }
            com.google.android.libraries.micore.learning.a.j r6 = r6.f80461l     // Catch:{ RemoteException -> 0x03da }
            if (r6 != 0) goto L_0x026c
            com.google.android.libraries.micore.learning.a.j r11 = com.google.android.libraries.micore.learning.p2258a.C29700j.f80437f     // Catch:{ RemoteException -> 0x03da }
            goto L_0x026d
        L_0x026c:
            r11 = r6
        L_0x026d:
            boolean r11 = r11.f80441c     // Catch:{ RemoteException -> 0x03da }
            if (r6 != 0) goto L_0x0273
            com.google.android.libraries.micore.learning.a.j r6 = com.google.android.libraries.micore.learning.p2258a.C29700j.f80437f     // Catch:{ RemoteException -> 0x03da }
        L_0x0273:
            boolean r6 = r6.f80442d     // Catch:{ RemoteException -> 0x03da }
            r16 = r6
            r6 = r3
            r3 = r8
            r8 = r9
            r9 = r18
            r20 = r10
            r10 = r11
            r11 = r16
            r12 = r19
            r13 = r3
            r4.mo120158f(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ RemoteException -> 0x03d8 }
            goto L_0x02c8
        L_0x0288:
            r3 = r8
            r20 = r10
            com.google.android.gms.learning.dynamite.training.l r4 = r2.f391491f     // Catch:{ RemoteException -> 0x03d8 }
            com.google.android.libraries.micore.learning.a.p r6 = r2.f391487b     // Catch:{ RemoteException -> 0x03d8 }
            int r7 = r6.f80450a     // Catch:{ RemoteException -> 0x03d8 }
            if (r7 != r9) goto L_0x0298
            java.lang.Object r6 = r6.f80451b     // Catch:{ RemoteException -> 0x03d8 }
            com.google.android.libraries.micore.learning.a.g r6 = (com.google.android.libraries.micore.learning.p2258a.C29697g) r6     // Catch:{ RemoteException -> 0x03d8 }
            goto L_0x029a
        L_0x0298:
            com.google.android.libraries.micore.learning.a.g r6 = com.google.android.libraries.micore.learning.p2258a.C29697g.f80430f     // Catch:{ RemoteException -> 0x03d8 }
        L_0x029a:
            java.lang.String r6 = r6.f80432a     // Catch:{ RemoteException -> 0x03d8 }
            com.google.android.libraries.micore.learning.a.p r7 = r2.f391487b     // Catch:{ RemoteException -> 0x03d8 }
            int r8 = r7.f80450a     // Catch:{ RemoteException -> 0x03d8 }
            if (r8 != r9) goto L_0x02a7
            java.lang.Object r10 = r7.f80451b     // Catch:{ RemoteException -> 0x03d8 }
            com.google.android.libraries.micore.learning.a.g r10 = (com.google.android.libraries.micore.learning.p2258a.C29697g) r10     // Catch:{ RemoteException -> 0x03d8 }
            goto L_0x02a9
        L_0x02a7:
            com.google.android.libraries.micore.learning.a.g r10 = com.google.android.libraries.micore.learning.p2258a.C29697g.f80430f     // Catch:{ RemoteException -> 0x03d8 }
        L_0x02a9:
            java.lang.String r10 = r10.f80436e     // Catch:{ RemoteException -> 0x03d8 }
            if (r8 != r9) goto L_0x02b2
            java.lang.Object r8 = r7.f80451b     // Catch:{ RemoteException -> 0x03d8 }
            com.google.android.libraries.micore.learning.a.g r8 = (com.google.android.libraries.micore.learning.p2258a.C29697g) r8     // Catch:{ RemoteException -> 0x03d8 }
            goto L_0x02b4
        L_0x02b2:
            com.google.android.libraries.micore.learning.a.g r8 = com.google.android.libraries.micore.learning.p2258a.C29697g.f80430f     // Catch:{ RemoteException -> 0x03d8 }
        L_0x02b4:
            java.lang.String r8 = r8.f80434c     // Catch:{ RemoteException -> 0x03d8 }
            com.google.android.libraries.micore.learning.a.j r7 = r7.f80461l     // Catch:{ RemoteException -> 0x03d8 }
            if (r7 != 0) goto L_0x02bc
            com.google.android.libraries.micore.learning.a.j r7 = com.google.android.libraries.micore.learning.p2258a.C29700j.f80437f     // Catch:{ RemoteException -> 0x03d8 }
        L_0x02bc:
            boolean r11 = r7.f80441c     // Catch:{ RemoteException -> 0x03d8 }
            r7 = r10
            r9 = r18
            r10 = r11
            r11 = r19
            r12 = r3
            r4.mo120159g(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ RemoteException -> 0x03d8 }
        L_0x02c8:
            monitor-exit(r17)     // Catch:{ all -> 0x03d6 }
            com.google.android.gms.learning.b r3 = r1.f391497f     // Catch:{ InterruptedException -> 0x03a8, TimeoutException -> 0x0384, ExecutionException -> 0x037b }
            long r3 = r3.mo119945F()     // Catch:{ InterruptedException -> 0x03a8, TimeoutException -> 0x0384, ExecutionException -> 0x037b }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x03a8, TimeoutException -> 0x0384, ExecutionException -> 0x037b }
            java.lang.Object r0 = r0.get(r3, r5)     // Catch:{ InterruptedException -> 0x03a8, TimeoutException -> 0x0384, ExecutionException -> 0x037b }
            com.google.common.base.az r0 = (com.google.common.base.C58835az) r0     // Catch:{ InterruptedException -> 0x03a8, TimeoutException -> 0x0384, ExecutionException -> 0x037b }
            java.lang.Object r3 = r0.f156631a     // Catch:{ InterruptedException -> 0x03a8, TimeoutException -> 0x0384, ExecutionException -> 0x037b }
            byte[] r3 = (byte[]) r3     // Catch:{ InterruptedException -> 0x03a8, TimeoutException -> 0x0384, ExecutionException -> 0x037b }
            java.lang.Object r0 = r0.f156632b     // Catch:{ InterruptedException -> 0x03a8, TimeoutException -> 0x0384, ExecutionException -> 0x037b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ InterruptedException -> 0x03a8, TimeoutException -> 0x0384, ExecutionException -> 0x037b }
            int r0 = r0.intValue()     // Catch:{ InterruptedException -> 0x03a8, TimeoutException -> 0x0384, ExecutionException -> 0x037b }
            monitor-enter(r17)     // Catch:{ RuntimeException -> 0x0377, all -> 0x0373 }
            com.google.android.gms.learning.dynamite.training.bs r4 = r1.f391494c     // Catch:{ all -> 0x035f }
            if (r4 == r2) goto L_0x02fc
            monitor-exit(r17)     // Catch:{ all -> 0x035f }
            com.google.android.gms.learning.n r0 = r1.f391499h
            r0.mo120056h(r15)
            r20.run()
            monitor-enter(r17)
            r4 = 1
            r5 = 0
            r1.mo120169d(r2, r14, r4, r5)     // Catch:{ all -> 0x02f9 }
            monitor-exit(r17)     // Catch:{ all -> 0x02f9 }
            return
        L_0x02f9:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x02f9 }
            throw r0
        L_0x02fc:
            r4 = 1
            r5 = 0
            r2.f391491f = r14     // Catch:{ all -> 0x035d }
            if (r3 != 0) goto L_0x031b
            com.google.android.gms.learning.n r0 = r1.f391499h     // Catch:{ all -> 0x035d }
            r3 = 1182(0x49e, float:1.656E-42)
            r0.mo120056h(r3)     // Catch:{ all -> 0x035d }
            monitor-exit(r17)     // Catch:{ all -> 0x035d }
            com.google.android.gms.learning.n r0 = r1.f391499h
            r0.mo120056h(r15)
            r20.run()
            monitor-enter(r17)
            r1.mo120169d(r2, r14, r4, r5)     // Catch:{ all -> 0x0318 }
            monitor-exit(r17)     // Catch:{ all -> 0x0318 }
            return
        L_0x0318:
            r0 = move-exception
            monitor-exit(r17)     // Catch:{ all -> 0x0318 }
            throw r0
        L_0x031b:
            com.google.as.a.a.a.b r6 = com.google.p3728as.p3729a.p3730a.p3731a.C48021b.f124266d     // Catch:{ ct -> 0x033a }
            com.google.protobuf.bv r3 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r6, (byte[]) r3)     // Catch:{ ct -> 0x033a }
            com.google.as.a.a.a.b r3 = (com.google.p3728as.p3729a.p3730a.p3731a.C48021b) r3     // Catch:{ ct -> 0x033a }
            r1.mo120169d(r2, r3, r0, r5)     // Catch:{ all -> 0x0337 }
            com.google.android.gms.learning.n r0 = r1.f391499h     // Catch:{ all -> 0x0337 }
            r3 = 1183(0x49f, float:1.658E-42)
            r0.mo120056h(r3)     // Catch:{ all -> 0x0337 }
            monitor-exit(r17)     // Catch:{ all -> 0x0337 }
            com.google.android.gms.learning.n r0 = r1.f391499h
            r0.mo120056h(r15)
            r20.run()
            return
        L_0x0337:
            r0 = move-exception
            r13 = 1
            goto L_0x0363
        L_0x033a:
            r0 = move-exception
            com.google.android.libraries.micore.learning.base.k r3 = f391492a     // Catch:{ all -> 0x035d }
            java.lang.String r6 = "Could not parse TaskRetry result proto"
            r3.mo34864f(r0, r6)     // Catch:{ all -> 0x035d }
            com.google.android.gms.learning.n r0 = r1.f391499h     // Catch:{ all -> 0x035d }
            r3 = 1181(0x49d, float:1.655E-42)
            r0.mo120056h(r3)     // Catch:{ all -> 0x035d }
            monitor-exit(r17)     // Catch:{ all -> 0x035d }
            com.google.android.gms.learning.n r0 = r1.f391499h
            r0.mo120056h(r15)
            r20.run()
            java.lang.Object r3 = f391493b
            monitor-enter(r3)
            r1.mo120169d(r2, r14, r4, r5)     // Catch:{ all -> 0x035a }
            monitor-exit(r3)     // Catch:{ all -> 0x035a }
            return
        L_0x035a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x035a }
            throw r0
        L_0x035d:
            r0 = move-exception
            goto L_0x0362
        L_0x035f:
            r0 = move-exception
            r4 = 1
            r5 = 0
        L_0x0362:
            r13 = 0
        L_0x0363:
            monitor-exit(r17)     // Catch:{ all -> 0x0371 }
            throw r0     // Catch:{ RuntimeException -> 0x036b, all -> 0x0365 }
        L_0x0365:
            r0 = move-exception
            r12 = r13
            r10 = r20
            goto L_0x04a5
        L_0x036b:
            r0 = move-exception
            r12 = r13
            r10 = r20
            goto L_0x049c
        L_0x0371:
            r0 = move-exception
            goto L_0x0363
        L_0x0373:
            r0 = move-exception
            r4 = 1
            r5 = 0
            goto L_0x03cd
        L_0x0377:
            r0 = move-exception
            r4 = 1
            r5 = 0
            goto L_0x03d2
        L_0x037b:
            r0 = move-exception
            r4 = 1
            r5 = 0
            com.google.common.util.concurrent.ec r3 = new com.google.common.util.concurrent.ec     // Catch:{ RuntimeException -> 0x03d1, all -> 0x03cc }
            r3.<init>(r0)     // Catch:{ RuntimeException -> 0x03d1, all -> 0x03cc }
            throw r3     // Catch:{ RuntimeException -> 0x03d1, all -> 0x03cc }
        L_0x0384:
            r0 = move-exception
            r4 = 1
            r5 = 0
            com.google.android.libraries.micore.learning.base.k r3 = f391492a     // Catch:{ RuntimeException -> 0x03d1, all -> 0x03cc }
            java.lang.String r6 = "Timed out while waiting for result callback"
            r3.mo34868j(r0, r6)     // Catch:{ RuntimeException -> 0x03d1, all -> 0x03cc }
            com.google.android.gms.learning.n r0 = r1.f391499h     // Catch:{ RuntimeException -> 0x03d1, all -> 0x03cc }
            r3 = 1184(0x4a0, float:1.659E-42)
            r0.mo120056h(r3)     // Catch:{ RuntimeException -> 0x03d1, all -> 0x03cc }
            com.google.android.gms.learning.n r0 = r1.f391499h
            r0.mo120056h(r15)
            r20.run()
            java.lang.Object r3 = f391493b
            monitor-enter(r3)
            r1.mo120169d(r2, r14, r4, r5)     // Catch:{ all -> 0x03a5 }
            monitor-exit(r3)     // Catch:{ all -> 0x03a5 }
            return
        L_0x03a5:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x03a5 }
            throw r0
        L_0x03a8:
            r0 = move-exception
            r4 = 1
            r5 = 0
            com.google.android.libraries.micore.learning.base.k r3 = f391492a     // Catch:{ RuntimeException -> 0x03d1, all -> 0x03cc }
            java.lang.String r6 = "Interrupted while waiting for result callback"
            r3.mo34868j(r0, r6)     // Catch:{ RuntimeException -> 0x03d1, all -> 0x03cc }
            com.google.android.gms.learning.n r0 = r1.f391499h     // Catch:{ RuntimeException -> 0x03d1, all -> 0x03cc }
            r3 = 1185(0x4a1, float:1.66E-42)
            r0.mo120056h(r3)     // Catch:{ RuntimeException -> 0x03d1, all -> 0x03cc }
            com.google.android.gms.learning.n r0 = r1.f391499h
            r0.mo120056h(r15)
            r20.run()
            java.lang.Object r3 = f391493b
            monitor-enter(r3)
            r1.mo120169d(r2, r14, r4, r5)     // Catch:{ all -> 0x03c9 }
            monitor-exit(r3)     // Catch:{ all -> 0x03c9 }
            return
        L_0x03c9:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x03c9 }
            throw r0
        L_0x03cc:
            r0 = move-exception
        L_0x03cd:
            r10 = r20
            goto L_0x0495
        L_0x03d1:
            r0 = move-exception
        L_0x03d2:
            r10 = r20
            goto L_0x049b
        L_0x03d6:
            r0 = move-exception
            goto L_0x0406
        L_0x03d8:
            r0 = move-exception
            goto L_0x03dd
        L_0x03da:
            r0 = move-exception
            r20 = r10
        L_0x03dd:
            r4 = 1
            r5 = 0
            com.google.android.libraries.micore.learning.base.k r3 = f391492a     // Catch:{ all -> 0x0401 }
            java.lang.String r6 = "Failed to call runTraining, process probably already died"
            r3.mo34868j(r0, r6)     // Catch:{ all -> 0x0401 }
            com.google.android.gms.learning.n r0 = r1.f391499h     // Catch:{ all -> 0x0401 }
            r3 = 1186(0x4a2, float:1.662E-42)
            r0.mo120056h(r3)     // Catch:{ all -> 0x0401 }
            monitor-exit(r17)     // Catch:{ all -> 0x0401 }
            com.google.android.gms.learning.n r0 = r1.f391499h
            r0.mo120056h(r15)
            r20.run()
            java.lang.Object r3 = f391493b
            monitor-enter(r3)
            r1.mo120169d(r2, r14, r4, r5)     // Catch:{ all -> 0x03fe }
            monitor-exit(r3)     // Catch:{ all -> 0x03fe }
            return
        L_0x03fe:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x03fe }
            throw r0
        L_0x0401:
            r0 = move-exception
            goto L_0x0408
        L_0x0403:
            r0 = move-exception
            r20 = r10
        L_0x0406:
            r4 = 1
            r5 = 0
        L_0x0408:
            r10 = r20
            goto L_0x0433
        L_0x040b:
            r0 = move-exception
            r3 = 1186(0x4a2, float:1.662E-42)
            r4 = 1
            r5 = 0
            com.google.android.libraries.micore.learning.base.k r6 = f391492a     // Catch:{ all -> 0x042d }
            java.lang.String r7 = "Could not link to death, process probably already died"
            r6.mo34868j(r0, r7)     // Catch:{ all -> 0x042d }
            com.google.android.gms.learning.n r0 = r1.f391499h     // Catch:{ all -> 0x042d }
            r0.mo120056h(r3)     // Catch:{ all -> 0x042d }
            monitor-exit(r17)     // Catch:{ all -> 0x042d }
            com.google.android.gms.learning.n r0 = r1.f391499h
            r0.mo120056h(r15)
            java.lang.Object r3 = f391493b
            monitor-enter(r3)
            r1.mo120169d(r2, r14, r4, r5)     // Catch:{ all -> 0x042a }
            monitor-exit(r3)     // Catch:{ all -> 0x042a }
            return
        L_0x042a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x042a }
            throw r0
        L_0x042d:
            r0 = move-exception
            goto L_0x0432
        L_0x042f:
            r0 = move-exception
            r4 = 1
            r5 = 0
        L_0x0432:
            r10 = r14
        L_0x0433:
            monitor-exit(r17)     // Catch:{ all -> 0x0439 }
            throw r0     // Catch:{ RuntimeException -> 0x0437, all -> 0x0435 }
        L_0x0435:
            r0 = move-exception
            goto L_0x0495
        L_0x0437:
            r0 = move-exception
            goto L_0x049b
        L_0x0439:
            r0 = move-exception
            goto L_0x0433
        L_0x043b:
            r0 = move-exception
            r4 = 1
            r5 = 0
            com.google.common.util.concurrent.ec r3 = new com.google.common.util.concurrent.ec     // Catch:{ RuntimeException -> 0x048d, all -> 0x048b }
            r3.<init>(r0)     // Catch:{ RuntimeException -> 0x048d, all -> 0x048b }
            throw r3     // Catch:{ RuntimeException -> 0x048d, all -> 0x048b }
        L_0x0444:
            r0 = move-exception
            r4 = 1
            r5 = 0
            com.google.android.gms.learning.n r3 = r1.f391499h     // Catch:{ RuntimeException -> 0x048d, all -> 0x048b }
            r6 = 1187(0x4a3, float:1.663E-42)
            r3.mo120056h(r6)     // Catch:{ RuntimeException -> 0x048d, all -> 0x048b }
            com.google.android.libraries.micore.learning.base.k r3 = f391492a     // Catch:{ RuntimeException -> 0x048d, all -> 0x048b }
            java.lang.String r6 = "Timed out while waiting for service connection"
            r3.mo34868j(r0, r6)     // Catch:{ RuntimeException -> 0x048d, all -> 0x048b }
            com.google.android.gms.learning.n r0 = r1.f391499h
            r0.mo120056h(r15)
            java.lang.Object r3 = f391493b
            monitor-enter(r3)
            r1.mo120169d(r2, r14, r4, r5)     // Catch:{ all -> 0x0462 }
            monitor-exit(r3)     // Catch:{ all -> 0x0462 }
            return
        L_0x0462:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0462 }
            throw r0
        L_0x0465:
            r0 = move-exception
            r4 = 1
            r5 = 0
            com.google.android.gms.learning.n r3 = r1.f391499h     // Catch:{ RuntimeException -> 0x048d, all -> 0x048b }
            r6 = 1188(0x4a4, float:1.665E-42)
            r3.mo120056h(r6)     // Catch:{ RuntimeException -> 0x048d, all -> 0x048b }
            com.google.android.libraries.micore.learning.base.k r3 = f391492a     // Catch:{ RuntimeException -> 0x048d, all -> 0x048b }
            java.lang.String r6 = "Interrupted while waiting for service connection"
            r3.mo34868j(r0, r6)     // Catch:{ RuntimeException -> 0x048d, all -> 0x048b }
            com.google.android.gms.learning.n r0 = r1.f391499h
            r0.mo120056h(r15)
            java.lang.Object r3 = f391493b
            monitor-enter(r3)
            r1.mo120169d(r2, r14, r4, r5)     // Catch:{ all -> 0x0483 }
            monitor-exit(r3)     // Catch:{ all -> 0x0483 }
            return
        L_0x0483:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0483 }
            throw r0
        L_0x0486:
            r0 = move-exception
            r4 = 1
            r5 = 0
        L_0x0489:
            monitor-exit(r17)     // Catch:{ all -> 0x048f }
            throw r0     // Catch:{ RuntimeException -> 0x048d, all -> 0x048b }
        L_0x048b:
            r0 = move-exception
            goto L_0x0494
        L_0x048d:
            r0 = move-exception
            goto L_0x049a
        L_0x048f:
            r0 = move-exception
            goto L_0x0489
        L_0x0491:
            r0 = move-exception
            r4 = 1
            r5 = 0
        L_0x0494:
            r10 = r14
        L_0x0495:
            r12 = 0
            goto L_0x04a5
        L_0x0497:
            r0 = move-exception
            r4 = 1
            r5 = 0
        L_0x049a:
            r10 = r14
        L_0x049b:
            r12 = 0
        L_0x049c:
            com.google.android.gms.learning.n r3 = r1.f391499h     // Catch:{ all -> 0x04a4 }
            r6 = 1180(0x49c, float:1.654E-42)
            r3.mo120056h(r6)     // Catch:{ all -> 0x04a4 }
            throw r0     // Catch:{ all -> 0x04a4 }
        L_0x04a4:
            r0 = move-exception
        L_0x04a5:
            com.google.android.gms.learning.n r3 = r1.f391499h
            r3.mo120056h(r15)
            if (r10 == 0) goto L_0x04af
            r10.run()
        L_0x04af:
            if (r12 != 0) goto L_0x04bc
            java.lang.Object r3 = f391493b
            monitor-enter(r3)
            r1.mo120169d(r2, r14, r4, r5)     // Catch:{ all -> 0x04b9 }
            monitor-exit(r3)     // Catch:{ all -> 0x04b9 }
            goto L_0x04bc
        L_0x04b9:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x04b9 }
            throw r0
        L_0x04bc:
            goto L_0x04be
        L_0x04bd:
            throw r0
        L_0x04be:
            goto L_0x04bd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.dynamite.training.C144704bt.mo120168c(com.google.android.gms.learning.dynamite.training.bs):void");
    }

    /* renamed from: d */
    public final void mo120169d(C144703bs bsVar, C48021b bVar, int i, boolean z) {
        if (this.f391494c == bsVar) {
            this.f391494c = null;
            if (bVar == null) {
                C29719k kVar = f391492a;
                String valueOf = String.valueOf(bsVar.f391491f);
                kVar.mo34866h("Cancelling: " + valueOf + " - " + z);
                C144716l lVar = bsVar.f391491f;
                if (lVar != null) {
                    try {
                        lVar.mo120157e();
                    } catch (RemoteException unused) {
                    }
                }
                if (z) {
                    bsVar.f391489d.cancel(true);
                }
            }
            ServiceConnection serviceConnection = bsVar.f391490e;
            if (serviceConnection != null) {
                this.f391501j.f391420a.unbindService(serviceConnection);
            }
            C29706p pVar = bsVar.f391487b;
            C60856cj.m92910s(this.f391498g.mo120070k(bsVar.f391486a, pVar.f80453d, m235207a(pVar), bVar, i));
            this.f391501j.f391420a.jobFinished((JobParameters) bsVar.f391488c, false);
        }
    }

    /* renamed from: e */
    public final boolean mo120170e(boolean z, String str, C29700j jVar) {
        Set<C29760e> set;
        if (z) {
            set = this.f391502k.mo34930a(jVar, str);
        } else {
            set = this.f391502k.mo34931b(jVar, str);
        }
        for (C29760e ordinal : set) {
            C29760e eVar = C29760e.BATTERY_NOT_OK;
            int ordinal2 = ordinal.ordinal();
            if (ordinal2 == 0) {
                this.f391499h.mo120056h(1178);
            } else if (ordinal2 == 1) {
                this.f391499h.mo120056h(1179);
            } else if (ordinal2 == 2) {
                this.f391499h.mo120056h(1177);
            } else if (ordinal2 == 3) {
                this.f391499h.mo120056h(1121);
            }
        }
        return set.isEmpty();
    }
}
