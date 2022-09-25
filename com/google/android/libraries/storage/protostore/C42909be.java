package com.google.android.libraries.storage.protostore;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.io.Closeable;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.storage.protostore.be */
/* compiled from: PG */
public final /* synthetic */ class C42909be implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Closeable f112262a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f112263b;

    public /* synthetic */ C42909be(Closeable closeable, C60870cx cxVar) {
        this.f112262a = closeable;
        this.f112263b = cxVar;
    }

    public final Object call() {
        Closeable closeable = this.f112262a;
        C60870cx cxVar = this.f112263b;
        closeable.close();
        return C60856cj.m92909r(cxVar);
    }
}
