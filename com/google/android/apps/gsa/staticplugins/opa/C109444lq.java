package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7184t.C91090a;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.android.apps.gsa.shared.util.permissions.C91075b;
import com.google.android.apps.gsa.shared.util.permissions.C91078e;
import com.google.android.apps.gsa.shared.util.permissions.C91079f;
import com.google.android.gms.identity.accounts.api.C144354b;
import com.google.android.libraries.gcoreclient.p1784p.p1785a.p1786a.p1787a.C21601a;
import com.google.android.libraries.p1646ay.C19601c;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.lq */
/* compiled from: PG */
public final class C109444lq extends C91090a implements C91079f {

    /* renamed from: e */
    final C91075b f304773e = new C91075b(this.f254379a, this);

    /* renamed from: f */
    final /* synthetic */ OpaActivity f304774f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109444lq(OpaActivity opaActivity) {
        super(opaActivity, C39239a.m68666a(opaActivity, C39226b.TAG_CLASSIC_ASSISTANT), 1000);
        this.f304774f = opaActivity;
    }

    /* renamed from: a */
    public final boolean mo65089a(Intent intent) {
        ((C89859i) this.f304774f.f295668v.mo27525b()).mo83702b(C89849ae.OPA_ANDROID_START_INTENT_ACTIVITY);
        if (!this.f304774f.f295663q.mo79746e(C90014bt.f247430gx) || this.f304774f.f295663q.mo79746e(C90014bt.f247428gv) || !intent.getBooleanExtra("DISPATCHED_TO_CHROMEPLATE_CHECK", false)) {
            intent.addFlags(268435456);
            if ((intent.getFlags() & 536870912) == 0 && C19601c.m37398e(intent)) {
                intent.addFlags(134217728);
            }
        } else {
            intent.removeFlags(403177472);
            C58976aa aaVar = C58975e.f156826a;
        }
        OpaActivity opaActivity = this.f304774f;
        if ("com.google.android.gm.intent.VIEW_PLID".equals(intent.getAction())) {
            String F = ((C86054o) opaActivity.f295664r.mo27525b()).mo79659F();
            if (!TextUtils.isEmpty(F)) {
                C144354b.m234631a(opaActivity, intent, C21601a.m40714a(F).f59976a);
            }
        }
        this.f304774f.mo95166y(intent);
        return super.mo65089a(intent);
    }

    /* renamed from: b */
    public final boolean mo65090b(Intent intent, C91096f fVar) {
        ((C89859i) this.f304774f.f295668v.mo27525b()).mo83702b(C89849ae.OPA_ANDROID_START_INTENT_ACTIVITY);
        this.f304774f.mo95166y(intent);
        return super.mo65090b(intent, fVar);
    }

    /* renamed from: ju */
    public final void mo81047ju(String[] strArr, int i, C91078e eVar) {
        this.f304773e.mo81047ju(strArr, i, eVar);
    }
}
