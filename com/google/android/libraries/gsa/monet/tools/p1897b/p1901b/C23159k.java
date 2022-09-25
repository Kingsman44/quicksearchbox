package com.google.android.libraries.gsa.monet.tools.p1897b.p1901b;

import com.google.android.libraries.gsa.monet.service.C23051b;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;

/* renamed from: com.google.android.libraries.gsa.monet.tools.b.b.k */
/* compiled from: PG */
final class C23159k implements C23149a {

    /* renamed from: a */
    public C23051b f63515a;

    /* renamed from: b */
    public Runnable f63516b;

    /* renamed from: c */
    final /* synthetic */ C23160l f63517c;

    public C23159k(C23160l lVar) {
        this.f63517c = lVar;
    }

    /* renamed from: e */
    private final void m43340e(Runnable runnable) {
        mo28599b();
        C23067b.m43233f(this.f63516b == null, "Cannot start or finish pages while the page is being destroyed.");
        if (!this.f63517c.f63522e) {
            runnable.run();
        } else {
            this.f63516b = runnable;
        }
    }

    /* renamed from: a */
    public final void mo28592a(C23051b bVar) {
        mo28599b();
        C23067b.m43233f(this.f63515a == null, "Back press handler already set.");
        this.f63515a = bVar;
    }

    /* renamed from: b */
    public final void mo28599b() {
        C23067b.m43233f(this.f63517c.f63520c == this, "Cannot call ControllerPageApi methods when the page is not at the top of the stack.");
    }

    /* renamed from: c */
    public final void mo28600c() {
        m43340e(new C23158j(this));
    }

    /* renamed from: d */
    public final void mo28601d(C23129y yVar, ProtoParcelable protoParcelable) {
        m43340e(new C23157i(this, yVar, protoParcelable));
    }
}
