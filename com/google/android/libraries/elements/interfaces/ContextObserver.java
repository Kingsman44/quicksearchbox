package com.google.android.libraries.elements.interfaces;

import com.google.protos.youtube.elements.TransactionContextOuterClass$TransactionContext;
import p5488io.grpc.Status;

/* compiled from: PG */
public abstract class ContextObserver {
    public abstract Status storeDidUpdate(ByteStore byteStore, TransactionRecord transactionRecord, TransactionContextOuterClass$TransactionContext transactionContextOuterClass$TransactionContext);
}
