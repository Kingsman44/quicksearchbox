package com.google.android.libraries.search.rendering.xuikit.p3144e;

import com.google.common.util.concurrent.C60845bz;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5502e.p5508f.C70010a;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.e.m */
/* compiled from: PG */
public final class C40495m implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70010a f106259a;

    public C40495m(C70010a aVar) {
        this.f106259a = aVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f106259a.mo61578a(th);
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        C69803b bVar;
        if (obj == null) {
            this.f106259a.mo61578a(new NullPointerException("The Future returned null"));
            return;
        }
        C70010a aVar = this.f106259a;
        if (aVar.get() != C69828d.f186198a && (bVar = (C69803b) aVar.getAndSet(C69828d.f186198a)) != C69828d.f186198a) {
            try {
                aVar.f186629a.mo61488d(obj);
                if (bVar != null) {
                    bVar.dispose();
                }
            } catch (Throwable th) {
                if (bVar != null) {
                    bVar.dispose();
                }
                throw th;
            }
        }
    }
}
