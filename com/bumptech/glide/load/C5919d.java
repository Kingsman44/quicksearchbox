package com.bumptech.glide.load;

import java.io.IOException;

/* renamed from: com.bumptech.glide.load.d */
/* compiled from: PG */
public final class C5919d extends IOException {
    private static final long serialVersionUID = 1;

    public C5919d(String str, int i, Throwable th) {
        super(str + ", status code: " + i, th);
    }
}
