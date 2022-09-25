package androidx.lifecycle;

import android.os.Handler;

/* renamed from: androidx.lifecycle.am */
/* compiled from: PG */
public final class C2338am implements C2391v {

    /* renamed from: a */
    public static final C2338am f6534a = new C2338am();

    /* renamed from: b */
    public int f6535b = 0;

    /* renamed from: c */
    public int f6536c = 0;

    /* renamed from: d */
    public boolean f6537d = true;

    /* renamed from: e */
    public boolean f6538e = true;

    /* renamed from: f */
    public Handler f6539f;

    /* renamed from: g */
    public final C2393x f6540g = new C2393x(this);

    /* renamed from: h */
    public final Runnable f6541h = new C2334ai(this);

    private C2338am() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5735a() {
        if (this.f6535b == 0 && this.f6537d) {
            this.f6540g.mo5793e(C2382m.ON_STOP);
            this.f6538e = true;
        }
    }

    public final C2384o getLifecycle() {
        return this.f6540g;
    }
}
