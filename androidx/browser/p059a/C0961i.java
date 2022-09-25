package androidx.browser.p059a;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p026a.C0119a;

/* renamed from: androidx.browser.a.i */
/* compiled from: PG */
final class C0961i extends C0119a {

    /* renamed from: a */
    final /* synthetic */ C0955c f3062a;

    /* renamed from: b */
    private final Handler f3063b = new Handler(Looper.getMainLooper());

    public C0961i(C0955c cVar) {
        this.f3062a = cVar;
    }

    /* renamed from: a */
    public final void mo88a(String str, Bundle bundle) {
        this.f3063b.post(new C0957e(this, str, bundle));
    }

    /* renamed from: b */
    public final void mo89b(int i, Bundle bundle) {
        this.f3063b.post(new C0956d(this, i, bundle));
    }

    /* renamed from: c */
    public final Bundle mo90c() {
        return null;
    }

    /* renamed from: d */
    public final void mo91d() {
        this.f3063b.post(new C0960h());
    }

    /* renamed from: e */
    public final void mo92e() {
        this.f3063b.post(new C0958f(this));
    }

    /* renamed from: f */
    public final void mo93f() {
        this.f3063b.post(new C0959g(this));
    }
}
