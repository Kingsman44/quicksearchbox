package com.google.android.libraries.elements.interfaces;

import p5488io.grpc.Status;

/* compiled from: PG */
public abstract class Observer {
    public abstract Status storeDidUpdate(ByteStore byteStore, TransactionRecord transactionRecord);
}
