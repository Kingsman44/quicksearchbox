package com.google.android.libraries.gsa.monet.tools.children.p1913b;

import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.shared.C23078ai;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.b.u */
/* compiled from: PG */
final class C23224u {

    /* renamed from: a */
    final /* synthetic */ C22945j f63663a;

    /* renamed from: b */
    final /* synthetic */ C23226w f63664b;

    public C23224u(C23226w wVar, C22945j jVar) {
        this.f63664b = wVar;
        this.f63663a = jVar;
    }

    /* renamed from: a */
    public final void mo28687a() {
        C23078ai aiVar = this.f63664b.f63666b;
        if (aiVar != null) {
            this.f63663a.mo28344p(aiVar);
            this.f63664b.f63666b = null;
        }
    }

    /* renamed from: b */
    public final void mo28688b(C23129y yVar) {
        C23067b.m43233f(yVar.mo28577c(), "Child type has to have a scope.");
        C23067b.m43236i(this.f63664b.f63666b, "A scope handle is expected when a scoped child is being added.");
        this.f63664b.f63666b.mo28525b(new C23223t(this, yVar));
    }

    /* renamed from: c */
    public final void mo28689c(C23129y yVar) {
        C23067b.m43233f(yVar.mo28577c(), "Child type has to have a scope.");
        C23067b.m43233f(this.f63664b.f63666b == null, "A scope handle is not expected when a child has started loading.");
        this.f63664b.f63666b = this.f63663a.mo28339h(yVar.f63476a);
        this.f63664b.f63666b.mo28525b(new C23222s());
    }

    /* renamed from: d */
    public final void mo28690d() {
        C23225v vVar = this.f63664b.f63667c;
        if (vVar != null) {
            vVar.mo28683b();
        }
        mo28687a();
    }
}
