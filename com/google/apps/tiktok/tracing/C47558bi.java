package com.google.apps.tiktok.tracing;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.apps.tiktok.tracing.bi */
/* compiled from: PG */
public final class C47558bi implements Runnable, C47573bx {

    /* renamed from: a */
    private C47572bw f123416a;

    /* renamed from: b */
    private C47572bw f123417b;

    /* renamed from: c */
    private final boolean f123418c;

    /* renamed from: d */
    private boolean f123419d;

    /* renamed from: e */
    private boolean f123420e;

    public C47558bi(C47572bw bwVar) {
        this.f123416a = bwVar;
        this.f123417b = bwVar;
        this.f123418c = C19559g.m37305d(bwVar.mo51368c());
    }

    /* renamed from: b */
    private final void m84645b() {
        boolean z = true;
        this.f123419d = true;
        C47572bw bwVar = this.f123416a;
        if (!this.f123418c || this.f123420e || !C19559g.m37305d(Thread.currentThread())) {
            z = false;
        }
        bwVar.mo51397j(z);
        this.f123416a = null;
    }

    /* renamed from: a */
    public final void mo51417a(C60870cx cxVar) {
        if (this.f123419d) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        } else if (!this.f123420e) {
            this.f123420e = true;
            this.f123416a.mo51399l();
            cxVar.mo4106b(this, C60826bg.f164896a);
        } else {
            throw new IllegalStateException("Signal is already attached to future");
        }
    }

    public final void run() {
        if (this.f123419d || !this.f123420e) {
            C19559g.m37302a().post(C47557bh.f123415a);
            return;
        }
        m84645b();
    }

    public final void close() {
        C47572bw bwVar = this.f123417b;
        try {
            this.f123417b = null;
            if (!this.f123420e) {
                if (!this.f123419d) {
                    m84645b();
                } else {
                    throw new IllegalStateException("Span was already closed!");
                }
            }
            if (bwVar != null) {
                bwVar.close();
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
