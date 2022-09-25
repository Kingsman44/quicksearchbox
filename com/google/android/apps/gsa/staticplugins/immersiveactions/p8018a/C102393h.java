package com.google.android.apps.gsa.staticplugins.immersiveactions.p8018a;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.shared.actions.core.VoiceDelightAction;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88509c;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88512f;
import com.google.p4152bb.p4153a.C55136he;
import com.google.p4152bb.p4153a.C55400qz;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.a.h */
/* compiled from: PG */
public final class C102393h extends C88507a {

    /* renamed from: d */
    private final C102392g f285776d;

    public C102393h(C88512f fVar, C102392g gVar) {
        super(fVar, "ImVdUiController");
        this.f285776d = gVar;
    }

    /* renamed from: A */
    public final boolean mo82036A() {
        return false;
    }

    /* renamed from: k */
    public final void mo82048k() {
        VoiceDelightAction voiceDelightAction = (VoiceDelightAction) this.f239226b;
        C88509c cVar = this.f239227c;
        cVar.getClass();
        C102387b bVar = (C102387b) cVar;
        TextUtils.isEmpty(this.f239225a.mo82089P().f236249c);
        C88512f fVar = this.f239225a;
        C55400qz qzVar = voiceDelightAction.f236064g;
        C102390e eVar = null;
        if (qzVar.f145974e.containsKey("feature_type")) {
            C62995dn dnVar = qzVar.f145974e;
            if (!dnVar.containsKey("feature_type")) {
                throw new IllegalArgumentException();
            } else if (((C55136he) dnVar.get("feature_type")).f145135d == 1) {
                eVar = new C102390e(fVar);
                eVar.f239226b = voiceDelightAction;
            }
        }
        if (eVar != null) {
            C102389d dVar = new C102389d(this.f285776d.f285775a);
            dVar.addOnAttachStateChangeListener(new C102388c(dVar));
            dVar.mo82067g(eVar);
            if (bVar.f285773c.indexOfChild(dVar) < 0) {
                bVar.f285773c.removeAllViews();
                bVar.f285773c.addView(dVar);
            }
        }
    }
}
