package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Handler;

/* renamed from: com.google.ads.interactivemedia.v3.internal.hh */
/* compiled from: PG */
public final class C6982hh {

    /* renamed from: a */
    private final Handler f22264a;

    /* renamed from: b */
    private final C6983hi f22265b;

    public C6982hh(Handler handler, C6983hi hiVar) {
        this.f22264a = hiVar == null ? null : handler;
        this.f22265b = hiVar;
    }

    /* renamed from: a */
    public final void mo15910a(C7022iu iuVar) {
        Handler handler = this.f22264a;
        if (handler != null) {
            handler.post(new C6972gy(this, iuVar));
        }
    }

    /* renamed from: b */
    public final void mo15911b(String str, long j, long j2) {
        Handler handler = this.f22264a;
        if (handler != null) {
            handler.post(new C6973gz(this, str, j, j2));
        }
    }

    /* renamed from: c */
    public final void mo15912c(C6864cy cyVar) {
        Handler handler = this.f22264a;
        if (handler != null) {
            handler.post(new C6975ha(this, cyVar));
        }
    }

    /* renamed from: d */
    public final void mo15913d(long j) {
        Handler handler = this.f22264a;
        if (handler != null) {
            handler.post(new C6976hb(this, j));
        }
    }

    /* renamed from: e */
    public final void mo15914e(int i, long j, long j2) {
        Handler handler = this.f22264a;
        if (handler != null) {
            handler.post(new C6977hc(this, i, j, j2));
        }
    }

    /* renamed from: f */
    public final void mo15915f(C7022iu iuVar) {
        iuVar.mo16041a();
        Handler handler = this.f22264a;
        if (handler != null) {
            handler.post(new C6978hd(this, iuVar));
        }
    }

    /* renamed from: g */
    public final void mo15916g(int i) {
        Handler handler = this.f22264a;
        if (handler != null) {
            handler.post(new C6979he(this, i));
        }
    }

    /* renamed from: h */
    public final void mo15917h(boolean z) {
        Handler handler = this.f22264a;
        if (handler != null) {
            handler.post(new C6980hf(this, z));
        }
    }

    /* renamed from: i */
    public final void mo15918i(Exception exc) {
        Handler handler = this.f22264a;
        if (handler != null) {
            handler.post(new C6981hg(this, exc));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo15919j(boolean z) {
        C6983hi hiVar = this.f22265b;
        int i = aeu.f20466a;
        hiVar.mo15803F(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final /* synthetic */ void mo15920k(int i) {
        C6983hi hiVar = this.f22265b;
        int i2 = aeu.f20466a;
        hiVar.mo15812z(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo15921l(C7022iu iuVar) {
        iuVar.mo16041a();
        C6983hi hiVar = this.f22265b;
        int i = aeu.f20466a;
        hiVar.mo15802E(iuVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo15922m(int i, long j, long j2) {
        C6983hi hiVar = this.f22265b;
        int i2 = aeu.f20466a;
        hiVar.mo15801D(i, j, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo15923n(long j) {
        C6983hi hiVar = this.f22265b;
        int i = aeu.f20466a;
        hiVar.mo15800C(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo15924o(C6864cy cyVar) {
        C6983hi hiVar = this.f22265b;
        int i = aeu.f20466a;
        hiVar.mo15799B(cyVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo15925p(String str, long j, long j2) {
        C6983hi hiVar = this.f22265b;
        int i = aeu.f20466a;
        hiVar.mo15798A(str, j, j2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo15926q(C7022iu iuVar) {
        C6983hi hiVar = this.f22265b;
        int i = aeu.f20466a;
        hiVar.mo15811y(iuVar);
    }
}
