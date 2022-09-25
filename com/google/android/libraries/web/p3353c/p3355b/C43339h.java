package com.google.android.libraries.web.p3353c.p3355b;

import com.google.android.libraries.web.base.C43234b;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.coordinator.p3400b.C43731a;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3418j.C43837b;
import com.google.android.libraries.web.p3418j.C43839d;
import com.google.android.libraries.web.p3418j.C43840e;
import com.google.android.libraries.web.p3418j.C43846k;
import com.google.android.libraries.web.p3418j.C43850o;
import com.google.android.libraries.web.p3418j.C43851p;
import com.google.android.libraries.web.p3418j.C43852q;
import com.google.android.libraries.web.p3418j.p3419a.C43836y;
import com.google.android.libraries.web.shared.lifecycle.C44107h;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46885y;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.c.b.h */
/* compiled from: PG */
public final class C43339h implements C44107h {

    /* renamed from: a */
    public final C43731a f113206a;

    /* renamed from: b */
    public final AtomicReference f113207b = new AtomicReference(new LinkedHashSet());

    /* renamed from: c */
    public final AtomicReference f113208c = new AtomicReference();

    /* renamed from: d */
    public final AtomicReference f113209d = new AtomicReference();

    /* renamed from: e */
    private final C43234b f113210e;

    /* renamed from: f */
    private final long f113211f;

    /* renamed from: g */
    private final C43840e f113212g;

    public C43339h(C43269t tVar, C43837b bVar, C43850o oVar, C43836y yVar, C46778cv cvVar, C43731a aVar, C43234b bVar2) {
        C69664n.m101061g(tVar, "webCoordinatorInfo");
        C69664n.m101061g(cvVar, "resultPropagator");
        this.f113206a = aVar;
        this.f113210e = bVar2;
        this.f113211f = tVar.mo46383a();
        C43840e a = C43851p.m77391a(yVar.mo46847a(C44082a.f114755a, (C43852q) bVar.f114272a.mo46768a()));
        this.f113212g = a;
        if (bVar2.f112985d) {
            C71803m.m105043d(aVar.mo46767b(), (C69585o) null, (C71424ay) null, new C43334c(this, cvVar, (C69577g) null), 3);
            return;
        }
        oVar.mo46849b(yVar, mo46465d(), C43846k.f114278a);
        oVar.mo46849b(yVar, mo46466e(), C43335d.f113204a);
        ((C43839d) C43851p.m77391a(a)).mo46838a(C43339h.class, new C43336e(this));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo44356a() {
    }

    /* renamed from: b */
    public final C43376u mo46463b() {
        if (this.f113210e.f112985d) {
            return (C43376u) C43345n.m76493b(this.f113206a).mo62784e();
        }
        Object d = this.f113212g.mo46841d();
        C69664n.m101060f(d, "{\n        coordinatedWebStateStore.get()\n      }");
        return (C43376u) d;
    }

    /* renamed from: c */
    public final C43324a mo46464c() {
        return (C43324a) this.f113208c.get();
    }

    /* renamed from: d */
    public final C46690ah mo46465d() {
        String str = C43345n.f113224b;
        long j = this.f113211f;
        return new C46885y(str + "_" + j);
    }

    /* renamed from: e */
    public final C46690ah mo46466e() {
        String str = C43345n.f113225c;
        long j = this.f113211f;
        return new C46885y(str + "_" + j);
    }

    /* renamed from: f */
    public final Set mo46467f() {
        Object obj = this.f113207b.get();
        C69664n.m101060f(obj, "listeners.get()");
        return (Set) obj;
    }
}
