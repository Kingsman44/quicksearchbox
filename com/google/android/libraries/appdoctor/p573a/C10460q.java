package com.google.android.libraries.appdoctor.p573a;

import com.google.android.libraries.appdoctor.C10462b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.libraries.appdoctor.a.q */
/* compiled from: PG */
public final class C10460q {

    /* renamed from: a */
    private final List f35217a;

    /* renamed from: b */
    private final C10462b f35218b;

    public C10460q() {
        this((C10462b) null);
    }

    /* renamed from: a */
    public final C10459p mo18503a(C10454k kVar) {
        C60870cx cxVar;
        boolean z;
        C60870cx cxVar2;
        C58485gu<C10452i> j = C58485gu.m89842j(this.f35217a);
        ArrayList arrayList = new ArrayList(j.size());
        try {
            for (C10452i b : j) {
                if (b.mo18494b(kVar)) {
                    C10457n nVar = new C10457n(kVar.f35203b);
                    boolean z2 = false;
                    boolean z3 = false;
                    for (C10452i iVar : j) {
                        C10453j jVar = new C10453j(kVar);
                        jVar.f35201g = iVar;
                        C10454k a = jVar.mo18496a();
                        if (!iVar.mo18494b(a)) {
                            cxVar2 = C60856cj.m92900i(C10451h.f35183a);
                            z = false;
                        } else {
                            C10453j jVar2 = new C10453j(a);
                            jVar2.mo18497b(new C10449f(iVar.f35190e.f35176a, 3));
                            C10454k a2 = jVar2.mo18496a();
                            iVar.mo18495c(a2, iVar.f35190e, nVar);
                            if (iVar.f35191f) {
                                cxVar2 = C10446c.m25414a(new C10450g(iVar, a2, nVar));
                            } else {
                                cxVar2 = C60856cj.m92900i(iVar.mo18493a(a2, nVar, iVar.f35190e));
                            }
                            z = true;
                        }
                        z3 |= z;
                        z2 |= !cxVar2.isDone();
                        arrayList.add(cxVar2);
                    }
                    if (!z2) {
                        cxVar = C60866ct.f164955a;
                        mo18505c(arrayList);
                    } else {
                        cxVar = C10446c.m25414a(Executors.callable(new C10458o(this, arrayList)));
                    }
                    return new C10459p(z3, cxVar);
                }
            }
            return new C10459p(false, C60866ct.f164955a);
        } catch (RuntimeException e) {
            C10447d.m25415a(e, kVar.f35202a, "AppDoctorFixerFramework");
            return new C10459p(false, C60856cj.m92899h(e));
        }
    }

    /* renamed from: b */
    public final void mo18504b(C10452i iVar) {
        C58838bb.m90884s(!this.f35217a.contains(iVar), "The same fixer cannot be added twice");
        this.f35217a.add(iVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = r1.f35203b;
        r4 = (com.google.android.gms.p10747b.p10748a.C142968p) com.google.android.gms.p10747b.p10748a.C142969q.f387920d.createBuilder();
        r5 = r0.f35184b.f35188c;
        r4.copyOnWrite();
        ((com.google.android.gms.p10747b.p10748a.C142969q) r4.instance).f387922a = r5.getNumber();
        r5 = r0.f35184b.f35187b;
        r4.copyOnWrite();
        r5.getClass();
        ((com.google.android.gms.p10747b.p10748a.C142969q) r4.instance).f387924c = r5;
        r2.mo18511e(r3, (com.google.android.gms.p10747b.p10748a.C142969q) r4.build(), r1.f35202a);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0062 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18505c(java.util.List r9) {
        /*
            r8 = this;
            java.util.Iterator r9 = r9.iterator()
        L_0x0004:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r0 = r9.next()
            com.google.common.util.concurrent.cx r0 = (com.google.common.util.concurrent.C60870cx) r0
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            com.google.android.libraries.appdoctor.a.h r0 = (com.google.android.libraries.appdoctor.p573a.C10451h) r0     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            com.google.android.libraries.appdoctor.b r1 = r8.f35218b     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            if (r1 == 0) goto L_0x0098
            com.google.android.libraries.appdoctor.d r2 = r1.f35219a     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            com.google.android.libraries.appdoctor.h r3 = r1.f35220b     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            com.google.android.libraries.appdoctor.a.k r1 = r1.f35221c     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            com.google.android.libraries.appdoctor.a.k r4 = r0.f35185c     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.libraries.appdoctor.a.i r5 = r0.f35184b     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.gms.b.a.b r5 = r5.f35188c     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.libraries.appdoctor.a.f r4 = r4.mo18499a(r5)     // Catch:{ RemoteException -> 0x0062 }
            int r4 = r4.f35179b     // Catch:{ RemoteException -> 0x0062 }
            r5 = 5
            r6 = 0
            java.lang.String r7 = "com.google.android.gms.common.appdoctor.uuid"
            if (r4 == r5) goto L_0x004a
            com.google.android.libraries.appdoctor.a.i r4 = r0.f35184b     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r4 = r4.f35187b     // Catch:{ RemoteException -> 0x0062 }
            r5 = r3
            com.google.android.libraries.appdoctor.e r5 = (com.google.android.libraries.appdoctor.C10477e) r5     // Catch:{ RemoteException -> 0x0062 }
            android.os.Bundle r5 = r5.mo18514a()     // Catch:{ RemoteException -> 0x0062 }
            r5.putString(r7, r4)     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.libraries.appdoctor.e r3 = (com.google.android.libraries.appdoctor.C10477e) r3     // Catch:{ RemoteException -> 0x0062 }
            android.content.ContentProviderClient r3 = r3.f35245b     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r4 = "mark_fix_attempted"
            r3.call(r4, r6, r5)     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0098
        L_0x004a:
            com.google.android.libraries.appdoctor.a.i r4 = r0.f35184b     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r4 = r4.f35187b     // Catch:{ RemoteException -> 0x0062 }
            r5 = r3
            com.google.android.libraries.appdoctor.e r5 = (com.google.android.libraries.appdoctor.C10477e) r5     // Catch:{ RemoteException -> 0x0062 }
            android.os.Bundle r5 = r5.mo18514a()     // Catch:{ RemoteException -> 0x0062 }
            r5.putString(r7, r4)     // Catch:{ RemoteException -> 0x0062 }
            com.google.android.libraries.appdoctor.e r3 = (com.google.android.libraries.appdoctor.C10477e) r3     // Catch:{ RemoteException -> 0x0062 }
            android.content.ContentProviderClient r3 = r3.f35245b     // Catch:{ RemoteException -> 0x0062 }
            java.lang.String r4 = "mark_fix_completed"
            r3.call(r4, r6, r5)     // Catch:{ RemoteException -> 0x0062 }
            goto L_0x0098
        L_0x0062:
            android.content.Context r3 = r1.f35203b     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            com.google.android.gms.b.a.q r4 = com.google.android.gms.p10747b.p10748a.C142969q.f387920d     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            com.google.android.gms.b.a.p r4 = (com.google.android.gms.p10747b.p10748a.C142968p) r4     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            com.google.android.libraries.appdoctor.a.i r5 = r0.f35184b     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            com.google.android.gms.b.a.b r5 = r5.f35188c     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            r4.copyOnWrite()     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            com.google.protobuf.bv r6 = r4.instance     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            com.google.android.gms.b.a.q r6 = (com.google.android.gms.p10747b.p10748a.C142969q) r6     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            int r5 = r5.getNumber()     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            r6.f387922a = r5     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            com.google.android.libraries.appdoctor.a.i r5 = r0.f35184b     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            java.lang.String r5 = r5.f35187b     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            r4.copyOnWrite()     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            com.google.protobuf.bv r6 = r4.instance     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            com.google.android.gms.b.a.q r6 = (com.google.android.gms.p10747b.p10748a.C142969q) r6     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            r5.getClass()     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            r6.f387924c = r5     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            com.google.android.gms.b.a.q r4 = (com.google.android.gms.p10747b.p10748a.C142969q) r4     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            com.google.common.o.l.w r1 = r1.f35202a     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            r2.mo18511e(r3, r4, r1)     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
        L_0x0098:
            com.google.android.libraries.appdoctor.a.k r0 = r0.f35185c     // Catch:{ InterruptedException -> 0x00a0, ExecutionException -> 0x009e, CancellationException -> 0x009c }
            goto L_0x0004
        L_0x009c:
            r0 = move-exception
            goto L_0x00a1
        L_0x009e:
            r0 = move-exception
            goto L_0x00a1
        L_0x00a0:
            r0 = move-exception
        L_0x00a1:
            java.lang.String r1 = "AppDoctorFixerFramework"
            java.lang.String r2 = "applyFixes future failed"
            android.util.Log.e(r1, r2, r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x0004
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.appdoctor.p573a.C10460q.mo18505c(java.util.List):void");
    }

    public C10460q(C10462b bVar) {
        this.f35217a = new ArrayList();
        this.f35218b = bVar;
    }
}
