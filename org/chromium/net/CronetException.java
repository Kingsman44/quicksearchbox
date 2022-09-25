package org.chromium.net;

import java.io.IOException;

/* compiled from: PG */
public abstract class CronetException extends IOException {
    protected CronetException(String str, Throwable th) {
        super(str, th);
    }
}
