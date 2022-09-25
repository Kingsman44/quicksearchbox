package com.google.android.apps.gsa.staticplugins.opa.worker;

import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.C109657ab;
import com.google.android.apps.gsa.staticplugins.opa.util.C113770am;
import com.google.android.apps.gsa.staticplugins.opa.util.C113775ar;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14096x;
import com.google.android.libraries.assistant.p1467d.p1471b.C17823i;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.assistant.p3897e.p3929l.p3930a.C52690aw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.m */
/* compiled from: PG */
public final /* synthetic */ class C114367m implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C114507v f317103a;

    /* renamed from: b */
    public final /* synthetic */ C17823i f317104b;

    public /* synthetic */ C114367m(C114507v vVar, C17823i iVar) {
        this.f317103a = vVar;
        this.f317104b = iVar;
    }

    public final void run() {
        C114507v vVar = this.f317103a;
        C17823i iVar = this.f317104b;
        C113775ar arVar = vVar.f317527m;
        if (arVar.f315101e.mo79746e(C90051dc.f248891bt) || arVar.f315101e.mo79746e(C90051dc.f248848bC)) {
            boolean z = (arVar.f315109m == C17823i.GUIDED_NAVIGATION_IN_FOREGROUND || arVar.f315109m == C17823i.RUNNING_IN_BACKGROUND) && iVar == C17823i.STOPPED;
            arVar.f315109m = iVar;
            if (!arVar.f315101e.mo79746e(C90051dc.f248848bC)) {
                C109657ab a = arVar.f315103g.mo97941a();
                if (!z) {
                    return;
                }
                if (a == C109657ab.ELIGIBLE || a == C109657ab.NOT_ELIGIBLE_OPT_IN_NEEDED || a == C109657ab.NOT_ELIGIBLE_DISABLED_BY_OPT_IN) {
                    C52690aw b = arVar.f315103g.mo97942b();
                    C14096x xVar = arVar.f315104h;
                    C58976aa aaVar = C58975e.f156826a;
                    C60856cj.m92911t(xVar.f42764b.mo46042d(), new C113770am(arVar, b), C60826bg.f164896a);
                    return;
                }
                return;
            }
            arVar.mo100620a(z, false);
        }
    }
}
