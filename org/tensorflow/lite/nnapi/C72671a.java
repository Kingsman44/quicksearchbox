package org.tensorflow.lite.nnapi;

import org.tensorflow.lite.C72666c;
import org.tensorflow.lite.TensorFlowLite;

/* renamed from: org.tensorflow.lite.nnapi.a */
/* compiled from: PG */
public final class C72671a implements AutoCloseable, C72666c {
    public C72671a() {
        TensorFlowLite.m107466a();
    }

    /* renamed from: a */
    public final long mo64499a() {
        throw new IllegalStateException("Should not access delegate before interpreter has been constructed.");
    }

    public final void close() {
    }
}
