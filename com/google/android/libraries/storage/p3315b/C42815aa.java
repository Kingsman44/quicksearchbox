package com.google.android.libraries.storage.p3315b;

import com.google.common.base.C58838bb;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.storage.b.aa */
/* compiled from: PG */
final class C42815aa {

    /* renamed from: a */
    final /* synthetic */ C42823ai f112080a;

    public C42815aa(C42823ai aiVar) {
        this.f112080a = aiVar;
    }

    /* renamed from: a */
    public final void mo45897a() {
        synchronized (this.f112080a.f112094k) {
            int i = this.f112080a.f112097n;
            C58838bb.m90885t(i > 0, "Refcount went negative!", i);
            C42823ai aiVar = this.f112080a;
            aiVar.f112097n--;
            aiVar.mo45900d();
        }
    }

    /* renamed from: b */
    public final void mo45898b() {
        synchronized (this.f112080a.f112094k) {
            int i = this.f112080a.f112097n;
            if (i != 0) {
                C58838bb.m90885t(i > 0, "Refcount went negative!", i);
                this.f112080a.f112097n++;
            } else {
                throw new CancellationException("database is closed");
            }
        }
    }
}
