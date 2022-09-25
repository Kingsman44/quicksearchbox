package com.google.android.libraries.logging.p2185ve.synthetic;

import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28315b;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28316c;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28317d;
import com.google.common.base.C58838bb;
import com.google.common.p4552o.aqr;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.logging.ve.synthetic.j */
/* compiled from: PG */
final class C28466j implements C28316c {

    /* renamed from: a */
    private final C28439i f77261a;

    /* renamed from: b */
    private final C28317d f77262b;

    /* renamed from: c */
    private C28439i f77263c;

    /* renamed from: d */
    private List f77264d;

    /* renamed from: e */
    private boolean f77265e = false;

    /* renamed from: f */
    private int f77266f = 1;

    public C28466j(C28439i iVar) {
        this.f77261a = iVar;
        this.f77262b = iVar.f77219e;
    }

    /* renamed from: a */
    private final void m53210a(C28439i iVar) {
        C28316c cVar = iVar.f77220f;
        if (this.f77265e) {
            C58838bb.m90868c(cVar.mo33829m());
            cVar.mo33824g();
        }
        cVar.mo33821d();
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo33819b() {
        return this.f77263c;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo33820c(Object obj) {
        if (this.f77264d == null) {
            this.f77264d = new ArrayList();
        }
        C28316c cVar = ((C28439i) obj).f77220f;
        cVar.mo33826i(this.f77261a);
        C58838bb.m90868c(this.f77264d.add(obj));
        if (this.f77265e) {
            cVar.mo33823f();
        }
    }

    /* renamed from: d */
    public final void mo33821d() {
        C58838bb.m90884s(this.f77263c != null, "No parent override to unset");
        this.f77263c = null;
    }

    /* renamed from: e */
    public final void mo33822e() {
        List<C28439i> list = this.f77264d;
        if (list != null) {
            for (C28439i a : list) {
                m53210a(a);
            }
            this.f77264d.clear();
            this.f77264d = null;
        }
        C28439i iVar = this.f77263c;
        if (iVar != null) {
            iVar.f77220f.mo33825h(this.f77261a);
        }
    }

    /* renamed from: f */
    public final void mo33823f() {
        C58838bb.m90883r(!this.f77265e);
        this.f77265e = true;
        this.f77262b.mo33833a(this.f77261a);
        List<C28439i> list = this.f77264d;
        if (list != null) {
            for (C28439i iVar : list) {
                iVar.f77220f.mo33823f();
            }
        }
    }

    /* renamed from: g */
    public final void mo33824g() {
        C58838bb.m90883r(this.f77265e);
        this.f77265e = false;
        List<C28439i> list = this.f77264d;
        if (list != null) {
            for (C28439i iVar : list) {
                iVar.f77220f.mo33824g();
            }
        }
        this.f77262b.mo33834b(this.f77261a);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo33825h(Object obj) {
        C58838bb.m90868c(this.f77264d.remove(obj));
        m53210a((C28439i) obj);
    }

    /* renamed from: j */
    public final void mo33827j() {
        int b = aqr.m92462b(this.f77261a.mo33884a().f77291d);
        if (b == 0) {
            b = 1;
        }
        this.f77266f = b;
    }

    /* renamed from: l */
    public final void mo33828l(C28315b bVar) {
        List list = this.f77264d;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    bVar.mo33799b((C28439i) this.f77264d.get(size));
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: m */
    public final boolean mo33829m() {
        return this.f77265e;
    }

    /* renamed from: n */
    public final boolean mo33830n() {
        return this.f77263c == null;
    }

    /* renamed from: r */
    public final int mo33831r() {
        return this.f77266f;
    }

    /* renamed from: s */
    public final void mo33832s(int i) {
        int i2 = this.f77266f;
        this.f77266f = i;
        if (this.f77265e && i2 != i) {
            this.f77262b.mo33836d(this.f77261a, i2, i);
        }
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo33826i(Object obj) {
        obj.getClass();
        C58838bb.m90884s(this.f77263c == null, "Already has a parent override");
        this.f77263c = (C28439i) obj;
    }
}
