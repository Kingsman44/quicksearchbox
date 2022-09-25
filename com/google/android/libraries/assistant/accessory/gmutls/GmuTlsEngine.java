package com.google.android.libraries.assistant.accessory.gmutls;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: PG */
public class GmuTlsEngine extends SSLEngine implements Closeable {

    /* renamed from: a */
    public static final C59071e f36202a = C59071e.m91332i("com.google.android.libraries.assistant.accessory.gmutls.GmuTlsEngine");

    /* renamed from: b */
    public volatile long f36203b = -1;

    /* renamed from: c */
    public int f36204c;

    /* renamed from: d */
    public final AtomicInteger f36205d = new AtomicInteger(1);

    /* renamed from: e */
    public final ReentrantLock f36206e = new ReentrantLock();

    static {
        C11026i.m26116a();
    }

    private native boolean boringGetNeedXtraAuth(long j);

    private native int[] boringShutDownClient(long j, int i, ByteBuffer byteBuffer);

    private native int boringShutDownServer(long j);

    private native int[] boringWrap(long j, int i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    private native long createNativePeer();

    private native String[] enabledProtocols(long j);

    private native boolean encryptPreflight(long j, ByteBuffer byteBuffer);

    private native int getHandshakeRetransmitTimeout(long j, int i);

    private native int initSslEngine(long j, ByteBuffer byteBuffer, int i);

    private native void setNeedXtraAuth(long j, boolean z);

    private native String[] supportedProtocols(long j);

    private native String[] supportedSuites(long j);

    /* renamed from: a */
    public final synchronized int mo19426a() {
        if (!mo19434d()) {
            C59104x d = f36202a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
            ((C59052c) ((C59052c) d).mo56372aa(42447)).mo56386p("The server is not initialized");
            return -1;
        }
        try {
            if (this.f36206e.tryLock(1, TimeUnit.SECONDS)) {
                int handshakeRetransmitTimeout = getHandshakeRetransmitTimeout(this.f36203b, 0);
                this.f36206e.unlock();
                return handshakeRetransmitTimeout;
            }
            C59104x c = f36202a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
            ((C59052c) ((C59052c) c).mo56372aa(42445)).mo56386p("Timeout waiting to obtain get retransmission timeout lock");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C59104x c2 = f36202a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(42446)).mo56386p("Thread interrupted getting retransmission timeout");
        } catch (Throwable th) {
            this.f36206e.unlock();
            throw th;
        }
        return -1;
    }

    /* renamed from: b */
    public final synchronized int mo19427b(byte[] bArr, int i) {
        int length = bArr.length;
        if (length != 0) {
            this.f36204c = i;
            if (this.f36203b == -1) {
                mo19430c();
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length);
                allocateDirect.put(bArr);
                try {
                    if (this.f36206e.tryLock(1, TimeUnit.SECONDS)) {
                        int initSslEngine = initSslEngine(this.f36203b, allocateDirect, i);
                        this.f36206e.unlock();
                        return initSslEngine;
                    }
                    C59104x c = f36202a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
                    ((C59052c) ((C59052c) c).mo56372aa(42451)).mo56386p("Timeout waiting to obtain init peer lock");
                    return -6;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    C59104x c2 = f36202a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
                    ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(42452)).mo56386p("Thread interrupted while initializing");
                    return -6;
                } catch (Throwable th) {
                    this.f36206e.unlock();
                    throw th;
                }
            } else {
                C59104x b = f36202a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
                ((C59052c) ((C59052c) b).mo56372aa(42450)).mo56386p("Already initialized");
                return 0;
            }
        } else {
            throw new SSLException("You are using a null or empty PSK");
        }
    }

    public final void beginHandshake() {
        throw new SSLException("Please use doHandshakeExchange instead");
    }

    public native int[] boringUnwrap(long j, int i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    /* renamed from: c */
    public final synchronized void mo19430c() {
        if (this.f36203b == -1) {
            try {
                if (this.f36206e.tryLock(1, TimeUnit.SECONDS)) {
                    this.f36203b = createNativePeer();
                    this.f36206e.unlock();
                    return;
                }
                C59104x c = f36202a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
                ((C59052c) ((C59052c) c).mo56372aa(42488)).mo56386p("Timeout waiting to obtain create peer lock");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                C59104x c2 = f36202a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(42489)).mo56386p("Couldn't create native peer thread interrupted");
            } catch (Throwable th) {
                this.f36206e.unlock();
                throw th;
            }
        }
    }

    public final void closeInbound() {
        C58976aa aaVar = C58975e.f156826a;
        closeOutbound();
    }

    public final void closeOutbound() {
        C58976aa aaVar = C58975e.f156826a;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f36204c);
        SSLEngineResult sSLEngineResult = new SSLEngineResult(SSLEngineResult.Status.OK, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, 0);
        try {
            if (this.f36206e.tryLock(1, TimeUnit.SECONDS)) {
                sSLEngineResult = C11027j.m26118a(boringShutDownClient(this.f36203b, 0, allocateDirect));
                this.f36206e.unlock();
                if (sSLEngineResult.getStatus().equals(SSLEngineResult.Status.CLOSED)) {
                    allocateDirect.limit();
                    this.f36205d.getAndSet(1);
                    return;
                }
                C59104x d = f36202a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
                ((C59052c) ((C59052c) d).mo56372aa(42486)).mo56386p("Couldn't shut down the client cleanly");
                return;
            }
            C59104x c = f36202a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
            ((C59052c) ((C59052c) c).mo56372aa(42484)).mo56386p("Timeout waiting to obtain close outbound lock");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C59104x c2 = f36202a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(42485)).mo56386p("Thread interrupted trying to close outbound");
        } catch (Throwable th) {
            this.f36206e.unlock();
            throw th;
        }
    }

    /* renamed from: d */
    public final synchronized boolean mo19434d() {
        return this.f36203b != -1;
    }

    /* renamed from: e */
    public final synchronized SSLEngineResult mo19435e(ByteBuffer byteBuffer) {
        SSLEngineResult sSLEngineResult;
        sSLEngineResult = new SSLEngineResult(SSLEngineResult.Status.OK, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, 0);
        try {
            if (this.f36206e.tryLock(1, TimeUnit.SECONDS)) {
                sSLEngineResult = C11027j.m26118a(boringShutDownClient(this.f36203b, 0, byteBuffer));
                this.f36206e.unlock();
            } else {
                C59104x c = f36202a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
                ((C59052c) ((C59052c) c).mo56372aa(42472)).mo56386p("Timeout waiting for lock shutting down client auth");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C59104x c2 = f36202a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(42474)).mo56386p("Thread interrupted while shutting down client");
        } catch (Throwable th) {
            this.f36206e.unlock();
            throw th;
        }
        if (sSLEngineResult.getStatus().equals(SSLEngineResult.Status.CLOSED)) {
            C58976aa aaVar = C58975e.f156826a;
            this.f36205d.getAndSet(1);
        }
        return sSLEngineResult;
    }

    /* renamed from: f */
    public final synchronized void mo19436f() {
        if (!mo19434d()) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        try {
            if (this.f36206e.tryLock(1, TimeUnit.SECONDS)) {
                int clientCount = getClientCount(this.f36203b);
                this.f36206e.unlock();
                if (clientCount == 0) {
                    C59104x b = f36202a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
                    ((C59052c) ((C59052c) b).mo56372aa(42458)).mo56386p("Clients already released, no need to clean up");
                    this.f36203b = -1;
                } else if (!mo19435e(ByteBuffer.allocateDirect(this.f36204c)).getStatus().equals(SSLEngineResult.Status.CLOSED)) {
                    C59104x d = f36202a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
                    ((C59052c) ((C59052c) d).mo56372aa(42457)).mo56386p("Shutdown failed, server not properly released");
                } else {
                    try {
                        if (this.f36206e.tryLock(1, TimeUnit.SECONDS)) {
                            boringShutDownServer(this.f36203b);
                            this.f36206e.unlock();
                            this.f36203b = -1;
                            return;
                        }
                        C59104x c = f36202a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
                        ((C59052c) ((C59052c) c).mo56372aa(42455)).mo56386p("Timeout waiting to obtain shutdown lock");
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        C59104x c2 = f36202a.mo56225c();
                        c2.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
                        ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(42456)).mo56386p("Thread interrupted waiting for shutdown");
                    } catch (Throwable th) {
                        this.f36206e.unlock();
                        throw th;
                    }
                }
            } else {
                C59104x c3 = f36202a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
                ((C59052c) ((C59052c) c3).mo56372aa(42453)).mo56386p("Timeout waiting to obtain shutdown lock");
            }
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            C59104x c4 = f36202a.mo56225c();
            c4.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
            ((C59052c) ((C59052c) ((C59052c) c4).mo56382g(e2)).mo56372aa(42454)).mo56386p("Thread interrupted waiting for shutdown");
        } catch (Throwable th2) {
            this.f36206e.unlock();
            throw th2;
        }
    }

    public native int getClientCount(long j);

    public final Runnable getDelegatedTask() {
        return null;
    }

    public final boolean getEnableSessionCreation() {
        return true;
    }

    public final String[] getEnabledCipherSuites() {
        return getSupportedCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        try {
            if (this.f36206e.tryLock(1, TimeUnit.SECONDS)) {
                String[] enabledProtocols = enabledProtocols(this.f36203b);
                this.f36206e.unlock();
                return enabledProtocols;
            }
            C59104x c = f36202a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
            ((C59052c) ((C59052c) c).mo56372aa(42501)).mo56386p("Timeout waiting to obtain get enabled protocols lock");
            return new String[0];
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C59104x c2 = f36202a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(42502)).mo56386p("Thread interrupted getting enabled protocols");
        } catch (Throwable th) {
            this.f36206e.unlock();
            throw th;
        }
    }

    public final SSLEngineResult.HandshakeStatus getHandshakeStatus() {
        throw new UnsupportedOperationException("This engine does not support this operation");
    }

    public native int getLibraryVersion(long j);

    public native int getMaxEncryptedRecordDataSize(long j, int i);

    public final boolean getNeedClientAuth() {
        try {
            if (this.f36206e.tryLock(1, TimeUnit.SECONDS)) {
                boolean boringGetNeedXtraAuth = boringGetNeedXtraAuth(this.f36203b);
                this.f36206e.unlock();
                return boringGetNeedXtraAuth;
            }
            C59104x c = f36202a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
            ((C59052c) ((C59052c) c).mo56372aa(42497)).mo56386p("Timeout getting need client auth");
            return false;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C59104x c2 = f36202a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(42498)).mo56386p("Thread interrupted getting extra client auth required");
            return false;
        } catch (Throwable th) {
            this.f36206e.unlock();
            throw th;
        }
    }

    public final SSLSession getSession() {
        throw new UnsupportedOperationException("Session instance un-accessible in this engine");
    }

    public final String[] getSupportedCipherSuites() {
        try {
            if (this.f36206e.tryLock(1, TimeUnit.SECONDS)) {
                String[] supportedSuites = supportedSuites(this.f36203b);
                this.f36206e.unlock();
                return supportedSuites;
            }
            C59104x c = f36202a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
            ((C59052c) ((C59052c) c).mo56372aa(42503)).mo56386p("Timeout waiting to obtain get supported suites lock");
            return new String[0];
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C59104x c2 = f36202a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(42504)).mo56386p("Thread interrupted getting supported suites");
        } catch (Throwable th) {
            this.f36206e.unlock();
            throw th;
        }
    }

    public final String[] getSupportedProtocols() {
        try {
            if (this.f36206e.tryLock(1, TimeUnit.SECONDS)) {
                String[] supportedProtocols = supportedProtocols(this.f36203b);
                this.f36206e.unlock();
                return supportedProtocols;
            }
            C59104x c = f36202a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
            ((C59052c) ((C59052c) c).mo56372aa(42505)).mo56386p("Timeout waiting to obtain get supported protocols lock");
            return new String[0];
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C59104x c2 = f36202a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(42506)).mo56386p("Thread interrupted getting supported protocols");
        } catch (Throwable th) {
            this.f36206e.unlock();
            throw th;
        }
    }

    public final boolean getUseClientMode() {
        return false;
    }

    public final boolean getWantClientAuth() {
        return false;
    }

    public native int[] handshakeExchange(long j, int i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public native int initNewClient(long j, int i);

    public final boolean isInboundDone() {
        try {
            if (this.f36206e.tryLock(1, TimeUnit.SECONDS)) {
                boolean z = getClientCount(this.f36203b) == 0;
                this.f36206e.unlock();
                return z;
            }
            C59104x c = f36202a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
            ((C59052c) ((C59052c) c).mo56372aa(42499)).mo56386p("Timeout waiting to obtain inbound done lock");
            return false;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C59104x c2 = f36202a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(42500)).mo56386p("Thread interrupted checking inbound status");
        } catch (Throwable th) {
            this.f36206e.unlock();
            throw th;
        }
    }

    public final boolean isOutboundDone() {
        return isInboundDone();
    }

    public final void setEnableSessionCreation(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void setEnabledProtocols(String[] strArr) {
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void setNeedClientAuth(boolean z) {
        try {
            if (this.f36206e.tryLock(1, TimeUnit.SECONDS)) {
                setNeedXtraAuth(this.f36203b, z);
                this.f36206e.unlock();
                return;
            }
            C59104x c = f36202a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
            ((C59052c) ((C59052c) c).mo56372aa(42494)).mo56386p("Timeout setting need client auth");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C59104x c2 = f36202a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(42495)).mo56386p("Thread interrupted setting extra client auth required");
        } catch (Throwable th) {
            this.f36206e.unlock();
            throw th;
        }
    }

    public final void setUseClientMode(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("This engine does not support being an SSL client");
        }
    }

    public final void setWantClientAuth(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
    }

    public final SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (this.f36205d.get() != 3) {
            C59104x d = f36202a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
            ((C59052c) ((C59052c) d).mo56372aa(42478)).mo56386p("The engine is not ready for crypto");
            throw new SSLException(String.format(Locale.ENGLISH, "The engine is not ready for crypto, in state %d", new Object[]{Integer.valueOf(this.f36205d.get())}));
        } else if (!byteBuffer.isDirect() || !byteBuffer2.isDirect()) {
            throw new SSLException("You must provide ByteBuffer.allocateDirect instances");
        } else {
            SSLEngineResult sSLEngineResult = new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, 0);
            try {
                if (this.f36206e.tryLock(1, TimeUnit.SECONDS)) {
                    SSLEngineResult a = C11027j.m26118a(boringUnwrap(this.f36203b, 0, byteBuffer, byteBuffer2));
                    this.f36206e.unlock();
                    C58976aa aaVar = C58975e.f156826a;
                    if (!a.getStatus().equals(SSLEngineResult.Status.OK) || !a.getHandshakeStatus().equals(SSLEngineResult.HandshakeStatus.FINISHED)) {
                        this.f36205d.getAndSet(-16);
                        throw new SSLException(String.format(Locale.ENGLISH, "There was an error decrypting data, in state %d", new Object[]{Integer.valueOf(this.f36205d.get())}));
                    }
                    this.f36205d.getAndSet(3);
                    return a;
                }
                C59104x c = f36202a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
                ((C59052c) ((C59052c) c).mo56372aa(42475)).mo56386p("Timeout waiting to obtain decrypt lock");
                return sSLEngineResult;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new SSLException(String.format(Locale.ENGLISH, "There was an error decrypting data, in state %d", new Object[]{Integer.valueOf(this.f36205d.get())}));
            } catch (Throwable th) {
                this.f36206e.unlock();
                throw th;
            }
        }
    }

    public final SSLEngineResult wrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (this.f36205d.get() != 3) {
            C59104x d = f36202a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
            ((C59052c) ((C59052c) d).mo56372aa(42480)).mo56386p("The engine is not ready for crypto");
            throw new SSLException(String.format(Locale.ENGLISH, "The engine is not ready for crypto, in state %d", new Object[]{Integer.valueOf(this.f36205d.get())}));
        } else if (!byteBuffer.isDirect() || !byteBuffer2.isDirect()) {
            throw new SSLException("You must provide ByteBuffer.allocateDirect instances");
        } else {
            SSLEngineResult sSLEngineResult = new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, 0);
            try {
                if (this.f36206e.tryLock(1, TimeUnit.SECONDS)) {
                    SSLEngineResult a = C11027j.m26118a(boringWrap(this.f36203b, 0, byteBuffer, byteBuffer2));
                    this.f36206e.unlock();
                    if (!a.getStatus().equals(SSLEngineResult.Status.OK) || !a.getHandshakeStatus().equals(SSLEngineResult.HandshakeStatus.FINISHED)) {
                        this.f36205d.getAndSet(-16);
                        C58976aa aaVar = C58975e.f156826a;
                        throw new SSLException(String.format(Locale.ENGLISH, "There was an error encrypting data, in state %d", new Object[]{Integer.valueOf(this.f36205d.get())}));
                    }
                    this.f36205d.getAndSet(3);
                    C58976aa aaVar2 = C58975e.f156826a;
                    return a;
                }
                C59104x c = f36202a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "GmuTlsEngine");
                ((C59052c) ((C59052c) c).mo56372aa(42479)).mo56386p("Timeout waiting to obtain encrypt lock");
                return sSLEngineResult;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new SSLException(String.format(Locale.ENGLISH, "Thread interrupted while trying to encrypt, in state %d", new Object[]{Integer.valueOf(this.f36205d.get())}), e);
            } catch (Throwable th) {
                this.f36206e.unlock();
                throw th;
            }
        }
    }

    public final void close() {
        if (this.f36203b != -1) {
            mo19436f();
            this.f36203b = -1;
            return;
        }
        throw new IOException("Native peer never initialized, can not close down");
    }

    public final SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr, int i, int i2) {
        throw new SSLException("Use SSLEngine#wrap(src, dst) instead");
    }

    public final SSLEngineResult wrap(ByteBuffer[] byteBufferArr, int i, int i2, ByteBuffer byteBuffer) {
        throw new SSLException("Use SSLEngine#wrap(src, dst) instead");
    }
}
