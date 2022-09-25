package androidx.mediarouter.p175a;

import android.media.MediaRouter;

/* renamed from: androidx.mediarouter.a.bd */
/* compiled from: PG */
final class C3695bd extends MediaRouter.VolumeCallback {

    /* renamed from: a */
    protected final C3694bc f11893a;

    public C3695bd(C3694bc bcVar) {
        this.f11893a = bcVar;
    }

    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.f11893a.mo7795k(routeInfo, i);
    }

    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.f11893a.mo7796l(routeInfo, i);
    }
}
