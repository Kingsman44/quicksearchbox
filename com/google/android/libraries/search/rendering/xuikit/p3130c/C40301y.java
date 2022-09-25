package com.google.android.libraries.search.rendering.xuikit.p3130c;

import android.content.Context;
import androidx.work.C4410f;
import androidx.work.C4634o;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40358k;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.contrib.work.C46570d;
import com.google.apps.tiktok.contrib.work.C46573g;
import com.google.apps.tiktok.contrib.work.C46574h;
import com.google.apps.tiktok.contrib.work.C46578l;
import com.google.apps.tiktok.contrib.work.C46582p;
import com.google.apps.tiktok.contrib.work.C46583q;
import com.google.apps.tiktok.contrib.work.C46586t;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C71803m;
import p3186j$.time.Duration;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69762k;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.c.y */
/* compiled from: PG */
public final class C40301y {

    /* renamed from: a */
    public static final C59071e f105875a = C59071e.m91331h();

    /* renamed from: b */
    public final Context f105876b;

    /* renamed from: c */
    public final C69585o f105877c;

    /* renamed from: d */
    public final C21370a f105878d;

    /* renamed from: e */
    public final C40358k f105879e;

    /* renamed from: f */
    public final C40364q f105880f;

    /* renamed from: g */
    public final ConcurrentHashMap f105881g = new ConcurrentHashMap();

    /* renamed from: h */
    public final C69762k f105882h = new C69762k("tmp-(\\d+)-.*");

    /* renamed from: i */
    private final C42876ab f105883i;

    /* renamed from: j */
    private final C46578l f105884j;

    public C40301y(Context context, C69585o oVar, C42876ab abVar, C21370a aVar, C46578l lVar, C40358k kVar, C40364q qVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(oVar, "backgroundContext");
        C69664n.m101061g(abVar, "index");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(lVar, "workManager");
        C69664n.m101061g(kVar, "applicationLevelCounters");
        C69664n.m101061g(qVar, "logMetadataFactory");
        this.f105876b = context;
        this.f105877c = oVar;
        this.f105883i = abVar;
        this.f105878d = aVar;
        this.f105884j = lVar;
        this.f105879e = kVar;
        this.f105880f = qVar;
    }

    /* renamed from: a */
    public final File mo42384a() {
        return new File(this.f105876b.getCacheDir(), "xuicache");
    }

    /* renamed from: b */
    public final Object mo42385b(long j, long j2, Duration duration, C69577g gVar) {
        Object a = C71803m.m105040a(this.f105877c, new C40292p(this, j, j2, duration, (C69577g) null), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo42386c(p5462h.p5466c.C69577g r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.libraries.search.rendering.xuikit.p3130c.C40293q
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.libraries.search.rendering.xuikit.c.q r0 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40293q) r0
            int r1 = r0.f105852d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f105852d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.rendering.xuikit.c.q r0 = new com.google.android.libraries.search.rendering.xuikit.c.q
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f105850b
            h.c.a.a r8 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r0.f105852d
            r9 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 == r2) goto L_0x0032
            if (r1 != r9) goto L_0x002a
            p5462h.C69714l.m101134b(r11)
            goto L_0x007d
        L_0x002a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0032:
            java.lang.Object r1 = r0.f105849a
            p5462h.C69714l.m101134b(r11)
            goto L_0x0053
        L_0x0038:
            p5462h.C69714l.m101134b(r11)
            j$.time.Duration r6 = p3186j$.time.Duration.ZERO
            java.lang.String r11 = "ZERO"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r11)
            r0.f105849a = r10
            r0.f105852d = r2
            r2 = 0
            r4 = 0
            r1 = r10
            r7 = r0
            java.lang.Object r11 = r1.mo42385b(r2, r4, r6, r7)
            if (r11 == r8) goto L_0x0080
            r1 = r10
        L_0x0053:
            com.google.android.libraries.search.rendering.xuikit.c.y r1 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40301y) r1
            java.io.File r11 = r1.mo42384a()
            r11.delete()
            com.google.apps.tiktok.contrib.work.l r11 = r1.f105884j
            java.lang.String r1 = "com.google.android.libraries.search.rendering.xuikit.prefetch.DiskCache.CLEANUP_WORKER_UNIQUENESS_KEY"
            com.google.common.util.concurrent.cx r11 = r11.mo50545a(r1)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Failed to cancel CleanupWorker"
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r11, r2, r1)
            java.lang.String r1 = "destroyResult"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r1)
            r1 = 0
            r0.f105849a = r1
            r0.f105852d = r9
            java.lang.Object r11 = kotlinx.coroutines.p5578d.C71663i.m104690c(r11, r0)
            if (r11 != r8) goto L_0x007d
            return r8
        L_0x007d:
            h.q r11 = p5462h.C69788q.f186170a
            return r11
        L_0x0080:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.rendering.xuikit.p3130c.C40301y.mo42386c(h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo42387d(java.lang.String r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.libraries.search.rendering.xuikit.p3130c.C40295s
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.libraries.search.rendering.xuikit.c.s r0 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40295s) r0
            int r1 = r0.f105862d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f105862d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.rendering.xuikit.c.s r0 = new com.google.android.libraries.search.rendering.xuikit.c.s
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f105860b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f105862d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r6 = r0.f105859a
            p5462h.C69714l.m101134b(r7)
            goto L_0x004c
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            p5462h.C69714l.m101134b(r7)
            java.io.File r7 = r5.mo42384a()
            r0.f105859a = r7
            r0.f105862d = r3
            com.google.android.libraries.storage.protostore.ab r2 = r5.f105883i
            com.google.android.libraries.search.rendering.xuikit.c.t r3 = new com.google.android.libraries.search.rendering.xuikit.c.t
            r3.<init>(r6, r5)
            java.lang.Object r6 = com.google.android.libraries.search.rendering.xuikit.p3130c.C40265ae.m69885d(r2, r3, r0)
            if (r6 == r1) goto L_0x0058
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x004c:
            com.google.android.libraries.search.rendering.xuikit.c.b r7 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40278b) r7
            java.lang.String r7 = r7.f105803c
            java.io.File r0 = new java.io.File
            java.io.File r6 = (java.io.File) r6
            r0.<init>(r6, r7)
            return r0
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.rendering.xuikit.p3130c.C40301y.mo42387d(java.lang.String, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo42388e(java.util.Map r15, long r16, long r18, p3186j$.time.Duration r20, p5462h.p5466c.C69577g r21) {
        /*
            r14 = this;
            r8 = r14
            r0 = r21
            boolean r1 = r0 instanceof com.google.android.libraries.search.rendering.xuikit.p3130c.C40297u
            if (r1 == 0) goto L_0x0016
            r1 = r0
            com.google.android.libraries.search.rendering.xuikit.c.u r1 = (com.google.android.libraries.search.rendering.xuikit.p3130c.C40297u) r1
            int r2 = r1.f105867c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.f105867c = r2
            goto L_0x001b
        L_0x0016:
            com.google.android.libraries.search.rendering.xuikit.c.u r1 = new com.google.android.libraries.search.rendering.xuikit.c.u
            r1.<init>(r14, r0)
        L_0x001b:
            r9 = r1
            java.lang.Object r0 = r9.f105865a
            h.c.a.a r10 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r9.f105867c
            r11 = 1
            if (r1 == 0) goto L_0x0033
            if (r1 != r11) goto L_0x002b
            p5462h.C69714l.m101134b(r0)
            goto L_0x004f
        L_0x002b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0033:
            p5462h.C69714l.m101134b(r0)
            com.google.android.libraries.storage.protostore.ab r12 = r8.f105883i
            com.google.android.libraries.search.rendering.xuikit.c.x r13 = new com.google.android.libraries.search.rendering.xuikit.c.x
            r0 = r13
            r1 = r16
            r3 = r18
            r5 = r15
            r6 = r14
            r7 = r20
            r0.<init>(r1, r3, r5, r6, r7)
            r9.f105867c = r11
            java.lang.Object r0 = com.google.android.libraries.search.rendering.xuikit.p3130c.C40265ae.m69885d(r12, r13, r9)
            if (r0 != r10) goto L_0x004f
            return r10
        L_0x004f:
            java.lang.String r1 = "private suspend fun upda…, toRemove.build())\n    }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.rendering.xuikit.p3130c.C40301y.mo42388e(java.util.Map, long, long, j$.time.Duration, h.c.g):java.lang.Object");
    }

    /* renamed from: f */
    public final void mo42389f() {
        C46582p j = C46586t.m83063j(C40282f.class);
        C46570d dVar = (C46570d) j;
        dVar.f121757f = C58833ax.m90834k(new C46574h("com.google.android.libraries.search.rendering.xuikit.prefetch.DiskCache.CLEANUP_WORKER_UNIQUENESS_KEY", C4634o.KEEP));
        dVar.f121756e = C58833ax.m90834k(C46583q.m83056d(new C46573g(2, TimeUnit.DAYS), new C46573g(1, TimeUnit.DAYS)));
        C4410f fVar = new C4410f();
        fVar.f14072b = true;
        dVar.f121753b = fVar.mo9349a();
        dVar.f121754c = new C46573g(2, TimeUnit.HOURS);
        C46459k.m82829b(this.f105884j.mo50546b(j.mo50561a()), "Failed to schedule CleanupWorker", new Object[0]);
    }

    /* renamed from: g */
    public final Object mo42390g(int i, long j, int i2, long j2) {
        this.f105879e.mo42417d("PreregisteredResources.DiskCache.Cleanup.FileCount", i);
        this.f105879e.mo42418e("PreregisteredResources.DiskCache.Cleanup.CacheSizeBytes", j);
        this.f105879e.mo42417d("PreregisteredResources.DiskCache.Cleanup.FilesRemoved", i2);
        this.f105879e.mo42418e("PreregisteredResources.DiskCache.Cleanup.BytesRemoved", j2);
        return C69788q.f186170a;
    }
}
