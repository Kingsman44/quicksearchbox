package com.google.android.libraries.componentview.p1699f;

import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.C20614e;

/* renamed from: com.google.android.libraries.componentview.f.g */
/* compiled from: PG */
public abstract class C20519g implements Runnable {

    /* renamed from: a */
    private final C20601ca f57644a;

    /* renamed from: b */
    private final C19742a f57645b;

    public C20519g(C20601ca caVar, C19742a aVar) {
        this.f57644a = caVar;
        this.f57645b = aVar;
    }

    /* renamed from: a */
    public abstract void mo25126a();

    public final void run() {
        try {
            mo25126a();
        } catch (Exception e) {
            C20601ca caVar = this.f57644a;
            C20614e eVar = new C20614e();
            eVar.mo25535e(this.f57645b);
            eVar.f57821a = e;
            caVar.mo25487b(eVar.mo25531a());
        }
    }
}
