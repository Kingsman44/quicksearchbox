package com.google.android.apps.gsa.staticplugins.opa.p8183ag;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ag.f */
/* compiled from: PG */
public final /* synthetic */ class C106157f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C106158g f296265a;

    public /* synthetic */ C106157f(C106158g gVar) {
        this.f296265a = gVar;
    }

    public final void onClick(View view) {
        C106158g gVar = this.f296265a;
        C60321oe j = C28285c.m52883j(new C28292j(110369), 5, (Integer) null);
        if (j != null) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 472;
            C89949q.m146525j((C60555uf) tzVar.build(), j, (C63196b) null, (String) null);
        }
        gVar.mo95330c(false);
    }
}
