package com.google.android.apps.gsa.staticplugins.actionsui;

import com.google.android.apps.gsa.search.shared.actions.core.CommunicationAction;
import com.google.android.apps.gsa.search.shared.contact.C87518f;
import com.google.android.apps.gsa.search.shared.contact.Disambiguation;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88509c;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88512f;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.r */
/* compiled from: PG */
public class C93693r extends C93503i implements C87518f {
    public C93693r(C88512f fVar, C58833ax axVar) {
        super(fVar, axVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final boolean mo88148G(PersonDisambiguation personDisambiguation) {
        if (personDisambiguation == null || !personDisambiguation.mo81544m() || !personDisambiguation.f236395k.mo81601c()) {
            return false;
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 155;
        int i = mo82042e().f146230cP;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        ufVar2.f164093a |= 256;
        ufVar2.f164264s = i;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        C88509c cVar = this.f239227c;
        cVar.getClass();
        ((C93691p) cVar).mo88145d(personDisambiguation);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo87798H() {
        throw null;
    }

    /* renamed from: a */
    public final void mo81345a(Disambiguation disambiguation) {
        if (disambiguation.f236366e) {
            this.f239225a.mo82075B(this.f239226b);
        }
        if (disambiguation.mo81543l()) {
            PersonDisambiguation personDisambiguation = (PersonDisambiguation) disambiguation;
            mo87798H();
            return;
        }
        mo82055r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo82048k() {
        throw null;
    }

    /* renamed from: s */
    public final void mo82056s() {
        ((CommunicationAction) this.f239226b).mo81150P(this);
        PersonDisambiguation personDisambiguation = ((CommunicationAction) this.f239226b).f236042f;
        if (personDisambiguation != null) {
            mo81345a(personDisambiguation);
        } else {
            mo82055r();
        }
    }
}
