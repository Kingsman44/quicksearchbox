package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d;

import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8646b.C115199b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.t */
/* compiled from: PG */
public final /* synthetic */ class C115407t implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C115408u f320208a;

    /* renamed from: b */
    public final /* synthetic */ C84275o f320209b;

    public /* synthetic */ C115407t(C115408u uVar, C84275o oVar) {
        this.f320208a = uVar;
        this.f320209b = oVar;
    }

    public final void run() {
        C115408u uVar = this.f320208a;
        C84275o oVar = this.f320209b;
        if (!uVar.f63405W.mo28420E()) {
            ((C23251a) uVar.f320212c.mo102037f()).mo28730f(C115199b.m190986a(oVar), false);
            C58833ax n = oVar.mo77808n();
            if (n.mo56113h()) {
                ((C23251a) uVar.f320212c.mo102036e()).mo28730f((Float) n.mo56107c(), false);
            }
            if (oVar.mo77810p() && !((C58833ax) ((C23251a) uVar.f320212c.mo102034c()).f63720e).mo56113h()) {
                C58976aa aaVar = C58975e.f156826a;
                new C90873ag(((C89037bh) uVar.f320211b.mo27525b()).mo27378c(), uVar.f320214e, "get-connectivity-info", new C115405r(uVar, oVar.mo77803i())).mo85223a(C115406s.f320207a);
            }
        }
    }
}
