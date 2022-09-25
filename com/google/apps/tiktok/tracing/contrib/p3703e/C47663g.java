package com.google.apps.tiktok.tracing.contrib.p3703e;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.p287f.C5588e;
import com.bumptech.glide.p287f.p288a.C5561c;
import com.bumptech.glide.p287f.p288a.C5571m;
import com.bumptech.glide.p287f.p288a.C5572n;
import com.bumptech.glide.p287f.p289b.C5582f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.tracing.contrib.e.g */
/* compiled from: PG */
public final class C47663g implements C5572n {

    /* renamed from: a */
    public final C5572n f123611a;

    /* renamed from: b */
    private final C47816ey f123612b = C47816ey.m84990e();

    public C47663g(C5572n nVar) {
        this.f123611a = nVar;
    }

    /* renamed from: i */
    private final void m84790i(Runnable runnable) {
        if (C47831fm.m85027v()) {
            runnable.run();
        } else {
            C47810es.m84976p(this.f123612b.f123841a, runnable).run();
        }
    }

    /* renamed from: a */
    public final void mo11859a(Drawable drawable) {
        m84790i(new C47659c(this, drawable));
    }

    /* renamed from: c */
    public final void mo11861c(Object obj, C5582f fVar) {
        m84790i(new C47662f(this, obj));
    }

    /* renamed from: d */
    public final C5588e mo11990d() {
        return ((C5561c) this.f123611a).f16843c;
    }

    /* renamed from: e */
    public final void mo11995e(C5571m mVar) {
        this.f123611a.mo11995e(mVar);
    }

    /* renamed from: f */
    public final void mo11991f(Drawable drawable) {
        m84790i(new C47660d());
    }

    /* renamed from: fB */
    public final void mo11992fB(Drawable drawable) {
        m84790i(new C47661e());
    }

    /* renamed from: g */
    public final void mo11996g(C5571m mVar) {
    }

    /* renamed from: h */
    public final void mo11993h(C5588e eVar) {
        ((C5561c) this.f123611a).f16843c = eVar;
    }

    /* renamed from: p */
    public final void mo11881p() {
    }

    /* renamed from: q */
    public final void mo11882q() {
    }

    /* renamed from: r */
    public final void mo11883r() {
    }
}
