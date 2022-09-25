package com.google.android.apps.gsa.shared.monet.p7114f;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.apps.gsa.shared.monet.f.c */
/* compiled from: PG */
public class C90325c implements C90326d, C90323a {

    /* renamed from: a */
    public static final C59071e f252252a = C59071e.m91332i("com.google.android.apps.gsa.shared.monet.f.c");

    /* renamed from: b */
    public final Set f252253b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    public boolean f252254c;

    /* renamed from: d */
    public boolean f252255d;

    /* renamed from: e */
    public boolean f252256e;

    /* renamed from: f */
    public boolean f252257f;

    /* renamed from: g */
    private final Set f252258g = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: k */
    private final void m146861k(C90324b bVar) {
        if (this.f252254c) {
            bVar.mo84009d();
        }
        if (this.f252255d) {
            bVar.mo84008c();
        }
    }

    /* renamed from: a */
    public final void mo84004a(C90324b bVar) {
        C58838bb.m90883r(!this.f252257f);
        this.f252253b.add(bVar);
        m146861k(bVar);
    }

    /* renamed from: b */
    public final void mo84005b(C90324b bVar) {
        if (bVar instanceof C90327e) {
            C58838bb.m90869d(!this.f252258g.contains(bVar), "OverlayLifecycleObservers should be removed with removeOverlayLifecycleObserver");
        }
        this.f252253b.remove(bVar);
    }

    /* renamed from: c */
    public final void mo84011c(C90327e eVar) {
        C58838bb.m90883r(!this.f252257f);
        this.f252253b.add(eVar);
        this.f252258g.add(eVar);
        m146861k(eVar);
        if (this.f252256e) {
            eVar.mo84020g();
        }
    }

    /* renamed from: d */
    public void mo84012d() {
        this.f252256e = false;
        C58485gu j = C58485gu.m89842j(this.f252258g);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            ((C90327e) j.get(i)).mo84019f();
        }
    }

    /* renamed from: e */
    public void mo84013e() {
        this.f252255d = false;
        C58485gu j = C58485gu.m89842j(this.f252253b);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            ((C90324b) j.get(i)).mo84007b();
        }
    }

    /* renamed from: f */
    public void mo84014f() {
        this.f252255d = true;
        C58485gu j = C58485gu.m89842j(this.f252253b);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            ((C90324b) j.get(i)).mo84008c();
        }
    }

    /* renamed from: g */
    public void mo84015g() {
        this.f252256e = true;
        C58485gu j = C58485gu.m89842j(this.f252258g);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            ((C90327e) j.get(i)).mo84020g();
        }
    }

    /* renamed from: h */
    public void mo84016h() {
        this.f252254c = true;
        C58485gu j = C58485gu.m89842j(this.f252253b);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            ((C90324b) j.get(i)).mo84009d();
        }
    }

    /* renamed from: i */
    public void mo84017i() {
        this.f252254c = false;
        C58485gu j = C58485gu.m89842j(this.f252253b);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            ((C90324b) j.get(i)).mo84010e();
        }
    }

    /* renamed from: j */
    public final void mo84018j(C90327e eVar) {
        this.f252253b.remove(eVar);
        this.f252258g.remove(eVar);
    }
}
