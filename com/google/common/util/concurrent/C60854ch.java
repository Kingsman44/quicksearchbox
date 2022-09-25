package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.common.util.concurrent.ch */
/* compiled from: PG */
public final class C60854ch {

    /* renamed from: a */
    public boolean f164942a = false;

    /* renamed from: b */
    public boolean f164943b = true;

    /* renamed from: c */
    public final AtomicInteger f164944c;

    /* renamed from: d */
    public final C60870cx[] f164945d;

    /* renamed from: e */
    public volatile int f164946e = 0;

    public C60854ch(C60870cx[] cxVarArr) {
        this.f164945d = cxVarArr;
        this.f164944c = new AtomicInteger(cxVarArr.length);
    }

    /* renamed from: a */
    public final void mo57337a() {
        if (this.f164944c.decrementAndGet() == 0 && this.f164942a) {
            for (C60870cx cxVar : this.f164945d) {
                if (cxVar != null) {
                    cxVar.cancel(this.f164943b);
                }
            }
        }
    }
}
