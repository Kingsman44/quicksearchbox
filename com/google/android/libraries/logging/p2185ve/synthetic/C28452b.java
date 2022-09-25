package com.google.android.libraries.logging.p2185ve.synthetic;

import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28316c;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28317d;
import com.google.android.libraries.logging.p2185ve.p2193e.p2197d.p2198a.C28409a;
import com.google.common.base.C58838bb;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.logging.ve.synthetic.b */
/* compiled from: PG */
public final class C28452b {

    /* renamed from: a */
    public final Map f77240a = new HashMap();

    /* renamed from: b */
    public final C28439i f77241b;

    public C28452b(C28439i iVar) {
        this.f77241b = iVar;
    }

    /* renamed from: f */
    private final void m53158f(Object obj) {
        C28439i b = mo33908b(obj);
        C28316c cVar = this.f77241b.f77220f;
        if (cVar != null) {
            cVar.mo33825h(b);
            return;
        }
        C28317d dVar = b.f77219e;
        RuntimeException runtimeException = new RuntimeException("Interacted with destroyed CVE");
        C28409a aVar = dVar.f77003b;
        C28409a.m53084a(runtimeException);
    }

    /* renamed from: a */
    public final C28439i mo33907a(Object obj, C28313c cVar) {
        C58838bb.m90883r(this.f77240a.get(obj) == null);
        C28439i e = cVar.mo33857e(this.f77241b.f77219e);
        C28466j jVar = new C28466j(e);
        e.f77220f = jVar;
        jVar.mo33827j();
        this.f77240a.put(obj, e);
        this.f77241b.f77220f.mo33820c(e);
        return e;
    }

    /* renamed from: b */
    public final C28439i mo33908b(Object obj) {
        C28439i iVar = (C28439i) this.f77240a.get(obj);
        iVar.getClass();
        return iVar;
    }

    @Deprecated
    /* renamed from: c */
    public final C28450a mo33909c(int i) {
        return new C28450a(this, C28427h.m53115a(i));
    }

    /* renamed from: d */
    public final void mo33910d() {
        for (Object f : this.f77240a.keySet()) {
            m53158f(f);
        }
        this.f77240a.clear();
    }

    /* renamed from: e */
    public final void mo33911e(Object obj) {
        m53158f(obj);
        this.f77240a.remove(obj);
    }
}
