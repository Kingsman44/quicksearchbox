package com.google.apps.tiktok.concurrent;

import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.apps.tiktok.concurrent.ah */
/* compiled from: PG */
final class C46421ah extends C60873d {

    /* renamed from: a */
    private C46423aj f121481a;

    /* renamed from: b */
    private final int f121482b;

    public C46421ah(C46423aj ajVar, int i) {
        this.f121481a = ajVar;
        this.f121482b = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46268a() {
        long j;
        int i;
        int i2;
        boolean z;
        C46423aj ajVar = this.f121481a;
        this.f121481a = null;
        if (ajVar != null) {
            do {
                j = ajVar.f121485b.get();
                i = (int) j;
                i2 = (int) (j >>> 32);
                if (i != Integer.MIN_VALUE) {
                    z = i == -2147483647;
                    if (z) {
                        i2++;
                    }
                } else {
                    throw new AssertionError("Refcount is: " + j);
                }
            } while (!ajVar.f121485b.compareAndSet(j, C46423aj.m82774a(i2, i - 1)));
            if (z) {
                while (true) {
                    C46422ai aiVar = (C46422ai) ajVar.f121486c.get();
                    if (aiVar != null && aiVar.f121483a <= this.f121482b) {
                        aiVar.cancel(true);
                        AtomicReference atomicReference = ajVar.f121486c;
                        while (true) {
                            if (!atomicReference.compareAndSet(aiVar, (Object) null)) {
                                if (atomicReference.get() != aiVar) {
                                }
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: hT */
    public final String mo45912hT() {
        C60930r rVar;
        C46423aj ajVar = this.f121481a;
        if (ajVar == null || (rVar = ajVar.f121484a.f121479a) == null) {
            return null;
        }
        String str = "callable=[" + rVar.toString() + "]";
        C46422ai aiVar = (C46422ai) this.f121481a.f121486c.get();
        if (aiVar == null) {
            return str;
        }
        return str + ", trial=[" + aiVar.toString() + "]";
    }
}
