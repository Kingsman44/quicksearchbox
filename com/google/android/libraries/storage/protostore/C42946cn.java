package com.google.android.libraries.storage.protostore;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.io.Closeable;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.storage.protostore.cn */
/* compiled from: PG */
public final /* synthetic */ class C42946cn implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Closeable f112341a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f112342b;

    public /* synthetic */ C42946cn(Closeable closeable, C60870cx cxVar) {
        this.f112341a = closeable;
        this.f112342b = cxVar;
    }

    public final Object call() {
        Closeable closeable = this.f112341a;
        C60870cx cxVar = this.f112342b;
        closeable.close();
        return C60856cj.m92909r(cxVar);
    }
}
