package com.google.android.apps.gsa.staticplugins.p8774u.p8777c;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90233i;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.C23243a;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.ChildStub;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.u.c.x */
/* compiled from: PG */
final class C117527x extends C23243a {

    /* renamed from: a */
    final /* synthetic */ C117497ab f326213a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117527x(C117497ab abVar, ChildStub childStub) {
        super(childStub);
        this.f326213a = abVar;
    }

    /* renamed from: a */
    public final void mo28675a(C22939d dVar) {
        super.mo28675a(dVar);
        if (!(dVar instanceof C90233i)) {
            ((C59052c) ((C59052c) C117497ab.f326136a.mo56225c()).mo56372aa(18280)).mo56389s("child feature renderer did not implement the expected interface: %s", dVar.mo28292ad());
            return;
        }
        C117497ab abVar = this.f326213a;
        abVar.f326150o = (C90233i) dVar;
        abVar.f326148m = dVar.mo28297il();
        C117497ab abVar2 = this.f326213a;
        View view = abVar2.f326148m;
        View b = abVar2.f326150o.mo83945b();
        if (((Boolean) ((C23249a) this.f326213a.f326138c.mo103335h()).mo28725a()).booleanValue() && this.f326213a.f326142g.mo85090c() && b != null) {
            b.setClickable(true);
            b.setOnClickListener(new C117525v(this));
        }
        C28292j jVar = new C28292j(this.f326213a.f326150o.mo83944a());
        if (((Boolean) ((C23249a) this.f326213a.f326138c.mo103335h()).mo28725a()).booleanValue()) {
            jVar.mo33795i(5);
        }
        C28295m.m52919e(view, jVar);
        jVar.mo33794h(2);
        C89949q.m146521e(C28285c.m52881h(4, C28295m.m52916b(view), this.f326213a.f326144i), false);
        View view2 = this.f326213a.f326148m;
        if (view2 != null) {
            view2.getViewTreeObserver().addOnGlobalLayoutListener(new C117526w(this));
        }
    }
}
