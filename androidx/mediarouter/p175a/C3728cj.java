package androidx.mediarouter.p175a;

import android.content.Context;
import android.media.MediaRouter;

/* renamed from: androidx.mediarouter.a.cj */
/* compiled from: PG */
class C3728cj extends C3727ci {
    public C3728cj(Context context, C3729ck ckVar) {
        super(context, ckVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo7844A(C3725cg cgVar) {
        super.mo7844A(cgVar);
        ((MediaRouter.UserRouteInfo) cgVar.f11961b).setDescription(cgVar.f11960a.f11865e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public boolean mo7858C(C3724cf cfVar) {
        return ((MediaRouter.RouteInfo) cfVar.f11957a).isConnecting();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo7843m(C3724cf cfVar, C3738k kVar) {
        super.mo7843m(cfVar, kVar);
        CharSequence description = ((MediaRouter.RouteInfo) cfVar.f11957a).getDescription();
        if (description != null) {
            kVar.mo7874d(description.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Object mo7849r() {
        return ((MediaRouter) this.f11964a).getDefaultRoute();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo7855x(Object obj) {
        ((MediaRouter) this.f11964a).selectRoute(8388611, (MediaRouter.RouteInfo) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo7856y() {
        if (this.f11970o) {
            C3696be.m10711a(this.f11964a, this.f11965b);
        }
        this.f11970o = true;
        ((MediaRouter) this.f11964a).addCallback(this.f11968m, (MediaRouter.Callback) this.f11965b, this.f11969n | true ? 1 : 0);
    }
}
