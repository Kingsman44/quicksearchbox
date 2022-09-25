package com.google.android.libraries.p11029ao.p11032c;

import android.system.Os;
import java.io.FileDescriptor;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.ao.c.k */
/* compiled from: PG */
public final /* synthetic */ class C147810k implements Callable {

    /* renamed from: a */
    public final /* synthetic */ FileDescriptor f398790a;

    public /* synthetic */ C147810k(FileDescriptor fileDescriptor) {
        this.f398790a = fileDescriptor;
    }

    public final Object call() {
        return Os.fstat(this.f398790a);
    }
}
