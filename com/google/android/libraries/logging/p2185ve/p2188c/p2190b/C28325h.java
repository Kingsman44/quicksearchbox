package com.google.android.libraries.logging.p2185ve.p2188c.p2190b;

import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28480t;
import com.google.android.libraries.logging.p2185ve.C28481u;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28314a;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28316c;
import com.google.android.libraries.logging.p2185ve.p2199f.C28419f;
import com.google.android.libraries.p1623at.p1632e.C19559g;

/* renamed from: com.google.android.libraries.logging.ve.c.b.h */
/* compiled from: PG */
final class C28325h implements C28314a {

    /* renamed from: a */
    final /* synthetic */ C28326i f77009a;

    public C28325h(C28326i iVar) {
        this.f77009a = iVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo33812a(Object obj) {
        C28439i iVar = (C28439i) obj;
        C28480t tVar = iVar.f77217c;
        long b = this.f77009a.f77013d.mo26870b();
        tVar.copyOnWrite();
        C28481u uVar = (C28481u) tVar.instance;
        C28481u uVar2 = C28481u.f77286h;
        uVar.f77288a |= 4;
        uVar.f77292e = b * 1000;
        if (this.f77009a.f77012c.mo33849e(iVar)) {
            this.f77009a.mo33841b();
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo33813b(Object obj) {
        C28439i iVar = (C28439i) obj;
        C28480t tVar = iVar.f77217c;
        long b = this.f77009a.f77013d.mo26870b();
        tVar.copyOnWrite();
        C28481u uVar = (C28481u) tVar.instance;
        C28481u uVar2 = C28481u.f77286h;
        uVar.f77288a |= 4;
        uVar.f77292e = b * 1000;
        C28316c cVar = iVar.f77220f;
        if (cVar instanceof C28485y) {
            C28485y yVar = (C28485y) cVar;
            if (!iVar.f77217c.mo58882j(C28419f.f77188a)) {
                yVar.mo33942p(false);
            } else if (!cVar.mo33830n()) {
                yVar.mo33942p(true);
            }
        }
        if (this.f77009a.f77012c.mo33848d(iVar)) {
            this.f77009a.mo33841b();
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo33814c(Object obj) {
        C19559g.m37304c();
        C28326i iVar = this.f77009a;
        if (iVar.f77016g == null) {
            return;
        }
        if (iVar.f77015f > 0 || ((C28439i) obj).f77220f.mo33830n()) {
            C19559g.m37302a().removeCallbacks(this.f77009a.f77016g);
            C28326i iVar2 = this.f77009a;
            iVar2.f77011b.mo33807a(new C28324g(iVar2)).run();
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void mo33815d(Object obj) {
        ((C28439i) obj).mo33890g();
    }

    /* renamed from: e */
    public final /* synthetic */ void mo33816e() {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo33817f() {
        C19559g.m37304c();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo33818g(Object obj, int i) {
        C28439i iVar = (C28439i) obj;
        C28480t tVar = iVar.f77217c;
        long b = this.f77009a.f77013d.mo26870b();
        tVar.copyOnWrite();
        C28481u uVar = (C28481u) tVar.instance;
        C28481u uVar2 = C28481u.f77286h;
        uVar.f77288a |= 4;
        uVar.f77292e = b * 1000;
        if (this.f77009a.f77012c.mo33850f(iVar, i)) {
            this.f77009a.mo33841b();
        }
    }
}
