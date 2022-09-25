package androidx.mediarouter.p175a;

import android.content.Context;
import android.media.MediaRouter;
import android.view.Display;

/* renamed from: androidx.mediarouter.a.ci */
/* compiled from: PG */
class C3727ci extends C3726ch implements C3689ay {

    /* renamed from: r */
    private C3697bf f11976r;

    /* renamed from: s */
    private C3699bh f11977s;

    public C3727ci(Context context, C3729ck ckVar) {
        super(context, ckVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo7843m(C3724cf cfVar, C3738k kVar) {
        super.mo7843m(cfVar, kVar);
        if (!((MediaRouter.RouteInfo) cfVar.f11957a).isEnabled()) {
            kVar.mo7876f(false);
        }
        if (mo7858C(cfVar)) {
            kVar.mo7873c(1);
        }
        Display a = C3700bi.m10713a(cfVar.f11957a);
        if (a != null) {
            kVar.mo7879i(a.getDisplayId());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo7848q() {
        return new C3698bg(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo7856y() {
        super.mo7856y();
        if (this.f11976r == null) {
            this.f11976r = new C3697bf();
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public boolean mo7858C(C3724cf cfVar) {
        if (this.f11977s == null) {
            this.f11977s = new C3699bh();
        }
        Object obj = cfVar.f11957a;
        throw null;
    }
}
