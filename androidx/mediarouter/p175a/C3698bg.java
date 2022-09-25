package androidx.mediarouter.p175a;

import android.media.MediaRouter;
import android.view.Display;

/* renamed from: androidx.mediarouter.a.bg */
/* compiled from: PG */
final class C3698bg extends C3690az {
    public C3698bg(C3727ci ciVar) {
        super(ciVar);
    }

    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        C3727ci ciVar = (C3727ci) this.f11892a;
        int n = ciVar.mo7845n(routeInfo);
        if (n >= 0) {
            C3724cf cfVar = (C3724cf) ciVar.f11971p.get(n);
            Display a = C3700bi.m10713a(routeInfo);
            int displayId = a != null ? a.getDisplayId() : -1;
            if (displayId != cfVar.f11959c.mo7887e()) {
                C3738k kVar = new C3738k(cfVar.f11959c);
                kVar.mo7879i(displayId);
                cfVar.f11959c = kVar.mo7871a();
                ciVar.mo7854w();
            }
        }
    }
}
