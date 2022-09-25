package com.google.android.libraries.elements.p1714d;

import android.util.LongSparseArray;
import com.google.android.libraries.elements.interfaces.C21258ba;
import com.google.android.libraries.elements.interfaces.EnvironmentDataObserver;
import com.google.android.libraries.elements.interfaces.EnvironmentDataSource;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70120l;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69945az;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69954bh;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69956bj;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69985o;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.libraries.elements.d.df */
/* compiled from: PG */
public final class C20910df extends EnvironmentDataSource {

    /* renamed from: a */
    public volatile byte[] f58618a = C21258ba.f59581a;

    /* renamed from: b */
    private final AtomicLong f58619b = new AtomicLong(1);

    /* renamed from: c */
    private final Object f58620c = new Object();

    /* renamed from: d */
    private final LongSparseArray f58621d = new LongSparseArray();

    /* renamed from: e */
    private final C70120l f58622e;

    public C20910df(C70120l lVar) {
        C69985o oVar = new C69985o(lVar, new C20909de(this));
        C69822d dVar = C70101a.f186843k;
        AtomicReference atomicReference = new AtomicReference();
        C69956bj bjVar = new C69956bj(new C69954bh(atomicReference), oVar, atomicReference);
        C69822d dVar2 = C70101a.f186844l;
        C69945az azVar = new C69945az(bjVar);
        C69822d dVar3 = C70101a.f186843k;
        this.f58622e = azVar;
    }

    public final byte[] getEnvironmentData() {
        return this.f58618a;
    }

    public final long subscribeToEnvironmentData(EnvironmentDataObserver environmentDataObserver) {
        if (environmentDataObserver == null) {
            return 0;
        }
        long andIncrement = this.f58619b.getAndIncrement();
        synchronized (this.f58620c) {
            this.f58621d.put(andIncrement, this.f58622e.mo61654n(new C20908dd(environmentDataObserver)));
        }
        return andIncrement;
    }

    public final void unsubscribeFromEnvironmentData(long j) {
        synchronized (this.f58620c) {
            C69803b bVar = (C69803b) this.f58621d.get(j);
            if (bVar != null) {
                bVar.dispose();
            }
            this.f58621d.remove(j);
        }
    }
}
