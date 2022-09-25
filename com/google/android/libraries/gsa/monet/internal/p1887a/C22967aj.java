package com.google.android.libraries.gsa.monet.internal.p1887a;

import com.google.android.libraries.gsa.monet.internal.shared.C23042g;
import com.google.android.libraries.gsa.monet.shared.C23074ae;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.shared.p1895e.C23109a;
import com.google.android.libraries.gsa.monet.tools.children.p1913b.C23215l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.gsa.monet.internal.a.aj */
/* compiled from: PG */
public final class C22967aj implements C23074ae {

    /* renamed from: a */
    public final Map f63172a = new HashMap();

    /* renamed from: b */
    public C23042g f63173b;

    /* renamed from: c */
    public boolean f63174c;

    /* renamed from: d */
    private final C22995s f63175d;

    public C22967aj(C22995s sVar) {
        this.f63175d = sVar;
    }

    /* renamed from: g */
    private final void m43003g() {
        C23067b.m43233f(mo28351d(), "Renderer not bound");
    }

    /* renamed from: h */
    private final void m43004h(String str, C23109a aVar) {
        List<C23215l> list = (List) this.f63172a.get(str);
        if (list != null) {
            for (C23215l a : list) {
                aVar.mo28347a(a);
            }
        }
    }

    /* renamed from: D */
    public final boolean mo28333D(String str) {
        throw null;
    }

    /* renamed from: a */
    public final C23042g mo28348a() {
        m43003g();
        C23042g gVar = this.f63173b;
        gVar.getClass();
        return gVar;
    }

    /* renamed from: b */
    public final void mo28349b() {
        C23067b.m43233f(!this.f63174c, "Handler is destroyed");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo28350c(String str) {
        mo28349b();
        m43003g();
        int e = mo28352e(str);
        if (e == 1) {
            m43004h(str, C22964ag.f63169a);
            return;
        }
        C23129y f = mo28337f(str);
        if (e == 2) {
            m43004h(str, new C22965ah(f));
        } else {
            m43004h(str, new C22966ai(f));
        }
    }

    /* renamed from: d */
    public final boolean mo28351d() {
        return this.f63173b != null;
    }

    /* renamed from: e */
    public final int mo28352e(String str) {
        mo28349b();
        if (!mo28348a().mo28477m(str)) {
            return 1;
        }
        return this.f63175d.mo28393h(mo28348a().mo28471g(str)) ? 3 : 2;
    }

    /* renamed from: f */
    public final C23129y mo28337f(String str) {
        mo28349b();
        return mo28348a().mo28468d(str);
    }

    /* renamed from: k */
    public final String mo28341k(String str) {
        throw null;
    }
}
