package androidx.mediarouter.p175a;

import android.media.MediaRouter;

/* renamed from: androidx.mediarouter.a.ce */
/* compiled from: PG */
public final class C3723ce extends C3748u {

    /* renamed from: a */
    private final Object f11956a;

    public C3723ce(Object obj) {
        this.f11956a = obj;
    }

    /* renamed from: b */
    public final void mo7817b(int i) {
        ((MediaRouter.RouteInfo) this.f11956a).requestSetVolume(i);
    }

    /* renamed from: c */
    public final void mo7818c(int i) {
        ((MediaRouter.RouteInfo) this.f11956a).requestUpdateVolume(i);
    }
}
