package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

import android.accounts.Account;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109769a;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109770b;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109771c;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109772d;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8402a.C109780l;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.p8403ui.C109826a;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C50345tq;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.o */
/* compiled from: PG */
final class C109819o extends C83869ac {

    /* renamed from: a */
    final /* synthetic */ C109821q f306036a;

    public C109819o(C109821q qVar) {
        this.f306036a = qVar;
    }

    /* renamed from: a */
    public final C83956t mo77207a() {
        C109771c cVar;
        C109769a aVar = (C109769a) C109770b.f305851g.createBuilder();
        C58833ax axVar = ((C109806b) this.f306036a.f306038a).f305975c;
        if (axVar.mo56113h()) {
            cVar = (C109771c) C109772d.f305859c.createBuilder();
            C109780l lVar = (C109780l) axVar.mo56107c();
            cVar.copyOnWrite();
            C109772d dVar = (C109772d) cVar.instance;
            lVar.getClass();
            dVar.f305862b = lVar;
            dVar.f305861a = 1;
        } else {
            cVar = (C109771c) C109772d.f305859c.createBuilder();
            String string = this.f306036a.f306042e.getString(R.string.omniconsent_disclosures_title);
            cVar.copyOnWrite();
            C109772d dVar2 = (C109772d) cVar.instance;
            string.getClass();
            dVar2.f305861a = 2;
            dVar2.f305862b = string;
        }
        aVar.copyOnWrite();
        C109770b bVar = (C109770b) aVar.instance;
        C109772d dVar3 = (C109772d) cVar.build();
        dVar3.getClass();
        bVar.f305854b = dVar3;
        bVar.f305853a |= 1;
        C50345tq tqVar = ((C109806b) this.f306036a.f306038a).f305974b.f131085d;
        if (tqVar == null) {
            tqVar = C50345tq.f131022d;
        }
        aVar.copyOnWrite();
        C109770b bVar2 = (C109770b) aVar.instance;
        tqVar.getClass();
        bVar2.f305855c = tqVar;
        bVar2.f305853a |= 2;
        String str = ((C109806b) this.f306036a.f306038a).f305974b.f131086e;
        aVar.copyOnWrite();
        C109770b bVar3 = (C109770b) aVar.instance;
        str.getClass();
        bVar3.f305853a |= 4;
        bVar3.f305856d = str;
        String string2 = this.f306036a.f306042e.getString(R.string.omniconsent_confirm_partial_experience_action_button_text);
        aVar.copyOnWrite();
        C109770b bVar4 = (C109770b) aVar.instance;
        string2.getClass();
        bVar4.f305853a |= 8;
        bVar4.f305857e = string2;
        int i = ((C109806b) this.f306036a.f306038a).f305976d;
        aVar.copyOnWrite();
        C109770b bVar5 = (C109770b) aVar.instance;
        bVar5.f305858f = i - 1;
        bVar5.f305853a |= 16;
        return C83875ai.m133540e((C83907bm) this.f306036a.f306041d.mo17428b(), C109826a.m182917a("disclosure_args", ((C109770b) aVar.build()).toByteArray()));
    }

    /* renamed from: b */
    public final boolean mo77208b() {
        boolean z;
        if (this.f306036a.f306044g.mo85390b()) {
            return false;
        }
        C109821q qVar = this.f306036a;
        if ((((C109806b) qVar.f306038a).f305974b.f131082a & 4) == 0) {
            return false;
        }
        if (qVar.f306040c.mo77271a((Account) qVar.f306039b.mo77278a().mo56107c(), this.f306036a.mo98172b()) && ((C109806b) this.f306036a.f306038a).f305977e != 32) {
            return false;
        }
        C109821q qVar2 = this.f306036a;
        int b = qVar2.mo98172b();
        if (b == 5) {
            z = qVar2.f306040c.mo77271a((Account) qVar2.f306039b.mo77278a().mo56107c(), 3);
        } else if (!qVar2.f306043f.mo79746e(C90086ek.f250448dN) || b != 6) {
            return true;
        } else {
            z = qVar2.f306040c.mo77272b((Account) qVar2.f306039b.mo77278a().mo56107c(), 3);
        }
        return !z;
    }
}
