package com.google.frameworks.client.data.android.p4641h;

import com.google.common.base.C58838bb;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.grpc.C70160ax;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.C70898m;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.h.aj */
/* compiled from: PG */
public final class C61477aj extends C70160ax {

    /* renamed from: a */
    private final AtomicReference f166224a = new AtomicReference(new C61476ai(1, (Status) null));

    public C61477aj(C70898m mVar) {
        super(mVar);
    }

    /* renamed from: a */
    public final void mo27478a(C70897l lVar, C70334de deVar) {
        C61476ai aiVar;
        do {
            aiVar = (C61476ai) this.f166224a.get();
        } while (!C61475ah.m94182a(this.f166224a, aiVar, aiVar.f166223b == 1 ? new C61476ai(2, (Status) null) : aiVar));
        int i = aiVar.f166223b;
        if (i == 1) {
            this.f187014c.mo27478a(lVar, deVar);
        } else if (i == 4) {
            lVar.mo27484b(aiVar.f166222a, new C70334de());
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Already started");
            this.f187014c.mo27480d("start() called more than once", illegalStateException);
            throw illegalStateException;
        }
    }

    /* renamed from: d */
    public final void mo27480d(String str, Throwable th) {
        C61476ai aiVar;
        C61476ai aiVar2;
        Status status = Status.f186904b;
        if (str != null) {
            status = status.withDescription(str);
        }
        if (th != null) {
            status = status.mo61678e(th);
        }
        do {
            aiVar = (C61476ai) this.f166224a.get();
            int i = aiVar.f166223b;
            if (i == 4) {
                aiVar2 = aiVar;
            } else if (i == 1) {
                aiVar2 = C61476ai.m94183a(4, status);
            } else {
                aiVar2 = C61476ai.m94183a(5, status);
            }
        } while (!C61475ah.m94182a(this.f166224a, aiVar, aiVar2));
        this.f187014c.mo27480d(str, th);
    }

    /* renamed from: f */
    public final void mo27481f() {
        C61476ai aiVar;
        do {
            aiVar = (C61476ai) this.f166224a.get();
            if (aiVar.f166223b == 2) {
            } else {
                throw new IllegalStateException("Call was either not started or already half-closed.");
            }
        } while (!C61475ah.m94182a(this.f166224a, aiVar, new C61476ai(3, (Status) null)));
        this.f187014c.mo27481f();
    }

    /* renamed from: g */
    public final void mo27482g(int i) {
        int i2 = ((C61476ai) this.f166224a.get()).f166223b;
        if (i2 == 1 || i2 == 4) {
            throw new IllegalStateException("Not started");
        }
        this.f187014c.mo27482g(i);
    }

    /* renamed from: h */
    public final void mo27483h(Object obj) {
        C58838bb.m90866a(obj, "Message must be non-null");
        int i = ((C61476ai) this.f166224a.get()).f166223b;
        if (i == 2) {
            this.f187014c.mo27483h(obj);
        } else if (i != 5) {
            throw new IllegalStateException("Call was either not started or already half-closed.");
        }
    }
}
