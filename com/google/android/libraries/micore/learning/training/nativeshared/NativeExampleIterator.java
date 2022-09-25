package com.google.android.libraries.micore.learning.training.nativeshared;

import com.google.android.libraries.micore.learning.training.util.StatusOr;
import java.io.Closeable;

/* compiled from: PG */
public interface NativeExampleIterator extends Closeable {
    void close();

    StatusOr next();
}
