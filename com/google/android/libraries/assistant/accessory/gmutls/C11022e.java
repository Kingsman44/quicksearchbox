package com.google.android.libraries.assistant.accessory.gmutls;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;

/* renamed from: com.google.android.libraries.assistant.accessory.gmutls.e */
/* compiled from: PG */
public final class C11022e implements Closeable {

    /* renamed from: a */
    public static final long f36210a = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: b */
    public static final C59071e f36211b = C59071e.m91332i("com.google.android.libraries.assistant.accessory.gmutls.e");

    /* renamed from: c */
    public final CopyOnWriteArrayList f36212c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public final AtomicInteger f36213d = new AtomicInteger(1);

    /* renamed from: e */
    public GmuTlsEngine f36214e;

    /* renamed from: f */
    C11025h f36215f;

    /* renamed from: g */
    C11025h f36216g;

    /* renamed from: h */
    public final AtomicBoolean f36217h = new AtomicBoolean(false);

    /* renamed from: i */
    private final AtomicInteger f36218i = new AtomicInteger(0);

    /* renamed from: j */
    private int f36219j = 0;

    /* renamed from: j */
    private final SSLEngineResult.Status m26096j(C11018a aVar, C11018a aVar2, boolean z) {
        if (this.f36213d.get() == 1) {
            C59104x c = f36211b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GmuTls");
            ((C59052c) ((C59052c) c).mo56372aa(42411)).mo56386p("You must initialize the system with proper values before handshake");
            return SSLEngineResult.Status.CLOSED;
        } else if (this.f36213d.get() <= 8) {
            C59104x d = f36211b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GmuTls");
            ((C59052c) ((C59052c) d).mo56372aa(42410)).mo56386p("GmuTLS is not ready to encrypt, you must handshake first");
            return SSLEngineResult.Status.CLOSED;
        } else if (z) {
            int size = aVar.size();
            if (size > mo19475a()) {
                C59104x d2 = f36211b.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "GmuTls");
                ((C59052c) ((C59052c) d2).mo56372aa(42409)).mo56387q("The data passed in at %d bytes is too large to be encrypted", size);
                return SSLEngineResult.Status.BUFFER_OVERFLOW;
            }
            if (aVar2.mo19465a() >= size + (this.f36219j - mo19475a())) {
                return SSLEngineResult.Status.OK;
            }
            C59104x d3 = f36211b.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "GmuTls");
            ((C59052c) ((C59052c) d3).mo56372aa(42408)).mo56387q("The response buffer passed in at %d bytes is too small to handle the encrypted data", aVar2.mo19465a());
            return SSLEngineResult.Status.BUFFER_UNDERFLOW;
        } else {
            int size2 = aVar.size();
            int i = this.f36219j;
            if (size2 > i) {
                C59104x d4 = f36211b.mo56226d();
                d4.mo56378ag(C58975e.f156826a, "GmuTls");
                ((C59052c) ((C59052c) d4).mo56372aa(42407)).mo56387q("The data passed in at %d bytes is too large to be decrypted", size2);
                return SSLEngineResult.Status.BUFFER_OVERFLOW;
            }
            if (aVar2.mo19465a() >= size2 - (i - mo19475a())) {
                return SSLEngineResult.Status.OK;
            }
            C59104x d5 = f36211b.mo56226d();
            d5.mo56378ag(C58975e.f156826a, "GmuTls");
            ((C59052c) ((C59052c) d5).mo56372aa(42406)).mo56387q("The response buffer passed in at %d bytes is too small to handle the encrypted data", aVar2.mo19465a());
            return SSLEngineResult.Status.BUFFER_UNDERFLOW;
        }
    }

    /* renamed from: k */
    private final void m26097k() {
        C11025h hVar = this.f36216g;
        if (hVar != null) {
            hVar.mo19487c();
            C58976aa aaVar = C58975e.f156826a;
        }
    }

    /* renamed from: l */
    private final void m26098l() {
        C11025h hVar = this.f36215f;
        if (hVar != null) {
            hVar.mo19487c();
            this.f36217h.set(false);
            C58976aa aaVar = C58975e.f156826a;
        }
    }

    /* renamed from: m */
    private final void m26099m(int i) {
        this.f36213d.getAndSet(i);
        C58976aa aaVar = C58975e.f156826a;
        Iterator it = this.f36212c.iterator();
        while (it.hasNext()) {
            ((C11021d) it.next()).mo19474f();
        }
    }

    /* renamed from: n */
    private final boolean m26100n(C11018a aVar, SSLEngineResult sSLEngineResult) {
        if (SSLEngineResult.Status.OK.equals(sSLEngineResult.getStatus()) && SSLEngineResult.HandshakeStatus.FINISHED.equals(sSLEngineResult.getHandshakeStatus())) {
            C58976aa aaVar = C58975e.f156826a;
            this.f36218i.set(0);
            return false;
        } else if (this.f36218i.get() < 2) {
            this.f36218i.incrementAndGet();
            C58976aa aaVar2 = C58975e.f156826a;
            return false;
        } else if (this.f36214e == null) {
            return true;
        } else {
            mo19484i(aVar);
            m26099m(2);
            C58976aa aaVar3 = C58975e.f156826a;
            return true;
        }
    }

    /* renamed from: a */
    public final int mo19475a() {
        if (this.f36213d.get() == 1) {
            C59104x d = f36211b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GmuTls");
            ((C59052c) ((C59052c) d).mo56372aa(42404)).mo56386p("You must initialize the system with proper values before payload size is available");
            return 0;
        } else if (this.f36213d.get() < 3) {
            C59104x d2 = f36211b.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "GmuTls");
            ((C59052c) ((C59052c) d2).mo56372aa(42403)).mo56386p("You must complete the handshake before payload size is available");
            return 0;
        } else {
            GmuTlsEngine gmuTlsEngine = this.f36214e;
            if (gmuTlsEngine.f36203b == -1) {
                return 0;
            }
            try {
                if (gmuTlsEngine.f36206e.tryLock(1, TimeUnit.SECONDS)) {
                    int maxEncryptedRecordDataSize = gmuTlsEngine.getMaxEncryptedRecordDataSize(gmuTlsEngine.f36203b, 0);
                    gmuTlsEngine.f36206e.unlock();
                    return maxEncryptedRecordDataSize;
                }
                C59104x c = GmuTlsEngine.f36202a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
                ((C59052c) ((C59052c) c).mo56372aa(42443)).mo56386p("Timeout waiting to obtain get max payload size timeout lock");
                return 0;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                C59104x c2 = GmuTlsEngine.f36202a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(42444)).mo56386p("Thread interrupted getting max payload");
                return 0;
            } catch (Throwable th) {
                gmuTlsEngine.f36206e.unlock();
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final int mo19476b() {
        if (this.f36213d.get() != 2) {
            return -1;
        }
        try {
            GmuTlsEngine gmuTlsEngine = this.f36214e;
            if (gmuTlsEngine.f36203b != -1) {
                try {
                    if (gmuTlsEngine.f36206e.tryLock(1, TimeUnit.SECONDS)) {
                        int libraryVersion = gmuTlsEngine.getLibraryVersion(gmuTlsEngine.f36203b);
                        gmuTlsEngine.f36206e.unlock();
                        return libraryVersion;
                    }
                    C59104x c = GmuTlsEngine.f36202a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
                    ((C59052c) ((C59052c) c).mo56372aa(42448)).mo56386p("Timeout waiting to obtain version lock");
                    return 0;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    C59104x c2 = GmuTlsEngine.f36202a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
                    ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(42449)).mo56386p("Thread interrupted while getting version");
                } catch (Throwable th) {
                    gmuTlsEngine.f36206e.unlock();
                    throw th;
                }
            } else {
                throw new SSLException("GmuTls is not initialized");
            }
        } catch (SSLException e2) {
            C59104x c3 = f36211b.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "GmuTls");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e2)).mo56372aa(42405)).mo56386p("GmuTls has not been initialized yet, returning -1 for version");
            return -1;
        }
    }

    /* renamed from: c */
    public final SSLEngineResult mo19477c(C11018a aVar, C11018a aVar2) {
        SSLEngineResult.Status j = m26096j(aVar, aVar2, false);
        SSLEngineResult sSLEngineResult = new SSLEngineResult(j, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, 0);
        if (!j.equals(SSLEngineResult.Status.OK)) {
            C59104x d = f36211b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GmuTls");
            ((C59052c) ((C59052c) d).mo56372aa(42414)).mo56386p("There was a critical encryption / decryption failure");
            if (j.equals(SSLEngineResult.Status.BUFFER_OVERFLOW)) {
                return new SSLEngineResult(j, SSLEngineResult.HandshakeStatus.FINISHED, aVar.size(), 0);
            }
            return j.equals(SSLEngineResult.Status.BUFFER_UNDERFLOW) ? new SSLEngineResult(SSLEngineResult.Status.BUFFER_OVERFLOW, SSLEngineResult.HandshakeStatus.FINISHED, aVar2.mo19465a(), 0) : sSLEngineResult;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar2.mo19465a());
        try {
            m26099m(10);
            SSLEngineResult unwrap = this.f36214e.unwrap(aVar.mo19466b(), allocateDirect);
            aVar2.mo19467c(allocateDirect, unwrap.bytesProduced());
            if (this.f36214e.f36205d.get() != 3) {
                m26099m(8);
            } else {
                m26099m(11);
            }
            return unwrap;
        } catch (SSLException e) {
            C59071e eVar = f36211b;
            C59104x c = eVar.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GmuTls");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(42412)).mo56386p("There was an SSL error during decryption");
            m26099m(11);
            SSLEngineResult sSLEngineResult2 = new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, SSLEngineResult.HandshakeStatus.FINISHED, aVar.mo19465a(), 0);
            if (this.f36214e.f36205d.get() == -16) {
                this.f36214e.f36205d.getAndSet(3);
            }
            if (!m26100n(aVar2, sSLEngineResult2)) {
                return new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, SSLEngineResult.HandshakeStatus.FINISHED, 0, 0);
            }
            C59104x b = eVar.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GmuTls");
            ((C59052c) ((C59052c) b).mo56372aa(42413)).mo56386p("The client was kicked off due to too many failures");
            return new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, aVar2.size());
        }
    }

    public final void close() {
        GmuTlsEngine gmuTlsEngine = this.f36214e;
        if (gmuTlsEngine == null || !gmuTlsEngine.mo19434d()) {
            throw new IOException("The native peer was never enabled");
        }
        this.f36214e.mo19436f();
        C58976aa aaVar = C58975e.f156826a;
        m26097k();
        m26098l();
        this.f36212c.clear();
    }

    /* JADX WARNING: type inference failed for: r5v24, types: [boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0310  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final javax.net.ssl.SSLEngineResult mo19479d(com.google.android.libraries.assistant.accessory.gmutls.C11018a r18, com.google.android.libraries.assistant.accessory.gmutls.C11018a r19) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "Thread interrupted while handshaking"
            java.util.concurrent.atomic.AtomicInteger r0 = r1.f36213d
            int r0 = r0.get()
            java.lang.String r3 = "GmuTls"
            r4 = 0
            r5 = 1
            if (r0 == r5) goto L_0x0365
            java.util.concurrent.atomic.AtomicInteger r0 = r1.f36213d
            int r0 = r0.get()
            r6 = 11
            if (r0 == r6) goto L_0x0342
            java.util.concurrent.atomic.AtomicInteger r0 = r1.f36213d
            int r0 = r0.get()
            r7 = 3
            r8 = 2
            if (r0 != r8) goto L_0x0027
            r1.m26099m(r7)
        L_0x0027:
            int r0 = r19.mo19465a()
            java.nio.ByteBuffer r15 = java.nio.ByteBuffer.allocateDirect(r0)
            com.google.android.libraries.assistant.accessory.gmutls.GmuTlsEngine r13 = r1.f36214e     // Catch:{ SSLException -> 0x0320 }
            java.nio.ByteBuffer r0 = r18.mo19466b()     // Catch:{ SSLException -> 0x0320 }
            boolean r9 = r0.isDirect()     // Catch:{ SSLException -> 0x0320 }
            if (r9 == 0) goto L_0x0315
            boolean r9 = r15.isDirect()     // Catch:{ SSLException -> 0x0320 }
            if (r9 == 0) goto L_0x0315
            boolean r9 = r13.mo19434d()     // Catch:{ SSLException -> 0x0320 }
            java.lang.String r12 = "GmuTlsEngine"
            if (r9 != 0) goto L_0x0067
            com.google.common.f.e r0 = com.google.android.libraries.assistant.accessory.gmutls.GmuTlsEngine.f36202a     // Catch:{ SSLException -> 0x0320 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ SSLException -> 0x0320 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ SSLException -> 0x0320 }
            r0.mo56378ag(r2, r12)     // Catch:{ SSLException -> 0x0320 }
            java.lang.String r2 = "You must initialize the engine before handshaking"
            r9 = 42471(0xa5e7, float:5.9515E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r9)).mo56386p(r2)     // Catch:{ SSLException -> 0x0320 }
            javax.net.ssl.SSLEngineResult r0 = new javax.net.ssl.SSLEngineResult     // Catch:{ SSLException -> 0x0320 }
            javax.net.ssl.SSLEngineResult$Status r2 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch:{ SSLException -> 0x0320 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r9 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ SSLException -> 0x0320 }
            r0.<init>(r2, r9, r4, r4)     // Catch:{ SSLException -> 0x0320 }
            goto L_0x0278
        L_0x0067:
            java.util.concurrent.locks.ReentrantLock r9 = r13.f36206e     // Catch:{ InterruptedException -> 0x0255 }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0255 }
            r5 = 1
            boolean r9 = r9.tryLock(r5, r10)     // Catch:{ InterruptedException -> 0x0255 }
            java.lang.String r10 = "Timeout waiting to obtain handshake lock"
            if (r9 == 0) goto L_0x022f
            long r8 = r13.f36203b     // Catch:{ all -> 0x0226 }
            int r8 = r13.getClientCount(r8)     // Catch:{ all -> 0x0226 }
            if (r8 != 0) goto L_0x00ba
            long r8 = r13.f36203b     // Catch:{ all -> 0x0226 }
            int r11 = r13.f36204c     // Catch:{ all -> 0x0226 }
            int r8 = r13.initNewClient(r8, r11)     // Catch:{ all -> 0x0226 }
            if (r8 >= 0) goto L_0x00b8
            com.google.common.f.e r0 = com.google.android.libraries.assistant.accessory.gmutls.GmuTlsEngine.f36202a     // Catch:{ all -> 0x0226 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0226 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0226 }
            r0.mo56378ag(r5, r12)     // Catch:{ all -> 0x0226 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0226 }
            r5 = 42470(0xa5e6, float:5.9513E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r5)     // Catch:{ all -> 0x0226 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0226 }
            java.lang.String r5 = "There was an error creating a DTLS client in the engine"
            r0.mo56386p(r5)     // Catch:{ all -> 0x0226 }
            java.util.concurrent.atomic.AtomicInteger r0 = r13.f36205d     // Catch:{ all -> 0x0226 }
            r5 = -7
            r0.set(r5)     // Catch:{ all -> 0x0226 }
            javax.net.ssl.SSLEngineResult r0 = new javax.net.ssl.SSLEngineResult     // Catch:{ all -> 0x0226 }
            javax.net.ssl.SSLEngineResult$Status r5 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch:{ all -> 0x0226 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r6 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ all -> 0x0226 }
            r0.<init>(r5, r6, r4, r4)     // Catch:{ all -> 0x0226 }
            java.util.concurrent.locks.ReentrantLock r5 = r13.f36206e     // Catch:{ InterruptedException -> 0x0255 }
            r5.unlock()     // Catch:{ InterruptedException -> 0x0255 }
            goto L_0x0278
        L_0x00b8:
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0226 }
        L_0x00ba:
            java.util.concurrent.locks.ReentrantLock r8 = r13.f36206e     // Catch:{ InterruptedException -> 0x0255 }
            r8.unlock()     // Catch:{ InterruptedException -> 0x0255 }
            java.util.concurrent.atomic.AtomicInteger r8 = r13.f36205d     // Catch:{ SSLException -> 0x0320 }
            int r8 = r8.get()     // Catch:{ SSLException -> 0x0320 }
            if (r8 != r7) goto L_0x00e5
            com.google.common.f.e r0 = com.google.android.libraries.assistant.accessory.gmutls.GmuTlsEngine.f36202a     // Catch:{ SSLException -> 0x0320 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ SSLException -> 0x0320 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ SSLException -> 0x0320 }
            r0.mo56378ag(r2, r12)     // Catch:{ SSLException -> 0x0320 }
            java.lang.String r2 = "The engine is already set up for crypto, doing nothing."
            r5 = 42468(0xa5e4, float:5.951E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r5)).mo56386p(r2)     // Catch:{ SSLException -> 0x0320 }
            javax.net.ssl.SSLEngineResult r0 = new javax.net.ssl.SSLEngineResult     // Catch:{ SSLException -> 0x0320 }
            javax.net.ssl.SSLEngineResult$Status r2 = javax.net.ssl.SSLEngineResult.Status.OK     // Catch:{ SSLException -> 0x0320 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch:{ SSLException -> 0x0320 }
            r0.<init>(r2, r5, r4, r4)     // Catch:{ SSLException -> 0x0320 }
            goto L_0x0278
        L_0x00e5:
            java.util.concurrent.atomic.AtomicInteger r8 = r13.f36205d     // Catch:{ SSLException -> 0x0320 }
            int r8 = r8.get()     // Catch:{ SSLException -> 0x0320 }
            java.lang.String r11 = "Engine is in error state: %d"
            if (r8 < 0) goto L_0x01ef
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ SSLException -> 0x0320 }
            javax.net.ssl.SSLEngineResult r8 = new javax.net.ssl.SSLEngineResult     // Catch:{ SSLException -> 0x0320 }
            javax.net.ssl.SSLEngineResult$Status r9 = javax.net.ssl.SSLEngineResult.Status.OK     // Catch:{ SSLException -> 0x0320 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r14 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ SSLException -> 0x0320 }
            r8.<init>(r9, r14, r4, r4)     // Catch:{ SSLException -> 0x0320 }
            java.util.concurrent.locks.ReentrantLock r9 = r13.f36206e     // Catch:{ InterruptedException -> 0x01d2 }
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x01d2 }
            boolean r5 = r9.tryLock(r5, r14)     // Catch:{ InterruptedException -> 0x01d2 }
            if (r5 == 0) goto L_0x012d
            long r5 = r13.f36203b     // Catch:{ all -> 0x0124 }
            r14 = 0
            r9 = r13
            r16 = r11
            r10 = r5
            r5 = r12
            r12 = r14
            r6 = r13
            r13 = r0
            r14 = r15
            int[] r0 = r9.handshakeExchange(r10, r12, r13, r14)     // Catch:{ all -> 0x0122 }
            javax.net.ssl.SSLEngineResult r8 = com.google.android.libraries.assistant.accessory.gmutls.C11027j.m26118a(r0)     // Catch:{ all -> 0x0122 }
            java.util.concurrent.locks.ReentrantLock r0 = r6.f36206e     // Catch:{ InterruptedException -> 0x011f }
            r0.unlock()     // Catch:{ InterruptedException -> 0x011f }
        L_0x011d:
            r0 = r8
            goto L_0x014b
        L_0x011f:
            r0 = move-exception
            goto L_0x01d4
        L_0x0122:
            r0 = move-exception
            goto L_0x0127
        L_0x0124:
            r0 = move-exception
            r5 = r12
            r6 = r13
        L_0x0127:
            java.util.concurrent.locks.ReentrantLock r6 = r6.f36206e     // Catch:{ InterruptedException -> 0x011f }
            r6.unlock()     // Catch:{ InterruptedException -> 0x011f }
            throw r0     // Catch:{ InterruptedException -> 0x011f }
        L_0x012d:
            r16 = r11
            r5 = r12
            r6 = r13
            com.google.common.f.e r0 = com.google.android.libraries.assistant.accessory.gmutls.GmuTlsEngine.f36202a     // Catch:{ InterruptedException -> 0x011f }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ InterruptedException -> 0x011f }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ InterruptedException -> 0x011f }
            r0.mo56378ag(r9, r5)     // Catch:{ InterruptedException -> 0x011f }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ InterruptedException -> 0x011f }
            r9 = 42463(0xa5df, float:5.9503E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r9)     // Catch:{ InterruptedException -> 0x011f }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ InterruptedException -> 0x011f }
            r0.mo56386p(r10)     // Catch:{ InterruptedException -> 0x011f }
            goto L_0x011d
        L_0x014b:
            javax.net.ssl.SSLEngineResult$Status r2 = r0.getStatus()     // Catch:{ SSLException -> 0x0320 }
            javax.net.ssl.SSLEngineResult$Status r8 = javax.net.ssl.SSLEngineResult.Status.OK     // Catch:{ SSLException -> 0x0320 }
            boolean r2 = r2.equals(r8)     // Catch:{ SSLException -> 0x0320 }
            if (r2 == 0) goto L_0x017c
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = r0.getHandshakeStatus()     // Catch:{ SSLException -> 0x0320 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r8 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch:{ SSLException -> 0x0320 }
            boolean r2 = r2.equals(r8)     // Catch:{ SSLException -> 0x0320 }
            if (r2 != 0) goto L_0x017c
            java.util.concurrent.atomic.AtomicInteger r2 = r6.f36205d     // Catch:{ SSLException -> 0x0320 }
            int r2 = r2.get()     // Catch:{ SSLException -> 0x0320 }
            r5 = 1
            if (r2 == r5) goto L_0x0178
            r8 = 2
            if (r2 == r8) goto L_0x0171
            goto L_0x0278
        L_0x0171:
            java.util.concurrent.atomic.AtomicInteger r2 = r6.f36205d     // Catch:{ SSLException -> 0x0320 }
        L_0x0173:
            r2.getAndSet(r5)     // Catch:{ SSLException -> 0x0320 }
            goto L_0x0278
        L_0x0178:
            java.util.concurrent.atomic.AtomicInteger r2 = r6.f36205d     // Catch:{ SSLException -> 0x0320 }
            r5 = 2
            goto L_0x0173
        L_0x017c:
            javax.net.ssl.SSLEngineResult$Status r2 = r0.getStatus()     // Catch:{ SSLException -> 0x0320 }
            javax.net.ssl.SSLEngineResult$Status r8 = javax.net.ssl.SSLEngineResult.Status.OK     // Catch:{ SSLException -> 0x0320 }
            boolean r2 = r2.equals(r8)     // Catch:{ SSLException -> 0x0320 }
            if (r2 == 0) goto L_0x01ae
            javax.net.ssl.SSLEngineResult$HandshakeStatus r2 = r0.getHandshakeStatus()     // Catch:{ SSLException -> 0x0320 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r8 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch:{ SSLException -> 0x0320 }
            boolean r2 = r2.equals(r8)     // Catch:{ SSLException -> 0x0320 }
            if (r2 == 0) goto L_0x01ae
            com.google.common.f.e r2 = com.google.android.libraries.assistant.accessory.gmutls.GmuTlsEngine.f36202a     // Catch:{ SSLException -> 0x0320 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ SSLException -> 0x0320 }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ SSLException -> 0x0320 }
            r2.mo56378ag(r8, r5)     // Catch:{ SSLException -> 0x0320 }
            java.lang.String r5 = "GmuTLS handshake finished, ready for crypto!"
            r8 = 42464(0xa5e0, float:5.9505E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r8)).mo56386p(r5)     // Catch:{ SSLException -> 0x0320 }
            java.util.concurrent.atomic.AtomicInteger r2 = r6.f36205d     // Catch:{ SSLException -> 0x0320 }
            r2.getAndSet(r7)     // Catch:{ SSLException -> 0x0320 }
            goto L_0x0278
        L_0x01ae:
            java.util.concurrent.atomic.AtomicInteger r0 = r6.f36205d     // Catch:{ SSLException -> 0x0320 }
            r2 = -15
            r0.getAndSet(r2)     // Catch:{ SSLException -> 0x0320 }
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException     // Catch:{ SSLException -> 0x0320 }
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ SSLException -> 0x0320 }
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ SSLException -> 0x0320 }
            java.util.concurrent.atomic.AtomicInteger r6 = r6.f36205d     // Catch:{ SSLException -> 0x0320 }
            int r6 = r6.get()     // Catch:{ SSLException -> 0x0320 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SSLException -> 0x0320 }
            r5[r4] = r6     // Catch:{ SSLException -> 0x0320 }
            r7 = r16
            java.lang.String r2 = java.lang.String.format(r2, r7, r5)     // Catch:{ SSLException -> 0x0320 }
            r0.<init>(r2)     // Catch:{ SSLException -> 0x0320 }
            throw r0     // Catch:{ SSLException -> 0x0320 }
        L_0x01d2:
            r0 = move-exception
            r5 = r12
        L_0x01d4:
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ SSLException -> 0x0320 }
            r6.interrupt()     // Catch:{ SSLException -> 0x0320 }
            com.google.common.f.e r6 = com.google.android.libraries.assistant.accessory.gmutls.GmuTlsEngine.f36202a     // Catch:{ SSLException -> 0x0320 }
            com.google.common.f.x r6 = r6.mo56225c()     // Catch:{ SSLException -> 0x0320 }
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ SSLException -> 0x0320 }
            r6.mo56378ag(r9, r5)     // Catch:{ SSLException -> 0x0320 }
            r5 = 42466(0xa5e2, float:5.9508E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r0)).mo56372aa(r5)).mo56386p(r2)     // Catch:{ SSLException -> 0x0320 }
            r0 = r8
            goto L_0x0278
        L_0x01ef:
            r7 = r11
            r5 = r12
            r6 = r13
            com.google.common.f.e r0 = com.google.android.libraries.assistant.accessory.gmutls.GmuTlsEngine.f36202a     // Catch:{ SSLException -> 0x0320 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ SSLException -> 0x0320 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ SSLException -> 0x0320 }
            r0.mo56378ag(r2, r5)     // Catch:{ SSLException -> 0x0320 }
            java.lang.String r2 = "The engine is in an error state: %d, resolve error state to continue"
            java.util.concurrent.atomic.AtomicInteger r5 = r6.f36205d     // Catch:{ SSLException -> 0x0320 }
            int r5 = r5.get()     // Catch:{ SSLException -> 0x0320 }
            r8 = 42467(0xa5e3, float:5.9509E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r8)).mo56387q(r2, r5)     // Catch:{ SSLException -> 0x0320 }
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException     // Catch:{ SSLException -> 0x0320 }
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ SSLException -> 0x0320 }
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ SSLException -> 0x0320 }
            java.util.concurrent.atomic.AtomicInteger r6 = r6.f36205d     // Catch:{ SSLException -> 0x0320 }
            int r6 = r6.get()     // Catch:{ SSLException -> 0x0320 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ SSLException -> 0x0320 }
            r5[r4] = r6     // Catch:{ SSLException -> 0x0320 }
            java.lang.String r2 = java.lang.String.format(r2, r7, r5)     // Catch:{ SSLException -> 0x0320 }
            r0.<init>(r2)     // Catch:{ SSLException -> 0x0320 }
            throw r0     // Catch:{ SSLException -> 0x0320 }
        L_0x0226:
            r0 = move-exception
            r5 = r12
            r6 = r13
            java.util.concurrent.locks.ReentrantLock r6 = r6.f36206e     // Catch:{ InterruptedException -> 0x0253 }
            r6.unlock()     // Catch:{ InterruptedException -> 0x0253 }
            throw r0     // Catch:{ InterruptedException -> 0x0253 }
        L_0x022f:
            r5 = r12
            com.google.common.f.e r0 = com.google.android.libraries.assistant.accessory.gmutls.GmuTlsEngine.f36202a     // Catch:{ InterruptedException -> 0x0253 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ InterruptedException -> 0x0253 }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ InterruptedException -> 0x0253 }
            r0.mo56378ag(r6, r5)     // Catch:{ InterruptedException -> 0x0253 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ InterruptedException -> 0x0253 }
            r6 = 42460(0xa5dc, float:5.9499E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r6)     // Catch:{ InterruptedException -> 0x0253 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ InterruptedException -> 0x0253 }
            r0.mo56386p(r10)     // Catch:{ InterruptedException -> 0x0253 }
            javax.net.ssl.SSLEngineResult r0 = new javax.net.ssl.SSLEngineResult     // Catch:{ InterruptedException -> 0x0253 }
            javax.net.ssl.SSLEngineResult$Status r6 = javax.net.ssl.SSLEngineResult.Status.CLOSED     // Catch:{ InterruptedException -> 0x0253 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r8 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ InterruptedException -> 0x0253 }
            r0.<init>(r6, r8, r4, r4)     // Catch:{ InterruptedException -> 0x0253 }
            goto L_0x0278
        L_0x0253:
            r0 = move-exception
            goto L_0x0257
        L_0x0255:
            r0 = move-exception
            r5 = r12
        L_0x0257:
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ SSLException -> 0x0320 }
            r6.interrupt()     // Catch:{ SSLException -> 0x0320 }
            com.google.common.f.e r6 = com.google.android.libraries.assistant.accessory.gmutls.GmuTlsEngine.f36202a     // Catch:{ SSLException -> 0x0320 }
            com.google.common.f.x r6 = r6.mo56225c()     // Catch:{ SSLException -> 0x0320 }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ SSLException -> 0x0320 }
            r6.mo56378ag(r8, r5)     // Catch:{ SSLException -> 0x0320 }
            r5 = 42461(0xa5dd, float:5.95E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r0)).mo56372aa(r5)).mo56386p(r2)     // Catch:{ SSLException -> 0x0320 }
            javax.net.ssl.SSLEngineResult r0 = new javax.net.ssl.SSLEngineResult     // Catch:{ SSLException -> 0x0320 }
            javax.net.ssl.SSLEngineResult$Status r2 = javax.net.ssl.SSLEngineResult.Status.OK     // Catch:{ SSLException -> 0x0320 }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r5 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ SSLException -> 0x0320 }
            r0.<init>(r2, r5, r4, r4)     // Catch:{ SSLException -> 0x0320 }
        L_0x0278:
            com.google.android.libraries.assistant.accessory.gmutls.GmuTlsEngine r2 = r1.f36214e
            int r2 = r2.mo19426a()
            com.google.android.libraries.assistant.accessory.gmutls.h r3 = r1.f36215f
            if (r3 == 0) goto L_0x0285
            r3.mo19487c()
        L_0x0285:
            if (r2 >= 0) goto L_0x0289
            r2 = 15020(0x3aac, float:2.1048E-41)
        L_0x0289:
            java.util.concurrent.atomic.AtomicBoolean r3 = r1.f36217h
            boolean r3 = r3.get()
            if (r3 != 0) goto L_0x02ba
            com.google.android.libraries.assistant.accessory.gmutls.h r3 = r1.f36216g
            if (r3 == 0) goto L_0x029b
            boolean r3 = r3.mo19488d()
            if (r3 == 0) goto L_0x02ab
        L_0x029b:
            com.google.android.libraries.assistant.accessory.gmutls.b r3 = new com.google.android.libraries.assistant.accessory.gmutls.b
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            long r5 = f36210a
            r3.<init>(r1, r4, r5)
            r3.mo19489e()
            r1.f36216g = r3
        L_0x02ab:
            com.google.android.libraries.assistant.accessory.gmutls.c r3 = new com.google.android.libraries.assistant.accessory.gmutls.c
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            long r5 = (long) r2
            r3.<init>(r1, r4, r5)
            r3.mo19489e()
            r1.f36215f = r3
        L_0x02ba:
            int r2 = r0.bytesProduced()
            r5 = r19
            r5.mo19467c(r15, r2)
            com.google.android.libraries.assistant.accessory.gmutls.GmuTlsEngine r2 = r1.f36214e
            java.util.concurrent.atomic.AtomicInteger r2 = r2.f36205d
            int r2 = r2.get()
            r3 = 1
            if (r2 == r3) goto L_0x0310
            com.google.android.libraries.assistant.accessory.gmutls.GmuTlsEngine r2 = r1.f36214e
            java.util.concurrent.atomic.AtomicInteger r2 = r2.f36205d
            int r2 = r2.get()
            r3 = 2
            if (r2 != r3) goto L_0x02da
            goto L_0x0310
        L_0x02da:
            com.google.android.libraries.assistant.accessory.gmutls.GmuTlsEngine r2 = r1.f36214e
            java.util.concurrent.atomic.AtomicInteger r2 = r2.f36205d
            int r2 = r2.get()
            if (r2 != r7) goto L_0x030b
            r2 = 11
            r1.m26099m(r2)
            r17.m26098l()
            r17.m26097k()
            java.util.concurrent.atomic.AtomicInteger r2 = r1.f36213d
            int r2 = r2.get()
            java.util.concurrent.CopyOnWriteArrayList r3 = r1.f36212c
            java.util.Iterator r3 = r3.iterator()
        L_0x02fb:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0314
            java.lang.Object r4 = r3.next()
            com.google.android.libraries.assistant.accessory.gmutls.d r4 = (com.google.android.libraries.assistant.accessory.gmutls.C11021d) r4
            r4.mo19472c(r2)
            goto L_0x02fb
        L_0x030b:
            r2 = 6
            r1.m26099m(r2)
            goto L_0x0314
        L_0x0310:
            r2 = 4
            r1.m26099m(r2)
        L_0x0314:
            return r0
        L_0x0315:
            r2 = 6
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException     // Catch:{ SSLException -> 0x031e }
            java.lang.String r5 = "You must provide ByteBuffer.allocateDirect instances"
            r0.<init>(r5)     // Catch:{ SSLException -> 0x031e }
            throw r0     // Catch:{ SSLException -> 0x031e }
        L_0x031e:
            r0 = move-exception
            goto L_0x0322
        L_0x0320:
            r0 = move-exception
            r2 = 6
        L_0x0322:
            com.google.common.f.e r5 = f36211b
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r6, r3)
            java.lang.String r3 = "There was an SSL error during handshake"
            r6 = 42417(0xa5b1, float:5.9439E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56382g(r0)).mo56372aa(r6)).mo56386p(r3)
            r1.m26099m(r2)
            javax.net.ssl.SSLEngineResult r0 = new javax.net.ssl.SSLEngineResult
            javax.net.ssl.SSLEngineResult$Status r2 = javax.net.ssl.SSLEngineResult.Status.CLOSED
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING
            r0.<init>(r2, r3, r4, r4)
            return r0
        L_0x0342:
            r5 = r19
            com.google.common.f.e r0 = f36211b
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r3)
            java.lang.String r2 = "Still handshaking, but server is ready"
            r3 = 42418(0xa5b2, float:5.944E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            javax.net.ssl.SSLEngineResult r0 = new javax.net.ssl.SSLEngineResult
            javax.net.ssl.SSLEngineResult$Status r2 = javax.net.ssl.SSLEngineResult.Status.OK
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED
            int r5 = r19.size()
            r0.<init>(r2, r3, r5, r4)
            return r0
        L_0x0365:
            com.google.common.f.e r0 = f36211b
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r3)
            java.lang.String r2 = "You must initialize the system with proper values before handshake"
            r3 = 42419(0xa5b3, float:5.9442E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            javax.net.ssl.SSLEngineResult r0 = new javax.net.ssl.SSLEngineResult
            javax.net.ssl.SSLEngineResult$Status r2 = javax.net.ssl.SSLEngineResult.Status.CLOSED
            javax.net.ssl.SSLEngineResult$HandshakeStatus r3 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING
            r0.<init>(r2, r3, r4, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.accessory.gmutls.C11022e.mo19479d(com.google.android.libraries.assistant.accessory.gmutls.a, com.google.android.libraries.assistant.accessory.gmutls.a):javax.net.ssl.SSLEngineResult");
    }

    /* renamed from: e */
    public final SSLEngineResult mo19480e(C11018a aVar, C11018a aVar2) {
        SSLEngineResult.Status j = m26096j(aVar, aVar2, true);
        SSLEngineResult sSLEngineResult = new SSLEngineResult(j, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, 0);
        if (!j.equals(SSLEngineResult.Status.OK)) {
            C59104x d = f36211b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GmuTls");
            ((C59052c) ((C59052c) d).mo56372aa(42422)).mo56386p("There was a critical encryption / decryption failure");
            if (j.equals(SSLEngineResult.Status.BUFFER_OVERFLOW)) {
                return new SSLEngineResult(j, SSLEngineResult.HandshakeStatus.FINISHED, aVar.size(), 0);
            }
            return j.equals(SSLEngineResult.Status.BUFFER_UNDERFLOW) ? new SSLEngineResult(SSLEngineResult.Status.BUFFER_OVERFLOW, SSLEngineResult.HandshakeStatus.FINISHED, aVar2.mo19465a(), 0) : sSLEngineResult;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar2.mo19465a());
        try {
            m26099m(9);
            SSLEngineResult wrap = this.f36214e.wrap(aVar.mo19466b(), allocateDirect);
            aVar2.mo19467c(allocateDirect, wrap.bytesProduced());
            if (this.f36214e.f36205d.get() != 3) {
                m26099m(8);
            } else {
                m26099m(11);
            }
            return wrap;
        } catch (SSLException e) {
            C59071e eVar = f36211b;
            C59104x c = eVar.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GmuTls");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(42420)).mo56386p("There was an SSL error during encryption");
            m26099m(11);
            SSLEngineResult sSLEngineResult2 = new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, SSLEngineResult.HandshakeStatus.FINISHED, aVar.mo19465a(), 0);
            if (this.f36214e.f36205d.get() == -16) {
                this.f36214e.f36205d.getAndSet(3);
            }
            if (!m26100n(aVar2, sSLEngineResult2)) {
                return new SSLEngineResult(SSLEngineResult.Status.BUFFER_UNDERFLOW, SSLEngineResult.HandshakeStatus.FINISHED, 0, 0);
            }
            C59104x b = eVar.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GmuTls");
            ((C59052c) ((C59052c) b).mo56372aa(42421)).mo56386p("The client was kicked off due to too many failures");
            return new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, aVar2.size());
        }
    }

    /* renamed from: f */
    public final synchronized void mo19481f() {
        Iterator it = this.f36212c.iterator();
        while (it.hasNext()) {
            ((C11021d) it.next()).mo19472c(7);
        }
    }

    /* renamed from: g */
    public final synchronized void mo19482g() {
        C11018a aVar = new C11018a(0);
        C11018a aVar2 = new C11018a(this.f36214e.f36204c);
        SSLEngineResult d = mo19479d(aVar, aVar2);
        Iterator it = this.f36212c.iterator();
        while (it.hasNext()) {
            ((C11021d) it.next()).mo19473d(d, aVar2);
        }
        this.f36217h.set(false);
    }

    /* renamed from: h */
    public final boolean mo19483h(byte[] bArr, int i) {
        if (this.f36213d.get() != 1) {
            C58976aa aaVar = C58975e.f156826a;
            return false;
        }
        GmuTlsEngine gmuTlsEngine = new GmuTlsEngine();
        this.f36214e = gmuTlsEngine;
        try {
            int b = gmuTlsEngine.mo19427b(bArr, i);
            C58976aa aaVar2 = C58975e.f156826a;
            for (String str : this.f36214e.getSupportedProtocols()) {
            }
            m26099m(2);
            this.f36219j = i;
            return b >= 0;
        } catch (SSLException e) {
            C59104x c = f36211b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GmuTls");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(42435)).mo56386p("Couldn't initialize crypto");
            return false;
        }
    }

    /* renamed from: i */
    public final void mo19484i(C11018a aVar) {
        if (this.f36213d.get() == 1) {
            C59104x c = f36211b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GmuTls");
            ((C59052c) ((C59052c) c).mo56372aa(42424)).mo56386p("You must initialize the system with proper values before handshake");
            new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, 0);
            return;
        }
        m26098l();
        m26097k();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.mo19465a());
        aVar.mo19467c(allocateDirect, this.f36214e.mo19435e(allocateDirect).bytesProduced());
        this.f36218i.set(0);
        C59104x b = f36211b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GmuTls");
        ((C59052c) ((C59052c) b).mo56372aa(42423)).mo56386p("Shutting down client connection");
        m26099m(2);
    }
}
