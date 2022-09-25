package com.facebook.litho.p324c;

import android.view.Choreographer;
import com.facebook.litho.C6386hk;
import com.facebook.litho.C6387hl;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.litho.c.c */
/* compiled from: PG */
public abstract class C6149c {

    /* renamed from: a */
    public final AtomicReference f18176a = new AtomicReference();

    /* renamed from: b */
    private Runnable f18177b;

    /* renamed from: c */
    private Choreographer.FrameCallback f18178c;

    /* renamed from: a */
    public final Choreographer.FrameCallback mo13131a() {
        if (this.f18178c == null) {
            this.f18178c = new C6147a(this);
        }
        return this.f18178c;
    }

    /* renamed from: b */
    public final Runnable mo13132b() {
        if (this.f18177b == null) {
            this.f18177b = new C6148b(this);
        }
        return this.f18177b;
    }

    /* renamed from: c */
    public abstract void mo13133c(long j);

    /* renamed from: d */
    public final void mo13134d(long j) {
        this.f18176a.getAndSet((Object) null);
        C6386hk hkVar = C6387hl.f18905a;
        try {
            mo13133c(j);
        } catch (Throwable th) {
            throw th;
        } finally {
            C6386hk hkVar2 = C6387hl.f18905a;
        }
    }
}
