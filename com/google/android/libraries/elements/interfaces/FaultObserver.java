package com.google.android.libraries.elements.interfaces;

import p5488io.grpc.Status;

/* compiled from: PG */
public abstract class FaultObserver {
    public abstract Status storeDidFault(ByteStore byteStore, String str);
}
