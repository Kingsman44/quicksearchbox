package com.google.android.apps.gsa.staticplugins.p8774u.p8777c;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.u.c.r */
/* compiled from: PG */
public final /* synthetic */ class C117521r implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C117497ab f326207a;

    public /* synthetic */ C117521r(C117497ab abVar) {
        this.f326207a = abVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C117497ab abVar = this.f326207a;
        Boolean bool = (Boolean) obj;
        abVar.mo103346h(bool.booleanValue() && ((Boolean) ((C23249a) abVar.f326138c.mo103336i()).mo28725a()).booleanValue());
        if (bool.booleanValue()) {
            abVar.f326143h = new C117496aa(abVar.f326137b);
            View view = abVar.f326148m;
            if (view != null && abVar.f326150o != null) {
                C60321oe h = C28285c.m52881h(2, C28295m.m52916b(view), abVar.f326144i);
                if (h != null) {
                    C89949q.m146525j((C60555uf) null, h, (C63196b) null, (String) null);
                } else {
                    ((C59052c) ((C59052c) C117497ab.f326136a.mo56225c()).mo56372aa(18286)).mo56386p("ve show proto is null");
                }
            }
        } else {
            abVar.f326143h = null;
            View view2 = abVar.f326148m;
            if (!(view2 == null || abVar.f326150o == null)) {
                C89949q.m146521e(C28285c.m52881h(3, C28295m.m52916b(view2), abVar.f326144i), false);
            }
            abVar.f326148m = null;
        }
    }
}
