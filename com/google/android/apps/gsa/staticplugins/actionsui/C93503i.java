package com.google.android.apps.gsa.staticplugins.actionsui;

import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88509c;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88512f;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.i */
/* compiled from: PG */
public abstract class C93503i extends C88507a {
    public C93503i(C88512f fVar, int i, C58833ax axVar) {
        super(fVar, "ClassicAbstractCardCont", i, axVar);
    }

    /* renamed from: D */
    public final void mo82044g(C93690o oVar) {
        super.mo82044g(oVar);
        mo87823E(this.f239226b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final void mo87823E(VoiceAction voiceAction) {
        if (voiceAction.mo81084w()) {
            if (mo82060w()) {
                C88509c cVar = this.f239227c;
                cVar.getClass();
                ((C93690o) cVar).mo87829j();
                C88509c cVar2 = this.f239227c;
                cVar2.getClass();
                ((C93690o) cVar2).mo87794q();
            }
        } else if (voiceAction.mo81083v()) {
            if (mo82060w()) {
                C88509c cVar3 = this.f239227c;
                cVar3.getClass();
                C93690o oVar = (C93690o) cVar3;
            }
        } else if (!voiceAction.mo81087y() && voiceAction.mo81053C() && mo82060w()) {
            C88509c cVar4 = this.f239227c;
            cVar4.getClass();
            ((C93690o) cVar4).mo87829j();
            C88509c cVar5 = this.f239227c;
            cVar5.getClass();
            ((C93690o) cVar5).mo87836r();
        }
    }

    /* renamed from: F */
    public final void mo87824F() {
        if (mo82060w() && this.f239226b.mo81133M() && this.f239225a.mo82089P().f236255i && !this.f239225a.mo82080G()) {
            long a = this.f239225a.mo82093a(this.f239226b);
            if (a > 0) {
                C88509c cVar = this.f239227c;
                cVar.getClass();
                ((C93690o) cVar).mo87837s(a);
            }
        }
    }

    /* renamed from: l */
    public final void mo82049l(VoiceAction voiceAction) {
        if (voiceAction.mo81051A()) {
            mo82057t();
        } else {
            mo87823E(voiceAction);
        }
    }

    /* renamed from: u */
    public final boolean mo82058u() {
        boolean u = super.mo82058u();
        if (!u || !mo82060w()) {
            return u;
        }
        C88509c cVar = this.f239227c;
        cVar.getClass();
        ((C93690o) cVar).mo87829j();
        return true;
    }

    public C93503i(C88512f fVar, C58833ax axVar) {
        super(fVar, "ClassicAbstractCardCont", 1, axVar);
    }
}
