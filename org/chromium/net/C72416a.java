package org.chromium.net;

import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketImpl;

/* renamed from: org.chromium.net.a */
/* compiled from: PG */
final class C72416a extends SocketImpl {
    public C72416a(FileDescriptor fileDescriptor) {
        this.fd = fileDescriptor;
    }

    /* access modifiers changed from: protected */
    public final void accept(SocketImpl socketImpl) {
        throw new RuntimeException("accept not implemented");
    }

    /* access modifiers changed from: protected */
    public final int available() {
        throw new RuntimeException("accept not implemented");
    }

    /* access modifiers changed from: protected */
    public final void bind(InetAddress inetAddress, int i) {
        throw new RuntimeException("accept not implemented");
    }

    /* access modifiers changed from: protected */
    public final void close() {
    }

    /* access modifiers changed from: protected */
    public final void connect(String str, int i) {
        throw new RuntimeException("connect not implemented");
    }

    /* access modifiers changed from: protected */
    public final void create(boolean z) {
    }

    /* access modifiers changed from: protected */
    public final InputStream getInputStream() {
        throw new RuntimeException("getInputStream not implemented");
    }

    public final Object getOption(int i) {
        throw new RuntimeException("getOption not implemented");
    }

    /* access modifiers changed from: protected */
    public final OutputStream getOutputStream() {
        throw new RuntimeException("getOutputStream not implemented");
    }

    /* access modifiers changed from: protected */
    public final void listen(int i) {
        throw new RuntimeException("listen not implemented");
    }

    /* access modifiers changed from: protected */
    public final void sendUrgentData(int i) {
        throw new RuntimeException("sendUrgentData not implemented");
    }

    public final void setOption(int i, Object obj) {
        throw new RuntimeException("setOption not implemented");
    }

    /* access modifiers changed from: protected */
    public final void connect(InetAddress inetAddress, int i) {
        throw new RuntimeException("connect not implemented");
    }

    /* access modifiers changed from: protected */
    public final void connect(SocketAddress socketAddress, int i) {
        throw new RuntimeException("connect not implemented");
    }
}
