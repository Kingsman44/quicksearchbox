package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a;

import android.view.Choreographer;
import androidx.p060c.C0978h;
import androidx.p060c.C0979i;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import java.util.Set;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.a.aa */
/* compiled from: PG */
public final class C40129aa {

    /* renamed from: a */
    public final Set f105399a = new C0979i(0);

    /* renamed from: b */
    private final Choreographer f105400b;

    /* renamed from: c */
    private boolean f105401c = false;

    public C40129aa() {
        C19559g.m37304c();
        this.f105400b = Choreographer.getInstance();
    }

    /* renamed from: a */
    public final void mo42217a() {
        C19559g.m37304c();
        this.f105401c = true;
        C0978h hVar = new C0978h((C0979i) this.f105399a);
        while (hVar.hasNext()) {
            this.f105400b.removeFrameCallback((C40154z) hVar.next());
        }
        this.f105399a.clear();
    }

    /* renamed from: b */
    public final void mo42218b(Runnable runnable) {
        C19559g.m37304c();
        if (!this.f105401c) {
            C40154z zVar = new C40154z(this, runnable);
            this.f105400b.postFrameCallback(zVar);
            this.f105399a.add(zVar);
        }
    }

    /* renamed from: c */
    public final void mo42219c(Runnable runnable, Duration duration) {
        C19559g.m37304c();
        if (!this.f105401c) {
            C40154z zVar = new C40154z(this, runnable);
            this.f105400b.postFrameCallbackDelayed(zVar, duration.toMillis());
            this.f105399a.add(zVar);
        }
    }
}
