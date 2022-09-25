package com.google.android.libraries.web.base.p3348b.p3351c;

import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.shared.lifecycle.C44107h;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71574dx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.base.b.c.f */
/* compiled from: PG */
public final class C43250f implements C44107h {

    /* renamed from: a */
    public final C43246b f113020a;

    /* renamed from: b */
    public final C71422aw f113021b;

    /* renamed from: c */
    public final C43271v f113022c;

    /* renamed from: d */
    public final C71548cy f113023d = C71574dx.m104480b(0);

    public C43250f(C43269t tVar, C43246b bVar, C71422aw awVar) {
        C69664n.m101061g(tVar, "webCoordinatorInfo");
        C69664n.m101061g(bVar, "accountScopedRequestRequirements");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f113020a = bVar;
        this.f113021b = awVar;
        this.f113022c = tVar.mo46385c();
    }

    /* renamed from: a */
    public final /* synthetic */ void mo44356a() {
    }

    /* renamed from: b */
    public final boolean mo46331b() {
        return (((Number) this.f113023d.mo62784e()).intValue() == 0 && ((Number) this.f113020a.mo46330b(this.f113022c).mo62784e()).intValue() == 0) ? false : true;
    }
}
