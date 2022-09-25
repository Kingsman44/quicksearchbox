package com.google.android.libraries.gsa.monet.tools.model.p1919a.p1920a;

import com.google.android.libraries.gsa.monet.internal.service.C23015k;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23054e;
import com.google.android.libraries.gsa.monet.shared.C23118n;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23252b;

/* renamed from: com.google.android.libraries.gsa.monet.tools.model.a.a.a */
/* compiled from: PG */
public final class C23246a implements C23054e, C23118n {

    /* renamed from: a */
    private final C23252b f63714a;

    private C23246a(C23252b bVar) {
        this.f63714a = bVar;
    }

    /* renamed from: d */
    public static void m43558d(C23052c cVar, C23252b bVar) {
        C23246a aVar = new C23246a(bVar);
        ((C23015k) cVar).f63308c.mo28343n(aVar);
        cVar.mo28427o(aVar);
    }

    /* renamed from: a */
    public final void mo28563a(C23120p pVar) {
        for (C23251a c : this.f63714a.mo28329a()) {
            c.mo28727c(pVar);
        }
    }

    /* renamed from: b */
    public final void mo28489b(C23028x xVar) {
        for (C23251a aVar : this.f63714a.mo28329a()) {
            C23120p e = aVar.f63717b.mo28336e();
            if (e.f63472a.containsKey(aVar.f63718c)) {
                aVar.mo28728d(e);
            }
        }
    }

    /* renamed from: c */
    public final void mo28490c() {
        for (C23251a aVar : this.f63714a.mo28329a()) {
            aVar.mo28731g(aVar.f63719d);
        }
    }

    /* renamed from: g */
    public final /* synthetic */ void mo28491g() {
    }
}
