package com.google.android.libraries.elements.interfaces;

import com.google.protos.youtube.elements.TransactionContextOuterClass$TransactionContext;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class ByteStore {

    /* compiled from: PG */
    final class CppProxy extends ByteStore {
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

        public static native ByteStore create(ByteStoreConfig byteStoreConfig);

        private native void nativeDestroy(long j);

        private native void native_clear(long j);

        private native Transaction native_createTransaction(long j);

        private native Transaction native_createTransactionWithContext(long j, TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext);

        private native void native_set(long j, String str, byte[] bArr);

        private native void native_setWithMetadata(long j, String str, byte[] bArr, byte[] bArr2);

        private native Snapshot native_snapshot(long j);

        private native Subscription native_subscribe(long j, String str, Observer observer);

        private native ArrayList native_subscribeList(long j, ArrayList arrayList, Observer observer);

        private native FaultSubscription native_subscribeToFaults(long j, FaultObserver faultObserver);

        private native Subscription native_subscribeWithContext(long j, String str, ContextObserver contextObserver);

        private native Subscription native_subscribeWithPriority(long j, String str, Observer observer, int i);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public void clear() {
            native_clear(this.nativeRef);
        }

        public Transaction createTransaction() {
            return native_createTransaction(this.nativeRef);
        }

        public Transaction createTransactionWithContext(TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext) {
            return native_createTransactionWithContext(this.nativeRef, transactionContextOuterClass$TransactionContext);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public void set(String str, byte[] bArr) {
            native_set(this.nativeRef, str, bArr);
        }

        public void setWithMetadata(String str, byte[] bArr, byte[] bArr2) {
            native_setWithMetadata(this.nativeRef, str, bArr, bArr2);
        }

        public Snapshot snapshot() {
            return native_snapshot(this.nativeRef);
        }

        public Subscription subscribe(String str, Observer observer) {
            return native_subscribe(this.nativeRef, str, observer);
        }

        public ArrayList subscribeList(ArrayList arrayList, Observer observer) {
            return native_subscribeList(this.nativeRef, arrayList, observer);
        }

        public FaultSubscription subscribeToFaults(FaultObserver faultObserver) {
            return native_subscribeToFaults(this.nativeRef, faultObserver);
        }

        public Subscription subscribeWithContext(String str, ContextObserver contextObserver) {
            return native_subscribeWithContext(this.nativeRef, str, contextObserver);
        }

        public Subscription subscribeWithPriority(String str, Observer observer, int i) {
            return native_subscribeWithPriority(this.nativeRef, str, observer, i);
        }
    }

    public static ByteStore create(ByteStoreConfig byteStoreConfig) {
        return CppProxy.create(byteStoreConfig);
    }

    public abstract void clear();

    public abstract Transaction createTransaction();

    public abstract Transaction createTransactionWithContext(TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext);

    public abstract void set(String str, byte[] bArr);

    public abstract void setWithMetadata(String str, byte[] bArr, byte[] bArr2);

    public abstract Snapshot snapshot();

    public abstract Subscription subscribe(String str, Observer observer);

    public abstract ArrayList subscribeList(ArrayList arrayList, Observer observer);

    public abstract FaultSubscription subscribeToFaults(FaultObserver faultObserver);

    public abstract Subscription subscribeWithContext(String str, ContextObserver contextObserver);

    public abstract Subscription subscribeWithPriority(String str, Observer observer, int i);
}
