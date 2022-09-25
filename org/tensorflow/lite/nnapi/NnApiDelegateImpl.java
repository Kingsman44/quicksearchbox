package org.tensorflow.lite.nnapi;

import org.tensorflow.lite.C72666c;

/* compiled from: PG */
public class NnApiDelegateImpl implements AutoCloseable, C72666c {
    private static native long createDelegate(int i, String str, String str2, String str3, int i2, boolean z, boolean z2, boolean z3, long j);

    private static native void deleteDelegate(long j);

    private static native int getNnapiErrno(long j);

    /* renamed from: a */
    public final long mo64499a() {
        throw null;
    }

    public final void close() {
        throw null;
    }
}
