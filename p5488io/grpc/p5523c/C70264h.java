package p5488io.grpc.p5523c;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.Collection;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalCronetEngine;
import p5488io.grpc.C70334de;
import p5488io.grpc.p5525e.C70357a;
import p5488io.grpc.p5525e.C70460dv;
import p5488io.grpc.p5525e.C70676lv;

/* renamed from: io.grpc.c.h */
/* compiled from: PG */
final class C70264h implements C70357a {

    /* renamed from: a */
    final /* synthetic */ C70266j f187287a;

    public C70264h(C70266j jVar) {
        this.f187287a = jVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61915a(p5488io.grpc.Status r5) {
        /*
            r4 = this;
            io.grpc.c.j r0 = r4.f187287a
            io.grpc.c.i r0 = r0.f187314o
            int r1 = p5488io.grpc.p5523c.C70265i.f187288i
            java.lang.Object r0 = r0.f187289a
            monitor-enter(r0)
            io.grpc.c.j r1 = r4.f187287a     // Catch:{ all -> 0x0046 }
            io.grpc.c.i r1 = r1.f187314o     // Catch:{ all -> 0x0046 }
            boolean r2 = r1.f187292d     // Catch:{ all -> 0x0046 }
            if (r2 != 0) goto L_0x0044
            r2 = 1
            r1.f187292d = r2     // Catch:{ all -> 0x0046 }
            r1.f187293e = r5     // Catch:{ all -> 0x0046 }
            java.util.Collection r2 = r1.f187290b     // Catch:{ all -> 0x0046 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0046 }
        L_0x001c:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0046 }
            if (r3 == 0) goto L_0x002e
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0046 }
            io.grpc.c.g r3 = (p5488io.grpc.p5523c.C70263g) r3     // Catch:{ all -> 0x0046 }
            java.nio.ByteBuffer r3 = r3.f187284a     // Catch:{ all -> 0x0046 }
            r3.clear()     // Catch:{ all -> 0x0046 }
            goto L_0x001c
        L_0x002e:
            java.util.Collection r1 = r1.f187290b     // Catch:{ all -> 0x0046 }
            r1.clear()     // Catch:{ all -> 0x0046 }
            io.grpc.c.j r1 = r4.f187287a     // Catch:{ all -> 0x0046 }
            org.chromium.net.BidirectionalStream r2 = r1.f187310k     // Catch:{ all -> 0x0046 }
            if (r2 == 0) goto L_0x003d
            r2.cancel()     // Catch:{ all -> 0x0046 }
            goto L_0x0042
        L_0x003d:
            io.grpc.c.m r2 = r1.f187308i     // Catch:{ all -> 0x0046 }
            r2.mo61930a(r1, r5)     // Catch:{ all -> 0x0046 }
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            return
        L_0x0044:
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            return
        L_0x0046:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0049:
            throw r5
        L_0x004a:
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5523c.C70264h.mo61915a(io.grpc.Status):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61916b(p5488io.grpc.p5525e.C70680lz r4, boolean r5, boolean r6, int r7) {
        /*
            r3 = this;
            io.grpc.c.j r7 = r3.f187287a
            io.grpc.c.i r7 = r7.f187314o
            int r0 = p5488io.grpc.p5523c.C70265i.f187288i
            java.lang.Object r7 = r7.f187289a
            monitor-enter(r7)
            io.grpc.c.j r0 = r3.f187287a     // Catch:{ all -> 0x0042 }
            io.grpc.c.i r0 = r0.f187314o     // Catch:{ all -> 0x0042 }
            boolean r0 = r0.f187292d     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0013
            monitor-exit(r7)     // Catch:{ all -> 0x0042 }
            return
        L_0x0013:
            if (r4 == 0) goto L_0x001d
            io.grpc.c.n r4 = (p5488io.grpc.p5523c.C70270n) r4     // Catch:{ all -> 0x0042 }
            java.nio.ByteBuffer r4 = r4.f187342a     // Catch:{ all -> 0x0042 }
            r4.flip()     // Catch:{ all -> 0x0042 }
            goto L_0x001f
        L_0x001d:
            java.nio.ByteBuffer r4 = p5488io.grpc.p5523c.C70266j.f187298a     // Catch:{ all -> 0x0042 }
        L_0x001f:
            io.grpc.c.j r0 = r3.f187287a     // Catch:{ all -> 0x0042 }
            int r1 = r4.remaining()     // Catch:{ all -> 0x0042 }
            io.grpc.c.i r0 = r0.f187314o     // Catch:{ all -> 0x0042 }
            r0.mo62323l(r1)     // Catch:{ all -> 0x0042 }
            io.grpc.c.j r0 = r3.f187287a     // Catch:{ all -> 0x0042 }
            io.grpc.c.i r1 = r0.f187314o     // Catch:{ all -> 0x0042 }
            boolean r2 = r1.f187291c     // Catch:{ all -> 0x0042 }
            if (r2 != 0) goto L_0x003d
            io.grpc.c.g r0 = new io.grpc.c.g     // Catch:{ all -> 0x0042 }
            r0.<init>(r4, r5, r6)     // Catch:{ all -> 0x0042 }
            java.util.Collection r4 = r1.f187290b     // Catch:{ all -> 0x0042 }
            r4.add(r0)     // Catch:{ all -> 0x0042 }
            goto L_0x0040
        L_0x003d:
            r0.mo61927u(r4, r5, r6)     // Catch:{ all -> 0x0042 }
        L_0x0040:
            monitor-exit(r7)     // Catch:{ all -> 0x0042 }
            return
        L_0x0042:
            r4 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0042 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5523c.C70264h.mo61916b(io.grpc.e.lz, boolean, boolean, int):void");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final void mo61917c(C70334de deVar) {
        this.f187287a.f187309j.run();
        C70266j jVar = this.f187287a;
        C70259c cVar = jVar.f187315p;
        if (cVar != null) {
            C70260d dVar = (C70260d) cVar;
            ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder = ((ExperimentalCronetEngine) dVar.f187268e).newBidirectionalStreamBuilder(jVar.f187303d, new C70262f(jVar), jVar.f187306g);
            if (dVar.f187269f) {
                int i = dVar.f187270g;
                if (!C70260d.f187264a) {
                    synchronized (C70260d.class) {
                        if (!C70260d.f187264a) {
                            try {
                                C70260d.f187266c = ExperimentalBidirectionalStream.Builder.class.getMethod("setTrafficStatsTag", new Class[]{Integer.TYPE});
                                C70260d.f187264a = true;
                            } catch (NoSuchMethodException e) {
                                try {
                                    Log.w("CronetChannelBuilder", "Failed to load method ExperimentalBidirectionalStream.Builder.setTrafficStatsTag", e);
                                    C70260d.f187264a = true;
                                } catch (Throwable th) {
                                    C70260d.f187264a = true;
                                    throw th;
                                }
                            }
                        }
                    }
                }
                if (C70260d.f187266c != null) {
                    try {
                        C70260d.f187266c.invoke(newBidirectionalStreamBuilder, new Object[]{Integer.valueOf(i)});
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException(e2.getCause() == null ? e2.getTargetException() : e2.getCause());
                    } catch (IllegalAccessException e3) {
                        Log.w("CronetChannelBuilder", "Failed to set traffic stats tag: " + i, e3);
                    }
                }
            }
            if (dVar.f187271h) {
                int i2 = dVar.f187272i;
                if (!C70260d.f187265b) {
                    synchronized (C70260d.class) {
                        if (!C70260d.f187265b) {
                            try {
                                C70260d.f187267d = ExperimentalBidirectionalStream.Builder.class.getMethod("setTrafficStatsUid", new Class[]{Integer.TYPE});
                                C70260d.f187265b = true;
                            } catch (NoSuchMethodException e4) {
                                try {
                                    Log.w("CronetChannelBuilder", "Failed to load method ExperimentalBidirectionalStream.Builder.setTrafficStatsUid", e4);
                                    C70260d.f187265b = true;
                                } catch (Throwable th2) {
                                    C70260d.f187265b = true;
                                    throw th2;
                                }
                            }
                        }
                    }
                }
                if (C70260d.f187267d != null) {
                    try {
                        C70260d.f187267d.invoke(newBidirectionalStreamBuilder, new Object[]{Integer.valueOf(i2)});
                    } catch (InvocationTargetException e5) {
                        throw new RuntimeException(e5.getCause() == null ? e5.getTargetException() : e5.getCause());
                    } catch (IllegalAccessException e6) {
                        Log.w("CronetChannelBuilder", "Failed to set traffic stats uid: " + i2, e6);
                    }
                }
            }
            if (this.f187287a.f187311l) {
                newBidirectionalStreamBuilder.delayRequestHeadersUntilFirstFlush(true);
            }
            C70266j jVar2 = this.f187287a;
            Object obj = jVar2.f187312m;
            if (!(obj == null && jVar2.f187313n == null)) {
                if (obj != null) {
                    C70266j.m102425t(newBidirectionalStreamBuilder, obj);
                }
                Collection<Object> collection = this.f187287a.f187313n;
                if (collection != null) {
                    for (Object t : collection) {
                        C70266j.m102425t(newBidirectionalStreamBuilder, t);
                    }
                }
            }
            C70266j jVar3 = this.f187287a;
            newBidirectionalStreamBuilder.addHeader(C70460dv.f187791j.f187370a, jVar3.f187304e);
            newBidirectionalStreamBuilder.addHeader(C70460dv.f187789h.f187370a, "application/grpc");
            newBidirectionalStreamBuilder.addHeader("te", "trailers");
            byte[][] a = C70676lv.m103338a(jVar3.f187307h);
            for (int i3 = 0; i3 < a.length; i3 += 2) {
                String str = new String(a[i3], Charset.forName("UTF-8"));
                if (!C70460dv.f187789h.f187370a.equalsIgnoreCase(str) && !C70460dv.f187791j.f187370a.equalsIgnoreCase(str) && !C70460dv.f187790i.f187370a.equalsIgnoreCase(str)) {
                    newBidirectionalStreamBuilder.addHeader(str, new String(a[i3 + 1], Charset.forName("UTF-8")));
                }
            }
            this.f187287a.f187310k = newBidirectionalStreamBuilder.build();
            this.f187287a.f187310k.start();
        }
    }
}
