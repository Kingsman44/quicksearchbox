package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import com.google.android.apps.gsa.shared.monet.p7114f.C90324b;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.C91870l;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.z */
/* compiled from: PG */
final class C105660z extends C90324b {

    /* renamed from: a */
    final /* synthetic */ C105474ab f294773a;

    public C105660z(C105474ab abVar) {
        this.f294773a = abVar;
    }

    /* renamed from: f */
    private final void m175801f() {
        C105474ab abVar = this.f294773a;
        abVar.mo94833O(((Boolean) ((C23249a) abVar.f294216x.mo94542g()).mo28725a()).booleanValue());
    }

    /* renamed from: g */
    private final void m175802g() {
        C105474ab abVar = this.f294773a;
        abVar.mo94828J(true, abVar.mo94825G());
        this.f294773a.mo94833O(false);
    }

    /* renamed from: b */
    public final void mo84007b() {
        if (((Boolean) ((C23249a) this.f294773a.f294216x.mo94554s()).mo28725a()).booleanValue()) {
            m175802g();
        }
    }

    /* renamed from: c */
    public final void mo84008c() {
        if (((Boolean) ((C23249a) this.f294773a.f294216x.mo94554s()).mo28725a()).booleanValue()) {
            m175801f();
        }
    }

    /* renamed from: d */
    public final void mo84009d() {
        C105474ab abVar = this.f294773a;
        abVar.f294210r = true;
        abVar.mo94830L();
        if (!((Boolean) ((C23249a) this.f294773a.f294216x.mo94554s()).mo28725a()).booleanValue()) {
            m175801f();
        }
    }

    /* renamed from: e */
    public final void mo84010e() {
        C105474ab abVar = this.f294773a;
        abVar.f294210r = false;
        if (!((Boolean) ((C23249a) abVar.f294216x.mo94554s()).mo28725a()).booleanValue()) {
            m175802g();
        }
        C105474ab abVar2 = this.f294773a;
        C91870l lVar = abVar2.f294213u;
        if (lVar != null) {
            abVar2.f294200h.mo86398b(lVar);
            this.f294773a.f294213u = null;
        }
        this.f294773a.mo94827I();
    }
}
