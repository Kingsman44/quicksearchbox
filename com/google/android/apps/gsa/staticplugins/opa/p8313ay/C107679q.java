package com.google.android.apps.gsa.staticplugins.opa.p8313ay;

import android.view.View;
import com.google.android.apps.gsa.assistant.shared.p.h;
import com.google.android.apps.gsa.search.shared.p6941ui.C88523c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.opa.p8595v.C113916t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113191cv;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113388b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8581e.C113389c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ay.q */
/* compiled from: PG */
public final /* synthetic */ class C107679q implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C107656ap f299677a;

    public /* synthetic */ C107679q(C107656ap apVar) {
        this.f299677a = apVar;
    }

    public final void onClick(View view) {
        C107656ap apVar = this.f299677a;
        C58976aa aaVar = C58975e.f156826a;
        C113916t tVar = apVar.f299589l;
        C89849ae aeVar = C89849ae.OPA_ENDSTATE_CANCEL_KEYBORAD;
        C58836b bVar = C58836b.f156633a;
        tVar.mo100764h(aeVar, bVar, bVar, bVar);
        apVar.f299588k.mo76917e(false);
        C88523c cVar = apVar.f299545ab;
        if (cVar != null) {
            cVar.mo82145a();
        }
        if (((C58833ax) apVar.f299592o.mo27525b()).mo56113h() && ((C113191cv) apVar.f299511T.mo27525b()).mo99907c()) {
            ((C113388b) ((C58833ax) apVar.f299592o.mo27525b()).mo56107c()).mo99681p(2);
        }
        ((C107662av) apVar.f299593p.mo27525b()).mo96210f(2);
        if (apVar.mo96183l() != null && ((C58833ax) apVar.f299594q.mo27525b()).mo56113h()) {
            ((C113389c) ((C58833ax) apVar.f299594q.mo27525b()).mo56107c()).mo99634i();
        }
        h k = apVar.mo96182k();
        if (k != null) {
            k.c(true);
        } else if (apVar.mo96184m().getText().length() == 0) {
            ((C107662av) apVar.f299593p.mo27525b()).mo96205a(C89849ae.AGSA_TEXT_ZERO_PREFIX_SUGGESTIONS_START);
        } else {
            ((C107662av) apVar.f299593p.mo27525b()).mo96205a(C89849ae.AGSA_TEXT_N_PREFIX_SUGGESTIONS_START);
        }
        C107658ar arVar = apVar.f299595r;
        if (arVar != null) {
            arVar.mo96203e();
        }
    }
}
