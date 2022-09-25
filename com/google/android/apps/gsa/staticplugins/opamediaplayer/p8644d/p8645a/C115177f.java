package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8645a;

import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8646b.C115199b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.a.f */
/* compiled from: PG */
public final /* synthetic */ class C115177f implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C115179h f319649a;

    /* renamed from: b */
    public final /* synthetic */ C84275o f319650b;

    public /* synthetic */ C115177f(C115179h hVar, C84275o oVar) {
        this.f319649a = hVar;
        this.f319650b = oVar;
    }

    public final void run() {
        C115179h hVar = this.f319649a;
        C84275o oVar = this.f319650b;
        if (!hVar.f63405W.mo28420E()) {
            ((C23251a) hVar.f319655c.mo101874e()).mo28730f(C58833ax.m90834k(C115199b.m190986a(oVar)), false);
            C58833ax n = oVar.mo77808n();
            if (n.mo56113h()) {
                ((C23251a) hVar.f319655c.mo101873d()).mo28730f((Float) n.mo56107c(), false);
            }
            if (oVar.mo77810p() && !((C58833ax) ((C23251a) hVar.f319655c.mo101872c()).f63720e).mo56113h()) {
                new C90873ag(((C89037bh) hVar.f319654b.mo27525b()).mo27378c(), hVar.f319656d, "get-connectivity-info", new C115175d(hVar, oVar.mo77803i())).mo85223a(C115176e.f319648a);
            }
        }
    }
}
