package com.google.android.libraries.p3340w.p3342b;

import android.os.SystemClock;
import com.google.android.libraries.performance.primes.metrics.p2411f.C31447f;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import p5488io.grpc.C70172bg;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70906u;
import p5488io.grpc.binder.C70175a;
import p5488io.grpc.p5524d.C70311h;

/* renamed from: com.google.android.libraries.w.b.f */
/* compiled from: PG */
final class C43216f extends C70906u {

    /* renamed from: a */
    public final Object f112940a = new Object();

    /* renamed from: b */
    public final C31447f f112941b;

    /* renamed from: c */
    public boolean f112942c;

    /* renamed from: d */
    public int f112943d;

    /* renamed from: e */
    public int f112944e;

    public C43216f(C31447f fVar) {
        this.f112941b = fVar;
    }

    /* renamed from: a */
    public final void mo46270a() {
        synchronized (this.f112940a) {
            if (!this.f112942c) {
                C31447f fVar = this.f112941b;
                fVar.f84666b = SystemClock.elapsedRealtime() - fVar.f84665a;
            }
        }
    }

    /* renamed from: b */
    public final void mo46271b(long j) {
        synchronized (this.f112940a) {
            this.f112943d += (int) j;
        }
    }

    /* renamed from: c */
    public final void mo46272c(long j) {
        synchronized (this.f112940a) {
            this.f112944e += (int) j;
        }
    }

    /* renamed from: d */
    public final void mo46273d(C70256c cVar) {
        synchronized (this.f112940a) {
            C31447f fVar = this.f112941b;
            SocketAddress socketAddress = (SocketAddress) cVar.f187256b.get(C70172bg.f187019a);
            if (!(socketAddress instanceof InetSocketAddress)) {
                if (socketAddress instanceof C70311h) {
                    fVar.f84685u = 2;
                } else if (socketAddress instanceof C70175a) {
                    fVar.f84685u = 3;
                }
            }
        }
    }
}
