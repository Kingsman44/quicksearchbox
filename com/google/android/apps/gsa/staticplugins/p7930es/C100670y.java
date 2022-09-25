package com.google.android.apps.gsa.staticplugins.p7930es;

import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.es.y */
/* compiled from: PG */
public final class C100670y {

    /* renamed from: a */
    protected final Runnable f281500a;

    /* renamed from: b */
    C60870cx f281501b;

    /* renamed from: c */
    protected volatile long f281502c;

    /* renamed from: d */
    private final C22871g f281503d;

    public C100670y(C22871g gVar, Runnable runnable) {
        this.f281500a = runnable;
        this.f281503d = gVar;
    }

    /* renamed from: a */
    public final void mo92005a() {
        this.f281502c = System.currentTimeMillis() + 5000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo92006b() {
        try {
            this.f281501b = this.f281503d.mo28208h("Watchdog Task", Math.max(1, this.f281502c - System.currentTimeMillis()), new C100669x(this));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: c */
    public final void mo92007c() {
        C60870cx cxVar = this.f281501b;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
    }
}
