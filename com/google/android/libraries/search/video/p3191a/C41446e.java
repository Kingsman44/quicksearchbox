package com.google.android.libraries.search.video.p3191a;

import com.google.android.libraries.search.video.p3194d.C41492c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.video.a.e */
/* compiled from: PG */
public final class C41446e {

    /* renamed from: a */
    public static final C59071e f108250a = C59071e.m91332i("com.google.android.libraries.search.video.a.e");

    /* renamed from: b */
    public final C58872ci f108251b = new C58872ci(C58274c.f155808a);

    /* renamed from: c */
    public C60870cx f108252c;

    /* renamed from: d */
    public final C41492c f108253d;

    /* renamed from: e */
    private final C60888db f108254e;

    /* renamed from: f */
    private final Duration f108255f;

    public C41446e(C60888db dbVar, C41492c cVar, Duration duration) {
        this.f108254e = dbVar;
        this.f108253d = cVar;
        this.f108255f = duration;
    }

    /* renamed from: d */
    private final Duration m72432d() {
        if (this.f108255f.compareTo(Duration.ofNanos(this.f108251b.mo56159b())) <= 0) {
            return Duration.ZERO;
        }
        return this.f108255f.minus(Duration.ofNanos(this.f108251b.mo56159b()));
    }

    /* renamed from: a */
    public final synchronized void mo43977a() {
        C60870cx cxVar = this.f108252c;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
        C58872ci ciVar = this.f108251b;
        if (ciVar.f156708a) {
            ciVar.mo56162g();
        }
    }

    /* renamed from: b */
    public final synchronized void mo43978b() {
        if (!this.f108251b.f156708a) {
            if (m72432d().compareTo(Duration.ZERO) > 0) {
                C60870cx cxVar = this.f108252c;
                if (cxVar != null) {
                    cxVar.cancel(true);
                }
                C60872cz e = this.f108254e.mo29165e(C41444c.f108248a, m72432d().toMillis(), TimeUnit.MILLISECONDS);
                this.f108252c = e;
                C60856cj.m92911t(e, C47810es.m84974n(new C41445d(this)), this.f108254e);
                this.f108251b.mo56161f();
            }
        }
    }

    /* renamed from: c */
    public final synchronized void mo43979c() {
        C60870cx cxVar = this.f108252c;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
        this.f108251b.mo56160e();
    }
}
