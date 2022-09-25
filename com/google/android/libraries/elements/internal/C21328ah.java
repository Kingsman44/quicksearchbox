package com.google.android.libraries.elements.internal;

import com.google.android.libraries.elements.interfaces.C21260bc;
import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;

/* renamed from: com.google.android.libraries.elements.internal.ah */
/* compiled from: PG */
public final class C21328ah implements C70123o {

    /* renamed from: a */
    final /* synthetic */ C70123o f59687a;

    /* renamed from: b */
    final /* synthetic */ C21329ai f59688b;

    /* renamed from: c */
    private final AtomicBoolean f59689c = new AtomicBoolean();

    public C21328ah(C21329ai aiVar, C70123o oVar) {
        this.f59688b = aiVar;
        this.f59687a = oVar;
    }

    /* renamed from: a */
    public final void mo25986a() {
        this.f59687a.mo25986a();
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        this.f59687a.mo25987b(th);
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        this.f59687a.mo26850d(bVar);
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        if (this.f59689c.compareAndSet(false, true)) {
            try {
                this.f59688b.f59690a.mo25818a(obj);
            } catch (Exception e) {
                throw new C21260bc("Error happened with doOnFirst Action", e);
            }
        }
        this.f59687a.mo25988lL(obj);
    }
}
