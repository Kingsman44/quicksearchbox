package com.google.android.libraries.search.rendering.xuikit.p3130c;

import androidx.work.C4377aa;
import androidx.work.C4632m;
import androidx.work.C4645z;
import com.google.android.gms.common.api.C143854z;
import com.google.android.libraries.search.rendering.xuikit.p3118b.C40089c;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5304e.p5305a.p5306a.p5346al.p5347a.p5348a.C68448g;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.rendering.xuikit.prefetch.CleanupWorker$startWork$1", mo61344c = "CleanupWorker.kt", mo61345d = "invokeSuspend", mo61346e = {44, 51, 59, 59})
/* renamed from: com.google.android.libraries.search.rendering.xuikit.c.e */
/* compiled from: PG */
final class C40281e extends C69572j implements C69630p {

    /* renamed from: a */
    Object f105806a;

    /* renamed from: b */
    int f105807b;

    /* renamed from: c */
    final /* synthetic */ C40282f f105808c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40281e(C40282f fVar, C69577g gVar) {
        super(2, gVar);
        this.f105808c = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C40281e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Throwable th;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f105807b;
        if (i == 0) {
            C69714l.m101134b(obj);
            if (C68448g.m98859c(this.f105808c.f105810b)) {
                C40282f fVar = this.f105808c;
                C40301y yVar = fVar.f105809a;
                long b = C68448g.f184767a.mo6453a().mo60395b(fVar.f105810b);
                long j = 0;
                if (b < 0) {
                    b = 0;
                }
                long a = C68448g.f184767a.mo6453a().mo60394a(this.f105808c.f105810b);
                if (a < 0) {
                    a = 0;
                }
                long c = C68448g.f184767a.mo6453a().mo60396c(this.f105808c.f105810b);
                if (c >= 0) {
                    j = c;
                }
                Duration ofSeconds = Duration.ofSeconds(j);
                C69664n.m101060f(ofSeconds, "ofSeconds(diskCacheMinAg…ontext).coerceAtLeast(0))");
                this.f105807b = 1;
                if (yVar.mo42385b(b, a, ofSeconds, this) == aVar) {
                    return aVar;
                }
            } else {
                C40301y yVar2 = this.f105808c.f105809a;
                this.f105807b = 2;
                if (yVar2.mo42386c(this) == aVar) {
                    return aVar;
                }
            }
        } else if (i == 1 || i == 2) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th2) {
                C143854z f = this.f105808c.f105811c.mo119021e().mo119022f();
                this.f105806a = th2;
                this.f105807b = 4;
                if (C40089c.m69611a(f, this) == aVar) {
                    return aVar;
                }
                th = th2;
            }
        } else if (i == 3) {
            C4377aa aaVar = (C4377aa) this.f105806a;
            C69714l.m101134b(obj);
            return aaVar;
        } else {
            th = (Throwable) this.f105806a;
            C69714l.m101134b(obj);
            throw th;
        }
        C4645z zVar = new C4645z(C4632m.f14549a);
        C143854z f2 = this.f105808c.f105811c.mo119021e().mo119022f();
        this.f105806a = zVar;
        this.f105807b = 3;
        return C40089c.m69611a(f2, this) != aVar ? zVar : aVar;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C40281e(this.f105808c, gVar);
    }
}
