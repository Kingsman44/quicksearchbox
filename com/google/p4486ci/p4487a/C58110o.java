package com.google.p4486ci.p4487a;

import java.util.concurrent.Callable;

/* renamed from: com.google.ci.a.o */
/* compiled from: PG */
public final /* synthetic */ class C58110o implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C58112q f155339a;

    public /* synthetic */ C58110o(C58112q qVar) {
        this.f155339a = qVar;
    }

    public final Object call() {
        C58117v vVar;
        C58112q qVar = this.f155339a;
        try {
            vVar = new C58117v(qVar.f155341a == null ? qVar.mo54669d() : qVar.mo54668b(true));
        } catch (C58116u e) {
            vVar = new C58117v(e);
        } catch (Throwable th) {
            vVar = new C58117v(new C58116u(C58115t.UNKNOWN, (String) null, th));
        }
        synchronized (qVar) {
            C58118w wVar = qVar.f155342b;
            if (wVar != null) {
                if (vVar.mo54670a()) {
                    wVar.mo23081b(vVar.f155366b);
                } else {
                    wVar.mo23080a(qVar, vVar.f155365a);
                }
            }
        }
        return vVar;
    }
}
