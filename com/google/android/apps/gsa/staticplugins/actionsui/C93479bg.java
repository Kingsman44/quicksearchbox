package com.google.android.apps.gsa.staticplugins.actionsui;

import com.google.android.apps.gsa.search.shared.actions.PuntAction;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88509c;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88512f;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.bg */
/* compiled from: PG */
public class C93479bg extends C93503i {
    public C93479bg(C88512f fVar, C58833ax axVar) {
        super(fVar, axVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo82048k() {
        C88509c cVar = this.f239227c;
        cVar.getClass();
        C93478bf bfVar = (C93478bf) cVar;
        PuntAction puntAction = (PuntAction) this.f239226b;
        CharSequence charSequence = puntAction.f236015j;
        if (charSequence != null) {
            bfVar.mo87776z(charSequence);
        } else {
            int i = puntAction.f236016k;
            if (i != 0) {
                bfVar.mo87775y(i);
            }
        }
        if (puntAction.f236018m == null) {
            bfVar.mo87774x();
        } else {
            bfVar.mo87772A(puntAction.f236017l, puntAction.f236019n);
        }
    }
}
