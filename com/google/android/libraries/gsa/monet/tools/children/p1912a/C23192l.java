package com.google.android.libraries.gsa.monet.tools.children.p1912a;

import com.google.android.libraries.gsa.monet.internal.service.C23015k;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23054e;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23088b;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.a.l */
/* compiled from: PG */
final class C23192l implements C23054e {

    /* renamed from: a */
    final /* synthetic */ C23052c f63598a;

    /* renamed from: b */
    final /* synthetic */ String f63599b;

    /* renamed from: c */
    final /* synthetic */ boolean f63600c;

    /* renamed from: d */
    final /* synthetic */ C23193m f63601d;

    public C23192l(C23193m mVar, C23052c cVar, String str, boolean z) {
        this.f63601d = mVar;
        this.f63598a = cVar;
        this.f63599b = str;
        this.f63600c = z;
    }

    /* renamed from: b */
    public final void mo28489b(C23028x xVar) {
        this.f63601d.f63604c = C23088b.m43271a(new String[0]);
        C23120p a = ((C23015k) this.f63598a).f63308c.mo28336e().mo28564a("REPEATED_CHILD_BUNDLE_".concat(this.f63599b));
        if (a != null) {
            this.f63601d.f63605d = a.mo28565b();
            a.f63472a.setClassLoader(getClass().getClassLoader());
            this.f63601d.f63604c = new C23088b(a.mo28566c());
        }
        this.f63601d.mo28654h();
        if (this.f63600c) {
            C23193m mVar = this.f63601d;
            C23067b.m43232e(mVar.f63604c != null);
            for (String fVar : mVar.f63604c) {
                C23186f fVar2 = new C23186f(fVar, mVar.f63602a, false);
                mVar.f63603b.add(fVar2);
                fVar2.mo28630k(new C23190j(mVar, fVar2));
                fVar2.mo28634o(xVar);
            }
            mVar.mo28654h();
            mVar.f63604c = null;
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo28490c() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo28491g() {
    }
}
