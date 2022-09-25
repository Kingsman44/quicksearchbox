package com.google.android.libraries.elements.interfaces;

import p5488io.grpc.Status;

/* compiled from: PG */
public abstract class JSCommandResolver {
    public abstract Status resolve(byte[] bArr);

    public abstract Status resolveAsync(byte[] bArr, JSPromiseResolver jSPromiseResolver);
}
