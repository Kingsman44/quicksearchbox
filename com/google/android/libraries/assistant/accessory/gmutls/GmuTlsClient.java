package com.google.android.libraries.assistant.accessory.gmutls;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
public class GmuTlsClient implements Closeable {

    /* renamed from: a */
    private static final C59071e f36197a = C59071e.m91332i("com.google.android.libraries.assistant.accessory.gmutls.GmuTlsClient");

    /* renamed from: b */
    private volatile long f36198b = -1;

    /* renamed from: c */
    private final AtomicInteger f36199c = new AtomicInteger(0);

    /* renamed from: d */
    private final CopyOnWriteArraySet f36200d = new CopyOnWriteArraySet();

    /* renamed from: e */
    private final ReentrantLock f36201e;

    static {
        C11026i.m26116a();
    }

    public GmuTlsClient() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f36201e = reentrantLock;
        if (this.f36198b == -1) {
            try {
                if (reentrantLock.tryLock(1, TimeUnit.SECONDS)) {
                    this.f36198b = createNativePeer();
                    reentrantLock.unlock();
                    return;
                }
                C59104x d = f36197a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "GmuTlsClient");
                ((C59052c) ((C59052c) d).mo56372aa(42437)).mo56386p("Timed out waiting for construction lock");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                C59104x c = f36197a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GmuTlsClient");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(42438)).mo56386p("Could not initialize the client");
            } catch (Throwable th) {
                this.f36201e.unlock();
                throw th;
            }
        }
    }

    /* renamed from: a */
    private final synchronized void m26078a() {
        this.f36199c.getAndSet(1);
        C58976aa aaVar = C58975e.f156826a;
        Iterator it = this.f36200d.iterator();
        while (it.hasNext()) {
            ((C11023f) it.next()).mo19485a();
        }
    }

    private native void boringShutdownClient(long j);

    private native int[] boringUnwrap(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    private native int[] boringWrap(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    private native long createNativePeer();

    private native int getMaxEncryptedRecordDataSize(long j);

    private native int[] handshakeExchange(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    private native int initSslEngine(long j, ByteBuffer byteBuffer, int i);

    private native void nativeEndSession(long j);

    public final synchronized void close() {
        if (this.f36199c.get() > 1) {
            m26078a();
            try {
                if (this.f36201e.tryLock(1, TimeUnit.SECONDS)) {
                    boringShutdownClient(this.f36198b);
                    this.f36201e.unlock();
                } else {
                    C59104x c = f36197a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "GmuTlsClient");
                    ((C59052c) ((C59052c) c).mo56372aa(42440)).mo56386p("Timed out waiting for close lock");
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                C59104x c2 = f36197a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "GmuTlsClient");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(42441)).mo56386p("Thread interruption while closing");
            } catch (Throwable th) {
                this.f36201e.unlock();
                throw th;
            }
        } else {
            C59104x d = f36197a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GmuTlsClient");
            ((C59052c) ((C59052c) d).mo56372aa(42439)).mo56386p("The client was never initialized, or is closed");
        }
        this.f36198b = -1;
    }
}
