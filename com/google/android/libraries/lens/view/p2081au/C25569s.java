package com.google.android.libraries.lens.view.p2081au;

import com.google.common.base.C58838bb;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.au.s */
/* compiled from: PG */
public class C25569s {

    /* renamed from: a */
    public Object f69591a;

    /* renamed from: b */
    public int f69592b = 1;

    /* renamed from: c */
    private final Runnable f69593c;

    /* renamed from: d */
    private C25568r f69594d;

    protected C25569s(Object obj, Runnable runnable) {
        this.f69593c = runnable;
        obj.getClass();
        this.f69591a = obj;
    }

    /* renamed from: c */
    public final C25569s mo30655c(Executor executor, Runnable runnable) {
        boolean z = false;
        C58838bb.m90884s(this.f69594d == null, "state is already observed");
        if (this.f69592b == 1) {
            z = true;
        }
        C58838bb.m90884s(z, "cannot create async observer after value has changed");
        C25567q qVar = new C25567q(this.f69591a, executor, runnable);
        this.f69594d = qVar;
        return qVar;
    }

    /* renamed from: d */
    public final Object mo30656d() {
        this.f69593c.run();
        return this.f69591a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo30603e(Object obj) {
        this.f69593c.run();
        obj.getClass();
        this.f69591a = obj;
        this.f69592b++;
        C25568r rVar = this.f69594d;
        if (rVar != null) {
            rVar.mo30484a(obj);
        }
    }

    /* renamed from: f */
    public final void mo30657f(C25568r rVar) {
        this.f69593c.run();
        boolean z = true;
        if (!(rVar == null || this.f69594d == null)) {
            z = false;
        }
        C58838bb.m90884s(z, "observer already registered!");
        this.f69594d = rVar;
    }
}
