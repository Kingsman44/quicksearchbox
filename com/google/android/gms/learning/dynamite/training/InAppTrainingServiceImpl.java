package com.google.android.gms.learning.dynamite.training;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.RemoteException;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.util.C144005e;
import com.google.android.gms.learning.C144573b;
import com.google.android.gms.learning.C144827n;
import com.google.android.gms.learning.dynamite.C144655s;
import com.google.android.gms.learning.internal.training.C144802f;
import com.google.android.gms.learning.internal.training.C144816t;
import com.google.android.gms.learning.p10825e.p10826a.C144738a;
import com.google.android.gms.learning.p10825e.p10826a.C144740c;
import com.google.android.gms.learning.p10825e.p10826a.C144755r;
import com.google.android.gms.libs.p10835c.C144854b;
import com.google.android.gms.libs.p10836d.p10839c.C144859a;
import com.google.android.gms.libs.p10836d.p10839c.C144860b;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.gms.p10793f.C144166k;
import com.google.android.libraries.micore.learning.base.C29711c;
import com.google.android.libraries.micore.learning.base.C29712d;
import com.google.android.libraries.micore.learning.base.C29715g;
import com.google.android.libraries.micore.learning.base.C29717i;
import com.google.android.libraries.micore.learning.base.C29719k;
import com.google.android.libraries.micore.learning.p2258a.C29693c;
import com.google.android.libraries.micore.learning.p2258a.C29694d;
import com.google.android.libraries.micore.learning.p2258a.C29695e;
import com.google.android.libraries.micore.learning.p2258a.C29700j;
import com.google.android.libraries.micore.learning.training.C29727c;
import com.google.android.libraries.micore.learning.training.C29728d;
import com.google.android.libraries.micore.learning.training.nflrunner.C29754l;
import com.google.android.libraries.micore.learning.training.nflrunner.NativeFLRunnerWrapper;
import com.google.android.libraries.micore.learning.training.nflrunner.NativeLCRunnerWrapper;
import com.google.android.libraries.micore.learning.training.util.C29758c;
import com.google.android.libraries.micore.learning.training.util.C29759d;
import com.google.android.libraries.micore.learning.training.util.C29761f;
import com.google.common.p4552o.p4554b.p4555a.C59628h;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60895di;
import com.google.common.util.concurrent.C60908dv;
import com.google.common.util.concurrent.C60916ec;
import com.google.fcp.client.C61091d;
import com.google.fcp.client.http.C61102k;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.DesugarCollections;
import p3186j$.util.Objects;

/* compiled from: PG */
public class InAppTrainingServiceImpl extends C144816t {

    /* renamed from: a */
    public static final C29719k f391384a = C29712d.m54802b("brella", "InAppTrngSvcImpl");

    /* renamed from: b */
    public static C60887da f391385b;

    /* renamed from: o */
    private static final C60887da f391386o;

    /* renamed from: c */
    public final C29758c f391387c;

    /* renamed from: d */
    public final Object f391388d = new Object();

    /* renamed from: e */
    public C60870cx f391389e = null;

    /* renamed from: f */
    public Context f391390f;

    /* renamed from: g */
    public C144827n f391391g;

    /* renamed from: h */
    public C29711c f391392h;

    /* renamed from: i */
    public C144573b f391393i;

    /* renamed from: j */
    public String f391394j;

    /* renamed from: k */
    public C29761f f391395k;

    /* renamed from: l */
    public int f391396l = 0;

    /* renamed from: m */
    public byte[] f391397m = null;

    /* renamed from: n */
    public final Map f391398n = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: p */
    private final AtomicBoolean f391399p;

    /* renamed from: q */
    private BroadcastReceiver f391400q;

    /* renamed from: r */
    private C60887da f391401r;

    /* renamed from: s */
    private final IBinder f391402s = new C144688bd(this);

    /* renamed from: t */
    private C144685ba f391403t;

    /* renamed from: $r8$lambda$G4IPcFu-TVQ6gt3iAnRFW2F7DBE  reason: not valid java name */
    public static /* synthetic */ NativeFLRunnerWrapper m241178$r8$lambda$G4IPcFuTVQ6gt3iAnRFW2F7DBE(C29719k kVar, C29758c cVar, String str, C29700j jVar, C61091d dVar, C144827n nVar, C29761f fVar, C29759d dVar2, C59628h hVar, C29715g gVar, C144573b bVar, String str2, C29717i iVar, C29727c cVar2, File file, File file2, ExecutorService executorService, C61102k kVar2, C29754l lVar, byte[] bArr) {
        return new NativeFLRunnerWrapper(kVar, cVar, str, jVar, dVar, nVar, fVar, dVar2, hVar, gVar, bVar, str2, iVar, cVar2, file, file2, executorService, kVar2, lVar, bArr);
    }

    public static /* synthetic */ NativeLCRunnerWrapper $r8$lambda$H1sQWvVCUjaCJ121A5BsbTAUyVY(C29719k kVar, C29758c cVar, String str, C29700j jVar, C61091d dVar, C144827n nVar, C29761f fVar, C29759d dVar2, C59628h hVar, C144573b bVar, C29727c cVar2, File file, File file2, ExecutorService executorService, C61102k kVar2, C29754l lVar, byte[] bArr) {
        return new NativeLCRunnerWrapper(kVar, cVar, str, jVar, dVar, nVar, fVar, dVar2, hVar, bVar, cVar2, file, file2, executorService, kVar2, lVar, bArr);
    }

    public static /* synthetic */ C144755r $r8$lambda$XdNzzuo7si2AiIP6IJfe6ZUE4bc(InAppTrainingServiceImpl inAppTrainingServiceImpl, List list) {
        return new C144755r(inAppTrainingServiceImpl.f391390f, list, inAppTrainingServiceImpl.f391391g, inAppTrainingServiceImpl.f391393i, f391384a);
    }

    static {
        C144859a aVar = C144860b.f391709a;
        C60908dv dvVar = new C60908dv();
        dvVar.mo57410b("brella-inapptrngsvc-%d");
        f391386o = C60895di.m92995a(C144859a.m235445a(1, C60908dv.m93015a(dvVar)));
    }

    public InAppTrainingServiceImpl() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f391399p = atomicBoolean;
        Objects.requireNonNull(atomicBoolean);
        this.f391387c = new C29758c(new C144671an(atomicBoolean));
    }

    /* renamed from: b */
    public static void m235157b(C60870cx cxVar, Context context) {
        try {
            C60856cj.m92909r(cxVar);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            f391384a.mo34868j(e, "Training failed");
            C60916ec ecVar = new C60916ec(e);
            C144005e.m234184a(context, ecVar);
            throw ecVar;
        }
    }

    /* renamed from: i */
    public static final void m235158i(C144689be beVar) {
        try {
            beVar.mo120146a();
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: j */
    private static String m235159j(String str, String str2, C144706bv bvVar) {
        return C29728d.m54829a(str + "/" + str2, bvVar.mo120140b() == 1 ? bvVar.mo120139a().f80427a : BuildConfig.FLAVOR);
    }

    /* renamed from: a */
    public final C144738a mo120123a(C144740c cVar) {
        return new C144738a((C144827n) this.f391392h.mo34852c(C144827n.class), this.f391394j, new C144680aw(this, cVar));
    }

    public void addHttpUrlConnectionFactory(String str, C144802f fVar) {
        this.f391398n.put(str, fVar);
    }

    /* renamed from: c */
    public final void mo120125c(C144689be beVar) {
        synchronized (this.f391388d) {
            this.f391389e = null;
        }
        m235158i(beVar);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        if (r15 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009a, code lost:
        if (r15 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c5, code lost:
        if (r15 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo120126d(java.lang.String r19, com.google.android.gms.learning.dynamite.training.C144706bv r20, java.lang.String r21, com.google.android.libraries.micore.learning.p2258a.C29700j r22, byte[] r23, com.google.android.gms.learning.dynamite.training.C144719o r24) {
        /*
            r18 = this;
            r13 = r18
            r0 = r19
            r14 = r24
            com.google.android.gms.learning.b r1 = r13.f391393i     // Catch:{ all -> 0x00dc }
            boolean r1 = r1.mo119974aH()     // Catch:{ all -> 0x00dc }
            if (r1 == 0) goto L_0x0014
            com.google.android.libraries.micore.learning.base.c r1 = r13.f391392h     // Catch:{ all -> 0x00dc }
            r1.mo34854d()     // Catch:{ all -> 0x00dc }
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            r15 = r1
            int r1 = r20.mo120140b()     // Catch:{ all -> 0x00ce }
            r2 = 1
            if (r1 != r2) goto L_0x001f
            r12 = 1
            goto L_0x0021
        L_0x001f:
            r2 = 0
            r12 = 0
        L_0x0021:
            java.lang.String r1 = r13.f391394j     // Catch:{ all -> 0x00ce }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            r2.<init>()     // Catch:{ all -> 0x00ce }
            r2.append(r1)     // Catch:{ all -> 0x00ce }
            java.lang.String r1 = "/"
            r2.append(r1)     // Catch:{ all -> 0x00ce }
            r2.append(r0)     // Catch:{ all -> 0x00ce }
            java.lang.String r10 = r2.toString()     // Catch:{ all -> 0x00ce }
            java.lang.String r1 = r13.f391394j     // Catch:{ all -> 0x00ce }
            r9 = r20
            java.lang.String r11 = m235159j(r1, r0, r9)     // Catch:{ all -> 0x00ce }
            if (r12 == 0) goto L_0x0048
            com.google.android.libraries.micore.learning.a.e r1 = r20.mo120139a()     // Catch:{ all -> 0x00ce }
            java.lang.String r1 = r1.f80427a     // Catch:{ all -> 0x00ce }
            goto L_0x004e
        L_0x0048:
            com.google.android.libraries.micore.learning.a.g r1 = r20.mo120151c()     // Catch:{ all -> 0x00ce }
            java.lang.String r1 = r1.f80434c     // Catch:{ all -> 0x00ce }
        L_0x004e:
            r8 = r1
            com.google.android.gms.learning.dynamite.training.aq r7 = new com.google.android.gms.learning.dynamite.training.aq     // Catch:{ all -> 0x00ce }
            r1 = r7
            r2 = r18
            r3 = r12
            r4 = r11
            r5 = r22
            r6 = r24
            r0 = r7
            r7 = r19
            r9 = r20
            r16 = r0
            r0 = r11
            r11 = r23
            r17 = r12
            r12 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00ce }
            java.lang.Object r1 = r13.f391388d     // Catch:{ all -> 0x00ce }
            monitor-enter(r1)     // Catch:{ all -> 0x00ce }
            com.google.common.util.concurrent.cx r2 = r13.f391389e     // Catch:{ all -> 0x00cb }
            if (r2 == 0) goto L_0x008f
            com.google.android.libraries.micore.learning.base.k r0 = f391384a     // Catch:{ all -> 0x00cb }
            java.lang.String r2 = "Overlapping training runs"
            r0.mo34866h(r2)     // Catch:{ all -> 0x00cb }
            com.google.android.gms.learning.n r0 = r13.f391391g     // Catch:{ all -> 0x00cb }
            r2 = 1175(0x497, float:1.647E-42)
            r0.mo120056h(r2)     // Catch:{ all -> 0x00cb }
            com.google.android.gms.learning.dynamite.training.ar r0 = new com.google.android.gms.learning.dynamite.training.ar     // Catch:{ all -> 0x00cb }
            r0.<init>(r14)     // Catch:{ all -> 0x00cb }
            r13.mo120125c(r0)     // Catch:{ all -> 0x00cb }
            monitor-exit(r1)     // Catch:{ all -> 0x00cb }
            if (r15 == 0) goto L_0x008e
            r15.close()     // Catch:{ all -> 0x00dc }
        L_0x008e:
            return
        L_0x008f:
            r2 = r22
            r3 = r17
            boolean r0 = r13.mo120127e(r3, r0, r2, r14)     // Catch:{ all -> 0x00cb }
            if (r0 != 0) goto L_0x00a0
            monitor-exit(r1)     // Catch:{ all -> 0x00cb }
            if (r15 == 0) goto L_0x009f
            r15.close()     // Catch:{ all -> 0x00dc }
        L_0x009f:
            return
        L_0x00a0:
            com.google.common.util.concurrent.da r0 = r13.f391401r     // Catch:{ all -> 0x00cb }
            r2 = r16
            com.google.common.util.concurrent.cx r0 = r0.mo19398a(r2)     // Catch:{ all -> 0x00cb }
            com.google.android.gms.learning.dynamite.training.as r2 = new com.google.android.gms.learning.dynamite.training.as     // Catch:{ all -> 0x00cb }
            r2.<init>(r0, r14)     // Catch:{ all -> 0x00cb }
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x00cb }
            r0.mo4106b(r2, r3)     // Catch:{ all -> 0x00cb }
            r13.f391389e = r0     // Catch:{ all -> 0x00cb }
            android.content.Context r2 = r13.f391390f     // Catch:{ all -> 0x00cb }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x00cb }
            com.google.common.util.concurrent.da r3 = r13.f391401r     // Catch:{ all -> 0x00cb }
            com.google.android.gms.learning.dynamite.training.at r4 = new com.google.android.gms.learning.dynamite.training.at     // Catch:{ all -> 0x00cb }
            r4.<init>(r0, r2)     // Catch:{ all -> 0x00cb }
            r3.execute(r4)     // Catch:{ all -> 0x00cb }
            monitor-exit(r1)     // Catch:{ all -> 0x00cb }
            if (r15 == 0) goto L_0x00ca
            r15.close()     // Catch:{ all -> 0x00dc }
        L_0x00ca:
            return
        L_0x00cb:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00cb }
            throw r0     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r0 = move-exception
            r1 = r0
            if (r15 == 0) goto L_0x00db
            r15.close()     // Catch:{ all -> 0x00d6 }
            goto L_0x00db
        L_0x00d6:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.learning.dynamite.training.C144667aj.m235171a(r1, r2)     // Catch:{ all -> 0x00dc }
        L_0x00db:
            throw r1     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            r0 = move-exception
            android.content.Context r1 = r13.f391390f
            com.google.android.gms.common.util.C144005e.m234184a(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl.mo120126d(java.lang.String, com.google.android.gms.learning.dynamite.training.bv, java.lang.String, com.google.android.libraries.micore.learning.a.j, byte[], com.google.android.gms.learning.dynamite.training.o):void");
    }

    /* renamed from: e */
    public final boolean mo120127e(boolean z, String str, C29700j jVar, C144719o oVar) {
        Set set;
        if (this.f391399p.get()) {
            this.f391391g.mo120056h(68);
            mo120125c(new C144672ao(oVar));
            return false;
        }
        if (z) {
            set = this.f391395k.mo34930a(jVar, str);
        } else {
            set = this.f391395k.mo34931b(jVar, str);
        }
        this.f391395k.mo34932c(set, (String) null);
        if (set.isEmpty()) {
            return true;
        }
        String.valueOf(set);
        mo120125c(new C144673ap(oVar));
        return false;
    }

    /* renamed from: f */
    public final boolean mo120128f() {
        this.f391399p.set(true);
        for (Map.Entry entry : this.f391387c.f80634a.entrySet()) {
            ((Executor) entry.getValue()).execute((Runnable) entry.getKey());
        }
        synchronized (this.f391388d) {
            C60870cx cxVar = this.f391389e;
            if (cxVar == null) {
                return false;
            }
            cxVar.cancel(true);
            this.f391389e = null;
            return true;
        }
    }

    /* renamed from: g */
    public final int mo120129g(List list, String str, C144706bv bvVar, byte[] bArr) {
        if (bvVar.mo120140b() == 2 || this.f391393i.mo120009aq()) {
            return $r8$lambda$XdNzzuo7si2AiIP6IJfe6ZUE4bc(this.f391403t.f391456a, list).mo120185a(str, bvVar, bArr);
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo120130h(String str, String str2, String str3, int i, C29700j jVar, byte[] bArr, C144719o oVar) {
        C29694d dVar = (C29694d) C29695e.f80425d.createBuilder();
        dVar.copyOnWrite();
        str2.getClass();
        ((C29695e) dVar.instance).f80427a = str2;
        dVar.copyOnWrite();
        ((C29695e) dVar.instance).f80428b = C29693c.m54784a(i);
        C144706bv a = C144708d.m235218a((C29695e) dVar.build());
        String str4 = str;
        if (this.f391393i.mo120006an(m235159j(this.f391394j, str, a))) {
            mo120126d(str, a, str3, jVar, bArr, new C144687bc(this, str, str2, str3, i, jVar, bArr, oVar));
            return;
        }
        mo120126d(str, a, str3, jVar, bArr, oVar);
    }

    public IBinder onBind(Intent intent) {
        String.valueOf(intent);
        return this.f391402s;
    }

    /* JADX INFO: finally extract failed */
    public void onCreate(C144165j jVar) {
        C60887da daVar = f391386o;
        C144685ba baVar = new C144685ba(this);
        try {
            this.f391390f = (Context) C144166k.m234388a(jVar);
            this.f391401r = daVar;
            this.f391403t = baVar;
            C144655s.m235152a();
            C29711c b = C29711c.m54796b(this.f391390f.getApplicationContext());
            this.f391392h = b;
            this.f391391g = (C144827n) b.mo34852c(C144827n.class);
            this.f391393i = (C144573b) this.f391392h.mo34852c(C144573b.class);
            this.f391394j = this.f391390f.getApplicationContext().getPackageName();
            this.f391395k = (C29761f) this.f391392h.mo34852c(C29761f.class);
            C144686bb bbVar = new C144686bb(this);
            this.f391400q = bbVar;
            C144854b.m235443a(this.f391390f, bbVar, new IntentFilter("android.intent.action.SCREEN_ON"));
            this.f391391g.mo120056h(91);
        } catch (Throwable th) {
            C144827n nVar = this.f391391g;
            if (nVar != null) {
                nVar.mo120056h(94);
            }
            C144005e.m234184a((Context) C144166k.m234388a(jVar), th);
            throw th;
        }
    }

    public void onDestroy() {
        try {
            this.f391391g.mo120056h(90);
            if (mo120128f()) {
                this.f391391g.mo120056h(88);
            }
            this.f391390f.unregisterReceiver(this.f391400q);
            this.f391392h.close();
            if (!this.f391393i.mo119974aH()) {
                this.f391392h = null;
            }
        } catch (RuntimeException e) {
            this.f391391g.mo120056h(93);
            C144005e.m234184a(this.f391390f, e);
            throw e;
        }
    }

    public void onRebind(Intent intent) {
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }

    public void onTrimMemory(int i) {
        try {
            if (i >= this.f391393i.mo120033m()) {
                this.f391391g.mo120056h(98);
                mo120128f();
            }
        } catch (Throwable th) {
            C144005e.m234184a(this.f391390f, th);
            throw th;
        }
    }

    public boolean onUnbind(Intent intent) {
        return false;
    }

    public void setPRFSdkImpl() {
    }
}
