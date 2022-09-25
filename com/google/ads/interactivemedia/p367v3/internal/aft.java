package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;
import android.view.Surface;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aft */
/* compiled from: PG */
public final class aft {

    /* renamed from: a */
    private final Handler f20596a;

    /* renamed from: b */
    private final afu f20597b;

    public aft(Handler handler, afu afu) {
        this.f20596a = afu == null ? null : handler;
        this.f20597b = afu;
    }

    /* renamed from: a */
    public final void mo14677a(C7022iu iuVar) {
        Handler handler = this.f20596a;
        if (handler != null) {
            handler.post(new afl(this, iuVar));
        }
    }

    /* renamed from: b */
    public final void mo14678b(String str, long j, long j2) {
        Handler handler = this.f20596a;
        if (handler != null) {
            handler.post(new afm(this, str, j, j2));
        }
    }

    /* renamed from: c */
    public final void mo14679c(C6864cy cyVar) {
        Handler handler = this.f20596a;
        if (handler != null) {
            handler.post(new afn(this, cyVar));
        }
    }

    /* renamed from: d */
    public final void mo14680d(int i, long j) {
        Handler handler = this.f20596a;
        if (handler != null) {
            handler.post(new afo(this, i, j));
        }
    }

    /* renamed from: e */
    public final void mo14681e(long j, int i) {
        Handler handler = this.f20596a;
        if (handler != null) {
            handler.post(new afp(this, j, i));
        }
    }

    /* renamed from: f */
    public final void mo14682f(int i, int i2, int i3, float f) {
        Handler handler = this.f20596a;
        if (handler != null) {
            handler.post(new afq(this, i, i2, i3, f));
        }
    }

    /* renamed from: g */
    public final void mo14683g(Surface surface) {
        Handler handler = this.f20596a;
        if (handler != null) {
            handler.post(new afr(this, surface));
        }
    }

    /* renamed from: h */
    public final void mo14684h(C7022iu iuVar) {
        iuVar.mo16041a();
        Handler handler = this.f20596a;
        if (handler != null) {
            handler.post(new afs(this, iuVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo14685i(C7022iu iuVar) {
        iuVar.mo16041a();
        afu afu = this.f20597b;
        int i = aeu.f20466a;
        afu.mo14699w(iuVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo14686j(Surface surface) {
        afu afu = this.f20597b;
        int i = aeu.f20466a;
        afu.mo14698f(surface);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo14687k(int i, int i2, int i3, float f) {
        afu afu = this.f20597b;
        int i4 = aeu.f20466a;
        afu.mo14697e(i, i2, i3, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo14688l(long j, int i) {
        afu afu = this.f20597b;
        int i2 = aeu.f20466a;
        afu.mo14700x(j, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo14689m(int i, long j) {
        afu afu = this.f20597b;
        int i2 = aeu.f20466a;
        afu.mo14696d(i, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo14690n(C6864cy cyVar) {
        afu afu = this.f20597b;
        int i = aeu.f20466a;
        afu.mo14695c(cyVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo14691o(String str, long j, long j2) {
        afu afu = this.f20597b;
        int i = aeu.f20466a;
        afu.mo14694b(str, j, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo14692p(C7022iu iuVar) {
        afu afu = this.f20597b;
        int i = aeu.f20466a;
        afu.mo14693a(iuVar);
    }
}
