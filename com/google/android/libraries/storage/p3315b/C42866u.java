package com.google.android.libraries.storage.p3315b;

import com.google.common.base.C58838bb;
import java.io.Closeable;

/* renamed from: com.google.android.libraries.storage.b.u */
/* compiled from: PG */
public final /* synthetic */ class C42866u implements Closeable {

    /* renamed from: a */
    public final /* synthetic */ C42823ai f112169a;

    public /* synthetic */ C42866u(C42823ai aiVar) {
        this.f112169a = aiVar;
    }

    public final void close() {
        C42823ai aiVar = this.f112169a;
        synchronized (aiVar.f112094k) {
            int i = aiVar.f112097n;
            C58838bb.m90885t(i > 0, "Refcount went negative!", i);
            aiVar.f112097n--;
            aiVar.mo45900d();
        }
    }
}
