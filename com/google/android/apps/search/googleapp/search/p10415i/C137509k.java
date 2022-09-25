package com.google.android.apps.search.googleapp.search.p10415i;

import java.io.IOException;

/* renamed from: com.google.android.apps.search.googleapp.search.i.k */
/* compiled from: PG */
public final class C137509k extends IOException {

    /* renamed from: a */
    public final int f374009a;

    public C137509k(int i) {
        super("Got non-success response code: " + i);
        this.f374009a = i;
        if (i < 400) {
            throw new IllegalArgumentException("Code " + i + " is not an HTTP error code.");
        }
    }
}
