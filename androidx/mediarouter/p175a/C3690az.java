package androidx.mediarouter.p175a;

import android.media.MediaRouter;

/* renamed from: androidx.mediarouter.a.az */
/* compiled from: PG */
class C3690az extends MediaRouter.Callback {

    /* renamed from: a */
    protected final C3689ay f11892a;

    public C3690az(C3689ay ayVar) {
        this.f11892a = ayVar;
    }

    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.f11892a.mo7779a(routeInfo);
    }

    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.f11892a.mo7780b(routeInfo);
    }

    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
        this.f11892a.mo7783g();
    }

    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.f11892a.mo7781d(routeInfo);
    }

    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.f11892a.mo7784h(routeInfo);
    }

    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.f11892a.mo7785i();
    }

    public final void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.f11892a.mo7786j();
    }

    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.f11892a.mo7782e(routeInfo);
    }
}
