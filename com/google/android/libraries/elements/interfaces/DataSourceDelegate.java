package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.Status;

/* compiled from: PG */
public abstract class DataSourceDelegate {

    /* compiled from: PG */
    final class CppProxy extends DataSourceDelegate {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        public static native StatusOr getDelegate(byte[] bArr, DataSourceListener dataSourceListener, ByteStore byteStore, String str);

        private native void nativeDestroy(long j);

        private native void native_dispose(long j);

        private native StatusOr native_elementAtIndex(long j, int i);

        private native ArrayList native_identifiers(long j);

        private native Status native_loadMore(long j);

        private native Status native_moveItem(long j, int i, int i2);

        private native Status native_reload(long j);

        private native Status native_removeItem(long j, int i);

        private native int native_size(long j);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public void dispose() {
            native_dispose(this.nativeRef);
        }

        public StatusOr elementAtIndex(int i) {
            return native_elementAtIndex(this.nativeRef, i);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public ArrayList identifiers() {
            return native_identifiers(this.nativeRef);
        }

        public Status loadMore() {
            return native_loadMore(this.nativeRef);
        }

        public Status moveItem(int i, int i2) {
            return native_moveItem(this.nativeRef, i, i2);
        }

        public Status reload() {
            return native_reload(this.nativeRef);
        }

        public Status removeItem(int i) {
            return native_removeItem(this.nativeRef, i);
        }

        public int size() {
            return native_size(this.nativeRef);
        }
    }

    public static StatusOr getDelegate(byte[] bArr, DataSourceListener dataSourceListener, ByteStore byteStore, String str) {
        return CppProxy.getDelegate(bArr, dataSourceListener, byteStore, str);
    }

    public abstract void dispose();

    public abstract StatusOr elementAtIndex(int i);

    public abstract ArrayList identifiers();

    public abstract Status loadMore();

    public abstract Status moveItem(int i, int i2);

    public abstract Status reload();

    public abstract Status removeItem(int i);

    public abstract int size();
}
