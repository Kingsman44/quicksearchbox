package com.google.android.apps.gsa.staticplugins.p7539bl;

import android.view.View;
import com.google.android.apps.gsa.assistant.settings.shared.pronlearning.C73772f;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.bl.b */
/* compiled from: PG */
public final /* synthetic */ class C96653b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C96654c f270407a;

    public /* synthetic */ C96653b(C96654c cVar) {
        this.f270407a = cVar;
    }

    public final void onClick(View view) {
        C73772f fVar = this.f270407a.f270411d;
        if (fVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 980;
            String b = C39191a.m68623b(C90719ac.f253778a.f253779b.nextLong());
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            b.getClass();
            ufVar2.f164093a |= 4;
            ufVar2.f164259n = b;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            fVar.f195057a.mo65254a();
        }
    }
}
