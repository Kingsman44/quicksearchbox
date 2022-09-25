package com.google.android.libraries.social.populous.p3296e.p3303g;

import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.social.populous.e.g.h */
/* compiled from: PG */
public final /* synthetic */ class C42535h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C42540m f111547a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f111548b;

    /* renamed from: c */
    public final /* synthetic */ boolean f111549c;

    /* renamed from: d */
    public final /* synthetic */ boolean f111550d;

    public /* synthetic */ C42535h(C42540m mVar, C60870cx cxVar, boolean z, boolean z2) {
        this.f111547a = mVar;
        this.f111548b = cxVar;
        this.f111549c = z;
        this.f111550d = z2;
    }

    public final void run() {
        C42540m mVar = this.f111547a;
        C60870cx cxVar = this.f111548b;
        boolean z = this.f111549c;
        boolean z2 = this.f111550d;
        AtomicReference atomicReference = mVar.f111569i;
        while (!atomicReference.compareAndSet(cxVar, (Object) null)) {
            if (atomicReference.get() != cxVar) {
                return;
            }
        }
        if (z) {
            mVar.f111570j.compareAndSet(true, false);
        }
        if (z2) {
            mVar.f111571k.compareAndSet(true, false);
        }
    }
}
