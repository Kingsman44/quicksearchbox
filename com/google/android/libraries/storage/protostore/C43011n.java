package com.google.android.libraries.storage.protostore;

import com.google.common.base.C58817ah;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.storage.protostore.n */
/* compiled from: PG */
public final /* synthetic */ class C43011n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ AtomicBoolean f112471a;

    public /* synthetic */ C43011n(AtomicBoolean atomicBoolean) {
        this.f112471a = atomicBoolean;
    }

    public final Object apply(Object obj) {
        TimeoutException timeoutException = (TimeoutException) obj;
        this.f112471a.set(false);
        return null;
    }
}
