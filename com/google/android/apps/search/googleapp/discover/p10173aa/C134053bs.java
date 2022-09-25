package com.google.android.apps.search.googleapp.discover.p10173aa;

import android.net.ConnectivityManager;
import androidx.work.WorkerParameters;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.googleapp.discover.p10181d.C134215d;
import com.google.android.apps.search.googleapp.discover.p10184f.C134253d;
import com.google.android.apps.search.googleapp.discover.p10184f.C134258i;
import com.google.android.apps.search.googleapp.discover.p10238u.C135086ff;
import com.google.android.apps.search.googleapp.discover.p10244v.C135200t;
import com.google.android.apps.search.googleapp.discover.p10249z.C135314au;
import com.google.android.libraries.search.logging.p3041d.C39143kr;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.contrib.work.C46513b;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C59742e;
import com.google.common.p4552o.C59770f;
import com.google.common.p4552o.C60454qq;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.aa.bs */
/* compiled from: PG */
public final class C134053bs implements C46513b {

    /* renamed from: a */
    public static final C59071e f365142a = C59071e.m91331h();

    /* renamed from: b */
    public final C135314au f365143b;

    /* renamed from: c */
    public final C46778cv f365144c;

    /* renamed from: d */
    public final C60950i f365145d;

    /* renamed from: e */
    public final C134258i f365146e;

    /* renamed from: f */
    public final C134253d f365147f;

    /* renamed from: g */
    public final C134074r f365148g;

    /* renamed from: h */
    public final C135086ff f365149h;

    /* renamed from: i */
    public final C134029av f365150i;

    /* renamed from: j */
    public final C134215d f365151j;

    /* renamed from: k */
    public final C69585o f365152k;

    /* renamed from: l */
    public final boolean f365153l;

    /* renamed from: m */
    public final long f365154m;

    /* renamed from: n */
    public final C39143kr f365155n;

    /* renamed from: o */
    private final C135200t f365156o;

    /* renamed from: p */
    private final ConnectivityManager f365157p;

    /* renamed from: q */
    private final C71422aw f365158q;

    /* renamed from: r */
    private final Executor f365159r;

    public C134053bs(C135314au auVar, C135200t tVar, C46778cv cvVar, C60950i iVar, ConnectivityManager connectivityManager, C39143kr krVar, C134258i iVar2, C134253d dVar, C134074r rVar, C135086ff ffVar, C134029av avVar, C134215d dVar2, C71422aw awVar, Executor executor, C69585o oVar, boolean z, long j) {
        C39143kr krVar2 = krVar;
        C134074r rVar2 = rVar;
        C135086ff ffVar2 = ffVar;
        C71422aw awVar2 = awVar;
        Executor executor2 = executor;
        C69585o oVar2 = oVar;
        C69664n.m101061g(auVar, "streamProvider");
        C69664n.m101061g(cvVar, "resultPropagator");
        C69664n.m101061g(iVar, "timeSource");
        C69664n.m101061g(krVar2, "clientStreamz");
        C69664n.m101061g(rVar2, "feedSyncController");
        C69664n.m101061g(ffVar2, "requestConfigBuilder");
        C69664n.m101061g(awVar2, "lightweightScope");
        C69664n.m101061g(executor2, "lightweightExecutor");
        C69664n.m101061g(oVar2, "lightweightContext");
        this.f365143b = auVar;
        this.f365156o = tVar;
        this.f365144c = cvVar;
        this.f365145d = iVar;
        this.f365157p = connectivityManager;
        this.f365155n = krVar2;
        this.f365146e = iVar2;
        this.f365147f = dVar;
        this.f365148g = rVar2;
        this.f365149h = ffVar2;
        this.f365150i = avVar;
        this.f365151j = dVar2;
        this.f365158q = awVar2;
        this.f365159r = executor2;
        this.f365152k = oVar2;
        this.f365153l = z;
        this.f365154m = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (((com.google.android.apps.search.googleapp.discover.p10173aa.C134053bs) r0).mo111541h() == false) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111535a(p5462h.p5466c.C69577g r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.googleapp.discover.p10173aa.C134038bd
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.googleapp.discover.aa.bd r0 = (com.google.android.apps.search.googleapp.discover.p10173aa.C134038bd) r0
            int r1 = r0.f365103d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f365103d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.aa.bd r0 = new com.google.android.apps.search.googleapp.discover.aa.bd
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f365101b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f365103d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r0 = r0.f365100a
            p5462h.C69714l.m101134b(r8)
            goto L_0x004b
        L_0x0029:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0031:
            p5462h.C69714l.m101134b(r8)
            com.google.android.apps.search.googleapp.discover.v.t r8 = r7.f365156o
            com.google.android.apps.search.googleapp.discover.streamui.h.c r2 = com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134752c.f366921a
            r0.f365100a = r7
            r0.f365103d = r3
            h.c.o r4 = r8.f368290d
            com.google.android.apps.search.googleapp.discover.v.p r5 = new com.google.android.apps.search.googleapp.discover.v.p
            r6 = 0
            r5.<init>(r2, r8, r6)
            java.lang.Object r8 = kotlinx.coroutines.C71803m.m105040a(r4, r5, r0)
            if (r8 == r1) goto L_0x006c
            r0 = r7
        L_0x004b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r1 = 0
            if (r8 != 0) goto L_0x005f
            com.google.android.apps.search.googleapp.discover.aa.bs r0 = (com.google.android.apps.search.googleapp.discover.p10173aa.C134053bs) r0
            com.google.android.libraries.search.logging.d.kr r8 = r0.f365155n
            java.lang.String r0 = "INTERACTIVE_USER"
            r8.mo41714c(r0)
        L_0x005d:
            r3 = 0
            goto L_0x0067
        L_0x005f:
            com.google.android.apps.search.googleapp.discover.aa.bs r0 = (com.google.android.apps.search.googleapp.discover.p10173aa.C134053bs) r0
            boolean r8 = r0.mo111541h()
            if (r8 != 0) goto L_0x005d
        L_0x0067:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        L_0x006c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10173aa.C134053bs.mo111535a(h.c.g):java.lang.Object");
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        C69664n.m101061g(workerParameters, "workerParameters");
        C60870cx e = C71663i.m104692e(this.f365158q, (C71424ay) null, new C134048bn(this, workerParameters, (C69577g) null), 3);
        C134047bm bmVar = new C134047bm(this);
        C60856cj.m92911t(e, C47810es.m84974n(bmVar), this.f365159r);
        return e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111536c(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.googleapp.discover.p10173aa.C134039be
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.googleapp.discover.aa.be r0 = (com.google.android.apps.search.googleapp.discover.p10173aa.C134039be) r0
            int r1 = r0.f365106c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f365106c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.aa.be r0 = new com.google.android.apps.search.googleapp.discover.aa.be
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f365104a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f365106c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r6)
            goto L_0x0043
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x002f:
            p5462h.C69714l.m101134b(r6)
            h.c.o r6 = r5.f365152k
            com.google.android.apps.search.googleapp.discover.aa.bf r2 = new com.google.android.apps.search.googleapp.discover.aa.bf
            r4 = 0
            r2.<init>(r5, r4)
            r0.f365106c = r3
            java.lang.Object r6 = kotlinx.coroutines.C71803m.m105040a(r6, r2, r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            java.lang.String r0 = "private suspend fun make…e\n        )\n      }\n    }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10173aa.C134053bs.mo111536c(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111537d(com.google.android.apps.search.googleapp.discover.p10238u.C135050dx r6, boolean r7, p5462h.p5466c.C69577g r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.googleapp.discover.p10173aa.C134045bk
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.googleapp.discover.aa.bk r0 = (com.google.android.apps.search.googleapp.discover.p10173aa.C134045bk) r0
            int r1 = r0.f365120c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f365120c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.aa.bk r0 = new com.google.android.apps.search.googleapp.discover.aa.bk
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f365118a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f365120c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r8)
            goto L_0x0043
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002f:
            p5462h.C69714l.m101134b(r8)
            h.c.o r8 = r5.f365152k
            com.google.android.apps.search.googleapp.discover.aa.bl r2 = new com.google.android.apps.search.googleapp.discover.aa.bl
            r4 = 0
            r2.<init>(r5, r6, r7, r4)
            r0.f365120c = r3
            java.lang.Object r8 = kotlinx.coroutines.C71803m.m105040a(r8, r2, r0)
            if (r8 != r1) goto L_0x0043
            return r1
        L_0x0043:
            java.lang.String r6 = "private suspend fun refr…t.Failure()\n      }\n    }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10173aa.C134053bs.mo111537d(com.google.android.apps.search.googleapp.discover.u.dx, boolean, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111538e(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.googleapp.discover.p10173aa.C134051bq
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.googleapp.discover.aa.bq r0 = (com.google.android.apps.search.googleapp.discover.p10173aa.C134051bq) r0
            int r1 = r0.f365139c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f365139c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.aa.bq r0 = new com.google.android.apps.search.googleapp.discover.aa.bq
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f365137a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f365139c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r6)
            goto L_0x0043
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x002f:
            p5462h.C69714l.m101134b(r6)
            h.c.o r6 = r5.f365152k
            com.google.android.apps.search.googleapp.discover.aa.br r2 = new com.google.android.apps.search.googleapp.discover.aa.br
            r4 = 0
            r2.<init>(r5, r4)
            r0.f365139c = r3
            java.lang.Object r6 = kotlinx.coroutines.C71803m.m105040a(r6, r2, r0)
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            java.lang.String r0 = "private suspend fun upda…   Result.success()\n    }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10173aa.C134053bs.mo111538e(h.c.g):java.lang.Object");
    }

    /* renamed from: f */
    public final void mo111539f(C89885b bVar) {
        C134215d dVar = this.f365151j;
        C59742e eVar = (C59742e) C59770f.f161501d.createBuilder();
        eVar.copyOnWrite();
        C59770f fVar = (C59770f) eVar.instance;
        fVar.f161503a |= 1;
        fVar.f161504b = 0;
        int i = bVar.f246280a;
        eVar.copyOnWrite();
        C59770f fVar2 = (C59770f) eVar.instance;
        fVar2.f161503a |= 2;
        fVar2.f161505c = i;
        C62942bv build = eVar.build();
        C69664n.m101060f(build, "newBuilder()\n        .se….number)\n        .build()");
        C59770f fVar3 = (C59770f) build;
        C69664n.m101061g(fVar3, "appFlowErrorInfo");
        C89859i iVar = dVar.f365592a;
        C89856f fVar4 = new C89856f();
        fVar4.f246201a = C89849ae.DISCOVER_TNG_BACKGROUND_REFRESH_FAILURE;
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C60454qq a = C69664n.m101061g(ajVar, "builder");
        a.mo57096d();
        a.mo57095c(fVar3);
        fVar4.f246203c = a.mo57093a();
        iVar.mo74236a(fVar4.mo83699a());
    }

    /* renamed from: g */
    public final void mo111540g() {
        this.f365148g.mo111516e(false);
        C46459k.m82829b(C71663i.m104692e(this.f365158q, (C71424ay) null, new C134044bj(this, (C69577g) null), 3), "Failed to enqueueNextPeriodicJobUsingRefreshSchedule", new Object[0]);
    }

    /* renamed from: h */
    public final boolean mo111541h() {
        boolean isActiveNetworkMetered = this.f365157p.isActiveNetworkMetered();
        boolean z = true;
        boolean z2 = this.f365157p.getRestrictBackgroundStatus() == 3;
        if (!isActiveNetworkMetered || !z2) {
            z = false;
        }
        if (z) {
            this.f365155n.mo41712a("BOTH");
            this.f365155n.mo41714c("METERED_NETWORK_WITH_DATA_SAVER");
        } else if (isActiveNetworkMetered) {
            this.f365155n.mo41712a("METERED_NETWORK");
        } else if (z2) {
            this.f365155n.mo41712a("DATA_SAVER_ON");
        } else {
            this.f365155n.mo41712a("OTHER");
        }
        return z;
    }
}
