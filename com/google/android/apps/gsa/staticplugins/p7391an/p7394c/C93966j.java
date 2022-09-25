package com.google.android.apps.gsa.staticplugins.p7391an.p7394c;

import com.google.android.apps.gsa.search.core.p6519al.p6534ag.C84675a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6899i.C87347a;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6908o.p6910b.C87366a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7091j.C90247b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7095m.C90254a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7095m.p7096a.C90256b;
import com.google.android.apps.gsa.shared.monet.p7070b.p7095m.p7096a.C90258d;
import com.google.android.apps.gsa.shared.monet.p7070b.p7095m.p7096a.C90259e;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.p7391an.p7395d.C93973d;
import com.google.android.apps.gsa.staticplugins.p7391an.p7395d.p7396a.C93970b;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7857b.C100025x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.children.p1912a.C23186f;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.c.j */
/* compiled from: PG */
public final class C93966j extends C23056g implements C90247b, C93973d {

    /* renamed from: a */
    public static final C59071e f262433a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.an.c.j");

    /* renamed from: b */
    public final C93970b f262434b;

    /* renamed from: c */
    private final C22871g f262435c;

    /* renamed from: d */
    private final C84675a f262436d;

    /* renamed from: e */
    private boolean f262437e;

    /* renamed from: f */
    private boolean f262438f;

    /* renamed from: g */
    private C100025x f262439g;

    public C93966j(C23052c cVar, C93970b bVar, C22871g gVar, C84675a aVar) {
        super(cVar);
        this.f262434b = bVar;
        this.f262435c = gVar;
        this.f262436d = aVar;
        cVar.mo28429s(C87347a.class);
        cVar.mo28429s(C87366a.class);
    }

    /* renamed from: h */
    private final void m155045h() {
        if (this.f262437e && !this.f262438f && ((Boolean) ((C23251a) this.f262434b.mo88249p()).f63720e).booleanValue()) {
            new C90873ag(this.f262436d.mo78413e(), this.f262435c, "handleDoodleData", new C93964h(this)).mo85223a(C93965i.f262432a);
            this.f262438f = true;
        }
    }

    /* renamed from: a */
    public final void mo83961a() {
        if (!this.f262437e) {
            this.f262437e = true;
            m155045h();
        }
    }

    /* renamed from: b */
    public final void mo83962b(boolean z, boolean z2) {
        ((C23251a) this.f262434b.mo88248o()).mo28730f(Boolean.valueOf(z2), false);
        ((C23251a) this.f262434b.mo88249p()).mo28730f(Boolean.valueOf(z), false);
        if (!z2) {
            ((C23251a) this.f262434b.mo88248o()).mo28730f(true, false);
        }
        if (z) {
            m155045h();
        }
    }

    /* renamed from: c */
    public final void mo83963c(C100025x xVar) {
        this.f262439g = xVar;
    }

    /* renamed from: e */
    public final void mo88254e() {
        C100025x xVar = this.f262439g;
        if (xVar != null) {
            xVar.f279756a.mo91698h();
        }
    }

    /* renamed from: f */
    public final void mo88255f() {
        C100025x xVar = this.f262439g;
        if (xVar != null) {
            xVar.f279756a.mo91698h();
        }
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C23129y yVar = C90254a.f252113c;
        C90256b bVar = (C90256b) C90259e.f252122d.createBuilder();
        C90258d dVar = C90258d.SRP;
        bVar.copyOnWrite();
        C90259e eVar = (C90259e) bVar.instance;
        eVar.f252126c = dVar.f252121e;
        eVar.f252124a |= 2;
        ((C23186f) this.f262434b.mo88235b()).mo28623d(yVar, C23245b.m43556a((C90259e) bVar.build()));
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        ((C23251a) this.f262434b.mo88248o()).mo28730f(true, false);
    }
}
