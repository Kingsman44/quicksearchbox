package com.google.apps.tiktok.dataservice;

import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.apps.tiktok.dataservice.u */
/* compiled from: PG */
final class C46881u extends C46679a {

    /* renamed from: b */
    private volatile transient C58528ij f122319b;

    public C46881u(C58528ij ijVar) {
        super(ijVar);
    }

    /* renamed from: b */
    public final C58528ij mo50742b() {
        if (this.f122319b == null) {
            synchronized (this) {
                if (this.f122319b == null) {
                    C58528ij ijVar = this.f121954a;
                    C58526ih ihVar = new C58526ih();
                    for (Object next : ijVar) {
                        if (next instanceof C46691ai) {
                            ihVar.mo55489i(((C46691ai) next).mo50742b());
                        } else {
                            ihVar.mo55373c(next);
                        }
                    }
                    ihVar.mo55373c(this);
                    this.f122319b = ihVar.mo55486f();
                    if (this.f122319b == null) {
                        throw new NullPointerException("getNotificationKeys() cannot return null");
                    }
                }
            }
        }
        return this.f122319b;
    }
}
