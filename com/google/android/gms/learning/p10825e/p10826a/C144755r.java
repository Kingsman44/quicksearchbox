package com.google.android.gms.learning.p10825e.p10826a;

import android.content.Context;
import com.google.android.gms.learning.C144573b;
import com.google.android.gms.learning.C144827n;
import com.google.android.libraries.micore.learning.base.C29719k;
import java.util.List;

/* renamed from: com.google.android.gms.learning.e.a.r */
/* compiled from: PG */
public final class C144755r {

    /* renamed from: a */
    public final C144827n f391599a;

    /* renamed from: b */
    public final C29719k f391600b;

    /* renamed from: c */
    private final Context f391601c;

    /* renamed from: d */
    private final List f391602d;

    /* renamed from: e */
    private final C144573b f391603e;

    public C144755r(Context context, List list, C144827n nVar, C144573b bVar, C29719k kVar) {
        this.f391601c = context;
        this.f391602d = list;
        this.f391599a = nVar;
        this.f391603e = bVar;
        this.f391600b = kVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e0, code lost:
        if (r5 != null) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x020a, code lost:
        if (r5 != null) goto L_0x01e2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:100:0x0221 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:82:0x01e6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x0210 */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ef A[Catch:{ all -> 0x01f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0202 A[Catch:{ all -> 0x01f0 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:97:0x0210=Splitter:B:97:0x0210, B:100:0x0221=Splitter:B:100:0x0221, B:82:0x01e6=Splitter:B:82:0x01e6} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo120185a(java.lang.String r21, com.google.android.gms.learning.dynamite.training.C144706bv r22, byte[] r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r23
            com.google.common.util.concurrent.SettableFuture r3 = new com.google.common.util.concurrent.SettableFuture
            r3.<init>()
            com.google.android.gms.learning.e.a.p r4 = new com.google.android.gms.learning.e.a.p
            r4.<init>(r3)
            java.lang.String r5 = android.net.Uri.encode(r21)
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            android.content.Context r7 = r1.f391601c
            java.lang.String r7 = r7.getPackageName()
            java.lang.String r8 = "com.google.android.gms"
            boolean r7 = r8.equals(r7)
            r9 = 0
            r10 = 2
            r11 = 1
            if (r7 == 0) goto L_0x005a
            java.util.List r5 = r1.f391602d
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0033
            return r10
        L_0x0033:
            java.util.List r5 = r1.f391602d
            java.lang.Object r5 = r5.get(r9)
            com.google.android.gms.learning.ExampleConsumption r5 = (com.google.android.gms.learning.ExampleConsumption) r5
            java.lang.String r5 = r5.f391066a
            java.lang.String r5 = com.google.android.gms.learning.p10825e.p10826a.C144750m.m235266d(r5)
            java.lang.Object[] r7 = new java.lang.Object[r11]
            r7[r9] = r5
            java.lang.String r5 = "com.google.android.gms.learning.%s.COMPUTATION_RESULT"
            java.lang.String r5 = java.lang.String.format(r5, r7)
            android.content.Intent r5 = r6.setAction(r5)
            android.content.ComponentName r7 = new android.content.ComponentName
            java.lang.String r12 = "com.google.android.gms.chimera.GmsInternalBoundBrokerService"
            r7.<init>(r8, r12)
            r5.setComponent(r7)
            goto L_0x008a
        L_0x005a:
            android.content.Context r7 = r1.f391601c
            java.lang.String r7 = r7.getPackageName()
            android.content.Intent r7 = r6.setPackage(r7)
            java.lang.String r8 = "com.google.android.gms.learning.COMPUTATION_RESULT"
            android.content.Intent r7 = r7.setAction(r8)
            android.net.Uri$Builder r8 = new android.net.Uri$Builder
            r8.<init>()
            java.lang.String r12 = "app"
            android.net.Uri$Builder r8 = r8.scheme(r12)
            android.content.Context r12 = r1.f391601c
            java.lang.String r12 = r12.getPackageName()
            android.net.Uri$Builder r8 = r8.authority(r12)
            android.net.Uri$Builder r5 = r8.path(r5)
            android.net.Uri r5 = r5.build()
            r7.setData(r5)
        L_0x008a:
            r5 = 0
            android.content.Context r7 = r1.f391601c     // Catch:{ all -> 0x022d }
            boolean r6 = r7.bindService(r6, r4, r11)     // Catch:{ all -> 0x022d }
            if (r6 != 0) goto L_0x00a8
            com.google.android.gms.learning.n r0 = r1.f391599a     // Catch:{ all -> 0x022d }
            r2 = 1140(0x474, float:1.597E-42)
            r0.mo120056h(r2)     // Catch:{ all -> 0x022d }
            com.google.android.gms.learning.b r0 = r1.f391603e
            boolean r0 = r0.mo119987aU()
            if (r0 == 0) goto L_0x00a7
            android.content.Context r0 = r1.f391601c
            r0.unbindService(r4)
        L_0x00a7:
            return r10
        L_0x00a8:
            com.google.android.gms.learning.b r6 = r1.f391603e     // Catch:{ TimeoutException -> 0x0221, InterruptedException -> 0x0210, ExecutionException -> 0x020d }
            long r6 = r6.mo119955P()     // Catch:{ TimeoutException -> 0x0221, InterruptedException -> 0x0210, ExecutionException -> 0x020d }
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ TimeoutException -> 0x0221, InterruptedException -> 0x0210, ExecutionException -> 0x020d }
            java.lang.Object r3 = r3.get(r6, r8)     // Catch:{ TimeoutException -> 0x0221, InterruptedException -> 0x0210, ExecutionException -> 0x020d }
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch:{ TimeoutException -> 0x0221, InterruptedException -> 0x0210, ExecutionException -> 0x020d }
            if (r3 != 0) goto L_0x00ba
            r6 = r5
            goto L_0x00cc
        L_0x00ba:
            java.lang.String r6 = "com.google.android.gms.learning.internal.training.IInAppResultHandler"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)     // Catch:{ all -> 0x01f0 }
            boolean r7 = r6 instanceof com.google.android.gms.learning.internal.training.C144808l     // Catch:{ all -> 0x01f0 }
            if (r7 == 0) goto L_0x00c7
            com.google.android.gms.learning.internal.training.l r6 = (com.google.android.gms.learning.internal.training.C144808l) r6     // Catch:{ all -> 0x01f0 }
            goto L_0x00cc
        L_0x00c7:
            com.google.android.gms.learning.internal.training.j r6 = new com.google.android.gms.learning.internal.training.j     // Catch:{ all -> 0x01f0 }
            r6.<init>(r3)     // Catch:{ all -> 0x01f0 }
        L_0x00cc:
            com.google.common.util.concurrent.SettableFuture r7 = new com.google.common.util.concurrent.SettableFuture     // Catch:{ all -> 0x01f0 }
            r7.<init>()     // Catch:{ all -> 0x01f0 }
            com.google.android.gms.learning.e.a.q r8 = new com.google.android.gms.learning.e.a.q     // Catch:{ all -> 0x01f0 }
            r8.<init>(r7)     // Catch:{ all -> 0x01f0 }
            com.google.android.gms.learning.e.a.n r12 = new com.google.android.gms.learning.e.a.n     // Catch:{ RemoteException -> 0x0203, InterruptedException -> 0x01f2, TimeoutException -> 0x01e6, ExecutionException -> 0x01df }
            r12.<init>(r1, r7)     // Catch:{ RemoteException -> 0x0203, InterruptedException -> 0x01f2, TimeoutException -> 0x01e6, ExecutionException -> 0x01df }
            r3.linkToDeath(r12, r9)     // Catch:{ RemoteException -> 0x0203, InterruptedException -> 0x01f2, TimeoutException -> 0x01e6, ExecutionException -> 0x01df }
            com.google.android.gms.learning.e.a.o r13 = new com.google.android.gms.learning.e.a.o     // Catch:{ RemoteException -> 0x0203, InterruptedException -> 0x01f2, TimeoutException -> 0x01e6, ExecutionException -> 0x01df }
            r13.<init>(r3, r12)     // Catch:{ RemoteException -> 0x0203, InterruptedException -> 0x01f2, TimeoutException -> 0x01e6, ExecutionException -> 0x01df }
            int r3 = r6.mo120230a()     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            if (r3 <= 0) goto L_0x0174
            int r3 = r22.mo120140b()     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            int r12 = r3 + -1
            if (r3 == 0) goto L_0x0173
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r12 == 0) goto L_0x0139
            if (r12 != r11) goto L_0x0131
            com.google.android.libraries.micore.learning.a.g r5 = r22.mo120151c()     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            com.google.android.gms.learning.j r12 = new com.google.android.gms.learning.j     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            r12.<init>()     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            r12.f391654a = r3     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            r12.f391655b = r9     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            r12.mo120237e(r0)     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            com.google.android.libraries.micore.learning.a.m r0 = r5.f80435d     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            if (r0 != 0) goto L_0x010e
            com.google.android.libraries.micore.learning.a.m r0 = com.google.android.libraries.micore.learning.p2258a.C29703m.f80444c     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
        L_0x010e:
            com.google.android.gms.learning.TrainingInterval r0 = com.google.android.gms.learning.dynamite.training.C144691bg.m235192a(r0)     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            r12.f391658e = r0     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            r12.mo120234b(r2)     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            java.lang.String r0 = r5.f80432a     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            java.lang.String r2 = r5.f80436e     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            java.lang.String r3 = r5.f80434c     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            r12.mo120236d(r0, r2, r3)     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            com.google.android.gms.learning.InAppTrainerOptions r0 = r12.mo120233a()     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            goto L_0x015f
        L_0x0131:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            java.lang.String r2 = "Unsupported training task type."
            r0.<init>(r2)     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            throw r0     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
        L_0x0139:
            com.google.android.libraries.micore.learning.a.e r5 = r22.mo120139a()     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            com.google.android.gms.learning.j r12 = new com.google.android.gms.learning.j     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            r12.<init>()     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            r12.f391654a = r3     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            r12.f391655b = r9     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            java.lang.String r3 = r5.f80427a     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            r12.mo120235c(r3)     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            r12.mo120237e(r0)     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            r12.mo120234b(r2)     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            com.google.android.libraries.micore.learning.a.m r0 = r5.f80429c     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            if (r0 == 0) goto L_0x015b
            com.google.android.gms.learning.TrainingInterval r0 = com.google.android.gms.learning.dynamite.training.C144691bg.m235192a(r0)     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            r12.f391658e = r0     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
        L_0x015b:
            com.google.android.gms.learning.InAppTrainerOptions r0 = r12.mo120233a()     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
        L_0x015f:
            java.util.List r2 = r1.f391602d     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            r6.mo120231b(r0, r11, r2, r8)     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            com.google.android.gms.learning.b r0 = r1.f391603e     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            long r2 = r0.mo119956Q()     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            java.lang.Object r0 = r7.get(r2, r0)     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            com.google.android.gms.common.api.Status r0 = (com.google.android.gms.common.api.Status) r0     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            goto L_0x018a
        L_0x0173:
            throw r5     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
        L_0x0174:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            r15 = 1
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r14 = r0
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            com.google.android.gms.learning.n r2 = r1.f391599a     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            r3 = 1127(0x467, float:1.579E-42)
            r2.mo120056h(r3)     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
        L_0x018a:
            if (r0 == 0) goto L_0x01be
            int r0 = r0.f389621g     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            r2 = 1102(0x44e, float:1.544E-42)
            if (r0 == 0) goto L_0x01ab
            r3 = 25002(0x61aa, float:3.5035E-41)
            if (r0 == r3) goto L_0x0197
            goto L_0x01be
        L_0x0197:
            com.google.android.gms.learning.n r0 = r1.f391599a     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            r0.mo120055g(r2)     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            r13.run()
            com.google.android.gms.learning.b r0 = r1.f391603e
            r0.mo119987aU()
            android.content.Context r0 = r1.f391601c
            r0.unbindService(r4)
            r0 = 3
            return r0
        L_0x01ab:
            com.google.android.gms.learning.n r0 = r1.f391599a     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            r0.mo120055g(r2)     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            r13.run()
            com.google.android.gms.learning.b r0 = r1.f391603e
            r0.mo119987aU()
            android.content.Context r0 = r1.f391601c
            r0.unbindService(r4)
            return r11
        L_0x01be:
            com.google.android.gms.learning.n r0 = r1.f391599a     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            r2 = 1141(0x475, float:1.599E-42)
            r0.mo120056h(r2)     // Catch:{ RemoteException -> 0x01dd, InterruptedException -> 0x01db, TimeoutException -> 0x01d9, ExecutionException -> 0x01d6, all -> 0x01d3 }
            r13.run()
        L_0x01c8:
            com.google.android.gms.learning.b r0 = r1.f391603e
        L_0x01ca:
            r0.mo119987aU()
            android.content.Context r0 = r1.f391601c
            r0.unbindService(r4)
            return r10
        L_0x01d3:
            r0 = move-exception
            r5 = r13
            goto L_0x022b
        L_0x01d6:
            r5 = r13
            goto L_0x01e0
        L_0x01d9:
            r5 = r13
            goto L_0x01e6
        L_0x01db:
            r5 = r13
            goto L_0x01f2
        L_0x01dd:
            r5 = r13
            goto L_0x0203
        L_0x01df:
        L_0x01e0:
            if (r5 == 0) goto L_0x01c8
        L_0x01e2:
            r5.run()
            goto L_0x01c8
        L_0x01e6:
            com.google.android.gms.learning.n r0 = r1.f391599a     // Catch:{ all -> 0x01f0 }
            r2 = 1136(0x470, float:1.592E-42)
            r0.mo120056h(r2)     // Catch:{ all -> 0x01f0 }
            if (r5 == 0) goto L_0x01c8
            goto L_0x01e2
        L_0x01f0:
            r0 = move-exception
            goto L_0x022b
        L_0x01f2:
            com.google.android.gms.learning.n r0 = r1.f391599a     // Catch:{ all -> 0x01f0 }
            r2 = 1135(0x46f, float:1.59E-42)
            r0.mo120056h(r2)     // Catch:{ all -> 0x01f0 }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x01f0 }
            r0.interrupt()     // Catch:{ all -> 0x01f0 }
            if (r5 == 0) goto L_0x01c8
            goto L_0x01e2
        L_0x0203:
            com.google.android.gms.learning.n r0 = r1.f391599a     // Catch:{ all -> 0x01f0 }
            r2 = 1137(0x471, float:1.593E-42)
            r0.mo120056h(r2)     // Catch:{ all -> 0x01f0 }
            if (r5 == 0) goto L_0x01c8
            goto L_0x01e2
        L_0x020d:
            com.google.android.gms.learning.b r0 = r1.f391603e
            goto L_0x01ca
        L_0x0210:
            com.google.android.gms.learning.n r0 = r1.f391599a     // Catch:{ all -> 0x01f0 }
            r2 = 1138(0x472, float:1.595E-42)
            r0.mo120056h(r2)     // Catch:{ all -> 0x01f0 }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x01f0 }
            r0.interrupt()     // Catch:{ all -> 0x01f0 }
            com.google.android.gms.learning.b r0 = r1.f391603e
            goto L_0x01ca
        L_0x0221:
            com.google.android.gms.learning.n r0 = r1.f391599a     // Catch:{ all -> 0x01f0 }
            r2 = 1139(0x473, float:1.596E-42)
            r0.mo120056h(r2)     // Catch:{ all -> 0x01f0 }
            com.google.android.gms.learning.b r0 = r1.f391603e
            goto L_0x01ca
        L_0x022b:
            r9 = 1
            goto L_0x022e
        L_0x022d:
            r0 = move-exception
        L_0x022e:
            if (r5 == 0) goto L_0x0233
            r5.run()
        L_0x0233:
            com.google.android.gms.learning.b r2 = r1.f391603e
            boolean r2 = r2.mo119987aU()
            if (r2 != 0) goto L_0x023d
            if (r9 == 0) goto L_0x0242
        L_0x023d:
            android.content.Context r2 = r1.f391601c
            r2.unbindService(r4)
        L_0x0242:
            goto L_0x0244
        L_0x0243:
            throw r0
        L_0x0244:
            goto L_0x0243
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.p10825e.p10826a.C144755r.mo120185a(java.lang.String, com.google.android.gms.learning.dynamite.training.bv, byte[]):int");
    }
}
